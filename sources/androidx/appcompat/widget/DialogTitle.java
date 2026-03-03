package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;

/* loaded from: E:\78999\cookie_5123796.dex */
public class DialogTitle extends AppCompatTextView {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        int lineCount;
        super.onMeasure(i5, i6);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f7251, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e.j.f7252, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
        super.onMeasure(i5, i6);
    }
}
