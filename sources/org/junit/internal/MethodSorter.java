package org.junit.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import org.junit.FixMethodOrder;

/* loaded from: E:\78999\cookie_192572.dex */
public class MethodSorter {
    public static Comparator<Method> DEFAULT = new Comparator<Method>() { // from class: org.junit.internal.MethodSorter.1
        @Override // java.util.Comparator
        public int compare(Method m12, Method m22) {
            int i12 = m12.getName().hashCode();
            int i22 = m22.getName().hashCode();
            if (i12 != i22) {
                return i12 < i22 ? -1 : 1;
            }
            return MethodSorter.NAME_ASCENDING.compare(m12, m22);
        }
    };
    public static Comparator<Method> NAME_ASCENDING = new Comparator<Method>() { // from class: org.junit.internal.MethodSorter.2
        @Override // java.util.Comparator
        public int compare(Method m12, Method m22) {
            int comparison = m12.getName().compareTo(m22.getName());
            return comparison != 0 ? comparison : m12.toString().compareTo(m22.toString());
        }
    };

    public static Method[] getDeclaredMethods(Class<?> clazz) {
        Comparator<Method> comparator = getSorter((FixMethodOrder) clazz.getAnnotation(FixMethodOrder.class));
        Method[] methods = clazz.getDeclaredMethods();
        if (comparator != null) {
            Arrays.sort(methods, comparator);
        }
        return methods;
    }

    private MethodSorter() {
    }

    private static Comparator<Method> getSorter(FixMethodOrder fixMethodOrder) {
        return fixMethodOrder == null ? DEFAULT : fixMethodOrder.value().getComparator();
    }
}
