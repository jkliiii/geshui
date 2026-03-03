package i4;

import java.util.NoSuchElementException;
import w3.a0;

/* compiled from: ProgressionIterators.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends a0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f8589;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f8590;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f8591;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f8592;

    public b(int i5, int i6, int i7) {
        this.f8589 = i7;
        this.f8590 = i6;
        boolean z5 = true;
        if (i7 <= 0 ? i5 < i6 : i5 > i6) {
            z5 = false;
        }
        this.f8591 = z5;
        this.f8592 = z5 ? i5 : i6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8591;
    }

    @Override // w3.a0
    public int nextInt() {
        int i5 = this.f8592;
        if (i5 != this.f8590) {
            this.f8592 = this.f8589 + i5;
        } else {
            if (!this.f8591) {
                throw new NoSuchElementException();
            }
            this.f8591 = false;
        }
        return i5;
    }
}
