package com.bumptech.glide;

import com.bumptech.glide.m;

/* compiled from: TransitionOptions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private w1.c<? super TranscodeType> f5242 = w1.a.m12501();

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return y1.l.m12898(this.f5242, ((m) obj).f5242);
        }
        return false;
    }

    public int hashCode() {
        w1.c<? super TranscodeType> cVar = this.f5242;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final w1.c<? super TranscodeType> m6171() {
        return this.f5242;
    }
}
