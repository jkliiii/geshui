package n1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import e1.v;
import java.util.List;

/* compiled from: ResourceDrawableDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j implements c1.j<Uri, Drawable> {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final c1.g<Resources.Theme> f9521 = c1.g.m5825("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f9522;

    public j(Context context) {
        this.f9522 = context.getApplicationContext();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Context m10440(Uri uri, String str) {
        if (str.equals(this.f9522.getPackageName())) {
            return this.f9522;
        }
        try {
            return this.f9522.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            if (str.contains(this.f9522.getPackageName())) {
                return this.f9522;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m10441(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e5) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e5);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private int m10442(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int m10443(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m10442(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m10441(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v<Drawable> mo5835(Uri uri, int i5, int i6, c1.h hVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context m10440 = m10440(uri, authority);
            int m10443 = m10443(m10440, uri);
            Resources.Theme theme = ((String) y1.k.m12893(authority)).equals(this.f9522.getPackageName()) ? (Resources.Theme) hVar.m5831(f9521) : null;
            return i.m10439(theme == null ? g.m10434(this.f9522, m10440, m10443) : g.m10433(this.f9522, m10443, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // c1.j
    /* renamed from: ˉ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(Uri uri, c1.h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
