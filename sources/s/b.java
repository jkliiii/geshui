package s;

import android.view.View;

/* compiled from: ViewOscillator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b extends o.d {
    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo11695(View view, float f5);

    /* compiled from: ViewOscillator.java */
    public static class a extends b {
        /* renamed from: ʽ, reason: contains not printable characters */
        public void m11696(View view, float f5, double d6, double d7) {
            view.setRotation(m10969(f5) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
        }

        @Override // s.b
        /* renamed from: ʼ */
        public void mo11695(View view, float f5) {
        }
    }
}
