package i1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import i1.o;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final o<Uri, Data> f8546;

    /* compiled from: StringLoader.java */
    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<String, AssetFileDescriptor> mo9118(s sVar) {
            return new w(sVar.m9190(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<String, ParcelFileDescriptor> mo9118(s sVar) {
            return new w(sVar.m9190(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    public static class c implements p<String, InputStream> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<String, InputStream> mo9118(s sVar) {
            return new w(sVar.m9190(Uri.class, InputStream.class));
        }
    }

    public w(o<Uri, Data> oVar) {
        this.f8546 = oVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Uri m9206(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m9207(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m9207(str) : parse;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static Uri m9207(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(String str, int i5, int i6, c1.h hVar) {
        Uri m9206 = m9206(str);
        if (m9206 == null || !this.f8546.mo9114(m9206)) {
            return null;
        }
        return this.f8546.mo9113(m9206, i5, i6, hVar);
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(String str) {
        return true;
    }
}
