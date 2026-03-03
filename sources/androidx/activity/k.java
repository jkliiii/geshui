package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;

/* compiled from: ComponentDialog.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends Dialog implements androidx.lifecycle.p, s, n0.f {
    private androidx.lifecycle.q _lifecycleRegistry;
    private final q onBackPressedDispatcher;
    private final n0.e savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        this(context, 0, 2, null);
        f4.k.m8623(context, "context");
    }

    private final androidx.lifecycle.q getLifecycleRegistry() {
        androidx.lifecycle.q qVar = this._lifecycleRegistry;
        if (qVar != null) {
            return qVar;
        }
        androidx.lifecycle.q qVar2 = new androidx.lifecycle.q(this);
        this._lifecycleRegistry = qVar2;
        return qVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher$lambda$1(k kVar) {
        f4.k.m8623(kVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f4.k.m8623(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.l getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // androidx.activity.s
    public final q getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // n0.f
    public n0.d getSavedStateRegistry() {
        return this.savedStateRegistryController.m10411();
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        f4.k.m8620(window);
        View decorView = window.getDecorView();
        f4.k.m8622(decorView, "window!!.decorView");
        t0.m4515(decorView, this);
        Window window2 = getWindow();
        f4.k.m8620(window2);
        View decorView2 = window2.getDecorView();
        f4.k.m8622(decorView2, "window!!.decorView");
        v.m444(decorView2, this);
        Window window3 = getWindow();
        f4.k.m8620(window3);
        View decorView3 = window3.getDecorView();
        f4.k.m8622(decorView3, "window!!.decorView");
        n0.g.m10416(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.m427();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            q qVar = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            f4.k.m8622(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            qVar.m428(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.m10413(bundle);
        getLifecycleRegistry().m4485(l.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        f4.k.m8622(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.m10414(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        getLifecycleRegistry().m4485(l.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        getLifecycleRegistry().m4485(l.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        super.setContentView(i5);
    }

    public /* synthetic */ k(Context context, int i5, int i6, f4.g gVar) {
        this(context, (i6 & 2) != 0 ? 0 : i5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i5) {
        super(context, i5);
        f4.k.m8623(context, "context");
        this.savedStateRegistryController = n0.e.f9510.m10415(this);
        this.onBackPressedDispatcher = new q(new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                k.onBackPressedDispatcher$lambda$1(this.f241);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f4.k.m8623(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f4.k.m8623(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
