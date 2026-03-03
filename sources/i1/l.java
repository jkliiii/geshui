package i1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l implements o<Uri, File> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8500;

    /* compiled from: MediaStoreFileLoader.java */
    public static final class a implements p<Uri, File> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8501;

        public a(Context context) {
            this.f8501 = context;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, File> mo9118(s sVar) {
            return new l(this.f8501);
        }
    }

    public l(Context context) {
        this.f8500 = context;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<File> mo9113(Uri uri, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(uri), new b(this.f8500, uri));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return d1.b.m8177(uri);
    }

    /* compiled from: MediaStoreFileLoader.java */
    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: ˆ, reason: contains not printable characters */
        private static final String[] f8502 = {"_data"};

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Context f8503;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final Uri f8504;

        b(Context context, Uri uri) {
            this.f8503 = context;
            this.f8504 = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<File> mo6132() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor query = this.f8503.getContentResolver().query(this.f8504, f8502, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (!TextUtils.isEmpty(r0)) {
                aVar.mo6146(new File(r0));
                return;
            }
            aVar.mo6145(new FileNotFoundException("Failed to find file path for: " + this.f8504));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
        }
    }
}
