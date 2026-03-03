package n2;

import android.text.TextUtils;

/* compiled from: BasicNameValuePair.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p implements x, Cloneable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f9667;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final String f9668;

    public p(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f9667 = str;
        this.f9668 = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f9667.equals(pVar.f9667) && TextUtils.equals(this.f9668, pVar.f9668);
    }

    @Override // n2.x
    public String getName() {
        return this.f9667;
    }

    @Override // n2.x
    public String getValue() {
        return this.f9668;
    }

    public int hashCode() {
        return this.f9667.hashCode() ^ this.f9668.hashCode();
    }

    public String toString() {
        return this.f9667 + "=" + this.f9668;
    }
}
