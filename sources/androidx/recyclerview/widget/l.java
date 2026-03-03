package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l {
    /* renamed from: ʻ, reason: contains not printable characters */
    static int m5194(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z5) {
        if (pVar.getChildCount() == 0 || b0Var.m4766() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
        }
        return Math.min(iVar.mo5179(), iVar.mo5169(view2) - iVar.mo5172(view));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static int m5195(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z5, boolean z6) {
        if (pVar.getChildCount() == 0 || b0Var.m4766() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (b0Var.m4766() - Math.max(pVar.getPosition(view), pVar.getPosition(view2))) - 1) : Math.max(0, Math.min(pVar.getPosition(view), pVar.getPosition(view2)));
        if (z5) {
            return Math.round((max * (Math.abs(iVar.mo5169(view2) - iVar.mo5172(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (iVar.mo5178() - iVar.mo5172(view)));
        }
        return max;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static int m5196(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z5) {
        if (pVar.getChildCount() == 0 || b0Var.m4766() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return b0Var.m4766();
        }
        return (int) (((iVar.mo5169(view2) - iVar.mo5172(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * b0Var.m4766());
    }
}
