package com.lt.app;

import android.content.res.Configuration;
import android.os.Bundle;
import h3.o2;
import h3.p1;
import h3.x;
import j2.f;

/* compiled from: BaseActivity.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends n3.d {

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private p1 f6723;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private boolean f6724 = false;

    @Override // androidx.appcompat.app.c, androidx.fragment.app.f, androidx.activity.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((mo7924() instanceof f) && m7957().m9006()) {
            ((f) mo7924()).setForceDark(null);
        }
    }

    @Override // n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // n3.d
    /* renamed from: ʻי */
    public boolean mo7864(int i5, boolean z5) {
        return App.m7815(i5, z5);
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    protected void m7956() {
        if (this.f6724) {
            return;
        }
        o2.m8963(this);
        this.f6724 = true;
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    public p1 m7957() {
        p1 p1Var = this.f6723;
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = new p1(this);
        this.f6723 = p1Var2;
        return p1Var2;
    }

    /* renamed from: ʼʽ */
    public x mo7927() {
        return null;
    }
}
