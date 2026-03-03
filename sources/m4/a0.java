package m4;

/* compiled from: DispatchedTask.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a0<T> extends r4.c {

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f9330;

    public a0(int i5) {
        this.f9330 = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: all -> 0x00b5, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x00b5, blocks: (B:3:0x0002, B:5:0x001e, B:18:0x0082, B:28:0x0088, B:36:0x00ab, B:38:0x00b4, B:39:0x00b1, B:7:0x0024, B:9:0x0032, B:11:0x003a, B:13:0x0046, B:15:0x004c, B:16:0x007e, B:31:0x0063, B:32:0x0071), top: B:2:0x0002, inners: #3 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r10 = this;
            r4.d r0 = r10.f10851
            x3.c r1 = r10.mo10114()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            f4.k.m8621(r1, r2)     // Catch: java.lang.Throwable -> Lb5
            q4.f r1 = (q4.f) r1     // Catch: java.lang.Throwable -> Lb5
            x3.c<T> r2 = r1.f10632     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r1.f10634     // Catch: java.lang.Throwable -> Lb5
            x3.e r3 = r2.getContext()     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = q4.s.m11537(r3, r1)     // Catch: java.lang.Throwable -> Lb5
            q4.o r4 = q4.s.f10656     // Catch: java.lang.Throwable -> Lb5
            r5 = 0
            if (r1 == r4) goto L23
            m4.a1 r4 = m4.s.m10208(r2, r3, r1)     // Catch: java.lang.Throwable -> Lb5
            goto L24
        L23:
            r4 = r5
        L24:
            x3.e r6 = r2.getContext()     // Catch: java.lang.Throwable -> La8
            java.lang.Object r7 = r10.mo10118()     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable r8 = r10.mo10115(r7)     // Catch: java.lang.Throwable -> La8
            if (r8 != 0) goto L43
            int r9 = r10.f9330     // Catch: java.lang.Throwable -> La8
            boolean r9 = m4.b0.m10122(r9)     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto L43
            m4.o0$b r9 = m4.o0.f9367     // Catch: java.lang.Throwable -> La8
            x3.e$a r6 = r6.mo10126(r9)     // Catch: java.lang.Throwable -> La8
            m4.o0 r6 = (m4.o0) r6     // Catch: java.lang.Throwable -> La8
            goto L44
        L43:
            r6 = r5
        L44:
            if (r6 == 0) goto L61
            boolean r9 = r6.mo10105()     // Catch: java.lang.Throwable -> La8
            if (r9 != 0) goto L61
            java.util.concurrent.CancellationException r6 = r6.mo10195()     // Catch: java.lang.Throwable -> La8
            r10.mo10113(r7, r6)     // Catch: java.lang.Throwable -> La8
            v3.j$a r7 = v3.j.f11729     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = v3.k.m12382(r6)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = v3.j.m12380(r6)     // Catch: java.lang.Throwable -> La8
            r2.mo9541(r6)     // Catch: java.lang.Throwable -> La8
            goto L7e
        L61:
            if (r8 == 0) goto L71
            v3.j$a r6 = v3.j.f11729     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = v3.k.m12382(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = v3.j.m12380(r6)     // Catch: java.lang.Throwable -> La8
            r2.mo9541(r6)     // Catch: java.lang.Throwable -> La8
            goto L7e
        L71:
            v3.j$a r6 = v3.j.f11729     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = r10.mo10116(r7)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r6 = v3.j.m12380(r6)     // Catch: java.lang.Throwable -> La8
            r2.mo9541(r6)     // Catch: java.lang.Throwable -> La8
        L7e:
            v3.p r2 = v3.p.f11735     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L88
            boolean r2 = r4.m10119()     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L8b
        L88:
            q4.s.m11535(r3, r1)     // Catch: java.lang.Throwable -> Lb5
        L8b:
            r0.mo11692()     // Catch: java.lang.Throwable -> L95
            v3.p r0 = v3.p.f11735     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = v3.j.m12380(r0)     // Catch: java.lang.Throwable -> L95
            goto La0
        L95:
            r0 = move-exception
            v3.j$a r1 = v3.j.f11729
            java.lang.Object r0 = v3.k.m12382(r0)
            java.lang.Object r0 = v3.j.m12380(r0)
        La0:
            java.lang.Throwable r0 = v3.j.m12381(r0)
            r10.m10117(r5, r0)
            goto Ld4
        La8:
            r2 = move-exception
            if (r4 == 0) goto Lb1
            boolean r4 = r4.m10119()     // Catch: java.lang.Throwable -> Lb5
            if (r4 == 0) goto Lb4
        Lb1:
            q4.s.m11535(r3, r1)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            throw r2     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r1 = move-exception
            v3.j$a r2 = v3.j.f11729     // Catch: java.lang.Throwable -> Lc2
            r0.mo11692()     // Catch: java.lang.Throwable -> Lc2
            v3.p r0 = v3.p.f11735     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = v3.j.m12380(r0)     // Catch: java.lang.Throwable -> Lc2
            goto Lcd
        Lc2:
            r0 = move-exception
            v3.j$a r2 = v3.j.f11729
            java.lang.Object r0 = v3.k.m12382(r0)
            java.lang.Object r0 = v3.j.m12380(r0)
        Lcd:
            java.lang.Throwable r0 = v3.j.m12381(r0)
            r10.m10117(r1, r0)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a0.run():void");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract x3.c<T> mo10114();

    /* renamed from: ʽ, reason: contains not printable characters */
    public Throwable mo10115(Object obj) {
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null) {
            return nVar.f9363;
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m10117(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            v3.b.m12373(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        f4.k.m8620(th);
        v.m10277(mo10114().getContext(), new w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public abstract Object mo10118();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿ, reason: contains not printable characters */
    public <T> T mo10116(Object obj) {
        return obj;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo10113(Object obj, Throwable th) {
    }
}
