package k4;

import e4.p;
import f4.k;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequenceBuilder.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements b<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ p f8898;

        public a(p pVar) {
            this.f8898 = pVar;
        }

        @Override // k4.b
        public Iterator<T> iterator() {
            return f.m9546(this.f8898);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final <T> Iterator<T> m9546(p<? super d<? super T>, ? super x3.c<? super v3.p>, ? extends Object> pVar) {
        k.m8623(pVar, "block");
        c cVar = new c();
        cVar.m9540(y3.c.m12936(pVar, cVar, cVar));
        return cVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static <T> b<T> m9547(p<? super d<? super T>, ? super x3.c<? super v3.p>, ? extends Object> pVar) {
        k.m8623(pVar, "block");
        return new a(pVar);
    }
}
