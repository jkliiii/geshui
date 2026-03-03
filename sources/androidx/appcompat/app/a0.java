package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: LocaleOverlayHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a0 {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static androidx.core.os.i m498(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i5 = 0;
        while (i5 < iVar.m2425() + iVar2.m2425()) {
            Locale m2423 = i5 < iVar.m2425() ? iVar.m2423(i5) : iVar2.m2423(i5 - iVar.m2425());
            if (m2423 != null) {
                linkedHashSet.add(m2423);
            }
            i5++;
        }
        return androidx.core.os.i.m2418((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static androidx.core.os.i m499(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        return (iVar == null || iVar.m2424()) ? androidx.core.os.i.m2421() : m498(iVar, iVar2);
    }
}
