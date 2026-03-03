package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e extends b implements g.a {

    /* renamed from: ˆ, reason: contains not printable characters */
    private Context f695;

    /* renamed from: ˈ, reason: contains not printable characters */
    private ActionBarContextView f696;

    /* renamed from: ˉ, reason: contains not printable characters */
    private b.a f697;

    /* renamed from: ˊ, reason: contains not printable characters */
    private WeakReference<View> f698;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f699;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f700;

    /* renamed from: ˏ, reason: contains not printable characters */
    private androidx.appcompat.view.menu.g f701;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z5) {
        this.f695 = context;
        this.f696 = actionBarContextView;
        this.f697 = aVar;
        androidx.appcompat.view.menu.g defaultShowAsAction = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).setDefaultShowAsAction(1);
        this.f701 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
        this.f700 = z5;
    }

    @Override // androidx.appcompat.view.menu.g.a
    /* renamed from: ʻ */
    public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f697.mo697(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    /* renamed from: ʼ */
    public void mo529(androidx.appcompat.view.menu.g gVar) {
        mo569();
        this.f696.m1012();
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ʽ */
    public void mo563() {
        if (this.f699) {
            return;
        }
        this.f699 = true;
        this.f697.mo696(this);
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ʾ */
    public View mo564() {
        WeakReference<View> weakReference = this.f698;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ʿ */
    public Menu mo565() {
        return this.f701;
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˆ */
    public MenuInflater mo566() {
        return new g(this.f696.getContext());
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˈ */
    public CharSequence mo567() {
        return this.f696.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˊ */
    public CharSequence mo568() {
        return this.f696.getTitle();
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˎ */
    public void mo569() {
        this.f697.mo695(this, this.f701);
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˏ */
    public boolean mo570() {
        return this.f696.m1010();
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ˑ */
    public void mo571(View view) {
        this.f696.setCustomView(view);
        this.f698 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: י */
    public void mo572(int i5) {
        mo573(this.f695.getString(i5));
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ـ */
    public void mo573(CharSequence charSequence) {
        this.f696.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ᐧ */
    public void mo574(int i5) {
        mo575(this.f695.getString(i5));
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ᴵ */
    public void mo575(CharSequence charSequence) {
        this.f696.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    /* renamed from: ᵎ */
    public void mo576(boolean z5) {
        super.mo576(z5);
        this.f696.setTitleOptional(z5);
    }
}
