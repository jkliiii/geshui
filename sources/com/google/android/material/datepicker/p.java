package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class p extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ⁱ */
        protected float mo5156(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    p(Context context, int i5, boolean z5) {
        super(context, i5, z5);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i5) {
        a aVar = new a(recyclerView.getContext());
        aVar.m4757(i5);
        startSmoothScroll(aVar);
    }
}
