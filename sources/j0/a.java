package j0;

import f4.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CreationExtras.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<b<?>, Object> f8609 = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    /* renamed from: j0.a$a, reason: collision with other inner class name */
    public static final class C0121a extends a {

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final C0121a f8610 = new C0121a();

        private C0121a() {
        }

        @Override // j0.a
        /* renamed from: ʻ */
        public <T> T mo9275(b<T> bVar) {
            k.m8623(bVar, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    public interface b<T> {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract <T> T mo9275(b<T> bVar);

    /* renamed from: ʼ, reason: contains not printable characters */
    public final Map<b<?>, Object> m9276() {
        return this.f8609;
    }
}
