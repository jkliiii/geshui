package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o3;
import androidx.core.app.u;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import n0.d;

/* compiled from: AppCompatActivity.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends androidx.fragment.app.f implements d, u.a {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private g f412;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private Resources f413;

    /* compiled from: AppCompatActivity.java */
    class a implements d.c {
        a() {
        }

        @Override // n0.d.c
        /* renamed from: ʻ */
        public Bundle mo369() {
            Bundle bundle = new Bundle();
            c.this.m516().mo595(bundle);
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    class b implements b.b {
        b() {
        }

        @Override // b.b
        /* renamed from: ʻ */
        public void mo370(Context context) {
            g m516 = c.this.m516();
            m516.mo616();
            m516.mo619(c.this.getSavedStateRegistry().m10403("androidx:appcompat"));
        }
    }

    public c() {
        m509();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private boolean m508(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    /* renamed from: יי, reason: contains not printable characters */
    private void m509() {
        getSavedStateRegistry().m10408("androidx:appcompat", new a());
        m384(new b());
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private void m510() {
        t0.m4515(getWindow().getDecorView(), this);
        u0.m4516(getWindow().getDecorView(), this);
        n0.g.m10416(getWindow().getDecorView(), this);
        androidx.activity.v.m444(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m510();
        m516().mo596(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(m516().mo603(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a m519 = m519();
        if (getWindow().hasFeature(0)) {
            if (m519 == null || !m519.mo475()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.n, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a m519 = m519();
        if (keyCode == 82 && m519 != null && m519.mo484(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i5) {
        return (T) m516().mo606(i5);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m516().mo612();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f413 == null && o3.m1461()) {
            this.f413 = new o3(this, super.getResources());
        }
        Resources resources = this.f413;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m516().mo617();
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m516().mo618(configuration);
        if (this.f413 != null) {
            this.f413.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m523();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        m516().mo611();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (m508(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a m519 = m519();
        if (menuItem.getItemId() != 16908332 || m519 == null || (m519.mo478() & 4) == 0) {
            return false;
        }
        return m511();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i5, Menu menu) {
        return super.onMenuOpened(i5, menu);
    }

    @Override // androidx.fragment.app.f, androidx.activity.h, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m516().mo613(bundle);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        m516().mo593();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        m516().mo594();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        m516().mo597();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i5) {
        super.onTitleChanged(charSequence, i5);
        m516().mo615(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a m519 = m519();
        if (getWindow().hasFeature(0)) {
            if (m519 == null || !m519.mo485()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.h, android.app.Activity
    public void setContentView(int i5) {
        m510();
        m516().mo602(i5);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        super.setTheme(i5);
        m516().mo608(i5);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public boolean m511() {
        Intent mo517 = mo517();
        if (mo517 == null) {
            return false;
        }
        if (!m514(mo517)) {
            m513(mo517);
            return true;
        }
        androidx.core.app.u m1984 = androidx.core.app.u.m1984(this);
        m520(m1984);
        m518(m1984);
        m1984.m1988();
        try {
            androidx.core.app.b.m1929(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public void m512(Toolbar toolbar) {
        m516().mo605(toolbar);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public void m513(Intent intent) {
        androidx.core.app.p.m1976(this, intent);
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public boolean m514(Intent intent) {
        return androidx.core.app.p.m1977(this, intent);
    }

    @Override // androidx.fragment.app.f
    /* renamed from: ˎˎ, reason: contains not printable characters */
    public void mo515() {
        m516().mo617();
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public g m516() {
        if (this.f412 == null) {
            this.f412 = g.m583(this, this);
        }
        return this.f412;
    }

    @Override // androidx.core.app.u.a
    /* renamed from: ـ, reason: contains not printable characters */
    public Intent mo517() {
        return androidx.core.app.p.m1972(this);
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public androidx.appcompat.app.a m519() {
        return m516().mo614();
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public void m520(androidx.core.app.u uVar) {
        uVar.m1986(this);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void setContentView(View view) {
        m510();
        m516().mo600(view);
    }

    @Override // androidx.activity.h, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m510();
        m516().mo604(view, layoutParams);
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public void m518(androidx.core.app.u uVar) {
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    protected void m521(androidx.core.os.i iVar) {
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    protected void m522(int i5) {
    }

    @Deprecated
    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public void m523() {
    }
}
