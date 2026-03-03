package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class f0 extends Writer {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f3537;

    /* renamed from: ʿ, reason: contains not printable characters */
    private StringBuilder f3538 = new StringBuilder(128);

    f0(String str) {
        this.f3537 = str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m4051() {
        if (this.f3538.length() > 0) {
            Log.d(this.f3537, this.f3538.toString());
            StringBuilder sb = this.f3538;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m4051();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m4051();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            char c6 = cArr[i5 + i7];
            if (c6 == '\n') {
                m4051();
            } else {
                this.f3538.append(c6);
            }
        }
    }
}
