package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: ProfileInstaller.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final c f3946 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    static final c f3947 = new b();

    /* compiled from: ProfileInstaller.java */
    class b implements c {
        b() {
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʻ */
        public void mo4536(int i5, Object obj) {
            Log.d("ProfileInstaller", i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? BuildConfig.FLAVOR : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʼ */
        public void mo4537(int i5, Object obj) {
            String str;
            switch (i5) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = BuildConfig.FLAVOR;
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i5 == 6 || i5 == 7 || i5 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* compiled from: ProfileInstaller.java */
    public interface c {
        /* renamed from: ʻ */
        void mo4536(int i5, Object obj);

        /* renamed from: ʼ */
        void mo4537(int i5, Object obj);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static boolean m4592(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m4593(Context context, Executor executor, c cVar) {
        m4592(context.getFilesDir());
        m4597(executor, cVar, 11, null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static boolean m4594(PackageInfo packageInfo, File file, c cVar) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z5 = readLong == packageInfo.lastUpdateTime;
                if (z5) {
                    cVar.mo4537(2, null);
                }
                return z5;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static void m4596(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static void m4597(Executor executor, final c cVar, final int i5, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.i
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo4537(i5, obj);
            }
        });
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m4598(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, c cVar) {
        d dVar = new d(assetManager, executor, cVar, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!dVar.m4567()) {
            return false;
        }
        boolean m4570 = dVar.m4568().m4569().m4570();
        if (m4570) {
            m4596(packageInfo, file);
        }
        return m4570;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m4599(Context context) {
        m4600(context, new h(), f3946);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m4600(Context context, Executor executor, c cVar) {
        m4601(context, executor, cVar, false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m4601(Context context, Executor executor, c cVar, boolean z5) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z6 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z5 && m4594(packageInfo, filesDir, cVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                p.m4646(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (m4598(assets, packageName, packageInfo, filesDir, name, executor, cVar) && z5) {
                z6 = true;
            }
            p.m4646(context, z6);
        } catch (PackageManager.NameNotFoundException e5) {
            cVar.mo4537(7, e5);
            p.m4646(context, false);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static void m4602(Context context, Executor executor, c cVar) {
        try {
            m4596(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            m4597(executor, cVar, 10, null);
        } catch (PackageManager.NameNotFoundException e5) {
            m4597(executor, cVar, 7, e5);
        }
    }

    /* compiled from: ProfileInstaller.java */
    class a implements c {
        a() {
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʻ */
        public void mo4536(int i5, Object obj) {
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʼ */
        public void mo4537(int i5, Object obj) {
        }
    }
}
