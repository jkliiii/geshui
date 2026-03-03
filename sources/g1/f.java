package g1;

import android.content.Context;
import g1.d;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f extends d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    class a implements d.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Context f7853;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ String f7854;

        a(Context context, String str) {
            this.f7853 = context;
            this.f7854 = str;
        }

        @Override // g1.d.a
        /* renamed from: ʻ */
        public File mo8666() {
            File cacheDir = this.f7853.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f7854 != null ? new File(cacheDir, this.f7854) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j5) {
        super(new a(context, str), j5);
    }
}
