package q;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.i;
import r.o;

/* compiled from: ConstraintAnchor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f10396;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f10397;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final e f10398;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final b f10399;

    /* renamed from: ˆ, reason: contains not printable characters */
    public d f10400;

    /* renamed from: ˊ, reason: contains not printable characters */
    n.i f10403;

    /* renamed from: ʻ, reason: contains not printable characters */
    private HashSet<d> f10395 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    public int f10401 = 0;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f10402 = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ConstraintAnchor.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10404;

        static {
            int[] iArr = new int[b.values().length];
            f10404 = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10404[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10404[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10404[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10404[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10404[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10404[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10404[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10404[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f10398 = eVar;
        this.f10399 = bVar;
    }

    public String toString() {
        return this.f10398.m11316() + ":" + this.f10399.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m11192(d dVar, int i5) {
        return m11193(dVar, i5, RecyclerView.UNDEFINED_DURATION, false);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m11193(d dVar, int i5, int i6, boolean z5) {
        if (dVar == null) {
            m11208();
            return true;
        }
        if (!z5 && !m11207(dVar)) {
            return false;
        }
        this.f10400 = dVar;
        if (dVar.f10395 == null) {
            dVar.f10395 = new HashSet<>();
        }
        HashSet<d> hashSet = this.f10400.f10395;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f10401 = i5;
        this.f10402 = i6;
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m11194(int i5, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f10395;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                r.i.m11597(it.next().f10398, i5, arrayList, oVar);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public HashSet<d> m11195() {
        return this.f10395;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m11196() {
        if (this.f10397) {
            return this.f10396;
        }
        return 0;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m11197() {
        d dVar;
        if (this.f10398.m11322() == 8) {
            return 0;
        }
        return (this.f10402 == Integer.MIN_VALUE || (dVar = this.f10400) == null || dVar.f10398.m11322() != 8) ? this.f10401 : this.f10402;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final d m11198() {
        switch (a.f10404[this.f10399.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f10398.f10493;
            case 3:
                return this.f10398.f10475;
            case 4:
                return this.f10398.f10481;
            case 5:
                return this.f10398.f10479;
            default:
                throw new AssertionError(this.f10399.name());
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public e m11199() {
        return this.f10398;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public n.i m11200() {
        return this.f10403;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public d m11201() {
        return this.f10400;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public b m11202() {
        return this.f10399;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m11203() {
        HashSet<d> hashSet = this.f10395;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m11198().m11206()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m11204() {
        HashSet<d> hashSet = this.f10395;
        return hashSet != null && hashSet.size() > 0;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m11205() {
        return this.f10397;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m11206() {
        return this.f10400 != null;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m11207(d dVar) {
        if (dVar == null) {
            return false;
        }
        b m11202 = dVar.m11202();
        b bVar = this.f10399;
        if (m11202 == bVar) {
            return bVar != b.BASELINE || (dVar.m11199().m11223() && m11199().m11223());
        }
        switch (a.f10404[bVar.ordinal()]) {
            case 1:
                return (m11202 == b.BASELINE || m11202 == b.CENTER_X || m11202 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z5 = m11202 == b.LEFT || m11202 == b.RIGHT;
                if (dVar.m11199() instanceof h) {
                    return z5 || m11202 == b.CENTER_X;
                }
                return z5;
            case 4:
            case 5:
                boolean z6 = m11202 == b.TOP || m11202 == b.BOTTOM;
                if (dVar.m11199() instanceof h) {
                    return z6 || m11202 == b.CENTER_Y;
                }
                return z6;
            case 6:
                return (m11202 == b.LEFT || m11202 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f10399.name());
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m11208() {
        HashSet<d> hashSet;
        d dVar = this.f10400;
        if (dVar != null && (hashSet = dVar.f10395) != null) {
            hashSet.remove(this);
            if (this.f10400.f10395.size() == 0) {
                this.f10400.f10395 = null;
            }
        }
        this.f10395 = null;
        this.f10400 = null;
        this.f10401 = 0;
        this.f10402 = RecyclerView.UNDEFINED_DURATION;
        this.f10397 = false;
        this.f10396 = 0;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m11209() {
        this.f10397 = false;
        this.f10396 = 0;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m11210(n.c cVar) {
        n.i iVar = this.f10403;
        if (iVar == null) {
            this.f10403 = new n.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.m10388();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m11211(int i5) {
        this.f10396 = i5;
        this.f10397 = true;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m11212(int i5) {
        if (m11206()) {
            this.f10402 = i5;
        }
    }
}
