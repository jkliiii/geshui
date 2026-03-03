package f4;

/* compiled from: PackageReference.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m implements d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Class<?> f7796;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f7797;

    public m(Class<?> cls, String str) {
        k.m8623(cls, "jClass");
        k.m8623(str, "moduleName");
        this.f7796 = cls;
        this.f7797 = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.m8619(mo8615(), ((m) obj).mo8615());
    }

    public int hashCode() {
        return mo8615().hashCode();
    }

    public String toString() {
        return mo8615().toString() + " (Kotlin reflection is not available)";
    }

    @Override // f4.d
    /* renamed from: ʻ */
    public Class<?> mo8615() {
        return this.f7796;
    }
}
