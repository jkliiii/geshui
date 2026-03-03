package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    int f3991;

    /* renamed from: ʼ, reason: contains not printable characters */
    private c f3992;

    /* renamed from: ʽ, reason: contains not printable characters */
    i f3993;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f3994;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f3995;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f3996;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f3997;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f3998;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f3999;

    /* renamed from: ˋ, reason: contains not printable characters */
    int f4000;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f4001;

    /* renamed from: ˏ, reason: contains not printable characters */
    d f4002;

    /* renamed from: ˑ, reason: contains not printable characters */
    final a f4003;

    /* renamed from: י, reason: contains not printable characters */
    private final b f4004;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f4005;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int[] f4006;

    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        i f4007;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4008;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4009;

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f4010;

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f4011;

        a() {
            m4730();
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4008 + ", mCoordinate=" + this.f4009 + ", mLayoutFromEnd=" + this.f4010 + ", mValid=" + this.f4011 + '}';
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4726() {
            this.f4009 = this.f4010 ? this.f4007.mo5174() : this.f4007.mo5178();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m4727(View view, int i5) {
            if (this.f4010) {
                this.f4009 = this.f4007.mo5169(view) + this.f4007.m5180();
            } else {
                this.f4009 = this.f4007.mo5172(view);
            }
            this.f4008 = i5;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m4728(View view, int i5) {
            int m5180 = this.f4007.m5180();
            if (m5180 >= 0) {
                m4727(view, i5);
                return;
            }
            this.f4008 = i5;
            if (this.f4010) {
                int mo5174 = (this.f4007.mo5174() - m5180) - this.f4007.mo5169(view);
                this.f4009 = this.f4007.mo5174() - mo5174;
                if (mo5174 > 0) {
                    int mo5170 = this.f4009 - this.f4007.mo5170(view);
                    int mo5178 = this.f4007.mo5178();
                    int min = mo5170 - (mo5178 + Math.min(this.f4007.mo5172(view) - mo5178, 0));
                    if (min < 0) {
                        this.f4009 += Math.min(mo5174, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo5172 = this.f4007.mo5172(view);
            int mo51782 = mo5172 - this.f4007.mo5178();
            this.f4009 = mo5172;
            if (mo51782 > 0) {
                int mo51742 = (this.f4007.mo5174() - Math.min(0, (this.f4007.mo5174() - m5180) - this.f4007.mo5169(view))) - (mo5172 + this.f4007.mo5170(view));
                if (mo51742 < 0) {
                    this.f4009 -= Math.min(mo51782, -mo51742);
                }
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m4729(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.m4867() && qVar.m4865() >= 0 && qVar.m4865() < b0Var.m4766();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m4730() {
            this.f4008 = -1;
            this.f4009 = RecyclerView.UNDEFINED_DURATION;
            this.f4010 = false;
            this.f4011 = false;
        }
    }

    protected static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f4012;

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean f4013;

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean f4014;

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean f4015;

        protected b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4731() {
            this.f4012 = 0;
            this.f4013 = false;
            this.f4014 = false;
            this.f4015 = false;
        }
    }

    static class c {

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4017;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4018;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4019;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4020;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f4021;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f4022;

        /* renamed from: ˎ, reason: contains not printable characters */
        int f4026;

        /* renamed from: ˑ, reason: contains not printable characters */
        boolean f4028;

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f4016 = true;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f4023 = 0;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f4024 = 0;

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean f4025 = false;

        /* renamed from: ˏ, reason: contains not printable characters */
        List<RecyclerView.f0> f4027 = null;

        c() {
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private View m4732() {
            int size = this.f4027.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = this.f4027.get(i5).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.m4867() && this.f4019 == qVar.m4865()) {
                    m4734(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m4733() {
            m4734(null);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m4734(View view) {
            View m4737 = m4737(view);
            if (m4737 == null) {
                this.f4019 = -1;
            } else {
                this.f4019 = ((RecyclerView.q) m4737.getLayoutParams()).m4865();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean m4735(RecyclerView.b0 b0Var) {
            int i5 = this.f4019;
            return i5 >= 0 && i5 < b0Var.m4766();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        View m4736(RecyclerView.w wVar) {
            if (this.f4027 != null) {
                return m4732();
            }
            View m4922 = wVar.m4922(this.f4019);
            this.f4019 += this.f4020;
            return m4922;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public View m4737(View view) {
            int m4865;
            int size = this.f4027.size();
            View view2 = null;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < size; i6++) {
                View view3 = this.f4027.get(i6).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.m4867() && (m4865 = (qVar.m4865() - this.f4019) * this.f4020) >= 0 && m4865 < i5) {
                    view2 = view3;
                    if (m4865 == 0) {
                        break;
                    }
                    i5 = m4865;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4029;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4030;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f4031;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public d[] newArray(int i5) {
                return new d[i5];
            }
        }

        public d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f4029);
            parcel.writeInt(this.f4030);
            parcel.writeInt(this.f4031 ? 1 : 0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m4738() {
            return this.f4029 >= 0;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m4739() {
            this.f4029 = -1;
        }

        d(Parcel parcel) {
            this.f4029 = parcel.readInt();
            this.f4030 = parcel.readInt();
            this.f4031 = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.f4029 = dVar.f4029;
            this.f4030 = dVar.f4030;
            this.f4031 = dVar.f4031;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m4685(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5, int i6) {
        if (!b0Var.m4771() || getChildCount() == 0 || b0Var.m4769() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.f0> m4914 = wVar.m4914();
        int size = m4914.size();
        int position = getPosition(getChildAt(0));
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.f0 f0Var = m4914.get(i9);
            if (!f0Var.isRemoved()) {
                if (((f0Var.getLayoutPosition() < position) != this.f3996 ? (char) 65535 : (char) 1) == 65535) {
                    i7 += this.f3993.mo5170(f0Var.itemView);
                } else {
                    i8 += this.f3993.mo5170(f0Var.itemView);
                }
            }
        }
        this.f3992.f4027 = m4914;
        if (i7 > 0) {
            m4703(getPosition(m4709()), i5);
            c cVar = this.f3992;
            cVar.f4023 = i7;
            cVar.f4018 = 0;
            cVar.m4733();
            m4716(wVar, this.f3992, b0Var, false);
        }
        if (i8 > 0) {
            m4704(getPosition(m4708()), i6);
            c cVar2 = this.f3992;
            cVar2.f4023 = i8;
            cVar2.f4018 = 0;
            cVar2.m4733();
            m4716(wVar, this.f3992, b0Var, false);
        }
        this.f3992.f4027 = null;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private void m4686(RecyclerView.w wVar, c cVar) {
        if (!cVar.f4016 || cVar.f4028) {
            return;
        }
        int i5 = cVar.f4022;
        int i6 = cVar.f4024;
        if (cVar.f4021 == -1) {
            m4689(wVar, i5, i6);
        } else {
            m4700(wVar, i5, i6);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m4687(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        m4715();
        return l.m5194(b0Var, this.f3993, m4718(!this.f3998, true), m4717(!this.f3998, true), this, this.f3998);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private int m4688(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        m4715();
        return l.m5195(b0Var, this.f3993, m4718(!this.f3998, true), m4717(!this.f3998, true), this, this.f3998, this.f3996);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m4689(RecyclerView.w wVar, int i5, int i6) {
        int childCount = getChildCount();
        if (i5 < 0) {
            return;
        }
        int mo5173 = (this.f3993.mo5173() - i5) + i6;
        if (this.f3996) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (this.f3993.mo5172(childAt) < mo5173 || this.f3993.mo5182(childAt) < mo5173) {
                    m4691(wVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            if (this.f3993.mo5172(childAt2) < mo5173 || this.f3993.mo5182(childAt2) < mo5173) {
                m4691(wVar, i8, i9);
                return;
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m4690(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        m4715();
        return l.m5196(b0Var, this.f3993, m4718(!this.f3998, true), m4717(!this.f3998, true), this, this.f3998);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m4691(RecyclerView.w wVar, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        if (i6 <= i5) {
            while (i5 > i6) {
                removeAndRecycleViewAt(i5, wVar);
                i5--;
            }
        } else {
            for (int i7 = i6 - 1; i7 >= i5; i7--) {
                removeAndRecycleViewAt(i7, wVar);
            }
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m4692() {
        if (this.f3991 == 1 || !m4725()) {
            this.f3996 = this.f3995;
        } else {
            this.f3996 = !this.f3995;
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private boolean m4693(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View mo4674;
        boolean z5 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.m4729(focusedChild, b0Var)) {
            aVar.m4728(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z6 = this.f3994;
        boolean z7 = this.f3997;
        if (z6 != z7 || (mo4674 = mo4674(wVar, b0Var, aVar.f4010, z7)) == null) {
            return false;
        }
        aVar.m4727(mo4674, getPosition(mo4674));
        if (!b0Var.m4769() && supportsPredictiveItemAnimations()) {
            int mo5172 = this.f3993.mo5172(mo4674);
            int mo5169 = this.f3993.mo5169(mo4674);
            int mo5178 = this.f3993.mo5178();
            int mo5174 = this.f3993.mo5174();
            boolean z8 = mo5169 <= mo5178 && mo5172 < mo5178;
            if (mo5172 >= mo5174 && mo5169 > mo5174) {
                z5 = true;
            }
            if (z8 || z5) {
                if (aVar.f4010) {
                    mo5178 = mo5174;
                }
                aVar.f4009 = mo5178;
            }
        }
        return true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private View m4694() {
        return m4721(0, getChildCount());
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m4695(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (m4696(b0Var, aVar) || m4693(wVar, b0Var, aVar)) {
            return;
        }
        aVar.m4726();
        aVar.f4008 = this.f3997 ? b0Var.m4766() - 1 : 0;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private boolean m4696(RecyclerView.b0 b0Var, a aVar) {
        int i5;
        if (!b0Var.m4769() && (i5 = this.f3999) != -1) {
            if (i5 >= 0 && i5 < b0Var.m4766()) {
                aVar.f4008 = this.f3999;
                d dVar = this.f4002;
                if (dVar != null && dVar.m4738()) {
                    boolean z5 = this.f4002.f4031;
                    aVar.f4010 = z5;
                    if (z5) {
                        aVar.f4009 = this.f3993.mo5174() - this.f4002.f4030;
                    } else {
                        aVar.f4009 = this.f3993.mo5178() + this.f4002.f4030;
                    }
                    return true;
                }
                if (this.f4000 != Integer.MIN_VALUE) {
                    boolean z6 = this.f3996;
                    aVar.f4010 = z6;
                    if (z6) {
                        aVar.f4009 = this.f3993.mo5174() - this.f4000;
                    } else {
                        aVar.f4009 = this.f3993.mo5178() + this.f4000;
                    }
                    return true;
                }
                View findViewByPosition = findViewByPosition(this.f3999);
                if (findViewByPosition == null) {
                    if (getChildCount() > 0) {
                        aVar.f4010 = (this.f3999 < getPosition(getChildAt(0))) == this.f3996;
                    }
                    aVar.m4726();
                } else {
                    if (this.f3993.mo5170(findViewByPosition) > this.f3993.mo5179()) {
                        aVar.m4726();
                        return true;
                    }
                    if (this.f3993.mo5172(findViewByPosition) - this.f3993.mo5178() < 0) {
                        aVar.f4009 = this.f3993.mo5178();
                        aVar.f4010 = false;
                        return true;
                    }
                    if (this.f3993.mo5174() - this.f3993.mo5169(findViewByPosition) < 0) {
                        aVar.f4009 = this.f3993.mo5174();
                        aVar.f4010 = true;
                        return true;
                    }
                    aVar.f4009 = aVar.f4010 ? this.f3993.mo5169(findViewByPosition) + this.f3993.m5180() : this.f3993.mo5172(findViewByPosition);
                }
                return true;
            }
            this.f3999 = -1;
            this.f4000 = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private void m4697(int i5, int i6, boolean z5, RecyclerView.b0 b0Var) {
        int mo5178;
        this.f3992.f4028 = m4712();
        this.f3992.f4021 = i5;
        int[] iArr = this.f4006;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4710(b0Var, iArr);
        int max = Math.max(0, this.f4006[0]);
        int max2 = Math.max(0, this.f4006[1]);
        boolean z6 = i5 == 1;
        c cVar = this.f3992;
        int i7 = z6 ? max2 : max;
        cVar.f4023 = i7;
        if (!z6) {
            max = max2;
        }
        cVar.f4024 = max;
        if (z6) {
            cVar.f4023 = i7 + this.f3993.mo5175();
            View m4708 = m4708();
            c cVar2 = this.f3992;
            cVar2.f4020 = this.f3996 ? -1 : 1;
            int position = getPosition(m4708);
            c cVar3 = this.f3992;
            cVar2.f4019 = position + cVar3.f4020;
            cVar3.f4017 = this.f3993.mo5169(m4708);
            mo5178 = this.f3993.mo5169(m4708) - this.f3993.mo5174();
        } else {
            View m4709 = m4709();
            this.f3992.f4023 += this.f3993.mo5178();
            c cVar4 = this.f3992;
            cVar4.f4020 = this.f3996 ? 1 : -1;
            int position2 = getPosition(m4709);
            c cVar5 = this.f3992;
            cVar4.f4019 = position2 + cVar5.f4020;
            cVar5.f4017 = this.f3993.mo5172(m4709);
            mo5178 = (-this.f3993.mo5172(m4709)) + this.f3993.mo5178();
        }
        c cVar6 = this.f3992;
        cVar6.f4018 = i6;
        if (z5) {
            cVar6.f4018 = i6 - mo5178;
        }
        cVar6.f4022 = mo5178;
    }

    /* renamed from: י, reason: contains not printable characters */
    private View m4698() {
        return m4721(getChildCount() - 1, -1);
    }

    /* renamed from: יי, reason: contains not printable characters */
    private void m4699(a aVar) {
        m4704(aVar.f4008, aVar.f4009);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m4700(RecyclerView.w wVar, int i5, int i6) {
        if (i5 < 0) {
            return;
        }
        int i7 = i5 - i6;
        int childCount = getChildCount();
        if (!this.f3996) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (this.f3993.mo5169(childAt) > i7 || this.f3993.mo5181(childAt) > i7) {
                    m4691(wVar, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = childCount - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            if (this.f3993.mo5169(childAt2) > i7 || this.f3993.mo5181(childAt2) > i7) {
                m4691(wVar, i9, i10);
                return;
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private View m4701() {
        return this.f3996 ? m4694() : m4698();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private View m4702() {
        return this.f3996 ? m4698() : m4694();
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private void m4703(int i5, int i6) {
        this.f3992.f4018 = i6 - this.f3993.mo5178();
        c cVar = this.f3992;
        cVar.f4019 = i5;
        cVar.f4020 = this.f3996 ? 1 : -1;
        cVar.f4021 = -1;
        cVar.f4017 = i6;
        cVar.f4022 = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m4704(int i5, int i6) {
        this.f3992.f4018 = this.f3993.mo5174() - i6;
        c cVar = this.f3992;
        cVar.f4020 = this.f3996 ? -1 : 1;
        cVar.f4019 = i5;
        cVar.f4021 = 1;
        cVar.f4017 = i6;
        cVar.f4022 = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int m4705(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z5) {
        int mo5174;
        int mo51742 = this.f3993.mo5174() - i5;
        if (mo51742 <= 0) {
            return 0;
        }
        int i6 = -scrollBy(-mo51742, wVar, b0Var);
        int i7 = i5 + i6;
        if (!z5 || (mo5174 = this.f3993.mo5174() - i7) <= 0) {
            return i6;
        }
        this.f3993.mo5183(mo5174);
        return mo5174 + i6;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private void m4706(a aVar) {
        m4703(aVar.f4008, aVar.f4009);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m4707(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z5) {
        int mo5178;
        int mo51782 = i5 - this.f3993.mo5178();
        if (mo51782 <= 0) {
            return 0;
        }
        int i6 = -scrollBy(mo51782, wVar, b0Var);
        int i7 = i5 + i6;
        if (!z5 || (mo5178 = i7 - this.f3993.mo5178()) <= 0) {
            return i6;
        }
        this.f3993.mo5183(-mo5178);
        return i6 - mo5178;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private View m4708() {
        return getChildAt(this.f3996 ? 0 : getChildCount() - 1);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private View m4709() {
        return getChildAt(this.f3996 ? getChildCount() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f4002 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f3991 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f3991 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i5, int i6, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.f3991 != 0) {
            i5 = i6;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        m4715();
        m4697(i5 > 0 ? 1 : -1, Math.abs(i5), true, b0Var);
        mo4670(b0Var, this.f3992, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i5, RecyclerView.p.c cVar) {
        boolean z5;
        int i6;
        d dVar = this.f4002;
        if (dVar == null || !dVar.m4738()) {
            m4692();
            z5 = this.f3996;
            i6 = this.f3999;
            if (i6 == -1) {
                i6 = z5 ? i5 - 1 : 0;
            }
        } else {
            d dVar2 = this.f4002;
            z5 = dVar2.f4031;
            i6 = dVar2.f4029;
        }
        int i7 = z5 ? -1 : 1;
        for (int i8 = 0; i8 < this.f4005 && i6 >= 0 && i6 < i5; i8++) {
            cVar.mo4864(i6, 0);
            i6 += i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return m4687(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return m4688(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return m4690(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i5) {
        if (getChildCount() == 0) {
            return null;
        }
        int i6 = (i5 < getPosition(getChildAt(0))) != this.f3996 ? -1 : 1;
        return this.f3991 == 0 ? new PointF(i6, 0.0f) : new PointF(0.0f, i6);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return m4687(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return m4688(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return m4690(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i5) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i5 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i5) {
                return childAt;
            }
        }
        return super.findViewByPosition(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    public int getOrientation() {
        return this.f3991;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.f4001) {
            removeAndRecycleAllViews(wVar);
            wVar.m4899();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int m4711;
        m4692();
        if (getChildCount() == 0 || (m4711 = m4711(i5)) == Integer.MIN_VALUE) {
            return null;
        }
        m4715();
        m4697(m4711, (int) (this.f3993.mo5179() * 0.33333334f), false, b0Var);
        c cVar = this.f3992;
        cVar.f4022 = RecyclerView.UNDEFINED_DURATION;
        cVar.f4016 = false;
        m4716(wVar, cVar, b0Var, true);
        View m4702 = m4711 == -1 ? m4702() : m4701();
        View m4709 = m4711 == -1 ? m4709() : m4708();
        if (!m4709.hasFocusable()) {
            return m4702;
        }
        if (m4702 == null) {
            return null;
        }
        return m4709;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(m4719());
            accessibilityEvent.setToIndex(m4720());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i5;
        int i6;
        int i7;
        int i8;
        int m4705;
        int i9;
        View findViewByPosition;
        int mo5172;
        int i10;
        int i11 = -1;
        if (!(this.f4002 == null && this.f3999 == -1) && b0Var.m4766() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        d dVar = this.f4002;
        if (dVar != null && dVar.m4738()) {
            this.f3999 = this.f4002.f4029;
        }
        m4715();
        this.f3992.f4016 = false;
        m4692();
        View focusedChild = getFocusedChild();
        a aVar = this.f4003;
        if (!aVar.f4011 || this.f3999 != -1 || this.f4002 != null) {
            aVar.m4730();
            a aVar2 = this.f4003;
            aVar2.f4010 = this.f3996 ^ this.f3997;
            m4695(wVar, b0Var, aVar2);
            this.f4003.f4011 = true;
        } else if (focusedChild != null && (this.f3993.mo5172(focusedChild) >= this.f3993.mo5174() || this.f3993.mo5169(focusedChild) <= this.f3993.mo5178())) {
            this.f4003.m4728(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.f3992;
        cVar.f4021 = cVar.f4026 >= 0 ? 1 : -1;
        int[] iArr = this.f4006;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4710(b0Var, iArr);
        int max = Math.max(0, this.f4006[0]) + this.f3993.mo5178();
        int max2 = Math.max(0, this.f4006[1]) + this.f3993.mo5175();
        if (b0Var.m4769() && (i9 = this.f3999) != -1 && this.f4000 != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i9)) != null) {
            if (this.f3996) {
                i10 = this.f3993.mo5174() - this.f3993.mo5169(findViewByPosition);
                mo5172 = this.f4000;
            } else {
                mo5172 = this.f3993.mo5172(findViewByPosition) - this.f3993.mo5178();
                i10 = this.f4000;
            }
            int i12 = i10 - mo5172;
            if (i12 > 0) {
                max += i12;
            } else {
                max2 -= i12;
            }
        }
        a aVar3 = this.f4003;
        if (!aVar3.f4010 ? !this.f3996 : this.f3996) {
            i11 = 1;
        }
        mo4671(wVar, b0Var, aVar3, i11);
        detachAndScrapAttachedViews(wVar);
        this.f3992.f4028 = m4712();
        this.f3992.f4025 = b0Var.m4769();
        this.f3992.f4024 = 0;
        a aVar4 = this.f4003;
        if (aVar4.f4010) {
            m4706(aVar4);
            c cVar2 = this.f3992;
            cVar2.f4023 = max;
            m4716(wVar, cVar2, b0Var, false);
            c cVar3 = this.f3992;
            i6 = cVar3.f4017;
            int i13 = cVar3.f4019;
            int i14 = cVar3.f4018;
            if (i14 > 0) {
                max2 += i14;
            }
            m4699(this.f4003);
            c cVar4 = this.f3992;
            cVar4.f4023 = max2;
            cVar4.f4019 += cVar4.f4020;
            m4716(wVar, cVar4, b0Var, false);
            c cVar5 = this.f3992;
            i5 = cVar5.f4017;
            int i15 = cVar5.f4018;
            if (i15 > 0) {
                m4703(i13, i6);
                c cVar6 = this.f3992;
                cVar6.f4023 = i15;
                m4716(wVar, cVar6, b0Var, false);
                i6 = this.f3992.f4017;
            }
        } else {
            m4699(aVar4);
            c cVar7 = this.f3992;
            cVar7.f4023 = max2;
            m4716(wVar, cVar7, b0Var, false);
            c cVar8 = this.f3992;
            i5 = cVar8.f4017;
            int i16 = cVar8.f4019;
            int i17 = cVar8.f4018;
            if (i17 > 0) {
                max += i17;
            }
            m4706(this.f4003);
            c cVar9 = this.f3992;
            cVar9.f4023 = max;
            cVar9.f4019 += cVar9.f4020;
            m4716(wVar, cVar9, b0Var, false);
            c cVar10 = this.f3992;
            i6 = cVar10.f4017;
            int i18 = cVar10.f4018;
            if (i18 > 0) {
                m4704(i16, i5);
                c cVar11 = this.f3992;
                cVar11.f4023 = i18;
                m4716(wVar, cVar11, b0Var, false);
                i5 = this.f3992.f4017;
            }
        }
        if (getChildCount() > 0) {
            if (this.f3996 ^ this.f3997) {
                int m47052 = m4705(i5, wVar, b0Var, true);
                i7 = i6 + m47052;
                i8 = i5 + m47052;
                m4705 = m4707(i7, wVar, b0Var, false);
            } else {
                int m4707 = m4707(i6, wVar, b0Var, true);
                i7 = i6 + m4707;
                i8 = i5 + m4707;
                m4705 = m4705(i8, wVar, b0Var, false);
            }
            i6 = i7 + m4705;
            i5 = i8 + m4705;
        }
        m4685(wVar, b0Var, i6, i5);
        if (b0Var.m4769()) {
            this.f4003.m4730();
        } else {
            this.f3993.m5184();
        }
        this.f3994 = this.f3997;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f4002 = null;
        this.f3999 = -1;
        this.f4000 = RecyclerView.UNDEFINED_DURATION;
        this.f4003.m4730();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f4002 = dVar;
            if (this.f3999 != -1) {
                dVar.m4739();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        if (this.f4002 != null) {
            return new d(this.f4002);
        }
        d dVar = new d();
        if (getChildCount() > 0) {
            m4715();
            boolean z5 = this.f3994 ^ this.f3996;
            dVar.f4031 = z5;
            if (z5) {
                View m4708 = m4708();
                dVar.f4030 = this.f3993.mo5174() - this.f3993.mo5169(m4708);
                dVar.f4029 = getPosition(m4708);
            } else {
                View m4709 = m4709();
                dVar.f4029 = getPosition(m4709);
                dVar.f4030 = this.f3993.mo5172(m4709) - this.f3993.mo5178();
            }
        } else {
            dVar.m4739();
        }
        return dVar;
    }

    int scrollBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        m4715();
        this.f3992.f4016 = true;
        int i6 = i5 > 0 ? 1 : -1;
        int abs = Math.abs(i5);
        m4697(i6, abs, true, b0Var);
        c cVar = this.f3992;
        int m4716 = cVar.f4022 + m4716(wVar, cVar, b0Var, false);
        if (m4716 < 0) {
            return 0;
        }
        if (abs > m4716) {
            i5 = i6 * m4716;
        }
        this.f3993.mo5183(-i5);
        this.f3992.f4026 = i5;
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3991 == 1) {
            return 0;
        }
        return scrollBy(i5, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i5) {
        this.f3999 = i5;
        this.f4000 = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.f4002;
        if (dVar != null) {
            dVar.m4739();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3991 == 0) {
            return 0;
        }
        return scrollBy(i5, wVar, b0Var);
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i5);
        }
        assertNotInLayoutOrScroll(null);
        if (i5 != this.f3991 || this.f3993 == null) {
            i m5167 = i.m5167(this, i5);
            this.f3993 = m5167;
            this.f4003.f4007 = m5167;
            this.f3991 = i5;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i5) {
        g gVar = new g(recyclerView.getContext());
        gVar.m4757(i5);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f4002 == null && this.f3994 == this.f3997;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected void mo4710(RecyclerView.b0 b0Var, int[] iArr) {
        int i5;
        int m4724 = m4724(b0Var);
        if (this.f3992.f4021 == -1) {
            i5 = 0;
        } else {
            i5 = m4724;
            m4724 = 0;
        }
        iArr[0] = m4724;
        iArr[1] = i5;
    }

    /* renamed from: ʼ */
    void mo4670(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i5 = cVar.f4019;
        if (i5 < 0 || i5 >= b0Var.m4766()) {
            return;
        }
        cVar2.mo4864(i5, Math.max(0, cVar.f4022));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m4711(int i5) {
        if (i5 == 1) {
            return (this.f3991 != 1 && m4725()) ? 1 : -1;
        }
        if (i5 == 2) {
            return (this.f3991 != 1 && m4725()) ? -1 : 1;
        }
        if (i5 == 17) {
            if (this.f3991 == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 == 33) {
            if (this.f3991 == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 == 66) {
            if (this.f3991 == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 != 130) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (this.f3991 == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    boolean m4712() {
        return this.f3993.mo5176() == 0 && this.f3993.mo5173() == 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    c m4713() {
        return new c();
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public void m4714(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (z5 == this.f3995) {
            return;
        }
        this.f3995 = z5;
        requestLayout();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m4715() {
        if (this.f3992 == null) {
            this.f3992 = m4713();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    int m4716(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z5) {
        int i5 = cVar.f4018;
        int i6 = cVar.f4022;
        if (i6 != Integer.MIN_VALUE) {
            if (i5 < 0) {
                cVar.f4022 = i6 + i5;
            }
            m4686(wVar, cVar);
        }
        int i7 = cVar.f4018 + cVar.f4023;
        b bVar = this.f4004;
        while (true) {
            if ((!cVar.f4028 && i7 <= 0) || !cVar.m4735(b0Var)) {
                break;
            }
            bVar.m4731();
            mo4673(wVar, b0Var, cVar, bVar);
            if (!bVar.f4013) {
                cVar.f4017 += bVar.f4012 * cVar.f4021;
                if (!bVar.f4014 || cVar.f4027 != null || !b0Var.m4769()) {
                    int i8 = cVar.f4018;
                    int i9 = bVar.f4012;
                    cVar.f4018 = i8 - i9;
                    i7 -= i9;
                }
                int i10 = cVar.f4022;
                if (i10 != Integer.MIN_VALUE) {
                    int i11 = i10 + bVar.f4012;
                    cVar.f4022 = i11;
                    int i12 = cVar.f4018;
                    if (i12 < 0) {
                        cVar.f4022 = i11 + i12;
                    }
                    m4686(wVar, cVar);
                }
                if (z5 && bVar.f4015) {
                    break;
                }
            } else {
                break;
            }
        }
        return i5 - cVar.f4018;
    }

    /* renamed from: ˋˋ */
    public void mo4672(boolean z5) {
        assertNotInLayoutOrScroll(null);
        if (this.f3997 == z5) {
            return;
        }
        this.f3997 = z5;
        requestLayout();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    View m4717(boolean z5, boolean z6) {
        return this.f3996 ? m4722(0, getChildCount(), z5, z6) : m4722(getChildCount() - 1, -1, z5, z6);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    View m4718(boolean z5, boolean z6) {
        return this.f3996 ? m4722(getChildCount() - 1, -1, z5, z6) : m4722(0, getChildCount(), z5, z6);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m4719() {
        View m4722 = m4722(0, getChildCount(), false, true);
        if (m4722 == null) {
            return -1;
        }
        return getPosition(m4722);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public int m4720() {
        View m4722 = m4722(getChildCount() - 1, -1, false, true);
        if (m4722 == null) {
            return -1;
        }
        return getPosition(m4722);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    View m4721(int i5, int i6) {
        int i7;
        int i8;
        m4715();
        if ((i6 > i5 ? (char) 1 : i6 < i5 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i5);
        }
        if (this.f3993.mo5172(getChildAt(i5)) < this.f3993.mo5178()) {
            i7 = 16644;
            i8 = 16388;
        } else {
            i7 = 4161;
            i8 = 4097;
        }
        return this.f3991 == 0 ? this.mHorizontalBoundCheck.m5213(i5, i6, i7, i8) : this.mVerticalBoundCheck.m5213(i5, i6, i7, i8);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    View m4722(int i5, int i6, boolean z5, boolean z6) {
        m4715();
        int i7 = z5 ? 24579 : 320;
        int i8 = z6 ? 320 : 0;
        return this.f3991 == 0 ? this.mHorizontalBoundCheck.m5213(i5, i6, i7, i8) : this.mVerticalBoundCheck.m5213(i5, i6, i7, i8);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public boolean m4723() {
        return this.f3998;
    }

    /* renamed from: ᴵᴵ */
    void mo4673(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mo5171;
        View m4736 = cVar.m4736(wVar);
        if (m4736 == null) {
            bVar.f4013 = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) m4736.getLayoutParams();
        if (cVar.f4027 == null) {
            if (this.f3996 == (cVar.f4021 == -1)) {
                addView(m4736);
            } else {
                addView(m4736, 0);
            }
        } else {
            if (this.f3996 == (cVar.f4021 == -1)) {
                addDisappearingView(m4736);
            } else {
                addDisappearingView(m4736, 0);
            }
        }
        measureChildWithMargins(m4736, 0, 0);
        bVar.f4012 = this.f3993.mo5170(m4736);
        if (this.f3991 == 1) {
            if (m4725()) {
                mo5171 = getWidth() - getPaddingRight();
                i8 = mo5171 - this.f3993.mo5171(m4736);
            } else {
                i8 = getPaddingLeft();
                mo5171 = this.f3993.mo5171(m4736) + i8;
            }
            if (cVar.f4021 == -1) {
                int i9 = cVar.f4017;
                i7 = i9;
                i6 = mo5171;
                i5 = i9 - bVar.f4012;
            } else {
                int i10 = cVar.f4017;
                i5 = i10;
                i6 = mo5171;
                i7 = bVar.f4012 + i10;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo51712 = this.f3993.mo5171(m4736) + paddingTop;
            if (cVar.f4021 == -1) {
                int i11 = cVar.f4017;
                i6 = i11;
                i5 = paddingTop;
                i7 = mo51712;
                i8 = i11 - bVar.f4012;
            } else {
                int i12 = cVar.f4017;
                i5 = paddingTop;
                i6 = bVar.f4012 + i12;
                i7 = mo51712;
                i8 = i12;
            }
        }
        layoutDecoratedWithMargins(m4736, i8, i5, i6, i7);
        if (qVar.m4867() || qVar.m4866()) {
            bVar.f4014 = true;
        }
        bVar.f4015 = m4736.hasFocusable();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* renamed from: ᵔ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View mo4674(androidx.recyclerview.widget.RecyclerView.w r17, androidx.recyclerview.widget.RecyclerView.b0 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.m4715()
            int r1 = r16.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r16.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = -1
            goto L18
        L15:
            r4 = r1
            r1 = 0
            r5 = 1
        L18:
            int r6 = r18.m4766()
            androidx.recyclerview.widget.i r7 = r0.f3993
            int r7 = r7.mo5178()
            androidx.recyclerview.widget.i r8 = r0.f3993
            int r8 = r8.mo5174()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.i r14 = r0.f3993
            int r14 = r14.mo5172(r12)
            androidx.recyclerview.widget.i r15 = r0.f3993
            int r15 = r15.mo5169(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$q r13 = (androidx.recyclerview.widget.RecyclerView.q) r13
            boolean r13 = r13.m4867()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = 1
            goto L5c
        L5b:
            r13 = 0
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = 1
            goto L63
        L62:
            r14 = 0
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo4674(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean, boolean):android.view.View");
    }

    @Deprecated
    /* renamed from: ﾞ, reason: contains not printable characters */
    protected int m4724(RecyclerView.b0 b0Var) {
        if (b0Var.m4768()) {
            return this.f3993.mo5179();
        }
        return 0;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    protected boolean m4725() {
        return getLayoutDirection() == 1;
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i5, boolean z5) {
        this.f3991 = 1;
        this.f3995 = false;
        this.f3996 = false;
        this.f3997 = false;
        this.f3998 = true;
        this.f3999 = -1;
        this.f4000 = RecyclerView.UNDEFINED_DURATION;
        this.f4002 = null;
        this.f4003 = new a();
        this.f4004 = new b();
        this.f4005 = 2;
        this.f4006 = new int[2];
        setOrientation(i5);
        m4714(z5);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f3991 = 1;
        this.f3995 = false;
        this.f3996 = false;
        this.f3997 = false;
        this.f3998 = true;
        this.f3999 = -1;
        this.f4000 = RecyclerView.UNDEFINED_DURATION;
        this.f4002 = null;
        this.f4003 = new a();
        this.f4004 = new b();
        this.f4005 = 2;
        this.f4006 = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i5, i6);
        setOrientation(properties.f4097);
        m4714(properties.f4099);
        mo4672(properties.f4100);
    }

    /* renamed from: ʽʽ */
    void mo4671(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i5) {
    }
}
