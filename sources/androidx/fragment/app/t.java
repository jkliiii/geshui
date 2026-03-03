package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.f1;
import androidx.fragment.app.g0;
import androidx.lifecycle.l;
import androidx.lifecycle.s0;

/* compiled from: FragmentStateManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final m f3693;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final u f3694;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final e f3695;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f3696 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f3697 = -1;

    /* compiled from: FragmentStateManager.java */
    static /* synthetic */ class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f3700;

        static {
            int[] iArr = new int[l.b.values().length];
            f3700 = iArr;
            try {
                iArr[l.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3700[l.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3700[l.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3700[l.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    t(m mVar, u uVar, e eVar) {
        this.f3693 = mVar;
        this.f3694 = uVar;
        this.f3695 = eVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m4290(View view) {
        if (view == this.f3695.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3695.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Bundle m4291() {
        Bundle bundle = new Bundle();
        this.f3695.performSaveInstanceState(bundle);
        this.f3693.m4133(this.f3695, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3695.mView != null) {
            m4308();
        }
        if (this.f3695.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3695.mSavedViewState);
        }
        if (this.f3695.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3695.mSavedViewRegistryState);
        }
        if (!this.f3695.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3695.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m4292() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3695);
        }
        e eVar = this.f3695;
        eVar.performActivityCreated(eVar.mSavedFragmentState);
        m mVar = this.f3693;
        e eVar2 = this.f3695;
        mVar.m4124(eVar2, eVar2.mSavedFragmentState, false);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m4293() {
        int m4321 = this.f3694.m4321(this.f3695);
        e eVar = this.f3695;
        eVar.mContainer.addView(eVar.mView, m4321);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m4294() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3695);
        }
        e eVar = this.f3695;
        e eVar2 = eVar.mTarget;
        t tVar = null;
        if (eVar2 != null) {
            t m4324 = this.f3694.m4324(eVar2.mWho);
            if (m4324 == null) {
                throw new IllegalStateException("Fragment " + this.f3695 + " declared target fragment " + this.f3695.mTarget + " that does not belong to this FragmentManager!");
            }
            e eVar3 = this.f3695;
            eVar3.mTargetWho = eVar3.mTarget.mWho;
            eVar3.mTarget = null;
            tVar = m4324;
        } else {
            String str = eVar.mTargetWho;
            if (str != null && (tVar = this.f3694.m4324(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3695 + " declared target fragment " + this.f3695.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (tVar != null && (n.f3600 || tVar.m4302().mState < 1)) {
            tVar.m4303();
        }
        e eVar4 = this.f3695;
        eVar4.mHost = eVar4.mFragmentManager.m4183();
        e eVar5 = this.f3695;
        eVar5.mParentFragment = eVar5.mFragmentManager.m4186();
        this.f3693.m4130(this.f3695, false);
        this.f3695.performAttach();
        this.f3693.m4125(this.f3695, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    int m4295() {
        e eVar;
        ViewGroup viewGroup;
        e eVar2 = this.f3695;
        if (eVar2.mFragmentManager == null) {
            return eVar2.mState;
        }
        int i5 = this.f3697;
        int i6 = b.f3700[eVar2.mMaxState.ordinal()];
        if (i6 != 1) {
            i5 = i6 != 2 ? i6 != 3 ? i6 != 4 ? Math.min(i5, -1) : Math.min(i5, 0) : Math.min(i5, 1) : Math.min(i5, 5);
        }
        e eVar3 = this.f3695;
        if (eVar3.mFromLayout) {
            if (eVar3.mInLayout) {
                i5 = Math.max(this.f3697, 2);
                View view = this.f3695.mView;
                if (view != null && view.getParent() == null) {
                    i5 = Math.min(i5, 2);
                }
            } else {
                i5 = this.f3697 < 4 ? Math.min(i5, eVar3.mState) : Math.min(i5, 1);
            }
        }
        if (!this.f3695.mAdded) {
            i5 = Math.min(i5, 1);
        }
        g0.e.b m4069 = (!n.f3600 || (viewGroup = (eVar = this.f3695).mContainer) == null) ? null : g0.m4059(viewGroup, eVar.getParentFragmentManager()).m4069(this);
        if (m4069 == g0.e.b.ADDING) {
            i5 = Math.min(i5, 6);
        } else if (m4069 == g0.e.b.REMOVING) {
            i5 = Math.max(i5, 3);
        } else {
            e eVar4 = this.f3695;
            if (eVar4.mRemoving) {
                i5 = eVar4.isInBackStack() ? Math.min(i5, 1) : Math.min(i5, -1);
            }
        }
        e eVar5 = this.f3695;
        if (eVar5.mDeferStart && eVar5.mState < 5) {
            i5 = Math.min(i5, 4);
        }
        if (n.m4148(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i5 + " for " + this.f3695);
        }
        return i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m4296() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3695);
        }
        e eVar = this.f3695;
        if (eVar.mIsCreated) {
            eVar.restoreChildFragmentState(eVar.mSavedFragmentState);
            this.f3695.mState = 1;
            return;
        }
        this.f3693.m4131(eVar, eVar.mSavedFragmentState, false);
        e eVar2 = this.f3695;
        eVar2.performCreate(eVar2.mSavedFragmentState);
        m mVar = this.f3693;
        e eVar3 = this.f3695;
        mVar.m4126(eVar3, eVar3.mSavedFragmentState, false);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m4297() {
        String str;
        if (this.f3695.mFromLayout) {
            return;
        }
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3695);
        }
        e eVar = this.f3695;
        LayoutInflater performGetLayoutInflater = eVar.performGetLayoutInflater(eVar.mSavedFragmentState);
        e eVar2 = this.f3695;
        ViewGroup viewGroup = eVar2.mContainer;
        if (viewGroup == null) {
            int i5 = eVar2.mContainerId;
            if (i5 == 0) {
                viewGroup = null;
            } else {
                if (i5 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3695 + " for a container view with no id");
                }
                viewGroup = (ViewGroup) eVar2.mFragmentManager.m4179().mo4007(this.f3695.mContainerId);
                if (viewGroup == null) {
                    e eVar3 = this.f3695;
                    if (!eVar3.mRestored) {
                        try {
                            str = eVar3.getResources().getResourceName(this.f3695.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3695.mContainerId) + " (" + str + ") for fragment " + this.f3695);
                    }
                }
            }
        }
        e eVar4 = this.f3695;
        eVar4.mContainer = viewGroup;
        eVar4.performCreateView(performGetLayoutInflater, viewGroup, eVar4.mSavedFragmentState);
        View view = this.f3695.mView;
        if (view != null) {
            boolean z5 = false;
            view.setSaveFromParentEnabled(false);
            e eVar5 = this.f3695;
            eVar5.mView.setTag(g0.b.f7826, eVar5);
            if (viewGroup != null) {
                m4293();
            }
            e eVar6 = this.f3695;
            if (eVar6.mHidden) {
                eVar6.mView.setVisibility(8);
            }
            if (f1.m2903(this.f3695.mView)) {
                f1.m2827(this.f3695.mView);
            } else {
                View view2 = this.f3695.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f3695.performViewCreated();
            m mVar = this.f3693;
            e eVar7 = this.f3695;
            mVar.m4136(eVar7, eVar7.mView, eVar7.mSavedFragmentState, false);
            int visibility = this.f3695.mView.getVisibility();
            float alpha = this.f3695.mView.getAlpha();
            if (n.f3600) {
                this.f3695.setPostOnViewCreatedAlpha(alpha);
                e eVar8 = this.f3695;
                if (eVar8.mContainer != null && visibility == 0) {
                    View findFocus = eVar8.mView.findFocus();
                    if (findFocus != null) {
                        this.f3695.setFocusedView(findFocus);
                        if (n.m4148(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f3695);
                        }
                    }
                    this.f3695.mView.setAlpha(0.0f);
                }
            } else {
                e eVar9 = this.f3695;
                if (visibility == 0 && eVar9.mContainer != null) {
                    z5 = true;
                }
                eVar9.mIsNewlyAdded = z5;
            }
        }
        this.f3695.mState = 2;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m4298() {
        e m4317;
        if (n.m4148(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3695);
        }
        e eVar = this.f3695;
        boolean z5 = true;
        boolean z6 = eVar.mRemoving && !eVar.isInBackStack();
        if (!(z6 || this.f3694.m4326().m4285(this.f3695))) {
            String str = this.f3695.mTargetWho;
            if (str != null && (m4317 = this.f3694.m4317(str)) != null && m4317.mRetainInstance) {
                this.f3695.mTarget = m4317;
            }
            this.f3695.mState = 0;
            return;
        }
        k<?> kVar = this.f3695.mHost;
        if (kVar instanceof s0) {
            z5 = this.f3694.m4326().m4282();
        } else if (kVar.m4119() instanceof Activity) {
            z5 = true ^ ((Activity) kVar.m4119()).isChangingConfigurations();
        }
        if (z6 || z5) {
            this.f3694.m4326().m4277(this.f3695);
        }
        this.f3695.performDestroy();
        this.f3693.m4127(this.f3695, false);
        for (t tVar : this.f3694.m4322()) {
            if (tVar != null) {
                e m4302 = tVar.m4302();
                if (this.f3695.mWho.equals(m4302.mTargetWho)) {
                    m4302.mTarget = this.f3695;
                    m4302.mTargetWho = null;
                }
            }
        }
        e eVar2 = this.f3695;
        String str2 = eVar2.mTargetWho;
        if (str2 != null) {
            eVar2.mTarget = this.f3694.m4317(str2);
        }
        this.f3694.m4328(this);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m4299() {
        View view;
        if (n.m4148(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3695);
        }
        e eVar = this.f3695;
        ViewGroup viewGroup = eVar.mContainer;
        if (viewGroup != null && (view = eVar.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f3695.performDestroyView();
        this.f3693.m4137(this.f3695, false);
        e eVar2 = this.f3695;
        eVar2.mContainer = null;
        eVar2.mView = null;
        eVar2.mViewLifecycleOwner = null;
        eVar2.mViewLifecycleOwnerLiveData.mo4511(null);
        this.f3695.mInLayout = false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m4300() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3695);
        }
        this.f3695.performDetach();
        boolean z5 = false;
        this.f3693.m4128(this.f3695, false);
        e eVar = this.f3695;
        eVar.mState = -1;
        eVar.mHost = null;
        eVar.mParentFragment = null;
        eVar.mFragmentManager = null;
        if (eVar.mRemoving && !eVar.isInBackStack()) {
            z5 = true;
        }
        if (z5 || this.f3694.m4326().m4285(this.f3695)) {
            if (n.m4148(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3695);
            }
            this.f3695.initState();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m4301() {
        e eVar = this.f3695;
        if (eVar.mFromLayout && eVar.mInLayout && !eVar.mPerformedCreateView) {
            if (n.m4148(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3695);
            }
            e eVar2 = this.f3695;
            eVar2.performCreateView(eVar2.performGetLayoutInflater(eVar2.mSavedFragmentState), null, this.f3695.mSavedFragmentState);
            View view = this.f3695.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                e eVar3 = this.f3695;
                eVar3.mView.setTag(g0.b.f7826, eVar3);
                e eVar4 = this.f3695;
                if (eVar4.mHidden) {
                    eVar4.mView.setVisibility(8);
                }
                this.f3695.performViewCreated();
                m mVar = this.f3693;
                e eVar5 = this.f3695;
                mVar.m4136(eVar5, eVar5.mView, eVar5.mSavedFragmentState, false);
                this.f3695.mState = 2;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    e m4302() {
        return this.f3695;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m4303() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3696) {
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m4302());
                return;
            }
            return;
        }
        try {
            this.f3696 = true;
            while (true) {
                int m4295 = m4295();
                e eVar = this.f3695;
                int i5 = eVar.mState;
                if (m4295 == i5) {
                    if (n.f3600 && eVar.mHiddenChanged) {
                        if (eVar.mView != null && (viewGroup = eVar.mContainer) != null) {
                            g0 m4059 = g0.m4059(viewGroup, eVar.getParentFragmentManager());
                            if (this.f3695.mHidden) {
                                m4059.m4063(this);
                            } else {
                                m4059.m4065(this);
                            }
                        }
                        e eVar2 = this.f3695;
                        n nVar = eVar2.mFragmentManager;
                        if (nVar != null) {
                            nVar.m4193(eVar2);
                        }
                        e eVar3 = this.f3695;
                        eVar3.mHiddenChanged = false;
                        eVar3.onHiddenChanged(eVar3.mHidden);
                    }
                    return;
                }
                if (m4295 <= i5) {
                    switch (i5 - 1) {
                        case -1:
                            m4300();
                            break;
                        case 0:
                            m4298();
                            break;
                        case 1:
                            m4299();
                            this.f3695.mState = 1;
                            break;
                        case 2:
                            eVar.mInLayout = false;
                            eVar.mState = 2;
                            break;
                        case 3:
                            if (n.m4148(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3695);
                            }
                            e eVar4 = this.f3695;
                            if (eVar4.mView != null && eVar4.mSavedViewState == null) {
                                m4308();
                            }
                            e eVar5 = this.f3695;
                            if (eVar5.mView != null && (viewGroup3 = eVar5.mContainer) != null) {
                                g0.m4059(viewGroup3, eVar5.getParentFragmentManager()).m4064(this);
                            }
                            this.f3695.mState = 3;
                            break;
                        case 4:
                            m4311();
                            break;
                        case 5:
                            eVar.mState = 5;
                            break;
                        case 6:
                            m4304();
                            break;
                    }
                } else {
                    switch (i5 + 1) {
                        case 0:
                            m4294();
                            break;
                        case 1:
                            m4296();
                            break;
                        case 2:
                            m4301();
                            m4297();
                            break;
                        case 3:
                            m4292();
                            break;
                        case 4:
                            if (eVar.mView != null && (viewGroup2 = eVar.mContainer) != null) {
                                g0.m4059(viewGroup2, eVar.getParentFragmentManager()).m4062(g0.e.c.m4085(this.f3695.mView.getVisibility()), this);
                            }
                            this.f3695.mState = 4;
                            break;
                        case 5:
                            m4310();
                            break;
                        case 6:
                            eVar.mState = 6;
                            break;
                        case 7:
                            m4306();
                            break;
                    }
                }
            }
        } finally {
            this.f3696 = false;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    void m4304() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3695);
        }
        this.f3695.performPause();
        this.f3693.m4129(this.f3695, false);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m4305(ClassLoader classLoader) {
        Bundle bundle = this.f3695.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        e eVar = this.f3695;
        eVar.mSavedViewState = eVar.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        e eVar2 = this.f3695;
        eVar2.mSavedViewRegistryState = eVar2.mSavedFragmentState.getBundle("android:view_registry_state");
        e eVar3 = this.f3695;
        eVar3.mTargetWho = eVar3.mSavedFragmentState.getString("android:target_state");
        e eVar4 = this.f3695;
        if (eVar4.mTargetWho != null) {
            eVar4.mTargetRequestCode = eVar4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        e eVar5 = this.f3695;
        Boolean bool = eVar5.mSavedUserVisibleHint;
        if (bool != null) {
            eVar5.mUserVisibleHint = bool.booleanValue();
            this.f3695.mSavedUserVisibleHint = null;
        } else {
            eVar5.mUserVisibleHint = eVar5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        e eVar6 = this.f3695;
        if (eVar6.mUserVisibleHint) {
            return;
        }
        eVar6.mDeferStart = true;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m4306() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3695);
        }
        View focusedView = this.f3695.getFocusedView();
        if (focusedView != null && m4290(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (n.m4148(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3695);
                sb.append(" resulting in focused view ");
                sb.append(this.f3695.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3695.setFocusedView(null);
        this.f3695.performResume();
        this.f3693.m4132(this.f3695, false);
        e eVar = this.f3695;
        eVar.mSavedFragmentState = null;
        eVar.mSavedViewState = null;
        eVar.mSavedViewRegistryState = null;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    s m4307() {
        s sVar = new s(this.f3695);
        e eVar = this.f3695;
        if (eVar.mState <= -1 || sVar.f3692 != null) {
            sVar.f3692 = eVar.mSavedFragmentState;
        } else {
            Bundle m4291 = m4291();
            sVar.f3692 = m4291;
            if (this.f3695.mTargetWho != null) {
                if (m4291 == null) {
                    sVar.f3692 = new Bundle();
                }
                sVar.f3692.putString("android:target_state", this.f3695.mTargetWho);
                int i5 = this.f3695.mTargetRequestCode;
                if (i5 != 0) {
                    sVar.f3692.putInt("android:target_req_state", i5);
                }
            }
        }
        return sVar;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m4308() {
        if (this.f3695.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3695.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3695.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3695.mViewLifecycleOwner.m4034(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3695.mSavedViewRegistryState = bundle;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m4309(int i5) {
        this.f3697 = i5;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m4310() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3695);
        }
        this.f3695.performStart();
        this.f3693.m4134(this.f3695, false);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m4311() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3695);
        }
        this.f3695.performStop();
        this.f3693.m4135(this.f3695, false);
    }

    t(m mVar, u uVar, ClassLoader classLoader, j jVar, s sVar) {
        this.f3693 = mVar;
        this.f3694 = uVar;
        e mo4117 = jVar.mo4117(classLoader, sVar.f3680);
        this.f3695 = mo4117;
        Bundle bundle = sVar.f3689;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo4117.setArguments(sVar.f3689);
        mo4117.mWho = sVar.f3681;
        mo4117.mFromLayout = sVar.f3682;
        mo4117.mRestored = true;
        mo4117.mFragmentId = sVar.f3683;
        mo4117.mContainerId = sVar.f3684;
        mo4117.mTag = sVar.f3685;
        mo4117.mRetainInstance = sVar.f3686;
        mo4117.mRemoving = sVar.f3687;
        mo4117.mDetached = sVar.f3688;
        mo4117.mHidden = sVar.f3690;
        mo4117.mMaxState = l.b.values()[sVar.f3691];
        Bundle bundle2 = sVar.f3692;
        if (bundle2 != null) {
            mo4117.mSavedFragmentState = bundle2;
        } else {
            mo4117.mSavedFragmentState = new Bundle();
        }
        if (n.m4148(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo4117);
        }
    }

    /* compiled from: FragmentStateManager.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f3698;

        a(View view) {
            this.f3698 = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3698.removeOnAttachStateChangeListener(this);
            f1.m2827(this.f3698);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    t(m mVar, u uVar, e eVar, s sVar) {
        this.f3693 = mVar;
        this.f3694 = uVar;
        this.f3695 = eVar;
        eVar.mSavedViewState = null;
        eVar.mSavedViewRegistryState = null;
        eVar.mBackStackNesting = 0;
        eVar.mInLayout = false;
        eVar.mAdded = false;
        e eVar2 = eVar.mTarget;
        eVar.mTargetWho = eVar2 != null ? eVar2.mWho : null;
        eVar.mTarget = null;
        Bundle bundle = sVar.f3692;
        if (bundle != null) {
            eVar.mSavedFragmentState = bundle;
        } else {
            eVar.mSavedFragmentState = new Bundle();
        }
    }
}
