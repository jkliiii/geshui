package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.s;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;

/* compiled from: ComponentActivity.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n extends Activity implements androidx.lifecycle.p, s.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private m.g<Class<Object>, Object> f2559 = new m.g<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private androidx.lifecycle.q f2560 = new androidx.lifecycle.q(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.s.m3310(decorView, keyEvent)) {
            return androidx.core.view.s.m3311(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.s.m3310(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public androidx.lifecycle.l getLifecycle() {
        return this.f2560;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c0.m4405(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f2560.m4486(l.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.s.a
    /* renamed from: ʾ */
    public boolean mo738(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
