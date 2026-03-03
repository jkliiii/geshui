package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f4 {

    /* compiled from: ViewGroup.kt */
    public static final class a implements k4.b<View> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f2952;

        a(ViewGroup viewGroup) {
            this.f2952 = viewGroup;
        }

        @Override // k4.b
        public Iterator<View> iterator() {
            return f4.m3056(this.f2952);
        }
    }

    /* compiled from: ViewGroup.kt */
    @z3.e(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
    static final class b extends z3.j implements e4.p<k4.d<? super View>, x3.c<? super v3.p>, Object> {

        /* renamed from: ˆ, reason: contains not printable characters */
        Object f2953;

        /* renamed from: ˈ, reason: contains not printable characters */
        Object f2954;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f2955;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f2956;

        /* renamed from: ˋ, reason: contains not printable characters */
        int f2957;

        /* renamed from: ˎ, reason: contains not printable characters */
        private /* synthetic */ Object f2958;

        /* renamed from: ˏ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f2959;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, x3.c<? super b> cVar) {
            super(2, cVar);
            this.f2959 = viewGroup;
        }

        @Override // z3.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public final x3.c<v3.p> mo3057(Object obj, x3.c<?> cVar) {
            b bVar = new b(this.f2959, cVar);
            bVar.f2958 = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008f -> B:6:0x0091). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0098 -> B:7:0x009c). Please report as a decompilation issue!!! */
        @Override // z3.a
        /* renamed from: ˋ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo3059(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = y3.b.m12935()
                int r1 = r11.f2957
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r11.f2956
                int r4 = r11.f2955
                java.lang.Object r5 = r11.f2953
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.f2958
                k4.d r6 = (k4.d) r6
                v3.k.m12383(r12)
                r12 = r11
                goto L91
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f2956
                int r4 = r11.f2955
                java.lang.Object r5 = r11.f2954
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.f2953
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.f2958
                k4.d r7 = (k4.d) r7
                v3.k.m12383(r12)
                r12 = r11
                goto L71
            L3d:
                v3.k.m12383(r12)
                java.lang.Object r12 = r11.f2958
                k4.d r12 = (k4.d) r12
                android.view.ViewGroup r1 = r11.f2959
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L4c:
                if (r5 >= r4) goto La1
                android.view.View r7 = r1.getChildAt(r5)
                java.lang.String r8 = "getChildAt(index)"
                f4.k.m8622(r7, r8)
                r6.f2958 = r12
                r6.f2953 = r1
                r6.f2954 = r7
                r6.f2955 = r5
                r6.f2956 = r4
                r6.f2957 = r3
                java.lang.Object r8 = r12.mo9538(r7, r6)
                if (r8 != r0) goto L6a
                return r0
            L6a:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L71:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L98
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                k4.b r5 = androidx.core.view.f4.m3055(r5)
                r12.f2958 = r7
                r12.f2953 = r6
                r8 = 0
                r12.f2954 = r8
                r12.f2955 = r4
                r12.f2956 = r1
                r12.f2957 = r2
                java.lang.Object r5 = r7.m9542(r5, r12)
                if (r5 != r0) goto L8f
                return r0
            L8f:
                r5 = r6
                r6 = r7
            L91:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L9c
            L98:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L9c:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L4c
            La1:
                v3.p r12 = v3.p.f11735
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.f4.b.mo3059(java.lang.Object):java.lang.Object");
        }

        @Override // e4.p
        /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo3058(k4.d<? super View> dVar, x3.c<? super v3.p> cVar) {
            return ((b) mo3057(dVar, cVar)).mo3059(v3.p.f11735);
        }
    }

    /* compiled from: ViewGroup.kt */
    public static final class c implements Iterator<View> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f2960;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f2961;

        c(ViewGroup viewGroup) {
            this.f2961 = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2960 < this.f2961.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f2961;
            int i5 = this.f2960 - 1;
            this.f2960 = i5;
            viewGroup.removeViewAt(i5);
        }

        @Override // java.util.Iterator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f2961;
            int i5 = this.f2960;
            this.f2960 = i5 + 1;
            View childAt = viewGroup.getChildAt(i5);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final k4.b<View> m3054(ViewGroup viewGroup) {
        f4.k.m8623(viewGroup, "<this>");
        return new a(viewGroup);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final k4.b<View> m3055(ViewGroup viewGroup) {
        f4.k.m8623(viewGroup, "<this>");
        return k4.f.m9547(new b(viewGroup, null));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final Iterator<View> m3056(ViewGroup viewGroup) {
        f4.k.m8623(viewGroup, "<this>");
        return new c(viewGroup);
    }
}
