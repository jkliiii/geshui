package p3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import p3.c;

/* compiled from: DohResolver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends c {

    /* compiled from: DohResolver.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ HttpsURLConnection f10362;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ DataOutputStream f10363;

        a(HttpsURLConnection httpsURLConnection, DataOutputStream dataOutputStream) {
            this.f10362 = httpsURLConnection;
            this.f10363 = dataOutputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10362.disconnect();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                this.f10363.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
    }

    public f(String str) {
        super(str);
    }

    @Override // p3.c
    /* renamed from: ʿ */
    d mo11148(c.C0150c c0150c, String str, String str2, int i5) throws IOException {
        int contentLength;
        b bVar = new b((short) (Math.random() * 65535.0d), i5, str2);
        byte[] m11144 = bVar.m11144();
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setConnectTimeout(3000);
        httpsURLConnection.setReadTimeout(this.f10329 * 1000);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("Content-Type", "application/dns-message");
        httpsURLConnection.setRequestProperty("Accept", "application/dns-message");
        httpsURLConnection.setRequestProperty("Accept-Encoding", BuildConfig.FLAVOR);
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        c0150c.m11149(new a(httpsURLConnection, dataOutputStream));
        dataOutputStream.write(m11144);
        dataOutputStream.close();
        if (httpsURLConnection.getResponseCode() != 200 || (contentLength = httpsURLConnection.getContentLength()) <= 0 || contentLength > 1048576) {
            return null;
        }
        InputStream inputStream = httpsURLConnection.getInputStream();
        byte[] bArr = new byte[contentLength];
        int read = inputStream.read(bArr);
        inputStream.close();
        if (read <= 0) {
            return null;
        }
        return new d(str, 5, bVar, bArr);
    }
}
