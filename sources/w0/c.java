package w0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* compiled from: DialogBase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected MDRootLayout f11795;

    /* renamed from: ʿ, reason: contains not printable characters */
    private DialogInterface.OnShowListener f11796;

    c(Context context, int i5) {
        super(context, i5);
    }

    @Override // android.app.Dialog
    public View findViewById(int i5) {
        return this.f11795.findViewById(i5);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f11796;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int i5) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f11796 = onShowListener;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final void m12454() {
        super.setOnShowListener(this);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    final void m12455(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
