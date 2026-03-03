package d0;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends SpannableStringBuilder {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Class<?> f6831;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final List<a> f6832;

    /* compiled from: SpannableBuilder.java */
    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: ʾ, reason: contains not printable characters */
        final Object f6833;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final AtomicInteger f6834 = new AtomicInteger(0);

        a(Object obj) {
            this.f6833 = obj;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean m8166(Object obj) {
            return obj instanceof d0.a;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f6833).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            ((TextWatcher) this.f6833).beforeTextChanged(charSequence, i5, i6, i7);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i5, int i6) {
            if (this.f6834.get() <= 0 || !m8166(obj)) {
                ((SpanWatcher) this.f6833).onSpanAdded(spannable, obj, i5, i6);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            /*
                r8 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r8.f6834
                int r0 = r0.get()
                if (r0 <= 0) goto Lf
                boolean r0 = r8.m8166(r10)
                if (r0 == 0) goto Lf
                return
            Lf:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L1e
                r0 = 0
                if (r11 <= r12) goto L19
                r11 = 0
            L19:
                if (r13 <= r14) goto L1e
                r4 = r11
                r6 = 0
                goto L20
            L1e:
                r4 = r11
                r6 = r13
            L20:
                java.lang.Object r11 = r8.f6833
                r1 = r11
                android.text.SpanWatcher r1 = (android.text.SpanWatcher) r1
                r2 = r9
                r3 = r10
                r5 = r12
                r7 = r14
                r1.onSpanChanged(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d0.b.a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i5, int i6) {
            if (this.f6834.get() <= 0 || !m8166(obj)) {
                ((SpanWatcher) this.f6833).onSpanRemoved(spannable, obj, i5, i6);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            ((TextWatcher) this.f6833).onTextChanged(charSequence, i5, i6, i7);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        final void m8167() {
            this.f6834.incrementAndGet();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        final void m8168() {
            this.f6834.decrementAndGet();
        }
    }

    b(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f6832 = new ArrayList();
        h.m2584(cls, "watcherClass cannot be null");
        this.f6831 = cls;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m8157() {
        for (int i5 = 0; i5 < this.f6832.size(); i5++) {
            this.f6832.get(i5).m8167();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static b m8158(Class<?> cls, CharSequence charSequence) {
        return new b(cls, charSequence);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8159() {
        for (int i5 = 0; i5 < this.f6832.size(); i5++) {
            this.f6832.get(i5).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private a m8160(Object obj) {
        for (int i5 = 0; i5 < this.f6832.size(); i5++) {
            a aVar = this.f6832.get(i5);
            if (aVar.f6833 == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m8161(Class<?> cls) {
        return this.f6831 == cls;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m8162(Object obj) {
        return obj != null && m8161(obj.getClass());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8163() {
        for (int i5 = 0; i5 < this.f6832.size(); i5++) {
            this.f6832.get(i5).m8168();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a m8160;
        if (m8162(obj) && (m8160 = m8160(obj)) != null) {
            obj = m8160;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a m8160;
        if (m8162(obj) && (m8160 = m8160(obj)) != null) {
            obj = m8160;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a m8160;
        if (m8162(obj) && (m8160 = m8160(obj)) != null) {
            obj = m8160;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i5, int i6, Class<T> cls) {
        if (!m8161(cls)) {
            return (T[]) super.getSpans(i5, i6, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i5, i6, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            tArr[i7] = aVarArr[i7].f6833;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i5, int i6, Class cls) {
        if (cls == null || m8161(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i5, i6, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (m8162(obj)) {
            aVar = m8160(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f6832.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i5, int i6, int i7) {
        if (m8162(obj)) {
            a aVar = new a(obj);
            this.f6832.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i5, i6, i7);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i5, int i6) {
        return new b(this.f6831, this, i5, i6);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m8164() {
        m8157();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8165() {
        m8163();
        m8159();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i5, int i6) {
        super.delete(i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i5, CharSequence charSequence) {
        super.insert(i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i5, int i6, CharSequence charSequence) {
        m8157();
        super.replace(i5, i6, charSequence);
        m8163();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i5, CharSequence charSequence, int i6, int i7) {
        super.insert(i5, charSequence, i6, i7);
        return this;
    }

    b(Class<?> cls, CharSequence charSequence, int i5, int i6) {
        super(charSequence, i5, i6);
        this.f6832 = new ArrayList();
        h.m2584(cls, "watcherClass cannot be null");
        this.f6831 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i5, int i6, CharSequence charSequence, int i7, int i8) {
        m8157();
        super.replace(i5, i6, charSequence, i7, i8);
        m8163();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c6) {
        super.append(c6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i5, int i6) {
        super.append(charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i5) {
        super.append(charSequence, obj, i5);
        return this;
    }
}
