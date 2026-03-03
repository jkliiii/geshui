package com.google.android.material.sidesheet;

import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.sidesheet.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
interface Sheet<C extends c> extends MaterialBackHandler {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetEdge {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SheetState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StableSheetState {
    }

    void addCallback(C c6);

    int getState();

    void setState(int i5);
}
