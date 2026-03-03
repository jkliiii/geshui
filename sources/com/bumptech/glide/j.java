package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import i1.a;
import i1.b;
import i1.d;
import i1.e;
import i1.g;
import i1.l;
import i1.p;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import i1.x;
import i1.y;
import i1.z;
import j1.a;
import j1.b;
import j1.c;
import j1.d;
import j1.g;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import l1.a0;
import l1.c0;
import l1.e0;
import l1.f0;
import l1.h0;
import l1.k0;
import l1.t;
import l1.w;
import m1.a;
import y1.f;

/* compiled from: RegistryFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class j {

    /* compiled from: RegistryFactory.java */
    class a implements f.b<i> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f5161;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ b f5162;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ List f5163;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ s1.a f5164;

        a(b bVar, List list, s1.a aVar) {
            this.f5162 = bVar;
            this.f5163 = list;
            this.f5164 = aVar;
        }

        @Override // y1.f.b
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public i get() {
            if (this.f5161) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            q0.b.m11460("Glide registry");
            this.f5161 = true;
            try {
                return j.m6065(this.f5162, this.f5163, this.f5164);
            } finally {
                this.f5161 = false;
                q0.b.m11461();
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static i m6065(b bVar, List<s1.b> list, s1.a aVar) {
        f1.d m6021 = bVar.m6021();
        f1.b m6020 = bVar.m6020();
        Context applicationContext = bVar.m6024().getApplicationContext();
        e m6039 = bVar.m6024().m6039();
        i iVar = new i();
        m6066(applicationContext, iVar, m6021, m6020, m6039);
        m6067(applicationContext, bVar, iVar, list, aVar);
        return iVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m6066(Context context, i iVar, f1.d dVar, f1.b bVar, e eVar) {
        c1.j hVar;
        c1.j f0Var;
        Object obj;
        i iVar2;
        iVar.m6061(new l1.m());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 27) {
            iVar.m6061(new w());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> m6053 = iVar.m6053();
        p1.a aVar = new p1.a(context, m6053, dVar, bVar);
        c1.j<ParcelFileDescriptor, Bitmap> m9642 = k0.m9642(dVar);
        t tVar = new t(iVar.m6053(), resources.getDisplayMetrics(), dVar, bVar);
        if (i5 < 28 || !eVar.m6042(c.b.class)) {
            hVar = new l1.h(tVar);
            f0Var = new f0(tVar, bVar);
        } else {
            f0Var = new a0();
            hVar = new l1.j();
        }
        if (i5 >= 28) {
            iVar.m6052("Animation", InputStream.class, Drawable.class, n1.f.m10424(m6053, bVar));
            iVar.m6052("Animation", ByteBuffer.class, Drawable.class, n1.f.m10422(m6053, bVar));
        }
        n1.j jVar = new n1.j(context);
        l1.c cVar = new l1.c(bVar);
        q1.a aVar2 = new q1.a();
        q1.d dVar2 = new q1.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.m6048(ByteBuffer.class, new i1.c()).m6048(InputStream.class, new v(bVar)).m6052("Bitmap", ByteBuffer.class, Bitmap.class, hVar).m6052("Bitmap", InputStream.class, Bitmap.class, f0Var);
        if (ParcelFileDescriptorRewinder.m6125()) {
            iVar.m6052("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new c0(tVar));
        }
        iVar.m6052("Bitmap", AssetFileDescriptor.class, Bitmap.class, k0.m9632(dVar));
        iVar.m6052("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m9642).m6051(Bitmap.class, Bitmap.class, x.a.m9211()).m6052("Bitmap", Bitmap.class, Bitmap.class, new h0()).m6049(Bitmap.class, cVar).m6052("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new l1.a(resources, hVar)).m6052("BitmapDrawable", InputStream.class, BitmapDrawable.class, new l1.a(resources, f0Var)).m6052("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new l1.a(resources, m9642)).m6049(BitmapDrawable.class, new l1.b(dVar, cVar)).m6052("Animation", InputStream.class, p1.c.class, new p1.j(m6053, aVar, bVar)).m6052("Animation", ByteBuffer.class, p1.c.class, aVar).m6049(p1.c.class, new p1.d()).m6051(b1.a.class, b1.a.class, x.a.m9211()).m6052("Bitmap", b1.a.class, Bitmap.class, new p1.h(dVar)).m6050(Uri.class, Drawable.class, jVar).m6050(Uri.class, Bitmap.class, new e0(jVar, dVar)).m6062(new a.C0132a()).m6051(File.class, ByteBuffer.class, new d.b()).m6051(File.class, InputStream.class, new g.e()).m6050(File.class, File.class, new o1.a()).m6051(File.class, ParcelFileDescriptor.class, new g.b()).m6051(File.class, File.class, x.a.m9211()).m6062(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.m6125()) {
            obj = BitmapDrawable.class;
            iVar2 = iVar;
            iVar2.m6062(new ParcelFileDescriptorRewinder.a());
        } else {
            obj = BitmapDrawable.class;
            iVar2 = iVar;
        }
        p<Integer, InputStream> m9135 = i1.f.m9135(context);
        p<Integer, AssetFileDescriptor> m9133 = i1.f.m9133(context);
        p<Integer, Drawable> m9134 = i1.f.m9134(context);
        Class cls = Integer.TYPE;
        iVar2.m6051(cls, InputStream.class, m9135).m6051(Integer.class, InputStream.class, m9135).m6051(cls, AssetFileDescriptor.class, m9133).m6051(Integer.class, AssetFileDescriptor.class, m9133).m6051(cls, Drawable.class, m9134).m6051(Integer.class, Drawable.class, m9134).m6051(Uri.class, InputStream.class, u.m9200(context)).m6051(Uri.class, AssetFileDescriptor.class, u.m9199(context));
        t.c cVar2 = new t.c(resources);
        t.a aVar3 = new t.a(resources);
        t.b bVar2 = new t.b(resources);
        Object obj2 = obj;
        iVar2.m6051(Integer.class, Uri.class, cVar2).m6051(cls, Uri.class, cVar2).m6051(Integer.class, AssetFileDescriptor.class, aVar3).m6051(cls, AssetFileDescriptor.class, aVar3).m6051(Integer.class, InputStream.class, bVar2).m6051(cls, InputStream.class, bVar2);
        iVar2.m6051(String.class, InputStream.class, new e.c()).m6051(Uri.class, InputStream.class, new e.c()).m6051(String.class, InputStream.class, new w.c()).m6051(String.class, ParcelFileDescriptor.class, new w.b()).m6051(String.class, AssetFileDescriptor.class, new w.a()).m6051(Uri.class, InputStream.class, new a.c(context.getAssets())).m6051(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).m6051(Uri.class, InputStream.class, new b.a(context)).m6051(Uri.class, InputStream.class, new c.a(context));
        if (i5 >= 29) {
            iVar2.m6051(Uri.class, InputStream.class, new d.c(context));
            iVar2.m6051(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        iVar2.m6051(Uri.class, InputStream.class, new y.d(contentResolver)).m6051(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).m6051(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).m6051(Uri.class, InputStream.class, new z.a()).m6051(URL.class, InputStream.class, new g.a()).m6051(Uri.class, File.class, new l.a(context)).m6051(i1.h.class, InputStream.class, new a.C0122a()).m6051(byte[].class, ByteBuffer.class, new b.a()).m6051(byte[].class, InputStream.class, new b.d()).m6051(Uri.class, Uri.class, x.a.m9211()).m6051(Drawable.class, Drawable.class, x.a.m9211()).m6050(Drawable.class, Drawable.class, new n1.k()).m6063(Bitmap.class, obj2, new q1.b(resources)).m6063(Bitmap.class, byte[].class, aVar2).m6063(Drawable.class, byte[].class, new q1.c(dVar, aVar2, dVar2)).m6063(p1.c.class, byte[].class, dVar2);
        if (i5 >= 23) {
            c1.j<ByteBuffer, Bitmap> m9633 = k0.m9633(dVar);
            iVar2.m6050(ByteBuffer.class, Bitmap.class, m9633);
            iVar2.m6050(ByteBuffer.class, obj2, new l1.a(resources, m9633));
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m6067(Context context, b bVar, i iVar, List<s1.b> list, s1.a aVar) {
        for (s1.b bVar2 : list) {
            try {
                bVar2.m11706(context, bVar, iVar);
            } catch (AbstractMethodError e5) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e5);
            }
        }
        if (aVar != null) {
            aVar.m11707(context, bVar, iVar);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static f.b<i> m6068(b bVar, List<s1.b> list, s1.a aVar) {
        return new a(bVar, list, aVar);
    }
}
