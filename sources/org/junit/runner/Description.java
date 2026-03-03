package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: E:\78999\cookie_192572.dex */
public class Description implements Serializable {
    private static final long serialVersionUID = 1;
    private final Annotation[] fAnnotations;
    private final ArrayList<Description> fChildren;
    private final String fDisplayName;
    private Class<?> fTestClass;
    private final Serializable fUniqueId;
    private static final Pattern METHOD_AND_CLASS_NAME_PATTERN = Pattern.compile("(.*)\\((.*)\\)");
    public static final Description EMPTY = new Description(null, "No Tests", new Annotation[0]);
    public static final Description TEST_MECHANISM = new Description(null, "Test mechanism", new Annotation[0]);

    public static Description createSuiteDescription(String name, Annotation... annotations) {
        return new Description(null, name, annotations);
    }

    public static Description createSuiteDescription(String name, Serializable uniqueId, Annotation... annotations) {
        return new Description(null, name, uniqueId, annotations);
    }

    public static Description createTestDescription(String className, String name, Annotation... annotations) {
        return new Description(null, formatDisplayName(name, className), annotations);
    }

    public static Description createTestDescription(Class<?> clazz, String name, Annotation... annotations) {
        return new Description(clazz, formatDisplayName(name, clazz.getName()), annotations);
    }

    public static Description createTestDescription(Class<?> clazz, String name) {
        return new Description(clazz, formatDisplayName(name, clazz.getName()), new Annotation[0]);
    }

    public static Description createTestDescription(String className, String name, Serializable uniqueId) {
        return new Description(null, formatDisplayName(name, className), uniqueId, new Annotation[0]);
    }

    private static String formatDisplayName(String name, String className) {
        return String.format("%s(%s)", name, className);
    }

    public static Description createSuiteDescription(Class<?> testClass) {
        return new Description(testClass, testClass.getName(), testClass.getAnnotations());
    }

    private Description(Class<?> clazz, String displayName, Annotation... annotations) {
        this(clazz, displayName, displayName, annotations);
    }

    private Description(Class<?> clazz, String displayName, Serializable uniqueId, Annotation... annotations) {
        this.fChildren = new ArrayList<>();
        if (displayName == null || displayName.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (uniqueId == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
        this.fTestClass = clazz;
        this.fDisplayName = displayName;
        this.fUniqueId = uniqueId;
        this.fAnnotations = annotations;
    }

    public String getDisplayName() {
        return this.fDisplayName;
    }

    public void addChild(Description description) {
        getChildren().add(description);
    }

    public ArrayList<Description> getChildren() {
        return this.fChildren;
    }

    public boolean isSuite() {
        return !isTest();
    }

    public boolean isTest() {
        return getChildren().isEmpty();
    }

    public int testCount() {
        if (isTest()) {
            return 1;
        }
        int result = 0;
        Iterator i$ = getChildren().iterator();
        while (i$.hasNext()) {
            Description child = i$.next();
            result += child.testCount();
        }
        return result;
    }

    public int hashCode() {
        return this.fUniqueId.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Description)) {
            return false;
        }
        Description d6 = (Description) obj;
        return this.fUniqueId.equals(d6.fUniqueId);
    }

    public String toString() {
        return getDisplayName();
    }

    public boolean isEmpty() {
        return equals(EMPTY);
    }

    public Description childlessCopy() {
        return new Description(this.fTestClass, this.fDisplayName, this.fAnnotations);
    }

    public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
        Annotation[] arr$ = this.fAnnotations;
        for (Annotation each : arr$) {
            if (each.annotationType().equals(annotationType)) {
                return annotationType.cast(each);
            }
        }
        return null;
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.fAnnotations);
    }

    public Class<?> getTestClass() {
        if (this.fTestClass != null) {
            return this.fTestClass;
        }
        String name = getClassName();
        if (name == null) {
            return null;
        }
        try {
            this.fTestClass = Class.forName(name, false, getClass().getClassLoader());
            return this.fTestClass;
        } catch (ClassNotFoundException e5) {
            return null;
        }
    }

    public String getClassName() {
        return this.fTestClass != null ? this.fTestClass.getName() : methodAndClassNamePatternGroupOrDefault(2, toString());
    }

    public String getMethodName() {
        return methodAndClassNamePatternGroupOrDefault(1, null);
    }

    private String methodAndClassNamePatternGroupOrDefault(int group, String defaultString) {
        Matcher matcher = METHOD_AND_CLASS_NAME_PATTERN.matcher(toString());
        if (!matcher.matches()) {
            return defaultString;
        }
        String defaultString2 = matcher.group(group);
        return defaultString2;
    }
}
