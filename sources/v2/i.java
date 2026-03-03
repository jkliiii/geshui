package v2;

import java.util.ArrayList;

/* compiled from: TaggedList.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i<T> extends ArrayList<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private Object f11725;

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized <V> V m12366() {
        return (V) this.f11725;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized <V> void m12367(V v5) {
        this.f11725 = v5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized <V> void m12368(V v5) {
        if (this.f11725 == null) {
            this.f11725 = v5;
        }
    }
}
