package com.lt.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.q2;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.lt.app.App;
import com.lt.app.WebActivity;
import com.lt.app.views.LTTabView;
import g3.a0;
import h3.d0;
import h3.j2;
import h3.q1;
import h3.s2;
import h3.t1;
import h3.w;
import h3.x;
import h3.y;
import h3.z;
import j2.f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l3.p;
import m2.g;
import m3.e;
import m3.k1;
import m3.m;
import m3.u;
import m3.v;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a1;
import n3.a2;
import n3.q0;
import n3.t;
import n3.z1;
import org.json.JSONException;
import org.json.JSONObject;
import x2.l;

/* loaded from: E:\78999\cookie_5123796.dex */
public class WebActivity extends com.lt.app.b implements View.OnClickListener, e.d, w, y {

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private k1 f6682;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private c f6689;

    /* renamed from: יי, reason: contains not printable characters */
    private e f6690;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private View f6692;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private f f6693 = null;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private boolean f6694 = false;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private l3.d f6695 = null;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private t1 f6696 = null;

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private LTTabView f6691 = null;

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private LTTabView f6697 = null;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private q1 f6678 = null;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private BroadcastReceiver f6679 = null;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private i2.e f6680 = null;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private i2.e f6681 = null;

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private boolean f6683 = false;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    long f6684 = 0;

