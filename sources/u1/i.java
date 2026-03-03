package u1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import e1.k;
import e1.q;
import e1.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import y1.l;

/* compiled from: SingleRequest.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i<R> implements d, v1.g, h {

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final boolean f11476 = Log.isLoggable("GlideRequest", 2);

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f11477;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean f11478;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11479;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final z1.c f11480;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private RuntimeException f11481;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Object f11482;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final f<R> f11483;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final e f11484;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Context f11485;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final com.bumptech.glide.d f11486;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Object f11487;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Class<R> f11488;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final u1.a<?> f11489;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final int f11490;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final int f11491;

    /* renamed from: י, reason: contains not printable characters */
    private final com.bumptech.glide.g f11492;

    /* renamed from: ـ, reason: contains not printable characters */
    private final v1.h<R> f11493;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final List<f<R>> f11494;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final w1.c<? super R> f11495;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int f11496;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final Executor f11497;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private int f11498;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private v<R> f11499;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private k.d f11500;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private long f11501;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private volatile k f11502;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private a f11503;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private Drawable f11504;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private Drawable f11505;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private Drawable f11506;

    /* compiled from: SingleRequest.java */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private i(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, u1.a<?> aVar, int i5, int i6, com.bumptech.glide.g gVar, v1.h<R> hVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, w1.c<? super R> cVar, Executor executor) {
        this.f11479 = f11476 ? String.valueOf(super.hashCode()) : null;
        this.f11480 = z1.c.m13149();
        this.f11482 = obj;
        this.f11485 = context;
        this.f11486 = dVar;
        this.f11487 = obj2;
        this.f11488 = cls;
        this.f11489 = aVar;
        this.f11490 = i5;
        this.f11491 = i6;
        this.f11492 = gVar;
        this.f11493 = hVar;
        this.f11483 = fVar;
        this.f11494 = list;
        this.f11484 = eVar;
        this.f11502 = kVar;
        this.f11495 = cVar;
        this.f11497 = executor;
        this.f11503 = a.PENDING;
        if (this.f11481 == null && dVar.m6039().m6042(c.C0078c.class)) {
            this.f11481 = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m12180() {
        if (m12183()) {
            Drawable m12189 = this.f11487 == null ? m12189() : null;
            if (m12189 == null) {
                m12189 = m12187();
            }
            if (m12189 == null) {
                m12189 = m12191();
            }
            this.f11493.mo12283(m12189);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m12181() {
        if (this.f11478) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m12182() {
        e eVar = this.f11484;
        return eVar == null || eVar.mo12162(this);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m12183() {
        e eVar = this.f11484;
        return eVar == null || eVar.mo12166(this);
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m12184() {
        e eVar = this.f11484;
        return eVar == null || eVar.mo12157(this);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m12185() {
        m12181();
        this.f11480.mo13151();
        this.f11493.mo12290(this);
        k.d dVar = this.f11500;
        if (dVar != null) {
            dVar.m8387();
            this.f11500 = null;
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m12186(Object obj) {
        List<f<R>> list = this.f11494;
        if (list == null) {
            return;
        }
        for (f<R> fVar : list) {
            if (fVar instanceof c) {
                ((c) fVar).m12168(obj);
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Drawable m12187() {
        if (this.f11504 == null) {
            Drawable m12126 = this.f11489.m12126();
            this.f11504 = m12126;
            if (m12126 == null && this.f11489.m12124() > 0) {
                this.f11504 = m12193(this.f11489.m12124());
            }
        }
        return this.f11504;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m12188(q qVar, int i5) {
        boolean z5;
        this.f11480.mo13151();
        synchronized (this.f11482) {
            qVar.m8427(this.f11481);
            int m6040 = this.f11486.m6040();
            if (m6040 <= i5) {
                Log.w("Glide", "Load failed for [" + this.f11487 + "] with dimensions [" + this.f11496 + "x" + this.f11498 + "]", qVar);
                if (m6040 <= 4) {
                    qVar.m8424("Glide");
                }
            }
            this.f11500 = null;
            this.f11503 = a.FAILED;
            m12196();
            boolean z6 = true;
            this.f11478 = true;
            try {
                List<f<R>> list = this.f11494;
                if (list != null) {
                    Iterator<f<R>> it = list.iterator();
                    z5 = false;
                    while (it.hasNext()) {
                        z5 |= it.next().m12172(qVar, this.f11487, this.f11493, m12192());
                    }
                } else {
                    z5 = false;
                }
                f<R> fVar = this.f11483;
                if (fVar == null || !fVar.m12172(qVar, this.f11487, this.f11493, m12192())) {
                    z6 = false;
                }
                if (!(z5 | z6)) {
                    m12180();
                }
                this.f11478 = false;
                z1.b.m13148("GlideRequest", this.f11477);
            } catch (Throwable th) {
                this.f11478 = false;
                throw th;
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Drawable m12189() {
        if (this.f11506 == null) {
            Drawable m12128 = this.f11489.m12128();
            this.f11506 = m12128;
            if (m12128 == null && this.f11489.m12130() > 0) {
                this.f11506 = m12193(this.f11489.m12130());
            }
        }
        return this.f11506;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m12190(v<R> vVar, R r5, c1.a aVar, boolean z5) {
        boolean z6;
        boolean m12192 = m12192();
        this.f11503 = a.COMPLETE;
        this.f11499 = vVar;
        if (this.f11486.m6040() <= 3) {
            Log.d("Glide", "Finished loading " + r5.getClass().getSimpleName() + " from " + aVar + " for " + this.f11487 + " with size [" + this.f11496 + "x" + this.f11498 + "] in " + y1.g.m12878(this.f11501) + " ms");
        }
        m12197();
        boolean z7 = true;
        this.f11478 = true;
        try {
            List<f<R>> list = this.f11494;
            if (list != null) {
                z6 = false;
                for (f<R> fVar : list) {
                    boolean m12173 = z6 | fVar.m12173(r5, this.f11487, this.f11493, aVar, m12192);
                    z6 = fVar instanceof c ? ((c) fVar).m12169(r5, this.f11487, this.f11493, aVar, m12192, z5) | m12173 : m12173;
                }
            } else {
                z6 = false;
            }
            f<R> fVar2 = this.f11483;
            if (fVar2 == null || !fVar2.m12173(r5, this.f11487, this.f11493, aVar, m12192)) {
                z7 = false;
            }
            if (!(z6 | z7)) {
                this.f11493.mo9533(r5, this.f11495.mo12503(aVar, m12192));
            }
            this.f11478 = false;
            z1.b.m13148("GlideRequest", this.f11477);
        } catch (Throwable th) {
            this.f11478 = false;
            throw th;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private Drawable m12191() {
        if (this.f11505 == null) {
            Drawable m12139 = this.f11489.m12139();
            this.f11505 = m12139;
            if (m12139 == null && this.f11489.m12141() > 0) {
                this.f11505 = m12193(this.f11489.m12141());
            }
        }
        return this.f11505;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m12192() {
        e eVar = this.f11484;
        return eVar == null || !eVar.getRoot().mo12156();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Drawable m12193(int i5) {
        return n1.g.m10433(this.f11485, i5, this.f11489.m12148() != null ? this.f11489.m12148() : this.f11485.getTheme());
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m12194(String str) {
        Log.v("GlideRequest", str + " this: " + this.f11479);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static int m12195(int i5, float f5) {
        return i5 == Integer.MIN_VALUE ? i5 : Math.round(f5 * i5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m12196() {
        e eVar = this.f11484;
        if (eVar != null) {
            eVar.mo12163(this);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m12197() {
        e eVar = this.f11484;
        if (eVar != null) {
            eVar.mo12159(this);
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static <R> i<R> m12198(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, u1.a<?> aVar, int i5, int i6, com.bumptech.glide.g gVar, v1.h<R> hVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, w1.c<? super R> cVar, Executor executor) {
        return new i<>(context, dVar, obj, obj2, cls, aVar, i5, i6, gVar, hVar, fVar, list, eVar, kVar, cVar, executor);
    }

    @Override // u1.d
    public void clear() {
        synchronized (this.f11482) {
            m12181();
            this.f11480.mo13151();
            a aVar = this.f11503;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            m12185();
            v<R> vVar = this.f11499;
            if (vVar != null) {
                this.f11499 = null;
            } else {
                vVar = null;
            }
            if (m12182()) {
                this.f11493.mo9534(m12191());
            }
            z1.b.m13148("GlideRequest", this.f11477);
            this.f11503 = aVar2;
            if (vVar != null) {
                this.f11502.m8381(vVar);
            }
        }
    }

    @Override // u1.d
    public boolean isRunning() {
        boolean z5;
        synchronized (this.f11482) {
            a aVar = this.f11503;
            z5 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z5;
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f11482) {
            obj = this.f11487;
            cls = this.f11488;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @Override // u1.d
    /* renamed from: ʻ */
    public boolean mo12156() {
        boolean z5;
        synchronized (this.f11482) {
            z5 = this.f11503 == a.COMPLETE;
        }
        return z5;
    }

    @Override // u1.h
    /* renamed from: ʼ */
    public void mo12177(q qVar) {
        m12188(qVar, 5);
    }

    @Override // u1.d
    /* renamed from: ʽ */
    public void mo12158() {
        synchronized (this.f11482) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u1.h
    /* renamed from: ʾ */
    public void mo12178(v<?> vVar, c1.a aVar, boolean z5) {
        this.f11480.mo13151();
        v<?> vVar2 = null;
        try {
            synchronized (this.f11482) {
                try {
                    this.f11500 = null;
                    if (vVar == null) {
                        mo12177(new q("Expected to receive a Resource<R> with an object of " + this.f11488 + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f11488.isAssignableFrom(obj.getClass())) {
                            if (m12184()) {
                                m12190(vVar, obj, aVar, z5);
                                return;
                            }
                            this.f11499 = null;
                            this.f11503 = a.COMPLETE;
                            z1.b.m13148("GlideRequest", this.f11477);
                            this.f11502.m8381(vVar);
                            return;
                        }
                        this.f11499 = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f11488);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        mo12177(new q(sb.toString()));
                        this.f11502.m8381(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.f11502.m8381(vVar2);
            }
            throw th3;
        }
    }

    @Override // u1.d
    /* renamed from: ʿ */
    public boolean mo12160() {
        boolean z5;
        synchronized (this.f11482) {
            z5 = this.f11503 == a.CLEARED;
        }
        return z5;
    }

    @Override // u1.d
    /* renamed from: ˆ */
    public boolean mo12161(d dVar) {
        int i5;
        int i6;
        Object obj;
        Class<R> cls;
        u1.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i7;
        int i8;
        Object obj2;
        Class<R> cls2;
        u1.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(dVar instanceof i)) {
            return false;
        }
        synchronized (this.f11482) {
            i5 = this.f11490;
            i6 = this.f11491;
            obj = this.f11487;
            cls = this.f11488;
            aVar = this.f11489;
            gVar = this.f11492;
            List<f<R>> list = this.f11494;
            size = list != null ? list.size() : 0;
        }
        i iVar = (i) dVar;
        synchronized (iVar.f11482) {
            i7 = iVar.f11490;
            i8 = iVar.f11491;
            obj2 = iVar.f11487;
            cls2 = iVar.f11488;
            aVar2 = iVar.f11489;
            gVar2 = iVar.f11492;
            List<f<R>> list2 = iVar.f11494;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i5 == i7 && i6 == i8 && l.m12897(obj, obj2) && cls.equals(cls2) && l.m12896(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // u1.h
    /* renamed from: ˈ */
    public Object mo12179() {
        this.f11480.mo13151();
        return this.f11482;
    }

    @Override // v1.g
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo12199(int i5, int i6) {
        Object obj;
        this.f11480.mo13151();
        Object obj2 = this.f11482;
        synchronized (obj2) {
            try {
                try {
                    boolean z5 = f11476;
                    if (z5) {
                        m12194("Got onSizeReady in " + y1.g.m12878(this.f11501));
                    }
                    if (this.f11503 == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.f11503 = aVar;
                        float m12147 = this.f11489.m12147();
                        this.f11496 = m12195(i5, m12147);
                        this.f11498 = m12195(i6, m12147);
                        if (z5) {
                            m12194("finished setup for calling load in " + y1.g.m12878(this.f11501));
                        }
                        obj = obj2;
                        try {
                            this.f11500 = this.f11502.m8380(this.f11486, this.f11487, this.f11489.m12146(), this.f11496, this.f11498, this.f11489.m12144(), this.f11488, this.f11492, this.f11489.m12122(), this.f11489.m12150(), this.f11489.m12121(), this.f11489.m12116(), this.f11489.m12134(), this.f11489.m12114(), this.f11489.m12138(), this.f11489.m12151(), this.f11489.m12132(), this, this.f11497);
                            if (this.f11503 != aVar) {
                                this.f11500 = null;
                            }
                            if (z5) {
                                m12194("finished onSizeReady in " + y1.g.m12878(this.f11501));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˊ */
    public void mo12164() {
        synchronized (this.f11482) {
            m12181();
            this.f11480.mo13151();
            this.f11501 = y1.g.m12879();
            Object obj = this.f11487;
            if (obj == null) {
                if (l.m12914(this.f11490, this.f11491)) {
                    this.f11496 = this.f11490;
                    this.f11498 = this.f11491;
                }
                m12188(new q("Received null model"), m12189() == null ? 5 : 3);
                return;
            }
            a aVar = this.f11503;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                mo12178(this.f11499, c1.a.MEMORY_CACHE, false);
                return;
            }
            m12186(obj);
            this.f11477 = z1.b.m13144("GlideRequest");
            a aVar3 = a.WAITING_FOR_SIZE;
            this.f11503 = aVar3;
            if (l.m12914(this.f11490, this.f11491)) {
                mo12199(this.f11490, this.f11491);
            } else {
                this.f11493.mo12287(this);
            }
            a aVar4 = this.f11503;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && m12183()) {
                this.f11493.mo12284(m12191());
            }
            if (f11476) {
                m12194("finished run method in " + y1.g.m12878(this.f11501));
            }
        }
    }

    @Override // u1.d
    /* renamed from: ˋ */
    public boolean mo12165() {
        boolean z5;
        synchronized (this.f11482) {
            z5 = this.f11503 == a.COMPLETE;
        }
        return z5;
    }
}
