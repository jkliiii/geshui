package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.f2;

/* loaded from: E:\78999\cookie_5123796.dex */
public class FitWindowsFrameLayout extends FrameLayout implements f2 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private f2.a f1057;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        f2.a aVar = this.f1057;
        if (aVar != null) {
            aVar.mo692(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.f2
    public void setOnFitSystemWindowsListener(f2.a aVar) {
        this.f1057 = aVar;
    }
}
