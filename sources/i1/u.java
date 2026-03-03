package i1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import i1.o;
import java.io.InputStream;
import java.util.List;

/* compiled from: ResourceUriLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8541;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final o<Integer, DataT> f8542;

    /* compiled from: ResourceUriLoader.java */
    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8543;

        a(Context context) {
            this.f8543 = context;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, AssetFileDescriptor> mo9118(s sVar) {
            return new u(this.f8543, sVar.m9190(Integer.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceUriLoader.java */
    private static final class b implements p<Uri, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8544;

        b(Context context) {
            this.f8544 = context;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new u(this.f8544, sVar.m9190(Integer.class, InputStream.class));
        }
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f8541 = context.getApplicationContext();
        this.f8542 = oVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static p<Uri, AssetFileDescriptor> m9199(Context context) {
        return new a(context);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static p<Uri, InputStream> m9200(Context context) {
        return new b(context);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private o.a<DataT> m9201(Uri uri, int i5, int i6, c1.h hVar) {
        try {
            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            if (parseInt != 0) {
                return this.f8542.mo9113(Integer.valueOf(parseInt), i5, i6, hVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e5) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e5);
            }
            return null;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private o.a<DataT> m9202(Uri uri, int i5, int i6, c1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f8541.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f8541.getPackageName());
        if (identifier != 0) {
            return this.f8542.mo9113(Integer.valueOf(identifier), i5, i6, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<DataT> mo9113(Uri uri, int i5, int i6, c1.h hVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return m9201(uri, i5, i6, hVar);
        }
        if (pathSegments.size() == 2) {
            return m9202(uri, i5, i6, hVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f8541.getPackageName().equals(uri.getAuthority());
    }
}
