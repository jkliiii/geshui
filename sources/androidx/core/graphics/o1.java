package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.f;
import androidx.core.provider.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class o1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, f.c> f2710 = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    class a implements c<g.b> {
        a() {
        }

        @Override // androidx.core.graphics.o1.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo2346(g.b bVar) {
            return bVar.m2487();
        }

        @Override // androidx.core.graphics.o1.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2347(g.b bVar) {
            return bVar.m2488();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    class b implements c<f.d> {
        b() {
        }

        @Override // androidx.core.graphics.o1.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int mo2346(f.d dVar) {
            return dVar.m2093();
        }

        @Override // androidx.core.graphics.o1.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo2347(f.d dVar) {
            return dVar.m2094();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    private interface c<T> {
        /* renamed from: ʻ */
        int mo2346(T t5);

        /* renamed from: ʼ */
        boolean mo2347(T t5);
    }

    o1() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m2340(Typeface typeface, f.c cVar) {
        long m2344 = m2344(typeface);
        if (m2344 != 0) {
            this.f2710.put(Long.valueOf(m2344), cVar);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private f.d m2341(f.c cVar, int i5) {
        return (f.d) m2342(cVar.m2088(), i5, new b());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static <T> T m2342(T[] tArr, int i5, c<T> cVar) {
        return (T) m2343(tArr, (i5 & 1) == 0 ? 400 : 700, (i5 & 2) != 0, cVar);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static <T> T m2343(T[] tArr, int i5, boolean z5, c<T> cVar) {
        T t5 = null;
        int i6 = Integer.MAX_VALUE;
        for (T t6 : tArr) {
            int abs = (Math.abs(cVar.mo2346(t6) - i5) * 2) + (cVar.mo2347(t6) == z5 ? 0 : 1);
            if (t5 == null || i6 > abs) {
                t5 = t6;
                i6 = abs;
            }
        }
        return t5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static long m2344(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e5) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e5);
            return 0L;
        } catch (NoSuchFieldException e6) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e6);
            return 0L;
        }
    }

    /* renamed from: ʼ */
    public Typeface mo2333(Context context, f.c cVar, Resources resources, int i5) {
        f.d m2341 = m2341(cVar, i5);
        if (m2341 == null) {
            return null;
        }
        Typeface m2321 = m0.m2321(context, resources, m2341.m2090(), m2341.m2089(), 0, i5);
        m2340(m2321, cVar);
        return m2321;
    }

    /* renamed from: ʽ */
    public Typeface mo2334(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2337(bVarArr, i5).m2486());
            try {
                Typeface mo2335 = mo2335(context, inputStream);
                p1.m2354(inputStream);
                return mo2335;
            } catch (IOException unused) {
                p1.m2354(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                p1.m2354(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ʾ */
    protected Typeface mo2335(Context context, InputStream inputStream) {
        File m2358 = p1.m2358(context);
        if (m2358 == null) {
            return null;
        }
        try {
            if (p1.m2357(m2358, inputStream)) {
                return Typeface.createFromFile(m2358.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m2358.delete();
        }
    }

    /* renamed from: ʿ */
    public Typeface mo2336(Context context, Resources resources, int i5, String str, int i6) {
        File m2358 = p1.m2358(context);
        if (m2358 == null) {
            return null;
        }
        try {
            if (p1.m2356(m2358, resources, i5)) {
                return Typeface.createFromFile(m2358.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m2358.delete();
        }
    }

    /* renamed from: ˊ */
    protected g.b mo2337(g.b[] bVarArr, int i5) {
        return (g.b) m2342(bVarArr, i5, new a());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    f.c m2345(Typeface typeface) {
        long m2344 = m2344(typeface);
        if (m2344 == 0) {
            return null;
        }
        return this.f2710.get(Long.valueOf(m2344));
    }
}
