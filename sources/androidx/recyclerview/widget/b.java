package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    final InterfaceC0059b f4190;

    /* renamed from: ʿ, reason: contains not printable characters */
    private View f4194;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f4193 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    final a f4191 = new a();

    /* renamed from: ʽ, reason: contains not printable characters */
    final List<View> f4192 = new ArrayList();

    /* compiled from: ChildHelper.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        long f4195 = 0;

        /* renamed from: ʼ, reason: contains not printable characters */
        a f4196;

        a() {
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m5089() {
            if (this.f4196 == null) {
                this.f4196 = new a();
            }
        }

        public String toString() {
            if (this.f4196 == null) {
                return Long.toBinaryString(this.f4195);
            }
            return this.f4196.toString() + "xx" + Long.toBinaryString(this.f4195);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5090(int i5) {
            if (i5 < 64) {
                this.f4195 &= (1 << i5) ^ (-1);
                return;
            }
            a aVar = this.f4196;
            if (aVar != null) {
                aVar.m5090(i5 - 64);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        int m5091(int i5) {
            a aVar = this.f4196;
            return aVar == null ? i5 >= 64 ? Long.bitCount(this.f4195) : Long.bitCount(this.f4195 & ((1 << i5) - 1)) : i5 < 64 ? Long.bitCount(this.f4195 & ((1 << i5) - 1)) : aVar.m5091(i5 - 64) + Long.bitCount(this.f4195);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m5092(int i5) {
            if (i5 < 64) {
                return (this.f4195 & (1 << i5)) != 0;
            }
            m5089();
            return this.f4196.m5092(i5 - 64);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m5093(int i5, boolean z5) {
            if (i5 >= 64) {
                m5089();
                this.f4196.m5093(i5 - 64, z5);
                return;
            }
            long j5 = this.f4195;
            boolean z6 = (Long.MIN_VALUE & j5) != 0;
            long j6 = (1 << i5) - 1;
            this.f4195 = ((j5 & (j6 ^ (-1))) << 1) | (j5 & j6);
            if (z5) {
                m5096(i5);
            } else {
                m5090(i5);
            }
            if (z6 || this.f4196 != null) {
                m5089();
                this.f4196.m5093(0, z6);
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean m5094(int i5) {
            if (i5 >= 64) {
                m5089();
                return this.f4196.m5094(i5 - 64);
            }
            long j5 = 1 << i5;
            long j6 = this.f4195;
            boolean z5 = (j6 & j5) != 0;
            long j7 = j6 & (j5 ^ (-1));
            this.f4195 = j7;
            long j8 = j5 - 1;
            this.f4195 = (j7 & j8) | Long.rotateRight((j8 ^ (-1)) & j7, 1);
            a aVar = this.f4196;
            if (aVar != null) {
                if (aVar.m5092(0)) {
                    m5096(63);
                }
                this.f4196.m5094(0);
            }
            return z5;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        void m5095() {
            this.f4195 = 0L;
            a aVar = this.f4196;
            if (aVar != null) {
                aVar.m5095();
            }
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        void m5096(int i5) {
            if (i5 < 64) {
                this.f4195 |= 1 << i5;
            } else {
                m5089();
                this.f4196.m5096(i5 - 64);
            }
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0059b {
        /* renamed from: ʻ */
        View mo4777(int i5);

        /* renamed from: ʼ */
        void mo4778(View view);

        /* renamed from: ʽ */
        RecyclerView.f0 mo4779(View view);

        /* renamed from: ʾ */
        void mo4780(int i5);

        /* renamed from: ʿ */
        void mo4781(View view);

        /* renamed from: ˆ */
        void mo4782(View view, int i5);

        /* renamed from: ˈ */
        int mo4783();

        /* renamed from: ˉ */
        void mo4784(int i5);

        /* renamed from: ˊ */
        void mo4785();

        /* renamed from: ˋ */
        void mo4786(View view, int i5, ViewGroup.LayoutParams layoutParams);

        /* renamed from: ˎ */
        int mo4787(View view);
    }

    b(InterfaceC0059b interfaceC0059b) {
        this.f4190 = interfaceC0059b;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private int m5069(int i5) {
        if (i5 < 0) {
            return -1;
        }
        int mo4783 = this.f4190.mo4783();
        int i6 = i5;
        while (i6 < mo4783) {
            int m5091 = i5 - (i6 - this.f4191.m5091(i6));
            if (m5091 == 0) {
                while (this.f4191.m5092(i6)) {
                    i6++;
                }
                return i6;
            }
            i6 += m5091;
        }
        return -1;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m5070(View view) {
        this.f4192.add(view);
        this.f4190.mo4778(view);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m5071(View view) {
        if (!this.f4192.remove(view)) {
            return false;
        }
        this.f4190.mo4781(view);
        return true;
    }

    public String toString() {
        return this.f4191.toString() + ", hidden list:" + this.f4192.size();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m5072(View view, int i5, boolean z5) {
        int mo4783 = i5 < 0 ? this.f4190.mo4783() : m5069(i5);
        this.f4191.m5093(mo4783, z5);
        if (z5) {
            m5070(view);
        }
        this.f4190.mo4782(view, mo4783);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m5073(View view, boolean z5) {
        m5072(view, -1, z5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m5074(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z5) {
        int mo4783 = i5 < 0 ? this.f4190.mo4783() : m5069(i5);
        this.f4191.m5093(mo4783, z5);
        if (z5) {
            m5070(view);
        }
        this.f4190.mo4786(view, mo4783, layoutParams);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m5075(int i5) {
        int m5069 = m5069(i5);
        this.f4191.m5094(m5069);
        this.f4190.mo4780(m5069);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    View m5076(int i5) {
        int size = this.f4192.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f4192.get(i6);
            RecyclerView.f0 mo4779 = this.f4190.mo4779(view);
            if (mo4779.getLayoutPosition() == i5 && !mo4779.isInvalid() && !mo4779.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    View m5077(int i5) {
        return this.f4190.mo4777(m5069(i5));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m5078() {
        return this.f4190.mo4783() - this.f4192.size();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    View m5079(int i5) {
        return this.f4190.mo4777(i5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    int m5080() {
        return this.f4190.mo4783();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m5081(View view) {
        int mo4787 = this.f4190.mo4787(view);
        if (mo4787 >= 0) {
            this.f4191.m5096(mo4787);
            m5070(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    int m5082(View view) {
        int mo4787 = this.f4190.mo4787(view);
        if (mo4787 == -1 || this.f4191.m5092(mo4787)) {
            return -1;
        }
        return mo4787 - this.f4191.m5091(mo4787);
    }

    /* renamed from: י, reason: contains not printable characters */
    boolean m5083(View view) {
        return this.f4192.contains(view);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m5084() {
        this.f4191.m5095();
        for (int size = this.f4192.size() - 1; size >= 0; size--) {
            this.f4190.mo4781(this.f4192.get(size));
            this.f4192.remove(size);
        }
        this.f4190.mo4785();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m5085(View view) {
        int i5 = this.f4193;
        if (i5 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f4193 = 1;
            this.f4194 = view;
            int mo4787 = this.f4190.mo4787(view);
            if (mo4787 < 0) {
                return;
            }
            if (this.f4191.m5094(mo4787)) {
                m5071(view);
            }
            this.f4190.mo4784(mo4787);
        } finally {
            this.f4193 = 0;
            this.f4194 = null;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m5086(int i5) {
        int i6 = this.f4193;
        if (i6 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i6 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int m5069 = m5069(i5);
            View mo4777 = this.f4190.mo4777(m5069);
            if (mo4777 == null) {
                return;
            }
            this.f4193 = 1;
            this.f4194 = mo4777;
            if (this.f4191.m5094(m5069)) {
                m5071(mo4777);
            }
            this.f4190.mo4784(m5069);
        } finally {
            this.f4193 = 0;
            this.f4194 = null;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    boolean m5087(View view) {
        int i5 = this.f4193;
        if (i5 == 1) {
            if (this.f4194 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i5 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f4193 = 2;
            int mo4787 = this.f4190.mo4787(view);
            if (mo4787 == -1) {
                m5071(view);
                return true;
            }
            if (!this.f4191.m5092(mo4787)) {
                return false;
            }
            this.f4191.m5094(mo4787);
            m5071(view);
            this.f4190.mo4784(mo4787);
            return true;
        } finally {
            this.f4193 = 0;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m5088(View view) {
        int mo4787 = this.f4190.mo4787(view);
        if (mo4787 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4191.m5092(mo4787)) {
            this.f4191.m5090(mo4787);
            m5071(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }
}
