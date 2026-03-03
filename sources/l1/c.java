package l1;

import android.graphics.Bitmap;

/* compiled from: BitmapEncoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c implements c1.k<Bitmap> {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final c1.g<Integer> f8940 = c1.g.m5826("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final c1.g<Bitmap.CompressFormat> f8941 = c1.g.m5825("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.b f8942;

    public c(f1.b bVar) {
        this.f8942 = bVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Bitmap.CompressFormat m9589(Bitmap bitmap, c1.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.m5831(f8941);
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // c1.k
    /* renamed from: ʼ */
    public c1.c mo5837(c1.h hVar) {
        return c1.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #2 {all -> 0x00c2, blocks: (B:3:0x0021, B:15:0x004b, B:18:0x006c, B:20:0x0072, B:46:0x00be, B:44:0x00c1, B:38:0x0067), top: B:2:0x0021 }] */
    @Override // c1.d
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo5820(e1.v<android.graphics.Bitmap> r8, java.io.File r9, c1.h r10) {
        /*
            r7 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r8 = r8.get()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            android.graphics.Bitmap$CompressFormat r1 = r7.m9589(r8, r10)
            int r2 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.getHeight()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "encode: [%dx%d] %s"
            z1.b.m13146(r4, r2, r3, r1)
            long r2 = y1.g.m12879()     // Catch: java.lang.Throwable -> Lc2
            c1.g<java.lang.Integer> r4 = l1.c.f8940     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r4 = r10.m5831(r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lc2
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lc2
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            f1.b r9 = r7.f8942     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            if (r9 == 0) goto L44
            com.bumptech.glide.load.data.c r9 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            f1.b r5 = r7.f8942     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r9.<init>(r6, r5)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r5 = r9
            goto L45
        L44:
            r5 = r6
        L45:
            r8.compress(r1, r4, r5)     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.lang.Throwable -> L56 java.io.IOException -> L58
            r5.close()     // Catch: java.io.IOException -> L4e java.lang.Throwable -> Lc2
        L4e:
            r9 = 1
            goto L6b
        L50:
            r8 = move-exception
            r5 = r6
            goto Lbc
        L53:
            r9 = move-exception
            r5 = r6
            goto L59
        L56:
            r8 = move-exception
            goto Lbc
        L58:
            r9 = move-exception
        L59:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L65
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r9)     // Catch: java.lang.Throwable -> L56
        L65:
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> Lc2
        L6a:
            r9 = 0
        L6b:
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> Lc2
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r4.<init>()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "Compressed with type: "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " of size "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            int r1 = y1.l.m12902(r8)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = " in "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            double r1 = y1.g.m12878(r2)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = ", options format: "
            r4.append(r1)     // Catch: java.lang.Throwable -> Lc2
            c1.g<android.graphics.Bitmap$CompressFormat> r1 = l1.c.f8941     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r10 = r10.m5831(r1)     // Catch: java.lang.Throwable -> Lc2
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = ", hasAlpha: "
            r4.append(r10)     // Catch: java.lang.Throwable -> Lc2
            boolean r8 = r8.hasAlpha()     // Catch: java.lang.Throwable -> Lc2
            r4.append(r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> Lc2
            android.util.Log.v(r0, r8)     // Catch: java.lang.Throwable -> Lc2
        Lb8:
            z1.b.m13147()
            return r9
        Lbc:
            if (r5 == 0) goto Lc1
            r5.close()     // Catch: java.io.IOException -> Lc1 java.lang.Throwable -> Lc2
        Lc1:
            throw r8     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r8 = move-exception
            z1.b.m13147()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.mo5820(e1.v, java.io.File, c1.h):boolean");
    }
}
