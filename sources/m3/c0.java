package m3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.lt.app.App;
import h3.e;
import h3.j2;
import j2.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.r;
import n3.z1;
import org.json.JSONObject;
import z0.a;

/* compiled from: LTLongClick.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c0 implements a.d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j2.f f9151;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final boolean f9153;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final boolean f9154;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f9155;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final boolean f9156;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f9157;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final boolean f9158;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean f9159;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f9163;

    /* renamed from: י, reason: contains not printable characters */
    private int f9164;

    /* renamed from: ˋ, reason: contains not printable characters */
    private String f9160 = null;

    /* renamed from: ˎ, reason: contains not printable characters */
    private String f9161 = null;

    /* renamed from: ˏ, reason: contains not printable characters */
    private String f9162 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<Integer> f9152 = new ArrayList(5);

    /* compiled from: LTLongClick.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f9165;

        a(int i5) {
            this.f9165 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.m9926(this.f9165);
        }
    }

    /* compiled from: LTLongClick.java */
    private static final class b extends Handler {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final c0 f9167;

        /* compiled from: LTLongClick.java */
        class a implements ValueCallback<String> {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ String f9168;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ String f9169;

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ String f9170;

            a(String str, String str2, String str3) {
                this.f9168 = str;
                this.f9169 = str2;
                this.f9170 = str3;
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                String str2 = this.f9168;
                String str3 = this.f9169;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (TextUtils.isEmpty(str2)) {
                            str2 = jSONObject.optString("i");
                        }
                        if (TextUtils.isEmpty(str3)) {
                            str3 = jSONObject.optString("t");
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                b.this.f9167.m9935(this.f9170, str2, str3);
            }
        }

        /* synthetic */ b(c0 c0Var, a aVar) {
            this(c0Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            String str = BuildConfig.FLAVOR;
            String string = data != null ? data.getString("url") : BuildConfig.FLAVOR;
            String string2 = data != null ? data.getString("src") : BuildConfig.FLAVOR;
            if (data != null) {
                str = data.getString("title");
            }
            if (!TextUtils.isEmpty(string2) && (TextUtils.isEmpty(string) || !TextUtils.isEmpty(str))) {
                this.f9167.m9935(string, string2, str);
                return;
            }
            float f5 = this.f9167.f9151.getContext().getResources().getDisplayMetrics().density;
            if (f5 < 1.0f) {
                f5 = 1.0f;
            }
            this.f9167.f9151.evaluateJavascript(String.format(Locale.ROOT, "(function(t,e){for(var a=document,i={t:'',a:'',i:'',c:document.cookie},o=a.elementFromPoint(t,e);o;){var r=o.tagName;if(!i.a&&r&&'a'==r.toLowerCase()&&(i.a=o.href),!i.i&&r&&'img'==r.toLowerCase()&&(i.i=o.src),i.t||(i.t=(o.title?o.title:o.text?o.text:'').trim()),i.a&&i.i)break;o=o.parentNode}return JSON.stringify(i)})(%d,%d);", Integer.valueOf((int) (this.f9167.f9163 / f5)), Integer.valueOf((int) (this.f9167.f9164 / f5))), new a(string2, str, string));
        }

        private b(c0 c0Var) {
            super(Looper.getMainLooper());
            this.f9167 = c0Var;
        }
    }

    /* compiled from: LTLongClick.java */
    private static class c extends Handler {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f9172;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final PopupWindow f9173;

        c(Context context, PopupWindow popupWindow) {
            super(Looper.getMainLooper());
            this.f9172 = context;
            this.f9173 = popupWindow;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PopupWindow popupWindow = this.f9173;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
            String str = (String) message.obj;
            if (TextUtils.isEmpty(str)) {
                Toast.makeText(this.f9172, 2131820665, 1).show();
                return;
            }
            if (App.m7827() != null && App.m7827().m9729(4) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
                com.lt.app.c.m7978(this.f9172, str, null, true);
            } else {
                com.lt.app.c.m7985(this.f9172, App.m7835().m7848(str));
            }
        }
    }

    private c0(j2.f fVar, long j5, long j6, l3.a aVar) {
        this.f9151 = fVar;
        this.f9153 = (j5 & 2048) == 2048;
        this.f9154 = (128 & j6) == 0;
        this.f9155 = (j5 & 4096) == 4096;
        this.f9156 = (j5 & 8192) == 8192;
        this.f9157 = (j6 & 524288) == 524288;
        this.f9158 = (j6 & 1048576) == 1048576;
        this.f9159 = (j6 & 2097152) == 2097152;
        m9928(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public void m9926(int i5) {
        if (i5 >= this.f9152.size()) {
        }
        final Context context = this.f9151.getContext();
        final int intValue = this.f9152.get(i5).intValue();
        switch (intValue) {
            case 2131820660:
                l3.a m7827 = App.m7827();
                e.a aVar = new e.a();
                aVar.f8207 = m7827.m9729(22);
                aVar.f8208 = m7827.m9729(23);
                aVar.f8209 = false;
                h3.e.m8872(this.f9151, aVar);
                break;
            case 2131820661:
            case 2131820671:
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(null, intValue == 2131820671 ? this.f9160 : this.f9161));
                    Toast.makeText(context, 2131820662, 1).show();
                    break;
                }
                break;
            case 2131820664:
            case 2131820666:
                if (!this.f9161.startsWith("data:")) {
                    final PopupWindow m7980 = com.lt.app.c.m7980(this.f9151.getViewEx());
                    if (!this.f9161.startsWith("http:") && !this.f9161.startsWith("https:")) {
                        g3.a0.m8726(this.f9151, this.f9161, new n3.d0() { // from class: m3.x
                            @Override // n3.d0
                            /* renamed from: ʻ */
                            public final Object mo8739(Object obj) {
                                return this.f9313.m9930(m7980, context, intValue, (Bitmap) obj);
                            }
                        });
                        break;
                    } else {
                        n3.r.m10821(this.f9161).m10829(new r.c() { // from class: m3.w
                            @Override // n3.r.c
                            /* renamed from: ʻ */
                            public final void mo8741(Object obj, Exception exc) {
                                this.f9308.m9929(m7980, context, intValue, (byte[]) obj, exc);
                            }
                        });
                        break;
                    }
                } else {
                    int indexOf = this.f9161.indexOf("base64,");
                    if (indexOf > 0) {
                        try {
                            Bitmap m8718 = g3.a0.m8718(this.f9161.substring(indexOf + 7));
                            if (intValue == 2131820666) {
                                m9937(m8718, null, null);
                            } else {
                                m9927(m8718, com.lt.app.c.m7980(this.f9151.getViewEx()));
                            }
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 2131820668:
                j2.g gVar = new j2.g();
                gVar.f8271 = this.f9161;
                gVar.f8270 = -1;
                j2.m8915(gVar, this.f9151, null);
                break;
            case 2131820669:
                j2.i iVar = new j2.i();
                iVar.f8281 = this.f9160;
                iVar.f8280 = this.f9162;
                j2.m8915(iVar, this.f9151, null);
                break;
            case 2131820670:
                com.lt.app.c.m7986(context, this.f9160, true);
                break;
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m9927(Bitmap bitmap, PopupWindow popupWindow) {
        if (bitmap == null) {
            return;
        }
        final c cVar = new c(this.f9151.getContext(), popupWindow);
        g3.a0.m8728(bitmap, new n3.f() { // from class: m3.b0
            @Override // n3.f
            /* renamed from: ʻ */
            public final void mo8742(Object obj) {
                c0.m9931(cVar, (String) obj);
            }
        });
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m9928(l3.a aVar) {
        this.f9151.setLongClickable(true);
        if (!App.m7815(26, true) || !aVar.m9728(30)) {
            this.f9151.setOnTouchListener(new View.OnTouchListener() { // from class: m3.y
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f9327.m9932(view, motionEvent);
                }
            });
        }
        this.f9151.setOnLongClickListener(new View.OnLongClickListener() { // from class: m3.z
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f9328.m9933(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public /* synthetic */ void m9929(PopupWindow popupWindow, Context context, int i5, byte[] bArr, Exception exc) {
        popupWindow.dismiss();
        if (bArr == null || bArr.length == 0) {
            Toast.makeText(context, 2131820663, 1).show();
        } else if (i5 == 2131820666) {
            m9937(null, bArr, z1.m10899(context.getContentResolver(), Uri.parse(this.f9161)));
        } else {
            m9927(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), popupWindow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵ, reason: contains not printable characters */
    public /* synthetic */ Void m9930(PopupWindow popupWindow, Context context, int i5, Bitmap bitmap) {
        popupWindow.dismiss();
        if (bitmap == null) {
            Toast.makeText(context, 2131820663, 1).show();
        } else if (i5 == 2131820666) {
            m9937(bitmap, null, "jpg");
        } else {
            m9927(bitmap, popupWindow);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public static /* synthetic */ void m9931(Handler handler, String str) {
        handler.obtainMessage(0, str).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public /* synthetic */ boolean m9932(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9163 = (int) motionEvent.getX();
            this.f9164 = (int) motionEvent.getY();
        }
        view.performClick();
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public /* synthetic */ boolean m9933(View view) {
        int m9309;
        f.c lTHitTestResult = this.f9151.getLTHitTestResult();
        if (lTHitTestResult != null && ((m9309 = lTHitTestResult.m9309()) == 0 || m9309 == 1 || m9309 == 5 || m9309 == 6 || m9309 == 7 || m9309 == 8)) {
            Message message = new Message();
            message.setTarget(new b(this, null));
            this.f9151.requestFocusNodeHref(message);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public /* synthetic */ void m9934(Uri uri) {
        if (uri == null) {
            Toast.makeText(this.f9151.getContext(), "保存失败", 0).show();
        } else {
            Toast.makeText(this.f9151.getContext(), 2131820667, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m9935(String str, String str2, String str3) {
        if (!this.f9159 && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        this.f9160 = str;
        this.f9161 = str2;
        this.f9162 = str3;
        com.lt.app.b bVar = (com.lt.app.b) this.f9151.getContext();
        ArrayList arrayList = new ArrayList(5);
        this.f9152.clear();
        if (this.f9159) {
            arrayList.add(App.m7812(2131820660));
            this.f9152.add(2131820660);
        }
        if (!TextUtils.isEmpty(str)) {
            if (this.f9156) {
                arrayList.add(App.m7812(2131820670));
                this.f9152.add(2131820670);
                arrayList.add(App.m7812(2131820671));
                this.f9152.add(2131820671);
            }
            if (this.f9157) {
                arrayList.add(App.m7812(2131820669));
                this.f9152.add(2131820669);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (this.f9153) {
                arrayList.add(App.m7812(2131820666));
                this.f9152.add(2131820666);
            }
            if (this.f9154) {
                arrayList.add(App.m7812(2131820661));
                this.f9152.add(2131820661);
            }
            if (this.f9158) {
                arrayList.add(App.m7812(2131820668));
                this.f9152.add(2131820668);
            }
            if (this.f9155) {
                arrayList.add(App.m7812(2131820664));
                this.f9152.add(2131820664);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        z0.a.m13112(bVar, bVar.m4043()).m13128(2131820604).m13132(strArr).m13130(true).m13131(this).m13133();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static void m9936(j2.f fVar, l3.a aVar) {
        if (fVar == null || aVar == null || !App.m7815(14, true)) {
            return;
        }
        if (aVar.m9728(11) || aVar.m9728(12) || aVar.m9728(13) || aVar.m9729(7)) {
            new c0(fVar, aVar.f12856b, aVar.f12857c, aVar);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m9937(Bitmap bitmap, byte[] bArr, String str) {
        n3.f fVar = new n3.f() { // from class: m3.a0
            @Override // n3.f
            /* renamed from: ʻ */
            public final void mo8742(Object obj) {
                this.f9146.m9934((Uri) obj);
            }
        };
        if (bitmap != null) {
            z1.m10893(this.f9151.getContext(), bitmap, fVar);
        } else if (bArr != null) {
            z1.m10895(this.f9151.getContext(), bArr, str, fVar);
        }
    }

    @Override // z0.a.d
    /* renamed from: ʼ */
    public void mo8946(z0.a aVar, int i5) {
        new Handler(Looper.getMainLooper()).postDelayed(new a(i5), 500L);
    }

    @Override // z0.a.d
    /* renamed from: ʻ */
    public void mo8945(z0.a aVar, boolean z5) {
    }
}
