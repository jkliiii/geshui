package b2;

import android.util.Property;

/* compiled from: IntProperty.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c<T> extends Property<T, Integer> {
    public c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void set(T t5, Integer num) {
        mo5689(t5, num.intValue());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo5689(T t5, int i5);
}
