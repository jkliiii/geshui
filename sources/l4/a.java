package l4;

/* compiled from: CharJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final int m9745(int i5) {
        if (new i4.c(2, 36).m9250(i5)) {
            return i5;
        }
        throw new IllegalArgumentException("radix " + i5 + " was not in valid range " + new i4.c(2, 36));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final int m9746(char c6, int i5) {
        return Character.digit((int) c6, i5);
    }
}
