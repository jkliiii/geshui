package x2;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransformBitmap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 extends x2.a implements m2.g<z2.b> {

    /* renamed from: ˈ, reason: contains not printable characters */
    ArrayList<z2.j> f12164;

    /* renamed from: ˉ, reason: contains not printable characters */
    ArrayList<z2.g> f12165;

    /* renamed from: ˊ, reason: contains not printable characters */
    String f12166;

    /* compiled from: TransformBitmap.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ z2.b f12167;

        a(z2.b bVar) {
            this.f12167 = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0 d0Var = d0.this;
            Object m12354 = d0Var.f12122.f12208.m12354(d0Var.f12121);
            d0 d0Var2 = d0.this;
            if (m12354 != d0Var2) {
                return;
            }
            try {
                Bitmap bitmap = this.f12167.f12774;
                Iterator<z2.j> it = d0Var2.f12164.iterator();
                while (it.hasNext()) {
                    bitmap = it.next().mo12698(bitmap);
                    if (bitmap == null) {
                        throw new Exception("failed to transform bitmap");
                    }
                }
                String str = d0.this.f12121;
                z2.b bVar = this.f12167;
                z2.b bVar2 = new z2.b(str, bVar.f12779, bitmap, bVar.f12769);
                bVar2.f12773 = this.f12167.f12773;
                ArrayList<z2.g> arrayList = d0.this.f12165;
                if (arrayList != null) {
                    Iterator<z2.g> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().m13179(bVar2);
                    }
                }
                d0.this.m12678(null, bVar2);
            } catch (Exception e5) {
                d0.this.m12678(e5, null);
            } catch (OutOfMemoryError e6) {
                d0.this.m12678(new Exception(e6), null);
            }
        }
    }

    public d0(l lVar, String str, String str2, ArrayList<z2.j> arrayList, ArrayList<z2.g> arrayList2) {
        super(lVar, str, true);
        this.f12164 = arrayList;
        this.f12166 = str2;
        this.f12165 = arrayList2;
    }

    @Override // m2.g
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo8740(Exception exc, z2.b bVar) {
        if (exc != null) {
            m12678(exc, null);
        } else {
            if (this.f12122.f12208.m12354(this.f12121) != this) {
                return;
            }
            l.m12710().execute(new a(bVar));
        }
    }
}
