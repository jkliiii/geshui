package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0056a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static File m4554(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    private static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static File m4555(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static boolean m4552(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z5 = true;
        for (File file2 : listFiles) {
            z5 = m4552(file2) && z5;
        }
        return z5;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m4553(Context context, ProfileInstallReceiver.a aVar) {
        int i5 = Build.VERSION.SDK_INT;
        if (m4552(i5 >= 24 ? b.m4555(context) : i5 >= 23 ? C0056a.m4554(context) : context.getCacheDir())) {
            aVar.mo4537(14, null);
        } else {
            aVar.mo4537(15, null);
        }
    }
}
