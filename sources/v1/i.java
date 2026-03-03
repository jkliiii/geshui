package v1;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y1.k;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class i<T extends View, Z> extends v1.a<Z> {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean f11675;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static int f11676 = com.bumptech.glide.h.f5150;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final T f11677;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final a f11678;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View.OnAttachStateChangeListener f11679;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f11680;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f11681;

    /* compiled from: ViewTarget.java */
    static final class a {

        /* renamed from: ʿ, reason: contains not printable characters */
        static Integer f11682;

        /* renamed from: ʻ, reason: contains not printable characters */
        private final View f11683;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final List<g> f11684 = new ArrayList();

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f11685;

        /* renamed from: ʾ, reason: contains not printable characters */
        private ViewTreeObserverOnPreDrawListenerC0166a f11686;

        /* compiled from: ViewTarget.java */
        /* renamed from: v1.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0166a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            private final WeakReference<a> f11687;

            ViewTreeObserverOnPreDrawListenerC0166a(a aVar) {
                this.f11687 = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f11687.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m12307();
                return true;
            }
        }

        a(View view) {
            this.f11683 = view;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private static int m12300(Context context) {
            if (f11682 == null) {
                Display defaultDisplay = ((WindowManager) k.m12893((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11682 = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f11682.intValue();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private int m12301(int i5, int i6, int i7) {
            int i8 = i6 - i7;
            if (i8 > 0) {
                return i8;
            }
            if (this.f11685 && this.f11683.isLayoutRequested()) {
                return 0;
            }
            int i9 = i5 - i7;
            if (i9 > 0) {
                return i9;
            }
            if (this.f11683.isLayoutRequested() || i6 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m12300(this.f11683.getContext());
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private int m12302() {
            int paddingTop = this.f11683.getPaddingTop() + this.f11683.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f11683.getLayoutParams();
            return m12301(this.f11683.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private int m12303() {
            int paddingLeft = this.f11683.getPaddingLeft() + this.f11683.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f11683.getLayoutParams();
            return m12301(this.f11683.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean m12304(int i5) {
            return i5 > 0 || i5 == Integer.MIN_VALUE;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private boolean m12305(int i5, int i6) {
            return m12304(i5) && m12304(i6);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private void m12306(int i5, int i6) {
            Iterator it = new ArrayList(this.f11684).iterator();
            while (it.hasNext()) {
                ((g) it.next()).mo12199(i5, i6);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m12307() {
            if (this.f11684.isEmpty()) {
                return;
            }
            int m12303 = m12303();
            int m12302 = m12302();
            if (m12305(m12303, m12302)) {
                m12306(m12303, m12302);
                m12308();
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m12308() {
            ViewTreeObserver viewTreeObserver = this.f11683.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11686);
            }
            this.f11686 = null;
            this.f11684.clear();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m12309(g gVar) {
            int m12303 = m12303();
            int m12302 = m12302();
            if (m12305(m12303, m12302)) {
                gVar.mo12199(m12303, m12302);
                return;
            }
            if (!this.f11684.contains(gVar)) {
                this.f11684.add(gVar);
            }
            if (this.f11686 == null) {
                ViewTreeObserver viewTreeObserver = this.f11683.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0166a viewTreeObserverOnPreDrawListenerC0166a = new ViewTreeObserverOnPreDrawListenerC0166a(this);
                this.f11686 = viewTreeObserverOnPreDrawListenerC0166a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0166a);
            }
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        void m12310(g gVar) {
            this.f11684.remove(gVar);
        }
    }

    public i(T t5) {
        this.f11677 = (T) k.m12893(t5);
        this.f11678 = new a(t5);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private Object m12296() {
        return this.f11677.getTag(f11676);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m12297() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f11679;
        if (onAttachStateChangeListener == null || this.f11681) {
            return;
        }
        this.f11677.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f11681 = true;
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m12298() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f11679;
        if (onAttachStateChangeListener == null || !this.f11681) {
            return;
        }
        this.f11677.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f11681 = false;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m12299(Object obj) {
        f11675 = true;
        this.f11677.setTag(f11676, obj);
    }

    public String toString() {
        return "Target for: " + this.f11677;
    }

    @Override // v1.h
    /* renamed from: ʻ */
    public void mo12287(g gVar) {
        this.f11678.m12309(gVar);
    }

    @Override // v1.h
    /* renamed from: ʿ */
    public u1.d mo12288() {
        Object m12296 = m12296();
        if (m12296 == null) {
            return null;
        }
        if (m12296 instanceof u1.d) {
            return (u1.d) m12296;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // v1.h
    /* renamed from: ˈ */
    public void mo12289(u1.d dVar) {
        m12299(dVar);
    }

    @Override // v1.a, v1.h
    /* renamed from: ˊ */
    public void mo12284(Drawable drawable) {
        super.mo12284(drawable);
        m12297();
    }

    @Override // v1.a, v1.h
    /* renamed from: ˋ */
    public void mo9534(Drawable drawable) {
        super.mo9534(drawable);
        this.f11678.m12308();
        if (this.f11680) {
            return;
        }
        m12298();
    }

    @Override // v1.h
    /* renamed from: ˎ */
    public void mo12290(g gVar) {
        this.f11678.m12310(gVar);
    }
}
