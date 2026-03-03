package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class k {

    /* renamed from: ـ, reason: contains not printable characters */
    static final int f5858;

    /* renamed from: ٴ, reason: contains not printable characters */
    private static boolean f5859;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static Constructor<StaticLayout> f5860;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static Object f5861;

    /* renamed from: ʻ, reason: contains not printable characters */
    private CharSequence f5862;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final TextPaint f5863;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f5864;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5866;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f5873;

    /* renamed from: י, reason: contains not printable characters */
    private StaticLayoutBuilderConfigurer f5875;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f5865 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Layout.Alignment f5867 = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f5868 = Integer.MAX_VALUE;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f5869 = 0.0f;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f5870 = 1.0f;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f5871 = f5858;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f5872 = true;

    /* renamed from: ˑ, reason: contains not printable characters */
    private TextUtils.TruncateAt f5874 = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f5858 = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private k(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f5862 = charSequence;
        this.f5863 = textPaint;
        this.f5864 = i5;
        this.f5866 = charSequence.length();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m6949() throws a {
        if (f5859) {
            return;
        }
        try {
            f5861 = this.f5873 && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f5860 = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f5859 = true;
        } catch (Exception e5) {
            throw new a(e5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static k m6950(CharSequence charSequence, TextPaint textPaint, int i5) {
        return new k(charSequence, textPaint, i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public StaticLayout m6951() throws a {
        if (this.f5862 == null) {
            this.f5862 = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f5864);
        CharSequence charSequence = this.f5862;
        if (this.f5868 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f5863, max, this.f5874);
        }
        int min = Math.min(charSequence.length(), this.f5866);
        this.f5866 = min;
        if (Build.VERSION.SDK_INT < 23) {
            m6949();
            try {
                return (StaticLayout) ((Constructor) androidx.core.util.h.m2583(f5860)).newInstance(charSequence, Integer.valueOf(this.f5865), Integer.valueOf(this.f5866), this.f5863, Integer.valueOf(max), this.f5867, androidx.core.util.h.m2583(f5861), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f5872), null, Integer.valueOf(max), Integer.valueOf(this.f5868));
            } catch (Exception e5) {
                throw new a(e5);
            }
        }
        if (this.f5873 && this.f5868 == 1) {
            this.f5867 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f5865, min, this.f5863, max);
        obtain.setAlignment(this.f5867);
        obtain.setIncludePad(this.f5872);
        obtain.setTextDirection(this.f5873 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5874;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5868);
        float f5 = this.f5869;
        if (f5 != 0.0f || this.f5870 != 1.0f) {
            obtain.setLineSpacing(f5, this.f5870);
        }
        if (this.f5868 > 1) {
            obtain.setHyphenationFrequency(this.f5871);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.f5875;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.configure(obtain);
        }
        return obtain.build();
    }

    @CanIgnoreReturnValue
    /* renamed from: ʾ, reason: contains not printable characters */
    public k m6952(Layout.Alignment alignment) {
        this.f5867 = alignment;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ʿ, reason: contains not printable characters */
    public k m6953(TextUtils.TruncateAt truncateAt) {
        this.f5874 = truncateAt;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ˆ, reason: contains not printable characters */
    public k m6954(int i5) {
        this.f5871 = i5;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ˈ, reason: contains not printable characters */
    public k m6955(boolean z5) {
        this.f5872 = z5;
        return this;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public k m6956(boolean z5) {
        this.f5873 = z5;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ˊ, reason: contains not printable characters */
    public k m6957(float f5, float f6) {
        this.f5869 = f5;
        this.f5870 = f6;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ˋ, reason: contains not printable characters */
    public k m6958(int i5) {
        this.f5868 = i5;
        return this;
    }

    @CanIgnoreReturnValue
    /* renamed from: ˎ, reason: contains not printable characters */
    public k m6959(StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        this.f5875 = staticLayoutBuilderConfigurer;
        return this;
    }
}
