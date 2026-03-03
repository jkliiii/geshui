package g1;

import a1.b;
import android.util.Log;
import g1.a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements a {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final File f7849;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final long f7850;

    /* renamed from: ʿ, reason: contains not printable characters */
    private a1.b f7852;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c f7851 = new c();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j f7848 = new j();

    @Deprecated
    protected e(File file, long j5) {
        this.f7849 = file;
        this.f7850 = j5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static a m8667(File file, long j5) {
        return new e(file, j5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private synchronized a1.b m8668() throws IOException {
        if (this.f7852 == null) {
            this.f7852 = a1.b.m134(this.f7849, 1, 1, this.f7850);
        }
        return this.f7852;
    }

    @Override // g1.a
    /* renamed from: ʻ */
    public File mo8660(c1.f fVar) {
        String m8688 = this.f7848.m8688(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m8688 + " for for Key: " + fVar);
        }
        try {
            b.e m149 = m8668().m149(m8688);
            if (m149 != null) {
                return m149.m173(0);
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }

    @Override // g1.a
    /* renamed from: ʼ */
    public void mo8661(c1.f fVar, a.b bVar) {
        a1.b m8668;
        String m8688 = this.f7848.m8688(fVar);
        this.f7851.m8662(m8688);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m8688 + " for for Key: " + fVar);
            }
            try {
                m8668 = m8668();
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
            if (m8668.m149(m8688) != null) {
                return;
            }
            b.c m151 = m8668.m151(m8688);
            if (m151 == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + m8688);
            }
            try {
                if (bVar.mo8291(m151.m158(0))) {
                    m151.m157();
                }
                m151.m156();
            } catch (Throwable th) {
                m151.m156();
                throw th;
            }
        } finally {
            this.f7851.m8663(m8688);
        }
    }
}
