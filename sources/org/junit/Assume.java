package org.junit;

import java.util.Arrays;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.internal.AssumptionViolatedException;

/* loaded from: E:\78999\cookie_192572.dex */
public class Assume {
    public static void assumeTrue(boolean b6) {
        assumeThat(Boolean.valueOf(b6), CoreMatchers.is(true));
    }

    public static void assumeFalse(boolean b6) {
        assumeTrue(!b6);
    }

    public static void assumeTrue(String message, boolean b6) {
        if (!b6) {
            throw new AssumptionViolatedException(message);
        }
    }

    public static void assumeFalse(String message, boolean b6) {
        assumeTrue(message, !b6);
    }

    public static void assumeNotNull(Object... objects) {
        assumeThat(Arrays.asList(objects), CoreMatchers.everyItem(CoreMatchers.notNullValue()));
    }

    public static <T> void assumeThat(T actual, Matcher<T> matcher) {
        if (!matcher.matches(actual)) {
            throw new AssumptionViolatedException((Object) actual, (Matcher<?>) matcher);
        }
    }

    public static <T> void assumeThat(String message, T actual, Matcher<T> matcher) {
        if (!matcher.matches(actual)) {
            throw new AssumptionViolatedException(message, actual, matcher);
        }
    }

    public static void assumeNoException(Throwable t5) {
        assumeThat(t5, CoreMatchers.nullValue());
    }

    public static void assumeNoException(String message, Throwable t5) {
        assumeThat(message, t5, CoreMatchers.nullValue());
    }
}
