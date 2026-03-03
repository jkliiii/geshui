package org.junit.internal;

import org.junit.Assert;

/* loaded from: E:\78999\cookie_192572.dex */
public class ExactComparisonCriteria extends ComparisonCriteria {
    @Override // org.junit.internal.ComparisonCriteria
    protected void assertElementsEqual(Object expected, Object actual) {
        Assert.assertEquals(expected, actual);
    }
}