    /* renamed from: ʻˊ, reason: contains not printable characters */
    Toast f6685 = null;

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private f.b f6686 = new f.b() { // from class: g3.n0
        @Override // j2.f.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public final void mo8747(boolean z5, Object obj) {
            this.f8069.m7914(z5, obj);
        }
    };

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private f.b f6687 = new f.b() { // from class: g3.o0
        @Override // j2.f.b
        /* renamed from: ʻ */
        public final void mo8747(boolean z5, Object obj) {
            this.f8073.m7915(z5, obj);
        }
    };

    /* renamed from: ʻˏ, reason: contains not printable characters */
    q2 f6688 = null;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WebActivity.this.m7889(intent.getBooleanExtra("ym_app_enter_bg", true));
        }
    }

    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ boolean f6699;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Window f6700;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f6701;

        class a implements View.OnFocusChangeListener {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ int f6703;

            a(int i5) {
                this.f6703 = i5;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z5) {
                if (z5) {
                    b.this.f6701.setSystemUiVisibility(this.f6703);
                }
            }
        }

        /* renamed from: com.lt.app.WebActivity$b$b, reason: collision with other inner class name */
        class ViewOnSystemUiVisibilityChangeListenerC0093b implements View.OnSystemUiVisibilityChangeListener {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ int f6705;

            ViewOnSystemUiVisibilityChangeListenerC0093b(int i5) {
                this.f6705 = i5;
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                b.this.f6701.setSystemUiVisibility(this.f6705);
            }
        }

        b(boolean z5, Window window, View view) {
            this.f6699 = z5;
            this.f6700 = window;
            this.f6701 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f6699) {
                    WebActivity.this.m7956();
                    int i5 = 1798 | 4096;
                    this.f6700.addFlags(1026);
                    this.f6701.setSystemUiVisibility(i5);
                    this.f6701.setOnFocusChangeListener(new a(i5));
                    this.f6701.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC0093b(i5));
                } else {
                    this.f6700.clearFlags(201327616);
                    this.f6701.setOnSystemUiVisibilityChangeListener(null);
                    this.f6701.setSystemUiVisibility(0);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static class c implements x {

        /* renamed from: ʻ, reason: contains not printable characters */
        final ViewGroup f6707;

        /* renamed from: ʼ, reason: contains not printable characters */
        final ImageView f6708;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final ImageButton f6709;

        /* renamed from: ʾ, reason: contains not printable characters */
        final ImageButton f6710;

        /* renamed from: ʿ, reason: contains not printable characters */
        final ImageButton f6711;

        /* renamed from: ˆ, reason: contains not printable characters */
        final ImageButton f6712;

        /* renamed from: ˈ, reason: contains not printable characters */
        final ImageButton f6713;

        /* renamed from: ˉ, reason: contains not printable characters */
        final ImageButton f6714;

        /* renamed from: ˊ, reason: contains not printable characters */
        final ImageButton f6715;

        /* renamed from: ˋ, reason: contains not printable characters */
        final ImageButton f6716;

        /* renamed from: ˎ, reason: contains not printable characters */
        public final TextView f6717;

        c(RelativeLayout relativeLayout, boolean z5) {
            this.f6707 = relativeLayout;
            this.f6709 = (ImageButton) relativeLayout.findViewById(2131231090);
            this.f6708 = (ImageView) relativeLayout.findViewById(2131231088);
            this.f6710 = (ImageButton) relativeLayout.findViewById(2131231083);
            this.f6711 = (ImageButton) relativeLayout.findViewById(2131231085);
            this.f6712 = (ImageButton) relativeLayout.findViewById(2131231093);
            this.f6713 = (ImageButton) relativeLayout.findViewById(2131231089);
            this.f6716 = (ImageButton) relativeLayout.findViewById(2131231084);
            this.f6714 = (ImageButton) relativeLayout.findViewById(2131231087);
            this.f6715 = (ImageButton) relativeLayout.findViewById(2131231092);
            TextView textView = (TextView) View.inflate(relativeLayout.getContext(), z5 ? 2131427461 : 2131427460, null);
            this.f6717 = textView;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (!z5) {
                layoutParams.addRule(0, 2131231091);
                layoutParams.addRule(1, 2131231086);
            }
            textView.setLayoutParams(layoutParams);
            relativeLayout.addView(textView);
        }

        @Override // h3.x
        public void setVisible(boolean z5) {
            this.f6707.setVisibility(z5 ? 0 : 8);
        }

        @Override // h3.x
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo7950(int i5) {
            this.f6707.setBackgroundColor(i5);
        }

        @Override // h3.x
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo7951(int i5) {
            this.f6717.setTextColor(i5);
            this.f6710.setColorFilter(i5);
            this.f6709.setColorFilter(i5);
            this.f6711.setColorFilter(i5);
            this.f6714.setColorFilter(i5);
            this.f6715.setColorFilter(i5);
            this.f6713.setColorFilter(i5);
            this.f6712.setColorFilter(i5);
            this.f6716.setColorFilter(i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m7952(boolean z5) {
            ImageButton imageButton = this.f6714;
            if (imageButton == null || imageButton.getTag() == null) {
                return;
            }
            if (this.f6714.getVisibility() == 0) {
                if (z5) {
                    return;
                }
                this.f6714.setVisibility(8);
            } else if (z5) {
                this.f6714.setVisibility(0);
            }
        }
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    private void m7887() {
        l3.a m7827 = App.m7827();
        if (mo7861() && !this.f6694 && m7827 != null && m7827.m9728(20)) {
            new u(this).m10069(getString(2131820632), new u.b() { // from class: g3.l0
                @Override // m3.u.b
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8745(boolean z5, String str) {
                    this.f8065.m7900(z5, str);
                }
            });
            return;
        }
        if (mo7861() && m7827 != null && m7827.m9728(55)) {
            moveTaskToBack(true);
            this.f6694 = false;
            m7929();
            return;
        }
        f fVar = this.f6693;
        if (fVar != null) {
            fVar.stopLoading();
            this.f6693.loadData(BuildConfig.FLAVOR, "text/html", "UTF-8");
        }
        m7893();
        super.finish();
        if (mo7861()) {
            m7928();
            m7929();
            App.m7835().m7847();
        }
    }

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    private void m7888(l3.b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.url)) {
            return;
        }
        m7919(bVar.url, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʻ, reason: contains not printable characters */
    public void m7889(boolean z5) {
        d0.m8796(this, 0, null, z5 ? this.f6680 : this.f6681, true);
    }

    /* renamed from: ʽˑ, reason: contains not printable characters */
    private void m7890(final l3.a aVar) {
        boolean z5 = d.m7995();
        a1.m10619(this, d.m7996(), new n3.d0() { // from class: g3.g0
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return WebActivity.m7902((Integer) obj);
            }
        }, z5 ? new n3.f() { // from class: g3.h0
            @Override // n3.f
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo8742(Object obj) {
                this.f7889.m7903(aVar, (Boolean) obj);
            }
        } : null);
        d.m8011(this, aVar);
        if (z5) {
            return;
        }
        m7918(aVar.url);
    }

    /* renamed from: ʽי, reason: contains not printable characters */
    private void m7891() {
        if (this.f6679 != null) {
            return;
        }
        a aVar = new a();
        this.f6679 = aVar;
        z1.m10886(this, aVar, "ym_app_state_changed");
    }

    /* renamed from: ʽـ, reason: contains not printable characters */
    private void m7892(l3.b bVar, ImageButton imageButton, boolean z5) {
        if (bVar == null || imageButton == null) {
            return;
        }
        imageButton.setTag(BuildConfig.FLAVOR);
        imageButton.setOnClickListener(this);
        imageButton.setVisibility(z5 ? 0 : 8);
    }

    /* renamed from: ʽٴ, reason: contains not printable characters */
    private void m7893() {
        BroadcastReceiver broadcastReceiver = this.f6679;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
            this.f6679 = null;
            this.f6680 = null;
            this.f6681 = null;
        }
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    private synchronized void m7894(String str) {
        if (this.f6678 == null) {
            this.f6678 = q1.m9032(str);
        }
        this.f6696 = t1.m9049(str);
        l3.a m7827 = App.m7827();
        if (m7827 == null) {
            return;
        }
        if (m7827.m9728(14)) {
            getWindow().addFlags(128);
        }
        m7941(str);
        if (this.f6690 == null) {
            a2.a aVar = new a2.a(this);
            aVar.f9701 = (ViewGroup) findViewById(R.id.content);
            aVar.f9702 = (ProgressBar) findViewById(2131231151);
            e eVar = new e(aVar);
            this.f6690 = eVar;
            eVar.m9960(this);
            this.f6690.m9953(m7827, mo7861(), this.f6696);
            if (mo7864(54, true) && m7827.m9729(24)) {
                getWindow().addFlags(8192);
            }
            m7920(m7827.m53bg);
            ViewGroup viewGroup = (ViewGroup) findViewById(2131231164);
            viewGroup.setVisibility(0);
            if (mo7861() && mo7864(29, true) && m7827.m9729(0) && !TextUtils.isEmpty(m7827.tb)) {
                this.f6691 = (LTTabView) View.inflate(this, 2131427489, null);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (getResources().getDisplayMetrics().density * 36.0f));
                layoutParams.addRule(12);
                viewGroup.addView(this.f6691, 0, layoutParams);
                this.f6691.setLTTabViewListener(new LTTabView.b() { // from class: g3.p0
                    @Override // com.lt.app.views.LTTabView.b
                    /* renamed from: ʻ */
                    public final void mo8019(String str2) {
                        this.f8075.m7906(str2);
                    }
                });
                this.f6691.setContent(m7827.tb);
            }
            if (mo7861() && !TextUtils.isEmpty(m7827.tab)) {
                boolean m9728 = m7827.m9728(63);
                int i5 = m7827.tabh;
                if (i5 <= 0) {
                    i5 = 49;
                }
                this.f6697 = (LTTabView) View.inflate(this, 2131427488, null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (getResources().getDisplayMetrics().density * i5));
                int i6 = 3;
                if (m9728) {
                    layoutParams2.addRule(3, 2131231095);
                } else if (this.f6691 != null) {
                    layoutParams2.addRule(2, 2131231267);
                } else {
                    layoutParams2.addRule(12);
                }
                viewGroup.addView(this.f6697, 0, layoutParams2);
                this.f6697.setLTTabViewListener(new LTTabView.b() { // from class: g3.q0
                    @Override // com.lt.app.views.LTTabView.b
                    /* renamed from: ʻ */
                    public final void mo8019(String str2) {
                        this.f8078.m7904(str2);
                    }
                });
                this.f6697.setContent(m7827.tab);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) aVar.f9701.getLayoutParams();
                if (!m9728) {
                    i6 = 2;
                }
                layoutParams3.addRule(i6, 2131231230);
                if (m9728 && this.f6691 != null) {
                    layoutParams3.addRule(2, 2131231267);
                }
                aVar.f9701.setLayoutParams(layoutParams3);
            } else if (this.f6691 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) aVar.f9701.getLayoutParams();
                layoutParams4.addRule(2, 2131231267);
                aVar.f9701.setLayoutParams(layoutParams4);
            }
            f m9957 = this.f6690.m9957();
            this.f6693 = m9957;
            Message message = com.lt.app.c.f6725;
            if (message != null) {
                m9957.setTransportWebView(message);
                com.lt.app.c.f6725 = null;
            }
            m.m10039(this.f6693, -1);
            this.f6689 = new c((RelativeLayout) findViewById(2131231095), mo7861());
            if (mo7861()) {
                v.m10078(this.f6692, this.f6693);
                if (v.m10076() != null) {
                    this.f6689.f6716.setVisibility(0);
                    this.f6689.f6716.setOnClickListener(this);
                }
                m7940(getIntent(), true);
            }
        }
        m7921();
        m7957().m8997(str);
        m7919(str, false);
    }

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    private void m7895(final String str) {
        d.m8000(this, App.m7827(), new t() { // from class: g3.i0
            @Override // n3.t
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo8743() {
                this.f7895.m7908(str);
            }
        });
    }

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    private void m7896() {
        l3.a m7803 = App.m7803();
        if (m7803 != null) {
            d.m8010(this, m7803);
        }
        App.m7828(new App.e() { // from class: g3.j0
            @Override // com.lt.app.App.e
            /* renamed from: ʻ */
            public final void mo7860(l3.a aVar) {
                this.f7899.m7911(aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽᵢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void m7908(String str) {
        m7894(str);
        s2.m9041(this);
    }

    /* renamed from: ʽﹳ, reason: contains not printable characters */
    private void m7898() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f6693.getUrl());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        this.f6693.mo9241("onBackPressed", jSONObject, this.f6687);
    }

    /* renamed from: ʽﹶ, reason: contains not printable characters */
    private void m7899() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f6693.getUrl());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        this.f6693.mo9241("onClose", jSONObject, this.f6686);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽﾞ, reason: contains not printable characters */
    public /* synthetic */ void m7900(boolean z5, String str) {
        if (z5) {
            this.f6694 = true;
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʻ, reason: contains not printable characters */
    public /* synthetic */ void m7901(String str) {
        m7919(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʼ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m7902(Integer num) {
        return Boolean.valueOf(App.m7815(num.intValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʽ, reason: contains not printable characters */
    public /* synthetic */ void m7903(l3.a aVar, Boolean bool) {
        m7918(aVar.url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʿ, reason: contains not printable characters */
    public /* synthetic */ void m7904(final String str) {
        runOnUiThread(new Runnable() { // from class: g3.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7878.m7907(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˆ, reason: contains not printable characters */
    public /* synthetic */ void m7905(String str) {
        m7919(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˈ, reason: contains not printable characters */
    public /* synthetic */ void m7906(final String str) {
        runOnUiThread(new Runnable() { // from class: g3.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8080.m7905(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˉ, reason: contains not printable characters */
    public /* synthetic */ void m7907(String str) {
        m7919(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˋ, reason: contains not printable characters */
    public /* synthetic */ void m7909(DialogInterface dialogInterface) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˎ, reason: contains not printable characters */
    public /* synthetic */ void m7910(DialogInterface dialogInterface) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˏ, reason: contains not printable characters */
    public /* synthetic */ void m7911(l3.a aVar) {
        if (aVar == null) {
            com.lt.app.c.m7958(this, null, getString(2131820776), new DialogInterface.OnDismissListener() { // from class: g3.e0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f7883.m7909(dialogInterface);
                }
            });
        } else if (aVar.isOk) {
            m7890(aVar);
        } else {
            com.lt.app.c.m7958(this, null, aVar.msg, new DialogInterface.OnDismissListener() { // from class: g3.f0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f7885.m7910(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾˑ, reason: contains not printable characters */
    public /* synthetic */ void m7912(ImageView imageView, Exception exc, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        float f5 = getResources().getDisplayMetrics().density * 44.0f;
        float height = (f5 / bitmap.getHeight()) * bitmap.getWidth();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (int) (height + imageView.getPaddingLeft() + imageView.getPaddingRight());
        layoutParams.height = (int) (f5 + imageView.getPaddingTop() + imageView.getPaddingBottom());
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾי, reason: contains not printable characters */
    public /* synthetic */ void m7913(String str, Map map) {
        if (str.equals(this.f6693.getUrl())) {
            this.f6693.reload();
        } else {
            this.f6693.loadUrl(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾـ, reason: contains not printable characters */
    public /* synthetic */ void m7914(boolean z5, Object obj) {
        if (z5 && (obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
            return;
        }
        m7887();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾٴ, reason: contains not printable characters */
    public /* synthetic */ void m7915(boolean z5, Object obj) {
        if (z5 && (obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
            return;
        }
        this.f6693.goBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾᐧ, reason: contains not printable characters */
    public /* synthetic */ boolean m7916(MenuItem menuItem) {
        m7888(this.f6695.actions.get(menuItem.getOrder()));
        return true;
    }

    /* renamed from: ʾᴵ, reason: contains not printable characters */
    private void m7917(String str, final ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        l.m12714(this).mo187(str).mo181().mo9865(new g() { // from class: g3.d0
            @Override // m2.g
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo8740(Exception exc, Object obj) {
                this.f7880.m7912(imageView, exc, (Bitmap) obj);
            }
        });
    }

    /* renamed from: ʾᵎ, reason: contains not printable characters */
    private void m7918(String str) {
        if (App.m7835().m7839()) {
            m7895(str);
        } else {
            m7908(str);
        }
    }

    /* renamed from: ʾᵔ, reason: contains not printable characters */
    private void m7919(String str, boolean z5) {
        if (this.f6693 == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (URLUtil.isJavaScriptUrl(str)) {
            this.f6693.mo7788(str);
            return;
        }
        if (z5) {
            com.lt.app.c.m7978(this, str, this.f6693.getUrl(), false);
            return;
        }
        final Map<String, String> m7857 = App.m7835().m7857(getIntent().getStringExtra("com.lt.app.k_referer"));
        final String m10888 = z1.m10888(this, str);
        if (mo7861() && App.m7827() != null && App.m7827().m9728(6) && str.equals(App.m7827().url)) {
            z.m9099(new z.c() { // from class: g3.k0
                @Override // h3.z.c
                /* renamed from: ʻ, reason: contains not printable characters */
                public final void mo8744() {
                    this.f7901.m7913(m10888, m7857);
                }
            }, this.f6693);
        } else if (m10888.equals(this.f6693.getUrl())) {
            this.f6693.reload();
        } else {
            this.f6693.loadUrl(m10888, m7857);
        }
    }

    /* renamed from: ʾᵢ, reason: contains not printable characters */
    private void m7920(String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            getWindow().addFlags(134217728);
        } else {
            getWindow().setNavigationBarColor(a0.m8711(str, -16777216));
        }
    }

    /* renamed from: ʾⁱ, reason: contains not printable characters */
    private void m7921() {
        l3.a m7827 = App.m7827();
        if (m7827 == null) {
            return;
        }
        f1.m2840(this.f6689.f6707, getResources().getDisplayMetrics().density * 1.0f);
        if (mo7861()) {
            setTitle((CharSequence) null);
            m7892(this.f6695.left, this.f6689.f6714, false);
            if (m7827.m9728(1)) {
                this.f6689.f6709.setOnClickListener(this);
                this.f6689.f6709.setVisibility(0);
            }
            if (!TextUtils.isEmpty(m7827.navLogo)) {
                m7917(m7827.navLogo, this.f6689.f6708);
            }
            if (m7827.m9728(7)) {
                this.f6689.f6711.setOnClickListener(this);
                this.f6689.f6711.setVisibility(0);
            }
        } else {
            this.f6689.f6710.setVisibility(0);
            this.f6689.f6710.setOnClickListener(this);
        }
        this.f6689.f6712.setOnClickListener(this);
        t1 t1Var = this.f6696;
        if (t1Var.f8382 ? t1Var.f8383 : this.f6695.share) {
            this.f6689.f6712.setVisibility(0);
        }
        this.f6689.f6713.setOnClickListener(this);
        List<l3.b> list = this.f6695.actions;
        if (list != null && !list.isEmpty()) {
            this.f6689.f6713.setVisibility(0);
        }
        m7892(this.f6695.right, this.f6689.f6715, true);
        m7942(this.f6678);
    }

    /* renamed from: ʾﹳ, reason: contains not printable characters */
    private void m7922() {
        f fVar;
        k1 k1Var = this.f6682;
        if (k1Var == null || (fVar = this.f6693) == null) {
            return;
        }
        k1Var.m10032(fVar);
    }

    /* renamed from: ʾﾞ, reason: contains not printable characters */
    private void m7923() {
        List<l3.b> list = this.f6695.actions;
        if (list == null || list.size() == 0) {
            Toast.makeText(this, "No Action Defined", 1).show();
            return;
        }
        if (this.f6688 == null) {
            this.f6688 = new q2(this, this.f6689.f6713);
            for (int i5 = 0; i5 < this.f6695.actions.size(); i5++) {
                this.f6688.m1485().add(0, i5, i5, this.f6695.actions.get(i5).title);
            }
            this.f6688.m1486(new q2.c() { // from class: g3.b0
                @Override // androidx.appcompat.widget.q2.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return this.f7876.m7916(menuItem);
                }
            });
        }
        this.f6688.m1487();
    }

    @Override // android.app.Activity
    public void finish() {
        if (mo7861() || this.f6693 == null) {
            m7887();
        } else {
            m7899();
        }
    }

    @Override // n3.d, androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    protected void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void onBackPressed() {
        if (mo7861() && v.m10076() != null && v.m10076().m10079()) {
            return;
        }
        e eVar = this.f6690;
        if (eVar == null || !eVar.m9958()) {
            l3.a m7827 = App.m7827();
            if (m7827 == null || !m7827.m9728(57)) {
                if (mo7861() && m7827 != null && this.f6693 != null) {
                    if (m7827.m9728(21) && !this.f6693.canGoBack()) {
                        if (System.currentTimeMillis() - this.f6684 <= 800) {
                            finish();
                            return;
                        }
                        this.f6684 = System.currentTimeMillis();
                        Toast toast = this.f6685;
                        if (toast != null) {
                            toast.cancel();
                        }
                        Toast makeText = Toast.makeText(this, 2131820631, 0);
                        this.f6685 = makeText;
                        makeText.show();
                        return;
                    }
                    if (m7827.m9728(22) && !this.f6693.canGoBack()) {
                        finish();
                        return;
                    }
                    if (m7827.m9728(23)) {
                        if (System.currentTimeMillis() - this.f6684 <= 800) {
                            finish();
                            return;
                        }
                        this.f6684 = System.currentTimeMillis();
                        if (this.f6693.canGoBack()) {
                            m7898();
                            return;
                        }
                        Toast toast2 = this.f6685;
                        if (toast2 != null) {
                            toast2.cancel();
                        }
                        Toast makeText2 = Toast.makeText(this, 2131820631, 0);
                        this.f6685 = makeText2;
                        makeText2.show();
                        return;
                    }
                    if (m7827.m9728(24)) {
                        finish();
                        return;
                    }
                }
                f fVar = this.f6693;
                if (fVar == null || !fVar.canGoBack()) {
                    super.onBackPressed();
                } else {
                    m7898();
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case 2131231083:
                finish();
                break;
            case 2131231084:
                if (v.m10076() != null) {
                    v.m10076().m10082();
                    break;
                }
                break;
            case 2131231085:
                l3.a m7827 = App.m7827();
                if (m7827 != null && !TextUtils.isEmpty(m7827.url)) {
                    m7919(m7827.url, false);
                    break;
                }
                break;
            case 2131231087:
                m7888(this.f6695.left);
                break;
            case 2131231089:
                m7923();
                break;
            case 2131231090:
                a0.m8719(this, this.f6693);
                break;
            case 2131231092:
                m7888(this.f6695.right);
                break;
            case 2131231093:
                j2.m8909(-1, this.f6693, null, null, true);
                break;
        }
    }

    @Override // com.lt.app.b, androidx.appcompat.app.c, androidx.fragment.app.f, androidx.activity.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6682.m10027(configuration);
    }

    @Override // com.lt.app.b, n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo7861() && !isTaskRoot()) {
            Uri data = getIntent().getData();
            if (data != null) {
                com.lt.app.c.m7985(this, data.toString());
            }
            super.finish();
            return;
        }
        setContentView(2131427358);
        this.f6692 = findViewById(2131230911);
        String stringExtra = getIntent().getStringExtra("com.lt.app.k_options");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f6678 = q1.m9031(stringExtra);
        }
        this.f6682 = new k1();
        if (mo7861()) {
            m7896();
        } else {
            Uri data2 = getIntent().getData();
            m7894(data2 != null ? data2.toString() : BuildConfig.FLAVOR);
        }
    }

    @Override // n3.d, androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        m7922();
        e eVar = this.f6690;
        if (eVar != null) {
            eVar.m9955();
        }
        super.onDestroy();
    }

    @Override // n3.d, androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m7940(intent, false);
    }

    @Override // n3.d, androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        this.f6682.m10028();
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // n3.d, androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f6682.m10029();
        if (TextUtils.isEmpty(d0.f8173)) {
            return;
        }
        m7919(d0.f8173, false);
        d0.f8173 = null;
    }

    @Override // n3.d, androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        this.f6682.m10030();
        super.onStart();
    }

    @Override // n3.d, androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        this.f6682.m10031();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        l3.a m7827;
        if (mo7861() && (m7827 = App.m7827()) != null) {
            if (!TextUtils.isEmpty(m7827.navLogo)) {
                return;
            }
            if (!TextUtils.isEmpty(m7827.title)) {
                this.f6689.f6717.setText(m7827.title);
                return;
            }
        }
        if (this.f6695.showTitle) {
            String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
            if (charSequence2.startsWith("http:") || charSequence2.startsWith("https:") || charSequence2.startsWith("file:")) {
                return;
            }
            if (this.f6693.getUrl() == null || !this.f6693.getUrl().endsWith(charSequence2)) {
                this.f6689.f6717.setText(charSequence2);
            }
        }
    }

    @Override // n3.d
    /* renamed from: ʻˎ, reason: contains not printable characters */
    public WebView mo7924() {
        Object obj = this.f6693;
        if (obj instanceof WebView) {
            return (WebView) obj;
        }
        return null;
    }

    @Override // n3.d
    /* renamed from: ʻˏ, reason: contains not printable characters */
    public View mo7925() {
        return this.f6692;
    }

    @Override // n3.d
    /* renamed from: ʻˑ, reason: contains not printable characters */
    public ViewGroup mo7926() {
        return (ViewGroup) findViewById(R.id.content);
    }

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    void m7928() {
        f fVar;
        if (App.m7827() == null || !App.m7827().m9729(27) || (fVar = this.f6693) == null) {
            return;
        }
        fVar.mo7792();
    }

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    void m7929() {
        q0 m10702;
        if (App.m7827() == null || !App.m7827().m9729(3) || (m10702 = a1.m10702()) == null) {
            return;
        }
        m10702.m10810(this);
    }

    @Override // h3.y
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo7930(i2.e eVar) {
        m7891();
        this.f6681 = eVar;
    }

    /* renamed from: ʽʼ, reason: contains not printable characters */
    void m7931(boolean z5, View view) {
        if (!App.m7815(1, true)) {
            if (this.f6678.showTitle == 1) {
                Toast.makeText(this, 2131820689, 1).show();
            }
            z5 = false;
        }
        view.setVisibility(z5 ? 0 : 8);
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public void m7932(String str) {
        LTTabView lTTabView = this.f6697;
        if (lTTabView != null) {
            lTTabView.m8018(str);
        }
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    public void m7933(String str) {
        LTTabView lTTabView = this.f6691;
        if (lTTabView != null) {
            lTTabView.m8018(str);
        }
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public void m7934(boolean z5) {
        if (!z5) {
            finish();
            return;
        }
        m7893();
        super.finish();
        if (mo7861()) {
            m7928();
            m7929();
            App.m7835().m7847();
        }
    }

    /* renamed from: ʽˈ, reason: contains not printable characters */
    public void m7935(boolean z5) {
        Window window = getWindow();
        View decorView = window.getDecorView();
        decorView.setOnFocusChangeListener(null);
        decorView.setOnSystemUiVisibilityChangeListener(null);
        window.clearFlags(2048);
        runOnUiThread(new b(z5, window, decorView));
    }

    /* renamed from: ʽˉ, reason: contains not printable characters */
    public boolean m7936() {
        boolean z5 = true;
        boolean z6 = (getWindow().getAttributes().flags & 1024) == 1024;
        if (z6) {
            LTTabView lTTabView = this.f6691;
            z6 = lTTabView == null || lTTabView.getVisibility() == 8;
        }
        if (z6) {
            LTTabView lTTabView2 = this.f6697;
            z6 = lTTabView2 == null || lTTabView2.getVisibility() == 8;
        }
        if (!z6) {
            return z6;
        }
        c cVar = this.f6689;
        if (cVar != null && cVar.f6707.getVisibility() != 8) {
            z5 = false;
        }
        return z5;
    }

    /* renamed from: ʽˊ, reason: contains not printable characters */
    public boolean m7937() {
        return getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: ʽˋ, reason: contains not printable characters */
    public boolean m7938() {
        return mo7861();
    }

    @Override // com.lt.app.b
    /* renamed from: ʽˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c mo7927() {
        return this.f6689;
    }

    /* renamed from: ʽˏ, reason: contains not printable characters */
    protected void m7940(Intent intent, boolean z5) {
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("com.lt.app.k_loadhomepage", false) && mo7861()) {
            m7919(App.m7827().url, false);
            return;
        }
        final String stringExtra = (!this.f9725 || intent.getData() == null) ? intent.getStringExtra("url") : intent.getData().toString();
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if (URLUtil.isHttpsUrl(stringExtra) || URLUtil.isHttpUrl(stringExtra) || URLUtil.isFileUrl(stringExtra)) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: g3.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8066.m7901(stringExtra);
                }
            }, 800L);
        }
    }

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    void m7941(String str) {
        l3.a m7827 = App.m7827();
        if (m7827 == null) {
            return;
        }
        if (m7827.page != null) {
            List<l3.c> list = m7827.pages;
            if (list != null && !list.isEmpty()) {
                Iterator<l3.c> it = m7827.pages.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    l3.c next = it.next();
                    if (next.m9732(str)) {
                        l3.d clone = m7827.page.clone();
                        this.f6695 = clone;
                        clone.m9735(next);
                        break;
                    }
                }
            }
            if (this.f6695 == null) {
                this.f6695 = m7827.page;
            }
        }
        if (this.f6695 == null) {
            this.f6695 = new l3.d();
        }
        this.f6695.m9736();
    }

    /* renamed from: ʽⁱ */
    protected boolean mo7861() {
        return false;
    }

    /* renamed from: ʾﹶ, reason: contains not printable characters */
    public void m7942(q1 q1Var) {
        int i5;
        if (q1Var == null) {
            return;
        }
        this.f6678 = q1Var;
        int i6 = q1Var.showTitle;
        if (i6 >= 1) {
            mo7949(true);
        } else if (i6 == 0) {
            mo7949(false);
        }
        if (!TextUtils.isEmpty(q1Var.titleColor)) {
            this.f6689.mo7950(a0.m8711(q1Var.titleColor, -16777216));
        }
        if (!TextUtils.isEmpty(q1Var.titleTextColor)) {
            this.f6689.mo7951(a0.m8711(q1Var.titleTextColor, -1));
        }
        if (TextUtils.isEmpty(q1Var.titleText)) {
            f fVar = this.f6693;
            if (fVar != null) {
                setTitle(fVar.getTitle());
            }
        } else {
            setTitle(q1Var.titleText);
        }
        int i7 = q1Var.fullScreen;
        if (i7 == 1) {
            m7935(true);
        } else if (i7 == 0) {
            m7935(false);
        }
        if (!TextUtils.isEmpty(q1Var.statusBarColor)) {
            com.lt.app.c.m7979(this.f6692, a0.m8711(q1Var.statusBarColor, -16777216));
        }
        int i8 = q1Var.statusBarBlackText;
        if (i8 == 1) {
            com.lt.app.c.m7977(this, true);
        } else if (i8 == 0) {
            com.lt.app.c.m7977(this, false);
        }
        int i9 = q1Var.screenOrientation;
        if (i9 != 1) {
            i5 = 2;
            if (i9 == 2) {
                i5 = 1;
            }
        } else {
            i5 = 0;
        }
        if (getRequestedOrientation() != i5) {
            setRequestedOrientation(i5);
            View view = this.f6692;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = -1;
                this.f6692.setLayoutParams(layoutParams);
            }
        }
        int i10 = q1Var.refresh;
        if (i10 == 1) {
            mo7946(true);
        } else if (i10 == 0) {
            mo7946(false);
        }
        if (TextUtils.isEmpty(q1Var.url)) {
            return;
        }
        m7919(q1Var.url, false);
        q1Var.url = null;
    }

    @Override // m3.e.d
    /* renamed from: ʿ */
    public void mo7865(f fVar, String str) {
        c cVar;
        if (mo7861() && (cVar = this.f6689) != null && fVar != null) {
            cVar.m7952(fVar.canGoBack());
        }
        m7922();
    }

    /* renamed from: ʿʻ, reason: contains not printable characters */
    public void m7943() {
        int i5 = !m7936() ? 1 : 0;
        if (this.f6678 == null) {
            this.f6678 = new q1();
        }
        this.f6678.fullScreen = i5;
        if (App.m7815(1, true)) {
            if (i5 != 0) {
                c cVar = this.f6689;
                this.f6683 = cVar != null && cVar.f6707.getVisibility() == 0;
                this.f6678.showTitle = 0;
            } else if (this.f6683) {
                this.f6678.showTitle = 1;
            }
        }
        LTTabView lTTabView = this.f6691;
        if (lTTabView != null) {
            lTTabView.setVisibility(i5 != 0 ? 8 : 0);
        }
        LTTabView lTTabView2 = this.f6697;
        if (lTTabView2 != null) {
            lTTabView2.setVisibility(i5 != 0 ? 8 : 0);
        }
        m7942(this.f6678);
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    public void m7944() {
        if (this.f6678 == null) {
            this.f6678 = new q1();
        }
        this.f6678.screenOrientation = m7937() ? 1 : 2;
        m7942(this.f6678);
    }

    @Override // h3.y
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo7945(boolean z5) {
        m7931(z5, this.f6689.f6712);
    }

    @Override // h3.y
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo7946(boolean z5) {
        if (!App.m7815(3, true)) {
            Toast.makeText(this, 2131820688, 1).show();
            z5 = false;
        }
        e eVar = this.f6690;
        if (eVar != null) {
            eVar.m9961(z5);
        }
    }

    @Override // m3.e.d
    /* renamed from: ˋ */
    public void mo7867(f fVar, String str) {
        q1 q1Var = this.f6678;
        if (q1Var == null || TextUtils.isEmpty(q1Var.titleText)) {
            setTitle(str);
        }
    }

    @Override // h3.y
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo7947(boolean z5) {
        m7931(z5, this.f6689.f6713);
    }

    @Override // h3.y
    /* renamed from: ˏ, reason: contains not printable characters */
    public void mo7948(i2.e eVar) {
        m7891();
        this.f6680 = eVar;
    }

    @Override // h3.y
    /* renamed from: ˑ, reason: contains not printable characters */
    public void mo7949(boolean z5) {
        m7931(z5, this.f6689.f6707);
    }

    @Override // h3.w
    /* renamed from: ٴ */
    public void mo7868(p pVar) {
        e eVar = this.f6690;
        if (eVar != null) {
            eVar.m9959(pVar);
        }
    }

    @Override // m3.e.d
    /* renamed from: ʻ */
    public void mo7863(f fVar, String str) {
    }
}
