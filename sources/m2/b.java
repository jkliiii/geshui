package m2;

import java.util.LinkedList;

/* compiled from: Continuation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends k implements l2.c, Runnable, m2.a {

    /* renamed from: ˊ, reason: contains not printable characters */
    l2.a f9107;

    /* renamed from: ˋ, reason: contains not printable characters */
    Runnable f9108;

    /* renamed from: ˎ, reason: contains not printable characters */
    LinkedList<l2.c> f9109;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f9110;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f9111;

    /* renamed from: י, reason: contains not printable characters */
    boolean f9112;

    /* compiled from: Continuation.java */
    class a implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f9113;

        a() {
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (this.f9113) {
                return;
            }
            this.f9113 = true;
            b.this.f9111 = false;
            if (exc == null) {
                b.this.m9852();
            } else {
                b.this.m9855(exc);
            }
        }
    }

    public b(l2.a aVar) {
        this(aVar, null);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private l2.c m9851(l2.c cVar) {
        if (cVar instanceof c) {
            ((c) cVar).mo9858(this);
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m9852() {
        if (this.f9110) {
            return;
        }
        while (this.f9109.size() > 0 && !this.f9111 && !isDone() && !isCancelled()) {
            l2.c remove = this.f9109.remove();
            try {
                try {
                    this.f9110 = true;
                    this.f9111 = true;
                    remove.mo9725(this, m9853());
                } catch (Exception e5) {
                    m9855(e5);
                }
            } finally {
                this.f9110 = false;
            }
        }
        if (this.f9111 || isDone() || isCancelled()) {
            return;
        }
        m9855(null);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private l2.a m9853() {
        return new a();
    }

    @Override // m2.k, m2.a
    public boolean cancel() {
        if (!super.cancel()) {
            return false;
        }
        Runnable runnable = this.f9108;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        m9857();
    }

    @Override // l2.c
    /* renamed from: ʼ */
    public void mo9725(b bVar, l2.a aVar) throws Exception {
        m9856(aVar);
        m9857();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public b m9854(l2.c cVar) {
        this.f9109.add(m9851(cVar));
        return this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m9855(Exception exc) {
        l2.a aVar;
        if (mo9875() && (aVar = this.f9107) != null) {
            aVar.mo9412(exc);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m9856(l2.a aVar) {
        this.f9107 = aVar;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public b m9857() {
        if (this.f9112) {
            throw new IllegalStateException("already started");
        }
        this.f9112 = true;
        m9852();
        return this;
    }

    public b(l2.a aVar, Runnable runnable) {
        this.f9109 = new LinkedList<>();
        this.f9108 = runnable;
        this.f9107 = aVar;
    }
}
