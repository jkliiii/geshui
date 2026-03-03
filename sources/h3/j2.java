package h3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.lt.app.App;
import com.lt.plugin.IPluginModel;
import com.lt.plugin.IWx;
import h3.j2;
import j2.f;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import l3.u;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import t3.e;
import z0.a;

/* compiled from: ShareActions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j2 implements a.d {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static j2 f8248;

    /* renamed from: ʻ, reason: contains not printable characters */
    private List<Integer> f8249;

    /* renamed from: ʼ, reason: contains not printable characters */
    private List<String> f8250;

    /* renamed from: ʽ, reason: contains not printable characters */
    private j2.f f8251;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Object f8252;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f8253;

    /* renamed from: ˆ, reason: contains not printable characters */
    private f f8254 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f8255 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final boolean f8256;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean f8257;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final boolean f8258;

    /* compiled from: ShareActions.java */
    class a implements f.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ boolean f8259;

        a(boolean z5) {
            this.f8259 = z5;
        }

        @Override // j2.f.b
        /* renamed from: ʻ */
        public void mo8747(boolean z5, Object obj) {
            if (z5) {
                return;
            }
            j2.this.m8913(this.f8259);
        }
    }

    /* compiled from: ShareActions.java */
    class b implements e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Activity f8261;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f8262;

        b(Activity activity, boolean z5) {
            this.f8261 = activity;
            this.f8262 = z5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public /* synthetic */ void m8949(g gVar, File file, boolean z5, Activity activity, File file2, String str) {
            if (file2 == null || !TextUtils.isEmpty(str)) {
                com.lt.app.c.m7959(activity, 2131820663);
            } else {
                gVar.f8271 = file.toString();
                j2.this.m8913(z5);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʿ, reason: contains not printable characters */
        public /* synthetic */ void m8950(Boolean bool) {
            j2.this.m8934(bool.booleanValue(), null);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
        @Override // h3.j2.e
        /* renamed from: ʻ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo8878(h3.j2.i r15) {
            /*
                Method dump skipped, instructions count: 378
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h3.j2.b.mo8878(h3.j2$i):void");
        }
    }

    /* compiled from: ShareActions.java */
    class c implements f.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ boolean f8264;

        c(boolean z5) {
            this.f8264 = z5;
        }

        @Override // j2.f.b
        /* renamed from: ʻ */
        public void mo8747(boolean z5, Object obj) {
            if (z5) {
                return;
            }
            j2.this.m8919(this.f8264);
        }
    }

    /* compiled from: ShareActions.java */
    class d implements e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ boolean f8266;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ Context f8267;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ IWx f8268;

        d(boolean z5, Context context, IWx iWx) {
            this.f8266 = z5;
            this.f8267 = context;
            this.f8268 = iWx;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public /* synthetic */ void m8952(Dialog dialog, Context context, t3.e eVar, IWx iWx, File file, String str) {
            n3.z1.m10884(dialog);
            j2.this.m8907(context, file, eVar, iWx);
        }

        @Override // h3.j2.e
        /* renamed from: ʻ */
        public void mo8878(i iVar) {
            String str;
            String str2;
            final t3.e eVar = new t3.e();
            if (j2.this.f8252 == null || (j2.this.f8252 instanceof i)) {
                i iVar2 = j2.this.f8252 != null ? (i) j2.this.f8252 : null;
                e.f fVar = new e.f();
                fVar.f11318 = (iVar2 == null || TextUtils.isEmpty(iVar2.f8281)) ? iVar.f8281 : iVar2.f8281;
                if (iVar2 != null) {
                    eVar.f11302 = iVar2.f8280;
                    eVar.f11303 = iVar2.f8282;
                    str = iVar2.f8283;
                } else {
                    str = null;
                }
                eVar.f11305 = fVar;
            } else if (j2.this.f8252 instanceof k) {
                k kVar = (k) j2.this.f8252;
                eVar.f11303 = !TextUtils.isEmpty(kVar.f8285) ? kVar.f8285 : iVar.f8280;
                e.d dVar = new e.d();
                dVar.f11316 = eVar.f11303;
                eVar.f11305 = dVar;
                str = null;
            } else if (j2.this.f8252 instanceof g) {
                str = ((g) j2.this.f8252).f8271;
                eVar.f11305 = new e.a();
            } else {
                if (j2.this.f8252 instanceof h) {
                    h hVar = (h) j2.this.f8252;
                    str2 = hVar.f8275;
                    e.c cVar = new e.c();
                    cVar.f11312 = !TextUtils.isEmpty(hVar.f8277) ? hVar.f8277 : iVar.f8281;
                    cVar.f11313 = !TextUtils.isEmpty(hVar.f8276) ? hVar.f8276 : iVar.f8281;
                    cVar.f11314 = hVar.f8278;
                    cVar.f11315 = hVar.f8279;
                    eVar.f11302 = hVar.f8273;
                    eVar.f11303 = hVar.f8274;
                    eVar.f11305 = cVar;
                } else {
                    if (!(j2.this.f8252 instanceof l)) {
                        return;
                    }
                    l lVar = (l) j2.this.f8252;
                    str2 = lVar.f8289;
                    e.C0162e c0162e = new e.C0162e();
                    c0162e.f11317 = !TextUtils.isEmpty(lVar.f8290) ? lVar.f8290 : iVar.f8281;
                    eVar.f11302 = lVar.f8287;
                    eVar.f11303 = lVar.f8288;
                    eVar.f11305 = c0162e;
                }
                str = str2;
            }
            eVar.f11301 = this.f8266;
            if (TextUtils.isEmpty(eVar.f11302)) {
                eVar.f11302 = iVar.f8280;
            }
            if (TextUtils.isEmpty(eVar.f11303)) {
                eVar.f11303 = iVar.f8282;
            }
            if (TextUtils.isEmpty(str)) {
                str = iVar.f8283;
            }
            if (TextUtils.isEmpty(str)) {
                j2.this.m8907(this.f8267, null, eVar, this.f8268);
                return;
            }
            if (!str.startsWith("data:") && !com.lt.app.c.m7967(str)) {
                try {
                    str = new URL(new URL(j2.this.f8251.getUrl()), str).toString();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            String str3 = str;
            File m10906 = n3.z1.m10906(this.f8267, "wx_img");
            Context context = this.f8267;
            final Dialog m10883 = n3.z1.m10883(context, context.getString(2131820844));
            final Context context2 = this.f8267;
            final IWx iWx = this.f8268;
            n3.z1.m10950(context2, str3, m10906, new n3.e() { // from class: h3.m2
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    this.f8309.m8952(m10883, context2, eVar, iWx, (File) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShareActions.java */
    interface e {
        /* renamed from: ʻ */
        void mo8878(i iVar);
    }

    /* compiled from: ShareActions.java */
    public interface f {
        /* renamed from: ʻ */
        void mo8869(int i5, boolean z5, String str);
    }

    /* compiled from: ShareActions.java */
    public static class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f8270;

        /* renamed from: ʼ, reason: contains not printable characters */
        public String f8271;
    }

    /* compiled from: ShareActions.java */
    public static class h {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f8272;

        /* renamed from: ʼ, reason: contains not printable characters */
        public String f8273;

        /* renamed from: ʽ, reason: contains not printable characters */
        public String f8274;

        /* renamed from: ʾ, reason: contains not printable characters */
        public String f8275;

        /* renamed from: ʿ, reason: contains not printable characters */
        public String f8276;

        /* renamed from: ˆ, reason: contains not printable characters */
        public String f8277;

        /* renamed from: ˈ, reason: contains not printable characters */
        public String f8278;

        /* renamed from: ˉ, reason: contains not printable characters */
        public String f8279;
    }

    /* compiled from: ShareActions.java */
    public static class i {

        /* renamed from: ʻ, reason: contains not printable characters */
        public String f8280;

        /* renamed from: ʼ, reason: contains not printable characters */
        public String f8281;

        /* renamed from: ʽ, reason: contains not printable characters */
        public String f8282;

        /* renamed from: ʾ, reason: contains not printable characters */
        public String f8283;
    }

    /* compiled from: ShareActions.java */
    public static class j implements IPluginModel {
        public String desc;
        public String imgUrl;
        public String title;
        public int to;
        public String videoUrl;
    }

    /* compiled from: ShareActions.java */
    public static class k {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f8284;

        /* renamed from: ʼ, reason: contains not printable characters */
        public String f8285;
    }

    /* compiled from: ShareActions.java */
    public static class l {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f8286;

        /* renamed from: ʼ, reason: contains not printable characters */
        public String f8287;

        /* renamed from: ʽ, reason: contains not printable characters */
        public String f8288;

        /* renamed from: ʾ, reason: contains not printable characters */
        public String f8289;

        /* renamed from: ʿ, reason: contains not printable characters */
        public String f8290;
    }

    /* compiled from: ShareActions.java */
    public static class m implements IPluginModel {
        public String description;
        public String path;
        public int programType;
        public String thumbImage;
        public String title;
        public String userName;
        public String webPageUrl;
        public boolean withShareTicket;
    }

    private j2() {
        this.f8256 = u2.m9056() && App.m7829(2130968576);
        this.f8257 = n3.a1.m10655() != null;
        this.f8258 = !TextUtils.isEmpty(App.m7835().getString(2131820791));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.io.File m8898(l3.u r3, android.app.Activity r4, java.lang.Integer r5) {
        /*
            l3.u$a r3 = r3.content
            java.util.List<java.lang.String> r3 = r3.images
            int r0 = r5.intValue()
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "."
            if (r0 != 0) goto L48
            boolean r0 = android.webkit.URLUtil.isFileUrl(r3)
            if (r0 == 0) goto L26
            java.io.File r4 = new java.io.File
            java.net.URI r3 = java.net.URI.create(r3)
            r4.<init>(r3)
            return r4
        L26:
            r0 = 0
            java.lang.String r2 = "image/jpeg"
            java.lang.String r3 = android.webkit.URLUtil.guessFileName(r3, r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L48
            int r0 = r3.indexOf(r1)
            if (r0 < 0) goto L48
            int r2 = r3.length()
            int r2 = r2 + (-1)
            if (r0 >= r2) goto L48
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            goto L4a
        L48:
            java.lang.String r3 = "jpg"
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "share"
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.io.File r3 = n3.z1.m10906(r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.j2.m8898(l3.u, android.app.Activity, java.lang.Integer):java.io.File");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static /* synthetic */ void m8899(Dialog dialog, Activity activity, i2.e eVar, Intent intent, l3.u uVar, File file, String str) {
        n3.z1.m10884(dialog);
        if (file == null) {
            d0.m8796(activity, 1, activity.getString(2131820619), eVar, false);
            return;
        }
        Uri m10943 = n3.z1.m10943(activity, file);
        intent.putExtra("android.intent.extra.STREAM", m10943);
        String str2 = uVar.content.file.mimeType;
        if (TextUtils.isEmpty(str2)) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(m10943.toString());
            if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.setType(str2);
        }
        m8933(intent, uVar.title, activity, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static /* synthetic */ void m8901(Activity activity, i2.e eVar, Intent intent, l3.u uVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            File file = (File) list.get(i5);
            if (file == null) {
                d0.m8796(activity, 1, "第 " + (i5 + 1) + " 张图片下载失败", eVar, false);
                return;
            }
            arrayList.add(n3.z1.m10943(activity, file));
        }
        m8903(intent, arrayList);
        m8933(intent, uVar.title, activity, eVar);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static void m8903(Intent intent, ArrayList<Uri> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            intent.putExtra("android.intent.extra.STREAM", arrayList.get(0));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putExtra("android.intent.extra.STREAM", arrayList);
        }
        intent.setType("image/jpeg");
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m8905(final e eVar) {
        final i iVar = new i();
        String url = this.f8251.getUrl();
        t1 m9049 = t1.m9049(url);
        if (!TextUtils.isEmpty(m9049.f8385)) {
            url = m9049.f8385;
        }
        iVar.f8281 = url;
        String title = !TextUtils.isEmpty(m9049.f8384) ? m9049.f8384 : this.f8251.getTitle();
        iVar.f8280 = title;
        if (TextUtils.isEmpty(title)) {
            iVar.f8280 = iVar.f8281;
        }
        iVar.f8283 = !TextUtils.isEmpty(m9049.f8386) ? m9049.f8386 : App.m7827().shareImg;
        if (TextUtils.isEmpty(m9049.f8387)) {
            this.f8251.evaluateJavascript("(function(){for(var a=document.getElementsByTagName('meta'),b=0;b<a.length;b++){var c=a[b];if(c.getAttribute('name')&&'description'==c.getAttribute('name').toLowerCase())return c.getAttribute('content')}return''})();", new ValueCallback() { // from class: h3.c2
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    j2.m8938(iVar, eVar, (String) obj);
                }
            });
        } else {
            iVar.f8282 = !TextUtils.isEmpty(m9049.f8387) ? m9049.f8387 : iVar.f8281;
            eVar.mo8878(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m8907(Context context, File file, t3.e eVar, IWx iWx) {
        if (file != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(file.toString());
            if (decodeFile != null) {
                eVar.f11304 = g3.a0.m8715(decodeFile, 150, 150);
            } else {
                file = null;
            }
        }
        if (eVar.f11304 == null) {
            eVar.f11304 = BitmapFactory.decodeResource(App.m7835().getResources(), 2131623947);
        }
        if ((eVar.f11305 instanceof e.a) && file != null) {
            try {
                Uri m10943 = n3.z1.m10943(context, file);
                context.grantUriPermission("com.tencent.mm", m10943, 1);
                ((e.a) eVar.f11305).f11306 = m10943.toString();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        iWx.m8038(eVar, this.f8251.getContext(), new n3.e() { // from class: h3.i2
            @Override // n3.e
            /* renamed from: ʻ */
            public final void mo8748(Object obj, Object obj2) {
                this.f8241.m8940((Integer) obj, (String) obj2);
            }
        });
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static boolean m8909(int i5, j2.f fVar, i iVar, f fVar2, boolean z5) {
        j2 m8936 = m8936(fVar, iVar, fVar2);
        if (m8936 == null) {
            return false;
        }
        m8936.f8253 = z5;
        return m8936.m8921(i5);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m8911(j jVar) {
        if (!this.f8257) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820840);
            m8925();
        } else {
            if (App.m7815(34, true)) {
                return;
            }
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820688);
            m8925();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊˊ, reason: contains not printable characters */
    public boolean m8913(boolean z5) {
        if (!this.f8257) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820840);
            m8925();
            return false;
        }
        if (!App.m7815(34, true)) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820688);
            m8925();
            return false;
        }
        if (this.f8253 && this.f8251.getJsBridgeInjected()) {
            this.f8253 = false;
            this.f8251.mo9241(z5 ? "onMenuShareQZone" : "onMenuShareQQ", null, new a(z5));
            return true;
        }
        this.f8255 = z5 ? 3 : 2;
        m8905(new b((Activity) this.f8251.getContext(), z5));
        return true;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static boolean m8915(Object obj, j2.f fVar, f fVar2) {
        j2 m8936 = m8936(fVar, obj, fVar2);
        return m8936 != null && m8936.m8921(-1);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private boolean m8917() {
        if (!App.m7815(50, true)) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820688);
            m8925();
            return false;
        }
        if (!this.f8258) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820846);
            m8925();
            return false;
        }
        if (this.f8253 && this.f8251.getJsBridgeInjected()) {
            this.f8253 = false;
            this.f8251.mo9241("onMenuShareWeibo", null, new f.b() { // from class: h3.d2
                @Override // j2.f.b
                /* renamed from: ʻ */
                public final void mo8747(boolean z5, Object obj) {
                    this.f8206.m8942(z5, obj);
                }
            });
            return true;
        }
        final n3.p0 m10700 = n3.a1.m10700();
        if (m10700 != null) {
            m8905(new e() { // from class: h3.e2
                @Override // h3.j2.e
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8878(j2.i iVar) {
                    this.f8214.m8943(m10700, iVar);
                }
            });
            return true;
        }
        n3.z1.m10910(this.f8251.getContext());
        m8925();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏˏ, reason: contains not printable characters */
    public boolean m8919(boolean z5) {
        if (!this.f8256) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820848);
            m8925();
            return false;
        }
        if (!App.m7815(33, true)) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820688);
            m8925();
            return false;
        }
        if (this.f8253 && this.f8251.getJsBridgeInjected()) {
            this.f8253 = false;
            this.f8251.mo9241(z5 ? "onMenuShareTimeline" : "onMenuShareFriend", null, new c(z5));
            return true;
        }
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            return false;
        }
        this.f8255 = !z5 ? 1 : 0;
        m8905(new d(z5, this.f8251.getContext(), m10701));
        return true;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private boolean m8921(int i5) {
        Object obj = this.f8252;
        if (obj == null || (obj instanceof i)) {
            if (m8941(i5)) {
                m8919(i5 == 0);
            } else if (m8939(i5)) {
                m8913(i5 == 3);
            } else if (m8927(i5)) {
                m8917();
            } else {
                m8923(0, 1, 2, 3, 4);
            }
        } else if (obj instanceof k) {
            k kVar = (k) obj;
            if (!m8941(i5)) {
                i5 = kVar.f8284;
            }
            if (m8941(i5)) {
                m8919(i5 == 0);
            } else {
                m8923(0, 1);
            }
        } else if (obj instanceof g) {
            g gVar = (g) obj;
            if (!m8941(i5) && !m8939(i5)) {
                i5 = gVar.f8270;
            }
            if (m8941(i5)) {
                m8919(i5 == 0);
            } else if (m8939(i5)) {
                m8913(false);
            } else {
                m8923(0, 1, 2);
            }
        } else if (obj instanceof h) {
            h hVar = (h) obj;
            if (!m8941(i5) && !m8939(i5)) {
                i5 = hVar.f8272;
            }
            if (m8941(i5)) {
                m8919(i5 == 0);
            } else if (m8939(i5)) {
                m8913(false);
            } else {
                m8923(0, 1, 2);
            }
        } else if (obj instanceof l) {
            l lVar = (l) obj;
            if (!m8941(i5)) {
                i5 = lVar.f8286;
            }
            if (m8941(i5)) {
                m8919(i5 == 0);
            } else {
                m8923(0, 1);
            }
        } else if (obj instanceof m) {
            m8935((m) obj);
        } else {
            if (!(obj instanceof j)) {
                return false;
            }
            m8911((j) obj);
        }
        return true;
    }

    /* renamed from: יי, reason: contains not printable characters */
    private boolean m8923(int... iArr) {
        if (this.f8249 == null) {
            this.f8249 = new ArrayList(5);
        }
        if (this.f8250 == null) {
            this.f8250 = new ArrayList(5);
        }
        this.f8249.clear();
        this.f8250.clear();
        for (int i5 = 0; iArr != null && i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (this.f8256 && i6 == 0) {
                this.f8250.add(App.m7812(2131820849));
                this.f8249.add(0);
            }
            if (this.f8256 && i6 == 1) {
                this.f8250.add(App.m7812(2131820847));
                this.f8249.add(1);
            }
            if (this.f8257 && i6 == 2) {
                this.f8250.add(App.m7812(2131820839));
                this.f8249.add(2);
            }
            if (this.f8257 && i6 == 3) {
                this.f8250.add(App.m7812(2131820841));
                this.f8249.add(3);
            }
            if (this.f8258 && i6 == 4) {
                this.f8250.add(App.m7812(2131820588));
                this.f8249.add(4);
            }
        }
        if (this.f8250.isEmpty()) {
            return false;
        }
        String[] strArr = new String[this.f8250.size()];
        this.f8250.toArray(strArr);
        this.f8250.clear();
        com.lt.app.b bVar = (com.lt.app.b) this.f8251.getContext();
        z0.a.m13112(bVar, bVar.m4043()).m13128(2131820604).m13132(strArr).m13130(true).m13131(this).m13133();
        return true;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private boolean m8927(int i5) {
        return i5 == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public /* synthetic */ void m8929(PopupWindow popupWindow, t3.e eVar, IWx iWx, Exception exc, Bitmap bitmap) {
        popupWindow.dismiss();
        if (exc == null && bitmap != null) {
            eVar.f11304 = g3.a0.m8715(bitmap, 480, 480);
        }
        iWx.m8038(eVar, this.f8251.getContext(), new n3.e() { // from class: h3.h2
            @Override // n3.e
            /* renamed from: ʻ */
            public final void mo8748(Object obj, Object obj2) {
                this.f8236.m8944((Integer) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public /* synthetic */ void m8931(Integer num, String str) {
        m8934(num.intValue() == 0, str);
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private static void m8933(Intent intent, String str, Activity activity, i2.e eVar) {
        try {
            activity.startActivity(Intent.createChooser(intent, str));
            d0.m8796(activity, 0, null, eVar, false);
        } catch (Exception e5) {
            e5.printStackTrace();
            d0.m8796(activity, 2, e5.getMessage(), eVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m8934(boolean z5, String str) {
        f fVar = this.f8254;
        if (fVar != null) {
            fVar.mo8869(this.f8255, z5, str);
        }
        this.f8254 = null;
        if (this.f8251 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("if ((typeof jsBridge != 'undefined') && (typeof jsBridge.onShareDone == 'function')) jsBridge.onShareDone(");
            sb.append(z5 ? "true" : "false");
            sb.append(",");
            sb.append(String.valueOf(this.f8255));
            sb.append(")");
            this.f8251.mo7788(sb.toString());
        }
        this.f8255 = -1;
        this.f8251 = null;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m8935(m mVar) {
        if (!this.f8256) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820848);
            m8925();
            return;
        }
        if (!App.m7815(33, true)) {
            com.lt.app.c.m7959(this.f8251.getContext(), 2131820688);
            m8925();
            return;
        }
        final IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            return;
        }
        e.b bVar = new e.b();
        bVar.f11309 = mVar.userName;
        bVar.f11307 = mVar.webPageUrl;
        bVar.f11308 = mVar.programType;
        bVar.f11310 = mVar.path;
        bVar.f11311 = mVar.withShareTicket;
        final t3.e eVar = new t3.e();
        eVar.f11301 = false;
        eVar.f11302 = mVar.title;
        eVar.f11303 = mVar.description;
        eVar.f11305 = bVar;
        if (!com.lt.app.c.m7967(mVar.thumbImage)) {
            m10701.m8038(eVar, this.f8251.getContext(), new n3.e() { // from class: h3.g2
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    this.f8232.m8931((Integer) obj, (String) obj2);
                }
            });
        } else {
            final PopupWindow m7980 = com.lt.app.c.m7980(this.f8251.getViewEx());
            x2.l.m12714(this.f8251.getContext()).mo187(mVar.thumbImage).mo181().mo9865(new m2.g() { // from class: h3.f2
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    this.f8224.m8929(m7980, eVar, m10701, exc, (Bitmap) obj);
                }
            });
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static j2 m8936(j2.f fVar, Object obj, f fVar2) {
        if (!App.m7829(2130968576) && n3.a1.m10655() == null) {
            Toast.makeText(fVar.getContext(), 2131820838, 1).show();
            return null;
        }
        if (fVar == null || !(fVar.getContext() instanceof com.lt.app.b)) {
            return null;
        }
        if (f8248 == null) {
            f8248 = new j2();
        }
        j2 j2Var = f8248;
        j2Var.f8251 = fVar;
        j2Var.f8252 = obj;
        j2Var.f8254 = fVar2;
        return j2Var;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static void m8937(final l3.u uVar, Context context, final i2.e eVar) {
        boolean z5;
        u.a aVar;
        String str;
        if (context instanceof Activity) {
            final Activity activity = (Activity) context;
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.setType("text/plain");
            if (uVar == null || (aVar = uVar.content) == null) {
                z5 = false;
            } else {
                if (!TextUtils.isEmpty(aVar.subject)) {
                    intent.putExtra("android.intent.extra.SUBJECT", uVar.content.subject);
                }
                if (TextUtils.isEmpty(uVar.content.text)) {
                    z5 = false;
                } else {
                    intent.putExtra("android.intent.extra.TEXT", uVar.content.text);
                    if (!TextUtils.isEmpty(uVar.content.html)) {
                        intent.putExtra("android.intent.extra.HTML_TEXT", uVar.content.html);
                    }
                    z5 = true;
                }
                List<String> list = uVar.content.images;
                if (list != null && !list.isEmpty()) {
                    n3.z1.m10954(activity, uVar.content.images, new n3.d0() { // from class: h3.z1
                        @Override // n3.d0
                        /* renamed from: ʻ */
                        public final Object mo8739(Object obj) {
                            return j2.m8898(uVar, activity, (Integer) obj);
                        }
                    }, new n3.f() { // from class: h3.a2
                        @Override // n3.f
                        /* renamed from: ʻ */
                        public final void mo8742(Object obj) {
                            j2.m8901(activity, eVar, intent, uVar, (List) obj);
                        }
                    });
                    return;
                }
                u.b bVar = uVar.content.file;
                if (bVar != null && !TextUtils.isEmpty(bVar.url)) {
                    if (TextUtils.isEmpty(uVar.content.file.fileName)) {
                        u.b bVar2 = uVar.content.file;
                        str = URLUtil.guessFileName(bVar2.url, null, bVar2.mimeType);
                    } else {
                        str = uVar.content.file.fileName;
                    }
                    File m10906 = n3.z1.m10906(activity, str);
                    final Dialog m10883 = n3.z1.m10883(activity, activity.getString(2131820624));
                    n3.z1.m10950(activity, uVar.content.file.url, m10906, new n3.e() { // from class: h3.b2
                        @Override // n3.e
                        /* renamed from: ʻ */
                        public final void mo8748(Object obj, Object obj2) {
                            j2.m8899(m10883, activity, eVar, intent, uVar, (File) obj, (String) obj2);
                        }
                    });
                    return;
                }
            }
            if (z5) {
                m8933(intent, uVar.title, activity, eVar);
            } else {
                d0.m8796(activity, 1, "缺少分享内容", eVar, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m8938(i iVar, e eVar, String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            trim = iVar.f8281;
        }
        iVar.f8282 = trim;
        eVar.mo8878(iVar);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private boolean m8939(int i5) {
        return i5 >= 2 && i5 <= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public /* synthetic */ void m8940(Integer num, String str) {
        m8934(num.intValue() == 0, str);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private boolean m8941(int i5) {
        return i5 >= 0 && i5 <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹶ, reason: contains not printable characters */
    public /* synthetic */ void m8942(boolean z5, Object obj) {
        if (z5) {
            return;
        }
        m8917();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞ, reason: contains not printable characters */
    public /* synthetic */ void m8943(n3.p0 p0Var, i iVar) {
        p0Var.m10808((n3.d) this.f8251.getContext(), (TextUtils.isEmpty(iVar.f8282) || com.lt.app.c.m7967(iVar.f8282)) ? iVar.f8280 : iVar.f8282, iVar.f8280, !TextUtils.isEmpty(iVar.f8282) ? iVar.f8282 : iVar.f8280, iVar.f8283, iVar.f8281, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public /* synthetic */ void m8944(Integer num, String str) {
        m8934(num.intValue() == 0, str);
    }

    @Override // z0.a.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo8945(z0.a aVar, boolean z5) {
        m8925();
    }

    @Override // z0.a.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo8946(z0.a aVar, int i5) {
        if (i5 >= this.f8249.size()) {
            return;
        }
        m8921(this.f8249.get(i5).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ــ, reason: contains not printable characters */
    public void m8925() {
    }
}
