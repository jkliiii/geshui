package d1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Uri f6836;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e f6837;

    /* renamed from: ˆ, reason: contains not printable characters */
    private InputStream f6838;

    /* compiled from: ThumbFetcher.java */
    static class a implements d {

        /* renamed from: ʼ, reason: contains not printable characters */
        private static final String[] f6839 = {"_data"};

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentResolver f6840;

        a(ContentResolver contentResolver) {
            this.f6840 = contentResolver;
        }

        @Override // d1.d
        /* renamed from: ʻ, reason: contains not printable characters */
        public Cursor mo8185(Uri uri) {
            return this.f6840.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6839, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    static class b implements d {

        /* renamed from: ʼ, reason: contains not printable characters */
        private static final String[] f6841 = {"_data"};

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentResolver f6842;

        b(ContentResolver contentResolver) {
            this.f6842 = contentResolver;
        }

        @Override // d1.d
        /* renamed from: ʻ */
        public Cursor mo8185(Uri uri) {
            return this.f6842.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6841, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f6836 = uri;
        this.f6837 = eVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static c m8181(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.m6011(context).m6025().m6053(), dVar, com.bumptech.glide.b.m6011(context).m6020(), context.getContentResolver()));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static c m8182(Context context, Uri uri) {
        return m8181(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static c m8183(Context context, Uri uri) {
        return m8181(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private InputStream m8184() throws FileNotFoundException {
        InputStream m8189 = this.f6837.m8189(this.f6836);
        int m8188 = m8189 != null ? this.f6837.m8188(this.f6836) : -1;
        return m8188 != -1 ? new g(m8189, m8188) : m8189;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʻ */
    public Class<InputStream> mo6132() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʼ */
    public void mo6137() {
        InputStream inputStream = this.f6838;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʿ */
    public c1.a mo6140() {
        return c1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ˆ */
    public void mo6141(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream m8184 = m8184();
            this.f6838 = m8184;
            aVar.mo6146(m8184);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e5);
            }
            aVar.mo6145(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
