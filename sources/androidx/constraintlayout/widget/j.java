package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.e;

/* compiled from: Placeholder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends View {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f2025;

    /* renamed from: ʿ, reason: contains not printable characters */
    private View f2026;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f2027;

    public View getContent() {
        return this.f2026;
    }

    public int getEmptyVisibility() {
        return this.f2027;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i5) {
        View findViewById;
        if (this.f2025 == i5) {
            return;
        }
        View view = this.f2026;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2026.getLayoutParams()).f1763 = false;
            this.f2026 = null;
        }
        this.f2025 = i5;
        if (i5 == -1 || (findViewById = ((View) getParent()).findViewById(i5)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i5) {
        this.f2027 = i5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m1886(ConstraintLayout constraintLayout) {
        if (this.f2026 == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2026.getLayoutParams();
        bVar2.f1775.m11281(0);
        e.b m11311 = bVar.f1775.m11311();
        e.b bVar3 = e.b.FIXED;
        if (m11311 != bVar3) {
            bVar.f1775.m11282(bVar2.f1775.m11309());
        }
        if (bVar.f1775.m11318() != bVar3) {
            bVar.f1775.m11256(bVar2.f1775.m11323());
        }
        bVar2.f1775.m11281(8);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1887(ConstraintLayout constraintLayout) {
        if (this.f2025 == -1 && !isInEditMode()) {
            setVisibility(this.f2027);
        }
        View findViewById = constraintLayout.findViewById(this.f2025);
        this.f2026 = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f1763 = true;
            this.f2026.setVisibility(0);
            setVisibility(0);
        }
    }
}
