package l3;

import g3.a0;
import java.util.List;

/* compiled from: LTDefaultPage.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {
    public List<b> actions;
    public String btp;
    public b left;
    public String otp;
    public b right;
    public String script;
    public boolean share = true;
    public boolean showTitle = false;
    public String stp;
    public String style;

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized boolean m9733(String str) {
        return a0.m8709(this.btp, str);
    }

    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public d clone() {
        d dVar = new d();
        dVar.share = this.share;
        dVar.style = this.style;
        dVar.script = this.script;
        dVar.showTitle = this.showTitle;
        dVar.actions = this.actions;
        dVar.left = this.left;
        dVar.right = this.right;
        dVar.stp = this.stp;
        return dVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m9735(d dVar) {
        if (dVar == null) {
            return;
        }
        this.share = dVar.share;
        this.showTitle = dVar.showTitle;
        String str = dVar.style;
        if (str != null) {
            this.style = str;
        }
        String str2 = dVar.script;
        if (str2 != null) {
            this.script = str2;
        }
        List<b> list = dVar.actions;
        if (list != null) {
            this.actions = list;
        }
        b bVar = dVar.left;
        if (bVar != null) {
            this.left = bVar;
        }
        b bVar2 = dVar.right;
        if (bVar2 != null) {
            this.right = bVar2;
        }
        String str3 = dVar.stp;
        if (str3 != null) {
            this.stp = str3;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public synchronized boolean m9737(String str) {
        return a0.m8709(this.otp, str);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public synchronized boolean m9738(String str) {
        return a0.m8709(this.stp, str);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m9736() {
    }
}
