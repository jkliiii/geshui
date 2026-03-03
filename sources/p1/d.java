package p1;

import android.util.Log;
import c1.k;
import e1.v;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements k<c> {
    @Override // c1.k
    /* renamed from: ʼ */
    public c1.c mo5837(c1.h hVar) {
        return c1.c.SOURCE;
    }

    @Override // c1.d
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5820(v<c> vVar, File file, c1.h hVar) {
        try {
            y1.a.m12867(vVar.get().m11031(), file);
            return true;
        } catch (IOException e5) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            }
            return false;
        }
    }
}
