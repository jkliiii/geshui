package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f implements i {
    f() {
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private k m1670(h hVar) {
        return (k) hVar.mo1664();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʻ, reason: contains not printable characters */
    public float mo1671(h hVar) {
        return m1670(hVar).m1692();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʼ, reason: contains not printable characters */
    public ColorStateList mo1672(h hVar) {
        return m1670(hVar).m1691();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo1673(h hVar, Context context, ColorStateList colorStateList, float f5, float f6, float f7) {
        hVar.mo1661(new k(colorStateList, f5));
        View mo1659 = hVar.mo1659();
        mo1659.setClipToOutline(true);
        mo1659.setElevation(f6);
        mo1684(hVar, f7);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo1674(h hVar, float f5) {
        m1670(hVar).m1696(f5);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʿ, reason: contains not printable characters */
    public float mo1675(h hVar) {
        return hVar.mo1659().getElevation();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo1676(h hVar) {
        if (!hVar.mo1663()) {
            hVar.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float mo1671 = mo1671(hVar);
        float mo1677 = mo1677(hVar);
        int ceil = (int) Math.ceil(l.m1699(mo1671, mo1677, hVar.mo1662()));
        int ceil2 = (int) Math.ceil(l.m1700(mo1671, mo1677, hVar.mo1662()));
        hVar.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˉ, reason: contains not printable characters */
    public float mo1677(h hVar) {
        return m1670(hVar).m1693();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˊ, reason: contains not printable characters */
    public float mo1678(h hVar) {
        return mo1677(hVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˋ, reason: contains not printable characters */
    public float mo1679(h hVar) {
        return mo1677(hVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo1680(h hVar) {
        mo1684(hVar, mo1671(hVar));
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˏ, reason: contains not printable characters */
    public void mo1681(h hVar, float f5) {
        hVar.mo1659().setElevation(f5);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˑ, reason: contains not printable characters */
    public void mo1682(h hVar) {
        mo1684(hVar, mo1671(hVar));
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: י, reason: contains not printable characters */
    public void mo1683(h hVar, ColorStateList colorStateList) {
        m1670(hVar).m1694(colorStateList);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ـ, reason: contains not printable characters */
    public void mo1684(h hVar, float f5) {
        m1670(hVar).m1695(f5, hVar.mo1663(), hVar.mo1662());
        mo1676(hVar);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˈ */
    public void mo1665() {
    }
}
