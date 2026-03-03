package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: ProfileVerifier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class p {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final androidx.concurrent.futures.c<c> f3955 = androidx.concurrent.futures.c.m1741();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Object f3956 = new Object();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static c f3957 = null;

    /* compiled from: ProfileVerifier.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static PackageInfo m4647(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* compiled from: ProfileVerifier.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int f3958;

        /* renamed from: ʼ, reason: contains not printable characters */
        final int f3959;

        /* renamed from: ʽ, reason: contains not printable characters */
        final long f3960;

        /* renamed from: ʾ, reason: contains not printable characters */
        final long f3961;

        b(int i5, int i6, long j5, long j6) {
            this.f3958 = i5;
            this.f3959 = i6;
            this.f3960 = j5;
            this.f3961 = j6;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static b m4648(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3959 == bVar.f3959 && this.f3960 == bVar.f3960 && this.f3958 == bVar.f3958 && this.f3961 == bVar.f3961;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3959), Long.valueOf(this.f3960), Integer.valueOf(this.f3958), Long.valueOf(this.f3961));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m4649(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3958);
                dataOutputStream.writeInt(this.f3959);
                dataOutputStream.writeLong(this.f3960);
                dataOutputStream.writeLong(this.f3961);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* compiled from: ProfileVerifier.java */
    public static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int f3962;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f3963;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final boolean f3964;

        c(int i5, boolean z5, boolean z6) {
            this.f3962 = i5;
            this.f3964 = z6;
            this.f3963 = z5;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long m4644(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m4647(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static c m4645(int i5, boolean z5, boolean z6) {
        c cVar = new c(i5, z5, z6);
        f3957 = cVar;
        f3955.mo1732(cVar);
        return f3957;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0044  */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.p.c m4646(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.p.m4646(android.content.Context, boolean):androidx.profileinstaller.p$c");
    }
}
