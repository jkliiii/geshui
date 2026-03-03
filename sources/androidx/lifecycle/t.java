package androidx.lifecycle;

/* compiled from: LiveData.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class t<T> {

    /* renamed from: ˎ, reason: contains not printable characters */
    static final Object f3875 = new Object();

    /* renamed from: ʻ, reason: contains not printable characters */
    final Object f3876 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private j.b<w<? super T>, t<T>.d> f3877 = new j.b<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    int f3878 = 0;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f3879;

    /* renamed from: ʿ, reason: contains not printable characters */
    private volatile Object f3880;

    /* renamed from: ˆ, reason: contains not printable characters */
    volatile Object f3881;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f3882;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f3883;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f3884;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Runnable f3885;

    /* compiled from: LiveData.java */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (t.this.f3876) {
                obj = t.this.f3881;
                t.this.f3881 = t.f3875;
            }
            t.this.mo4511(obj);
        }
    }

    /* compiled from: LiveData.java */
    private class b extends t<T>.d {
        b(w<? super T> wVar) {
            super(wVar);
        }

        @Override // androidx.lifecycle.t.d
        /* renamed from: ˈ, reason: contains not printable characters */
        boolean mo4512() {
            return true;
        }
    }

    /* compiled from: LiveData.java */
    class c extends t<T>.d implements n {
    }

    public t() {
        Object obj = f3875;
        this.f3881 = obj;
        this.f3885 = new a();
        this.f3880 = obj;
        this.f3882 = -1;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m4503(String str) {
        if (i.c.m9104().mo9108()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m4504(t<T>.d dVar) {
        if (dVar.f3889) {
            if (!dVar.mo4512()) {
                dVar.m4513(false);
                return;
            }
            int i5 = dVar.f3890;
            int i6 = this.f3882;
            if (i5 >= i6) {
                return;
            }
            dVar.f3890 = i6;
            dVar.f3888.mo4005((Object) this.f3880);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m4505(int i5) {
        int i6 = this.f3878;
        this.f3878 = i5 + i6;
        if (this.f3879) {
            return;
        }
        this.f3879 = true;
        while (true) {
            try {
                int i7 = this.f3878;
                if (i6 == i7) {
                    return;
                }
                boolean z5 = i6 == 0 && i7 > 0;
                boolean z6 = i6 > 0 && i7 == 0;
                if (z5) {
                    mo4508();
                } else if (z6) {
                    mo4509();
                }
                i6 = i7;
            } finally {
                this.f3879 = false;
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m4506(t<T>.d dVar) {
        if (this.f3883) {
            this.f3884 = true;
            return;
        }
        this.f3883 = true;
        do {
            this.f3884 = false;
            if (dVar != null) {
                m4504(dVar);
                dVar = null;
            } else {
                j.b<w<? super T>, t<T>.d>.d m9266 = this.f3877.m9266();
                while (m9266.hasNext()) {
                    m4504((d) m9266.next().getValue());
                    if (this.f3884) {
                        break;
                    }
                }
            }
        } while (this.f3884);
        this.f3883 = false;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m4507(w<? super T> wVar) {
        m4503("observeForever");
        b bVar = new b(wVar);
        t<T>.d mo9262 = this.f3877.mo9262(wVar, bVar);
        if (mo9262 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (mo9262 != null) {
            return;
        }
        bVar.m4513(true);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo4510(w<? super T> wVar) {
        m4503("removeObserver");
        t<T>.d mo9263 = this.f3877.mo9263(wVar);
        if (mo9263 == null) {
            return;
        }
        mo9263.m4514();
        mo9263.m4513(false);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void mo4511(T t5) {
        m4503("setValue");
        this.f3882++;
        this.f3880 = t5;
        m4506(null);
    }

    /* compiled from: LiveData.java */
    private abstract class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final w<? super T> f3888;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f3889;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f3890 = -1;

        d(w<? super T> wVar) {
            this.f3888 = wVar;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m4513(boolean z5) {
            if (z5 == this.f3889) {
                return;
            }
            this.f3889 = z5;
            t.this.m4505(z5 ? 1 : -1);
            if (this.f3889) {
                t.this.m4506(this);
            }
        }

        /* renamed from: ˈ */
        abstract boolean mo4512();

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4514() {
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected void mo4508() {
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    protected void mo4509() {
    }
}
