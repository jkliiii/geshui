package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.a0;
import java.util.stream.IntStream;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m implements Spannable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f3293 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Spannable f3294;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static IntStream m3868(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static IntStream m3869(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    static class b {
        b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean mo3870(CharSequence charSequence) {
            return charSequence instanceof a0;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.m.b
        /* renamed from: ʻ */
        boolean mo3870(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof a0);
        }
    }

    m(Spannable spannable) {
        this.f3294 = spannable;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3865() {
        Spannable spannable = this.f3294;
        if (!this.f3293 && m3866().mo3870(spannable)) {
            this.f3294 = new SpannableString(spannable);
        }
        this.f3293 = true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static b m3866() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i5) {
        return this.f3294.charAt(i5);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m3868(this.f3294);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m3869(this.f3294);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3294.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3294.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3294.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i5, int i6, Class<T> cls) {
        return (T[]) this.f3294.getSpans(i5, i6, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3294.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i5, int i6, Class cls) {
        return this.f3294.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m3865();
        this.f3294.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i5, int i6, int i7) {
        m3865();
        this.f3294.setSpan(obj, i5, i6, i7);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i5, int i6) {
        return this.f3294.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3294.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    Spannable m3867() {
        return this.f3294;
    }

    m(CharSequence charSequence) {
        this.f3294 = new SpannableString(charSequence);
    }
}
