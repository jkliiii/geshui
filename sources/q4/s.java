package q4;

import m4.y0;
import x3.e;

/* compiled from: ThreadContext.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final o f10656 = new o("NO_THREAD_ELEMENTS");

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final e4.p<Object, e.a, Object> f10657 = a.f10660;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final e4.p<y0<?>, e.a, y0<?>> f10658 = b.f10661;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final e4.p<w, e.a, w> f10659 = c.f10662;

    /* compiled from: ThreadContext.kt */
    static final class a extends f4.l implements e4.p<Object, e.a, Object> {

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final a f10660 = new a();

        a() {
            super(2);
        }

        @Override // e4.p
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo3058(Object obj, e.a aVar) {
            if (!(aVar instanceof y0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? aVar : Integer.valueOf(intValue + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class b extends f4.l implements e4.p<y0<?>, e.a, y0<?>> {

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final b f10661 = new b();

        b() {
            super(2);
        }

        @Override // e4.p
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final y0<?> mo3058(y0<?> y0Var, e.a aVar) {
            if (y0Var != null) {
                return y0Var;
            }
            if (aVar instanceof y0) {
                return (y0) aVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    static final class c extends f4.l implements e4.p<w, e.a, w> {

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final c f10662 = new c();

        c() {
            super(2);
        }

        @Override // e4.p
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final w mo3058(w wVar, e.a aVar) {
            if (aVar instanceof y0) {
                y0<?> y0Var = (y0) aVar;
                wVar.m11555(y0Var, y0Var.m10288(wVar.f10665));
            }
            return wVar;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m11535(x3.e eVar, Object obj) {
        if (obj == f10656) {
            return;
        }
        if (obj instanceof w) {
            ((w) obj).m11556(eVar);
            return;
        }
        Object mo10127 = eVar.mo10127(null, f10658);
        f4.k.m8621(mo10127, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((y0) mo10127).m10289(eVar, obj);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final Object m11536(x3.e eVar) {
        Object mo10127 = eVar.mo10127(0, f10657);
        f4.k.m8620(mo10127);
        return mo10127;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final Object m11537(x3.e eVar, Object obj) {
        if (obj == null) {
            obj = m11536(eVar);
        }
        if (obj == 0) {
            return f10656;
        }
        if (obj instanceof Integer) {
            return eVar.mo10127(new w(eVar, ((Number) obj).intValue()), f10659);
        }
        f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((y0) obj).m10288(eVar);
    }
}
