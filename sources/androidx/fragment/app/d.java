package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;

/* compiled from: DialogFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends androidx.fragment.app.e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private androidx.lifecycle.w<androidx.lifecycle.p> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    /* compiled from: DialogFragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.mOnDismissListener.onDismiss(d.this.mDialog);
        }
    }

    /* compiled from: DialogFragment.java */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.mDialog != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.mDialog != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.mDialog);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0046d implements androidx.lifecycle.w<androidx.lifecycle.p> {
        C0046d() {
        }

        @Override // androidx.lifecycle.w
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4005(androidx.lifecycle.p pVar) {
            if (pVar == null || !d.this.mShowsDialog) {
                return;
            }
            View requireView = d.this.requireView();
            if (requireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.mDialog != null) {
                if (n.m4148(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.mDialog);
                }
                d.this.mDialog.setContentView(requireView);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    class e extends h {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ h f3470;

        e(h hVar) {
            this.f3470 = hVar;
        }

        @Override // androidx.fragment.app.h
        /* renamed from: ʽ, reason: contains not printable characters */
        public View mo4007(int i5) {
            return this.f3470.mo4008() ? this.f3470.mo4007(i5) : d.this.onFindViewById(i5);
        }

        @Override // androidx.fragment.app.h
        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean mo4008() {
            return this.f3470.mo4008() || d.this.onHasView();
        }
    }

    public d() {
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C0046d();
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z5, boolean z6) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z6) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            getParentFragmentManager().m4211(this.mBackStackId, 1);
            this.mBackStackId = -1;
            return;
        }
        v m4238 = getParentFragmentManager().m4238();
        m4238.mo3952(this);
        if (z5) {
            m4238.mo3948();
        } else {
            m4238.mo3947();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog onCreateDialog = onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(onCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // androidx.fragment.app.e
    h createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.e
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m4507(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.e
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.e
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().mo4510(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (n.m4148(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        dismissInternal(true, true);
    }

    View onFindViewById(int i5) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i5);
        }
        return null;
    }

    @Override // androidx.fragment.app.e
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (n.m4148(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            return dialog != null ? onGetLayoutInflater.cloneInContext(dialog.getContext()) : onGetLayoutInflater;
        }
        if (n.m4148(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.mShowsDialog) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return onGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, onSaveInstanceState);
        }
        int i5 = this.mStyle;
        if (i5 != 0) {
            bundle.putInt(SAVED_STYLE, i5);
        }
        int i6 = this.mTheme;
        if (i6 != 0) {
            bundle.putInt(SAVED_THEME, i6);
        }
        boolean z5 = this.mCancelable;
        if (!z5) {
            bundle.putBoolean(SAVED_CANCELABLE, z5);
        }
        boolean z6 = this.mShowsDialog;
        if (!z6) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z6);
        }
        int i7 = this.mBackStackId;
        if (i7 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i7);
        }
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            t0.m4515(decorView, this);
            u0.m4516(decorView, this);
            n0.g.m10416(decorView, this);
        }
    }

    @Override // androidx.fragment.app.e
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.e
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.e
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z5) {
        this.mCancelable = z5;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z5);
        }
    }

    public void setShowsDialog(boolean z5) {
        this.mShowsDialog = z5;
    }

    public void setStyle(int i5, int i6) {
        if (n.m4148(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i5 + ", " + i6);
        }
        this.mStyle = i5;
        if (i5 == 2 || i5 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i6 != 0) {
            this.mTheme = i6;
        }
    }

    public void setupDialog(Dialog dialog, int i5) {
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(n nVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        v m4238 = nVar.m4238();
        m4238.m4338(this, str);
        m4238.mo3947();
    }

    public void showNow(n nVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        v m4238 = nVar.m4238();
        m4238.m4338(this, str);
        m4238.mo3949();
    }

    public int show(v vVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        vVar.m4338(this, str);
        this.mViewDestroyed = false;
        int mo3947 = vVar.mo3947();
        this.mBackStackId = mo3947;
        return mo3947;
    }

    public d(int i5) {
        super(i5);
        this.mDismissRunnable = new a();
        this.mOnCancelListener = new b();
        this.mOnDismissListener = new c();
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new C0046d();
        this.mDialogCreated = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
