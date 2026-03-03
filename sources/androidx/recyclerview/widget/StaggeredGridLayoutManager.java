package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {

    /* renamed from: ʼ, reason: contains not printable characters */
    f[] f4123;

    /* renamed from: ʽ, reason: contains not printable characters */
    i f4124;

    /* renamed from: ʾ, reason: contains not printable characters */
    i f4125;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f4126;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f4127;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final androidx.recyclerview.widget.f f4128;

    /* renamed from: ˋ, reason: contains not printable characters */
    private BitSet f4131;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f4136;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f4137;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private e f4138;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f4139;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int[] f4144;

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f4122 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean f4129 = false;

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean f4130 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    int f4132 = -1;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f4133 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ˑ, reason: contains not printable characters */
    d f4134 = new d();

    /* renamed from: י, reason: contains not printable characters */
    private int f4135 = 2;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final Rect f4140 = new Rect();

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final b f4141 = new b();

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f4142 = false;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f4143 = true;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private final Runnable f4145 = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m4986();
        }
    }

    class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4147;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4148;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f4149;

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f4150;

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f4151;

        /* renamed from: ˆ, reason: contains not printable characters */
        int[] f4152;

        b() {
            m4998();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m4996() {
            this.f4148 = this.f4149 ? StaggeredGridLayoutManager.this.f4124.mo5174() : StaggeredGridLayoutManager.this.f4124.mo5178();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m4997(int i5) {
            if (this.f4149) {
                this.f4148 = StaggeredGridLayoutManager.this.f4124.mo5174() - i5;
            } else {
                this.f4148 = StaggeredGridLayoutManager.this.f4124.mo5178() + i5;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m4998() {
            this.f4147 = -1;
            this.f4148 = RecyclerView.UNDEFINED_DURATION;
            this.f4149 = false;
            this.f4150 = false;
            this.f4151 = false;
            int[] iArr = this.f4152;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4999(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4152;
            if (iArr == null || iArr.length < length) {
                this.f4152 = new int[StaggeredGridLayoutManager.this.f4123.length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                this.f4152[i5] = fVarArr[i5].m5038(RecyclerView.UNDEFINED_DURATION);
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: ʿ, reason: contains not printable characters */
        f f4154;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f4155;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean m5000() {
            return this.f4155;
        }

        public c(int i5, int i6) {
            super(i5, i6);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4162;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4163;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f4164;

        /* renamed from: ˈ, reason: contains not printable characters */
        int[] f4165;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f4166;

        /* renamed from: ˊ, reason: contains not printable characters */
        int[] f4167;

        /* renamed from: ˋ, reason: contains not printable characters */
        List<d.a> f4168;

        /* renamed from: ˎ, reason: contains not printable characters */
        boolean f4169;

        /* renamed from: ˏ, reason: contains not printable characters */
        boolean f4170;

        /* renamed from: ˑ, reason: contains not printable characters */
        boolean f4171;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public e[] newArray(int i5) {
                return new e[i5];
            }
        }

        public e() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f4162);
            parcel.writeInt(this.f4163);
            parcel.writeInt(this.f4164);
            if (this.f4164 > 0) {
                parcel.writeIntArray(this.f4165);
            }
            parcel.writeInt(this.f4166);
            if (this.f4166 > 0) {
                parcel.writeIntArray(this.f4167);
            }
            parcel.writeInt(this.f4169 ? 1 : 0);
            parcel.writeInt(this.f4170 ? 1 : 0);
            parcel.writeInt(this.f4171 ? 1 : 0);
            parcel.writeList(this.f4168);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5019() {
            this.f4165 = null;
            this.f4164 = 0;
            this.f4162 = -1;
            this.f4163 = -1;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5020() {
            this.f4165 = null;
            this.f4164 = 0;
            this.f4166 = 0;
            this.f4167 = null;
            this.f4168 = null;
        }

        e(Parcel parcel) {
            this.f4162 = parcel.readInt();
            this.f4163 = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4164 = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4165 = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4166 = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4167 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4169 = parcel.readInt() == 1;
            this.f4170 = parcel.readInt() == 1;
            this.f4171 = parcel.readInt() == 1;
            this.f4168 = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4164 = eVar.f4164;
            this.f4162 = eVar.f4162;
            this.f4163 = eVar.f4163;
            this.f4165 = eVar.f4165;
            this.f4166 = eVar.f4166;
            this.f4167 = eVar.f4167;
            this.f4169 = eVar.f4169;
            this.f4170 = eVar.f4170;
            this.f4171 = eVar.f4171;
            this.f4168 = eVar.f4168;
        }
    }

    class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        ArrayList<View> f4172 = new ArrayList<>();

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4173 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4174 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4175 = 0;

        /* renamed from: ʿ, reason: contains not printable characters */
        final int f4176;

        f(int i5) {
            this.f4176 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5023(View view) {
            c m5036 = m5036(view);
            m5036.f4154 = this;
            this.f4172.add(view);
            this.f4174 = RecyclerView.UNDEFINED_DURATION;
            if (this.f4172.size() == 1) {
                this.f4173 = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5036.m4867() || m5036.m4866()) {
                this.f4175 += StaggeredGridLayoutManager.this.f4124.mo5170(view);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5024(boolean z5, int i5) {
            int m5034 = z5 ? m5034(RecyclerView.UNDEFINED_DURATION) : m5038(RecyclerView.UNDEFINED_DURATION);
            m5027();
            if (m5034 == Integer.MIN_VALUE) {
                return;
            }
            if (!z5 || m5034 >= StaggeredGridLayoutManager.this.f4124.mo5174()) {
                if (z5 || m5034 <= StaggeredGridLayoutManager.this.f4124.mo5178()) {
                    if (i5 != Integer.MIN_VALUE) {
                        m5034 += i5;
                    }
                    this.f4174 = m5034;
                    this.f4173 = m5034;
                }
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m5025() {
            d.a m5009;
            ArrayList<View> arrayList = this.f4172;
            View view = arrayList.get(arrayList.size() - 1);
            c m5036 = m5036(view);
            this.f4174 = StaggeredGridLayoutManager.this.f4124.mo5169(view);
            if (m5036.f4155 && (m5009 = StaggeredGridLayoutManager.this.f4134.m5009(m5036.m4865())) != null && m5009.f4159 == 1) {
                this.f4174 += m5009.m5016(this.f4176);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m5026() {
            d.a m5009;
            View view = this.f4172.get(0);
            c m5036 = m5036(view);
            this.f4173 = StaggeredGridLayoutManager.this.f4124.mo5172(view);
            if (m5036.f4155 && (m5009 = StaggeredGridLayoutManager.this.f4134.m5009(m5036.m4865())) != null && m5009.f4159 == -1) {
                this.f4173 -= m5009.m5016(this.f4176);
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m5027() {
            this.f4172.clear();
            m5039();
            this.f4175 = 0;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m5028() {
            return StaggeredGridLayoutManager.this.f4129 ? m5031(this.f4172.size() - 1, -1, true) : m5031(0, this.f4172.size(), true);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public int m5029() {
            return StaggeredGridLayoutManager.this.f4129 ? m5031(0, this.f4172.size(), true) : m5031(this.f4172.size() - 1, -1, true);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        int m5030(int i5, int i6, boolean z5, boolean z6, boolean z7) {
            int mo5178 = StaggeredGridLayoutManager.this.f4124.mo5178();
            int mo5174 = StaggeredGridLayoutManager.this.f4124.mo5174();
            int i7 = i6 > i5 ? 1 : -1;
            while (i5 != i6) {
                View view = this.f4172.get(i5);
                int mo5172 = StaggeredGridLayoutManager.this.f4124.mo5172(view);
                int mo5169 = StaggeredGridLayoutManager.this.f4124.mo5169(view);
                boolean z8 = false;
                boolean z9 = !z7 ? mo5172 >= mo5174 : mo5172 > mo5174;
                if (!z7 ? mo5169 > mo5178 : mo5169 >= mo5178) {
                    z8 = true;
                }
                if (z9 && z8) {
                    if (z5 && z6) {
                        if (mo5172 >= mo5178 && mo5169 <= mo5174) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    } else {
                        if (z6) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                        if (mo5172 < mo5178 || mo5169 > mo5174) {
                            return StaggeredGridLayoutManager.this.getPosition(view);
                        }
                    }
                }
                i5 += i7;
            }
            return -1;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        int m5031(int i5, int i6, boolean z5) {
            return m5030(i5, i6, false, false, z5);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public int m5032() {
            return this.f4175;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        int m5033() {
            int i5 = this.f4174;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            m5025();
            return this.f4174;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        int m5034(int i5) {
            int i6 = this.f4174;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.f4172.size() == 0) {
                return i5;
            }
            m5025();
            return this.f4174;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public View m5035(int i5, int i6) {
            View view = null;
            if (i6 != -1) {
                int size = this.f4172.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4172.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4129 && staggeredGridLayoutManager.getPosition(view2) >= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4129 && staggeredGridLayoutManager2.getPosition(view2) <= i5) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4172.size();
                int i7 = 0;
                while (i7 < size2) {
                    View view3 = this.f4172.get(i7);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4129 && staggeredGridLayoutManager3.getPosition(view3) <= i5) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4129 && staggeredGridLayoutManager4.getPosition(view3) >= i5) || !view3.hasFocusable()) {
                        break;
                    }
                    i7++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: י, reason: contains not printable characters */
        c m5036(View view) {
            return (c) view.getLayoutParams();
        }

        /* renamed from: ـ, reason: contains not printable characters */
        int m5037() {
            int i5 = this.f4173;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            m5026();
            return this.f4173;
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        int m5038(int i5) {
            int i6 = this.f4173;
            if (i6 != Integer.MIN_VALUE) {
                return i6;
            }
            if (this.f4172.size() == 0) {
                return i5;
            }
            m5026();
            return this.f4173;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        void m5039() {
            this.f4173 = RecyclerView.UNDEFINED_DURATION;
            this.f4174 = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        void m5040(int i5) {
            int i6 = this.f4173;
            if (i6 != Integer.MIN_VALUE) {
                this.f4173 = i6 + i5;
            }
            int i7 = this.f4174;
            if (i7 != Integer.MIN_VALUE) {
                this.f4174 = i7 + i5;
            }
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        void m5041() {
            int size = this.f4172.size();
            View remove = this.f4172.remove(size - 1);
            c m5036 = m5036(remove);
            m5036.f4154 = null;
            if (m5036.m4867() || m5036.m4866()) {
                this.f4175 -= StaggeredGridLayoutManager.this.f4124.mo5170(remove);
            }
            if (size == 1) {
                this.f4173 = RecyclerView.UNDEFINED_DURATION;
            }
            this.f4174 = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        void m5042() {
            View remove = this.f4172.remove(0);
            c m5036 = m5036(remove);
            m5036.f4154 = null;
            if (this.f4172.size() == 0) {
                this.f4174 = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5036.m4867() || m5036.m4866()) {
                this.f4175 -= StaggeredGridLayoutManager.this.f4124.mo5170(remove);
            }
            this.f4173 = RecyclerView.UNDEFINED_DURATION;
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        void m5043(View view) {
            c m5036 = m5036(view);
            m5036.f4154 = this;
            this.f4172.add(0, view);
            this.f4173 = RecyclerView.UNDEFINED_DURATION;
            if (this.f4172.size() == 1) {
                this.f4174 = RecyclerView.UNDEFINED_DURATION;
            }
            if (m5036.m4867() || m5036.m4866()) {
                this.f4175 += StaggeredGridLayoutManager.this.f4124.mo5170(view);
            }
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        void m5044(int i5) {
            this.f4173 = i5;
            this.f4174 = i5;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i5, i6);
        setOrientation(properties.f4097);
        m4993(properties.f4098);
        m4992(properties.f4099);
        this.f4128 = new androidx.recyclerview.widget.f();
        m4965();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m4940(View view) {
        for (int i5 = this.f4122 - 1; i5 >= 0; i5--) {
            this.f4123[i5].m5023(view);
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private int m4941(int i5) {
        int m5038 = this.f4123[0].m5038(i5);
        for (int i6 = 1; i6 < this.f4122; i6++) {
            int m50382 = this.f4123[i6].m5038(i5);
            if (m50382 < m5038) {
                m5038 = m50382;
            }
        }
        return m5038;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: ʻʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4942(int r5, androidx.recyclerview.widget.RecyclerView.b0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.f4128
            r1 = 0
            r0.f4300 = r1
            r0.f4301 = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.m4767()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.f4130
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.i r5 = r4.f4124
            int r5 = r5.mo5179()
            goto L2f
        L25:
            androidx.recyclerview.widget.i r5 = r4.f4124
            int r5 = r5.mo5179()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.f4128
            androidx.recyclerview.widget.i r3 = r4.f4124
            int r3 = r3.mo5178()
            int r3 = r3 - r6
            r0.f4304 = r3
            androidx.recyclerview.widget.f r6 = r4.f4128
            androidx.recyclerview.widget.i r0 = r4.f4124
            int r0 = r0.mo5174()
            int r0 = r0 + r5
            r6.f4305 = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.f4128
            androidx.recyclerview.widget.i r3 = r4.f4124
            int r3 = r3.mo5173()
            int r3 = r3 + r5
            r0.f4305 = r3
            androidx.recyclerview.widget.f r5 = r4.f4128
            int r6 = -r6
            r5.f4304 = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.f4128
            r5.f4306 = r1
            r5.f4299 = r2
            androidx.recyclerview.widget.i r6 = r4.f4124
            int r6 = r6.mo5176()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.i r6 = r4.f4124
            int r6 = r6.mo5173()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.f4307 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4942(int, androidx.recyclerview.widget.RecyclerView$b0):void");
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private void m4943(f fVar, int i5, int i6) {
        int m5032 = fVar.m5032();
        if (i5 == -1) {
            if (fVar.m5037() + m5032 <= i6) {
                this.f4131.set(fVar.f4176, false);
            }
        } else if (fVar.m5033() - m5032 >= i6) {
            this.f4131.set(fVar.f4176, false);
        }
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private int m4944(int i5, int i6, int i7) {
        if (i6 == 0 && i7 == 0) {
            return i5;
        }
        int mode = View.MeasureSpec.getMode(i5);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - i6) - i7), mode) : i5;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m4945(b bVar) {
        e eVar = this.f4138;
        int i5 = eVar.f4164;
        if (i5 > 0) {
            if (i5 == this.f4122) {
                for (int i6 = 0; i6 < this.f4122; i6++) {
                    this.f4123[i6].m5027();
                    e eVar2 = this.f4138;
                    int i7 = eVar2.f4165[i6];
                    if (i7 != Integer.MIN_VALUE) {
                        i7 += eVar2.f4170 ? this.f4124.mo5174() : this.f4124.mo5178();
                    }
                    this.f4123[i6].m5044(i7);
                }
            } else {
                eVar.m5020();
                e eVar3 = this.f4138;
                eVar3.f4162 = eVar3.f4163;
            }
        }
        e eVar4 = this.f4138;
        this.f4137 = eVar4.f4171;
        m4992(eVar4.f4169);
        m4971();
        e eVar5 = this.f4138;
        int i8 = eVar5.f4162;
        if (i8 != -1) {
            this.f4132 = i8;
            bVar.f4149 = eVar5.f4170;
        } else {
            bVar.f4149 = this.f4130;
        }
        if (eVar5.f4166 > 1) {
            d dVar = this.f4134;
            dVar.f4156 = eVar5.f4167;
            dVar.f4157 = eVar5.f4168;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4946(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4130
            if (r0 == 0) goto L9
            int r0 = r6.m4995()
            goto Ld
        L9:
            int r0 = r6.m4994()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f4134
            r4.m5011(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4134
            r9.m5013(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f4134
            r7.m5012(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4134
            r9.m5013(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4134
            r9.m5012(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4130
            if (r7 == 0) goto L4d
            int r7 = r6.m4994()
            goto L51
        L4d:
            int r7 = r6.m4995()
        L51:
            if (r3 > r7) goto L56
            r6.requestLayout()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4946(int, int, int):void");
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private f m4947(androidx.recyclerview.widget.f fVar) {
        int i5;
        int i6;
        int i7;
        if (m4956(fVar.f4303)) {
            i6 = this.f4122 - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = this.f4122;
            i6 = 0;
            i7 = 1;
        }
        f fVar2 = null;
        if (fVar.f4303 == 1) {
            int mo5178 = this.f4124.mo5178();
            int i8 = Integer.MAX_VALUE;
            while (i6 != i5) {
                f fVar3 = this.f4123[i6];
                int m5034 = fVar3.m5034(mo5178);
                if (m5034 < i8) {
                    fVar2 = fVar3;
                    i8 = m5034;
                }
                i6 += i7;
            }
            return fVar2;
        }
        int mo5174 = this.f4124.mo5174();
        int i9 = RecyclerView.UNDEFINED_DURATION;
        while (i6 != i5) {
            f fVar4 = this.f4123[i6];
            int m5038 = fVar4.m5038(mo5174);
            if (m5038 > i9) {
                fVar2 = fVar4;
                i9 = m5038;
            }
            i6 += i7;
        }
        return fVar2;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m4948(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f4303 == 1) {
            if (cVar.f4155) {
                m4940(view);
                return;
            } else {
                cVar.f4154.m5023(view);
                return;
            }
        }
        if (cVar.f4155) {
            m4960(view);
        } else {
            cVar.f4154.m5043(view);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private int m4949(int i5) {
        if (getChildCount() == 0) {
            return this.f4130 ? 1 : -1;
        }
        return (i5 < m4994()) != this.f4130 ? -1 : 1;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m4950(View view, int i5, int i6, boolean z5) {
        calculateItemDecorationsForChild(view, this.f4140);
        c cVar = (c) view.getLayoutParams();
        int i7 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f4140;
        int m4944 = m4944(i5, i7 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i8 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f4140;
        int m49442 = m4944(i6, i8 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z5 ? shouldReMeasureChild(view, m4944, m49442, cVar) : shouldMeasureChild(view, m4944, m49442, cVar)) {
            view.measure(m4944, m49442);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* renamed from: ˈˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m4951(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4951(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m4952(f fVar) {
        if (this.f4130) {
            if (fVar.m5033() < this.f4124.mo5174()) {
                ArrayList<View> arrayList = fVar.f4172;
                return !fVar.m5036(arrayList.get(arrayList.size() - 1)).f4155;
            }
        } else if (fVar.m5037() > this.f4124.mo5178()) {
            return !fVar.m5036(fVar.f4172.get(0)).f4155;
        }
        return false;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m4953(View view, c cVar, boolean z5) {
        if (cVar.f4155) {
            if (this.f4126 == 1) {
                m4950(view, this.f4139, RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z5);
                return;
            } else {
                m4950(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f4139, z5);
                return;
            }
        }
        if (this.f4126 == 1) {
            m4950(view, RecyclerView.p.getChildMeasureSpec(this.f4127, getWidthMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z5);
        } else {
            m4950(view, RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.getChildMeasureSpec(this.f4127, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z5);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m4954(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.m5194(b0Var, this.f4124, m4990(!this.f4143), m4989(!this.f4143), this, this.f4143);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m4955(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.m5195(b0Var, this.f4124, m4990(!this.f4143), m4989(!this.f4143), this, this.f4143, this.f4130);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private boolean m4956(int i5) {
        if (this.f4126 == 0) {
            return (i5 == -1) != this.f4130;
        }
        return ((i5 == -1) == this.f4130) == m4988();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private int m4957(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return l.m5196(b0Var, this.f4124, m4990(!this.f4143), m4989(!this.f4143), this, this.f4143);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m4958(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.f4299 || fVar.f4307) {
            return;
        }
        if (fVar.f4300 == 0) {
            if (fVar.f4303 == -1) {
                m4962(wVar, fVar.f4305);
                return;
            } else {
                m4972(wVar, fVar.f4304);
                return;
            }
        }
        if (fVar.f4303 != -1) {
            int m4970 = m4970(fVar.f4305) - fVar.f4305;
            m4972(wVar, m4970 < 0 ? fVar.f4304 : Math.min(m4970, fVar.f4300) + fVar.f4304);
        } else {
            int i5 = fVar.f4304;
            int m4969 = i5 - m4969(i5);
            m4962(wVar, m4969 < 0 ? fVar.f4305 : fVar.f4305 - Math.min(m4969, fVar.f4300));
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private int m4959(int i5) {
        if (i5 == 1) {
            return (this.f4126 != 1 && m4988()) ? 1 : -1;
        }
        if (i5 == 2) {
            return (this.f4126 != 1 && m4988()) ? -1 : 1;
        }
        if (i5 == 17) {
            if (this.f4126 == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 == 33) {
            if (this.f4126 == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 == 66) {
            if (this.f4126 == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (i5 != 130) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (this.f4126 == 1) {
            return 1;
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m4960(View view) {
        for (int i5 = this.f4122 - 1; i5 >= 0; i5--) {
            this.f4123[i5].m5043(view);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private d.a m4961(int i5) {
        d.a aVar = new d.a();
        aVar.f4160 = new int[this.f4122];
        for (int i6 = 0; i6 < this.f4122; i6++) {
            aVar.f4160[i6] = i5 - this.f4123[i6].m5034(i5);
        }
        return aVar;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private void m4962(RecyclerView.w wVar, int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f4124.mo5172(childAt) < i5 || this.f4124.mo5182(childAt) < i5) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f4155) {
                for (int i6 = 0; i6 < this.f4122; i6++) {
                    if (this.f4123[i6].f4172.size() == 1) {
                        return;
                    }
                }
                for (int i7 = 0; i7 < this.f4122; i7++) {
                    this.f4123[i7].m5041();
                }
            } else if (cVar.f4154.f4172.size() == 1) {
                return;
            } else {
                cVar.f4154.m5041();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private d.a m4963(int i5) {
        d.a aVar = new d.a();
        aVar.f4160 = new int[this.f4122];
        for (int i6 = 0; i6 < this.f4122; i6++) {
            aVar.f4160[i6] = this.f4123[i6].m5038(i5) - i5;
        }
        return aVar;
    }

    /* renamed from: יי, reason: contains not printable characters */
    private void m4964() {
        if (this.f4125.mo5176() == 1073741824) {
            return;
        }
        int childCount = getChildCount();
        float f5 = 0.0f;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            float mo5170 = this.f4125.mo5170(childAt);
            if (mo5170 >= f5) {
                if (((c) childAt.getLayoutParams()).m5000()) {
                    mo5170 = (mo5170 * 1.0f) / this.f4122;
                }
                f5 = Math.max(f5, mo5170);
            }
        }
        int i6 = this.f4127;
        int round = Math.round(f5 * this.f4122);
        if (this.f4125.mo5176() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4125.mo5179());
        }
        m4981(round);
        if (this.f4127 == i6) {
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            c cVar = (c) childAt2.getLayoutParams();
            if (!cVar.f4155) {
                if (m4988() && this.f4126 == 1) {
                    int i8 = this.f4122;
                    int i9 = cVar.f4154.f4176;
                    childAt2.offsetLeftAndRight(((-((i8 - 1) - i9)) * this.f4127) - ((-((i8 - 1) - i9)) * i6));
                } else {
                    int i10 = cVar.f4154.f4176;
                    int i11 = this.f4127 * i10;
                    int i12 = i10 * i6;
                    if (this.f4126 == 1) {
                        childAt2.offsetLeftAndRight(i11 - i12);
                    } else {
                        childAt2.offsetTopAndBottom(i11 - i12);
                    }
                }
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m4965() {
        this.f4124 = i.m5167(this, this.f4126);
        this.f4125 = i.m5167(this, 1 - this.f4126);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: ٴ, reason: contains not printable characters */
    private int m4966(RecyclerView.w wVar, androidx.recyclerview.widget.f fVar, RecyclerView.b0 b0Var) {
        int i5;
        f fVar2;
        int mo5170;
        int i6;
        int i7;
        int mo51702;
        ?? r9 = 0;
        this.f4131.set(0, this.f4122, true);
        if (this.f4128.f4307) {
            i5 = fVar.f4303 == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i5 = fVar.f4303 == 1 ? fVar.f4305 + fVar.f4300 : fVar.f4304 - fVar.f4300;
        }
        m4967(fVar.f4303, i5);
        int mo5174 = this.f4130 ? this.f4124.mo5174() : this.f4124.mo5178();
        boolean z5 = false;
        while (fVar.m5147(b0Var) && (this.f4128.f4307 || !this.f4131.isEmpty())) {
            View m5148 = fVar.m5148(wVar);
            c cVar = (c) m5148.getLayoutParams();
            int m4865 = cVar.m4865();
            int m5010 = this.f4134.m5010(m4865);
            boolean z6 = m5010 == -1;
            if (z6) {
                fVar2 = cVar.f4155 ? this.f4123[r9] : m4947(fVar);
                this.f4134.m5014(m4865, fVar2);
            } else {
                fVar2 = this.f4123[m5010];
            }
            f fVar3 = fVar2;
            cVar.f4154 = fVar3;
            if (fVar.f4303 == 1) {
                addView(m5148);
            } else {
                addView(m5148, r9);
            }
            m4953(m5148, cVar, r9);
            if (fVar.f4303 == 1) {
                int m4978 = cVar.f4155 ? m4978(mo5174) : fVar3.m5034(mo5174);
                int mo51703 = this.f4124.mo5170(m5148) + m4978;
                if (z6 && cVar.f4155) {
                    d.a m4961 = m4961(m4978);
                    m4961.f4159 = -1;
                    m4961.f4158 = m4865;
                    this.f4134.m5004(m4961);
                }
                i6 = mo51703;
                mo5170 = m4978;
            } else {
                int m4941 = cVar.f4155 ? m4941(mo5174) : fVar3.m5038(mo5174);
                mo5170 = m4941 - this.f4124.mo5170(m5148);
                if (z6 && cVar.f4155) {
                    d.a m4963 = m4963(m4941);
                    m4963.f4159 = 1;
                    m4963.f4158 = m4865;
                    this.f4134.m5004(m4963);
                }
                i6 = m4941;
            }
            if (cVar.f4155 && fVar.f4302 == -1) {
                if (z6) {
                    this.f4142 = true;
                } else {
                    if (!(fVar.f4303 == 1 ? m4982() : m4983())) {
                        d.a m5009 = this.f4134.m5009(m4865);
                        if (m5009 != null) {
                            m5009.f4161 = true;
                        }
                        this.f4142 = true;
                    }
                }
            }
            m4948(m5148, cVar, fVar);
            if (m4988() && this.f4126 == 1) {
                int mo51742 = cVar.f4155 ? this.f4125.mo5174() : this.f4125.mo5174() - (((this.f4122 - 1) - fVar3.f4176) * this.f4127);
                mo51702 = mo51742;
                i7 = mo51742 - this.f4125.mo5170(m5148);
            } else {
                int mo5178 = cVar.f4155 ? this.f4125.mo5178() : (fVar3.f4176 * this.f4127) + this.f4125.mo5178();
                i7 = mo5178;
                mo51702 = this.f4125.mo5170(m5148) + mo5178;
            }
            if (this.f4126 == 1) {
                layoutDecoratedWithMargins(m5148, i7, mo5170, mo51702, i6);
            } else {
                layoutDecoratedWithMargins(m5148, mo5170, i7, i6, mo51702);
            }
            if (cVar.f4155) {
                m4967(this.f4128.f4303, i5);
            } else {
                m4943(fVar3, this.f4128.f4303, i5);
            }
            m4958(wVar, this.f4128);
            if (this.f4128.f4306 && m5148.hasFocusable()) {
                if (cVar.f4155) {
                    this.f4131.clear();
                } else {
                    this.f4131.set(fVar3.f4176, false);
                }
            }
            z5 = true;
            r9 = 0;
        }
        if (!z5) {
            m4958(wVar, this.f4128);
        }
        int mo51782 = this.f4128.f4303 == -1 ? this.f4124.mo5178() - m4941(this.f4124.mo5178()) : m4978(this.f4124.mo5174()) - this.f4124.mo5174();
        if (mo51782 > 0) {
            return Math.min(fVar.f4300, mo51782);
        }
        return 0;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private void m4967(int i5, int i6) {
        for (int i7 = 0; i7 < this.f4122; i7++) {
            if (!this.f4123[i7].f4172.isEmpty()) {
                m4943(this.f4123[i7], i5, i6);
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int m4968(int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            int position = getPosition(getChildAt(i6));
            if (position >= 0 && position < i5) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int m4969(int i5) {
        int m5038 = this.f4123[0].m5038(i5);
        for (int i6 = 1; i6 < this.f4122; i6++) {
            int m50382 = this.f4123[i6].m5038(i5);
            if (m50382 > m5038) {
                m5038 = m50382;
            }
        }
        return m5038;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private int m4970(int i5) {
        int m5034 = this.f4123[0].m5034(i5);
        for (int i6 = 1; i6 < this.f4122; i6++) {
            int m50342 = this.f4123[i6].m5034(i5);
            if (m50342 < m5034) {
                m5034 = m50342;
            }
        }
        return m5034;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private void m4971() {
        if (this.f4126 == 1 || !m4988()) {
            this.f4130 = this.f4129;
        } else {
            this.f4130 = !this.f4129;
        }
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m4972(RecyclerView.w wVar, int i5) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f4124.mo5169(childAt) > i5 || this.f4124.mo5181(childAt) > i5) {
                return;
            }
            c cVar = (c) childAt.getLayoutParams();
            if (cVar.f4155) {
                for (int i6 = 0; i6 < this.f4122; i6++) {
                    if (this.f4123[i6].f4172.size() == 1) {
                        return;
                    }
                }
                for (int i7 = 0; i7 < this.f4122; i7++) {
                    this.f4123[i7].m5042();
                }
            } else if (cVar.f4154.f4172.size() == 1) {
                return;
            } else {
                cVar.f4154.m5042();
            }
            removeAndRecycleView(childAt, wVar);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int m4973(int i5) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            int position = getPosition(getChildAt(childCount));
            if (position >= 0 && position < i5) {
                return position;
            }
        }
        return 0;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private void m4974(int i5) {
        androidx.recyclerview.widget.f fVar = this.f4128;
        fVar.f4303 = i5;
        fVar.f4302 = this.f4130 != (i5 == -1) ? -1 : 1;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m4975(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z5) {
        int mo5174;
        int m4978 = m4978(RecyclerView.UNDEFINED_DURATION);
        if (m4978 != Integer.MIN_VALUE && (mo5174 = this.f4124.mo5174() - m4978) > 0) {
            int i5 = mo5174 - (-scrollBy(-mo5174, wVar, b0Var));
            if (!z5 || i5 <= 0) {
                return;
            }
            this.f4124.mo5183(i5);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m4976(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z5) {
        int mo5178;
        int m4941 = m4941(Integer.MAX_VALUE);
        if (m4941 != Integer.MAX_VALUE && (mo5178 = m4941 - this.f4124.mo5178()) > 0) {
            int scrollBy = mo5178 - scrollBy(mo5178, wVar, b0Var);
            if (!z5 || scrollBy <= 0) {
                return;
            }
            this.f4124.mo5183(-scrollBy);
        }
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private boolean m4977(RecyclerView.b0 b0Var, b bVar) {
        bVar.f4147 = this.f4136 ? m4973(b0Var.m4766()) : m4968(b0Var.m4766());
        bVar.f4148 = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int m4978(int i5) {
        int m5034 = this.f4123[0].m5034(i5);
        for (int i6 = 1; i6 < this.f4122; i6++) {
            int m50342 = this.f4123[i6].m5034(i5);
            if (m50342 > m5034) {
                m5034 = m50342;
            }
        }
        return m5034;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.f4138 == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.f4126 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.f4126 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i5, int i6, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        int m5034;
        int i7;
        if (this.f4126 != 0) {
            i5 = i6;
        }
        if (getChildCount() == 0 || i5 == 0) {
            return;
        }
        m4987(i5, b0Var);
        int[] iArr = this.f4144;
        if (iArr == null || iArr.length < this.f4122) {
            this.f4144 = new int[this.f4122];
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f4122; i9++) {
            androidx.recyclerview.widget.f fVar = this.f4128;
            if (fVar.f4302 == -1) {
                m5034 = fVar.f4304;
                i7 = this.f4123[i9].m5038(m5034);
            } else {
                m5034 = this.f4123[i9].m5034(fVar.f4305);
                i7 = this.f4128.f4305;
            }
            int i10 = m5034 - i7;
            if (i10 >= 0) {
                this.f4144[i8] = i10;
                i8++;
            }
        }
        Arrays.sort(this.f4144, 0, i8);
        for (int i11 = 0; i11 < i8 && this.f4128.m5147(b0Var); i11++) {
            cVar.mo4864(this.f4128.f4301, this.f4144[i11]);
            androidx.recyclerview.widget.f fVar2 = this.f4128;
            fVar2.f4301 += fVar2.f4302;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return m4954(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return m4955(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return m4957(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i5) {
        int m4949 = m4949(i5);
        PointF pointF = new PointF();
        if (m4949 == 0) {
            return null;
        }
        if (this.f4126 == 0) {
            pointF.x = m4949;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m4949;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return m4954(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return m4955(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return m4957(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.f4126 == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return this.f4135 != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenHorizontal(int i5) {
        super.offsetChildrenHorizontal(i5);
        for (int i6 = 0; i6 < this.f4122; i6++) {
            this.f4123[i6].m5040(i5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void offsetChildrenVertical(int i5) {
        super.offsetChildrenVertical(i5);
        for (int i6 = 0; i6 < this.f4122; i6++) {
            this.f4123[i6].m5040(i5);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAdapterChanged(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f4134.m5005();
        for (int i5 = 0; i5 < this.f4122; i5++) {
            this.f4123[i5].m5027();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        removeCallbacks(this.f4145);
        for (int i5 = 0; i5 < this.f4122; i5++) {
            this.f4123[i5].m5027();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View findContainingItemView;
        View m5035;
        if (getChildCount() == 0 || (findContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m4971();
        int m4959 = m4959(i5);
        if (m4959 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        boolean z5 = cVar.f4155;
        f fVar = cVar.f4154;
        int m4995 = m4959 == 1 ? m4995() : m4994();
        m4942(m4995, b0Var);
        m4974(m4959);
        androidx.recyclerview.widget.f fVar2 = this.f4128;
        fVar2.f4301 = fVar2.f4302 + m4995;
        fVar2.f4300 = (int) (this.f4124.mo5179() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f4128;
        fVar3.f4306 = true;
        fVar3.f4299 = false;
        m4966(wVar, fVar3, b0Var);
        this.f4136 = this.f4130;
        if (!z5 && (m5035 = fVar.m5035(m4995, m4959)) != null && m5035 != findContainingItemView) {
            return m5035;
        }
        if (m4956(m4959)) {
            for (int i6 = this.f4122 - 1; i6 >= 0; i6--) {
                View m50352 = this.f4123[i6].m5035(m4995, m4959);
                if (m50352 != null && m50352 != findContainingItemView) {
                    return m50352;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f4122; i7++) {
                View m50353 = this.f4123[i7].m5035(m4995, m4959);
                if (m50353 != null && m50353 != findContainingItemView) {
                    return m50353;
                }
            }
        }
        boolean z6 = (this.f4129 ^ true) == (m4959 == -1);
        if (!z5) {
            View findViewByPosition = findViewByPosition(z6 ? fVar.m5028() : fVar.m5029());
            if (findViewByPosition != null && findViewByPosition != findContainingItemView) {
                return findViewByPosition;
            }
        }
        if (m4956(m4959)) {
            for (int i8 = this.f4122 - 1; i8 >= 0; i8--) {
                if (i8 != fVar.f4176) {
                    View findViewByPosition2 = findViewByPosition(z6 ? this.f4123[i8].m5028() : this.f4123[i8].m5029());
                    if (findViewByPosition2 != null && findViewByPosition2 != findContainingItemView) {
                        return findViewByPosition2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f4122; i9++) {
                View findViewByPosition3 = findViewByPosition(z6 ? this.f4123[i9].m5028() : this.f4123[i9].m5029());
                if (findViewByPosition3 != null && findViewByPosition3 != findContainingItemView) {
                    return findViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View m4990 = m4990(false);
            View m4989 = m4989(false);
            if (m4990 == null || m4989 == null) {
                return;
            }
            int position = getPosition(m4990);
            int position2 = getPosition(m4989);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i5, int i6) {
        m4946(i5, i6, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4134.m5005();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i5, int i6, int i7) {
        m4946(i5, i6, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i5, int i6) {
        m4946(i5, i6, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i5, int i6, Object obj) {
        m4946(i5, i6, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        m4951(wVar, b0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f4132 = -1;
        this.f4133 = RecyclerView.UNDEFINED_DURATION;
        this.f4138 = null;
        this.f4141.m4998();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f4138 = eVar;
            if (this.f4132 != -1) {
                eVar.m5019();
                this.f4138.m5020();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        int m5038;
        int mo5178;
        int[] iArr;
        if (this.f4138 != null) {
            return new e(this.f4138);
        }
        e eVar = new e();
        eVar.f4169 = this.f4129;
        eVar.f4170 = this.f4136;
        eVar.f4171 = this.f4137;
        d dVar = this.f4134;
        if (dVar == null || (iArr = dVar.f4156) == null) {
            eVar.f4166 = 0;
        } else {
            eVar.f4167 = iArr;
            eVar.f4166 = iArr.length;
            eVar.f4168 = dVar.f4157;
        }
        if (getChildCount() > 0) {
            eVar.f4162 = this.f4136 ? m4995() : m4994();
            eVar.f4163 = m4991();
            int i5 = this.f4122;
            eVar.f4164 = i5;
            eVar.f4165 = new int[i5];
            for (int i6 = 0; i6 < this.f4122; i6++) {
                if (this.f4136) {
                    m5038 = this.f4123[i6].m5034(RecyclerView.UNDEFINED_DURATION);
                    if (m5038 != Integer.MIN_VALUE) {
                        mo5178 = this.f4124.mo5174();
                        m5038 -= mo5178;
                    }
                } else {
                    m5038 = this.f4123[i6].m5038(RecyclerView.UNDEFINED_DURATION);
                    if (m5038 != Integer.MIN_VALUE) {
                        mo5178 = this.f4124.mo5178();
                        m5038 -= mo5178;
                    }
                }
                eVar.f4165[i6] = m5038;
            }
        } else {
            eVar.f4162 = -1;
            eVar.f4163 = -1;
            eVar.f4164 = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onScrollStateChanged(int i5) {
        if (i5 == 0) {
            m4986();
        }
    }

    int scrollBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        m4987(i5, b0Var);
        int m4966 = m4966(wVar, this.f4128, b0Var);
        if (this.f4128.f4300 >= m4966) {
            i5 = i5 < 0 ? -m4966 : m4966;
        }
        this.f4124.mo5183(-i5);
        this.f4136 = this.f4130;
        androidx.recyclerview.widget.f fVar = this.f4128;
        fVar.f4300 = 0;
        m4958(wVar, fVar);
        return i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i5, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i5) {
        e eVar = this.f4138;
        if (eVar != null && eVar.f4162 != i5) {
            eVar.m5019();
        }
        this.f4132 = i5;
        this.f4133 = RecyclerView.UNDEFINED_DURATION;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return scrollBy(i5, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i5, int i6) {
        int chooseSize;
        int chooseSize2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4126 == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i6, rect.height() + paddingTop, getMinimumHeight());
            chooseSize = RecyclerView.p.chooseSize(i5, (this.f4127 * this.f4122) + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i5, rect.width() + paddingLeft, getMinimumWidth());
            chooseSize2 = RecyclerView.p.chooseSize(i6, (this.f4127 * this.f4122) + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i5 == this.f4126) {
            return;
        }
        this.f4126 = i5;
        i iVar = this.f4124;
        this.f4124 = this.f4125;
        this.f4125 = iVar;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i5) {
        g gVar = new g(recyclerView.getContext());
        gVar.m4757(i5);
        startSmoothScroll(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f4138 == null;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    boolean m4979(RecyclerView.b0 b0Var, b bVar) {
        int i5;
        if (!b0Var.m4769() && (i5 = this.f4132) != -1) {
            if (i5 >= 0 && i5 < b0Var.m4766()) {
                e eVar = this.f4138;
                if (eVar == null || eVar.f4162 == -1 || eVar.f4164 < 1) {
                    View findViewByPosition = findViewByPosition(this.f4132);
                    if (findViewByPosition != null) {
                        bVar.f4147 = this.f4130 ? m4995() : m4994();
                        if (this.f4133 != Integer.MIN_VALUE) {
                            if (bVar.f4149) {
                                bVar.f4148 = (this.f4124.mo5174() - this.f4133) - this.f4124.mo5169(findViewByPosition);
                            } else {
                                bVar.f4148 = (this.f4124.mo5178() + this.f4133) - this.f4124.mo5172(findViewByPosition);
                            }
                            return true;
                        }
                        if (this.f4124.mo5170(findViewByPosition) > this.f4124.mo5179()) {
                            bVar.f4148 = bVar.f4149 ? this.f4124.mo5174() : this.f4124.mo5178();
                            return true;
                        }
                        int mo5172 = this.f4124.mo5172(findViewByPosition) - this.f4124.mo5178();
                        if (mo5172 < 0) {
                            bVar.f4148 = -mo5172;
                            return true;
                        }
                        int mo5174 = this.f4124.mo5174() - this.f4124.mo5169(findViewByPosition);
                        if (mo5174 < 0) {
                            bVar.f4148 = mo5174;
                            return true;
                        }
                        bVar.f4148 = RecyclerView.UNDEFINED_DURATION;
                    } else {
                        int i6 = this.f4132;
                        bVar.f4147 = i6;
                        int i7 = this.f4133;
                        if (i7 == Integer.MIN_VALUE) {
                            bVar.f4149 = m4949(i6) == 1;
                            bVar.m4996();
                        } else {
                            bVar.m4997(i7);
                        }
                        bVar.f4150 = true;
                    }
                } else {
                    bVar.f4148 = RecyclerView.UNDEFINED_DURATION;
                    bVar.f4147 = this.f4132;
                }
                return true;
            }
            this.f4132 = -1;
            this.f4133 = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m4980(RecyclerView.b0 b0Var, b bVar) {
        if (m4979(b0Var, bVar) || m4977(b0Var, bVar)) {
            return;
        }
        bVar.m4996();
        bVar.f4147 = 0;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m4981(int i5) {
        this.f4127 = i5 / this.f4122;
        this.f4139 = View.MeasureSpec.makeMeasureSpec(i5, this.f4125.mo5176());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m4982() {
        int m5034 = this.f4123[0].m5034(RecyclerView.UNDEFINED_DURATION);
        for (int i5 = 1; i5 < this.f4122; i5++) {
            if (this.f4123[i5].m5034(RecyclerView.UNDEFINED_DURATION) != m5034) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m4983() {
        int m5038 = this.f4123[0].m5038(RecyclerView.UNDEFINED_DURATION);
        for (int i5 = 1; i5 < this.f4122; i5++) {
            if (this.f4123[i5].m5038(RecyclerView.UNDEFINED_DURATION) != m5038) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m4984() {
        this.f4134.m5005();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* renamed from: ʿʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m4985() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4122
            r2.<init>(r3)
            int r3 = r12.f4122
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4126
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m4988()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.f4130
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4154
            int r9 = r9.f4176
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4154
            boolean r9 = r12.m4952(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4154
            int r9 = r9.f4176
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4155
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.f4130
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f4124
            int r10 = r10.mo5169(r7)
            androidx.recyclerview.widget.i r11 = r12.f4124
            int r11 = r11.mo5169(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f4124
            int r10 = r10.mo5172(r7)
            androidx.recyclerview.widget.i r11 = r12.f4124
            int r11 = r11.mo5172(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4154
            int r8 = r8.f4176
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4154
            int r9 = r9.f4176
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4985():android.view.View");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean m4986() {
        int m4994;
        int m4995;
        if (getChildCount() == 0 || this.f4135 == 0 || !isAttachedToWindow()) {
            return false;
        }
        if (this.f4130) {
            m4994 = m4995();
            m4995 = m4994();
        } else {
            m4994 = m4994();
            m4995 = m4995();
        }
        if (m4994 == 0 && m4985() != null) {
            this.f4134.m5005();
            requestSimpleAnimationsInNextLayout();
            requestLayout();
            return true;
        }
        if (!this.f4142) {
            return false;
        }
        int i5 = this.f4130 ? -1 : 1;
        int i6 = m4995 + 1;
        d.a m5008 = this.f4134.m5008(m4994, i6, i5, true);
        if (m5008 == null) {
            this.f4142 = false;
            this.f4134.m5007(i6);
            return false;
        }
        d.a m50082 = this.f4134.m5008(m4994, m5008.f4158, i5 * (-1), true);
        if (m50082 == null) {
            this.f4134.m5007(m5008.f4158);
        } else {
            this.f4134.m5007(m50082.f4158 + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m4987(int i5, RecyclerView.b0 b0Var) {
        int m4994;
        int i6;
        if (i5 > 0) {
            m4994 = m4995();
            i6 = 1;
        } else {
            m4994 = m4994();
            i6 = -1;
        }
        this.f4128.f4299 = true;
        m4942(m4994, b0Var);
        m4974(i6);
        androidx.recyclerview.widget.f fVar = this.f4128;
        fVar.f4301 = m4994 + fVar.f4302;
        fVar.f4300 = Math.abs(i5);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    boolean m4988() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    View m4989(boolean z5) {
        int mo5178 = this.f4124.mo5178();
        int mo5174 = this.f4124.mo5174();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int mo5172 = this.f4124.mo5172(childAt);
            int mo5169 = this.f4124.mo5169(childAt);
            if (mo5169 > mo5178 && mo5172 < mo5174) {
                if (mo5169 <= mo5174 || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    View m4990(boolean z5) {
        int mo5178 = this.f4124.mo5178();
        int mo5174 = this.f4124.mo5174();
        int childCount = getChildCount();
        View view = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int mo5172 = this.f4124.mo5172(childAt);
            if (this.f4124.mo5169(childAt) > mo5178 && mo5172 < mo5174) {
                if (mo5172 >= mo5178 || !z5) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    int m4991() {
        View m4989 = this.f4130 ? m4989(true) : m4990(true);
        if (m4989 == null) {
            return -1;
        }
        return getPosition(m4989);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public void m4992(boolean z5) {
        assertNotInLayoutOrScroll(null);
        e eVar = this.f4138;
        if (eVar != null && eVar.f4169 != z5) {
            eVar.f4169 = z5;
        }
        this.f4129 = z5;
        requestLayout();
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m4993(int i5) {
        assertNotInLayoutOrScroll(null);
        if (i5 != this.f4122) {
            m4984();
            this.f4122 = i5;
            this.f4131 = new BitSet(this.f4122);
            this.f4123 = new f[this.f4122];
            for (int i6 = 0; i6 < this.f4122; i6++) {
                this.f4123[i6] = new f(i6);
            }
            requestLayout();
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    int m4994() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    int m4995() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        int[] f4156;

        /* renamed from: ʼ, reason: contains not printable characters */
        List<a> f4157;

        d() {
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private int m5001(int i5) {
            if (this.f4157 == null) {
                return -1;
            }
            a m5009 = m5009(i5);
            if (m5009 != null) {
                this.f4157.remove(m5009);
            }
            int size = this.f4157.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                }
                if (this.f4157.get(i6).f4158 >= i5) {
                    break;
                }
                i6++;
            }
            if (i6 == -1) {
                return -1;
            }
            a aVar = this.f4157.get(i6);
            this.f4157.remove(i6);
            return aVar.f4158;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private void m5002(int i5, int i6) {
            List<a> list = this.f4157;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4157.get(size);
                int i7 = aVar.f4158;
                if (i7 >= i5) {
                    aVar.f4158 = i7 + i6;
                }
            }
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private void m5003(int i5, int i6) {
            List<a> list = this.f4157;
            if (list == null) {
                return;
            }
            int i7 = i5 + i6;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4157.get(size);
                int i8 = aVar.f4158;
                if (i8 >= i5) {
                    if (i8 < i7) {
                        this.f4157.remove(size);
                    } else {
                        aVar.f4158 = i8 - i6;
                    }
                }
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m5004(a aVar) {
            if (this.f4157 == null) {
                this.f4157 = new ArrayList();
            }
            int size = this.f4157.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar2 = this.f4157.get(i5);
                if (aVar2.f4158 == aVar.f4158) {
                    this.f4157.remove(i5);
                }
                if (aVar2.f4158 >= aVar.f4158) {
                    this.f4157.add(i5, aVar);
                    return;
                }
            }
            this.f4157.add(aVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5005() {
            int[] iArr = this.f4156;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4157 = null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m5006(int i5) {
            int[] iArr = this.f4156;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i5, 10) + 1];
                this.f4156 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i5 >= iArr.length) {
                int[] iArr3 = new int[m5015(i5)];
                this.f4156 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4156;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        int m5007(int i5) {
            List<a> list = this.f4157;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4157.get(size).f4158 >= i5) {
                        this.f4157.remove(size);
                    }
                }
            }
            return m5011(i5);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public a m5008(int i5, int i6, int i7, boolean z5) {
            List<a> list = this.f4157;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                a aVar = this.f4157.get(i8);
                int i9 = aVar.f4158;
                if (i9 >= i6) {
                    return null;
                }
                if (i9 >= i5 && (i7 == 0 || aVar.f4159 == i7 || (z5 && aVar.f4161))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public a m5009(int i5) {
            List<a> list = this.f4157;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4157.get(size);
                if (aVar.f4158 == i5) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        int m5010(int i5) {
            int[] iArr = this.f4156;
            if (iArr == null || i5 >= iArr.length) {
                return -1;
            }
            return iArr[i5];
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        int m5011(int i5) {
            int[] iArr = this.f4156;
            if (iArr == null || i5 >= iArr.length) {
                return -1;
            }
            int m5001 = m5001(i5);
            if (m5001 == -1) {
                int[] iArr2 = this.f4156;
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                return this.f4156.length;
            }
            int min = Math.min(m5001 + 1, this.f4156.length);
            Arrays.fill(this.f4156, i5, min, -1);
            return min;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        void m5012(int i5, int i6) {
            int[] iArr = this.f4156;
            if (iArr == null || i5 >= iArr.length) {
                return;
            }
            int i7 = i5 + i6;
            m5006(i7);
            int[] iArr2 = this.f4156;
            System.arraycopy(iArr2, i5, iArr2, i7, (iArr2.length - i5) - i6);
            Arrays.fill(this.f4156, i5, i7, -1);
            m5002(i5, i6);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        void m5013(int i5, int i6) {
            int[] iArr = this.f4156;
            if (iArr == null || i5 >= iArr.length) {
                return;
            }
            int i7 = i5 + i6;
            m5006(i7);
            int[] iArr2 = this.f4156;
            System.arraycopy(iArr2, i7, iArr2, i5, (iArr2.length - i5) - i6);
            int[] iArr3 = this.f4156;
            Arrays.fill(iArr3, iArr3.length - i6, iArr3.length, -1);
            m5003(i5, i6);
        }

        /* renamed from: י, reason: contains not printable characters */
        void m5014(int i5, f fVar) {
            m5006(i5);
            this.f4156[i5] = fVar.f4176;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        int m5015(int i5) {
            int length = this.f4156.length;
            while (length <= i5) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0057a();

            /* renamed from: ʾ, reason: contains not printable characters */
            int f4158;

            /* renamed from: ʿ, reason: contains not printable characters */
            int f4159;

            /* renamed from: ˆ, reason: contains not printable characters */
            int[] f4160;

            /* renamed from: ˈ, reason: contains not printable characters */
            boolean f4161;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0057a implements Parcelable.Creator<a> {
                C0057a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public a[] newArray(int i5) {
                    return new a[i5];
                }
            }

            a(Parcel parcel) {
                this.f4158 = parcel.readInt();
                this.f4159 = parcel.readInt();
                this.f4161 = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4160 = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4158 + ", mGapDir=" + this.f4159 + ", mHasUnwantedGapAfter=" + this.f4161 + ", mGapPerSpan=" + Arrays.toString(this.f4160) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i5) {
                parcel.writeInt(this.f4158);
                parcel.writeInt(this.f4159);
                parcel.writeInt(this.f4161 ? 1 : 0);
                int[] iArr = this.f4160;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4160);
                }
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            int m5016(int i5) {
                int[] iArr = this.f4160;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i5];
            }

            a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i5, int i6) {
        this.f4126 = i6;
        m4993(i5);
        this.f4128 = new androidx.recyclerview.widget.f();
        m4965();
    }
}
