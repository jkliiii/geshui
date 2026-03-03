package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import org.junit.internal.runners.model.ReflectiveCallable;

/* loaded from: E:\78999\cookie_192572.dex */
public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {
    final Method fMethod;

    public FrameworkMethod(Method method) {
        this.fMethod = method;
    }

    public Method getMethod() {
        return this.fMethod;
    }

    public Object invokeExplosively(final Object target, final Object... params) throws Throwable {
        return new ReflectiveCallable() { // from class: org.junit.runners.model.FrameworkMethod.1
            @Override // org.junit.internal.runners.model.ReflectiveCallable
            protected Object runReflectiveCall() throws Throwable {
                return FrameworkMethod.this.fMethod.invoke(target, params);
            }
        }.run();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return this.fMethod.getName();
    }

    public void validatePublicVoidNoArg(boolean isStatic, List<Throwable> errors) {
        validatePublicVoid(isStatic, errors);
        if (this.fMethod.getParameterTypes().length != 0) {
            errors.add(new Exception("Method " + this.fMethod.getName() + " should have no parameters"));
        }
    }

    public void validatePublicVoid(boolean isStatic, List<Throwable> errors) {
        if (Modifier.isStatic(this.fMethod.getModifiers()) != isStatic) {
            String state = isStatic ? "should" : "should not";
            errors.add(new Exception("Method " + this.fMethod.getName() + "() " + state + " be static"));
        }
        if (!Modifier.isPublic(this.fMethod.getDeclaringClass().getModifiers())) {
            errors.add(new Exception("Class " + this.fMethod.getDeclaringClass().getName() + " should be public"));
        }
        if (!Modifier.isPublic(this.fMethod.getModifiers())) {
            errors.add(new Exception("Method " + this.fMethod.getName() + "() should be public"));
        }
        if (this.fMethod.getReturnType() != Void.TYPE) {
            errors.add(new Exception("Method " + this.fMethod.getName() + "() should be void"));
        }
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isStatic() {
        return Modifier.isStatic(this.fMethod.getModifiers());
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isPublic() {
        return Modifier.isPublic(this.fMethod.getModifiers());
    }

    public Class<?> getReturnType() {
        return this.fMethod.getReturnType();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return getReturnType();
    }

    public void validateNoTypeParametersOnArgs(List<Throwable> errors) {
        new NoGenericTypeParametersValidator(this.fMethod).validate(errors);
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkMethod other) {
        if (!other.getName().equals(getName()) || other.getParameterTypes().length != getParameterTypes().length) {
            return false;
        }
        for (int i5 = 0; i5 < other.getParameterTypes().length; i5++) {
            if (!other.getParameterTypes()[i5].equals(getParameterTypes()[i5])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (FrameworkMethod.class.isInstance(obj)) {
            return ((FrameworkMethod) obj).fMethod.equals(this.fMethod);
        }
        return false;
    }

    public int hashCode() {
        return this.fMethod.hashCode();
    }

    @Deprecated
    public boolean producesType(Type type) {
        return getParameterTypes().length == 0 && (type instanceof Class) && ((Class) type).isAssignableFrom(this.fMethod.getReturnType());
    }

    private Class<?>[] getParameterTypes() {
        return this.fMethod.getParameterTypes();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Annotation[] getAnnotations() {
        return this.fMethod.getAnnotations();
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.fMethod.getAnnotation(cls);
    }
}
