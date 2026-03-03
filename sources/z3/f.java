package z3;

import f4.k;
import java.lang.reflect.Field;

/* compiled from: DebugMetadata.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static final void m13188(int i5, int i6) {
        if (i6 <= i5) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i5 + ", got " + i6 + ". Please update the Kotlin standard library.").toString());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final e m13189(a aVar) {
        return (e) aVar.getClass().getAnnotation(e.class);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final int m13190(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final StackTraceElement m13191(a aVar) {
        String str;
        k.m8623(aVar, "<this>");
        e m13189 = m13189(aVar);
        if (m13189 == null) {
            return null;
        }
        m13188(1, m13189.v());
        int m13190 = m13190(aVar);
        int i5 = m13190 < 0 ? -1 : m13189.l()[m13190];
        String m13196 = h.f12798.m13196(aVar);
        if (m13196 == null) {
            str = m13189.c();
        } else {
            str = m13196 + '/' + m13189.c();
        }
        return new StackTraceElement(str, m13189.m(), m13189.f(), i5);
    }
}
