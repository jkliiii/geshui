package u1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c1.l;
import java.util.Map;
import l1.n;
import l1.v;
import l1.x;
import u1.a;
import y1.k;

/* compiled from: BaseRequestOptions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a<T extends a<T>> implements Cloneable {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean f11437;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f11438;

    /* renamed from: ˉ, reason: contains not printable characters */
    private Drawable f11442;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f11443;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Drawable f11444;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f11445;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f11450;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private boolean f11452;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Drawable f11453;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f11455;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f11459;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private Resources.Theme f11460;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f11461;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean f11462;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f11439 = 1.0f;

    /* renamed from: ˆ, reason: contains not printable characters */
    private e1.j f11440 = e1.j.f7454;

    /* renamed from: ˈ, reason: contains not printable characters */
    private com.bumptech.glide.g f11441 = com.bumptech.glide.g.NORMAL;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f11446 = true;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f11447 = -1;

    /* renamed from: י, reason: contains not printable characters */
    private int f11448 = -1;

    /* renamed from: ـ, reason: contains not printable characters */
    private c1.f f11449 = x1.a.m12673();

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f11451 = true;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private c1.h f11456 = new c1.h();

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Map<Class<?>, l<?>> f11457 = new y1.b();

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Class<?> f11458 = Object.class;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean f11454 = true;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m12097(int i5) {
        return m12098(this.f11438, i5);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private static boolean m12098(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private T m12099(n nVar, l<Bitmap> lVar) {
        return (T) m12100(nVar, lVar, false);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private T m12100(n nVar, l<Bitmap> lVar, boolean z5) {
        T t5 = z5 ? (T) m12110(nVar, lVar) : (T) m12133(nVar, lVar);
        t5.f11454 = true;
        return t5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return m12102((a) obj);
        }
        return false;
    }

    public int hashCode() {
        return y1.l.m12909(this.f11460, y1.l.m12909(this.f11449, y1.l.m12909(this.f11458, y1.l.m12909(this.f11457, y1.l.m12909(this.f11456, y1.l.m12909(this.f11441, y1.l.m12909(this.f11440, y1.l.m12910(this.f11452, y1.l.m12910(this.f11462, y1.l.m12910(this.f11451, y1.l.m12910(this.f11450, y1.l.m12908(this.f11448, y1.l.m12908(this.f11447, y1.l.m12910(this.f11446, y1.l.m12909(this.f11453, y1.l.m12908(this.f11455, y1.l.m12909(this.f11444, y1.l.m12908(this.f11445, y1.l.m12909(this.f11442, y1.l.m12908(this.f11443, y1.l.m12906(this.f11439)))))))))))))))))))));
    }

    /* renamed from: ʻ */
    public T mo6079(a<?> aVar) {
        if (this.f11461) {
            return (T) clone().mo6079(aVar);
        }
        if (m12098(aVar.f11438, 2)) {
            this.f11439 = aVar.f11439;
        }
        if (m12098(aVar.f11438, 262144)) {
            this.f11462 = aVar.f11462;
        }
        if (m12098(aVar.f11438, 1048576)) {
            this.f11437 = aVar.f11437;
        }
        if (m12098(aVar.f11438, 4)) {
            this.f11440 = aVar.f11440;
        }
        if (m12098(aVar.f11438, 8)) {
            this.f11441 = aVar.f11441;
        }
        if (m12098(aVar.f11438, 16)) {
            this.f11442 = aVar.f11442;
            this.f11443 = 0;
            this.f11438 &= -33;
        }
        if (m12098(aVar.f11438, 32)) {
            this.f11443 = aVar.f11443;
            this.f11442 = null;
            this.f11438 &= -17;
        }
        if (m12098(aVar.f11438, 64)) {
            this.f11444 = aVar.f11444;
            this.f11445 = 0;
            this.f11438 &= -129;
        }
        if (m12098(aVar.f11438, 128)) {
            this.f11445 = aVar.f11445;
            this.f11444 = null;
            this.f11438 &= -65;
        }
        if (m12098(aVar.f11438, 256)) {
            this.f11446 = aVar.f11446;
        }
        if (m12098(aVar.f11438, 512)) {
            this.f11448 = aVar.f11448;
            this.f11447 = aVar.f11447;
        }
        if (m12098(aVar.f11438, 1024)) {
            this.f11449 = aVar.f11449;
        }
        if (m12098(aVar.f11438, 4096)) {
            this.f11458 = aVar.f11458;
        }
        if (m12098(aVar.f11438, 8192)) {
            this.f11453 = aVar.f11453;
            this.f11455 = 0;
            this.f11438 &= -16385;
        }
        if (m12098(aVar.f11438, 16384)) {
            this.f11455 = aVar.f11455;
            this.f11453 = null;
            this.f11438 &= -8193;
        }
        if (m12098(aVar.f11438, 32768)) {
            this.f11460 = aVar.f11460;
        }
        if (m12098(aVar.f11438, 65536)) {
            this.f11451 = aVar.f11451;
        }
        if (m12098(aVar.f11438, 131072)) {
            this.f11450 = aVar.f11450;
        }
        if (m12098(aVar.f11438, 2048)) {
            this.f11457.putAll(aVar.f11457);
            this.f11454 = aVar.f11454;
        }
        if (m12098(aVar.f11438, 524288)) {
            this.f11452 = aVar.f11452;
        }
        if (!this.f11451) {
            this.f11457.clear();
            int i5 = this.f11438 & (-2049);
            this.f11450 = false;
            this.f11438 = i5 & (-131073);
            this.f11454 = true;
        }
        this.f11438 |= aVar.f11438;
        this.f11456.m5832(aVar.f11456);
        return (T) m12136();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final boolean m12102(a<?> aVar) {
        return Float.compare(aVar.f11439, this.f11439) == 0 && this.f11443 == aVar.f11443 && y1.l.m12898(this.f11442, aVar.f11442) && this.f11445 == aVar.f11445 && y1.l.m12898(this.f11444, aVar.f11444) && this.f11455 == aVar.f11455 && y1.l.m12898(this.f11453, aVar.f11453) && this.f11446 == aVar.f11446 && this.f11447 == aVar.f11447 && this.f11448 == aVar.f11448 && this.f11450 == aVar.f11450 && this.f11451 == aVar.f11451 && this.f11462 == aVar.f11462 && this.f11452 == aVar.f11452 && this.f11440.equals(aVar.f11440) && this.f11441 == aVar.f11441 && this.f11456.equals(aVar.f11456) && this.f11457.equals(aVar.f11457) && this.f11458.equals(aVar.f11458) && y1.l.m12898(this.f11449, aVar.f11449) && y1.l.m12898(this.f11460, aVar.f11460);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public T m12103(c1.f fVar) {
        if (this.f11461) {
            return (T) clone().m12103(fVar);
        }
        this.f11449 = (c1.f) k.m12893(fVar);
        this.f11438 |= 1024;
        return (T) m12136();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public T m12104(float f5) {
        if (this.f11461) {
            return (T) clone().m12104(f5);
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f11439 = f5;
        this.f11438 |= 2;
        return (T) m12136();
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public T m12105(boolean z5) {
        if (this.f11461) {
            return (T) clone().m12105(true);
        }
        this.f11446 = !z5;
        this.f11438 |= 256;
        return (T) m12136();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public T m12106(int i5) {
        return (T) m12149(j1.a.f8612, Integer.valueOf(i5));
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public T m12107(l<Bitmap> lVar) {
        return (T) m12108(lVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻˈ, reason: contains not printable characters */
    T m12108(l<Bitmap> lVar, boolean z5) {
        if (this.f11461) {
            return (T) clone().m12108(lVar, z5);
        }
        v vVar = new v(lVar, z5);
        m12109(Bitmap.class, lVar, z5);
        m12109(Drawable.class, vVar, z5);
        m12109(BitmapDrawable.class, vVar.m9710(), z5);
        m12109(p1.c.class, new p1.f(lVar), z5);
        return (T) m12136();
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    <Y> T m12109(Class<Y> cls, l<Y> lVar, boolean z5) {
        if (this.f11461) {
            return (T) clone().m12109(cls, lVar, z5);
        }
        k.m12893(cls);
        k.m12893(lVar);
        this.f11457.put(cls, lVar);
        int i5 = this.f11438 | 2048;
        this.f11451 = true;
        int i6 = i5 | 65536;
        this.f11438 = i6;
        this.f11454 = false;
        if (z5) {
            this.f11438 = i6 | 131072;
            this.f11450 = true;
        }
        return (T) m12136();
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    final T m12110(n nVar, l<Bitmap> lVar) {
        if (this.f11461) {
            return (T) clone().m12110(nVar, lVar);
        }
        m12119(nVar);
        return (T) m12107(lVar);
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    public T m12111(boolean z5) {
        if (this.f11461) {
            return (T) clone().m12111(z5);
        }
        this.f11437 = z5;
        this.f11438 |= 1048576;
        return (T) m12136();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public T m12112() {
        if (this.f11459 && !this.f11461) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f11461 = true;
        return (T) m12123();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final boolean m12113() {
        return m12097(8);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public final boolean m12114() {
        return this.f11446;
    }

    @Override // 
    /* renamed from: ʾ, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t5 = (T) super.clone();
            c1.h hVar = new c1.h();
            t5.f11456 = hVar;
            hVar.m5832(this.f11456);
            y1.b bVar = new y1.b();
            t5.f11457 = bVar;
            bVar.putAll(this.f11457);
            t5.f11459 = false;
            t5.f11461 = false;
            return t5;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public T m12115(Class<?> cls) {
        if (this.f11461) {
            return (T) clone().m12115(cls);
        }
        this.f11458 = (Class) k.m12893(cls);
        this.f11438 |= 4096;
        return (T) m12136();
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    boolean m12116() {
        return this.f11454;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public T m12117(e1.j jVar) {
        if (this.f11461) {
            return (T) clone().m12117(jVar);
        }
        this.f11440 = (e1.j) k.m12893(jVar);
        this.f11438 |= 4;
        return (T) m12136();
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public final boolean m12118() {
        return this.f11451;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public T m12119(n nVar) {
        return (T) m12149(n.f8992, k.m12893(nVar));
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public final boolean m12120() {
        return m12097(2048);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public final boolean m12121() {
        return this.f11450;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final e1.j m12122() {
        return this.f11440;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public T m12123() {
        this.f11459 = true;
        return (T) m12101();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m12124() {
        return this.f11443;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public final boolean m12125() {
        return y1.l.m12914(this.f11448, this.f11447);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final Drawable m12126() {
        return this.f11442;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public T m12127() {
        return (T) m12099(n.f8988, new l1.l());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final Drawable m12128() {
        return this.f11453;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public T m12129() {
        return (T) m12133(n.f8989, new l1.k());
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public final int m12130() {
        return this.f11455;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public T m12131() {
        return (T) m12099(n.f8987, new x());
    }

    /* renamed from: י, reason: contains not printable characters */
    public final boolean m12132() {
        return this.f11452;
    }

    /* renamed from: יי, reason: contains not printable characters */
    final T m12133(n nVar, l<Bitmap> lVar) {
        if (this.f11461) {
            return (T) clone().m12133(nVar, lVar);
        }
        m12119(nVar);
        return (T) m12108(lVar, false);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public final c1.h m12134() {
        return this.f11456;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public final int m12135() {
        return this.f11447;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    protected final T m12136() {
        if (this.f11459) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) m12101();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public final int m12137() {
        return this.f11448;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public final boolean m12138() {
        return this.f11462;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public final Drawable m12139() {
        return this.f11444;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    protected final boolean m12140() {
        return this.f11461;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public final int m12141() {
        return this.f11445;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public T m12142(int i5, int i6) {
        if (this.f11461) {
            return (T) clone().m12142(i5, i6);
        }
        this.f11448 = i5;
        this.f11447 = i6;
        this.f11438 |= 512;
        return (T) m12136();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final com.bumptech.glide.g m12143() {
        return this.f11441;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public final Class<?> m12144() {
        return this.f11458;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public T m12145(com.bumptech.glide.g gVar) {
        if (this.f11461) {
            return (T) clone().m12145(gVar);
        }
        this.f11441 = (com.bumptech.glide.g) k.m12893(gVar);
        this.f11438 |= 8;
        return (T) m12136();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public final c1.f m12146() {
        return this.f11449;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final float m12147() {
        return this.f11439;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public final Resources.Theme m12148() {
        return this.f11460;
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public <Y> T m12149(c1.g<Y> gVar, Y y5) {
        if (this.f11461) {
            return (T) clone().m12149(gVar, y5);
        }
        k.m12893(gVar);
        k.m12893(y5);
        this.f11456.m5833(gVar, y5);
        return (T) m12136();
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public final Map<Class<?>, l<?>> m12150() {
        return this.f11457;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final boolean m12151() {
        return this.f11437;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private T m12101() {
        return this;
    }
}
