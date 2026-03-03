package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: AppCompatProgressBarHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l0 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final int[] f1356 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ProgressBar f1357;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Bitmap f1358;

    /* compiled from: AppCompatProgressBarHelper.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static void m1417(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i5) {
            layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
            layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
            layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
            layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
            layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
            layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
            layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
            layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
            layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
        }
    }

    l0(ProgressBar progressBar) {
        this.f1357 = progressBar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Shape m1412() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private Drawable m1413(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i5 = 0; i5 < numberOfFrames; i5++) {
            Drawable m1416 = m1416(animationDrawable.getFrame(i5), true);
            m1416.setLevel(10000);
            animationDrawable2.addFrame(m1416, animationDrawable.getDuration(i5));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    Bitmap m1414() {
        return this.f1358;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void mo1415(AttributeSet attributeSet, int i5) {
        d3 m1181 = d3.m1181(this.f1357.getContext(), attributeSet, f1356, i5, 0);
        Drawable m1189 = m1181.m1189(0);
        if (m1189 != null) {
            this.f1357.setIndeterminateDrawable(m1413(m1189));
        }
        Drawable m11892 = m1181.m1189(1);
        if (m11892 != null) {
            this.f1357.setProgressDrawable(m1416(m11892, false));
        }
        m1181.m1201();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾ, reason: contains not printable characters */
    Drawable m1416(Drawable drawable, boolean z5) {
        if (drawable instanceof androidx.core.graphics.drawable.z) {
            androidx.core.graphics.drawable.z zVar = (androidx.core.graphics.drawable.z) drawable;
            Drawable mo2234 = zVar.mo2234();
            if (mo2234 != null) {
                zVar.mo2233(m1416(mo2234, z5));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    int id = layerDrawable.getId(i5);
                    drawableArr[i5] = m1416(layerDrawable.getDrawable(i5), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    layerDrawable2.setId(i6, layerDrawable.getId(i6));
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.m1417(layerDrawable, layerDrawable2, i6);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1358 == null) {
                    this.f1358 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m1412());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z5 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
