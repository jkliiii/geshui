package x2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: DefaultTransform.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f implements z2.j {

    /* renamed from: ʾ, reason: contains not printable characters */
    static final Paint f12169 = new Paint(2);

    /* renamed from: ʻ, reason: contains not printable characters */
    final c0 f12170;

    /* renamed from: ʼ, reason: contains not printable characters */
    final int f12171;

    /* renamed from: ʽ, reason: contains not printable characters */
    final int f12172;

    public f(int i5, int i6, c0 c0Var) {
        this.f12171 = i5;
        this.f12172 = i6;
        if (c0Var == null) {
            this.f12170 = c0.FitXY;
        } else {
            this.f12170 = c0Var;
        }
    }

    @Override // z2.j
    /* renamed from: ʻ, reason: contains not printable characters */
    public Bitmap mo12698(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i5 = this.f12171;
        int i6 = this.f12172;
        if (i5 <= 0) {
            i5 = (int) ((bitmap.getWidth() / bitmap.getHeight()) * i6);
        } else if (i6 <= 0) {
            i6 = (int) ((bitmap.getHeight() / bitmap.getWidth()) * i5);
        }
        float f5 = i5;
        float f6 = i6;
        RectF rectF = new RectF(0.0f, 0.0f, f5, f6);
        c0 c0Var = this.f12170;
        c0 c0Var2 = c0.CenterInside;
        if (c0Var == c0Var2 && (i5 <= bitmap.getWidth() || i6 <= bitmap.getHeight())) {
            c0Var = c0.FitCenter;
        }
        if (c0Var == c0Var2) {
            float width = (i5 - bitmap.getWidth()) / 2.0f;
            float height = (i6 - bitmap.getHeight()) / 2.0f;
            rectF.set(width, height, bitmap.getWidth() + width, bitmap.getHeight() + height);
        } else if (c0Var != c0.FitXY) {
            float width2 = f5 / bitmap.getWidth();
            float height2 = f6 / bitmap.getHeight();
            float max = c0Var == c0.CenterCrop ? Math.max(width2, height2) : Math.min(width2, height2);
            if (max == 0.0f) {
                return bitmap;
            }
            float height3 = bitmap.getHeight() * max;
            float width3 = (f5 - (bitmap.getWidth() * max)) / 2.0f;
            float f7 = (f6 - height3) / 2.0f;
            rectF.set(width3, f7, f5 - width3, f6 - f7);
        }
        if (rectF.width() == bitmap.getWidth() && rectF.height() == bitmap.getHeight() && rectF.top == 0.0f && rectF.left == 0.0f) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, f12169);
        return createBitmap;
    }

    @Override // z2.j
    /* renamed from: ʼ, reason: contains not printable characters */
    public String mo12699() {
        return this.f12170.name() + this.f12171 + "x" + this.f12172;
    }
}
