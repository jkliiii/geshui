package g1;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f7856;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f7857;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Context f7858;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f7859;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {

        /* renamed from: ˊ, reason: contains not printable characters */
        static final int f7860;

        /* renamed from: ʻ, reason: contains not printable characters */
        final Context f7861;

        /* renamed from: ʼ, reason: contains not printable characters */
        ActivityManager f7862;

        /* renamed from: ʽ, reason: contains not printable characters */
        c f7863;

        /* renamed from: ʿ, reason: contains not printable characters */
        float f7865;

        /* renamed from: ʾ, reason: contains not printable characters */
        float f7864 = 2.0f;

        /* renamed from: ˆ, reason: contains not printable characters */
        float f7866 = 0.4f;

        /* renamed from: ˈ, reason: contains not printable characters */
        float f7867 = 0.33f;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f7868 = 4194304;

        static {
            f7860 = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f7865 = f7860;
            this.f7861 = context;
            this.f7862 = (ActivityManager) context.getSystemService("activity");
            this.f7863 = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.m8679(this.f7862)) {
                return;
            }
            this.f7865 = 0.0f;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public i m8684() {
            return new i(this);
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    private static final class b implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final DisplayMetrics f7869;

        b(DisplayMetrics displayMetrics) {
            this.f7869 = displayMetrics;
        }

        @Override // g1.i.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public int mo8685() {
            return this.f7869.heightPixels;
        }

        @Override // g1.i.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public int mo8686() {
            return this.f7869.widthPixels;
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    interface c {
        /* renamed from: ʻ */
        int mo8685();

        /* renamed from: ʼ */
        int mo8686();
    }

    i(a aVar) {
        this.f7858 = aVar.f7861;
        int i5 = m8679(aVar.f7862) ? aVar.f7868 / 2 : aVar.f7868;
        this.f7859 = i5;
        int m8678 = m8678(aVar.f7862, aVar.f7866, aVar.f7867);
        float mo8686 = aVar.f7863.mo8686() * aVar.f7863.mo8685() * 4;
        int round = Math.round(aVar.f7865 * mo8686);
        int round2 = Math.round(mo8686 * aVar.f7864);
        int i6 = m8678 - i5;
        int i7 = round2 + round;
        if (i7 <= i6) {
            this.f7857 = round2;
            this.f7856 = round;
        } else {
            float f5 = i6;
            float f6 = aVar.f7865;
            float f7 = aVar.f7864;
            float f8 = f5 / (f6 + f7);
            this.f7857 = Math.round(f7 * f8);
            this.f7856 = Math.round(f8 * aVar.f7865);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m8680(this.f7857));
            sb.append(", pool size: ");
            sb.append(m8680(this.f7856));
            sb.append(", byte array size: ");
            sb.append(m8680(i5));
            sb.append(", memory class limited? ");
            sb.append(i7 > m8678);
            sb.append(", max size: ");
            sb.append(m8680(m8678));
            sb.append(", memoryClass: ");
            sb.append(aVar.f7862.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m8679(aVar.f7862));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int m8678(ActivityManager activityManager, float f5, float f6) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (m8679(activityManager)) {
            f5 = f6;
        }
        return Math.round(memoryClass * f5);
    }

    @TargetApi(19)
    /* renamed from: ʿ, reason: contains not printable characters */
    static boolean m8679(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private String m8680(int i5) {
        return Formatter.formatFileSize(this.f7858, i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m8681() {
        return this.f7859;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m8682() {
        return this.f7856;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m8683() {
        return this.f7857;
    }
}
