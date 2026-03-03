package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.t6;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class t6 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f3023;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsControllerCompat.java */
    static class a extends e {

        /* renamed from: ʻ, reason: contains not printable characters */
        protected final Window f3024;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final View f3025;

        a(Window window, View view) {
            this.f3024 = window;
            this.f3025 = view;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private void m3337(int i5) {
            if (i5 == 1) {
                m3344(4);
            } else if (i5 == 2) {
                m3344(2);
            } else {
                if (i5 != 8) {
                    return;
                }
                ((InputMethodManager) this.f3024.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3024.getDecorView().getWindowToken(), 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˋ, reason: contains not printable characters */
        public static /* synthetic */ void m3338(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private void m3339(int i5) {
            if (i5 == 1) {
                m3346(4);
                m3347(1024);
                return;
            }
            if (i5 == 2) {
                m3346(2);
                return;
            }
            if (i5 != 8) {
                return;
            }
            final View view = this.f3025;
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = this.f3024.getCurrentFocus();
            }
            if (view == null) {
                view = this.f3024.findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.s6
                @Override // java.lang.Runnable
                public final void run() {
                    t6.a.m3338(view);
                }
            });
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʻ, reason: contains not printable characters */
        int mo3340() {
            return 0;
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʼ, reason: contains not printable characters */
        void mo3341(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    m3337(i6);
                }
            }
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ˆ, reason: contains not printable characters */
        void mo3342(int i5) {
            if (i5 == 0) {
                m3346(6144);
                return;
            }
            if (i5 == 1) {
                m3346(4096);
                m3344(2048);
            } else {
                if (i5 != 2) {
                    return;
                }
                m3346(2048);
                m3344(4096);
            }
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ˈ, reason: contains not printable characters */
        void mo3343(int i5) {
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i5 & i6) != 0) {
                    m3339(i6);
                }
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        protected void m3344(int i5) {
            View decorView = this.f3024.getDecorView();
            decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        protected void m3345(int i5) {
            this.f3024.addFlags(i5);
        }

        /* renamed from: י, reason: contains not printable characters */
        protected void m3346(int i5) {
            View decorView = this.f3024.getDecorView();
            decorView.setSystemUiVisibility((i5 ^ (-1)) & decorView.getSystemUiVisibility());
        }

        /* renamed from: ـ, reason: contains not printable characters */
        protected void m3347(int i5) {
            this.f3024.clearFlags(i5);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class b extends a {
        b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean mo3348() {
            return (this.f3024.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo3349(boolean z5) {
            if (!z5) {
                m3346(8192);
                return;
            }
            m3347(67108864);
            m3345(RecyclerView.UNDEFINED_DURATION);
            m3344(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class c extends b {
        c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo3350(boolean z5) {
            if (!z5) {
                m3346(16);
                return;
            }
            m3347(134217728);
            m3345(RecyclerView.UNDEFINED_DURATION);
            m3344(16);
        }
    }

    @Deprecated
    private t6(WindowInsetsController windowInsetsController) {
        this.f3023 = new d(windowInsetsController, this);
    }

    @Deprecated
    /* renamed from: ˉ, reason: contains not printable characters */
    public static t6 m3328(WindowInsetsController windowInsetsController) {
        return new t6(windowInsetsController);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: ʻ, reason: contains not printable characters */
    public int m3329() {
        return this.f3023.mo3340();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m3330(int i5) {
        this.f3023.mo3341(i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m3331() {
        return this.f3023.mo3348();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m3332(boolean z5) {
        this.f3023.mo3350(z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m3333(boolean z5) {
        this.f3023.mo3349(z5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m3334(int i5) {
        this.f3023.mo3342(i5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m3335(int i5) {
        this.f3023.mo3343(i5);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class d extends e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final t6 f3026;

        /* renamed from: ʼ, reason: contains not printable characters */
        final WindowInsetsController f3027;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final m.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3028;

        /* renamed from: ʾ, reason: contains not printable characters */
        protected Window f3029;

        d(Window window, t6 t6Var) {
            this(window.getInsetsController(), t6Var);
            this.f3029 = window;
        }

        @Override // androidx.core.view.t6.e
        @SuppressLint({"WrongConstant"})
        /* renamed from: ʻ */
        int mo3340() {
            return this.f3027.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʼ */
        void mo3341(int i5) {
            this.f3027.hide(i5);
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʽ */
        public boolean mo3348() {
            return (this.f3027.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʾ */
        public void mo3350(boolean z5) {
            if (z5) {
                if (this.f3029 != null) {
                    m3351(16);
                }
                this.f3027.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f3029 != null) {
                    m3352(16);
                }
                this.f3027.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ʿ */
        public void mo3349(boolean z5) {
            if (z5) {
                if (this.f3029 != null) {
                    m3351(8192);
                }
                this.f3027.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f3029 != null) {
                    m3352(8192);
                }
                this.f3027.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ˆ */
        void mo3342(int i5) {
            this.f3027.setSystemBarsBehavior(i5);
        }

        @Override // androidx.core.view.t6.e
        /* renamed from: ˈ */
        void mo3343(int i5) {
            Window window = this.f3029;
            if (window != null && (i5 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3027.show(i5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        protected void m3351(int i5) {
            View decorView = this.f3029.getDecorView();
            decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        protected void m3352(int i5) {
            View decorView = this.f3029.getDecorView();
            decorView.setSystemUiVisibility((i5 ^ (-1)) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, t6 t6Var) {
            this.f3028 = new m.g<>();
            this.f3027 = windowInsetsController;
            this.f3026 = t6Var;
        }
    }

    public t6(Window window, View view) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            this.f3023 = new d(window, this);
            return;
        }
        if (i5 >= 26) {
            this.f3023 = new c(window, view);
            return;
        }
        if (i5 >= 23) {
            this.f3023 = new b(window, view);
        } else if (i5 >= 20) {
            this.f3023 = new a(window, view);
        } else {
            this.f3023 = new e();
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    private static class e {
        e() {
        }

        /* renamed from: ʻ */
        int mo3340() {
            return 0;
        }

        /* renamed from: ʽ */
        public boolean mo3348() {
            return false;
        }

        /* renamed from: ʼ */
        void mo3341(int i5) {
        }

        /* renamed from: ʾ */
        public void mo3350(boolean z5) {
        }

        /* renamed from: ʿ */
        public void mo3349(boolean z5) {
        }

        /* renamed from: ˆ */
        void mo3342(int i5) {
        }

        /* renamed from: ˈ */
        void mo3343(int i5) {
        }
    }
}
