package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}
