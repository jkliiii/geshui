package org.junit.internal;

import java.lang.reflect.Array;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.junit.Assert;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class ComparisonCriteria {
    protected abstract void assertElementsEqual(Object obj, Object obj2);

    public void arrayEquals(String message, Object expecteds, Object actuals) throws ArrayComparisonFailure {
        if (expecteds != actuals) {
            String header = message == null ? BuildConfig.FLAVOR : message + ": ";
            int expectedsLength = assertArraysAreSameLength(expecteds, actuals, header);
            for (int i5 = 0; i5 < expectedsLength; i5++) {
                Object expected = Array.get(expecteds, i5);
                Object actual = Array.get(actuals, i5);
                if (isArray(expected) && isArray(actual)) {
                    try {
                        arrayEquals(message, expected, actual);
                    } catch (ArrayComparisonFailure e5) {
                        e5.addDimension(i5);
                        throw e5;
                    }
                } else {
                    try {
                        assertElementsEqual(expected, actual);
                    } catch (AssertionError e6) {
                        throw new ArrayComparisonFailure(header, e6, i5);
                    }
                }
            }
        }
    }

    private boolean isArray(Object expected) {
        return expected != null && expected.getClass().isArray();
    }

    private int assertArraysAreSameLength(Object expecteds, Object actuals, String header) {
        if (expecteds == null) {
            Assert.fail(header + "expected array was null");
        }
        if (actuals == null) {
            Assert.fail(header + "actual array was null");
        }
        int actualsLength = Array.getLength(actuals);
        int expectedsLength = Array.getLength(expecteds);
        if (actualsLength != expectedsLength) {
            Assert.fail(header + "array lengths differed, expected.length=" + expectedsLength + " actual.length=" + actualsLength);
        }
        return expectedsLength;
    }
}
