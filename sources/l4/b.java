package l4;

/* compiled from: Char.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends a {
    /* renamed from: ʽ, reason: contains not printable characters */
    public static final boolean m9747(char c6, char c7, boolean z5) {
        if (c6 == c7) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
