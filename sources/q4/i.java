package q4;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Object f10637 = new o("CONDITION_FALSE");

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Object m11491() {
        return f10637;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final j m11492(Object obj) {
        j jVar;
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null && (jVar = mVar.f10652) != null) {
            return jVar;
        }
        f4.k.m8621(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) obj;
    }
}
