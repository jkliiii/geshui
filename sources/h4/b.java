package h4;

import f4.k;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends g4.a {
    @Override // g4.a
    /* renamed from: ʽ */
    public Random mo8751() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        k.m8622(current, "current()");
        return current;
    }
}
