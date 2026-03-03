package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

/* compiled from: Debug.java */
@SuppressLint({"LogConditional"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m1745(Context context, int i5) {
        if (i5 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i5);
        } catch (Exception unused) {
            return "?" + i5;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m1746(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
