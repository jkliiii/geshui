package a0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.f1;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static final Interpolator f26 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f27;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f28;

    /* renamed from: ʾ, reason: contains not printable characters */
    private float[] f30;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float[] f31;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float[] f32;

    /* renamed from: ˈ, reason: contains not printable characters */
    private float[] f33;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int[] f34;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int[] f35;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] f36;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f37;

    /* renamed from: ˏ, reason: contains not printable characters */
    private VelocityTracker f38;

    /* renamed from: ˑ, reason: contains not printable characters */
    private float f39;

    /* renamed from: י, reason: contains not printable characters */
    private float f40;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f41;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final int f42;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f43;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private OverScroller f44;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final AbstractC0005c f45;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private View f46;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f47;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final ViewGroup f48;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f29 = -1;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final Runnable f49 = new b();

    /* compiled from: ViewDragHelper.java */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = f5 - 1.0f;
            return (f6 * f6 * f6 * f6 * f6) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.m96(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0005c abstractC0005c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0005c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f48 = viewGroup;
        this.f45 = abstractC0005c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i5 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f42 = i5;
        this.f41 = i5;
        this.f28 = viewConfiguration.getScaledTouchSlop();
        this.f39 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f40 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f44 = new OverScroller(context, f26);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m68(float f5, float f6, int i5, int i6) {
        float abs = Math.abs(f5);
        float abs2 = Math.abs(f6);
        if ((this.f34[i5] & i6) != i6 || (this.f43 & i6) == 0 || (this.f36[i5] & i6) == i6 || (this.f35[i5] & i6) == i6) {
            return false;
        }
        int i7 = this.f28;
        if (abs <= i7 && abs2 <= i7) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f45.mo118(i6)) {
            return (this.f35[i5] & i6) == 0 && abs > ((float) this.f28);
        }
        int[] iArr = this.f36;
        iArr[i5] = iArr[i5] | i6;
        return false;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private boolean m69(int i5) {
        if (m90(i5)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i5 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m70() {
        this.f38.computeCurrentVelocity(1000, this.f39);
        m83(m73(this.f38.getXVelocity(this.f29), this.f40, this.f39), m73(this.f38.getYVelocity(this.f29), this.f40, this.f39));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m71(View view, float f5, float f6) {
        if (view == null) {
            return false;
        }
        boolean z5 = this.f45.mo115(view) > 0;
        boolean z6 = this.f45.mo116(view) > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f5) > ((float) this.f28) : z6 && Math.abs(f6) > ((float) this.f28);
        }
        float f7 = (f5 * f5) + (f6 * f6);
        int i5 = this.f28;
        return f7 > ((float) (i5 * i5));
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m72(float f5, float f6, int i5) {
        m86(i5);
        float[] fArr = this.f30;
        this.f32[i5] = f5;
        fArr[i5] = f5;
        float[] fArr2 = this.f31;
        this.f33[i5] = f6;
        fArr2[i5] = f6;
        this.f34[i5] = m88((int) f5, (int) f6);
        this.f37 |= 1 << i5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private float m73(float f5, float f6, float f7) {
        float abs = Math.abs(f5);
        if (abs < f6) {
            return 0.0f;
        }
        return abs > f7 ? f5 > 0.0f ? f7 : -f7 : f5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private int m74(int i5, int i6, int i7) {
        int abs = Math.abs(i5);
        if (abs < i6) {
            return 0;
        }
        return abs > i7 ? i5 > 0 ? i7 : -i7 : i5;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m75(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i5 = 0; i5 < pointerCount; i5++) {
            int pointerId = motionEvent.getPointerId(i5);
            if (m69(pointerId)) {
                float x5 = motionEvent.getX(i5);
                float y5 = motionEvent.getY(i5);
                this.f32[pointerId] = x5;
                this.f33[pointerId] = y5;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m76() {
        float[] fArr = this.f30;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f31, 0.0f);
        Arrays.fill(this.f32, 0.0f);
        Arrays.fill(this.f33, 0.0f);
        Arrays.fill(this.f34, 0);
        Arrays.fill(this.f35, 0);
        Arrays.fill(this.f36, 0);
        this.f37 = 0;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m77(int i5) {
        if (this.f30 == null || !m90(i5)) {
            return;
        }
        this.f30[i5] = 0.0f;
        this.f31[i5] = 0.0f;
        this.f32[i5] = 0.0f;
        this.f33[i5] = 0.0f;
        this.f34[i5] = 0;
        this.f35[i5] = 0;
        this.f36[i5] = 0;
        this.f37 = ((1 << i5) ^ (-1)) & this.f37;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private int m78(int i5, int i6, int i7) {
        if (i5 == 0) {
            return 0;
        }
        int width = this.f48.getWidth();
        float f5 = width / 2;
        float m84 = f5 + (m84(Math.min(1.0f, Math.abs(i5) / width)) * f5);
        int abs = Math.abs(i6);
        return Math.min(abs > 0 ? Math.round(Math.abs(m84 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i5) / i7) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private int m79(View view, int i5, int i6, int i7, int i8) {
        float f5;
        float f6;
        float f7;
        float f8;
        int m74 = m74(i7, (int) this.f40, (int) this.f39);
        int m742 = m74(i8, (int) this.f40, (int) this.f39);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(m74);
        int abs4 = Math.abs(m742);
        int i9 = abs3 + abs4;
        int i10 = abs + abs2;
        if (m74 != 0) {
            f5 = abs3;
            f6 = i9;
        } else {
            f5 = abs;
            f6 = i10;
        }
        float f9 = f5 / f6;
        if (m742 != 0) {
            f7 = abs4;
            f8 = i9;
        } else {
            f7 = abs2;
            f8 = i10;
        }
        return (int) ((m78(i5, m74, this.f45.mo115(view)) * f9) + (m78(i6, m742, this.f45.mo116(view)) * (f7 / f8)));
    }

    /* renamed from: י, reason: contains not printable characters */
    public static c m80(ViewGroup viewGroup, float f5, AbstractC0005c abstractC0005c) {
        c m81 = m81(viewGroup, abstractC0005c);
        m81.f28 = (int) (m81.f28 * (1.0f / f5));
        return m81;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static c m81(ViewGroup viewGroup, AbstractC0005c abstractC0005c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0005c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [a0.c$c] */
    /* renamed from: ــ, reason: contains not printable characters */
    private void m82(float f5, float f6, int i5) {
        boolean m68 = m68(f5, f6, i5, 1);
        boolean z5 = m68;
        if (m68(f6, f5, i5, 4)) {
            z5 = (m68 ? 1 : 0) | 4;
        }
        boolean z6 = z5;
        if (m68(f5, f6, i5, 2)) {
            z6 = (z5 ? 1 : 0) | 2;
        }
        ?? r02 = z6;
        if (m68(f6, f5, i5, 8)) {
            r02 = (z6 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f35;
            iArr[i5] = iArr[i5] | r02;
            this.f45.mo117(r02, i5);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m83(float f5, float f6) {
        this.f47 = true;
        this.f45.mo123(this.f46, f5, f6);
        this.f47 = false;
        if (this.f27 == 1) {
            m96(0);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private float m84(float f5) {
        return (float) Math.sin((f5 - 0.5f) * 0.47123894f);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m85(int i5, int i6, int i7, int i8) {
        int left = this.f46.getLeft();
        int top2 = this.f46.getTop();
        if (i7 != 0) {
            i5 = this.f45.mo112(this.f46, i5, i7);
            f1.m2814(this.f46, i5 - left);
        }
        int i9 = i5;
        if (i8 != 0) {
            i6 = this.f45.mo113(this.f46, i6, i8);
            f1.m2815(this.f46, i6 - top2);
        }
        int i10 = i6;
        if (i7 == 0 && i8 == 0) {
            return;
        }
        this.f45.mo122(this.f46, i9, i10, i9 - left, i10 - top2);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m86(int i5) {
        float[] fArr = this.f30;
        if (fArr == null || fArr.length <= i5) {
            int i6 = i5 + 1;
            float[] fArr2 = new float[i6];
            float[] fArr3 = new float[i6];
            float[] fArr4 = new float[i6];
            float[] fArr5 = new float[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            int[] iArr3 = new int[i6];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f31;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f32;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f33;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f34;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f35;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f36;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f30 = fArr2;
            this.f31 = fArr3;
            this.f32 = fArr4;
            this.f33 = fArr5;
            this.f34 = iArr;
            this.f35 = iArr2;
            this.f36 = iArr3;
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m87(int i5, int i6, int i7, int i8) {
        int left = this.f46.getLeft();
        int top2 = this.f46.getTop();
        int i9 = i5 - left;
        int i10 = i6 - top2;
        if (i9 == 0 && i10 == 0) {
            this.f44.abortAnimation();
            m96(0);
            return false;
        }
        this.f44.startScroll(left, top2, i9, i10, m79(this.f46, i9, i10, i7, i8));
        m96(2);
        return true;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int m88(int i5, int i6) {
        int i7 = i5 < this.f48.getLeft() + this.f41 ? 1 : 0;
        if (i6 < this.f48.getTop() + this.f41) {
            i7 |= 4;
        }
        if (i5 > this.f48.getRight() - this.f41) {
            i7 |= 2;
        }
        return i6 > this.f48.getBottom() - this.f41 ? i7 | 8 : i7;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m89() {
        this.f29 = -1;
        m76();
        VelocityTracker velocityTracker = this.f38;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38 = null;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean m90(int i5) {
        return ((1 << i5) & this.f37) != 0;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m91(View view, int i5) {
        if (view.getParent() == this.f48) {
            this.f46 = view;
            this.f29 = i5;
            this.f45.mo120(view, i5);
            m96(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f48 + ")");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public boolean m92(View view, int i5, int i6) {
        return view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m93(int i5) {
        int length = this.f30.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (m94(i5, i6)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m94(int i5, int i6) {
        if (!m90(i6)) {
            return false;
        }
        boolean z5 = (i5 & 1) == 1;
        boolean z6 = (i5 & 2) == 2;
        float f5 = this.f32[i6] - this.f30[i6];
        float f6 = this.f33[i6] - this.f31[i6];
        if (!z5 || !z6) {
            return z5 ? Math.abs(f5) > ((float) this.f28) : z6 && Math.abs(f6) > ((float) this.f28);
        }
        float f7 = (f5 * f5) + (f6 * f6);
        int i7 = this.f28;
        return f7 > ((float) (i7 * i7));
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m95(MotionEvent motionEvent) {
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m89();
        }
        if (this.f38 == null) {
            this.f38 = VelocityTracker.obtain();
        }
        this.f38.addMovement(motionEvent);
        int i6 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View m106 = m106((int) x5, (int) y5);
            m72(x5, y5, pointerId);
            m103(m106, pointerId);
            int i7 = this.f34[pointerId];
            int i8 = this.f43;
            if ((i7 & i8) != 0) {
                this.f45.mo119(i7 & i8, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f27 == 1) {
                m70();
            }
            m89();
            return;
        }
        if (actionMasked == 2) {
            if (this.f27 == 1) {
                if (m69(this.f29)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f29);
                    float x6 = motionEvent.getX(findPointerIndex);
                    float y6 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f32;
                    int i9 = this.f29;
                    int i10 = (int) (x6 - fArr[i9]);
                    int i11 = (int) (y6 - this.f33[i9]);
                    m85(this.f46.getLeft() + i10, this.f46.getTop() + i11, i10, i11);
                    m75(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i6 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i6);
                if (m69(pointerId2)) {
                    float x7 = motionEvent.getX(i6);
                    float y7 = motionEvent.getY(i6);
                    float f5 = x7 - this.f30[pointerId2];
                    float f6 = y7 - this.f31[pointerId2];
                    m82(f5, f6, pointerId2);
                    if (this.f27 != 1) {
                        View m1062 = m106((int) x7, (int) y7);
                        if (m71(m1062, f5, f6) && m103(m1062, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i6++;
            }
            m75(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f27 == 1) {
                m83(0.0f, 0.0f);
            }
            m89();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x8 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            m72(x8, y8, pointerId3);
            if (this.f27 != 0) {
                if (m105((int) x8, (int) y8)) {
                    m103(this.f46, pointerId3);
                    return;
                }
                return;
            } else {
                m103(m106((int) x8, (int) y8), pointerId3);
                int i12 = this.f34[pointerId3];
                int i13 = this.f43;
                if ((i12 & i13) != 0) {
                    this.f45.mo119(i12 & i13, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f27 == 1 && pointerId4 == this.f29) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i6 >= pointerCount2) {
                    i5 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i6);
                if (pointerId5 != this.f29) {
                    View m1063 = m106((int) motionEvent.getX(i6), (int) motionEvent.getY(i6));
                    View view = this.f46;
                    if (m1063 == view && m103(view, pointerId5)) {
                        i5 = this.f29;
                        break;
                    }
                }
                i6++;
            }
            if (i5 == -1) {
                m70();
            }
        }
        m77(pointerId4);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m96(int i5) {
        this.f48.removeCallbacks(this.f49);
        if (this.f27 != i5) {
            this.f27 = i5;
            this.f45.mo121(i5);
            if (this.f27 == 0) {
                this.f46 = null;
            }
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m97(int i5) {
        this.f43 = i5;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m98(int i5) {
        this.f41 = i5;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public boolean m99(int i5, int i6) {
        if (this.f47) {
            return m87(i5, i6, (int) this.f38.getXVelocity(this.f29), (int) this.f38.getYVelocity(this.f29));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void m100(float f5) {
        this.f40 = f5;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m101(boolean z5) {
        if (this.f27 == 2) {
            boolean computeScrollOffset = this.f44.computeScrollOffset();
            int currX = this.f44.getCurrX();
            int currY = this.f44.getCurrY();
            int left = currX - this.f46.getLeft();
            int top2 = currY - this.f46.getTop();
            if (left != 0) {
                f1.m2814(this.f46, left);
            }
            if (top2 != 0) {
                f1.m2815(this.f46, top2);
            }
            if (left != 0 || top2 != 0) {
                this.f45.mo122(this.f46, currX, currY, left, top2);
            }
            if (computeScrollOffset && currX == this.f44.getFinalX() && currY == this.f44.getFinalY()) {
                this.f44.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z5) {
                    this.f48.post(this.f49);
                } else {
                    m96(0);
                }
            }
        }
        return this.f27 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ff  */
    /* renamed from: ˑˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m102(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.c.m102(android.view.MotionEvent):boolean");
    }

    /* renamed from: יי, reason: contains not printable characters */
    boolean m103(View view, int i5) {
        if (view == this.f46 && this.f29 == i5) {
            return true;
        }
        if (view == null || !this.f45.mo124(view, i5)) {
            return false;
        }
        this.f29 = i5;
        m91(view, i5);
        return true;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public int m104() {
        return this.f27;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean m105(int i5, int i6) {
        return m92(this.f46, i5, i6);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public View m106(int i5, int i6) {
        for (int childCount = this.f48.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f48.getChildAt(this.f45.m114(childCount));
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public boolean m107(View view, int i5, int i6) {
        this.f46 = view;
        this.f29 = -1;
        boolean m87 = m87(i5, i6, 0, 0);
        if (!m87 && this.f27 == 0 && this.f46 != null) {
            this.f46 = null;
        }
        return m87;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public View m108() {
        return this.f46;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public int m109() {
        return this.f42;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public int m110() {
        return this.f41;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public int m111() {
        return this.f28;
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: a0.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0005c {
        /* renamed from: ʻ, reason: contains not printable characters */
        public abstract int mo112(View view, int i5, int i6);

        /* renamed from: ʼ, reason: contains not printable characters */
        public abstract int mo113(View view, int i5, int i6);

        /* renamed from: ʾ, reason: contains not printable characters */
        public int mo115(View view) {
            return 0;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int mo116(View view) {
            return 0;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean mo118(int i5) {
            return false;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public abstract void mo121(int i5);

        /* renamed from: ˎ, reason: contains not printable characters */
        public abstract void mo122(View view, int i5, int i6, int i7, int i8);

        /* renamed from: ˏ, reason: contains not printable characters */
        public abstract void mo123(View view, float f5, float f6);

        /* renamed from: ˑ, reason: contains not printable characters */
        public abstract boolean mo124(View view, int i5);

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m114(int i5) {
            return i5;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo117(int i5, int i6) {
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo119(int i5, int i6) {
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo120(View view, int i5) {
        }
    }
}
