package s;

import android.view.View;
import o.e;

/* compiled from: ViewSpline.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c extends e {
    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo11697(View view, float f5);

    /* compiled from: ViewSpline.java */
    public static class a extends c {
        /* renamed from: ʽ, reason: contains not printable characters */
        public void m11698(View view, float f5, double d6, double d7) {
            view.setRotation(m10971(f5) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
        }

        @Override // s.c
        /* renamed from: ʼ */
        public void mo11697(View view, float f5) {
        }
    }
}
