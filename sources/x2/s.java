package x2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import java.nio.ByteBuffer;

/* compiled from: LoadBitmap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class s extends u implements m2.g<a0<k2.q>> {

    /* renamed from: ˉ, reason: contains not printable characters */
    int f12360;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f12361;

    /* compiled from: LoadBitmap.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ k2.q f12362;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ a0 f12363;

        a(k2.q qVar, a0 a0Var) {
            this.f12362 = qVar;
            this.f12363 = a0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v2, types: [x2.s] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.nio.ByteBuffer] */
        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            ByteBuffer byteBuffer;
            e3.a aVar;
            ByteBuffer byteBuffer2;
            Bitmap bitmap;
            s sVar = s.this;
            Object m12354 = sVar.f12122.f12208.m12354(sVar.f12121);
            ?? r12 = s.this;
            if (m12354 != r12) {
                this.f12362.m9507();
                return;
            }
            try {
                try {
                    byteBuffer = this.f12362.m9493();
                    try {
                        z2.d dVar = s.this.f12122.f12210;
                        byte[] array = byteBuffer.array();
                        int position = byteBuffer.position() + byteBuffer.arrayOffset();
                        int remaining = byteBuffer.remaining();
                        s sVar2 = s.this;
                        BitmapFactory.Options m13168 = dVar.m13168(array, position, remaining, sVar2.f12360, sVar2.f12361);
                        Point point = new Point(m13168.outWidth, m13168.outHeight);
                        if (s.this.f12365 && TextUtils.equals("image/gif", m13168.outMimeType)) {
                            e3.a aVar2 = new e3.a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                            bitmap = aVar2.m8472().f7635;
                            aVar = aVar2;
                            byteBuffer2 = null;
                        } else {
                            Bitmap m13161 = z2.d.m13161(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), m13168);
                            if (m13161 == null) {
                                throw new Exception("failed to load bitmap");
                            }
                            aVar = null;
                            byteBuffer2 = byteBuffer;
                            bitmap = m13161;
                        }
                        try {
                            z2.b bVar = new z2.b(s.this.f12121, m13168.outMimeType, bitmap, point);
                            bVar.f12776 = aVar;
                            bVar.f12773 = this.f12363.m12681();
                            s.this.m12678(null, bVar);
                            k2.q.m9482(byteBuffer2);
                        } catch (Exception e5) {
                            e = e5;
                            byteBuffer = byteBuffer2;
                            s.this.m12678(e, null);
                            k2.q.m9482(byteBuffer);
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                            byteBuffer = byteBuffer2;
                            s.this.m12678(new Exception(e), null);
                            k2.q.m9482(byteBuffer);
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = byteBuffer2;
                            k2.q.m9482(r12);
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    } catch (OutOfMemoryError e8) {
                        e = e8;
                    }
                } catch (Exception e9) {
                    e = e9;
                    byteBuffer = null;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                    byteBuffer = null;
                } catch (Throwable th3) {
                    r12 = 0;
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public s(l lVar, String str, boolean z5, int i5, int i6, boolean z6) {
        super(lVar, str, z5, z6);
        this.f12360 = i5;
        this.f12361 = i6;
    }

    @Override // m2.g
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo8740(Exception exc, a0<k2.q> a0Var) {
        if (exc == null) {
            exc = a0Var.m12679();
        }
        if (exc != null) {
            m12678(exc, null);
            return;
        }
        k2.q m12680 = a0Var.m12680();
        if (this.f12122.f12208.m12354(this.f12121) != this) {
            m12680.m9507();
        } else {
            l.m12710().execute(new a(m12680, a0Var));
        }
    }
}
