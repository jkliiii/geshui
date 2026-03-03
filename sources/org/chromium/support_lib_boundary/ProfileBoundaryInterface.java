package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ProfileBoundaryInterface {
    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();
}
