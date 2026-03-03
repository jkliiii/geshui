package org.junit.internal.matchers;

import java.lang.Throwable;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

/* loaded from: E:\78999\cookie_192572.dex */
public class ThrowableMessageMatcher<T extends Throwable> extends org.hamcrest.TypeSafeMatcher<T> {
    private final Matcher<String> fMatcher;

    public ThrowableMessageMatcher(Matcher<String> matcher) {
        this.fMatcher = matcher;
    }

    public void describeTo(Description description) {
        description.appendText("exception with message ");
        description.appendDescriptionOf(this.fMatcher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean matchesSafely(T item) {
        return this.fMatcher.matches(item.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void describeMismatchSafely(T item, Description description) {
        description.appendText("message ");
        this.fMatcher.describeMismatch(item.getMessage(), description);
    }

    @Factory
    public static <T extends Throwable> Matcher<T> hasMessage(Matcher<String> matcher) {
        return new ThrowableMessageMatcher(matcher);
    }
}
