package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a implements h.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private androidx.core.util.e<b> f4178;

    /* renamed from: ʼ, reason: contains not printable characters */
    final ArrayList<b> f4179;

    /* renamed from: ʽ, reason: contains not printable characters */
    final ArrayList<b> f4180;

    /* renamed from: ʾ, reason: contains not printable characters */
    final InterfaceC0058a f4181;

    /* renamed from: ʿ, reason: contains not printable characters */
    Runnable f4182;

    /* renamed from: ˆ, reason: contains not printable characters */
    final boolean f4183;

    /* renamed from: ˈ, reason: contains not printable characters */
    final h f4184;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f4185;

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0058a {
        /* renamed from: ʻ */
        void mo4794(int i5, int i6);

        /* renamed from: ʼ */
        void mo4795(b bVar);

        /* renamed from: ʽ */
        RecyclerView.f0 mo4796(int i5);

        /* renamed from: ʾ */
        void mo4797(int i5, int i6);

        /* renamed from: ʿ */
        void mo4798(int i5, int i6);

        /* renamed from: ˆ */
        void mo4799(int i5, int i6);

        /* renamed from: ˈ */
        void mo4800(b bVar);

        /* renamed from: ˉ */
        void mo4801(int i5, int i6, Object obj);
    }

    /* compiled from: AdapterHelper.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4186;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4187;

        /* renamed from: ʽ, reason: contains not printable characters */
        Object f4188;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4189;

        b(int i5, int i6, int i7, Object obj) {
            this.f4186 = i5;
            this.f4187 = i6;
            this.f4189 = i7;
            this.f4188 = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i5 = this.f4186;
            if (i5 != bVar.f4186) {
                return false;
            }
            if (i5 == 8 && Math.abs(this.f4189 - this.f4187) == 1 && this.f4189 == bVar.f4187 && this.f4187 == bVar.f4189) {
                return true;
            }
            if (this.f4189 != bVar.f4189 || this.f4187 != bVar.f4187) {
                return false;
            }
            Object obj2 = this.f4188;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4188)) {
                    return false;
                }
            } else if (bVar.f4188 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4186 * 31) + this.f4187) * 31) + this.f4189;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m5068() + ",s:" + this.f4187 + "c:" + this.f4189 + ",p:" + this.f4188 + "]";
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        String m5068() {
            int i5 = this.f4186;
            return i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }
    }

    a(InterfaceC0058a interfaceC0058a) {
        this(interfaceC0058a, false);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5045(b bVar) {
        m5051(bVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m5046(b bVar) {
        m5051(bVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5047(b bVar) {
        boolean z5;
        char c6;
        int i5 = bVar.f4187;
        int i6 = bVar.f4189 + i5;
        char c7 = 65535;
        int i7 = i5;
        int i8 = 0;
        while (i7 < i6) {
            if (this.f4181.mo4796(i7) != null || m5049(i7)) {
                if (c7 == 0) {
                    m5050(mo5054(2, i5, i8, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 1;
            } else {
                if (c7 == 1) {
                    m5051(mo5054(2, i5, i8, null));
                    z5 = true;
                } else {
                    z5 = false;
                }
                c6 = 0;
            }
            if (z5) {
                i7 -= i8;
                i6 -= i8;
                i8 = 1;
            } else {
                i8++;
            }
            i7++;
            c7 = c6;
        }
        if (i8 != bVar.f4189) {
            mo5053(bVar);
            bVar = mo5054(2, i5, i8, null);
        }
        if (c7 == 0) {
            m5050(bVar);
        } else {
            m5051(bVar);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5048(b bVar) {
        int i5 = bVar.f4187;
        int i6 = bVar.f4189 + i5;
        int i7 = i5;
        char c6 = 65535;
        int i8 = 0;
        while (i5 < i6) {
            if (this.f4181.mo4796(i5) != null || m5049(i5)) {
                if (c6 == 0) {
                    m5050(mo5054(4, i7, i8, bVar.f4188));
                    i7 = i5;
                    i8 = 0;
                }
                c6 = 1;
            } else {
                if (c6 == 1) {
                    m5051(mo5054(4, i7, i8, bVar.f4188));
                    i7 = i5;
                    i8 = 0;
                }
                c6 = 0;
            }
            i8++;
            i5++;
        }
        if (i8 != bVar.f4189) {
            Object obj = bVar.f4188;
            mo5053(bVar);
            bVar = mo5054(4, i7, i8, obj);
        }
        if (c6 == 0) {
            m5050(bVar);
        } else {
            m5051(bVar);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m5049(int i5) {
        int size = this.f4180.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = this.f4180.get(i6);
            int i7 = bVar.f4186;
            if (i7 == 8) {
                if (m5060(bVar.f4189, i6 + 1) == i5) {
                    return true;
                }
            } else if (i7 == 1) {
                int i8 = bVar.f4187;
                int i9 = bVar.f4189 + i8;
                while (i8 < i9) {
                    if (m5060(i8, i6 + 1) == i5) {
                        return true;
                    }
                    i8++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5050(b bVar) {
        int i5;
        int i6 = bVar.f4186;
        if (i6 == 1 || i6 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m5052 = m5052(bVar.f4187, i6);
        int i7 = bVar.f4187;
        int i8 = bVar.f4186;
        if (i8 == 2) {
            i5 = 0;
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i5 = 1;
        }
        int i9 = 1;
        for (int i10 = 1; i10 < bVar.f4189; i10++) {
            int m50522 = m5052(bVar.f4187 + (i5 * i10), bVar.f4186);
            int i11 = bVar.f4186;
            if (i11 == 2 ? m50522 == m5052 : i11 == 4 && m50522 == m5052 + 1) {
                i9++;
            } else {
                b mo5054 = mo5054(i11, m5052, i9, bVar.f4188);
                m5058(mo5054, i7);
                mo5053(mo5054);
                if (bVar.f4186 == 4) {
                    i7 += i9;
                }
                m5052 = m50522;
                i9 = 1;
            }
        }
        Object obj = bVar.f4188;
        mo5053(bVar);
        if (i9 > 0) {
            b mo50542 = mo5054(bVar.f4186, m5052, i9, obj);
            m5058(mo50542, i7);
            mo5053(mo50542);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m5051(b bVar) {
        this.f4180.add(bVar);
        int i5 = bVar.f4186;
        if (i5 == 1) {
            this.f4181.mo4798(bVar.f4187, bVar.f4189);
            return;
        }
        if (i5 == 2) {
            this.f4181.mo4797(bVar.f4187, bVar.f4189);
            return;
        }
        if (i5 == 4) {
            this.f4181.mo4801(bVar.f4187, bVar.f4189, bVar.f4188);
        } else {
            if (i5 == 8) {
                this.f4181.mo4794(bVar.f4187, bVar.f4189);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int m5052(int i5, int i6) {
        int i7;
        int i8;
        for (int size = this.f4180.size() - 1; size >= 0; size--) {
            b bVar = this.f4180.get(size);
            int i9 = bVar.f4186;
            if (i9 == 8) {
                int i10 = bVar.f4187;
                int i11 = bVar.f4189;
                if (i10 < i11) {
                    i8 = i10;
                    i7 = i11;
                } else {
                    i7 = i10;
                    i8 = i11;
                }
                if (i5 < i8 || i5 > i7) {
                    if (i5 < i10) {
                        if (i6 == 1) {
                            bVar.f4187 = i10 + 1;
                            bVar.f4189 = i11 + 1;
                        } else if (i6 == 2) {
                            bVar.f4187 = i10 - 1;
                            bVar.f4189 = i11 - 1;
                        }
                    }
                } else if (i8 == i10) {
                    if (i6 == 1) {
                        bVar.f4189 = i11 + 1;
                    } else if (i6 == 2) {
                        bVar.f4189 = i11 - 1;
                    }
                    i5++;
                } else {
                    if (i6 == 1) {
                        bVar.f4187 = i10 + 1;
                    } else if (i6 == 2) {
                        bVar.f4187 = i10 - 1;
                    }
                    i5--;
                }
            } else {
                int i12 = bVar.f4187;
                if (i12 <= i5) {
                    if (i9 == 1) {
                        i5 -= bVar.f4189;
                    } else if (i9 == 2) {
                        i5 += bVar.f4189;
                    }
                } else if (i6 == 1) {
                    bVar.f4187 = i12 + 1;
                } else if (i6 == 2) {
                    bVar.f4187 = i12 - 1;
                }
            }
        }
        for (int size2 = this.f4180.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4180.get(size2);
            if (bVar2.f4186 == 8) {
                int i13 = bVar2.f4189;
                if (i13 == bVar2.f4187 || i13 < 0) {
                    this.f4180.remove(size2);
                    mo5053(bVar2);
                }
            } else if (bVar2.f4189 <= 0) {
                this.f4180.remove(size2);
                mo5053(bVar2);
            }
        }
        return i5;
    }

    @Override // androidx.recyclerview.widget.h.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo5053(b bVar) {
        if (this.f4183) {
            return;
        }
        bVar.f4188 = null;
        this.f4178.mo2574(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public b mo5054(int i5, int i6, int i7, Object obj) {
        b mo2575 = this.f4178.mo2575();
        if (mo2575 == null) {
            return new b(i5, i6, i7, obj);
        }
        mo2575.f4186 = i5;
        mo2575.f4187 = i6;
        mo2575.f4189 = i7;
        mo2575.f4188 = obj;
        return mo2575;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m5055(int i5) {
        int size = this.f4179.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = this.f4179.get(i6);
            int i7 = bVar.f4186;
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = bVar.f4187;
                    if (i8 <= i5) {
                        int i9 = bVar.f4189;
                        if (i8 + i9 > i5) {
                            return -1;
                        }
                        i5 -= i9;
                    } else {
                        continue;
                    }
                } else if (i7 == 8) {
                    int i10 = bVar.f4187;
                    if (i10 == i5) {
                        i5 = bVar.f4189;
                    } else {
                        if (i10 < i5) {
                            i5--;
                        }
                        if (bVar.f4189 <= i5) {
                            i5++;
                        }
                    }
                }
            } else if (bVar.f4187 <= i5) {
                i5 += bVar.f4189;
            }
        }
        return i5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m5056() {
        int size = this.f4180.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4181.mo4795(this.f4180.get(i5));
        }
        m5066(this.f4180);
        this.f4185 = 0;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m5057() {
        m5056();
        int size = this.f4179.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f4179.get(i5);
            int i6 = bVar.f4186;
            if (i6 == 1) {
                this.f4181.mo4795(bVar);
                this.f4181.mo4798(bVar.f4187, bVar.f4189);
            } else if (i6 == 2) {
                this.f4181.mo4795(bVar);
                this.f4181.mo4799(bVar.f4187, bVar.f4189);
            } else if (i6 == 4) {
                this.f4181.mo4795(bVar);
                this.f4181.mo4801(bVar.f4187, bVar.f4189, bVar.f4188);
            } else if (i6 == 8) {
                this.f4181.mo4795(bVar);
                this.f4181.mo4794(bVar.f4187, bVar.f4189);
            }
            Runnable runnable = this.f4182;
            if (runnable != null) {
                runnable.run();
            }
        }
        m5066(this.f4179);
        this.f4185 = 0;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m5058(b bVar, int i5) {
        this.f4181.mo4800(bVar);
        int i6 = bVar.f4186;
        if (i6 == 2) {
            this.f4181.mo4799(i5, bVar.f4189);
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4181.mo4801(i5, bVar.f4189, bVar.f4188);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    int m5059(int i5) {
        return m5060(i5, 0);
    }

    /* renamed from: י, reason: contains not printable characters */
    int m5060(int i5, int i6) {
        int size = this.f4180.size();
        while (i6 < size) {
            b bVar = this.f4180.get(i6);
            int i7 = bVar.f4186;
            if (i7 == 8) {
                int i8 = bVar.f4187;
                if (i8 == i5) {
                    i5 = bVar.f4189;
                } else {
                    if (i8 < i5) {
                        i5--;
                    }
                    if (bVar.f4189 <= i5) {
                        i5++;
                    }
                }
            } else {
                int i9 = bVar.f4187;
                if (i9 > i5) {
                    continue;
                } else if (i7 == 2) {
                    int i10 = bVar.f4189;
                    if (i5 < i9 + i10) {
                        return -1;
                    }
                    i5 -= i10;
                } else if (i7 == 1) {
                    i5 += bVar.f4189;
                }
            }
            i6++;
        }
        return i5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    boolean m5061(int i5) {
        return (i5 & this.f4185) != 0;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean m5062() {
        return this.f4179.size() > 0;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean m5063() {
        return (this.f4180.isEmpty() || this.f4179.isEmpty()) ? false : true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    boolean m5064(int i5, int i6, Object obj) {
        if (i6 < 1) {
            return false;
        }
        this.f4179.add(mo5054(4, i5, i6, obj));
        this.f4185 |= 4;
        return this.f4179.size() == 1;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m5065() {
        this.f4184.m5163(this.f4179);
        int size = this.f4179.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = this.f4179.get(i5);
            int i6 = bVar.f4186;
            if (i6 == 1) {
                m5045(bVar);
            } else if (i6 == 2) {
                m5047(bVar);
            } else if (i6 == 4) {
                m5048(bVar);
            } else if (i6 == 8) {
                m5046(bVar);
            }
            Runnable runnable = this.f4182;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4179.clear();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m5066(List<b> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            mo5053(list.get(i5));
        }
        list.clear();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m5067() {
        m5066(this.f4179);
        m5066(this.f4180);
        this.f4185 = 0;
    }

    a(InterfaceC0058a interfaceC0058a, boolean z5) {
        this.f4178 = new androidx.core.util.f(30);
        this.f4179 = new ArrayList<>();
        this.f4180 = new ArrayList<>();
        this.f4185 = 0;
        this.f4181 = interfaceC0058a;
        this.f4183 = z5;
        this.f4184 = new h(this);
    }
}
