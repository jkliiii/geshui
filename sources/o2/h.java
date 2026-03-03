package o2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import k2.f0;
import k2.u;
import n2.w;
import n2.x;

/* compiled from: UrlEncodedFormBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h implements a<w> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private w f10096;

    /* renamed from: ʼ, reason: contains not printable characters */
    private byte[] f10097;

    public h(w wVar) {
        this.f10096 = wVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m10988() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<x> it = this.f10096.iterator();
            boolean z5 = true;
            while (it.hasNext()) {
                x next = it.next();
                if (next.getValue() != null) {
                    if (!z5) {
                        sb.append('&');
                    }
                    sb.append(URLEncoder.encode(next.getName(), "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode(next.getValue(), "UTF-8"));
                    z5 = false;
                }
            }
            this.f10097 = sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // o2.a
    public int length() {
        if (this.f10097 == null) {
            m10988();
        }
        return this.f10097.length;
    }

    @Override // o2.a
    /* renamed from: ʻʻ */
    public void mo10974(n2.e eVar, u uVar, l2.a aVar) {
        if (this.f10097 == null) {
            m10988();
        }
        f0.m9429(uVar, this.f10097, aVar);
    }

    @Override // o2.a
    /* renamed from: ﹶ */
    public String mo10975() {
        return "application/x-www-form-urlencoded; charset=utf-8";
    }
}
