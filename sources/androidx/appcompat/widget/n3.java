package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* compiled from: TooltipPopup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n3 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f1375;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final View f1376;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final TextView f1377;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final WindowManager.LayoutParams f1378;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Rect f1379;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int[] f1380;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int[] f1381;

    n3(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1378 = layoutParams;
        this.f1379 = new Rect();
        this.f1380 = new int[2];
        this.f1381 = new int[2];
        this.f1375 = context;
        View inflate = LayoutInflater.from(context).inflate(e.g.f7057, (ViewGroup) null);
        this.f1376 = inflate;
        this.f1377 = (TextView) inflate.findViewById(e.f.f7031);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.f7073;
        layoutParams.flags = 24;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1441(View view, int i5, int i6, boolean z5, WindowManager.LayoutParams layoutParams) {
        int height;
        int i7;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1375.getResources().getDimensionPixelOffset(e.d.f6949);
        if (view.getWidth() < dimensionPixelOffset) {
            i5 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1375.getResources().getDimensionPixelOffset(e.d.f6948);
            height = i6 + dimensionPixelOffset2;
            i7 = i6 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1375.getResources().getDimensionPixelOffset(z5 ? e.d.f6951 : e.d.f6950);
        View m1442 = m1442(view);
        if (m1442 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m1442.getWindowVisibleDisplayFrame(this.f1379);
        Rect rect = this.f1379;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1375.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1379.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m1442.getLocationOnScreen(this.f1381);
        view.getLocationOnScreen(this.f1380);
        int[] iArr = this.f1380;
        int i8 = iArr[0];
        int[] iArr2 = this.f1381;
        int i9 = i8 - iArr2[0];
        iArr[0] = i9;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i9 + i5) - (m1442.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1376.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1376.getMeasuredHeight();
        int i10 = this.f1380[1];
        int i11 = ((i7 + i10) - dimensionPixelOffset3) - measuredHeight;
        int i12 = i10 + height + dimensionPixelOffset3;
        if (z5) {
            if (i11 >= 0) {
                layoutParams.y = i11;
                return;
            } else {
                layoutParams.y = i12;
                return;
            }
        }
        if (measuredHeight + i12 <= this.f1379.height()) {
            layoutParams.y = i12;
        } else {
            layoutParams.y = i11;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static View m1442(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m1443() {
        if (m1444()) {
            ((WindowManager) this.f1375.getSystemService("window")).removeView(this.f1376);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m1444() {
        return this.f1376.getParent() != null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1445(View view, int i5, int i6, boolean z5, CharSequence charSequence) {
        if (m1444()) {
            m1443();
        }
        this.f1377.setText(charSequence);
        m1441(view, i5, i6, z5, this.f1378);
        ((WindowManager) this.f1375.getSystemService("window")).addView(this.f1376, this.f1378);
    }
}
