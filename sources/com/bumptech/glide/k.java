package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k<TranscodeType> extends u1.a<k<TranscodeType>> {

    /* renamed from: יי, reason: contains not printable characters */
    protected static final u1.g f5165 = new u1.g().m12117(e1.j.f7452).m12145(g.LOW).m12105(true);

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private final l f5166;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private final Context f5167;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private final b f5168;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final Class<TranscodeType> f5169;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private m<?, ? super TranscodeType> f5170;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private List<u1.f<TranscodeType>> f5171;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private Object f5172;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private k<TranscodeType> f5173;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private k<TranscodeType> f5174;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private boolean f5175 = true;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private Float f5176;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private boolean f5177;

    /* renamed from: ــ, reason: contains not printable characters */
    private final d f5178;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private boolean f5179;

    /* compiled from: RequestBuilder.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5180;

        /* renamed from: ʼ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5181;

        static {
            int[] iArr = new int[g.values().length];
            f5181 = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5181[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5181[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5181[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5180 = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5180[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5180[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5180[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5180[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5180[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5180[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5180[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.f5168 = bVar;
        this.f5166 = lVar;
        this.f5169 = cls;
        this.f5167 = context;
        this.f5170 = lVar.m6101(cls);
        this.f5178 = bVar.m6024();
        m6074(lVar.m6098());
        mo6079(lVar.m6100());
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    private u1.d m6070(v1.h<TranscodeType> hVar, u1.f<TranscodeType> fVar, u1.a<?> aVar, Executor executor) {
        return m6071(new Object(), hVar, fVar, null, this.f5170, aVar.m12143(), aVar.m12137(), aVar.m12135(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻי, reason: contains not printable characters */
    private u1.d m6071(Object obj, v1.h<TranscodeType> hVar, u1.f<TranscodeType> fVar, u1.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i5, int i6, u1.a<?> aVar, Executor executor) {
        u1.e eVar2;
        u1.e eVar3;
        if (this.f5173 != null) {
            eVar3 = new u1.b(obj, eVar);
            eVar2 = eVar3;
        } else {
            eVar2 = null;
            eVar3 = eVar;
        }
        u1.d m6072 = m6072(obj, hVar, fVar, eVar3, mVar, gVar, i5, i6, aVar, executor);
        if (eVar2 == null) {
            return m6072;
        }
        int m12137 = this.f5173.m12137();
        int m12135 = this.f5173.m12135();
        if (y1.l.m12914(i5, i6) && !this.f5173.m12125()) {
            m12137 = aVar.m12137();
            m12135 = aVar.m12135();
        }
        k<TranscodeType> kVar = this.f5173;
        u1.b bVar = eVar2;
        bVar.m12167(m6072, kVar.m6071(obj, hVar, fVar, bVar, kVar.f5170, kVar.m12143(), m12137, m12135, this.f5173, executor));
        return bVar;
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    private u1.d m6072(Object obj, v1.h<TranscodeType> hVar, u1.f<TranscodeType> fVar, u1.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i5, int i6, u1.a<?> aVar, Executor executor) {
        k<TranscodeType> kVar = this.f5174;
        if (kVar == null) {
            if (this.f5176 == null) {
                return m6078(obj, hVar, fVar, aVar, eVar, mVar, gVar, i5, i6, executor);
            }
            u1.j jVar = new u1.j(obj, eVar);
            jVar.m12204(m6078(obj, hVar, fVar, aVar, jVar, mVar, gVar, i5, i6, executor), m6078(obj, hVar, fVar, aVar.clone().m12104(this.f5176.floatValue()), jVar, mVar, m6073(gVar), i5, i6, executor));
            return jVar;
        }
        if (this.f5179) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m<?, ? super TranscodeType> mVar2 = kVar.f5175 ? mVar : kVar.f5170;
        g m12143 = kVar.m12113() ? this.f5174.m12143() : m6073(gVar);
        int m12137 = this.f5174.m12137();
        int m12135 = this.f5174.m12135();
        if (y1.l.m12914(i5, i6) && !this.f5174.m12125()) {
            m12137 = aVar.m12137();
            m12135 = aVar.m12135();
        }
        u1.j jVar2 = new u1.j(obj, eVar);
        u1.d m6078 = m6078(obj, hVar, fVar, aVar, jVar2, mVar, gVar, i5, i6, executor);
        this.f5179 = true;
        k<TranscodeType> kVar2 = this.f5174;
        u1.d m6071 = kVar2.m6071(obj, hVar, fVar, jVar2, mVar2, m12143, m12137, m12135, kVar2, executor);
        this.f5179 = false;
        jVar2.m12204(m6078, m6071);
        return jVar2;
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private g m6073(g gVar) {
        int i5 = a.f5181[gVar.ordinal()];
        if (i5 == 1) {
            return g.NORMAL;
        }
        if (i5 == 2) {
            return g.HIGH;
        }
        if (i5 == 3 || i5 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m12143());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private void m6074(List<u1.f<Object>> list) {
        Iterator<u1.f<Object>> it = list.iterator();
        while (it.hasNext()) {
            m6080((u1.f) it.next());
        }
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    private <Y extends v1.h<TranscodeType>> Y m6075(Y y5, u1.f<TranscodeType> fVar, u1.a<?> aVar, Executor executor) {
        y1.k.m12893(y5);
        if (!this.f5177) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        u1.d m6070 = m6070(y5, fVar, aVar, executor);
        u1.d mo12288 = y5.mo12288();
        if (m6070.mo12161(mo12288) && !m6076(aVar, mo12288)) {
            if (!((u1.d) y1.k.m12893(mo12288)).isRunning()) {
                mo12288.mo12164();
            }
            return y5;
        }
        this.f5166.m6097(y5);
        y5.mo12289(m6070);
        this.f5166.m6108(y5, m6070);
        return y5;
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    private boolean m6076(u1.a<?> aVar, u1.d dVar) {
        return !aVar.m12114() && dVar.mo12165();
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    private k<TranscodeType> m6077(Object obj) {
        if (m12140()) {
            return clone().m6077(obj);
        }
        this.f5172 = obj;
        this.f5177 = true;
        return m12136();
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private u1.d m6078(Object obj, v1.h<TranscodeType> hVar, u1.f<TranscodeType> fVar, u1.a<?> aVar, u1.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i5, int i6, Executor executor) {
        Context context = this.f5167;
        d dVar = this.f5178;
        return u1.i.m12198(context, dVar, obj, this.f5172, this.f5169, aVar, i5, i6, gVar, hVar, fVar, this.f5171, eVar, dVar.m6038(), mVar.m6171(), executor);
    }

    @Override // u1.a
    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return super.equals(kVar) && Objects.equals(this.f5169, kVar.f5169) && this.f5170.equals(kVar.f5170) && Objects.equals(this.f5172, kVar.f5172) && Objects.equals(this.f5171, kVar.f5171) && Objects.equals(this.f5174, kVar.f5174) && Objects.equals(this.f5173, kVar.f5173) && Objects.equals(this.f5176, kVar.f5176) && this.f5175 == kVar.f5175 && this.f5177 == kVar.f5177;
    }

    @Override // u1.a
    public int hashCode() {
        return y1.l.m12910(this.f5177, y1.l.m12910(this.f5175, y1.l.m12909(this.f5176, y1.l.m12909(this.f5173, y1.l.m12909(this.f5174, y1.l.m12909(this.f5171, y1.l.m12909(this.f5172, y1.l.m12909(this.f5170, y1.l.m12909(this.f5169, super.hashCode())))))))));
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public k<TranscodeType> m6080(u1.f<TranscodeType> fVar) {
        if (m12140()) {
            return clone().m6080(fVar);
        }
        if (fVar != null) {
            if (this.f5171 == null) {
                this.f5171 = new ArrayList();
            }
            this.f5171.add(fVar);
        }
        return m12136();
    }

    @Override // u1.a
    /* renamed from: ʻˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public k<TranscodeType> mo6079(u1.a<?> aVar) {
        y1.k.m12893(aVar);
        return (k) super.mo6079(aVar);
    }

    @Override // u1.a
    /* renamed from: ʻٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.f5170 = kVar.f5170.clone();
        if (kVar.f5171 != null) {
            kVar.f5171 = new ArrayList(kVar.f5171);
        }
        k<TranscodeType> kVar2 = kVar.f5174;
        if (kVar2 != null) {
            kVar.f5174 = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.f5173;
        if (kVar3 != null) {
            kVar.f5173 = kVar3.clone();
        }
        return kVar;
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public <Y extends v1.h<TranscodeType>> Y m6083(Y y5) {
        return (Y) m6084(y5, null, y1.e.m12876());
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    <Y extends v1.h<TranscodeType>> Y m6084(Y y5, u1.f<TranscodeType> fVar, Executor executor) {
        return (Y) m6075(y5, fVar, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* renamed from: ʻⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v1.i<android.widget.ImageView, TranscodeType> m6085(android.widget.ImageView r4) {
        /*
            r3 = this;
            y1.l.m12895()
            y1.k.m12893(r4)
            boolean r0 = r3.m12120()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m12118()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.k.a.f5180
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            u1.a r0 = r3.clone()
            u1.a r0 = r0.m12127()
            goto L4d
        L31:
            u1.a r0 = r3.clone()
            u1.a r0 = r0.m12131()
            goto L4d
        L3a:
            u1.a r0 = r3.clone()
            u1.a r0 = r0.m12127()
            goto L4d
        L43:
            u1.a r0 = r3.clone()
            u1.a r0 = r0.m12129()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f5178
            java.lang.Class<TranscodeType> r2 = r3.f5169
            v1.i r4 = r1.m6033(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = y1.e.m12876()
            v1.h r4 = r3.m6075(r4, r1, r0, r2)
            v1.i r4 = (v1.i) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.m6085(android.widget.ImageView):v1.i");
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public k<TranscodeType> m6086(Object obj) {
        return m6077(obj);
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    public k<TranscodeType> m6087(String str) {
        return m6077(str);
    }
}
