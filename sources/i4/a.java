package i4;

import f4.g;
import w3.a0;

/* compiled from: Progressions.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements Iterable<Integer> {

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final C0119a f8585 = new C0119a(null);

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f8586;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f8587;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f8588;

    /* compiled from: Progressions.kt */
    /* renamed from: i4.a$a, reason: collision with other inner class name */
    public static final class C0119a {
        private C0119a() {
        }

        public /* synthetic */ C0119a(g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final a m9249(int i5, int i6, int i7) {
            return new a(i5, i6, i7);
        }
    }

    public a(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f8586 = i5;
        this.f8587 = a4.c.m202(i5, i6, i7);
        this.f8588 = i7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f8586 != aVar.f8586 || this.f8587 != aVar.f8587 || this.f8588 != aVar.f8588) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8586 * 31) + this.f8587) * 31) + this.f8588;
    }

    public boolean isEmpty() {
        if (this.f8588 > 0) {
            if (this.f8586 > this.f8587) {
                return true;
            }
        } else if (this.f8586 < this.f8587) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i5;
        if (this.f8588 > 0) {
            sb = new StringBuilder();
            sb.append(this.f8586);
            sb.append("..");
            sb.append(this.f8587);
            sb.append(" step ");
            i5 = this.f8588;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8586);
            sb.append(" downTo ");
            sb.append(this.f8587);
            sb.append(" step ");
            i5 = -this.f8588;
        }
        sb.append(i5);
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int m9245() {
        return this.f8586;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m9246() {
        return this.f8587;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m9247() {
        return this.f8588;
    }

    @Override // java.lang.Iterable
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public a0 iterator() {
        return new b(this.f8586, this.f8587, this.f8588);
    }
}
