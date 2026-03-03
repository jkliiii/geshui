package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ListenableFuture<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
