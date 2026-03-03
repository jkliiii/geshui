package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: View.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g4 {

    /* compiled from: View.kt */
    @z3.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
    static final class a extends z3.j implements e4.p<k4.d<? super View>, x3.c<? super v3.p>, Object> {

        /* renamed from: ˆ, reason: contains not printable characters */
        int f2995;

        /* renamed from: ˈ, reason: contains not printable characters */
        private /* synthetic */ Object f2996;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ View f2997;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, x3.c<? super a> cVar) {
            super(2, cVar);
            this.f2997 = view;
        }

        @Override // z3.a
        /* renamed from: ʻ */
        public final x3.c<v3.p> mo3057(Object obj, x3.c<?> cVar) {
            a aVar = new a(this.f2997, cVar);
            aVar.f2996 = obj;
            return aVar;
        }

        @Override // z3.a
        /* renamed from: ˋ */
        public final Object mo3059(Object obj) {
            k4.d dVar;
            Object m12938 = y3.d.m12938();
            int i5 = this.f2995;
            if (i5 == 0) {
                v3.k.m12383(obj);
                dVar = (k4.d) this.f2996;
                View view = this.f2997;
                this.f2996 = dVar;
                this.f2995 = 1;
                if (dVar.mo9538(view, this) == m12938) {
                    return m12938;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v3.k.m12383(obj);
                    return v3.p.f11735;
                }
                dVar = (k4.d) this.f2996;
                v3.k.m12383(obj);
            }
            View view2 = this.f2997;
            if (view2 instanceof ViewGroup) {
                k4.b<View> m3055 = f4.m3055((ViewGroup) view2);
                this.f2996 = null;
                this.f2995 = 2;
                if (dVar.m9542(m3055, this) == m12938) {
                    return m12938;
                }
            }
            return v3.p.f11735;
        }

        @Override // e4.p
        /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo3058(k4.d<? super View> dVar, x3.c<? super v3.p> cVar) {
            return ((a) mo3057(dVar, cVar)).mo3059(v3.p.f11735);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final k4.b<View> m3141(View view) {
        f4.k.m8623(view, "<this>");
        return k4.f.m9547(new a(view, null));
    }
}
