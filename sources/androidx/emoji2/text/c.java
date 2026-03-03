package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* compiled from: DefaultEmojiCompatConfig.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final b f3217;

        public a(b bVar) {
            this.f3217 = bVar == null ? m3770() : bVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private e.c m3767(Context context, androidx.core.provider.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new i(context, eVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private List<List<byte[]>> m3768(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private androidx.core.provider.e m3769(ProviderInfo providerInfo, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new androidx.core.provider.e(str, str2, "emojicompat-emoji-font", m3768(this.f3217.mo3776(packageManager, str2)));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private static b m3770() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new C0041c();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m3771(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private ProviderInfo m3772(PackageManager packageManager) {
            Iterator<ResolveInfo> it = this.f3217.mo3777(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo mo3775 = this.f3217.mo3775(it.next());
                if (m3771(mo3775)) {
                    return mo3775;
                }
            }
            return null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public e.c m3773(Context context) {
            return m3767(context, m3774(context));
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        androidx.core.provider.e m3774(Context context) {
            PackageManager packageManager = context.getPackageManager();
            androidx.core.util.h.m2584(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo m3772 = m3772(packageManager);
            if (m3772 == null) {
                return null;
            }
            try {
                return m3769(m3772, packageManager);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                return null;
            }
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    public static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public ProviderInfo mo3775(ResolveInfo resolveInfo) {
            throw null;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public Signature[] mo3776(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public List<ResolveInfo> mo3777(PackageManager packageManager, Intent intent, int i5) {
            throw null;
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static class C0041c extends b {
        @Override // androidx.emoji2.text.c.b
        /* renamed from: ʻ */
        public ProviderInfo mo3775(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.c.b
        /* renamed from: ʽ */
        public List<ResolveInfo> mo3777(PackageManager packageManager, Intent intent, int i5) {
            return packageManager.queryIntentContentProviders(intent, i5);
        }
    }

    /* compiled from: DefaultEmojiCompatConfig.java */
    public static class d extends C0041c {
        @Override // androidx.emoji2.text.c.b
        /* renamed from: ʼ */
        public Signature[] mo3776(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static i m3766(Context context) {
        return (i) new a(null).m3773(context);
    }
}
