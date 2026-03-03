package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* compiled from: ActionBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    public interface b {
        void onMenuVisibilityChanged(boolean z5);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        public abstract CharSequence m493();

        /* renamed from: ʼ, reason: contains not printable characters */
        public abstract View m494();

        /* renamed from: ʽ, reason: contains not printable characters */
        public abstract Drawable m495();

        /* renamed from: ʾ, reason: contains not printable characters */
        public abstract CharSequence m496();

        /* renamed from: ʿ, reason: contains not printable characters */
        public abstract void m497();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean mo475() {
        return false;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public abstract boolean mo476();

    /* renamed from: ˉ, reason: contains not printable characters */
    public abstract void mo477(boolean z5);

    /* renamed from: ˊ, reason: contains not printable characters */
    public abstract int mo478();

    /* renamed from: ˋ, reason: contains not printable characters */
    public abstract Context mo479();

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean mo480() {
        return false;
    }

    /* renamed from: י, reason: contains not printable characters */
    public abstract boolean mo483(int i5, KeyEvent keyEvent);

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean mo484(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean mo485() {
        return false;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public abstract void mo486(boolean z5);

    /* renamed from: ᴵ, reason: contains not printable characters */
    public abstract void mo487(boolean z5);

    /* renamed from: ᵎ, reason: contains not printable characters */
    public abstract void mo488(Drawable drawable);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public abstract void mo489(boolean z5);

    /* renamed from: ᵢ, reason: contains not printable characters */
    public abstract void mo490(boolean z5);

    /* renamed from: ⁱ, reason: contains not printable characters */
    public abstract void mo491(CharSequence charSequence);

    /* renamed from: ﹳ, reason: contains not printable characters */
    public androidx.appcompat.view.b mo492(b.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0012a extends ViewGroup.MarginLayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f402;

        public C0012a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f402 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f7329);
            this.f402 = obtainStyledAttributes.getInt(e.j.f7331, 0);
            obtainStyledAttributes.recycle();
        }

        public C0012a(int i5, int i6) {
            super(i5, i6);
            this.f402 = 8388627;
        }

        public C0012a(C0012a c0012a) {
            super((ViewGroup.MarginLayoutParams) c0012a);
            this.f402 = 0;
            this.f402 = c0012a.f402;
        }

        public C0012a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f402 = 0;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void mo481(Configuration configuration) {
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void mo482() {
    }
}
