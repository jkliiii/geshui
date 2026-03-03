package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.b;

/* compiled from: StateListDrawableCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends b {

    /* renamed from: ٴ, reason: contains not printable characters */
    private a f683;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f684;

    /* compiled from: StateListDrawableCompat.java */
    static class a extends b.d {

        /* renamed from: ˉˉ, reason: contains not printable characters */
        int[][] f685;

        a(a aVar, h hVar, Resources resources) {
            super(aVar, hVar, resources);
            if (aVar != null) {
                this.f685 = aVar.f685;
            } else {
                this.f685 = new int[m797()][];
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        /* renamed from: ـ */
        public void mo806(int i5, int i6) {
            super.mo806(i5, i6);
            int[][] iArr = new int[i6][];
            System.arraycopy(this.f685, 0, iArr, 0, i5);
            this.f685 = iArr;
        }

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        int m825(int[] iArr) {
            int[][] iArr2 = this.f685;
            int m799 = m799();
            for (int i5 = 0; i5 < m799; i5++) {
                if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                    return i5;
                }
            }
            return -1;
        }

        @Override // androidx.appcompat.graphics.drawable.b.d
        /* renamed from: ᴵ */
        void mo773() {
            int[][] iArr = this.f685;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f685[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f685 = iArr2;
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        int m826(int[] iArr, Drawable drawable) {
            int m793 = m793(drawable);
            this.f685[m793] = iArr;
            return m793;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this, resources);
        }
    }

    h(a aVar, Resources resources) {
        mo760(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f684 && super.mutate() == this) {
            this.f683.mo773();
            this.f684 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m825 = this.f683.m825(iArr);
        if (m825 < 0) {
            m825 = this.f683.m825(StateSet.WILD_CARD);
        }
        return m784(m825) || onStateChange;
    }

    @Override // androidx.appcompat.graphics.drawable.b
    /* renamed from: ˉ */
    void mo760(b.d dVar) {
        super.mo760(dVar);
        if (dVar instanceof a) {
            this.f683 = (a) dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    /* renamed from: ˋ, reason: merged with bridge method [inline-methods] */
    public a mo759() {
        return new a(this.f683, this, null);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    int[] m824(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i5 = 0;
        for (int i6 = 0; i6 < attributeCount; i6++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i6);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i7 = i5 + 1;
                if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i5] = attributeNameResource;
                i5 = i7;
            }
        }
        return StateSet.trimStateSet(iArr, i5);
    }

    h(a aVar) {
        if (aVar != null) {
            mo760(aVar);
        }
    }
}
