package x2;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* compiled from: BitmapCallback.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class a {

    /* renamed from: ʾ, reason: contains not printable characters */
    final String f12121;

    /* renamed from: ʿ, reason: contains not printable characters */
    final l f12122;

    /* renamed from: ˆ, reason: contains not printable characters */
    final boolean f12123;

    /* compiled from: BitmapCallback.java */
    /* renamed from: x2.a$a, reason: collision with other inner class name */
    static class RunnableC0173a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ l f12124;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f12125;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ a f12126;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f12127;

        RunnableC0173a(l lVar, String str, a aVar, ArrayList arrayList) {
            this.f12124 = lVar;
            this.f12125 = str;
            this.f12126 = aVar;
            this.f12127 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12124.f12208.m12354(this.f12125) != this.f12126) {
                return;
            }
            try {
                Bitmap m13159 = z2.d.m13159(this.f12124.f12194.m11108().m12334(this.f12125), null);
                if (m13159 == null) {
                    throw new Exception("Bitmap failed to load");
                }
                z2.b bVar = new z2.b(this.f12125, "image/jpeg", m13159, null);
                bVar.f12773 = b0.LOADED_FROM_CACHE;
                ArrayList arrayList = this.f12127;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((z2.g) it.next()).m13179(bVar);
                    }
                }
                this.f12126.m12678(null, bVar);
            } catch (Exception e5) {
                this.f12126.m12678(e5, null);
                try {
                    this.f12124.f12194.m11108().m12340(this.f12125);
                } catch (Exception unused) {
                }
            } catch (OutOfMemoryError e6) {
                this.f12126.m12678(new Exception(e6), null);
            }
        }
    }

    /* compiled from: BitmapCallback.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ z2.b f12128;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Exception f12129;

        b(z2.b bVar, Exception exc) {
            this.f12128 = bVar;
            this.f12129 = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            z2.b bVar = this.f12128;
            if (bVar == null) {
                bVar = new z2.b(a.this.f12121, null, null, new Point());
                Exception exc = this.f12129;
                bVar.f12775 = exc;
                if (!(exc instanceof CancellationException)) {
                    a.this.f12122.m12719().m13169(bVar);
                }
            } else if (a.this.m12677()) {
                a.this.f12122.m12719().m13169(bVar);
            } else {
                a.this.f12122.m12719().m13170(bVar);
            }
            a aVar = a.this;
            ArrayList<m2.g<z2.b>> m12352 = aVar.f12122.f12208.m12352(aVar.f12121);
            if (m12352 == null || m12352.size() == 0) {
                a.this.m12676();
                return;
            }
            Iterator<m2.g<z2.b>> it = m12352.iterator();
            while (it.hasNext()) {
                it.next().mo8740(this.f12129, bVar);
            }
            a.this.m12676();
        }
    }

    protected a(l lVar, String str, boolean z5) {
        this.f12121 = str;
        this.f12123 = z5;
        this.f12122 = lVar;
        lVar.f12208.m12355(str, this);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m12674(l lVar, String str, ArrayList<z2.g> arrayList) {
        if (lVar.f12208.m12354(str) != null) {
            return;
        }
        l.m12710().execute(new RunnableC0173a(lVar, str, new t(lVar, str, true), arrayList));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12675(l lVar, z2.b bVar) {
        v2.d m11108;
        if (bVar.f12774 == null || (m11108 = lVar.f12194.m11108()) == null) {
            return;
        }
        File m12337 = m11108.m12337();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m12337);
            bVar.f12774.compress(bVar.f12774.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            m11108.m12330(bVar.f12772, m12337);
        } catch (Exception unused) {
        } catch (Throwable th) {
            m12337.delete();
            throw th;
        }
        m12337.delete();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected void m12676() {
        this.f12122.m12724();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m12677() {
        return this.f12123;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected void m12678(Exception exc, z2.b bVar) {
        k2.k.m9449(l.f12189, new b(bVar, exc));
        if (bVar == null || bVar.f12769 == null || bVar.f12777 != null || !this.f12123 || bVar.f12774 == null || bVar.f12776 != null || bVar.m13152() > 1048576) {
            return;
        }
        m12675(this.f12122, bVar);
    }
}
