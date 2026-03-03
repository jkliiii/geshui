package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Transition.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class q implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<x> mEndValuesList;
    private f mEpicenterCallback;
    private m.a<String, String> mNameOverrides;
    t mPropagation;
    private ArrayList<x> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final h STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<m.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private y mStartValues = new y();
    private y mEndValues = new y();
    u mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private h mPathMotion = STRAIGHT_PATH_MOTION;

    /* compiled from: Transition.java */
    static class a extends h {
        a() {
        }

        @Override // androidx.transition.h
        public Path getPath(float f5, float f6, float f7, float f8) {
            Path path = new Path();
            path.moveTo(f5, f6);
            path.lineTo(f7, f8);
            return path;
        }
    }

    /* compiled from: Transition.java */
    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ m.a f4533;

        b(m.a aVar) {
            this.f4533 = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4533.remove(animator);
            q.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            q.this.mCurrentAnimators.add(animator);
        }
    }

    /* compiled from: Transition.java */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.end();
            animator.removeListener(this);
        }
    }

    /* compiled from: Transition.java */
    private static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        View f4536;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f4537;

        /* renamed from: ʽ, reason: contains not printable characters */
        x f4538;

        /* renamed from: ʾ, reason: contains not printable characters */
        u0 f4539;

        /* renamed from: ʿ, reason: contains not printable characters */
        q f4540;

        d(View view, String str, q qVar, u0 u0Var, x xVar) {
            this.f4536 = view;
            this.f4537 = str;
            this.f4538 = xVar;
            this.f4539 = u0Var;
            this.f4540 = qVar;
        }
    }

    /* compiled from: Transition.java */
    private static class e {
        /* renamed from: ʻ, reason: contains not printable characters */
        static <T> ArrayList<T> m5390(ArrayList<T> arrayList, T t5) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t5)) {
                arrayList.add(t5);
            }
            return arrayList;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static <T> ArrayList<T> m5391(ArrayList<T> arrayList, T t5) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t5);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* compiled from: Transition.java */
    public static abstract class f {
        /* renamed from: ʻ */
        public abstract Rect mo5347(q qVar);
    }

    /* compiled from: Transition.java */
    public interface g {
        /* renamed from: ʻ */
        void mo5348(q qVar);

        /* renamed from: ʼ */
        void mo5334(q qVar);

        /* renamed from: ʽ */
        void mo5335(q qVar);

        /* renamed from: ʾ */
        void mo5336(q qVar);

        /* renamed from: ʿ */
        void mo5337(q qVar);
    }

    public q() {
    }

    private void addUnmatched(m.a<View, x> aVar, m.a<View, x> aVar2) {
        for (int i5 = 0; i5 < aVar.size(); i5++) {
            x m9834 = aVar.m9834(i5);
            if (isValidTarget(m9834.f4581)) {
                this.mStartValuesList.add(m9834);
                this.mEndValuesList.add(null);
            }
        }
        for (int i6 = 0; i6 < aVar2.size(); i6++) {
            x m98342 = aVar2.m9834(i6);
            if (isValidTarget(m98342.f4581)) {
                this.mEndValuesList.add(m98342);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(y yVar, View view, x xVar) {
        yVar.f4583.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.f4584.indexOfKey(id) >= 0) {
                yVar.f4584.put(id, null);
            } else {
                yVar.f4584.put(id, view);
            }
        }
        String m2879 = f1.m2879(view);
        if (m2879 != null) {
            if (yVar.f4586.containsKey(m2879)) {
                yVar.f4586.put(m2879, null);
            } else {
                yVar.f4586.put(m2879, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.f4585.m9797(itemIdAtPosition) < 0) {
                    f1.m2842(view, true);
                    yVar.f4585.m9799(itemIdAtPosition, view);
                    return;
                }
                View m9795 = yVar.f4585.m9795(itemIdAtPosition);
                if (m9795 != null) {
                    f1.m2842(m9795, false);
                    yVar.f4585.m9799(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i5) {
        int i6 = iArr[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            if (iArr[i7] == i6) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z5) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (this.mTargetTypeExcludes.get(i5).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z5) {
                        captureStartValues(xVar);
                    } else {
                        captureEndValues(xVar);
                    }
                    xVar.f4582.add(this);
                    capturePropagationValues(xVar);
                    if (z5) {
                        addViewValues(this.mStartValues, view, xVar);
                    } else {
                        addViewValues(this.mEndValues, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    if (this.mTargetTypeChildExcludes.get(i6).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                                captureHierarchy(viewGroup.getChildAt(i7), z5);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i5, boolean z5) {
        return i5 > 0 ? z5 ? e.m5390(arrayList, Integer.valueOf(i5)) : e.m5391(arrayList, Integer.valueOf(i5)) : arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t5, boolean z5) {
        return t5 != null ? z5 ? e.m5390(arrayList, t5) : e.m5391(arrayList, t5) : arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z5) {
        return cls != null ? z5 ? e.m5390(arrayList, cls) : e.m5391(arrayList, cls) : arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z5) {
        return view != null ? z5 ? e.m5390(arrayList, view) : e.m5391(arrayList, view) : arrayList;
    }

    private static m.a<Animator, d> getRunningAnimators() {
        m.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        m.a<Animator, d> aVar2 = new m.a<>();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    private static boolean isValidMatch(int i5) {
        return i5 >= 1 && i5 <= 4;
    }

    private static boolean isValueChanged(x xVar, x xVar2, String str) {
        Object obj = xVar.f4580.get(str);
        Object obj2 = xVar2.f4580.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(m.a<View, x> aVar, m.a<View, x> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            View valueAt = sparseArray.valueAt(i5);
            if (valueAt != null && isValidTarget(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i5))) != null && isValidTarget(view)) {
                x xVar = aVar.get(valueAt);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.mStartValuesList.add(xVar);
                    this.mEndValuesList.add(xVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchInstances(m.a<View, x> aVar, m.a<View, x> aVar2) {
        x remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m9830 = aVar.m9830(size);
            if (m9830 != null && isValidTarget(m9830) && (remove = aVar2.remove(m9830)) != null && isValidTarget(remove.f4581)) {
                this.mStartValuesList.add(aVar.mo9832(size));
                this.mEndValuesList.add(remove);
            }
        }
    }

    private void matchItemIds(m.a<View, x> aVar, m.a<View, x> aVar2, m.d<View> dVar, m.d<View> dVar2) {
        View m9795;
        int m9802 = dVar.m9802();
        for (int i5 = 0; i5 < m9802; i5++) {
            View m9803 = dVar.m9803(i5);
            if (m9803 != null && isValidTarget(m9803) && (m9795 = dVar2.m9795(dVar.m9798(i5))) != null && isValidTarget(m9795)) {
                x xVar = aVar.get(m9803);
                x xVar2 = aVar2.get(m9795);
                if (xVar != null && xVar2 != null) {
                    this.mStartValuesList.add(xVar);
                    this.mEndValuesList.add(xVar2);
                    aVar.remove(m9803);
                    aVar2.remove(m9795);
                }
            }
        }
    }

    private void matchNames(m.a<View, x> aVar, m.a<View, x> aVar2, m.a<String, View> aVar3, m.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i5 = 0; i5 < size; i5++) {
            View m9834 = aVar3.m9834(i5);
            if (m9834 != null && isValidTarget(m9834) && (view = aVar4.get(aVar3.m9830(i5))) != null && isValidTarget(view)) {
                x xVar = aVar.get(m9834);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.mStartValuesList.add(xVar);
                    this.mEndValuesList.add(xVar2);
                    aVar.remove(m9834);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(y yVar, y yVar2) {
        m.a<View, x> aVar = new m.a<>(yVar.f4583);
        m.a<View, x> aVar2 = new m.a<>(yVar2.f4583);
        int i5 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i5 >= iArr.length) {
                addUnmatched(aVar, aVar2);
                return;
            }
            int i6 = iArr[i5];
            if (i6 == 1) {
                matchInstances(aVar, aVar2);
            } else if (i6 == 2) {
                matchNames(aVar, aVar2, yVar.f4586, yVar2.f4586);
            } else if (i6 == 3) {
                matchIds(aVar, aVar2, yVar.f4584, yVar2.f4584);
            } else if (i6 == 4) {
                matchItemIds(aVar, aVar2, yVar.f4585, yVar2.f4585);
            }
            i5++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i5 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (MATCH_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i5] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(trim)) {
                iArr[i5] = 1;
            } else if (MATCH_NAME_STR.equalsIgnoreCase(trim)) {
                iArr[i5] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(trim)) {
                iArr[i5] = 4;
            } else {
                if (!trim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                i5--;
                iArr = iArr2;
            }
            i5++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, m.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public q addListener(g gVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(gVar);
        return this;
    }

    public q addTarget(View view) {
        this.mTargets.add(view);
        return this;
    }

    protected void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((g) arrayList2.get(i5)).mo5334(this);
        }
    }

    public abstract void captureEndValues(x xVar);

    public abstract void captureStartValues(x xVar);

    void captureValues(ViewGroup viewGroup, boolean z5) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        m.a<String, String> aVar;
        clearValues(z5);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i5 = 0; i5 < this.mTargetIds.size(); i5++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i5).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z5) {
                        captureStartValues(xVar);
                    } else {
                        captureEndValues(xVar);
                    }
                    xVar.f4582.add(this);
                    capturePropagationValues(xVar);
                    if (z5) {
                        addViewValues(this.mStartValues, findViewById, xVar);
                    } else {
                        addViewValues(this.mEndValues, findViewById, xVar);
                    }
                }
            }
            for (int i6 = 0; i6 < this.mTargets.size(); i6++) {
                View view = this.mTargets.get(i6);
                x xVar2 = new x(view);
                if (z5) {
                    captureStartValues(xVar2);
                } else {
                    captureEndValues(xVar2);
                }
                xVar2.f4582.add(this);
                capturePropagationValues(xVar2);
                if (z5) {
                    addViewValues(this.mStartValues, view, xVar2);
                } else {
                    addViewValues(this.mEndValues, view, xVar2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z5);
        }
        if (z5 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList3.add(this.mStartValues.f4586.remove(this.mNameOverrides.m9830(i7)));
        }
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = (View) arrayList3.get(i8);
            if (view2 != null) {
                this.mStartValues.f4586.put(this.mNameOverrides.m9834(i8), view2);
            }
        }
    }

    void clearValues(boolean z5) {
        if (z5) {
            this.mStartValues.f4583.clear();
            this.mStartValues.f4584.clear();
            this.mStartValues.f4585.m9793();
        } else {
            this.mEndValues.f4583.clear();
            this.mEndValues.f4584.clear();
            this.mEndValues.f4585.m9793();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void createAnimators(android.view.ViewGroup r19, androidx.transition.y r20, androidx.transition.y r21, java.util.ArrayList<androidx.transition.x> r22, java.util.ArrayList<androidx.transition.x> r23) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.q.createAnimators(android.view.ViewGroup, androidx.transition.y, androidx.transition.y, java.util.ArrayList, java.util.ArrayList):void");
    }

    protected void end() {
        int i5 = this.mNumInstances - 1;
        this.mNumInstances = i5;
        if (i5 == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((g) arrayList2.get(i6)).mo5337(this);
                }
            }
            for (int i7 = 0; i7 < this.mStartValues.f4585.m9802(); i7++) {
                View m9803 = this.mStartValues.f4585.m9803(i7);
                if (m9803 != null) {
                    f1.m2842(m9803, false);
                }
            }
            for (int i8 = 0; i8 < this.mEndValues.f4585.m9802(); i8++) {
                View m98032 = this.mEndValues.f4585.m9803(i8);
                if (m98032 != null) {
                    f1.m2842(m98032, false);
                }
            }
            this.mEnded = true;
        }
    }

    public q excludeChildren(View view, boolean z5) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z5);
        return this;
    }

    public q excludeTarget(View view, boolean z5) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z5);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void forceToEnd(ViewGroup viewGroup) {
        m.a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        u0 m5353 = f0.m5353(viewGroup);
        m.a aVar = new m.a(runningAnimators);
        runningAnimators.clear();
        for (int i5 = size - 1; i5 >= 0; i5--) {
            d dVar = (d) aVar.m9834(i5);
            if (dVar.f4536 != null && m5353 != null && m5353.equals(dVar.f4539)) {
                ((Animator) aVar.m9830(i5)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.mo5347(this);
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    x getMatchedTransitionValues(View view, boolean z5) {
        u uVar = this.mParent;
        if (uVar != null) {
            return uVar.getMatchedTransitionValues(view, z5);
        }
        ArrayList<x> arrayList = z5 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            }
            x xVar = arrayList.get(i5);
            if (xVar == null) {
                return null;
            }
            if (xVar.f4581 == view) {
                break;
            }
            i5++;
        }
        if (i5 >= 0) {
            return (z5 ? this.mEndValuesList : this.mStartValuesList).get(i5);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public h getPathMotion() {
        return this.mPathMotion;
    }

    public t getPropagation() {
        return null;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public x getTransitionValues(View view, boolean z5) {
        u uVar = this.mParent;
        if (uVar != null) {
            return uVar.getTransitionValues(view, z5);
        }
        return (z5 ? this.mStartValues : this.mEndValues).f4583.get(view);
    }

    public boolean isTransitionRequired(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = xVar.f4580.keySet().iterator();
            while (it.hasNext()) {
                if (isValueChanged(xVar, xVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!isValueChanged(xVar, xVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (this.mTargetTypeExcludes.get(i5).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && f1.m2879(view) != null && this.mTargetNameExcludes.contains(f1.m2879(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(f1.m2879(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i6 = 0; i6 < this.mTargetTypes.size(); i6++) {
                if (this.mTargetTypes.get(i6).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        m.a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        u0 m5353 = f0.m5353(view);
        for (int i5 = size - 1; i5 >= 0; i5--) {
            d m9834 = runningAnimators.m9834(i5);
            if (m9834.f4536 != null && m5353.equals(m9834.f4539)) {
                androidx.transition.a.m5315(runningAnimators.m9830(i5));
            }
        }
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((g) arrayList2.get(i6)).mo5335(this);
            }
        }
        this.mPaused = true;
    }

    void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        m.a<Animator, d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        u0 m5353 = f0.m5353(viewGroup);
        for (int i5 = size - 1; i5 >= 0; i5--) {
            Animator m9830 = runningAnimators.m9830(i5);
            if (m9830 != null && (dVar = runningAnimators.get(m9830)) != null && dVar.f4536 != null && m5353.equals(dVar.f4539)) {
                x xVar = dVar.f4538;
                View view = dVar.f4536;
                x transitionValues = getTransitionValues(view, true);
                x matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f4583.get(view);
                }
                if (!(transitionValues == null && matchedTransitionValues == null) && dVar.f4540.isTransitionRequired(xVar, matchedTransitionValues)) {
                    if (m9830.isRunning() || m9830.isStarted()) {
                        m9830.cancel();
                    } else {
                        runningAnimators.remove(m9830);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    public q removeListener(g gVar) {
        ArrayList<g> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(gVar);
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    public q removeTarget(View view) {
        this.mTargets.remove(view);
        return this;
    }

    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                m.a<Animator, d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                u0 m5353 = f0.m5353(view);
                for (int i5 = size - 1; i5 >= 0; i5--) {
                    d m9834 = runningAnimators.m9834(i5);
                    if (m9834.f4536 != null && m5353.equals(m9834.f4539)) {
                        androidx.transition.a.m5316(runningAnimators.m9830(i5));
                    }
                }
                ArrayList<g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((g) arrayList2.get(i6)).mo5336(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    protected void runAnimators() {
        start();
        m.a<Animator, d> runningAnimators = getRunningAnimators();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (runningAnimators.containsKey(next)) {
                start();
                runAnimator(next, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    void setCanRemoveViews(boolean z5) {
        this.mCanRemoveViews = z5;
    }

    public q setDuration(long j5) {
        this.mDuration = j5;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public q setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (!isValidMatch(iArr[i5])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (alreadyContains(iArr, i5)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(h hVar) {
        if (hVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = hVar;
        }
    }

    q setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    public q setStartDelay(long j5) {
        this.mStartDelay = j5;
        return this;
    }

    protected void start() {
        if (this.mNumInstances == 0) {
            ArrayList<g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((g) arrayList2.get(i5)).mo5348(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString() {
        return toString(BuildConfig.FLAVOR);
    }

    public q addTarget(int i5) {
        if (i5 != 0) {
            this.mTargetIds.add(Integer.valueOf(i5));
        }
        return this;
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public q mo5389clone() {
        try {
            q qVar = (q) super.clone();
            qVar.mAnimators = new ArrayList<>();
            qVar.mStartValues = new y();
            qVar.mEndValues = new y();
            qVar.mStartValuesList = null;
            qVar.mEndValuesList = null;
            return qVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public q excludeChildren(int i5, boolean z5) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i5, z5);
        return this;
    }

    public q excludeTarget(int i5, boolean z5) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i5, z5);
        return this;
    }

    public q removeTarget(int i5) {
        if (i5 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i5));
        }
        return this;
    }

    String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.mTargetIds.size() > 0) {
            for (int i5 = 0; i5 < this.mTargetIds.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargetIds.get(i5);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i6 = 0; i6 < this.mTargets.size(); i6++) {
                if (i6 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.mTargets.get(i6);
            }
        }
        return str3 + ")";
    }

    public q addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public q excludeChildren(Class<?> cls, boolean z5) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z5);
        return this;
    }

    public q excludeTarget(String str, boolean z5) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z5);
        return this;
    }

    public q removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public q excludeTarget(Class<?> cls, boolean z5) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z5);
        return this;
    }

    public q removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public q addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    void capturePropagationValues(x xVar) {
    }

    public void setPropagation(t tVar) {
    }

    @SuppressLint({"RestrictedApi"})
    public q(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f4523);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long m2146 = androidx.core.content.res.q.m2146(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (m2146 >= 0) {
            setDuration(m2146);
        }
        long m21462 = androidx.core.content.res.q.m2146(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (m21462 > 0) {
            setStartDelay(m21462);
        }
        int m2147 = androidx.core.content.res.q.m2147(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (m2147 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, m2147));
        }
        String m2148 = androidx.core.content.res.q.m2148(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m2148 != null) {
            setMatchOrder(parseMatchOrder(m2148));
        }
        obtainStyledAttributes.recycle();
    }
}
