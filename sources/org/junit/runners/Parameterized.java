package org.junit.runners;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public class Parameterized extends Suite {
    private static final List<Runner> NO_RUNNERS = Collections.emptyList();
    private final ArrayList<Runner> runners;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameters {
        String name() default "{index}";
    }

    private class TestClassRunnerForParameters extends BlockJUnit4ClassRunner {
        private final String fName;
        private final Object[] fParameters;

        TestClassRunnerForParameters(Class<?> type, Object[] parameters, String name) throws InitializationError {
            super(type);
            this.fParameters = parameters;
            this.fName = name;
        }

        @Override // org.junit.runners.BlockJUnit4ClassRunner
        public Object createTest() throws Exception {
            return Parameterized.this.fieldsAreAnnotated() ? createTestUsingFieldInjection() : createTestUsingConstructorInjection();
        }

        private Object createTestUsingConstructorInjection() throws Exception {
            return getTestClass().getOnlyConstructor().newInstance(this.fParameters);
        }

        private Object createTestUsingFieldInjection() throws Exception {
            List<FrameworkField> annotatedFieldsByParameter = Parameterized.this.getAnnotatedFieldsByParameter();
            if (annotatedFieldsByParameter.size() != this.fParameters.length) {
                throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + annotatedFieldsByParameter.size() + ", available parameters: " + this.fParameters.length + ".");
            }
            Object testClassInstance = getTestClass().getJavaClass().newInstance();
            for (FrameworkField each : annotatedFieldsByParameter) {
                Field field = each.getField();
                Parameter annotation = (Parameter) field.getAnnotation(Parameter.class);
                int index = annotation.value();
                try {
                    field.set(testClassInstance, this.fParameters[index]);
                } catch (IllegalArgumentException iare) {
                    throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() + " with the value " + this.fParameters[index] + " that is not the right type (" + this.fParameters[index].getClass().getSimpleName() + " instead of " + field.getType().getSimpleName() + ").", iare);
                }
            }
            return testClassInstance;
        }

        @Override // org.junit.runners.ParentRunner
        protected String getName() {
            return this.fName;
        }

        @Override // org.junit.runners.BlockJUnit4ClassRunner
        protected String testName(FrameworkMethod method) {
            return method.getName() + getName();
        }

        @Override // org.junit.runners.BlockJUnit4ClassRunner
        protected void validateConstructor(List<Throwable> errors) {
            validateOnlyOneConstructor(errors);
            if (Parameterized.this.fieldsAreAnnotated()) {
                validateZeroArgConstructor(errors);
            }
        }

        @Override // org.junit.runners.BlockJUnit4ClassRunner
        protected void validateFields(List<Throwable> errors) {
            super.validateFields(errors);
            if (Parameterized.this.fieldsAreAnnotated()) {
                List<FrameworkField> annotatedFieldsByParameter = Parameterized.this.getAnnotatedFieldsByParameter();
                int[] usedIndices = new int[annotatedFieldsByParameter.size()];
                for (FrameworkField each : annotatedFieldsByParameter) {
                    int index = ((Parameter) each.getField().getAnnotation(Parameter.class)).value();
                    if (index < 0 || index > annotatedFieldsByParameter.size() - 1) {
                        errors.add(new Exception("Invalid @Parameter value: " + index + ". @Parameter fields counted: " + annotatedFieldsByParameter.size() + ". Please use an index between 0 and " + (annotatedFieldsByParameter.size() - 1) + "."));
                    } else {
                        usedIndices[index] = usedIndices[index] + 1;
                    }
                }
                for (int index2 = 0; index2 < usedIndices.length; index2++) {
                    int numberOfUse = usedIndices[index2];
                    if (numberOfUse == 0) {
                        errors.add(new Exception("@Parameter(" + index2 + ") is never used."));
                    } else if (numberOfUse > 1) {
                        errors.add(new Exception("@Parameter(" + index2 + ") is used more than once (" + numberOfUse + ")."));
                    }
                }
            }
        }

        @Override // org.junit.runners.ParentRunner
        protected Statement classBlock(RunNotifier notifier) {
            return childrenInvoker(notifier);
        }

        @Override // org.junit.runners.ParentRunner
        protected Annotation[] getRunnerAnnotations() {
            return new Annotation[0];
        }
    }

    public Parameterized(Class<?> klass) throws Throwable {
        super(klass, NO_RUNNERS);
        this.runners = new ArrayList<>();
        Parameters parameters = (Parameters) getParametersMethod().getAnnotation(Parameters.class);
        createRunnersForParameters(allParameters(), parameters.name());
    }

    @Override // org.junit.runners.Suite, org.junit.runners.ParentRunner
    protected List<Runner> getChildren() {
        return this.runners;
    }

    private Iterable<Object[]> allParameters() throws Throwable {
        Object parameters = getParametersMethod().invokeExplosively(null, new Object[0]);
        if (parameters instanceof Iterable) {
            return (Iterable) parameters;
        }
        throw parametersMethodReturnedWrongType();
    }

    private FrameworkMethod getParametersMethod() throws Exception {
        List<FrameworkMethod> methods = getTestClass().getAnnotatedMethods(Parameters.class);
        for (FrameworkMethod each : methods) {
            if (each.isStatic() && each.isPublic()) {
                return each;
            }
        }
        throw new Exception("No public static parameters method on class " + getTestClass().getName());
    }

    private void createRunnersForParameters(Iterable<Object[]> allParameters, String namePattern) throws InitializationError, Exception {
        int i5 = 0;
        try {
            for (Object[] parametersOfSingleTest : allParameters) {
                String name = nameFor(namePattern, i5, parametersOfSingleTest);
                TestClassRunnerForParameters runner = new TestClassRunnerForParameters(getTestClass().getJavaClass(), parametersOfSingleTest, name);
                this.runners.add(runner);
                i5++;
            }
        } catch (ClassCastException e5) {
            throw parametersMethodReturnedWrongType();
        }
    }

    private String nameFor(String namePattern, int index, Object[] parameters) {
        String finalPattern = namePattern.replaceAll("\\{index\\}", Integer.toString(index));
        String name = MessageFormat.format(finalPattern, parameters);
        return "[" + name + "]";
    }

    private Exception parametersMethodReturnedWrongType() throws Exception {
        String className = getTestClass().getName();
        String methodName = getParametersMethod().getName();
        String message = MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", className, methodName);
        return new Exception(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<FrameworkField> getAnnotatedFieldsByParameter() {
        return getTestClass().getAnnotatedFields(Parameter.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fieldsAreAnnotated() {
        return !getAnnotatedFieldsByParameter().isEmpty();
    }
}
