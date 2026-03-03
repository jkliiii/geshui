package h3;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import com.lt.app.App;
import j2.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import l3.u;

/* compiled from: CaptureWebView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* compiled from: CaptureWebView.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f8207;

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean f8208;

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean f8209;

        /* renamed from: ʾ, reason: contains not printable characters */
        public n3.f<Bitmap> f8210;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m8872(j2.f fVar, a aVar) {
        if (fVar == null || fVar.getContext() == null || !(fVar.getContext() instanceof com.lt.app.b)) {
            return;
        }
        if (App.m7815(54, true)) {
            m8876(fVar, aVar);
        } else {
            com.lt.app.c.m7959(fVar.getContext(), 2131820688);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static /* synthetic */ void m8873(Context context, a aVar, Uri uri) {
        if (uri != null) {
            Toast.makeText(context, 2131820605, 0).show();
            if (aVar.f8208) {
                m8875(context, uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public static /* synthetic */ void m8874(final a aVar, final Context context, Bitmap bitmap) {
        if (!aVar.f8209) {
            n3.z1.m10893(context, bitmap, new n3.f() { // from class: h3.d
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    e.m8873(context, aVar, (Uri) obj);
                }
            });
            return;
        }
        n3.f<Bitmap> fVar = aVar.f8210;
        if (fVar != null) {
            fVar.mo8742(bitmap);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m8875(Context context, Uri uri) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        File m10906 = n3.z1.m10906(context, "share.png");
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                fileOutputStream = new FileOutputStream(m10906);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    fileOutputStream.close();
                    inputStream.close();
                    l3.u uVar = new l3.u();
                    u.a aVar = new u.a();
                    uVar.content = aVar;
                    aVar.images = new ArrayList();
                    uVar.content.images.add(Uri.fromFile(m10906).toString());
                    j2.m8937(uVar, context, null);
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Exception unused3) {
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception unused4) {
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused5) {
                }
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m8876(j2.f fVar, final a aVar) {
        try {
            final Context context = fVar.getContext();
            fVar.mo7790(aVar.f8207, new f.a() { // from class: h3.c
                @Override // j2.f.a
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8781(Object obj) {
                    e.m8874(aVar, context, (Bitmap) obj);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
