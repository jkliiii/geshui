package d1;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ThumbnailStreamOpener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final a f6843 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final a f6844;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final d f6845;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final f1.b f6846;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ContentResolver f6847;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f6848;

    e(List<ImageHeaderParser> list, d dVar, f1.b bVar, ContentResolver contentResolver) {
        this(list, f6843, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0048: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:73), block:B:26:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m8186(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            r1 = 0
            d1.d r2 = r6.f6845     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            android.database.Cursor r2 = r2.mo8185(r7)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L24
            if (r2 == 0) goto L1c
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            if (r3 == 0) goto L1c
            r3 = 0
            java.lang.String r7 = r2.getString(r3)     // Catch: java.lang.SecurityException -> L1a java.lang.Throwable -> L47
            r2.close()
            return r7
        L1a:
            r3 = move-exception
            goto L26
        L1c:
            if (r2 == 0) goto L21
            r2.close()
        L21:
            return r1
        L22:
            r7 = move-exception
            goto L49
        L24:
            r3 = move-exception
            r2 = r1
        L26:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L47
            if (r4 == 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "Failed to query for thumbnail for Uri: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.d(r0, r7, r3)     // Catch: java.lang.Throwable -> L47
        L41:
            if (r2 == 0) goto L46
            r2.close()
        L46:
            return r1
        L47:
            r7 = move-exception
            r1 = r2
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.m8186(android.net.Uri):java.lang.String");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m8187(File file) {
        return this.f6844.m8172(file) && 0 < this.f6844.m8174(file);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    int m8188(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f6847.openInputStream(uri);
                int m6116 = com.bumptech.glide.load.a.m6116(this.f6848, inputStream, this.f6846);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m6116;
            } catch (IOException | NullPointerException e5) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e5);
                }
                if (inputStream == null) {
                    return -1;
                }
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused2) {
                    return -1;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public InputStream m8189(Uri uri) throws FileNotFoundException {
        String m8186 = m8186(uri);
        if (TextUtils.isEmpty(m8186)) {
            return null;
        }
        File m8173 = this.f6844.m8173(m8186);
        if (!m8187(m8173)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(m8173);
        try {
            return this.f6847.openInputStream(fromFile);
        } catch (NullPointerException e5) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e5));
        }
    }

    e(List<ImageHeaderParser> list, a aVar, d dVar, f1.b bVar, ContentResolver contentResolver) {
        this.f6844 = aVar;
        this.f6845 = dVar;
        this.f6846 = bVar;
        this.f6847 = contentResolver;
        this.f6848 = list;
    }
}
