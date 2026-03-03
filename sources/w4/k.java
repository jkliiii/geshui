package w4;

import java.io.IOException;
import java.net.ProtocolException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import s4.w;

/* compiled from: StatusLine.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final w f12084;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int f12085;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final String f12086;

    public k(w wVar, int i5, String str) {
        this.f12084 = wVar;
        this.f12085 = i5;
        this.f12086 = str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static k m12626(String str) throws IOException {
        w wVar;
        int i5;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i5 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                wVar = w.HTTP_1_0;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                wVar = w.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            wVar = w.HTTP_1_0;
            i5 = 4;
        }
        int i6 = i5 + 3;
        if (str.length() < i6) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i5, i6));
            if (str.length() <= i6) {
                str2 = BuildConfig.FLAVOR;
            } else {
                if (str.charAt(i6) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i5 + 4);
            }
            return new k(wVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12084 == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f12085);
        if (this.f12086 != null) {
            sb.append(' ');
            sb.append(this.f12086);
        }
        return sb.toString();
    }
}
