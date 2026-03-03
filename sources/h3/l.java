package h3;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.lt.app.App;
import l3.u;
import w0.f;

/* compiled from: DownloadListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l implements j2.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8299;

    public l(Context context) {
        this.f8299 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼ, reason: contains not printable characters */
    public /* synthetic */ void m8955(String str, w0.f fVar, w0.b bVar) {
        new j(this.f8299, str).m8895(this.f8299.getString(2131820614));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m8956(String str, String str2, String str3) {
        l3.u uVar = new l3.u();
        uVar.title = str2;
        u.a aVar = new u.a();
        uVar.content = aVar;
        aVar.file = new u.b();
        u.b bVar = uVar.content.file;
        bVar.url = str;
        bVar.fileName = str2;
        bVar.mimeType = str3;
        j2.m8937(uVar, this.f8299, null);
    }

    @Override // j2.a
    public void onDownloadStart(final String str, String str2, String str3, String str4, long j5) {
        String guessFileName = URLUtil.guessFileName(str, str3, str4);
        if (URLUtil.isDataUrl(str) || str.startsWith("blob:")) {
            m8956(str, guessFileName, str4);
            return;
        }
        n3.b0 m10747 = n3.a1.m10747();
        if (m10747 != null && App.m7815(51, true) && m10747.m10754(this.f8299, guessFileName)) {
            m10747.m10755(this.f8299, str, guessFileName, str4, App.m7827().m9729(17));
            return;
        }
        boolean z5 = !TextUtils.isEmpty(guessFileName) && guessFileName.toLowerCase().endsWith(".apk");
        if (!z5) {
            String path = Uri.parse(str).getPath();
            z5 = !TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".apk");
        }
        if (z5) {
            new f.e(this.f8299).m12497(2131820614).m12484(2131820615).m12483(false).m12488(2131820604).m12492(2131820614).m12491(new f.h() { // from class: h3.k
                @Override // w0.f.h
                /* renamed from: ʻ */
                public final void mo8884(w0.f fVar, w0.b bVar) {
                    this.f8291.m8955(str, fVar, bVar);
                }
            }).m12496();
        } else {
            com.lt.app.c.m7986(this.f8299, str, true);
        }
    }
}
