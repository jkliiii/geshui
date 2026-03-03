package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f2912;

    /* renamed from: ʼ, reason: contains not printable characters */
    private a f2913;

    /* renamed from: ʽ, reason: contains not printable characters */
    private InterfaceC0034b f2914;

    /* compiled from: ActionProvider.java */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0034b {
        void onActionProviderVisibilityChanged(boolean z5);
    }

    public b(Context context) {
        this.f2912 = context;
    }

    /* renamed from: ʻ */
    public boolean mo973() {
        return false;
    }

    /* renamed from: ʼ */
    public boolean mo977() {
        return true;
    }

    /* renamed from: ʽ */
    public abstract View mo974();

    /* renamed from: ʾ */
    public View mo978(MenuItem menuItem) {
        return mo974();
    }

    /* renamed from: ʿ */
    public boolean mo975() {
        return false;
    }

    /* renamed from: ˈ */
    public boolean mo979() {
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m2750() {
        this.f2914 = null;
        this.f2913 = null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m2751(a aVar) {
        this.f2913 = aVar;
    }

    /* renamed from: ˋ */
    public void mo980(InterfaceC0034b interfaceC0034b) {
        if (this.f2914 != null && interfaceC0034b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2914 = interfaceC0034b;
    }

    /* renamed from: ˆ */
    public void mo976(SubMenu subMenu) {
    }
}
