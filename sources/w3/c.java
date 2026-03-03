package w3;

import java.util.AbstractList;
import java.util.List;

/* compiled from: AbstractMutableList.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c<E> extends AbstractList<E> implements List<E> {
    protected c() {
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i5) {
        return mo12511(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo12510();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract int mo12510();

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract E mo12511(int i5);
}
