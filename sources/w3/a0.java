package w3;

import java.util.Iterator;

/* compiled from: PrimitiveIterators.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a0 implements Iterator<Integer> {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
