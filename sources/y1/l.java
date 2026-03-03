package y1;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import i1.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: Util.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final char[] f12462 = "0123456789abcdef".toCharArray();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final char[] f12463 = new char[64];

    /* renamed from: ʽ, reason: contains not printable characters */
    private static volatile Handler f12464;

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f12465;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f12465 = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12465[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12465[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12465[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12465[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private l() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m12895() {
        if (!m12912()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m12896(u1.a<?> aVar, u1.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.m12102(aVar2);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m12897(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof m ? ((m) obj).m9170(obj2) : obj.equals(obj2);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m12898(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static String m12899(byte[] bArr, char[] cArr) {
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = i5 * 2;
            char[] cArr2 = f12462;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static <T> Queue<T> m12900(int i5) {
        return new ArrayDeque(i5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static int m12901(int i5, int i6, Bitmap.Config config) {
        return i5 * i6 * m12903(config);
    }

    @TargetApi(19)
    /* renamed from: ˉ, reason: contains not printable characters */
    public static int m12902(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m12903(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i5 = a.f12465[config.ordinal()];
        if (i5 == 1) {
            return 1;
        }
        if (i5 == 2 || i5 == 3) {
            return 2;
        }
        return i5 != 4 ? 4 : 8;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static <T> List<T> m12904(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t5 : collection) {
            if (t5 != null) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Handler m12905() {
        if (f12464 == null) {
            synchronized (l.class) {
                if (f12464 == null) {
                    f12464 = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f12464;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m12906(float f5) {
        return m12907(f5, 17);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static int m12907(float f5, int i5) {
        return m12908(Float.floatToIntBits(f5), i5);
    }

    /* renamed from: י, reason: contains not printable characters */
    public static int m12908(int i5, int i6) {
        return (i6 * 31) + i5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static int m12909(Object obj, int i5) {
        return m12908(obj == null ? 0 : obj.hashCode(), i5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static int m12910(boolean z5, int i5) {
        return m12908(z5 ? 1 : 0, i5);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static boolean m12911() {
        return !m12912();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static boolean m12912() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static boolean m12913(int i5) {
        return i5 > 0 || i5 == Integer.MIN_VALUE;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static boolean m12914(int i5, int i6) {
        return m12913(i5) && m12913(i6);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static void m12915(Runnable runnable) {
        m12905().post(runnable);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static void m12916(Runnable runnable) {
        m12905().removeCallbacks(runnable);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static String m12917(byte[] bArr) {
        String m12899;
        char[] cArr = f12463;
        synchronized (cArr) {
            m12899 = m12899(bArr, cArr);
        }
        return m12899;
    }
}
