package d;

import android.content.Context;
import android.content.Intent;
import f4.k;

/* compiled from: ActivityResultContract.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0098a<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final T f6823;

        public C0098a(T t5) {
            this.f6823 = t5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final T m8148() {
            return this.f6823;
        }
    }

    /* renamed from: ʻ */
    public abstract Intent mo4263(Context context, I i5);

    /* renamed from: ʼ, reason: contains not printable characters */
    public C0098a<O> mo8147(Context context, I i5) {
        k.m8623(context, "context");
        return null;
    }

    /* renamed from: ʽ */
    public abstract O mo4264(int i5, Intent intent);
}
