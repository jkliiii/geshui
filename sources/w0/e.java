package w0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

/* compiled from: GravityEnum.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public enum e {
    START,
    CENTER,
    END;


    /* renamed from: ˈ, reason: contains not printable characters */
    private static final boolean f11800 = true;

    /* compiled from: GravityEnum.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f11802;

        static {
            int[] iArr = new int[e.values().length];
            f11802 = iArr;
            try {
                iArr[e.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11802[e.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11802[e.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: ʻ, reason: contains not printable characters */
    public int m12462() {
        int i5 = a.f11802[ordinal()];
        if (i5 == 1) {
            return f11800 ? 8388611 : 3;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 3) {
            return f11800 ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    /* renamed from: ʼ, reason: contains not printable characters */
    public int m12463() {
        int i5 = a.f11802[ordinal()];
        if (i5 != 2) {
            return i5 != 3 ? 5 : 6;
        }
        return 4;
    }
}
