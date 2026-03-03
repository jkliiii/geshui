package k2;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;

/* compiled from: PushParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b0 implements l2.d {

    /* renamed from: י, reason: contains not printable characters */
    static Hashtable<Class, Method> f8693 = new Hashtable<>();

    /* renamed from: ˊ, reason: contains not printable characters */
    s f8702;

    /* renamed from: ʻ, reason: contains not printable characters */
    private l f8694 = new a(0);

    /* renamed from: ʼ, reason: contains not printable characters */
    private l f8695 = new b(1);

    /* renamed from: ʽ, reason: contains not printable characters */
    private l f8696 = new c(2);

    /* renamed from: ʾ, reason: contains not printable characters */
    private l f8697 = new d(4);

    /* renamed from: ʿ, reason: contains not printable characters */
    private l f8698 = new e(8);

    /* renamed from: ˆ, reason: contains not printable characters */
    private j<byte[]> f8699 = new f();

    /* renamed from: ˈ, reason: contains not printable characters */
    private j<q> f8700 = new g();

    /* renamed from: ˉ, reason: contains not printable characters */
    private j<byte[]> f8701 = new h();

    /* renamed from: ˋ, reason: contains not printable characters */
    private LinkedList<l> f8703 = new LinkedList<>();

    /* renamed from: ˎ, reason: contains not printable characters */
    private ArrayList<Object> f8704 = new ArrayList<>();

    /* renamed from: ˏ, reason: contains not printable characters */
    ByteOrder f8705 = ByteOrder.BIG_ENDIAN;

    /* renamed from: ˑ, reason: contains not printable characters */
    q f8706 = new q();

    /* compiled from: PushParser.java */
    class a extends l {
        a(int i5) {
            super(i5);
        }

        @Override // k2.b0.l
        /* renamed from: ʻ, reason: contains not printable characters */
        public l mo9383(s sVar, q qVar) {
            b0.this.f8704.add(null);
            return null;
        }
    }

    /* compiled from: PushParser.java */
    class b extends l {
        b(int i5) {
            super(i5);
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            b0.this.f8704.add(Byte.valueOf(qVar.m9488()));
            return null;
        }
    }

    /* compiled from: PushParser.java */
    class c extends l {
        c(int i5) {
            super(i5);
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            b0.this.f8704.add(Short.valueOf(qVar.m9498()));
            return null;
        }
    }

    /* compiled from: PushParser.java */
    class d extends l {
        d(int i5) {
            super(i5);
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            b0.this.f8704.add(Integer.valueOf(qVar.m9496()));
            return null;
        }
    }

    /* compiled from: PushParser.java */
    class e extends l {
        e(int i5) {
            super(i5);
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            b0.this.f8704.add(Long.valueOf(qVar.m9497()));
            return null;
        }
    }

    /* compiled from: PushParser.java */
    class f implements j<byte[]> {
        f() {
        }

        @Override // k2.b0.j
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9384(byte[] bArr) {
            b0.this.f8704.add(bArr);
        }
    }

    /* compiled from: PushParser.java */
    class g implements j<q> {
        g() {
        }

        @Override // k2.b0.j
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9384(q qVar) {
            b0.this.f8704.add(qVar);
        }
    }

    /* compiled from: PushParser.java */
    class h implements j<byte[]> {
        h() {
        }

        @Override // k2.b0.j
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9384(byte[] bArr) {
            b0.this.f8704.add(new String(bArr));
        }
    }

    /* compiled from: PushParser.java */
    static class i extends l {

        /* renamed from: ʼ, reason: contains not printable characters */
        j<byte[]> f8715;

        public i(int i5, j<byte[]> jVar) {
            super(i5);
            if (i5 <= 0) {
                throw new IllegalArgumentException("length should be > 0");
            }
            this.f8715 = jVar;
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            byte[] bArr = new byte[this.f8718];
            qVar.m9491(bArr);
            this.f8715.mo9384(bArr);
            return null;
        }
    }

    /* compiled from: PushParser.java */
    public interface j<T> {
        /* renamed from: ʻ */
        void mo9384(T t5);
    }

    /* compiled from: PushParser.java */
    static class k extends l {

        /* renamed from: ʼ, reason: contains not printable characters */
        byte f8716;

        /* renamed from: ʽ, reason: contains not printable characters */
        l2.d f8717;

        public k(byte b6, l2.d dVar) {
            super(1);
            this.f8716 = b6;
            this.f8717 = dVar;
        }

        @Override // k2.b0.l
        /* renamed from: ʻ */
        public l mo9383(s sVar, q qVar) {
            q qVar2 = new q();
            boolean z5 = true;
            while (true) {
                if (qVar.m9484() <= 0) {
                    break;
                }
                ByteBuffer m9502 = qVar.m9502();
                m9502.mark();
                int i5 = 0;
                while (m9502.remaining() > 0) {
                    z5 = m9502.get() == this.f8716;
                    if (z5) {
                        break;
                    }
                    i5++;
                }
                m9502.reset();
                if (z5) {
                    qVar.m9486(m9502);
                    qVar.m9490(qVar2, i5);
                    qVar.m9488();
                    break;
                }
                qVar2.m9483(m9502);
            }
            this.f8717.mo9377(sVar, qVar2);
            if (z5) {
                return null;
            }
            return this;
        }
    }

    /* compiled from: PushParser.java */
    static abstract class l {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f8718;

        public l(int i5) {
            this.f8718 = i5;
        }

        /* renamed from: ʻ */
        public abstract l mo9383(s sVar, q qVar);
    }

    public b0(s sVar) {
        this.f8702 = sVar;
        sVar.mo9362(this);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public b0 m9381(int i5, j<byte[]> jVar) {
        this.f8703.add(new i(i5, jVar));
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public b0 m9382(byte b6, l2.d dVar) {
        this.f8703.add(new k(b6, dVar));
        return this;
    }

    @Override // l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        qVar.m9489(this.f8706);
        while (this.f8703.size() > 0 && this.f8706.m9500() >= this.f8703.peek().f8718) {
            this.f8706.m9503(this.f8705);
            l mo9383 = this.f8703.poll().mo9383(sVar, this.f8706);
            if (mo9383 != null) {
                this.f8703.addFirst(mo9383);
            }
        }
        if (this.f8703.size() == 0) {
            this.f8706.m9489(qVar);
        }
    }
}
