package h3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import n3.r;
import w0.f;

/* compiled from: DownApk.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8242;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f8243;

    /* renamed from: ʽ, reason: contains not printable characters */
    private w0.f f8244 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private r.d f8245 = null;

    public j(Context context, String str) {
        this.f8242 = context;
        this.f8243 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public /* synthetic */ void m8892(w0.f fVar, w0.b bVar) {
        r.d dVar = this.f8245;
        if (dVar != null) {
            dVar.m10840();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m8893(File file, Exception exc) {
        w0.f fVar = this.f8244;
        if (fVar != null) {
            fVar.dismiss();
            this.f8244 = null;
        }
        if (exc == null && file != null && file.exists() && file.length() > 0) {
            g3.a0.m8734(this.f8242, file);
        } else {
            if (this.f8245.m10841()) {
                return;
            }
            Toast.makeText(this.f8242, 2131820619, 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public /* synthetic */ void m8894(n3.e eVar, long j5, long j6, boolean z5) {
        w0.f fVar = this.f8244;
        if (fVar != null) {
            fVar.m12478(((int) j6) / 1024);
            this.f8244.m12479(((int) j5) / 1024);
        }
        if (eVar != null) {
            eVar.mo8748(Long.valueOf(j5), Long.valueOf(j6));
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8895(String str) {
        m8896(str, null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m8896(String str, final n3.e<Long, Long> eVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f8244 = new f.e(this.f8242).m12498(str).m12484(2131820624).m12495(false, 0, true).m12483(false).m12488(2131820604).m12490(new f.h() { // from class: h3.g
                @Override // w0.f.h
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8884(w0.f fVar, w0.b bVar) {
                    this.f8228.m8892(fVar, bVar);
                }
            }).m12496();
        }
        File m10906 = n3.z1.m10906(this.f8242, "lt.ver.apk");
        if (m10906 == null) {
            Toast.makeText(this.f8242, "无法保存文件", 1).show();
        } else {
            Log.d("YM", m10906.toString());
            this.f8245 = n3.r.m10821(this.f8243).m10834("Mozilla/5.0 (Linux; Android 11; Pixel 5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/90.0.4430.91 Mobile Safari/537.36").m10830(m10906, new r.c() { // from class: h3.h
                @Override // n3.r.c
                /* renamed from: ʻ */
                public final void mo8741(Object obj, Exception exc) {
                    this.f8233.m8893((File) obj, exc);
                }
            }, new r.e() { // from class: h3.i
                @Override // n3.r.e
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8887(long j5, long j6, boolean z5) {
                    this.f8237.m8894(eVar, j5, j6, z5);
                }
            });
        }
    }
}
