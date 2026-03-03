package com.google.android.material.timepicker;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.j0;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i implements ClockHandView.OnRotateListener, TimePickerView.f, TimePickerView.e, ClockHandView.OnActionUpListener, j {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final String[] f6369 = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final String[] f6370 = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final String[] f6371 = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: ʾ, reason: contains not printable characters */
    private final TimePickerView f6372;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final h f6373;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float f6374;

    /* renamed from: ˈ, reason: contains not printable characters */
    private float f6375;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f6376 = false;

    /* compiled from: TimePickerClockPresenter.java */
    class a extends com.google.android.material.timepicker.b {
        a(Context context, int i5) {
            super(context, i5);
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(view.getResources().getString(i.this.f6373.m7614(), String.valueOf(i.this.f6373.m7615())));
        }
    }

    /* compiled from: TimePickerClockPresenter.java */
    class b extends com.google.android.material.timepicker.b {
        b(Context context, int i5) {
            super(context, i5);
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(i.this.f6373.f6366)));
        }
    }

    public i(TimePickerView timePickerView, h hVar) {
        this.f6372 = timePickerView;
        this.f6373 = hVar;
        m7634();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private String[] m7625() {
        return this.f6373.f6364 == 1 ? f6370 : f6369;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int m7626() {
        return (this.f6373.m7615() * 30) % 360;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m7627(int i5, int i6) {
        h hVar = this.f6373;
        if (hVar.f6366 == i6 && hVar.f6365 == i5) {
            return;
        }
        this.f6372.performHapticFeedback(Build.VERSION.SDK_INT >= 21 ? 4 : 1);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m7628() {
        h hVar = this.f6373;
        int i5 = 1;
        if (hVar.f6367 == 10 && hVar.f6364 == 1 && hVar.f6365 >= 12) {
            i5 = 2;
        }
        this.f6372.m7587(i5);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m7629() {
        TimePickerView timePickerView = this.f6372;
        h hVar = this.f6373;
        timePickerView.m7596(hVar.f6368, hVar.m7615(), this.f6373.f6366);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m7630() {
        m7631(f6369, "%d");
        m7631(f6371, "%02d");
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m7631(String[] strArr, String str) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = h.m7612(this.f6372.getResources(), strArr[i5], str);
        }
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        this.f6375 = m7626();
        h hVar = this.f6373;
        this.f6374 = hVar.f6366 * 6;
        m7635(hVar.f6367, false);
        m7629();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float f5, boolean z5) {
        this.f6376 = true;
        h hVar = this.f6373;
        int i5 = hVar.f6366;
        int i6 = hVar.f6365;
        if (hVar.f6367 == 10) {
            this.f6372.m7589(this.f6375, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) androidx.core.content.a.m1997(this.f6372.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                m7635(12, true);
            }
        } else {
            int round = Math.round(f5);
            if (!z5) {
                this.f6373.m7620(((round + 15) / 30) * 5);
                this.f6374 = this.f6373.f6366 * 6;
            }
            this.f6372.m7589(this.f6374, z5);
        }
        this.f6376 = false;
        m7629();
        m7627(i6, i5);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f5, boolean z5) {
        if (this.f6376) {
            return;
        }
        h hVar = this.f6373;
        int i5 = hVar.f6365;
        int i6 = hVar.f6366;
        int round = Math.round(f5);
        h hVar2 = this.f6373;
        if (hVar2.f6367 == 12) {
            hVar2.m7620((round + 3) / 6);
            this.f6374 = (float) Math.floor(this.f6373.f6366 * 6);
        } else {
            int i7 = (round + 15) / 30;
            if (hVar2.f6364 == 1) {
                i7 %= 12;
                if (this.f6372.m7601() == 2) {
                    i7 += 12;
                }
            }
            this.f6373.m7618(i7);
            this.f6375 = m7626();
        }
        if (z5) {
            return;
        }
        m7629();
        m7627(i5, i6);
    }

    @Override // com.google.android.material.timepicker.j
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo7632() {
        this.f6372.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.e
    /* renamed from: ʼ */
    public void mo7602(int i5) {
        this.f6373.m7621(i5);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    /* renamed from: ʽ */
    public void mo7603(int i5) {
        m7635(i5, true);
    }

    @Override // com.google.android.material.timepicker.j
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo7633() {
        this.f6372.setVisibility(8);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m7634() {
        if (this.f6373.f6364 == 0) {
            this.f6372.m7595();
        }
        this.f6372.m7600(this);
        this.f6372.m7593(this);
        this.f6372.m7592(this);
        this.f6372.m7590(this);
        m7630();
        invalidate();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m7635(int i5, boolean z5) {
        boolean z6 = i5 == 12;
        this.f6372.m7599(z6);
        this.f6373.f6367 = i5;
        this.f6372.m7594(z6 ? f6371 : m7625(), z6 ? R.string.material_minute_suffix : this.f6373.m7614());
        m7628();
        this.f6372.m7589(z6 ? this.f6374 : this.f6375, z5);
        this.f6372.m7598(i5);
        this.f6372.m7591(new a(this.f6372.getContext(), R.string.material_hour_selection));
        this.f6372.m7588(new b(this.f6372.getContext(), R.string.material_minute_selection));
    }
}
