package h3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.ProgressBar;

/* compiled from: LTSpin.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class r1 extends PopupWindow {
    private r1(View view, int i5, int i6) {
        super(view, i5, i6);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static r1 m9034(Context context, int i5) {
        return m9035(context, i5, null, null);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static r1 m9035(Context context, int i5, String str, String str2) {
        d2.f lVar;
        int color;
        switch (i5) {
            case 2:
                lVar = new e2.l();
                break;
            case 3:
                lVar = new e2.d();
                break;
            case 4:
            default:
                lVar = new e2.o();
                break;
            case 5:
                lVar = new e2.n();
                break;
            case 6:
                lVar = new e2.i();
                break;
            case 7:
                lVar = new e2.a();
                break;
            case 8:
                lVar = new e2.m();
                break;
            case 9:
                lVar = new e2.b();
                break;
            case 10:
                lVar = new e2.c();
                break;
            case 11:
                lVar = new e2.e();
                break;
        }
        ProgressBar progressBar = (ProgressBar) View.inflate(context, 2131427383, null);
        if (!TextUtils.isEmpty(str2)) {
            try {
                int parseColor = Color.parseColor(str2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(parseColor);
                gradientDrawable.setCornerRadius(n3.z1.m10946(context, 8.0f));
                progressBar.setBackground(gradientDrawable);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(str)) {
            color = context.getResources().getColor(2131034858);
        } else {
            try {
                color = Color.parseColor(str);
            } catch (Exception e6) {
                e6.printStackTrace();
                color = context.getResources().getColor(2131034858);
            }
        }
        lVar.mo8195(color);
        progressBar.setIndeterminateDrawable(lVar);
        r1 r1Var = new r1(progressBar, -2, -2);
        r1Var.setFocusable(false);
        r1Var.setOutsideTouchable(false);
        return r1Var;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m9036(View view) {
        showAtLocation(view, 17, 0, 0);
    }
}
