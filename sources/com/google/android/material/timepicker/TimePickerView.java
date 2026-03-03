package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

/* loaded from: E:\78999\cookie_5123796.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private final Chip f6341;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private final ClockFaceView f6342;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private final ClockHandView f6343;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private final View.OnClickListener f6344;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final MaterialButtonToggleGroup f6345;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private f f6346;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private d f6347;

    /* renamed from: ــ, reason: contains not printable characters */
    private e f6348;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Chip f6349;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f6346 != null) {
                TimePickerView.this.f6346.mo7603(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar = TimePickerView.this.f6347;
            if (dVar == null) {
                return false;
            }
            dVar.onDoubleTap();
            return true;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ GestureDetector f6352;

        c(GestureDetector gestureDetector) {
            this.f6352 = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f6352.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
        void onDoubleTap();
    }

    interface e {
        /* renamed from: ʼ, reason: contains not printable characters */
        void mo7602(int i5);
    }

    interface f {
        /* renamed from: ʽ, reason: contains not printable characters */
        void mo7603(int i5);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private void m7580() {
        Chip chip = this.f6349;
        int i5 = R.id.selection_type;
        chip.setTag(i5, 12);
        this.f6341.setTag(i5, 10);
        this.f6349.setOnClickListener(this.f6344);
        this.f6341.setOnClickListener(this.f6344);
        this.f6349.setAccessibilityClassName("android.view.View");
        this.f6341.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: ˊˊ, reason: contains not printable characters */
    private void m7581() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f6349.setOnTouchListener(cVar);
        this.f6341.setOnTouchListener(cVar);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m7582(Chip chip, boolean z5) {
        chip.setChecked(z5);
        f1.m2833(chip, z5 ? 2 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public /* synthetic */ void m7586(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5) {
        e eVar;
        if (z5 && (eVar = this.f6348) != null) {
            eVar.mo7602(i5 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (view == this && i5 == 0) {
            this.f6341.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m7587(int i5) {
        this.f6342.m7554(i5);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m7588(androidx.core.view.a aVar) {
        f1.m2830(this.f6349, aVar);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m7589(float f5, boolean z5) {
        this.f6343.m7576(f5, z5);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m7590(ClockHandView.OnActionUpListener onActionUpListener) {
        this.f6343.m7578(onActionUpListener);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m7591(androidx.core.view.a aVar) {
        f1.m2830(this.f6341, aVar);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    void m7592(e eVar) {
        this.f6348 = eVar;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m7593(f fVar) {
        this.f6346 = fVar;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m7594(String[] strArr, int i5) {
        this.f6342.m7553(strArr, i5);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void m7595() {
        this.f6345.setVisibility(0);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void m7596(int i5, int i6, int i7) {
        this.f6345.check(i5 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i7));
        String format2 = String.format(locale, "%02d", Integer.valueOf(i6));
        if (!TextUtils.equals(this.f6349.getText(), format)) {
            this.f6349.setText(format);
        }
        if (TextUtils.equals(this.f6341.getText(), format2)) {
            return;
        }
        this.f6341.setText(format2);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    void m7597(d dVar) {
        this.f6347 = dVar;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m7598(int i5) {
        m7582(this.f6349, i5 == 12);
        m7582(this.f6341, i5 == 10);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m7599(boolean z5) {
        this.f6343.m7572(z5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m7600(ClockHandView.OnRotateListener onRotateListener) {
        this.f6343.m7567(onRotateListener);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    int m7601() {
        return this.f6342.m7555();
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f6344 = new a();
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.f6342 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f6345 = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.n
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i6, boolean z5) {
                this.f6401.m7586(materialButtonToggleGroup2, i6, z5);
            }
        });
        this.f6349 = (Chip) findViewById(R.id.material_minute_tv);
        this.f6341 = (Chip) findViewById(R.id.material_hour_tv);
        this.f6343 = (ClockHandView) findViewById(R.id.material_clock_hand);
        m7581();
        m7580();
    }
}
