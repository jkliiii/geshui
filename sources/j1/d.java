package j1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import c1.h;
import com.bumptech.glide.load.data.d;
import i1.o;
import i1.p;
import i1.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8619;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final o<File, DataT> f8620;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final o<Uri, DataT> f8621;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Class<DataT> f8622;

    /* compiled from: QMediaStoreUriLoader.java */
    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8623;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Class<DataT> f8624;

        a(Context context, Class<DataT> cls) {
            this.f8623 = context;
            this.f8624 = cls;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public final o<Uri, DataT> mo9118(s sVar) {
            return new d(this.f8623, sVar.m9190(File.class, this.f8624), sVar.m9190(Uri.class, this.f8624), this.f8624);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* renamed from: j1.d$d, reason: collision with other inner class name */
    private static final class C0123d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: י, reason: contains not printable characters */
        private static final String[] f8625 = {"_data"};

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Context f8626;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final o<File, DataT> f8627;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final o<Uri, DataT> f8628;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final Uri f8629;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final int f8630;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final int f8631;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final h f8632;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final Class<DataT> f8633;

        /* renamed from: ˏ, reason: contains not printable characters */
        private volatile boolean f8634;

        /* renamed from: ˑ, reason: contains not printable characters */
        private volatile com.bumptech.glide.load.data.d<DataT> f8635;

        C0123d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i5, int i6, h hVar, Class<DataT> cls) {
            this.f8626 = context.getApplicationContext();
            this.f8627 = oVar;
            this.f8628 = oVar2;
            this.f8629 = uri;
            this.f8630 = i5;
            this.f8631 = i6;
            this.f8632 = hVar;
            this.f8633 = cls;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private o.a<DataT> m9287() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.f8627.mo9113(m9290(this.f8629), this.f8630, this.f8631, this.f8632);
            }
            if (d1.b.m8175(this.f8629)) {
                return this.f8628.mo9113(this.f8629, this.f8630, this.f8631, this.f8632);
            }
            return this.f8628.mo9113(m9289() ? MediaStore.setRequireOriginal(this.f8629) : this.f8629, this.f8630, this.f8631, this.f8632);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private com.bumptech.glide.load.data.d<DataT> m9288() throws FileNotFoundException {
            o.a<DataT> m9287 = m9287();
            if (m9287 != null) {
                return m9287.f8513;
            }
            return null;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean m9289() {
            return this.f8626.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private File m9290(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.f8626.getContentResolver().query(uri, f8625, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    query.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f8634 = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8635;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<DataT> mo6132() {
            return this.f8633;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f8635;
            if (dVar != null) {
                dVar.mo6137();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> m9288 = m9288();
                if (m9288 == null) {
                    aVar.mo6145(new IllegalArgumentException("Failed to build fetcher for: " + this.f8629));
                    return;
                }
                this.f8635 = m9288;
                if (this.f8634) {
                    cancel();
                } else {
                    m9288.mo6141(gVar, aVar);
                }
            } catch (FileNotFoundException e5) {
                aVar.mo6145(e5);
            }
        }
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f8619 = context.getApplicationContext();
        this.f8620 = oVar;
        this.f8621 = oVar2;
        this.f8622 = cls;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<DataT> mo9113(Uri uri, int i5, int i6, h hVar) {
        return new o.a<>(new x1.b(uri), new C0123d(this.f8619, this.f8620, this.f8621, uri, i5, i6, hVar, this.f8622));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && d1.b.m8177(uri);
    }
}
