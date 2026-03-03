package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class n0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<String, Object> f3844 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Set<Closeable> f3845 = new LinkedHashSet();

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile boolean f3846 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m4461(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final void m4462() {
        this.f3846 = true;
        Map<String, Object> map = this.f3844;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f3844.values().iterator();
                while (it.hasNext()) {
                    m4461(it.next());
                }
            }
        }
        Set<Closeable> set = this.f3845;
        if (set != null) {
            synchronized (set) {
                Iterator<Closeable> it2 = this.f3845.iterator();
                while (it2.hasNext()) {
                    m4461(it2.next());
                }
            }
            this.f3845.clear();
        }
        mo4275();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    <T> T m4463(String str) {
        T t5;
        Map<String, Object> map = this.f3844;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t5 = (T) this.f3844.get(str);
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿ, reason: contains not printable characters */
    <T> T m4464(String str, T t5) {
        Object obj;
        synchronized (this.f3844) {
            obj = this.f3844.get(str);
            if (obj == 0) {
                this.f3844.put(str, t5);
            }
        }
        if (obj != 0) {
            t5 = obj;
        }
        if (this.f3846) {
            m4461(t5);
        }
        return t5;
    }

    /* renamed from: ʾ */
    protected void mo4275() {
    }
}
