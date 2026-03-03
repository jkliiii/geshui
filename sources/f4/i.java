package f4;

/* compiled from: FunctionReference.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends c implements h, j4.d {

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f7793;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final int f7794;

    public i(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f7793 = i5;
        this.f7794 = i6 >> 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return m8611().equals(iVar.m8611()) && m8613().equals(iVar.m8613()) && this.f7794 == iVar.f7794 && this.f7793 == iVar.f7793 && k.m8619(m8610(), iVar.m8610()) && k.m8619(m8612(), iVar.m8612());
        }
        if (obj instanceof j4.d) {
            return obj.equals(mo8608());
        }
        return false;
    }

    public int hashCode() {
        return (((m8612() == null ? 0 : m8612().hashCode() * 31) + m8611().hashCode()) * 31) + m8613().hashCode();
    }

    public String toString() {
        j4.a mo8608 = mo8608();
        if (mo8608 != this) {
            return mo8608.toString();
        }
        if ("<init>".equals(m8611())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + m8611() + " (Kotlin reflection is not available)";
    }

    @Override // f4.c
    /* renamed from: ʽ */
    protected j4.a mo8609() {
        return r.m8633(this);
    }

    @Override // f4.h
    /* renamed from: ʿ */
    public int mo8618() {
        return this.f7793;
    }
}
