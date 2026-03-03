package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class s implements m {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LocaleList f2745;

    s(Object obj) {
        this.f2745 = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.f2745.equals(((m) obj).mo2437());
    }

    @Override // androidx.core.os.m
    public Locale get(int i5) {
        return this.f2745.get(i5);
    }

    public int hashCode() {
        return this.f2745.hashCode();
    }

    @Override // androidx.core.os.m
    public boolean isEmpty() {
        return this.f2745.isEmpty();
    }

    @Override // androidx.core.os.m
    public int size() {
        return this.f2745.size();
    }

    public String toString() {
        return this.f2745.toString();
    }

    @Override // androidx.core.os.m
    /* renamed from: ʻ */
    public String mo2436() {
        return this.f2745.toLanguageTags();
    }

    @Override // androidx.core.os.m
    /* renamed from: ʼ */
    public Object mo2437() {
        return this.f2745;
    }
}
