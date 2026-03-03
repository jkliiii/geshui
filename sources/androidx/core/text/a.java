package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: BidiFormatter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʾ, reason: contains not printable characters */
    static final b0 f2798;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final String f2799;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final String f2800;

    /* renamed from: ˈ, reason: contains not printable characters */
    static final a f2801;

    /* renamed from: ˉ, reason: contains not printable characters */
    static final a f2802;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final boolean f2803;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f2804;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final b0 f2805;

    /* compiled from: BidiFormatter.java */
    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0030a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f2806;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f2807;

        /* renamed from: ʽ, reason: contains not printable characters */
        private b0 f2808;

        public C0030a() {
            m2504(a.m2495(Locale.getDefault()));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static a m2503(boolean z5) {
            return z5 ? a.f2802 : a.f2801;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m2504(boolean z5) {
            this.f2806 = z5;
            this.f2808 = a.f2798;
            this.f2807 = 2;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m2505() {
            return (this.f2807 == 2 && this.f2808 == a.f2798) ? m2503(this.f2806) : new a(this.f2806, this.f2807, this.f2808);
        }
    }

    /* compiled from: BidiFormatter.java */
    private static class b {

        /* renamed from: ˆ, reason: contains not printable characters */
        private static final byte[] f2809 = new byte[1792];

        /* renamed from: ʻ, reason: contains not printable characters */
        private final CharSequence f2810;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f2811;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2812;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f2813;

        /* renamed from: ʿ, reason: contains not printable characters */
        private char f2814;

        static {
            for (int i5 = 0; i5 < 1792; i5++) {
                f2809[i5] = Character.getDirectionality(i5);
            }
        }

        b(CharSequence charSequence, boolean z5) {
            this.f2810 = charSequence;
            this.f2811 = z5;
            this.f2812 = charSequence.length();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private static byte m2506(char c6) {
            return c6 < 1792 ? f2809[c6] : Character.getDirectionality(c6);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private byte m2507() {
            char charAt;
            int i5 = this.f2813;
            do {
                int i6 = this.f2813;
                if (i6 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2810;
                int i7 = i6 - 1;
                this.f2813 = i7;
                charAt = charSequence.charAt(i7);
                this.f2814 = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f2813 = i5;
            this.f2814 = ';';
            return (byte) 13;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private byte m2508() {
            char charAt;
            do {
                int i5 = this.f2813;
                if (i5 >= this.f2812) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f2810;
                this.f2813 = i5 + 1;
                charAt = charSequence.charAt(i5);
                this.f2814 = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private byte m2509() {
            char charAt;
            int i5 = this.f2813;
            while (true) {
                int i6 = this.f2813;
                if (i6 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f2810;
                int i7 = i6 - 1;
                this.f2813 = i7;
                char charAt2 = charSequence.charAt(i7);
                this.f2814 = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i8 = this.f2813;
                        if (i8 > 0) {
                            CharSequence charSequence2 = this.f2810;
                            int i9 = i8 - 1;
                            this.f2813 = i9;
                            charAt = charSequence2.charAt(i9);
                            this.f2814 = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f2813 = i5;
            this.f2814 = '>';
            return (byte) 13;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private byte m2510() {
            char charAt;
            int i5 = this.f2813;
            while (true) {
                int i6 = this.f2813;
                if (i6 >= this.f2812) {
                    this.f2813 = i5;
                    this.f2814 = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f2810;
                this.f2813 = i6 + 1;
                char charAt2 = charSequence.charAt(i6);
                this.f2814 = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f2813;
                        if (i7 < this.f2812) {
                            CharSequence charSequence2 = this.f2810;
                            this.f2813 = i7 + 1;
                            charAt = charSequence2.charAt(i7);
                            this.f2814 = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        byte m2511() {
            char charAt = this.f2810.charAt(this.f2813 - 1);
            this.f2814 = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2810, this.f2813);
                this.f2813 -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2813--;
            byte m2506 = m2506(this.f2814);
            if (!this.f2811) {
                return m2506;
            }
            char c6 = this.f2814;
            return c6 == '>' ? m2509() : c6 == ';' ? m2507() : m2506;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        byte m2512() {
            char charAt = this.f2810.charAt(this.f2813);
            this.f2814 = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f2810, this.f2813);
                this.f2813 += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f2813++;
            byte m2506 = m2506(this.f2814);
            if (!this.f2811) {
                return m2506;
            }
            char c6 = this.f2814;
            return c6 == '<' ? m2510() : c6 == '&' ? m2508() : m2506;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        int m2513() {
            this.f2813 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (this.f2813 < this.f2812 && i5 == 0) {
                byte m2512 = m2512();
                if (m2512 != 0) {
                    if (m2512 == 1 || m2512 == 2) {
                        if (i7 == 0) {
                            return 1;
                        }
                    } else if (m2512 != 9) {
                        switch (m2512) {
                            case 14:
                            case 15:
                                i7++;
                                i6 = -1;
                                continue;
                            case 16:
                            case 17:
                                i7++;
                                i6 = 1;
                                continue;
                            case 18:
                                i7--;
                                i6 = 0;
                                continue;
                        }
                    }
                } else if (i7 == 0) {
                    return -1;
                }
                i5 = i7;
            }
            if (i5 == 0) {
                return 0;
            }
            if (i6 != 0) {
                return i6;
            }
            while (this.f2813 > 0) {
                switch (m2511()) {
                    case 14:
                    case 15:
                        if (i5 == i7) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i5 == i7) {
                            return 1;
                        }
                        break;
                    case 18:
                        i7++;
                        continue;
                }
                i7--;
            }
            return 0;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        int m2514() {
            this.f2813 = this.f2812;
            int i5 = 0;
            int i6 = 0;
            while (this.f2813 > 0) {
                byte m2511 = m2511();
                if (m2511 != 0) {
                    if (m2511 == 1 || m2511 == 2) {
                        if (i5 == 0) {
                            return 1;
                        }
                        if (i6 == 0) {
                            i6 = i5;
                        }
                    } else if (m2511 != 9) {
                        switch (m2511) {
                            case 14:
                            case 15:
                                if (i6 == i5) {
                                    return -1;
                                }
                                i5--;
                                break;
                            case 16:
                            case 17:
                                if (i6 == i5) {
                                    return 1;
                                }
                                i5--;
                                break;
                            case 18:
                                i5++;
                                break;
                            default:
                                if (i6 != 0) {
                                    break;
                                } else {
                                    i6 = i5;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i5 == 0) {
                        return -1;
                    }
                    if (i6 == 0) {
                        i6 = i5;
                    }
                }
            }
            return 0;
        }
    }

    static {
        b0 b0Var = c0.f2830;
        f2798 = b0Var;
        f2799 = Character.toString((char) 8206);
        f2800 = Character.toString((char) 8207);
        f2801 = new a(false, 2, b0Var);
        f2802 = new a(true, 2, b0Var);
    }

    a(boolean z5, int i5, b0 b0Var) {
        this.f2803 = z5;
        this.f2804 = i5;
        this.f2805 = b0Var;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m2492(CharSequence charSequence) {
        return new b(charSequence, false).m2513();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m2493(CharSequence charSequence) {
        return new b(charSequence, false).m2514();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static a m2494() {
        return new C0030a().m2505();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static boolean m2495(Locale locale) {
        return d0.m2534(locale) == 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private String m2496(CharSequence charSequence, b0 b0Var) {
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f2803 || !(isRtl || m2493(charSequence) == 1)) ? this.f2803 ? (!isRtl || m2493(charSequence) == -1) ? f2800 : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f2799;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private String m2497(CharSequence charSequence, b0 b0Var) {
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        return (this.f2803 || !(isRtl || m2492(charSequence) == 1)) ? this.f2803 ? (!isRtl || m2492(charSequence) == -1) ? f2800 : BuildConfig.FLAVOR : BuildConfig.FLAVOR : f2799;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m2498() {
        return (this.f2804 & 2) != 0;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public CharSequence m2499(CharSequence charSequence) {
        return m2500(charSequence, this.f2805, true);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public CharSequence m2500(CharSequence charSequence, b0 b0Var, boolean z5) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = b0Var.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (m2498() && z5) {
            spannableStringBuilder.append((CharSequence) m2497(charSequence, isRtl ? c0.f2829 : c0.f2828));
        }
        if (isRtl != this.f2803) {
            spannableStringBuilder.append(isRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z5) {
            spannableStringBuilder.append((CharSequence) m2496(charSequence, isRtl ? c0.f2829 : c0.f2828));
        }
        return spannableStringBuilder;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public String m2501(String str) {
        return m2502(str, this.f2805, true);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public String m2502(String str, b0 b0Var, boolean z5) {
        if (str == null) {
            return null;
        }
        return m2500(str, b0Var, z5).toString();
    }
}
