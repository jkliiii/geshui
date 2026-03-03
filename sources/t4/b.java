package t4;

/* compiled from: NamedRunnable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b implements Runnable {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final String f11322;

    public b(String str, Object... objArr) {
        this.f11322 = c.m12072(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f11322);
        try {
            mo12000();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    /* renamed from: ˎ */
    protected abstract void mo12000();
}
