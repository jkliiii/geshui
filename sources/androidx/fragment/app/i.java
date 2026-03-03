package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.s0;

/* compiled from: FragmentController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final k<?> f3586;

    private i(k<?> kVar) {
        this.f3586 = kVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static i m4090(k<?> kVar) {
        return new i((k) androidx.core.util.h.m2584(kVar, "callbacks == null"));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m4091(e eVar) {
        k<?> kVar = this.f3586;
        kVar.f3592.m4234(kVar, kVar, eVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m4092() {
        this.f3586.f3592.m4253();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m4093(Configuration configuration) {
        this.f3586.f3592.m4255(configuration);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m4094(MenuItem menuItem) {
        return this.f3586.f3592.m4256(menuItem);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m4095() {
        this.f3586.f3592.m4246();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m4096(Menu menu, MenuInflater menuInflater) {
        return this.f3586.f3592.m4248(menu, menuInflater);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m4097() {
        this.f3586.f3592.m4171();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m4098() {
        this.f3586.f3592.m4189();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m4099(boolean z5) {
        this.f3586.f3592.m4228(z5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m4100(MenuItem menuItem) {
        return this.f3586.f3592.m4244(menuItem);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m4101(Menu menu) {
        this.f3586.f3592.m4230(menu);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m4102() {
        this.f3586.f3592.m4232();
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m4103(boolean z5) {
        this.f3586.f3592.m4237(z5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m4104(Menu menu) {
        return this.f3586.f3592.m4235(menu);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m4105() {
        this.f3586.f3592.m4239();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m4106() {
        this.f3586.f3592.m4242();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m4107() {
        this.f3586.f3592.m4243();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public boolean m4108() {
        return this.f3586.f3592.m4172(true);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public n m4109() {
        return this.f3586.f3592;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m4110() {
        this.f3586.f3592.m4206();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public View m4111(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3586.f3592.m4184().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m4112(Parcelable parcelable) {
        k<?> kVar = this.f3586;
        if (!(kVar instanceof s0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f3592.m4218(parcelable);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public Parcelable m4113() {
        return this.f3586.f3592.m4219();
    }
}
