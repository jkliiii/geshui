package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* loaded from: E:\78999\cookie_192572.dex */
public class ThrowableCauseMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
    private final Matcher<T> fMatcher;

    public ThrowableCauseMatcher(Matcher<T> matcher) {
        this.fMatcher = matcher;
    }

    public void describeTo(Description description) {
        description.appendText("exception with cause ");
        description.appendDescriptionOf(this.fMatcher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean matchesSafely(T item) {
        return this.fMatcher.matches(item.getCause());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void describeMismatchSafely(T item, Description description) {
        description.appendText("cause ");
        this.fMatcher.describeMismatch(item.getCause(), description);
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasCause(Matcher<T> matcher) {
        return new ThrowableCauseMatcher(matcher);
    }
}
