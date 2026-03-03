package v2;

import java.util.Hashtable;

/* compiled from: UntypedHashtable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Hashtable<String, Object> f11726 = new Hashtable<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public <T> T m12369(String str) {
        return (T) this.f11726.get(str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m12370(String str, Object obj) {
        this.f11726.put(str, obj);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m12371(String str) {
        this.f11726.remove(str);
    }
}
