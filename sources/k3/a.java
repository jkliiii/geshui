package k3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.n;
import n3.z1;

/* compiled from: FullScreenFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends androidx.fragment.app.d {

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean f8862 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private View f8863 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private n3.f<androidx.fragment.app.d> f8864 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f8865 = false;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f8866 = -1;

    @Override // androidx.fragment.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131886096);
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(-16777216);
        }
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View view = this.f8863;
        if (view != null) {
            view.setFitsSystemWindows(true);
            frameLayout.addView(this.f8863, -1, -1);
        }
        this.f8865 = frameLayout.getKeepScreenOn();
        frameLayout.setKeepScreenOn(true);
        androidx.fragment.app.f activity = getActivity();
        if (activity != null) {
            this.f8866 = activity.getRequestedOrientation();
            activity.setRequestedOrientation(this.f8862 ? 1 : 0);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            z1.m10958(dialog.getWindow());
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        androidx.fragment.app.f activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.f8866);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            z1.m10959(dialog.getWindow());
        }
        if (getView() != null) {
            getView().setKeepScreenOn(this.f8865);
        }
        n3.f<androidx.fragment.app.d> fVar = this.f8864;
        if (fVar != null) {
            fVar.mo8742(this);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9517(n nVar, View view, n3.f<androidx.fragment.app.d> fVar) {
        if (nVar == null || view == null) {
            return;
        }
        this.f8863 = view;
        super.show(nVar, "fullscreen");
    }
}
