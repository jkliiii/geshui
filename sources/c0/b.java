package c0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.f1;
import c0.a;
import c0.b;
import java.util.ArrayList;

/* compiled from: DynamicAnimation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final r f4921 = new f("translationX");

    /* renamed from: י, reason: contains not printable characters */
    public static final r f4922 = new g("translationY");

    /* renamed from: ـ, reason: contains not printable characters */
    public static final r f4923 = new h("translationZ");

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final r f4924 = new i("scaleX");

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final r f4925 = new j("scaleY");

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final r f4926 = new k("rotation");

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final r f4927 = new l("rotationX");

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final r f4928 = new m("rotationY");

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final r f4929 = new n("x");

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static final r f4930 = new a("y");

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final r f4931 = new C0075b("z");

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final r f4932 = new c("alpha");

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final r f4933 = new d("scrollX");

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final r f4934 = new e("scrollY");

    /* renamed from: ʾ, reason: contains not printable characters */
    final Object f4938;

    /* renamed from: ʿ, reason: contains not printable characters */
    final c0.c f4939;

    /* renamed from: ˋ, reason: contains not printable characters */
    private float f4944;

    /* renamed from: ʻ, reason: contains not printable characters */
    float f4935 = 0.0f;

    /* renamed from: ʼ, reason: contains not printable characters */
    float f4936 = Float.MAX_VALUE;

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean f4937 = false;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f4940 = false;

    /* renamed from: ˈ, reason: contains not printable characters */
    float f4941 = Float.MAX_VALUE;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f4942 = -Float.MAX_VALUE;

    /* renamed from: ˊ, reason: contains not printable characters */
    private long f4943 = 0;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final ArrayList<p> f4945 = new ArrayList<>();

    /* renamed from: ˏ, reason: contains not printable characters */
    private final ArrayList<q> f4946 = new ArrayList<>();

    /* compiled from: DynamicAnimation.java */
    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getY();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setY(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: c0.b$b, reason: collision with other inner class name */
    static class C0075b extends r {
        C0075b(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return f1.m2883(view);
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            f1.m2856(view, f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getAlpha();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setAlpha(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getScrollX();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setScrollX((int) f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getScrollY();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setScrollY((int) f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getTranslationX();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setTranslationX(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getTranslationY();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setTranslationY(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return f1.m2877(view);
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            f1.m2853(view, f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getScaleX();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setScaleX(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getScaleY();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setScaleY(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getRotation();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setRotation(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getRotationX();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setRotationX(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getRotationY();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setRotationY(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // c0.c
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public float mo5771(View view) {
            return view.getX();
        }

        @Override // c0.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5772(View view, float f5) {
            view.setX(f5);
        }
    }

    /* compiled from: DynamicAnimation.java */
    static class o {

        /* renamed from: ʻ, reason: contains not printable characters */
        float f4947;

        /* renamed from: ʼ, reason: contains not printable characters */
        float f4948;

        o() {
        }
    }

    /* compiled from: DynamicAnimation.java */
    public interface p {
        /* renamed from: ʻ, reason: contains not printable characters */
        void m5801(b bVar, boolean z5, float f5, float f6);
    }

    /* compiled from: DynamicAnimation.java */
    public interface q {
        /* renamed from: ʻ, reason: contains not printable characters */
        void m5802(b bVar, float f5, float f6);
    }

    /* compiled from: DynamicAnimation.java */
    public static abstract class r extends c0.c<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    <K> b(K k5, c0.c<K> cVar) {
        this.f4938 = k5;
        this.f4939 = cVar;
        if (cVar == f4926 || cVar == f4927 || cVar == f4928) {
            this.f4944 = 0.1f;
            return;
        }
        if (cVar == f4932) {
            this.f4944 = 0.00390625f;
        } else if (cVar == f4924 || cVar == f4925) {
            this.f4944 = 0.00390625f;
        } else {
            this.f4944 = 1.0f;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5758(boolean z5) {
        this.f4940 = false;
        c0.a.m5749().m5754(this);
        this.f4943 = 0L;
        this.f4937 = false;
        for (int i5 = 0; i5 < this.f4945.size(); i5++) {
            if (this.f4945.get(i5) != null) {
                this.f4945.get(i5).m5801(this, z5, this.f4936, this.f4935);
            }
        }
        m5761(this.f4945);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private float m5759() {
        return this.f4939.mo5771(this.f4938);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static <T> void m5760(ArrayList<T> arrayList, T t5) {
        int indexOf = arrayList.indexOf(t5);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static <T> void m5761(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m5762() {
        if (this.f4940) {
            return;
        }
        this.f4940 = true;
        if (!this.f4937) {
            this.f4936 = m5759();
        }
        float f5 = this.f4936;
        if (f5 > this.f4941 || f5 < this.f4942) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c0.a.m5749().m5751(this, 0L);
    }

    @Override // c0.a.b
    /* renamed from: ʻ */
    public boolean mo5756(long j5) {
        long j6 = this.f4943;
        if (j6 == 0) {
            this.f4943 = j5;
            m5767(this.f4936);
            return false;
        }
        this.f4943 = j5;
        boolean mo5770 = mo5770(j5 - j6);
        float min = Math.min(this.f4936, this.f4941);
        this.f4936 = min;
        float max = Math.max(min, this.f4942);
        this.f4936 = max;
        m5767(max);
        if (mo5770) {
            m5758(false);
        }
        return mo5770;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public T m5763(p pVar) {
        if (!this.f4945.contains(pVar)) {
            this.f4945.add(pVar);
        }
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    float m5764() {
        return this.f4944 * 0.75f;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m5765() {
        return this.f4940;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m5766(p pVar) {
        m5760(this.f4945, pVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m5767(float f5) {
        this.f4939.mo5772(this.f4938, f5);
        for (int i5 = 0; i5 < this.f4946.size(); i5++) {
            if (this.f4946.get(i5) != null) {
                this.f4946.get(i5).m5802(this, this.f4936, this.f4935);
            }
        }
        m5761(this.f4946);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public T m5768(float f5) {
        this.f4936 = f5;
        this.f4937 = true;
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void mo5769() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4940) {
            return;
        }
        m5762();
    }

    /* renamed from: י, reason: contains not printable characters */
    abstract boolean mo5770(long j5);
}
