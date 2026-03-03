package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface WebMessageBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    @Deprecated
    String getData();

    InvocationHandler getMessagePayload();

    InvocationHandler[] getPorts();
}
