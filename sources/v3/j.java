package v3;

import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j<T> implements Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final a f11729 = new a(null);

    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    public static final class b implements Serializable {

        /* renamed from: ʾ, reason: contains not printable characters */
        public final Throwable f11730;

        public b(Throwable th) {
            f4.k.m8623(th, "exception");
            this.f11730 = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && f4.k.m8619(this.f11730, ((b) obj).f11730);
        }

        public int hashCode() {
            return this.f11730.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f11730 + ')';
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final Throwable m12381(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f11730;
        }
        return null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static <T> Object m12380(Object obj) {
        return obj;
    }
}
