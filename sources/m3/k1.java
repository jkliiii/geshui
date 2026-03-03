package m3;

import android.content.res.Configuration;
import java.util.List;

/* compiled from: XViewHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private List<n3.r0> f9245;

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m10026(j2.f fVar, n3.r0 r0Var) {
        r0Var.m10848();
        r0Var.m10846();
        fVar.removeView(r0Var.m10847());
        this.f9245.remove(r0Var);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m10027(Configuration configuration) {
        List<n3.r0> list = this.f9245;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9245.get(i5).onConfigurationChanged(configuration);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m10028() {
        List<n3.r0> list = this.f9245;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9245.get(i5).m10848();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10029() {
        List<n3.r0> list = this.f9245;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9245.get(i5).m10843();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m10030() {
        List<n3.r0> list = this.f9245;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9245.get(i5).m10844();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m10031() {
        List<n3.r0> list = this.f9245;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9245.get(i5).m10845();
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m10032(j2.f fVar) {
        if (this.f9245 == null) {
            return;
        }
        while (this.f9245.size() > 0) {
            m10026(fVar, this.f9245.get(0));
        }
    }
}
