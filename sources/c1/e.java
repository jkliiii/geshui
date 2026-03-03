package c1;

import java.io.IOException;

/* compiled from: HttpException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e extends IOException {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f4977;

    public e(int i5) {
        this("Http request failed", i5);
    }

    public e(String str, int i5) {
        this(str, i5, null);
    }

    public e(String str, int i5, Throwable th) {
        super(str + ", status code: " + i5, th);
        this.f4977 = i5;
    }
}
