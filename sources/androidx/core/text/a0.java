package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a0 implements Spannable {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Object f2815 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Spannable f2816;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final a f2817;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final PrecomputedText f2818;

    @Override // java.lang.CharSequence
    public char charAt(int i5) {
        return this.f2816.charAt(i5);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2816.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2816.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2816.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i5, int i6, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f2818.getSpans(i5, i6, cls) : (T[]) this.f2816.getSpans(i5, i6, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2816.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i5, int i6, Class cls) {
        return this.f2816.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2818.removeSpan(obj);
        } else {
            this.f2816.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i5, int i6, int i7) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2818.setSpan(obj, i5, i6, i7);
        } else {
            this.f2816.setSpan(obj, i5, i6, i7);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i5, int i6) {
        return this.f2816.subSequence(i5, i6);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2816.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public a m2515() {
        return this.f2817;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public PrecomputedText m2516() {
        Spannable spannable = this.f2816;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final TextPaint f2819;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final TextDirectionHeuristic f2820;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2821;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int f2822;

        /* renamed from: ʿ, reason: contains not printable characters */
        final PrecomputedText.Params f2823;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: androidx.core.text.a0$a$a, reason: collision with other inner class name */
        public static class C0031a {

            /* renamed from: ʻ, reason: contains not printable characters */
            private final TextPaint f2824;

            /* renamed from: ʼ, reason: contains not printable characters */
            private TextDirectionHeuristic f2825;

            /* renamed from: ʽ, reason: contains not printable characters */
            private int f2826;

            /* renamed from: ʾ, reason: contains not printable characters */
            private int f2827;

            public C0031a(TextPaint textPaint) {
                this.f2824 = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f2826 = 1;
                    this.f2827 = 1;
                } else {
                    this.f2827 = 0;
                    this.f2826 = 0;
                }
                this.f2825 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            public a m2522() {
                return new a(this.f2824, this.f2825, this.f2826, this.f2827);
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            public C0031a m2523(int i5) {
                this.f2826 = i5;
                return this;
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            public C0031a m2524(int i5) {
                this.f2827 = i5;
                return this;
            }

            /* renamed from: ʾ, reason: contains not printable characters */
            public C0031a m2525(TextDirectionHeuristic textDirectionHeuristic) {
                this.f2825 = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i5, int i6) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2823 = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i5).setHyphenationFrequency(i6).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f2823 = null;
            }
            this.f2819 = textPaint;
            this.f2820 = textDirectionHeuristic;
            this.f2821 = i5;
            this.f2822 = i6;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m2517(aVar) && this.f2820 == aVar.m2520();
        }

        public int hashCode() {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 24 ? androidx.core.util.c.m2569(Float.valueOf(this.f2819.getTextSize()), Float.valueOf(this.f2819.getTextScaleX()), Float.valueOf(this.f2819.getTextSkewX()), Float.valueOf(this.f2819.getLetterSpacing()), Integer.valueOf(this.f2819.getFlags()), this.f2819.getTextLocales(), this.f2819.getTypeface(), Boolean.valueOf(this.f2819.isElegantTextHeight()), this.f2820, Integer.valueOf(this.f2821), Integer.valueOf(this.f2822)) : i5 >= 21 ? androidx.core.util.c.m2569(Float.valueOf(this.f2819.getTextSize()), Float.valueOf(this.f2819.getTextScaleX()), Float.valueOf(this.f2819.getTextSkewX()), Float.valueOf(this.f2819.getLetterSpacing()), Integer.valueOf(this.f2819.getFlags()), this.f2819.getTextLocale(), this.f2819.getTypeface(), Boolean.valueOf(this.f2819.isElegantTextHeight()), this.f2820, Integer.valueOf(this.f2821), Integer.valueOf(this.f2822)) : androidx.core.util.c.m2569(Float.valueOf(this.f2819.getTextSize()), Float.valueOf(this.f2819.getTextScaleX()), Float.valueOf(this.f2819.getTextSkewX()), Integer.valueOf(this.f2819.getFlags()), this.f2819.getTextLocale(), this.f2819.getTypeface(), this.f2820, Integer.valueOf(this.f2821), Integer.valueOf(this.f2822));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f2819.getTextSize());
            sb.append(", textScaleX=" + this.f2819.getTextScaleX());
            sb.append(", textSkewX=" + this.f2819.getTextSkewX());
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                sb.append(", letterSpacing=" + this.f2819.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f2819.isElegantTextHeight());
            }
            if (i5 >= 24) {
                sb.append(", textLocale=" + this.f2819.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f2819.getTextLocale());
            }
            sb.append(", typeface=" + this.f2819.getTypeface());
            if (i5 >= 26) {
                sb.append(", variationSettings=" + this.f2819.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f2820);
            sb.append(", breakStrategy=" + this.f2821);
            sb.append(", hyphenationFrequency=" + this.f2822);
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m2517(a aVar) {
            int i5 = Build.VERSION.SDK_INT;
            if ((i5 >= 23 && (this.f2821 != aVar.m2518() || this.f2822 != aVar.m2519())) || this.f2819.getTextSize() != aVar.m2521().getTextSize() || this.f2819.getTextScaleX() != aVar.m2521().getTextScaleX() || this.f2819.getTextSkewX() != aVar.m2521().getTextSkewX()) {
                return false;
            }
            if ((i5 >= 21 && (this.f2819.getLetterSpacing() != aVar.m2521().getLetterSpacing() || !TextUtils.equals(this.f2819.getFontFeatureSettings(), aVar.m2521().getFontFeatureSettings()))) || this.f2819.getFlags() != aVar.m2521().getFlags()) {
                return false;
            }
            if (i5 >= 24) {
                if (!this.f2819.getTextLocales().equals(aVar.m2521().getTextLocales())) {
                    return false;
                }
            } else if (!this.f2819.getTextLocale().equals(aVar.m2521().getTextLocale())) {
                return false;
            }
            return this.f2819.getTypeface() == null ? aVar.m2521().getTypeface() == null : this.f2819.getTypeface().equals(aVar.m2521().getTypeface());
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m2518() {
            return this.f2821;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m2519() {
            return this.f2822;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public TextDirectionHeuristic m2520() {
            return this.f2820;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public TextPaint m2521() {
            return this.f2819;
        }

        public a(PrecomputedText.Params params) {
            this.f2819 = params.getTextPaint();
            this.f2820 = params.getTextDirection();
            this.f2821 = params.getBreakStrategy();
            this.f2822 = params.getHyphenationFrequency();
            this.f2823 = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
