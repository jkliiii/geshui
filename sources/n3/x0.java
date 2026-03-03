package n3;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import androidx.appcompat.app.b;

/* compiled from: PermissionsHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x0 {

    /* compiled from: PermissionsHelper.java */
    public interface a {
        /* renamed from: ˉ */
        void mo10770(int i5);
    }

    /* compiled from: PermissionsHelper.java */
    public static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Activity f10009;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final int f10010;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final String[] f10011;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f10012;

        public b(Activity activity, int i5, String... strArr) {
            this.f10009 = activity;
            this.f10010 = i5;
            this.f10011 = strArr;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static boolean m10861(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (String str : strArr) {
            if (androidx.core.content.a.m1990(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public static /* synthetic */ void m10862(b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            androidx.core.app.b.m1932(bVar.f10009, bVar.f10011, bVar.f10010);
            return;
        }
        ComponentCallbacks2 componentCallbacks2 = bVar.f10009;
        if (componentCallbacks2 instanceof a) {
            ((a) componentCallbacks2).mo10770(bVar.f10010);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public static /* synthetic */ void m10863(f fVar, DialogInterface dialogInterface, int i5) {
        fVar.mo8742(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static /* synthetic */ void m10864(f fVar, DialogInterface dialogInterface, int i5) {
        fVar.mo8742(Boolean.FALSE);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static void m10865(final b bVar) {
        if (m10866(bVar.f10009, bVar.f10011)) {
            m10867(bVar.f10009, bVar.f10012, new f() { // from class: n3.w0
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    x0.m10862(bVar, (Boolean) obj);
                }
            });
        } else {
            androidx.core.app.b.m1932(bVar.f10009, bVar.f10011, bVar.f10010);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static boolean m10866(Context context, String... strArr) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            for (String str : strArr) {
                if (androidx.core.app.b.m1933(activity, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static void m10867(Context context, int i5, final f<Boolean> fVar) {
        if (i5 == 0) {
            fVar.mo8742(Boolean.TRUE);
        } else {
            new b.a(context).setMessage(i5).setCancelable(false).setPositiveButton(h1.f9741, new DialogInterface.OnClickListener() { // from class: n3.u0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    x0.m10863(fVar, dialogInterface, i6);
                }
            }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: n3.v0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    x0.m10864(fVar, dialogInterface, i6);
                }
            }).show();
        }
    }
}
