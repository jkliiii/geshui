package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.s;

/* compiled from: AppCompatDialog.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t extends androidx.activity.k implements d {
    private g mDelegate;
    private final s.a mKeyDispatcher;

    public t(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i5) {
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f6916, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo596(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo611();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.s.m3311(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i5) {
        return (T) getDelegate().mo606(i5);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.m584(this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        return getDelegate().mo614();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().mo617();
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        getDelegate().mo616();
        super.onCreate(bundle);
        getDelegate().mo619(bundle);
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStop() {
        super.onStop();
        getDelegate().mo597();
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(int i5) {
        getDelegate().mo602(i5);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo615(charSequence);
    }

    boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i5) {
        return getDelegate().mo599(i5);
    }

    public t(Context context, int i5) {
        super(context, getThemeResId(context, i5));
        this.mKeyDispatcher = new s.a() { // from class: androidx.appcompat.app.s
            @Override // androidx.core.view.s.a
            /* renamed from: ʾ, reason: contains not printable characters */
            public final boolean mo738(KeyEvent keyEvent) {
                return this.f595.superDispatchKeyEvent(keyEvent);
            }
        };
        g delegate = getDelegate();
        delegate.mo608(getThemeResId(context, i5));
        delegate.mo619(null);
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(View view) {
        getDelegate().mo600(view);
    }

    @Override // androidx.activity.k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo604(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i5) {
        super.setTitle(i5);
        getDelegate().mo615(getContext().getString(i5));
    }

    protected t(Context context, boolean z5, DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new s.a() { // from class: androidx.appcompat.app.s
            @Override // androidx.core.view.s.a
            /* renamed from: ʾ, reason: contains not printable characters */
            public final boolean mo738(KeyEvent keyEvent) {
                return this.f595.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z5);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }
}
