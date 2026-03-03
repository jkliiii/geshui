package org.junit.internal.runners.model;

import java.lang.reflect.InvocationTargetException;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class ReflectiveCallable {
    protected abstract Object runReflectiveCall() throws Throwable;

    public Object run() throws Throwable {
        try {
            return runReflectiveCall();
        } catch (InvocationTargetException e5) {
            throw e5.getTargetException();
        }
    }
}
