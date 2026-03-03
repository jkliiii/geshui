package h3;

import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.PopupWindow;
import com.google.android.material.R;
import h3.p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* compiled from: HttpNet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v implements p.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final n3.d f8396;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f8397;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final i3.b f8398;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final i2.e f8399;

    /* renamed from: ʿ, reason: contains not printable characters */
    private m2.f f8400 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private w0.f f8401 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private PopupWindow f8402 = null;

    private v(n3.d dVar, boolean z5, i3.b bVar, i2.e eVar) {
        this.f8396 = dVar;
        this.f8397 = z5;
        this.f8398 = bVar;
        this.f8399 = eVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private String m9068(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr, 0, 4096);
                if (read <= 0) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public /* synthetic */ void m9069(long j5, long j6) {
        int i5;
        if (j5 > 0) {
            double d6 = j6;
            Double.isNaN(d6);
            double d7 = j5;
            Double.isNaN(d7);
            i5 = (int) ((d6 * 100.0d) / d7);
        } else {
            i5 = 100;
        }
        this.f8401.m12479(i5);
        if (i5 == 100) {
            this.f8401.dismiss();
            this.f8401 = null;
            View findViewById = this.f8396.findViewById(R.id.content);
            if (findViewById != null) {
                this.f8402 = com.lt.app.c.m7980(findViewById);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public /* synthetic */ void m9070(w0.f fVar, w0.b bVar) {
        m2.f fVar2 = this.f8400;
        if (fVar2 != null) {
            fVar2.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public /* synthetic */ void m9071(File file, Exception exc, InputStream inputStream) {
        if (file != null) {
            file.delete();
        }
        w0.f fVar = this.f8401;
        String str = null;
        if (fVar != null) {
            fVar.dismiss();
            this.f8401 = null;
        }
        PopupWindow popupWindow = this.f8402;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f8402 = null;
        }
        if (exc != null) {
            m9074(exc instanceof CancellationException ? "canceled" : exc.getMessage());
            exc.printStackTrace();
            return;
        }
        if (inputStream != null) {
            str = m9068(inputStream);
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        m9076(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public /* synthetic */ void m9072(File file, Exception exc, String str) {
        if (file != null) {
            file.delete();
        }
        w0.f fVar = this.f8401;
        if (fVar != null) {
            fVar.dismiss();
            this.f8401 = null;
        }
        PopupWindow popupWindow = this.f8402;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.f8402 = null;
        }
        if (exc == null) {
            m9076(str);
        } else {
            m9074(exc instanceof CancellationException ? "canceled" : exc.getMessage());
            exc.printStackTrace();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m9073(n3.d dVar, boolean z5, i3.b bVar, i2.e eVar) {
        new v(dVar, z5, bVar, eVar).m9077();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m9074(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", 2);
            jSONObject.put("b", str);
            d0.m8796(this.f8396, 0, jSONObject.toString(), this.f8399, false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public void m9075(final long j5, final long j6) {
        if (this.f8401 != null) {
            this.f8396.runOnUiThread(new Runnable() { // from class: h3.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8389.m9069(j6, j5);
                }
            });
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", 0);
            jSONObject.put("b", j5);
            jSONObject.put("c", j6);
            d0.m8796(this.f8396, 0, jSONObject.toString(), this.f8399, true);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m9076(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", 1);
            jSONObject.put("b", str);
            d0.m8796(this.f8396, 0, jSONObject.toString(), this.f8399, false);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m9077() {
        if (TextUtils.isEmpty(this.f8398.url) || !(URLUtil.isHttpUrl(this.f8398.url) || URLUtil.isHttpsUrl(this.f8398.url))) {
            m9074("url should start with http:// or https://");
        } else if (!this.f8397) {
            mo8981(null);
        } else {
            p.m8980(this.f8396, this.f8398.menuItems, n3.k.m10785(this.f8398.chooseMime), this);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:86:0x0199
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1177)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // h3.p.a
    /* renamed from: ʻ */
    public void mo8981(android.net.Uri[] r10) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.v.mo8981(android.net.Uri[]):void");
    }
}
