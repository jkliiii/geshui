package x;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.c;
import androidx.core.view.f1;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* compiled from: InputConnectionCompat.java */
    class a extends InputConnectionWrapper {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ c f12089;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z5, c cVar) {
            super(inputConnection, z5);
            this.f12089 = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
            if (this.f12089.mo12639(k.m12650(inputContentInfo), i5, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i5, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    class b extends InputConnectionWrapper {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ c f12090;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z5, c cVar) {
            super(inputConnection, z5);
            this.f12090 = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (f.m12644(str, bundle, this.f12090)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    public interface c {
        /* renamed from: ʻ */
        boolean mo12639(k kVar, int i5, Bundle bundle);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static c m12641(final View view) {
        androidx.core.util.h.m2583(view);
        return new c() { // from class: x.e
            @Override // x.f.c
            /* renamed from: ʻ, reason: contains not printable characters */
            public final boolean mo12639(k kVar, int i5, Bundle bundle) {
                return f.m12645(view, kVar, i5, bundle);
            }
        };
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static InputConnection m12642(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m12643(inputConnection, editorInfo, m12641(view));
    }

    @Deprecated
    /* renamed from: ʾ, reason: contains not printable characters */
    public static InputConnection m12643(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        androidx.core.util.c.m2570(inputConnection, "inputConnection must be non-null");
        androidx.core.util.c.m2570(editorInfo, "editorInfo must be non-null");
        androidx.core.util.c.m2570(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : d.m12630(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: ʿ, reason: contains not printable characters */
    static boolean m12644(String str, Bundle bundle, c cVar) {
        boolean z5;
        ResultReceiver resultReceiver;
        ?? r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z5 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z5 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
        } catch (Throwable th) {
            th = th;
            resultReceiver = 0;
        }
        try {
            Uri uri = (Uri) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
            Uri uri2 = (Uri) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
            int i5 = bundle.getInt(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
            Bundle bundle2 = (Bundle) bundle.getParcelable(z5 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
            if (uri != null && clipDescription != null) {
                r02 = cVar.mo12639(new k(uri, clipDescription, uri2), i5, bundle2);
            }
            if (resultReceiver != 0) {
                resultReceiver.send(r02, null);
            }
            return r02;
        } catch (Throwable th2) {
            th = th2;
            if (resultReceiver != 0) {
                resultReceiver.send(0, null);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public static /* synthetic */ boolean m12645(View view, k kVar, int i5, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i5 & 1) != 0) {
            try {
                kVar.m12654();
                InputContentInfo inputContentInfo = (InputContentInfo) kVar.m12655();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e5) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
                return false;
            }
        }
        return f1.m2820(view, new c.a(new ClipData(kVar.m12652(), new ClipData.Item(kVar.m12651())), 2).m2773(kVar.m12653()).m2771(bundle).m2770()) == null;
    }
}
