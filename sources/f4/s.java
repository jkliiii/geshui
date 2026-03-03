package f4;

/* compiled from: ReflectionFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {
    /* renamed from: ʼ, reason: contains not printable characters */
    public j4.b m8640(Class cls) {
        return new e(cls);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public j4.c m8641(Class cls, String str) {
        return new m(cls, str);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m8643(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public String m8644(l lVar) {
        return m8643(lVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public j4.d m8639(i iVar) {
        return iVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public j4.e m8642(n nVar) {
        return nVar;
    }
}
