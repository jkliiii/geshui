package i1;

import java.util.Queue;

/* compiled from: ModelCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n<A, B> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final y1.h<b<A>, B> f8505;

    /* compiled from: ModelCache.java */
    class a extends y1.h<b<A>, B> {
        a(long j5) {
            super(j5);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // y1.h
        /* renamed from: י, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8674(b<A> bVar, B b6) {
            bVar.m9176();
        }
    }

    /* compiled from: ModelCache.java */
    static final class b<A> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private static final Queue<b<?>> f8507 = y1.l.m12900(0);

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f8508;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f8509;

        /* renamed from: ʽ, reason: contains not printable characters */
        private A f8510;

        private b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static <A> b<A> m9174(A a6, int i5, int i6) {
            b<A> bVar;
            Queue<b<?>> queue = f8507;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.m9175(a6, i5, i6);
            return bVar;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m9175(A a6, int i5, int i6) {
            this.f8510 = a6;
            this.f8509 = i5;
            this.f8508 = i6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8509 == bVar.f8509 && this.f8508 == bVar.f8508 && this.f8510.equals(bVar.f8510);
        }

        public int hashCode() {
            return (((this.f8508 * 31) + this.f8509) * 31) + this.f8510.hashCode();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m9176() {
            Queue<b<?>> queue = f8507;
            synchronized (queue) {
                queue.offer(this);
            }
        }
    }

    public n(long j5) {
        this.f8505 = new a(j5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public B m9171(A a6, int i5, int i6) {
        b<A> m9174 = b.m9174(a6, i5, i6);
        B m12882 = this.f8505.m12882(m9174);
        m9174.m9176();
        return m12882;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9172(A a6, int i5, int i6, B b6) {
        this.f8505.m12884(b.m9174(a6, i5, i6), b6);
    }
}
