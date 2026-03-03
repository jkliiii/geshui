package c5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: Okio.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final Logger f5030 = Logger.getLogger(l.class.getName());

    /* compiled from: Okio.java */
    final class a implements r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ t f5031;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ OutputStream f5032;

        a(t tVar, OutputStream outputStream) {
            this.f5031 = tVar;
            this.f5032 = outputStream;
        }

        @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5032.close();
        }

        @Override // c5.r, java.io.Flushable
        public void flush() throws IOException {
            this.f5032.flush();
        }

        public String toString() {
            return "sink(" + this.f5032 + ")";
        }

        @Override // c5.r
        /* renamed from: ʼ */
        public t mo5866() {
            return this.f5031;
        }

        @Override // c5.r
        /* renamed from: ˈ */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            u.m5978(cVar.f5011, 0L, j5);
            while (j5 > 0) {
                this.f5031.mo5943();
                o oVar = cVar.f5010;
                int min = (int) Math.min(j5, oVar.f5045 - oVar.f5044);
                this.f5032.write(oVar.f5043, oVar.f5044, min);
                int i5 = oVar.f5044 + min;
                oVar.f5044 = i5;
                long j6 = min;
                j5 -= j6;
                cVar.f5011 -= j6;
                if (i5 == oVar.f5045) {
                    cVar.f5010 = oVar.m5967();
                    p.m5972(oVar);
                }
            }
        }
    }

    /* compiled from: Okio.java */
    final class b implements s {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ t f5033;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ InputStream f5034;

        b(t tVar, InputStream inputStream) {
            this.f5033 = tVar;
            this.f5034 = inputStream;
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f5034.close();
        }

        public String toString() {
            return "source(" + this.f5034 + ")";
        }

        @Override // c5.s
        /* renamed from: ʼ */
        public t mo5868() {
            return this.f5033;
        }

        @Override // c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            if (j5 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j5);
            }
            if (j5 == 0) {
                return 0L;
            }
            try {
                this.f5033.mo5943();
                o m5882 = cVar.m5882(1);
                int read = this.f5034.read(m5882.f5043, m5882.f5045, (int) Math.min(j5, 8192 - m5882.f5045));
                if (read == -1) {
                    return -1L;
                }
                m5882.f5045 += read;
                long j6 = read;
                cVar.f5011 += j6;
                return j6;
            } catch (AssertionError e5) {
                if (l.m5955(e5)) {
                    throw new IOException(e5);
                }
                throw e5;
            }
        }
    }

    /* compiled from: Okio.java */
    final class c extends c5.a {

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ Socket f5035;

        c(Socket socket) {
            this.f5035 = socket;
        }

        @Override // c5.a
        /* renamed from: ـ */
        protected IOException mo5862(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // c5.a
        /* renamed from: ᵔ */
        protected void mo5865() {
            try {
                this.f5035.close();
            } catch (AssertionError e5) {
                if (!l.m5955(e5)) {
                    throw e5;
                }
                l.f5030.log(Level.WARNING, "Failed to close timed out socket " + this.f5035, (Throwable) e5);
            } catch (Exception e6) {
                l.f5030.log(Level.WARNING, "Failed to close timed out socket " + this.f5035, (Throwable) e6);
            }
        }
    }

    private l() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static d m5953(r rVar) {
        return new m(rVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static e m5954(s sVar) {
        return new n(sVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean m5955(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static r m5956(OutputStream outputStream, t tVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (tVar != null) {
            return new a(tVar, outputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static r m5957(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        c5.a m5961 = m5961(socket);
        return m5961.m5863(m5956(socket.getOutputStream(), m5961));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static s m5958(InputStream inputStream) {
        return m5959(inputStream, new t());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static s m5959(InputStream inputStream, t tVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (tVar != null) {
            return new b(tVar, inputStream);
        }
        throw new IllegalArgumentException("timeout == null");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static s m5960(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        c5.a m5961 = m5961(socket);
        return m5961.m5864(m5959(socket.getInputStream(), m5961));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static c5.a m5961(Socket socket) {
        return new c(socket);
    }
}
