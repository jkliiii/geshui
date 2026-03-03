package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.matchers.JUnitMatchers;

/* loaded from: E:\78999\cookie_192572.dex */
class ExpectedExceptionMatcherBuilder {
    private final List<Matcher<?>> fMatchers = new ArrayList();

    ExpectedExceptionMatcherBuilder() {
    }

    void add(Matcher<?> matcher) {
        this.fMatchers.add(matcher);
    }

    boolean expectsThrowable() {
        return !this.fMatchers.isEmpty();
    }

    Matcher<Throwable> build() {
        return JUnitMatchers.isThrowable(allOfTheMatchers());
    }

    private Matcher<Throwable> allOfTheMatchers() {
        return this.fMatchers.size() == 1 ? cast(this.fMatchers.get(0)) : CoreMatchers.allOf(castedMatchers());
    }

    private List<Matcher<? super Throwable>> castedMatchers() {
        return new ArrayList(this.fMatchers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Matcher<Throwable> cast(Matcher<?> matcher) {
        return matcher;
    }
}
