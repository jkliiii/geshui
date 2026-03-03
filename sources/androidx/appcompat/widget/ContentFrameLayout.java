package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private TypedValue f1049;

    /* renamed from: ʿ, reason: contains not printable characters */
    private TypedValue f1050;

    /* renamed from: ˆ, reason: contains not printable characters */
    private TypedValue f1051;

    /* renamed from: ˈ, reason: contains not printable characters */
    private TypedValue f1052;

    /* renamed from: ˉ, reason: contains not printable characters */
    private TypedValue f1053;

    /* renamed from: ˊ, reason: contains not printable characters */
    private TypedValue f1054;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Rect f1055;

    /* renamed from: ˎ, reason: contains not printable characters */
    private a f1056;

    public interface a {
        void onDetachedFromWindow();

        /* renamed from: ʻ */
        void mo693();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1053 == null) {
            this.f1053 = new TypedValue();
        }
        return this.f1053;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1054 == null) {
            this.f1054 = new TypedValue();
        }
        return this.f1054;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1051 == null) {
            this.f1051 = new TypedValue();
        }
        return this.f1051;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1052 == null) {
            this.f1052 = new TypedValue();
        }
        return this.f1052;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1049 == null) {
            this.f1049 = new TypedValue();
        }
        return this.f1049;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1050 == null) {
            this.f1050 = new TypedValue();
        }
        return this.f1050;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f1056;
        if (aVar != null) {
            aVar.mo693();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f1056;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0060  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f1056 = aVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m1066(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1067(int i5, int i6, int i7, int i8) {
        this.f1055.set(i5, i6, i7, i8);
        if (androidx.core.view.f1.m2808(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1055 = new Rect();
    }
}
