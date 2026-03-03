package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Guideline.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends View {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f2024;

    public i(Context context) {
        super(context);
        this.f2024 = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z5) {
        this.f2024 = z5;
    }

    public void setGuidelineBegin(int i5) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2024 && bVar.f1750 == i5) {
            return;
        }
        bVar.f1750 = i5;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i5) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2024 && bVar.f1776 == i5) {
            return;
        }
        bVar.f1776 = i5;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f5) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2024 && bVar.f1779 == f5) {
            return;
        }
        bVar.f1779 = f5;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
    }
}
