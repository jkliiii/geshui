package o2;

import java.util.List;
import java.util.Locale;
import k2.u;
import n2.s;
import n2.w;
import n2.x;

/* compiled from: Part.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    s f10090;

    /* renamed from: ʼ, reason: contains not printable characters */
    w f10091;

    /* renamed from: ʽ, reason: contains not printable characters */
    private long f10092;

    public d(s sVar) {
        this.f10092 = -1L;
        this.f10090 = sVar;
        this.f10091 = w.m10573(sVar.m10554("Content-Disposition"));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public String m10983() {
        return this.f10091.m10576("name");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public s m10984() {
        return this.f10090;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public long m10985() {
        return this.f10092;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m10986(String str) {
        this.f10090.m10557("Content-Type", str);
    }

    public d(String str, long j5, List<x> list) {
        this.f10092 = j5;
        this.f10090 = new s();
        StringBuilder sb = new StringBuilder(String.format(Locale.ENGLISH, "form-data; name=\"%s\"", str));
        if (list != null) {
            for (x xVar : list) {
                sb.append(String.format(Locale.ENGLISH, "; %s=\"%s\"", xVar.getName(), xVar.getValue()));
            }
        }
        this.f10090.m10557("Content-Disposition", sb.toString());
        this.f10091 = w.m10573(this.f10090.m10554("Content-Disposition"));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo10987(u uVar, l2.a aVar) {
    }
}
