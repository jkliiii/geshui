package s4;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: MediaType.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Pattern f11149 = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Pattern f11150 = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f11151;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11152;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final String f11153;

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    private final String f11154;

    private u(String str, String str2, String str3, @Nullable String str4) {
        this.f11151 = str;
        this.f11152 = str2;
        this.f11153 = str3;
        this.f11154 = str4;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static u m11946(String str) {
        Matcher matcher = f11149.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f11150.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new u(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    /* renamed from: ʽ, reason: contains not printable characters */
    public static u m11947(String str) {
        try {
            return m11946(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof u) && ((u) obj).f11151.equals(this.f11151);
    }

    public int hashCode() {
        return this.f11151.hashCode();
    }

    public String toString() {
        return this.f11151;
    }

    @Nullable
    /* renamed from: ʻ, reason: contains not printable characters */
    public Charset m11948(@Nullable Charset charset) {
        try {
            String str = this.f11154;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
