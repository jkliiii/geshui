package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MotionLayout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends ConstraintLayout implements r0 {

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public static boolean f1641;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    Interpolator f1642;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    long f1643;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    float f1644;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private boolean f1645;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private ArrayList<h> f1646;

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private ArrayList<h> f1647;

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private ArrayList<h> f1648;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private CopyOnWriteArrayList<d> f1649;

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private int f1650;

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private float f1651;

    /* renamed from: ʻˎ, reason: contains not printable characters */
    boolean f1652;

    /* renamed from: ʻˏ, reason: contains not printable characters */
    protected boolean f1653;

    /* renamed from: ʻˑ, reason: contains not printable characters */
    float f1654;

    /* renamed from: ʻי, reason: contains not printable characters */
    private boolean f1655;

    /* renamed from: ʻـ, reason: contains not printable characters */
    private c f1656;

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private Runnable f1657;

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private int[] f1658;

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    int f1659;

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    private int f1660;

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    private boolean f1661;

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    e f1662;

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    private boolean f1663;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    ArrayList<Integer> f1664;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private int f1665;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    float f1666;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private int f1667;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    int f1668;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    HashMap<View, g> f1669;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private float f1670;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private long f1671;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    float f1672;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    float f1673;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    float f1674;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private long f1675;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private boolean f1676;

    /* renamed from: יי, reason: contains not printable characters */
    private d f1677;

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean f1678;

    /* renamed from: ٴٴ, reason: contains not printable characters */
    float f1679;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    Interpolator f1680;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    int f1681;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    boolean f1682;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private boolean f1683;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private androidx.constraintlayout.motion.widget.b f1684;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    boolean f1685;

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    float f1686;

    /* compiled from: MotionLayout.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f1656.m1778();
        }
    }

    /* compiled from: MotionLayout.java */
    static /* synthetic */ class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f1688;

        static {
            int[] iArr = new int[e.values().length];
            f1688 = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1688[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1688[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1688[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MotionLayout.java */
    class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        float f1689 = Float.NaN;

        /* renamed from: ʼ, reason: contains not printable characters */
        float f1690 = Float.NaN;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f1691 = -1;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f1692 = -1;

        /* renamed from: ʿ, reason: contains not printable characters */
        final String f1693 = "motion.progress";

        /* renamed from: ˆ, reason: contains not printable characters */
        final String f1694 = "motion.velocity";

        /* renamed from: ˈ, reason: contains not printable characters */
        final String f1695 = "motion.StartState";

        /* renamed from: ˉ, reason: contains not printable characters */
        final String f1696 = "motion.EndState";

        c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1778() {
            int i5 = this.f1691;
            if (i5 != -1 || this.f1692 != -1) {
                if (i5 == -1) {
                    j.this.m1773(this.f1692);
                } else {
                    int i6 = this.f1692;
                    if (i6 == -1) {
                        j.this.m1766(i5, -1, -1);
                    } else {
                        j.this.m1769(i5, i6);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f1690)) {
                if (Float.isNaN(this.f1689)) {
                    return;
                }
                j.this.setProgress(this.f1689);
            } else {
                j.this.m1767(this.f1689, this.f1690);
                this.f1689 = Float.NaN;
                this.f1690 = Float.NaN;
                this.f1691 = -1;
                this.f1692 = -1;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public Bundle m1779() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1689);
            bundle.putFloat("motion.velocity", this.f1690);
            bundle.putInt("motion.StartState", this.f1691);
            bundle.putInt("motion.EndState", this.f1692);
            return bundle;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m1780() {
            this.f1692 = j.this.f1667;
            this.f1691 = j.this.f1665;
            this.f1690 = j.this.getVelocity();
            this.f1689 = j.this.getProgress();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m1781(int i5) {
            this.f1692 = i5;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public void m1782(float f5) {
            this.f1689 = f5;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m1783(int i5) {
            this.f1691 = i5;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public void m1784(Bundle bundle) {
            this.f1689 = bundle.getFloat("motion.progress");
            this.f1690 = bundle.getFloat("motion.velocity");
            this.f1691 = bundle.getInt("motion.StartState");
            this.f1692 = bundle.getInt("motion.EndState");
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public void m1785(float f5) {
            this.f1690 = f5;
        }
    }

    /* compiled from: MotionLayout.java */
    public interface d {
        /* renamed from: ʻ */
        void mo1752(j jVar, int i5, int i6, float f5);

        /* renamed from: ʼ */
        void mo1753(j jVar, int i5, int i6);

        /* renamed from: ʽ */
        void mo1754(j jVar, int i5);
    }

    /* compiled from: MotionLayout.java */
    enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m1761() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.f1677 == null && ((copyOnWriteArrayList = this.f1649) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.f1652 = false;
        Iterator<Integer> it = this.f1664.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            d dVar = this.f1677;
            if (dVar != null) {
                dVar.mo1754(this, next.intValue());
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1649;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo1754(this, next.intValue());
                }
            }
        }
        this.f1664.clear();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m1765() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f1677 == null && ((copyOnWriteArrayList = this.f1649) == null || copyOnWriteArrayList.isEmpty())) || this.f1651 == this.f1673) {
            return;
        }
        if (this.f1650 != -1) {
            d dVar = this.f1677;
            if (dVar != null) {
                dVar.mo1753(this, this.f1665, this.f1667);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.f1649;
            if (copyOnWriteArrayList2 != null) {
                Iterator<d> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo1753(this, this.f1665, this.f1667);
                }
            }
            this.f1652 = true;
        }
        this.f1650 = -1;
        float f5 = this.f1673;
        this.f1651 = f5;
        d dVar2 = this.f1677;
        if (dVar2 != null) {
            dVar2.mo1752(this, this.f1665, this.f1667, f5);
        }
        CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.f1649;
        if (copyOnWriteArrayList3 != null) {
            Iterator<d> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo1752(this, this.f1665, this.f1667, this.f1673);
            }
        }
        this.f1652 = true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.f1648;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().m1758(canvas);
            }
        }
        m1777(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f1668;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f1684 == null) {
            this.f1684 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f1684;
    }

    public int getEndState() {
        return this.f1667;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f1672;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f1665;
    }

    public float getTargetPosition() {
        return this.f1674;
    }

    public Bundle getTransitionState() {
        if (this.f1656 == null) {
            this.f1656 = new c();
        }
        this.f1656.m1780();
        return this.f1656.m1779();
    }

    public long getTransitionTimeMs() {
        return (long) (this.f1670 * 1000.0f);
    }

    public float getVelocity() {
        return this.f1666;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f1660 = display.getRotation();
        }
        m1775();
        c cVar = this.f1656;
        if (cVar != null) {
            if (this.f1661) {
                post(new a());
            } else {
                cVar.m1778();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        this.f1655 = true;
        try {
            super.onLayout(z5, i5, i6, i7, i8);
        } finally {
            this.f1655 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedFling(View view, float f5, float f6, boolean z5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s0
    public boolean onNestedPreFling(View view, float f5, float f6) {
        return false;
    }

    @Override // androidx.core.view.q0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // androidx.core.view.q0
    public void onNestedScrollAccepted(View view, View view2, int i5, int i6) {
        this.f1643 = getNanoTime();
        this.f1644 = 0.0f;
        this.f1679 = 0.0f;
        this.f1686 = 0.0f;
    }

    @Override // androidx.core.view.q0
    public boolean onStartNestedScroll(View view, View view2, int i5, int i6) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.f1649 == null) {
                this.f1649 = new CopyOnWriteArrayList<>();
            }
            this.f1649.add(hVar);
            if (hVar.m1757()) {
                if (this.f1646 == null) {
                    this.f1646 = new ArrayList<>();
                }
                this.f1646.add(hVar);
            }
            if (hVar.m1756()) {
                if (this.f1647 == null) {
                    this.f1647 = new ArrayList<>();
                }
                this.f1647.add(hVar);
            }
            if (hVar.m1755()) {
                if (this.f1648 == null) {
                    this.f1648 = new ArrayList<>();
                }
                this.f1648.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.f1646;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.f1647;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f1653) {
            int i5 = this.f1668;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i5) {
        this.f1681 = i5;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z5) {
        this.f1661 = z5;
    }

    public void setInteractionEnabled(boolean z5) {
        this.f1678 = z5;
    }

    public void setInterpolatedProgress(float f5) {
        setProgress(f5);
    }

    public void setOnHide(float f5) {
        ArrayList<h> arrayList = this.f1647;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f1647.get(i5).setProgress(f5);
            }
        }
    }

    public void setOnShow(float f5) {
        ArrayList<h> arrayList = this.f1646;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f1646.get(i5).setProgress(f5);
            }
        }
    }

    public void setProgress(float f5) {
        if (f5 < 0.0f || f5 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f1656 == null) {
                this.f1656 = new c();
            }
            this.f1656.m1782(f5);
            return;
        }
        if (f5 <= 0.0f) {
            if (this.f1672 == 1.0f && this.f1668 == this.f1667) {
                setState(e.MOVING);
            }
            this.f1668 = this.f1665;
            if (this.f1672 == 0.0f) {
                setState(e.FINISHED);
                return;
            }
            return;
        }
        if (f5 < 1.0f) {
            this.f1668 = -1;
            setState(e.MOVING);
            return;
        }
        if (this.f1672 == 0.0f && this.f1668 == this.f1665) {
            setState(e.MOVING);
        }
        this.f1668 = this.f1667;
        if (this.f1672 == 1.0f) {
            setState(e.FINISHED);
        }
    }

    public void setScene(l lVar) {
        m1805();
        throw null;
    }

    void setStartState(int i5) {
        if (isAttachedToWindow()) {
            this.f1668 = i5;
            return;
        }
        if (this.f1656 == null) {
            this.f1656 = new c();
        }
        this.f1656.m1783(i5);
        this.f1656.m1781(i5);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f1668 == -1) {
            return;
        }
        e eVar3 = this.f1662;
        this.f1662 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            m1765();
        }
        int i5 = b.f1688[eVar3.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3 && eVar == eVar2) {
                m1774();
                return;
            }
            return;
        }
        if (eVar == eVar4) {
            m1765();
        }
        if (eVar == eVar2) {
            m1774();
        }
    }

    public void setTransition(int i5) {
    }

    public void setTransitionDuration(int i5) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.f1677 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f1656 == null) {
            this.f1656 = new c();
        }
        this.f1656.m1784(bundle);
        if (isAttachedToWindow()) {
            this.f1656.m1778();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.m1745(context, this.f1665) + "->" + androidx.constraintlayout.motion.widget.a.m1745(context, this.f1667) + " (pos:" + this.f1672 + " Dpos/Dt:" + this.f1666;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m1766(int i5, int i6, int i7) {
        setState(e.SETUP);
        this.f1668 = i5;
        this.f1665 = -1;
        this.f1667 = -1;
        androidx.constraintlayout.widget.e eVar = this.f1736;
        if (eVar != null) {
            eVar.m1841(i5, i6, i7);
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m1767(float f5, float f6) {
        if (!isAttachedToWindow()) {
            if (this.f1656 == null) {
                this.f1656 = new c();
            }
            this.f1656.m1782(f5);
            this.f1656.m1785(f6);
            return;
        }
        setProgress(f5);
        setState(e.MOVING);
        this.f1666 = f6;
        if (f6 != 0.0f) {
            m1776(f6 <= 0.0f ? 0.0f : 1.0f);
        } else {
            if (f5 == 0.0f || f5 == 1.0f) {
                return;
            }
            m1776(f5 <= 0.5f ? 0.0f : 1.0f);
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m1768() {
        m1776(1.0f);
        this.f1657 = null;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m1769(int i5, int i6) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.f1656 == null) {
            this.f1656 = new c();
        }
        this.f1656.m1783(i5);
        this.f1656.m1781(i6);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m1770(int i5, int i6, int i7) {
        m1771(i5, i6, i7, -1);
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void m1771(int i5, int i6, int i7, int i8) {
        int i9 = this.f1668;
        if (i9 == i5) {
            return;
        }
        if (this.f1665 == i5) {
            m1776(0.0f);
            if (i8 > 0) {
                this.f1670 = i8 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f1667 == i5) {
            m1776(1.0f);
            if (i8 > 0) {
                this.f1670 = i8 / 1000.0f;
                return;
            }
            return;
        }
        this.f1667 = i5;
        if (i9 != -1) {
            m1769(i9, i5);
            m1776(1.0f);
            this.f1672 = 0.0f;
            m1768();
            if (i8 > 0) {
                this.f1670 = i8 / 1000.0f;
                return;
            }
            return;
        }
        this.f1683 = false;
        this.f1674 = 1.0f;
        this.f1673 = 0.0f;
        this.f1672 = 0.0f;
        this.f1675 = getNanoTime();
        this.f1671 = getNanoTime();
        this.f1676 = false;
        this.f1680 = null;
        if (i8 == -1) {
            throw null;
        }
        this.f1665 = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* renamed from: ˑ, reason: contains not printable characters */
    protected void mo1772(int i5) {
        this.f1736 = null;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public void m1773(int i5) {
        if (isAttachedToWindow()) {
            m1770(i5, -1, -1);
            return;
        }
        if (this.f1656 == null) {
            this.f1656 = new c();
        }
        this.f1656.m1781(i5);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected void m1774() {
        int i5;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.f1677 != null || ((copyOnWriteArrayList = this.f1649) != null && !copyOnWriteArrayList.isEmpty())) && this.f1650 == -1) {
            this.f1650 = this.f1668;
            if (this.f1664.isEmpty()) {
                i5 = -1;
            } else {
                ArrayList<Integer> arrayList = this.f1664;
                i5 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i6 = this.f1668;
            if (i5 != i6 && i6 != -1) {
                this.f1664.add(Integer.valueOf(i6));
            }
        }
        m1761();
        Runnable runnable = this.f1657;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f1658;
        if (iArr == null || this.f1659 <= 0) {
            return;
        }
        m1773(iArr[0]);
        int[] iArr2 = this.f1658;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f1659--;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m1777(boolean z5) {
        boolean z6;
        int i5;
        float interpolation;
        boolean z7;
        if (this.f1675 == -1) {
            this.f1675 = getNanoTime();
        }
        float f5 = this.f1672;
        if (f5 > 0.0f && f5 < 1.0f) {
            this.f1668 = -1;
        }
        boolean z8 = false;
        if (this.f1645 || (this.f1682 && (z5 || this.f1674 != f5))) {
            float signum = Math.signum(this.f1674 - f5);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f1680;
            float f6 = !(interpolator instanceof i) ? (((nanoTime - this.f1675) * signum) * 1.0E-9f) / this.f1670 : 0.0f;
            float f7 = this.f1672 + f6;
            if (this.f1676) {
                f7 = this.f1674;
            }
            if ((signum <= 0.0f || f7 < this.f1674) && (signum > 0.0f || f7 > this.f1674)) {
                z6 = false;
            } else {
                f7 = this.f1674;
                this.f1682 = false;
                z6 = true;
            }
            this.f1672 = f7;
            this.f1673 = f7;
            this.f1675 = nanoTime;
            if (interpolator == null || z6) {
                this.f1666 = f6;
            } else {
                if (this.f1683) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f1671) * 1.0E-9f);
                    Interpolator interpolator2 = this.f1680;
                    interpolator2.getClass();
                    this.f1672 = interpolation;
                    this.f1675 = nanoTime;
                    if (interpolator2 instanceof i) {
                        float m1760 = ((i) interpolator2).m1760();
                        this.f1666 = m1760;
                        int i6 = ((Math.abs(m1760) * this.f1670) > 1.0E-5f ? 1 : ((Math.abs(m1760) * this.f1670) == 1.0E-5f ? 0 : -1));
                        if (m1760 > 0.0f && interpolation >= 1.0f) {
                            this.f1672 = 1.0f;
                            this.f1682 = false;
                            interpolation = 1.0f;
                        }
                        if (m1760 < 0.0f && interpolation <= 0.0f) {
                            this.f1672 = 0.0f;
                            this.f1682 = false;
                            f7 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f7);
                    Interpolator interpolator3 = this.f1680;
                    if (interpolator3 instanceof i) {
                        this.f1666 = ((i) interpolator3).m1760();
                    } else {
                        this.f1666 = ((interpolator3.getInterpolation(f7 + f6) - interpolation) * signum) / f6;
                    }
                }
                f7 = interpolation;
            }
            if (Math.abs(this.f1666) > 1.0E-5f) {
                setState(e.MOVING);
            }
            if ((signum > 0.0f && f7 >= this.f1674) || (signum <= 0.0f && f7 <= this.f1674)) {
                f7 = this.f1674;
                this.f1682 = false;
            }
            if (f7 >= 1.0f || f7 <= 0.0f) {
                this.f1682 = false;
                setState(e.FINISHED);
            }
            int childCount = getChildCount();
            this.f1645 = false;
            long nanoTime2 = getNanoTime();
            this.f1654 = f7;
            Interpolator interpolator4 = this.f1642;
            float interpolation2 = interpolator4 == null ? f7 : interpolator4.getInterpolation(f7);
            Interpolator interpolator5 = this.f1642;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((signum / this.f1670) + f7);
                this.f1666 = interpolation3;
                this.f1666 = interpolation3 - this.f1642.getInterpolation(f7);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                g gVar = this.f1669.get(childAt);
                if (gVar != null) {
                    this.f1645 |= gVar.m1751(childAt, interpolation2, nanoTime2, null);
                }
            }
            boolean z9 = (signum > 0.0f && f7 >= this.f1674) || (signum <= 0.0f && f7 <= this.f1674);
            if (!this.f1645 && !this.f1682 && z9) {
                setState(e.FINISHED);
            }
            if (this.f1653) {
                requestLayout();
            }
            boolean z10 = (!z9) | this.f1645;
            this.f1645 = z10;
            if (f7 <= 0.0f && (i5 = this.f1665) != -1 && this.f1668 != i5) {
                this.f1668 = i5;
                throw null;
            }
            if (f7 >= 1.0d) {
                int i8 = this.f1668;
                int i9 = this.f1667;
                if (i8 != i9) {
                    this.f1668 = i9;
                    throw null;
                }
            }
            if (z10 || this.f1682) {
                invalidate();
            } else if ((signum > 0.0f && f7 == 1.0f) || (signum < 0.0f && f7 == 0.0f)) {
                setState(e.FINISHED);
            }
            if (!this.f1645 && !this.f1682 && ((signum > 0.0f && f7 == 1.0f) || (signum < 0.0f && f7 == 0.0f))) {
                m1775();
            }
        }
        float f8 = this.f1672;
        if (f8 < 1.0f) {
            if (f8 <= 0.0f) {
                int i10 = this.f1668;
                int i11 = this.f1665;
                z7 = i10 != i11;
                this.f1668 = i11;
            }
            this.f1663 |= z8;
            if (z8 && !this.f1655) {
                requestLayout();
            }
            this.f1673 = this.f1672;
        }
        int i12 = this.f1668;
        int i13 = this.f1667;
        z7 = i12 != i13;
        this.f1668 = i13;
        z8 = z7;
        this.f1663 |= z8;
        if (z8) {
            requestLayout();
        }
        this.f1673 = this.f1672;
    }

    @Override // androidx.core.view.r0
    public void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (this.f1685 || i5 != 0 || i6 != 0) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }
        this.f1685 = false;
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m1776(float f5) {
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    void m1775() {
    }

    @Override // androidx.core.view.q0
    public void onStopNestedScroll(View view, int i5) {
    }

    @Override // androidx.core.view.q0
    public void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7) {
    }
}
