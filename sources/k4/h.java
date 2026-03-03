package k4;

import f4.k;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements b<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Iterator f8899;

        public a(Iterator it) {
            this.f8899 = it;
        }

        @Override // k4.b
        public Iterator<T> iterator() {
            return this.f8899;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T> b<T> m9548(Iterator<? extends T> it) {
        k.m8623(it, "<this>");
        return m9549(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static final <T> b<T> m9549(b<? extends T> bVar) {
        k.m8623(bVar, "<this>");
        return bVar instanceof k4.a ? bVar : new k4.a(bVar);
    }
}
