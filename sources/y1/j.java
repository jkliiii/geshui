package y1;

/* compiled from: MultiClassKey.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Class<?> f12459;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Class<?> f12460;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Class<?> f12461;

    public j() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12459.equals(jVar.f12459) && this.f12460.equals(jVar.f12460) && l.m12898(this.f12461, jVar.f12461);
    }

    public int hashCode() {
        int hashCode = ((this.f12459.hashCode() * 31) + this.f12460.hashCode()) * 31;
        Class<?> cls = this.f12461;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f12459 + ", second=" + this.f12460 + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m12889(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f12459 = cls;
        this.f12460 = cls2;
        this.f12461 = cls3;
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        m12889(cls, cls2, cls3);
    }
}
