package y4;

import java.io.IOException;

/* compiled from: StreamResetException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class n extends IOException {

    /* renamed from: ʾ, reason: contains not printable characters */
    public final b f12661;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f12661 = bVar;
    }
}
