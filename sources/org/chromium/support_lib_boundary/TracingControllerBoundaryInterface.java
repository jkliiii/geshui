package org.chromium.support_lib_boundary;

import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface TracingControllerBoundaryInterface {
    boolean isTracing();

    void start(int i5, Collection<String> collection, int i6) throws IllegalStateException, IllegalArgumentException;

    boolean stop(OutputStream outputStream, Executor executor);
}
