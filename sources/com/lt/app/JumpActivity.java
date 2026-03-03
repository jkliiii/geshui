package com.lt.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: E:\78999\cookie_5123796.dex */
public class JumpActivity extends b {
    @Override // com.lt.app.b, n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        c.m7983(this, !TextUtils.isEmpty(stringExtra) ? Uri.parse(stringExtra) : intent.getData(), intent.getExtras());
        finish();
    }
}
