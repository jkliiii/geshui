package i1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c implements c1.d<ByteBuffer> {
    @Override // c1.d
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5820(ByteBuffer byteBuffer, File file, c1.h hVar) {
        try {
            y1.a.m12867(byteBuffer, file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e5);
            }
            return false;
        }
    }
}
