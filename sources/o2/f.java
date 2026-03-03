package o2;

import k2.f0;
import k2.u;

/* compiled from: StringBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements a<String> {

    /* renamed from: ʻ, reason: contains not printable characters */
    byte[] f10093;

    /* renamed from: ʼ, reason: contains not printable characters */
    String f10094;

    public f() {
    }

    @Override // o2.a
    public int length() {
        if (this.f10093 == null) {
            this.f10093 = this.f10094.getBytes();
        }
        return this.f10093.length;
    }

    public String toString() {
        return this.f10094;
    }

    @Override // o2.a
    /* renamed from: ʻʻ */
    public void mo10974(n2.e eVar, u uVar, l2.a aVar) {
        if (this.f10093 == null) {
            this.f10093 = this.f10094.getBytes();
        }
        f0.m9429(uVar, this.f10093, aVar);
    }

    @Override // o2.a
    /* renamed from: ﹶ */
    public String mo10975() {
        return "text/plain";
    }

    public f(String str) {
        this();
        this.f10094 = str;
    }
}
