package o2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StringPart.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends e {

    /* renamed from: ʾ, reason: contains not printable characters */
    String f10095;

    public g(String str, String str2) {
        super(str, str2.getBytes().length, null);
        this.f10095 = str2;
    }

    public String toString() {
        return this.f10095;
    }

    @Override // o2.e
    /* renamed from: ˆ */
    protected InputStream mo10976() throws IOException {
        return new ByteArrayInputStream(this.f10095.getBytes());
    }
}
