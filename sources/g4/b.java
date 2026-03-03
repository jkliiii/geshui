package g4;

import f4.k;
import java.util.Random;

/* compiled from: PlatformRandom.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends g4.a {

    /* renamed from: ˆ, reason: contains not printable characters */
    private final a f8102 = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // g4.a
    /* renamed from: ʽ */
    public Random mo8751() {
        Random random = this.f8102.get();
        k.m8622(random, "implStorage.get()");
        return random;
    }
}
