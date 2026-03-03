package org.junit.internal.runners.model;

import java.util.List;

@Deprecated
/* loaded from: E:\78999\cookie_192572.dex */
public class MultipleFailureException extends org.junit.runners.model.MultipleFailureException {
    private static final long serialVersionUID = 1;

    public MultipleFailureException(List<Throwable> errors) {
        super(errors);
    }
}
