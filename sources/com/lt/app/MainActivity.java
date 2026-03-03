package com.lt.app;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MainActivity extends WebActivity {

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public static MainActivity f6674;

    @Override // com.lt.app.WebActivity, com.lt.app.b, n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        f6674 = this;
        super.onCreate(bundle);
        if (App.m7821()) {
            c.m7958(this, null, getString(2131820858), null);
        }
    }

    @Override // com.lt.app.WebActivity, n3.d, androidx.appcompat.app.c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        f6674 = null;
        super.onDestroy();
    }

    @Override // com.lt.app.WebActivity, n3.d, androidx.fragment.app.f, androidx.activity.h, android.app.Activity
    protected void onNewIntent(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("_exit", false)) {
            super.onNewIntent(intent);
        } else {
            m7934(true);
        }
    }

    @Override // com.lt.app.WebActivity
    /* renamed from: ʽⁱ, reason: contains not printable characters */
    protected boolean mo7861() {
        return true;
    }
}
