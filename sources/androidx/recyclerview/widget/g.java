package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends RecyclerView.a0 {

    /* renamed from: ˎ, reason: contains not printable characters */
    @SuppressLint({"UnknownNullness"})
    protected PointF f4310;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final DisplayMetrics f4311;

    /* renamed from: י, reason: contains not printable characters */
    private float f4313;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final LinearInterpolator f4308 = new LinearInterpolator();

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final DecelerateInterpolator f4309 = new DecelerateInterpolator();

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f4312 = false;

    /* renamed from: ـ, reason: contains not printable characters */
    protected int f4314 = 0;

    /* renamed from: ٴ, reason: contains not printable characters */
    protected int f4315 = 0;

    @SuppressLint({"UnknownNullness"})
    public g(Context context) {
        this.f4311 = context.getResources().getDisplayMetrics();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private float m5149() {
        if (!this.f4312) {
            this.f4313 = mo5156(this.f4311);
            this.f4312 = true;
        }
        return this.f4313;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int m5150(int i5, int i6) {
        int i7 = i5 - i6;
        if (i5 * i7 <= 0) {
            return 0;
        }
        return i7;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʻʻ, reason: contains not printable characters */
    protected void m5151(RecyclerView.a0.a aVar) {
        PointF mo4742 = mo4742(m4747());
        if (mo4742 == null || (mo4742.x == 0.0f && mo4742.y == 0.0f)) {
            aVar.m4762(m4747());
            m4759();
            return;
        }
        m4750(mo4742);
        this.f4310 = mo4742;
        this.f4314 = (int) (mo4742.x * 10000.0f);
        this.f4315 = (int) (mo4742.y * 10000.0f);
        aVar.m4764((int) (this.f4314 * 1.2f), (int) (this.f4315 * 1.2f), (int) (mo5158(10000) * 1.2f), this.f4308);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˏ */
    protected void mo4753(int i5, int i6, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (m4744() == 0) {
            m4759();
            return;
        }
        this.f4314 = m5150(this.f4314, i5);
        int m5150 = m5150(this.f4315, i6);
        this.f4315 = m5150;
        if (this.f4314 == 0 && m5150 == 0) {
            m5151(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    /* renamed from: י */
    protected void mo4755() {
        this.f4315 = 0;
        this.f4314 = 0;
        this.f4310 = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ـ */
    protected void mo4756(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int mo5154 = mo5154(view, m5159());
        int mo5155 = mo5155(view, m5152());
        int m5157 = m5157((int) Math.sqrt((mo5154 * mo5154) + (mo5155 * mo5155)));
        if (m5157 > 0) {
            aVar.m4764(-mo5154, -mo5155, m5157, this.f4309);
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    protected int m5152() {
        PointF pointF = this.f4310;
        if (pointF != null) {
            float f5 = pointF.y;
            if (f5 != 0.0f) {
                return f5 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public int m5153(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == -1) {
            return i7 - i5;
        }
        if (i9 != 0) {
            if (i9 == 1) {
                return i8 - i6;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i10 = i7 - i5;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i8 - i6;
        if (i11 < 0) {
            return i11;
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ᵔ, reason: contains not printable characters */
    public int mo5154(View view, int i5) {
        RecyclerView.p m4746 = m4746();
        if (m4746 == null || !m4746.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return m5153(m4746.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, m4746.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, m4746.getPaddingLeft(), m4746.getWidth() - m4746.getPaddingRight(), i5);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ᵢ, reason: contains not printable characters */
    public int mo5155(View view, int i5) {
        RecyclerView.p m4746 = m4746();
        if (m4746 == null || !m4746.canScrollVertically()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return m5153(m4746.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, m4746.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, m4746.getPaddingTop(), m4746.getHeight() - m4746.getPaddingBottom(), i5);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ⁱ, reason: contains not printable characters */
    protected float mo5156(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    protected int m5157(int i5) {
        double mo5158 = mo5158(i5);
        Double.isNaN(mo5158);
        return (int) Math.ceil(mo5158 / 0.3356d);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    protected int mo5158(int i5) {
        return (int) Math.ceil(Math.abs(i5) * m5149());
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    protected int m5159() {
        PointF pointF = this.f4310;
        if (pointF != null) {
            float f5 = pointF.x;
            if (f5 != 0.0f) {
                return f5 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    /* renamed from: ˑ */
    protected void mo4754() {
    }
}
