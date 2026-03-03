package w3;

import java.util.List;

/* compiled from: AbstractList.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<E> extends w3.a<E> implements List<E> {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final a f12044 = new a(null);

    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m12504(int i5, int i6) {
            if (i5 < 0 || i5 >= i6) {
                throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m12505(int i5, int i6) {
            if (i5 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("index: " + i5 + ", size: " + i6);
            }
        }
    }
}
