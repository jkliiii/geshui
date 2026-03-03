package i4;

import f4.g;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends i4.a {

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final a f8593 = new a(null);

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final c f8594 = new c(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public c(int i5, int i6) {
        super(i5, i6, 1);
    }

    @Override // i4.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (m9245() != cVar.m9245() || m9246() != cVar.m9246()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i4.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m9245() * 31) + m9246();
    }

    @Override // i4.a
    public boolean isEmpty() {
        return m9245() > m9246();
    }

    @Override // i4.a
    public String toString() {
        return m9245() + ".." + m9246();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m9250(int i5) {
        return m9245() <= i5 && i5 <= m9246();
    }
}
