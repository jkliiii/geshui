package androidx.loader.app;

import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a {
    /* renamed from: ʼ, reason: contains not printable characters */
    public static <T extends p & s0> a m4518(T t5) {
        return new b(t5, t5.getViewModelStore());
    }

    @Deprecated
    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract void mo4519(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: ʽ, reason: contains not printable characters */
    public abstract void mo4520();
}
