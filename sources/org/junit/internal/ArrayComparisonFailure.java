package org.junit.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_192572.dex */
public class ArrayComparisonFailure extends AssertionError {
    private static final long serialVersionUID = 1;
    private final AssertionError fCause;
    private List<Integer> fIndices = new ArrayList();
    private final String fMessage;

    public ArrayComparisonFailure(String message, AssertionError cause, int index) {
        this.fMessage = message;
        this.fCause = cause;
        addDimension(index);
    }

    public void addDimension(int index) {
        this.fIndices.add(0, Integer.valueOf(index));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder builder = new StringBuilder();
        if (this.fMessage != null) {
            builder.append(this.fMessage);
        }
        builder.append("arrays first differed at element ");
        Iterator i$ = this.fIndices.iterator();
        while (i$.hasNext()) {
            int each = i$.next().intValue();
            builder.append("[");
            builder.append(each);
            builder.append("]");
        }
        builder.append("; ");
        builder.append(this.fCause.getMessage());
        return builder.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
