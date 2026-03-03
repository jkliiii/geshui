package c5;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface r extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    /* renamed from: ʼ */
    t mo5866();

    /* renamed from: ˈ */
    void mo5867(c cVar, long j5) throws IOException;
}
