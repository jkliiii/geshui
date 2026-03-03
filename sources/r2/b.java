package r2;

import k2.f0;
import k2.q;
import k2.s;
import k2.x;

/* compiled from: ChunkedInputFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends x {

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f10818 = 0;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f10819 = 0;

    /* renamed from: ˋ, reason: contains not printable characters */
    private EnumC0156b f10820 = EnumC0156b.CHUNK_LEN;

    /* renamed from: ˎ, reason: contains not printable characters */
    q f10821 = new q();

    /* compiled from: ChunkedInputFilter.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10822;

        static {
            int[] iArr = new int[EnumC0156b.values().length];
            f10822 = iArr;
            try {
                iArr[EnumC0156b.CHUNK_LEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10822[EnumC0156b.CHUNK_LEN_CR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10822[EnumC0156b.CHUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10822[EnumC0156b.CHUNK_CR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10822[EnumC0156b.CHUNK_CRLF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10822[EnumC0156b.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ChunkedInputFilter.java */
    /* renamed from: r2.b$b, reason: collision with other inner class name */
    private enum EnumC0156b {
        CHUNK_LEN,
        CHUNK_LEN_CR,
        CHUNK_LEN_CRLF,
        CHUNK,
        CHUNK_CR,
        CHUNK_CRLF,
        COMPLETE,
        ERROR
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean m11680(char c6, char c7) {
        if (c6 == c7) {
            return true;
        }
        this.f10820 = EnumC0156b.ERROR;
        mo9511(new r2.a(c7 + " was expected, got " + c6));
        return false;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean m11681(char c6) {
        return m11680(c6, '\n');
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean m11682(char c6) {
        return m11680(c6, '\r');
    }

    @Override // k2.t
    /* renamed from: ʿʿ */
    protected void mo9511(Exception exc) {
        if (exc == null && this.f10820 != EnumC0156b.COMPLETE) {
            exc = new r2.a("chunked input ended before final chunk");
        }
        super.mo9511(exc);
    }

    @Override // k2.x, l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        if (this.f10820 == EnumC0156b.ERROR) {
            qVar.m9507();
            return;
        }
        while (qVar.m9500() > 0) {
            try {
                switch (a.f10822[this.f10820.ordinal()]) {
                    case 1:
                        char m9495 = qVar.m9495();
                        if (m9495 == '\r') {
                            this.f10820 = EnumC0156b.CHUNK_LEN_CR;
                        } else {
                            int i5 = this.f10818 * 16;
                            this.f10818 = i5;
                            if (m9495 >= 'a' && m9495 <= 'f') {
                                this.f10818 = i5 + (m9495 - 'a') + 10;
                            } else if (m9495 >= '0' && m9495 <= '9') {
                                this.f10818 = i5 + (m9495 - '0');
                            } else {
                                if (m9495 < 'A' || m9495 > 'F') {
                                    mo9511(new r2.a("invalid chunk length: " + m9495));
                                    return;
                                }
                                this.f10818 = i5 + (m9495 - 'A') + 10;
                            }
                        }
                        this.f10819 = this.f10818;
                        continue;
                        break;
                    case 2:
                        if (m11681(qVar.m9495())) {
                            this.f10820 = EnumC0156b.CHUNK;
                            continue;
                        } else {
                            return;
                        }
                    case 3:
                        int min = Math.min(this.f10819, qVar.m9500());
                        int i6 = this.f10819 - min;
                        this.f10819 = i6;
                        if (i6 == 0) {
                            this.f10820 = EnumC0156b.CHUNK_CR;
                        }
                        if (min != 0) {
                            qVar.m9490(this.f10821, min);
                            f0.m9422(this, this.f10821);
                            continue;
                        }
                    case 4:
                        if (m11682(qVar.m9495())) {
                            this.f10820 = EnumC0156b.CHUNK_CRLF;
                            continue;
                        } else {
                            return;
                        }
                    case 5:
                        if (m11681(qVar.m9495())) {
                            if (this.f10818 > 0) {
                                this.f10820 = EnumC0156b.CHUNK_LEN;
                            } else {
                                this.f10820 = EnumC0156b.COMPLETE;
                                mo9511(null);
                            }
                            this.f10818 = 0;
                            continue;
                        } else {
                            return;
                        }
                    case 6:
                        return;
                    default:
                        continue;
                }
            } catch (Exception e5) {
                mo9511(e5);
                return;
            }
            mo9511(e5);
            return;
        }
    }
}
