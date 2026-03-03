package org.chromium.support_lib_boundary;

import java.util.Set;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z5);

    void setAllowFileAccess(boolean z5);

    void setBlockNetworkLoads(boolean z5);

    void setCacheMode(int i5);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
