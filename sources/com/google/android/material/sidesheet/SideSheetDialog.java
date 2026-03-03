package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SideSheetDialog extends f<SideSheetCallback> {
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR = R.attr.sideSheetDialogTheme;
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R.style.Theme_Material3_Light_SideSheetDialog;

    public SideSheetDialog(Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.f
    void addSheetCancelOnHideCallback(Sheet<SideSheetCallback> sheet) {
        sheet.addCallback(new a());
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.f
    Sheet<SideSheetCallback> getBehaviorFromSheet(FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.f
    int getDialogId() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.f
    int getLayoutResId() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.f
    int getStateOnStart() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.f
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z5) {
        super.setCancelable(z5);
    }

    @Override // com.google.android.material.sidesheet.f, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z5) {
        super.setCanceledOnTouchOutside(z5);
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i5) {
        super.setContentView(i5);
    }

    @Override // com.google.android.material.sidesheet.f
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z5) {
        super.setDismissWithSheetAnimationEnabled(z5);
    }

    @Override // com.google.android.material.sidesheet.f
    public /* bridge */ /* synthetic */ void setSheetEdge(int i5) {
        super.setSheetEdge(i5);
    }

    public SideSheetDialog(Context context, int i5) {
        super(context, i5, SIDE_SHEET_DIALOG_THEME_ATTR, SIDE_SHEET_DIALOG_DEFAULT_THEME_RES);
    }

    @Override // com.google.android.material.sidesheet.f
    public SideSheetBehavior<? extends View> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.f, androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }

    class a extends SideSheetCallback {
        a() {
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.c
        public void onStateChanged(View view, int i5) {
            if (i5 == 5) {
                SideSheetDialog.this.cancel();
            }
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, com.google.android.material.sidesheet.c
        public void onSlide(View view, float f5) {
        }
    }
}
