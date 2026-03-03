package f4;

import java.io.Serializable;

/* compiled from: CallableReference.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c implements j4.a, Serializable {

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final Object f7777 = a.f7784;

    /* renamed from: ʾ, reason: contains not printable characters */
    private transient j4.a f7778;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected final Object f7779;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Class f7780;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final String f7781;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final String f7782;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean f7783;

    /* compiled from: CallableReference.java */
    private static class a implements Serializable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private static final a f7784 = new a();

        private a() {
        }
    }

    public c() {
        this(f7777);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public j4.a mo8608() {
        j4.a aVar = this.f7778;
        if (aVar != null) {
            return aVar;
        }
        j4.a mo8609 = mo8609();
        this.f7778 = mo8609;
        return mo8609;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected abstract j4.a mo8609();

    /* renamed from: ʾ, reason: contains not printable characters */
    public Object m8610() {
        return this.f7779;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public String m8611() {
        return this.f7781;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public j4.c m8612() {
        Class cls = this.f7780;
        if (cls == null) {
            return null;
        }
        return this.f7783 ? r.m8635(cls) : r.m8634(cls);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public String m8613() {
        return this.f7782;
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    protected c(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f7779 = obj;
        this.f7780 = cls;
        this.f7781 = str;
        this.f7782 = str2;
        this.f7783 = z5;
    }
}
