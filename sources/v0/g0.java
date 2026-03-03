package v0;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebkitToCompatConverter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final WebkitToCompatConverterBoundaryInterface f11665;

    public g0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f11665 = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public a0 m12254(WebSettings webSettings) {
        return new a0((WebSettingsBoundaryInterface) d5.a.m8257(WebSettingsBoundaryInterface.class, this.f11665.convertSettings(webSettings)));
    }
}
