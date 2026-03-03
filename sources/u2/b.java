package u2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k2.k;

/* compiled from: FileDataSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends d {

    /* renamed from: ˈ, reason: contains not printable characters */
    File f11522;

    public b(k kVar, File file) {
        super(kVar);
        this.f11522 = file;
    }

    @Override // u2.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public OutputStream mo12205() throws IOException {
        OutputStream mo12205 = super.mo12205();
        if (mo12205 != null) {
            return mo12205;
        }
        this.f11522.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(this.f11522);
        m12210(fileOutputStream);
        return fileOutputStream;
    }
}
