package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: י, reason: contains not printable characters */
    private static final Object f3220 = new Object();

    /* renamed from: ـ, reason: contains not printable characters */
    private static final Object f3221 = new Object();

    /* renamed from: ٴ, reason: contains not printable characters */
    private static volatile e f3222;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Set<AbstractC0043e> f3224;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final b f3227;

    /* renamed from: ˆ, reason: contains not printable characters */
    final g f3228;

    /* renamed from: ˈ, reason: contains not printable characters */
    final boolean f3229;

    /* renamed from: ˉ, reason: contains not printable characters */
    final boolean f3230;

    /* renamed from: ˊ, reason: contains not printable characters */
    final int[] f3231;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final boolean f3232;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f3233;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final int f3234;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final d f3235;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ReadWriteLock f3223 = new ReentrantReadWriteLock();

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile int f3225 = 3;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Handler f3226 = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    private static final class a extends b {

        /* renamed from: ʼ, reason: contains not printable characters */
        private volatile androidx.emoji2.text.h f3236;

        /* renamed from: ʽ, reason: contains not printable characters */
        private volatile l f3237;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0042a extends h {
            C0042a() {
            }

            @Override // androidx.emoji2.text.e.h
            /* renamed from: ʻ */
            public void mo3759(Throwable th) {
                a.this.f3239.m3792(th);
            }

            @Override // androidx.emoji2.text.e.h
            /* renamed from: ʼ */
            public void mo3760(l lVar) {
                a.this.m3804(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo3801() {
            try {
                this.f3239.f3228.mo3757(new C0042a());
            } catch (Throwable th) {
                this.f3239.m3792(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        /* renamed from: ʼ, reason: contains not printable characters */
        CharSequence mo3802(CharSequence charSequence, int i5, int i6, int i7, boolean z5) {
            return this.f3236.m3826(charSequence, i5, i6, i7, z5);
        }

        @Override // androidx.emoji2.text.e.b
        /* renamed from: ʽ, reason: contains not printable characters */
        void mo3803(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3237.m3858());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3239.f3229);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m3804(l lVar) {
            if (lVar == null) {
                this.f3239.m3792(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3237 = lVar;
            l lVar2 = this.f3237;
            i iVar = new i();
            d dVar = this.f3239.f3235;
            e eVar = this.f3239;
            this.f3236 = new androidx.emoji2.text.h(lVar2, iVar, dVar, eVar.f3230, eVar.f3231);
            this.f3239.m3793();
        }
    }

    /* compiled from: EmojiCompat.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final e f3239;

        b(e eVar) {
            this.f3239 = eVar;
        }

        /* renamed from: ʻ */
        void mo3801() {
            throw null;
        }

        /* renamed from: ʼ */
        CharSequence mo3802(CharSequence charSequence, int i5, int i6, int i7, boolean z5) {
            throw null;
        }

        /* renamed from: ʽ */
        void mo3803(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final g f3240;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f3241;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f3242;

        /* renamed from: ʾ, reason: contains not printable characters */
        int[] f3243;

        /* renamed from: ʿ, reason: contains not printable characters */
        Set<AbstractC0043e> f3244;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f3245;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f3246 = -16711936;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f3247 = 0;

        /* renamed from: ˊ, reason: contains not printable characters */
        d f3248 = new androidx.emoji2.text.d();

        protected c(g gVar) {
            androidx.core.util.h.m2584(gVar, "metadataLoader cannot be null.");
            this.f3240 = gVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        protected final g m3805() {
            return this.f3240;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public c m3806(int i5) {
            this.f3247 = i5;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface d {
        /* renamed from: ʻ */
        boolean mo3779(CharSequence charSequence, int i5, int i6, int i7);
    }

    /* compiled from: EmojiCompat.java */
    private static class f implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<AbstractC0043e> f3249;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final Throwable f3250;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final int f3251;

        f(AbstractC0043e abstractC0043e, int i5) {
            this(Arrays.asList((AbstractC0043e) androidx.core.util.h.m2584(abstractC0043e, "initCallback cannot be null")), i5, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3249.size();
            int i5 = 0;
            if (this.f3251 != 1) {
                while (i5 < size) {
                    this.f3249.get(i5).mo1604(this.f3250);
                    i5++;
                }
            } else {
                while (i5 < size) {
                    this.f3249.get(i5).mo1605();
                    i5++;
                }
            }
        }

        f(Collection<AbstractC0043e> collection, int i5) {
            this(collection, i5, null);
        }

        f(Collection<AbstractC0043e> collection, int i5, Throwable th) {
            androidx.core.util.h.m2584(collection, "initCallbacks cannot be null");
            this.f3249 = new ArrayList(collection);
            this.f3251 = i5;
            this.f3250 = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    public interface g {
        /* renamed from: ʻ */
        void mo3757(h hVar);
    }

    /* compiled from: EmojiCompat.java */
    public static abstract class h {
        /* renamed from: ʻ */
        public abstract void mo3759(Throwable th);

        /* renamed from: ʼ */
        public abstract void mo3760(l lVar);
    }

    /* compiled from: EmojiCompat.java */
    static class i {
        i() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        d0.a m3807(androidx.emoji2.text.g gVar) {
            return new d0.c(gVar);
        }
    }

    private e(c cVar) {
        this.f3229 = cVar.f3241;
        this.f3230 = cVar.f3242;
        this.f3231 = cVar.f3243;
        this.f3232 = cVar.f3245;
        this.f3233 = cVar.f3246;
        this.f3228 = cVar.f3240;
        this.f3234 = cVar.f3247;
        this.f3235 = cVar.f3248;
        m.b bVar = new m.b();
        this.f3224 = bVar;
        Set<AbstractC0043e> set = cVar.f3244;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f3244);
        }
        this.f3227 = new a(this);
        m3787();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static e m3781() {
        e eVar;
        synchronized (f3220) {
            eVar = f3222;
            androidx.core.util.h.m2585(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static boolean m3782(InputConnection inputConnection, Editable editable, int i5, int i6, boolean z5) {
        return androidx.emoji2.text.h.m3821(inputConnection, editable, i5, i6, z5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static boolean m3783(Editable editable, int i5, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.m3822(editable, i5, keyEvent);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static e m3784(c cVar) {
        e eVar = f3222;
        if (eVar == null) {
            synchronized (f3220) {
                eVar = f3222;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f3222 = eVar;
                }
            }
        }
        return eVar;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static boolean m3785() {
        return f3222 != null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m3786() {
        return m3789() == 1;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m3787() {
        this.f3223.writeLock().lock();
        try {
            if (this.f3234 == 0) {
                this.f3225 = 0;
            }
            this.f3223.writeLock().unlock();
            if (m3789() == 0) {
                this.f3227.mo3801();
            }
        } catch (Throwable th) {
            this.f3223.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m3788() {
        return this.f3233;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m3789() {
        this.f3223.readLock().lock();
        try {
            return this.f3225;
        } finally {
            this.f3223.readLock().unlock();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m3790() {
        return this.f3232;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m3791() {
        androidx.core.util.h.m2585(this.f3234 == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m3786()) {
            return;
        }
        this.f3223.writeLock().lock();
        try {
            if (this.f3225 == 0) {
                return;
            }
            this.f3225 = 0;
            this.f3223.writeLock().unlock();
            this.f3227.mo3801();
        } finally {
            this.f3223.writeLock().unlock();
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m3792(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3223.writeLock().lock();
        try {
            this.f3225 = 2;
            arrayList.addAll(this.f3224);
            this.f3224.clear();
            this.f3223.writeLock().unlock();
            this.f3226.post(new f(arrayList, this.f3225, th));
        } catch (Throwable th2) {
            this.f3223.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    void m3793() {
        ArrayList arrayList = new ArrayList();
        this.f3223.writeLock().lock();
        try {
            this.f3225 = 1;
            arrayList.addAll(this.f3224);
            this.f3224.clear();
            this.f3223.writeLock().unlock();
            this.f3226.post(new f(arrayList, this.f3225));
        } catch (Throwable th) {
            this.f3223.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public CharSequence m3794(CharSequence charSequence) {
        return m3795(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public CharSequence m3795(CharSequence charSequence, int i5, int i6) {
        return m3796(charSequence, i5, i6, Integer.MAX_VALUE);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public CharSequence m3796(CharSequence charSequence, int i5, int i6, int i7) {
        return m3797(charSequence, i5, i6, i7, 0);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public CharSequence m3797(CharSequence charSequence, int i5, int i6, int i7, int i8) {
        androidx.core.util.h.m2585(m3786(), "Not initialized yet");
        androidx.core.util.h.m2581(i5, "start cannot be negative");
        androidx.core.util.h.m2581(i6, "end cannot be negative");
        androidx.core.util.h.m2581(i7, "maxEmojiCount cannot be negative");
        androidx.core.util.h.m2578(i5 <= i6, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.m2578(i5 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.m2578(i6 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i5 == i6) {
            return charSequence;
        }
        return this.f3227.mo3802(charSequence, i5, i6, i7, i8 != 1 ? i8 != 2 ? this.f3229 : false : true);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m3798(AbstractC0043e abstractC0043e) {
        androidx.core.util.h.m2584(abstractC0043e, "initCallback cannot be null");
        this.f3223.writeLock().lock();
        try {
            if (this.f3225 == 1 || this.f3225 == 2) {
                this.f3226.post(new f(abstractC0043e, this.f3225));
            } else {
                this.f3224.add(abstractC0043e);
            }
        } finally {
            this.f3223.writeLock().unlock();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m3799(AbstractC0043e abstractC0043e) {
        androidx.core.util.h.m2584(abstractC0043e, "initCallback cannot be null");
        this.f3223.writeLock().lock();
        try {
            this.f3224.remove(abstractC0043e);
        } finally {
            this.f3223.writeLock().unlock();
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m3800(EditorInfo editorInfo) {
        if (!m3786() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3227.mo3803(editorInfo);
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0043e {
        /* renamed from: ʻ */
        public void mo1604(Throwable th) {
        }

        /* renamed from: ʼ */
        public void mo1605() {
        }
    }
}
