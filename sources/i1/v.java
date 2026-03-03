package i1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamEncoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v implements c1.d<InputStream> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.b f8545;

    public v(f1.b bVar) {
        this.f8545 = bVar;
    }

    @Override // c1.d
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5820(InputStream inputStream, File file, c1.h hVar) {
        byte[] bArr = (byte[]) this.f8545.mo8522(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e5) {
                        e = e5;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f8545.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f8545.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f8545.put(bArr);
                return true;
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
