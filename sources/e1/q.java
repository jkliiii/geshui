package e1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: GlideException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class q extends Exception {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final StackTraceElement[] f7530 = new StackTraceElement[0];

    /* renamed from: ʾ, reason: contains not printable characters */
    private final List<Throwable> f7531;

    /* renamed from: ʿ, reason: contains not printable characters */
    private c1.f f7532;

    /* renamed from: ˆ, reason: contains not printable characters */
    private c1.a f7533;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Class<?> f7534;

    /* renamed from: ˉ, reason: contains not printable characters */
    private String f7535;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Exception f7536;

    public q(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m8417(Throwable th, List<Throwable> list) {
        if (!(th instanceof q)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((q) th).m8422().iterator();
        while (it.hasNext()) {
            m8417(it.next(), list);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m8418(List<Throwable> list, Appendable appendable) {
        try {
            m8419(list, appendable);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m8419(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            appendable.append("Cause (").append(String.valueOf(i6)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i5);
            if (th instanceof q) {
                ((q) th).m8421(appendable);
            } else {
                m8420(th, appendable);
            }
            i5 = i6;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m8420(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m8421(Appendable appendable) {
        m8420(this, appendable);
        m8418(m8422(), new a(appendable));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f7535);
        Class<?> cls = this.f7534;
        String str = BuildConfig.FLAVOR;
        sb.append(cls != null ? ", " + this.f7534 : BuildConfig.FLAVOR);
        sb.append(this.f7533 != null ? ", " + this.f7533 : BuildConfig.FLAVOR);
        if (this.f7532 != null) {
            str = ", " + this.f7532;
        }
        sb.append(str);
        List<Throwable> m8423 = m8423();
        if (m8423.isEmpty()) {
            return sb.toString();
        }
        if (m8423.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(m8423.size());
            sb.append(" root causes:");
        }
        for (Throwable th : m8423) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public List<Throwable> m8422() {
        return this.f7531;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public List<Throwable> m8423() {
        ArrayList arrayList = new ArrayList();
        m8417(this, arrayList);
        return arrayList;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m8424(String str) {
        List<Throwable> m8423 = m8423();
        int size = m8423.size();
        int i5 = 0;
        while (i5 < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i6 = i5 + 1;
            sb.append(i6);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), m8423.get(i5));
            i5 = i6;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m8425(c1.f fVar, c1.a aVar) {
        m8426(fVar, aVar, null);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m8426(c1.f fVar, c1.a aVar, Class<?> cls) {
        this.f7532 = fVar;
        this.f7533 = aVar;
        this.f7534 = cls;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m8427(Exception exc) {
        this.f7536 = exc;
    }

    public q(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m8421(printStream);
    }

    public q(String str, List<Throwable> list) {
        this.f7535 = str;
        setStackTrace(f7530);
        this.f7531 = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m8421(printWriter);
    }

    /* compiled from: GlideException.java */
    private static final class a implements Appendable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Appendable f7537;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f7538 = true;

        a(Appendable appendable) {
            this.f7537 = appendable;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private CharSequence m8428(CharSequence charSequence) {
            return charSequence == null ? BuildConfig.FLAVOR : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c6) throws IOException {
            if (this.f7538) {
                this.f7538 = false;
                this.f7537.append("  ");
            }
            this.f7538 = c6 == '\n';
            this.f7537.append(c6);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence m8428 = m8428(charSequence);
            return append(m8428, 0, m8428.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i5, int i6) throws IOException {
            CharSequence m8428 = m8428(charSequence);
            boolean z5 = false;
            if (this.f7538) {
                this.f7538 = false;
                this.f7537.append("  ");
            }
            if (m8428.length() > 0 && m8428.charAt(i6 - 1) == '\n') {
                z5 = true;
            }
            this.f7538 = z5;
            this.f7537.append(m8428, i5, i6);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
