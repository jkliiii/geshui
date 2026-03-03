package y1;

import android.text.TextUtils;
import java.util.Collection;

/* compiled from: Preconditions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m12890(boolean z5, String str) {
        if (!z5) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m12891(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T extends Collection<Y>, Y> T m12892(T t5) {
        if (t5.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static <T> T m12893(T t5) {
        return (T) m12894(t5, "Argument must not be null");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static <T> T m12894(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }
}
