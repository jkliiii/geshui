package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: CardViewBaseImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g implements i {

    /* renamed from: ʻ, reason: contains not printable characters */
    final RectF f1544 = new RectF();

    g() {
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private l m1685(Context context, ColorStateList colorStateList, float f5, float f6, float f7) {
        return new l(context.getResources(), colorStateList, f5, f6, f7);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private l m1686(h hVar) {
        return (l) hVar.mo1664();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʻ */
    public float mo1671(h hVar) {
        return m1686(hVar).m1708();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʼ */
    public ColorStateList mo1672(h hVar) {
        return m1686(hVar).m1705();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʽ */
    public void mo1673(h hVar, Context context, ColorStateList colorStateList, float f5, float f6, float f7) {
        l m1685 = m1685(context, colorStateList, f5, f6, f7);
        m1685.m1712(hVar.mo1662());
        hVar.mo1661(m1685);
        mo1676(hVar);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʾ */
    public void mo1674(h hVar, float f5) {
        m1686(hVar).m1714(f5);
        mo1676(hVar);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ʿ */
    public float mo1675(h hVar) {
        return m1686(hVar).m1711();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˆ */
    public void mo1676(h hVar) {
        Rect rect = new Rect();
        m1686(hVar).m1707(rect);
        hVar.mo1660((int) Math.ceil(mo1679(hVar)), (int) Math.ceil(mo1678(hVar)));
        hVar.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˉ */
    public float mo1677(h hVar) {
        return m1686(hVar).m1706();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˊ */
    public float mo1678(h hVar) {
        return m1686(hVar).m1709();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˋ */
    public float mo1679(h hVar) {
        return m1686(hVar).m1710();
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˏ */
    public void mo1681(h hVar, float f5) {
        m1686(hVar).m1716(f5);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˑ */
    public void mo1682(h hVar) {
        m1686(hVar).m1712(hVar.mo1662());
        mo1676(hVar);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: י */
    public void mo1683(h hVar, ColorStateList colorStateList) {
        m1686(hVar).m1713(colorStateList);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ـ */
    public void mo1684(h hVar, float f5) {
        m1686(hVar).m1715(f5);
        mo1676(hVar);
    }

    @Override // androidx.cardview.widget.i
    /* renamed from: ˎ */
    public void mo1680(h hVar) {
    }
}
