package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: E:\78999\cookie_192572.dex */
public class Categories extends Suite {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ExcludeCategory {
        Class<?> value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface IncludeCategory {
        Class<?> value();
    }

    public static class CategoryFilter extends Filter {
        private final Class<?> fExcluded;
        private final Class<?> fIncluded;

        public static CategoryFilter include(Class<?> categoryType) {
            return new CategoryFilter(categoryType, null);
        }

        public CategoryFilter(Class<?> includedCategory, Class<?> excludedCategory) {
            this.fIncluded = includedCategory;
            this.fExcluded = excludedCategory;
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return "category " + this.fIncluded;
        }

        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            if (hasCorrectCategoryAnnotation(description)) {
                return true;
            }
            Iterator i$ = description.getChildren().iterator();
            while (i$.hasNext()) {
                Description each = i$.next();
                if (shouldRun(each)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasCorrectCategoryAnnotation(Description description) {
            List<Class<?>> categories = categories(description);
            if (categories.isEmpty()) {
                return this.fIncluded == null;
            }
            for (Class<?> each : categories) {
                if (this.fExcluded != null && this.fExcluded.isAssignableFrom(each)) {
                    return false;
                }
            }
            for (Class<?> each2 : categories) {
                if (this.fIncluded == null || this.fIncluded.isAssignableFrom(each2)) {
                    return true;
                }
            }
            return false;
        }

        private List<Class<?>> categories(Description description) {
            ArrayList<Class<?>> categories = new ArrayList<>();
            categories.addAll(Arrays.asList(directCategories(description)));
            categories.addAll(Arrays.asList(directCategories(parentDescription(description))));
            return categories;
        }

        private Description parentDescription(Description description) {
            Class<?> testClass = description.getTestClass();
            if (testClass == null) {
                return null;
            }
            return Description.createSuiteDescription(testClass);
        }

        private Class<?>[] directCategories(Description description) {
            if (description == null) {
                return new Class[0];
            }
            Category annotation = (Category) description.getAnnotation(Category.class);
            if (annotation == null) {
                return new Class[0];
            }
            return annotation.value();
        }
    }

    public Categories(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        super(klass, builder);
        try {
            filter(new CategoryFilter(getIncludedCategory(klass), getExcludedCategory(klass)));
            assertNoCategorizedDescendentsOfUncategorizeableParents(getDescription());
        } catch (NoTestsRemainException e5) {
            throw new InitializationError(e5);
        }
    }

    private Class<?> getIncludedCategory(Class<?> klass) {
        IncludeCategory annotation = (IncludeCategory) klass.getAnnotation(IncludeCategory.class);
        if (annotation == null) {
            return null;
        }
        return annotation.value();
    }

    private Class<?> getExcludedCategory(Class<?> klass) {
        ExcludeCategory annotation = (ExcludeCategory) klass.getAnnotation(ExcludeCategory.class);
        if (annotation == null) {
            return null;
        }
        return annotation.value();
    }

    private void assertNoCategorizedDescendentsOfUncategorizeableParents(Description description) throws InitializationError {
        if (!canHaveCategorizedChildren(description)) {
            assertNoDescendantsHaveCategoryAnnotations(description);
        }
        Iterator i$ = description.getChildren().iterator();
        while (i$.hasNext()) {
            Description each = i$.next();
            assertNoCategorizedDescendentsOfUncategorizeableParents(each);
        }
    }

    private void assertNoDescendantsHaveCategoryAnnotations(Description description) throws InitializationError {
        Iterator i$ = description.getChildren().iterator();
        while (i$.hasNext()) {
            Description each = i$.next();
            if (each.getAnnotation(Category.class) != null) {
                throw new InitializationError("Category annotations on Parameterized classes are not supported on individual methods.");
            }
            assertNoDescendantsHaveCategoryAnnotations(each);
        }
    }

    private static boolean canHaveCategorizedChildren(Description description) {
        Iterator i$ = description.getChildren().iterator();
        while (i$.hasNext()) {
            Description each = i$.next();
            if (each.getTestClass() == null) {
                return false;
            }
        }
        return true;
    }
}
