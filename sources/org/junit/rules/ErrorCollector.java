package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.runners.model.MultipleFailureException;

/* loaded from: E:\78999\cookie_192572.dex */
public class ErrorCollector extends Verifier {
    private List<Throwable> errors = new ArrayList();

    @Override // org.junit.rules.Verifier
    protected void verify() throws Throwable {
        MultipleFailureException.assertEmpty(this.errors);
    }

    public void addError(Throwable error) {
        this.errors.add(error);
    }

    public <T> void checkThat(T value, Matcher<T> matcher) {
        checkThat(BuildConfig.FLAVOR, value, matcher);
    }

    public <T> void checkThat(final String reason, final T value, final Matcher<T> matcher) {
        checkSucceeds(new Callable<Object>() { // from class: org.junit.rules.ErrorCollector.1
            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                Assert.assertThat(reason, value, matcher);
                return value;
            }
        });
    }

    public Object checkSucceeds(Callable<Object> callable) {
        try {
            return callable.call();
        } catch (Throwable e5) {
            addError(e5);
            return null;
        }
    }
}
