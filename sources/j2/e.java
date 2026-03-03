package j2;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;

/* compiled from: IWebChromeClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface e {
    /* renamed from: ʻ, reason: contains not printable characters */
    boolean mo9295(f fVar, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean mo9296(f fVar, boolean z5, boolean z6, Message message);

    /* renamed from: ʽ, reason: contains not printable characters */
    void mo9297();

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean mo9298(f fVar, String str, String str2, c cVar);

    /* renamed from: ʿ, reason: contains not printable characters */
    void mo9299(PermissionRequest permissionRequest);

    /* renamed from: ˆ, reason: contains not printable characters */
    void mo9300();

    /* renamed from: ˈ, reason: contains not printable characters */
    void mo9301(String str, GeolocationPermissions.Callback callback);

    /* renamed from: ˉ, reason: contains not printable characters */
    void mo9302(View view, WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: ˊ, reason: contains not printable characters */
    void mo9303(f fVar, String str);

    /* renamed from: ˋ, reason: contains not printable characters */
    void mo9304(ValueCallback<Uri> valueCallback, String str, String str2);

    /* renamed from: ˎ, reason: contains not printable characters */
    void mo9305(f fVar);

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean mo9306(f fVar, String str, String str2, c cVar);

    /* renamed from: ˑ, reason: contains not printable characters */
    void mo9307(f fVar, int i5);
}
