package com.lt.app;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.material.R;
import h3.w;
import j2.f;
import l3.l;
import l3.o;
import l3.p;
import m3.e;
import m3.i1;
import m3.j1;
import n3.z1;

/* loaded from: E:\78999\cookie_5123796.dex */
public class PresentActivity extends n3.d implements i1, w, e.d {

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private e f6675;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private j1 f6676;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private l f6677;

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    private void m7862() {
        o oVar = this.f6677.statusBar;
        if (oVar.hidden) {
            setTheme(2131886426);
        } else if (oVar.translucent) {
            setTheme(2131886427);
        } else {
            setTheme(2131886425);
        }
        l lVar = this.f6677;
        if (lVar.statusBar.translucent || lVar.navigationBar.hidden) {
            setContentView(2131427357);
        } else {
            setContentView(2131427356);
        }
        j1 j1Var = new j1(this);
        this.f6676 = j1Var;
        j1Var.m10023(this);
        this.f6676.m10022(this.f6677);
        e eVar = new e(this, (ViewGroup) findViewById(R.id.content));
        this.f6675 = eVar;
        eVar.m9960(this);
        this.f6675.m9953(App.m7827(), false, null);
        this.f6675.m9954(this.f6677);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(2130772016, 2130772023);
    }

    @Override // n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l lVar = (l) z1.m10872(getIntent().getStringExtra("present_model"), l.class);
        this.f6677 = lVar;
        if (lVar == null) {
            this.f6677 = new l();
        }
        this.f6677.m9740();
        m7862();
    }

    @Override // n3.d
    /* renamed from: ʻי, reason: contains not printable characters */
    public boolean mo7864(int i5, boolean z5) {
        return App.m7815(i5, z5);
    }

    @Override // m3.i1
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo7866(int i5) {
        if (i5 == 1) {
            this.f6675.m9957().loadUrl(this.f6677.url, null);
        } else {
            if (i5 != 3) {
                return;
            }
            finish();
        }
    }

    @Override // m3.e.d
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo7867(f fVar, String str) {
        if (TextUtils.isEmpty(this.f6677.navigationBar.title)) {
            this.f6676.m10024(str);
        }
    }

    @Override // h3.w
    /* renamed from: ٴ, reason: contains not printable characters */
    public void mo7868(p pVar) {
        e eVar = this.f6675;
        if (eVar != null) {
            eVar.m9959(pVar);
        }
    }

    @Override // m3.e.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo7863(f fVar, String str) {
    }

    @Override // m3.e.d
    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo7865(f fVar, String str) {
    }
}
