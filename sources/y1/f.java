package y1;

/* compiled from: GlideSuppliers.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: GlideSuppliers.java */
    class a<T> implements b<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private volatile T f12449;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ b f12450;

        a(b bVar) {
            this.f12450 = bVar;
        }

        @Override // y1.f.b
        public T get() {
            if (this.f12449 == null) {
                synchronized (this) {
                    if (this.f12449 == null) {
                        this.f12449 = (T) k.m12893(this.f12450.get());
                    }
                }
            }
            return this.f12449;
        }
    }

    /* compiled from: GlideSuppliers.java */
    public interface b<T> {
        T get();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static <T> b<T> m12877(b<T> bVar) {
        return new a(bVar);
    }
}
