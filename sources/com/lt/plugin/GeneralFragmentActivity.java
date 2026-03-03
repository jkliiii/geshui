package com.lt.plugin;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import n3.e1;
import n3.l;

/* loaded from: E:\78999\cookie_5123796.dex */
public class GeneralFragmentActivity extends l {
    /* renamed from: ʻﾞ, reason: contains not printable characters */
    private void m8020() {
        String stringExtra = getIntent().getStringExtra("k_fragment_cls");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            Object newInstance = Class.forName(stringExtra).newInstance();
            if (newInstance instanceof e) {
                e eVar = (e) newInstance;
                eVar.setArguments(getIntent().getExtras());
                m4043().m4238().m4342(e1.f9729, eVar).mo3950();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // n3.l, n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m8020();
    }
}
