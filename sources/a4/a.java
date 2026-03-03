package a4;

import f4.k;
import java.lang.reflect.Method;

/* compiled from: PlatformImplementations.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* compiled from: PlatformImplementations.kt */
    /* renamed from: a4.a$a, reason: collision with other inner class name */
    private static final class C0007a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final C0007a f118 = new C0007a();

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final Method f119;

        /* renamed from: ʽ, reason: contains not printable characters */
        public static final Method f120;

        /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
        static {
            /*
                a4.a$a r0 = new a4.a$a
                r0.<init>()
                a4.a.C0007a.f118 = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                f4.k.m8622(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = f4.k.m8619(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                f4.k.m8622(r7, r8)
                java.lang.Object r7 = w3.f.m12534(r7)
                boolean r7 = f4.k.m8619(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = 0
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                a4.a.C0007a.f119 = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = f4.k.m8619(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                a4.a.C0007a.f120 = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.a.C0007a.<clinit>():void");
        }

        private C0007a() {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo199(Throwable th, Throwable th2) {
        k.m8623(th, "cause");
        k.m8623(th2, "exception");
        Method method = C0007a.f119;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public g4.c mo200() {
        return new g4.b();
    }
}
