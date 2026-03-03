package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ServiceWorkerClientBoundaryInterface extends FeatureFlagHolderBoundaryInterface {
    WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest);
}
