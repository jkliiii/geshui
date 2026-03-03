package m3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: LTTickDown0.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g0 extends AppCompatTextView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f9214;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f9215;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Paint f9216;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Rect f9217;

    /* renamed from: ˉ, reason: contains not printable characters */
    private RectF f9218;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f9219;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f9220;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f9221;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f9222;

    /* renamed from: ˑ, reason: contains not printable characters */
    private String f9223;

    public g0(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getDrawingRect(this.f9217);
        int centerX = this.f9217.centerX();
        int centerY = this.f9217.centerY();
        this.f9216.setAntiAlias(true);
        this.f9216.setStyle(Paint.Style.FILL);
        this.f9216.setColor(this.f9221);
        canvas.drawCircle(this.f9217.centerX(), this.f9217.centerY(), this.f9215, this.f9216);
        this.f9216.setStyle(Paint.Style.STROKE);
        float f5 = 4;
        this.f9216.setStrokeWidth(f5);
        this.f9216.setColor(this.f9219);
        canvas.drawCircle(this.f9217.centerX(), this.f9217.centerY(), this.f9215 - 4, this.f9216);
        TextPaint paint = getPaint();
        paint.setColor(this.f9222);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(this.f9223, centerX, centerY - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        this.f9216.setStrokeWidth(f5);
        this.f9216.setColor(this.f9220);
        this.f9216.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF = this.f9218;
        Rect rect = this.f9217;
        rectF.set(rect.left + 4, rect.top + 4, rect.right - 4, rect.bottom - 4);
        canvas.drawArc(this.f9218, -90.0f, this.f9214 * 360.0f, false, this.f9216);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        this.f9215 = measuredWidth / 2;
        setMeasuredDimension(measuredWidth, measuredWidth);
    }

    public void setProgress(float f5) {
        this.f9214 = f5;
        postInvalidate();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10011() {
        this.f9216 = new Paint();
        this.f9217 = new Rect();
        this.f9218 = new RectF();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public g0 m10012(int i5) {
        this.f9221 = i5;
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public g0 m10013(int i5) {
        this.f9220 = i5;
        this.f9219 = Color.argb(25, Color.red(i5), Color.green(i5), Color.blue(i5));
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public g0 m10014(int i5) {
        this.f9222 = i5;
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public g0 m10015(String str) {
        this.f9223 = str;
        return this;
    }

    public g0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9214 = 0.2f;
        this.f9219 = 436142080;
        this.f9220 = -65536;
        this.f9221 = -1719105400;
        this.f9222 = 16777215;
        this.f9223 = "SKIP";
        m10011();
    }
}
