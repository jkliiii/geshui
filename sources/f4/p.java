package f4;

/* compiled from: PropertyReference.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class p extends c implements j4.f {

    /* renamed from: ˎ, reason: contains not printable characters */
    private final boolean f7798;

    public p() {
        this.f7798 = false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return m8612().equals(pVar.m8612()) && m8611().equals(pVar.m8611()) && m8613().equals(pVar.m8613()) && k.m8619(m8610(), pVar.m8610());
        }
        if (obj instanceof j4.f) {
            return obj.equals(mo8608());
        }
        return false;
    }

    public int hashCode() {
        return (((m8612().hashCode() * 31) + m8611().hashCode()) * 31) + m8613().hashCode();
    }

    public String toString() {
        j4.a mo8608 = mo8608();
        if (mo8608 != this) {
            return mo8608.toString();
        }
        return "property " + m8611() + " (Kotlin reflection is not available)";
    }

    @Override // f4.c
    /* renamed from: ʻ */
    public j4.a mo8608() {
        return this.f7798 ? this : super.mo8608();
    }

    public p(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f7798 = (i5 & 2) == 2;
    }
}
