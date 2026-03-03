package i1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import i1.o;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final o<Uri, Data> f8536;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Resources f8537;

    /* compiled from: ResourceLoader.java */
    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Resources f8538;

        public a(Resources resources) {
            this.f8538 = resources;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, AssetFileDescriptor> mo9118(s sVar) {
            return new t(this.f8538, sVar.m9190(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class b implements p<Integer, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Resources f8539;

        public b(Resources resources) {
            this.f8539 = resources;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, InputStream> mo9118(s sVar) {
            return new t(this.f8539, sVar.m9190(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    public static class c implements p<Integer, Uri> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Resources f8540;

        public c(Resources resources) {
            this.f8540 = resources;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, Uri> mo9118(s sVar) {
            return new t(this.f8540, x.m9210());
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f8537 = resources;
        this.f8536 = oVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Uri m9196(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f8537.getResourcePackageName(num.intValue()) + '/' + this.f8537.getResourceTypeName(num.intValue()) + '/' + this.f8537.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e5) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e5);
            return null;
        }
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(Integer num, int i5, int i6, c1.h hVar) {
        Uri m9196 = m9196(num);
        if (m9196 == null) {
            return null;
        }
        return this.f8536.mo9113(m9196, i5, i6, hVar);
    }

    @Override // i1.o
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Integer num) {
        return true;
    }
}
