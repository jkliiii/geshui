package m2;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: Futures.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {
    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T, F> f<T> m9869(Iterable<F> iterable, w<T, F> wVar) {
        t tVar = new t();
        m9871(iterable.iterator(), wVar, tVar, null);
        return tVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static <T, F> f<T> m9870(F[] fArr, w<T, F> wVar) {
        return m9869(Arrays.asList(fArr), wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿ, reason: contains not printable characters */
    public static <T, F> void m9871(final Iterator<F> it, final w<T, F> wVar, final t<T> tVar, Exception e5) {
        while (it.hasNext()) {
            try {
                f<T> mo9877 = wVar.mo9877(it.next());
                tVar.getClass();
                mo9877.mo9863(new u() { // from class: m2.h
                    @Override // m2.u
                    /* renamed from: ʻ, reason: contains not printable characters */
                    public final void mo9866(Object obj) {
                        tVar.m9906(obj);
                    }
                }).mo9861(new d() { // from class: m2.i
                    @Override // m2.d
                    /* renamed from: ʻ */
                    public final void mo9859(Exception exc) {
                        j.m9871(it, wVar, tVar, exc);
                    }
                });
                return;
            } catch (Exception e6) {
                e5 = e6;
            }
        }
        if (e5 == null) {
            tVar.m9905(new Exception("empty list"));
        } else {
            tVar.m9905(e5);
        }
    }
}
