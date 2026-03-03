package b2;

import android.util.Property;

/* compiled from: FloatProperty.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<T> extends Property<T, Float> {
    public b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void set(T t5, Float f5) {
        mo5687(t5, f5.floatValue());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo5687(T t5, float f5);
}
