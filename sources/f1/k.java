package f1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k implements d {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Bitmap.Config f7682 = Bitmap.Config.ARGB_8888;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final l f7683;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Set<Bitmap.Config> f7684;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final long f7685;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final a f7686;

    /* renamed from: ʿ, reason: contains not printable characters */
    private long f7687;

    /* renamed from: ˆ, reason: contains not printable characters */
    private long f7688;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f7689;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f7690;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f7691;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f7692;

    /* compiled from: LruBitmapPool.java */
    private interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo8573(Bitmap bitmap);

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo8574(Bitmap bitmap);
    }

    k(long j5, l lVar, Set<Bitmap.Config> set) {
        this.f7685 = j5;
        this.f7687 = j5;
        this.f7683 = lVar;
        this.f7684 = set;
        this.f7686 = new b();
    }

    @TargetApi(26)
    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m8561(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static Bitmap m8562(int i5, int i6, Bitmap.Config config) {
        if (config == null) {
            config = f7682;
        }
        return Bitmap.createBitmap(i5, i6, config);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m8563() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m8564();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8564() {
        Log.v("LruBitmapPool", "Hits=" + this.f7689 + ", misses=" + this.f7690 + ", puts=" + this.f7691 + ", evictions=" + this.f7692 + ", currentSize=" + this.f7688 + ", maxSize=" + this.f7687 + "\nStrategy=" + this.f7683);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m8565() {
        m8571(this.f7687);
    }

    @TargetApi(26)
    /* renamed from: ˎ, reason: contains not printable characters */
    private static Set<Bitmap.Config> m8566() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i5 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i5 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static l m8567() {
        return new o();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private synchronized Bitmap m8568(int i5, int i6, Bitmap.Config config) {
        Bitmap mo8577;
        m8561(config);
        mo8577 = this.f7683.mo8577(i5, i6, config != null ? config : f7682);
        if (mo8577 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f7683.mo8575(i5, i6, config));
            }
            this.f7690++;
        } else {
            this.f7689++;
            this.f7688 -= this.f7683.mo8576(mo8577);
            this.f7686.mo8573(mo8577);
            m8570(mo8577);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f7683.mo8575(i5, i6, config));
        }
        m8563();
        return mo8577;
    }

    @TargetApi(19)
    /* renamed from: ـ, reason: contains not printable characters */
    private static void m8569(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static void m8570(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m8569(bitmap);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private synchronized void m8571(long j5) {
        while (this.f7688 > j5) {
            Bitmap removeLast = this.f7683.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m8564();
                }
                this.f7688 = 0L;
                return;
            }
            this.f7686.mo8573(removeLast);
            this.f7688 -= this.f7683.mo8576(removeLast);
            this.f7692++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f7683.mo8579(removeLast));
            }
            m8563();
            removeLast.recycle();
        }
    }

    @Override // f1.d
    @SuppressLint({"InlinedApi"})
    /* renamed from: ʻ */
    public void mo8526(int i5) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i5);
        }
        if (i5 >= 40 || (Build.VERSION.SDK_INT >= 23 && i5 >= 20)) {
            mo8527();
        } else if (i5 >= 20 || i5 == 15) {
            m8571(m8572() / 2);
        }
    }

    @Override // f1.d
    /* renamed from: ʼ */
    public void mo8527() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m8571(0L);
    }

    @Override // f1.d
    /* renamed from: ʽ */
    public Bitmap mo8528(int i5, int i6, Bitmap.Config config) {
        Bitmap m8568 = m8568(i5, i6, config);
        if (m8568 == null) {
            return m8562(i5, i6, config);
        }
        m8568.eraseColor(0);
        return m8568;
    }

    @Override // f1.d
    /* renamed from: ʾ */
    public synchronized void mo8529(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f7683.mo8576(bitmap) <= this.f7687 && this.f7684.contains(bitmap.getConfig())) {
                int mo8576 = this.f7683.mo8576(bitmap);
                this.f7683.mo8578(bitmap);
                this.f7686.mo8574(bitmap);
                this.f7691++;
                this.f7688 += mo8576;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f7683.mo8579(bitmap));
                }
                m8563();
                m8565();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f7683.mo8579(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f7684.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // f1.d
    /* renamed from: ʿ */
    public Bitmap mo8530(int i5, int i6, Bitmap.Config config) {
        Bitmap m8568 = m8568(i5, i6, config);
        return m8568 == null ? m8562(i5, i6, config) : m8568;
    }

    /* renamed from: י, reason: contains not printable characters */
    public long m8572() {
        return this.f7687;
    }

    public k(long j5) {
        this(j5, m8567(), m8566());
    }

    /* compiled from: LruBitmapPool.java */
    private static final class b implements a {
        b() {
        }

        @Override // f1.k.a
        /* renamed from: ʻ */
        public void mo8573(Bitmap bitmap) {
        }

        @Override // f1.k.a
        /* renamed from: ʼ */
        public void mo8574(Bitmap bitmap) {
        }
    }
}
