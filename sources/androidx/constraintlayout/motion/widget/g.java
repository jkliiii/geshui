package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import s.b;
import s.c;
import s.d;

/* compiled from: MotionController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean f1612;

    /* renamed from: ʼ, reason: contains not printable characters */
    private k f1613;

    /* renamed from: ʽ, reason: contains not printable characters */
    private k f1614;

    /* renamed from: ʾ, reason: contains not printable characters */
    private f f1615;

    /* renamed from: ʿ, reason: contains not printable characters */
    private f f1616;

    /* renamed from: ˆ, reason: contains not printable characters */
    private o.a[] f1617;

    /* renamed from: ˈ, reason: contains not printable characters */
    private o.a f1618;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f1619;

    /* renamed from: ˊ, reason: contains not printable characters */
    float f1620;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] f1621;

    /* renamed from: ˎ, reason: contains not printable characters */
    private double[] f1622;

    /* renamed from: ˏ, reason: contains not printable characters */
    private double[] f1623;

    /* renamed from: ˑ, reason: contains not printable characters */
    private String[] f1624;

    /* renamed from: י, reason: contains not printable characters */
    private float[] f1625;

    /* renamed from: ـ, reason: contains not printable characters */
    private ArrayList<k> f1626;

    /* renamed from: ٴ, reason: contains not printable characters */
    private HashMap<String, s.d> f1627;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private HashMap<String, s.c> f1628;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private HashMap<String, s.b> f1629;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private e[] f1630;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f1631;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private View f1632;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f1633;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private float f1634;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private Interpolator f1635;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f1636;

    /* renamed from: ʻ, reason: contains not printable characters */
    private float m1749(float f5, float[] fArr) {
        float f6 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f7 = this.f1620;
            if (f7 != 1.0d) {
                float f8 = this.f1619;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f8) * f7, 1.0f);
                }
            }
        }
        o.b bVar = this.f1613.f1704;
        Iterator<k> it = this.f1626.iterator();
        float f9 = Float.NaN;
        while (it.hasNext()) {
            k next = it.next();
            o.b bVar2 = next.f1704;
            if (bVar2 != null) {
                float f10 = next.f1706;
                if (f10 < f5) {
                    bVar = bVar2;
                    f6 = f10;
                } else if (Float.isNaN(f9)) {
                    f9 = next.f1706;
                }
            }
        }
        if (bVar != null) {
            float f11 = (Float.isNaN(f9) ? 1.0f : f9) - f6;
            double d6 = (f5 - f6) / f11;
            f5 = (((float) bVar.m10967(d6)) * f11) + f6;
            if (fArr != null) {
                fArr[0] = (float) bVar.m10968(d6);
            }
        }
        return f5;
    }

    public String toString() {
        return " start: x: " + this.f1613.f1708 + " y: " + this.f1613.f1709 + " end: x: " + this.f1614.f1708 + " y: " + this.f1614.f1709;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1750(double d6, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f1617[0].m10964(d6, dArr);
        this.f1617[0].m10966(d6, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f1613.m1788(d6, this.f1621, dArr, fArr, dArr2, fArr2);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m1751(View view, float f5, long j5, o.c cVar) {
        d.a aVar;
        boolean z5;
        char c6;
        double d6;
        float m1749 = m1749(f5, null);
        int i5 = this.f1633;
        if (i5 != d.f1609) {
            float f6 = 1.0f / i5;
            float floor = ((float) Math.floor(m1749 / f6)) * f6;
            float f7 = (m1749 % f6) / f6;
            if (!Float.isNaN(this.f1634)) {
                f7 = (f7 + this.f1634) % 1.0f;
            }
            Interpolator interpolator = this.f1635;
            m1749 = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + floor;
        }
        float f8 = m1749;
        HashMap<String, s.c> hashMap = this.f1628;
        if (hashMap != null) {
            Iterator<s.c> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().mo11697(view, f8);
            }
        }
        HashMap<String, s.d> hashMap2 = this.f1627;
        if (hashMap2 != null) {
            d.a aVar2 = null;
            boolean z6 = false;
            for (s.d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    z6 |= dVar.mo11700(view, f8, j5, cVar);
                }
            }
            z5 = z6;
            aVar = aVar2;
        } else {
            aVar = null;
            z5 = false;
        }
        o.a[] aVarArr = this.f1617;
        if (aVarArr != null) {
            double d7 = f8;
            aVarArr[0].m10964(d7, this.f1622);
            this.f1617[0].m10966(d7, this.f1623);
            o.a aVar3 = this.f1618;
            if (aVar3 != null) {
                double[] dArr = this.f1622;
                if (dArr.length > 0) {
                    aVar3.m10964(d7, dArr);
                    this.f1618.m10966(d7, this.f1623);
                }
            }
            if (this.f1636) {
                d6 = d7;
            } else {
                d6 = d7;
                this.f1613.m1789(f8, view, this.f1621, this.f1622, this.f1623, null, this.f1612);
                this.f1612 = false;
            }
            if (this.f1631 != d.f1609) {
                if (this.f1632 == null) {
                    this.f1632 = ((View) view.getParent()).findViewById(this.f1631);
                }
                if (this.f1632 != null) {
                    float top2 = (r1.getTop() + this.f1632.getBottom()) / 2.0f;
                    float left = (this.f1632.getLeft() + this.f1632.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top2 - view.getTop());
                    }
                }
            }
            HashMap<String, s.c> hashMap3 = this.f1628;
            if (hashMap3 != null) {
                for (s.c cVar2 : hashMap3.values()) {
                    if (cVar2 instanceof c.a) {
                        double[] dArr2 = this.f1623;
                        if (dArr2.length > 1) {
                            ((c.a) cVar2).m11698(view, f8, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f1623;
                c6 = 1;
                z5 |= aVar.m11701(view, cVar, f8, j5, dArr3[0], dArr3[1]);
            } else {
                c6 = 1;
            }
            int i6 = 1;
            while (true) {
                o.a[] aVarArr2 = this.f1617;
                if (i6 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i6].m10965(d6, this.f1625);
                s.a.m11694(this.f1613.f1718.get(this.f1624[i6 - 1]), view, this.f1625);
                i6++;
            }
            f fVar = this.f1615;
            if (fVar.f1610 == 0) {
                if (f8 <= 0.0f) {
                    view.setVisibility(fVar.f1611);
                } else if (f8 >= 1.0f) {
                    view.setVisibility(this.f1616.f1611);
                } else if (this.f1616.f1611 != fVar.f1611) {
                    view.setVisibility(0);
                }
            }
            if (this.f1630 != null) {
                int i7 = 0;
                while (true) {
                    e[] eVarArr = this.f1630;
                    if (i7 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i7].m1748(f8, view);
                    i7++;
                }
            }
        } else {
            c6 = 1;
            k kVar = this.f1613;
            float f9 = kVar.f1708;
            k kVar2 = this.f1614;
            float f10 = f9 + ((kVar2.f1708 - f9) * f8);
            float f11 = kVar.f1709;
            float f12 = f11 + ((kVar2.f1709 - f11) * f8);
            float f13 = kVar.f1710;
            float f14 = kVar2.f1710;
            float f15 = kVar.f1711;
            float f16 = kVar2.f1711;
            float f17 = f10 + 0.5f;
            int i8 = (int) f17;
            float f18 = f12 + 0.5f;
            int i9 = (int) f18;
            int i10 = (int) (f17 + ((f14 - f13) * f8) + f13);
            int i11 = (int) (f18 + ((f16 - f15) * f8) + f15);
            int i12 = i10 - i8;
            int i13 = i11 - i9;
            if (f14 != f13 || f16 != f15 || this.f1612) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                this.f1612 = false;
            }
            view.layout(i8, i9, i10, i11);
        }
        HashMap<String, s.b> hashMap4 = this.f1629;
        if (hashMap4 != null) {
            for (s.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f1623;
                    ((b.a) bVar).m11696(view, f8, dArr4[0], dArr4[c6]);
                } else {
                    bVar.mo11695(view, f8);
                }
            }
        }
        return z5;
    }
}
