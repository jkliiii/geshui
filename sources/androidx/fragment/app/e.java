package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.k0;
import androidx.lifecycle.l;
import androidx.lifecycle.o0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Fragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, s0, androidx.lifecycle.j, n0.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    androidx.fragment.app.n mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    o0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.n mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.k<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.q mLifecycleRegistry;
    l.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    e mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    n0.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    e mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    e0 mViewLifecycleOwner;
    androidx.lifecycle.v<androidx.lifecycle.p> mViewLifecycleOwnerLiveData;
    String mWho;

    /* compiled from: Fragment.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.startPostponedEnterTransition();
        }
    }

    /* compiled from: Fragment.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.callStartTransitionListener(false);
        }
    }

    /* compiled from: Fragment.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g0 f3486;

        c(g0 g0Var) {
            this.f3486 = g0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3486.m4066();
        }
    }

    /* compiled from: Fragment.java */
    class d extends androidx.fragment.app.h {
        d() {
        }

        @Override // androidx.fragment.app.h
        /* renamed from: ʽ */
        public View mo4007(int i5) {
            View view = e.this.mView;
            if (view != null) {
                return view.findViewById(i5);
            }
            throw new IllegalStateException("Fragment " + e.this + " does not have a view");
        }

        @Override // androidx.fragment.app.h
        /* renamed from: ʾ */
        public boolean mo4008() {
            return e.this.mView != null;
        }
    }

    /* compiled from: Fragment.java */
    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    class C0047e implements androidx.lifecycle.n {
        C0047e() {
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            View view;
            if (aVar != l.a.ON_STOP || (view = e.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* compiled from: Fragment.java */
    class f implements k.a<Void, c.d> {
        f() {
        }

        @Override // k.a
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public c.d apply(Void r32) {
            e eVar = e.this;
            Object obj = eVar.mHost;
            return obj instanceof c.e ? ((c.e) obj).mo383() : eVar.requireActivity().mo383();
        }
    }

    /* compiled from: Fragment.java */
    class g implements k.a<Void, c.d> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ c.d f3491;

        g(c.d dVar) {
            this.f3491 = dVar;
        }

        @Override // k.a
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public c.d apply(Void r12) {
            return this.f3491;
        }
    }

    /* compiled from: Fragment.java */
    class h extends l {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ k.a f3493;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ AtomicReference f3494;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ d.a f3495;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c.b f3496;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k.a aVar, AtomicReference atomicReference, d.a aVar2, c.b bVar) {
            super(null);
            this.f3493 = aVar;
            this.f3494 = atomicReference;
            this.f3495 = aVar2;
            this.f3496 = bVar;
        }

        @Override // androidx.fragment.app.e.l
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo4022() {
            String generateActivityResultKey = e.this.generateActivityResultKey();
            this.f3494.set(((c.d) this.f3493.apply(null)).m5734(generateActivityResultKey, e.this, this.f3495, this.f3496));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: Fragment.java */
    class i<I> extends c.c<I> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ AtomicReference f3498;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ d.a f3499;

        i(AtomicReference atomicReference, d.a aVar) {
            this.f3498 = atomicReference;
            this.f3499 = aVar;
        }

        @Override // c.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4023(I i5, androidx.core.app.f fVar) {
            c.c cVar = (c.c) this.f3498.get();
            if (cVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar.mo4023(i5, fVar);
        }

        @Override // c.c
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo4024() {
            c.c cVar = (c.c) this.f3498.getAndSet(null);
            if (cVar != null) {
                cVar.mo4024();
            }
        }
    }

    /* compiled from: Fragment.java */
    static class j {

        /* renamed from: ʻ, reason: contains not printable characters */
        View f3501;

        /* renamed from: ʼ, reason: contains not printable characters */
        Animator f3502;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f3503;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f3504;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f3505;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f3506;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f3507;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f3508;

        /* renamed from: ˊ, reason: contains not printable characters */
        ArrayList<String> f3509;

        /* renamed from: ˋ, reason: contains not printable characters */
        ArrayList<String> f3510;

        /* renamed from: ˎ, reason: contains not printable characters */
        Object f3511 = null;

        /* renamed from: ˏ, reason: contains not printable characters */
        Object f3512;

        /* renamed from: ˑ, reason: contains not printable characters */
        Object f3513;

        /* renamed from: י, reason: contains not printable characters */
        Object f3514;

        /* renamed from: ـ, reason: contains not printable characters */
        Object f3515;

        /* renamed from: ٴ, reason: contains not printable characters */
        Object f3516;

        /* renamed from: ᐧ, reason: contains not printable characters */
        Boolean f3517;

        /* renamed from: ᴵ, reason: contains not printable characters */
        Boolean f3518;

        /* renamed from: ᵎ, reason: contains not printable characters */
        float f3519;

        /* renamed from: ᵔ, reason: contains not printable characters */
        View f3520;

        /* renamed from: ᵢ, reason: contains not printable characters */
        boolean f3521;

        /* renamed from: ⁱ, reason: contains not printable characters */
        m f3522;

        /* renamed from: ﹳ, reason: contains not printable characters */
        boolean f3523;

        j() {
            Object obj = e.USE_DEFAULT_TRANSITION;
            this.f3512 = obj;
            this.f3513 = null;
            this.f3514 = obj;
            this.f3515 = null;
            this.f3516 = obj;
            this.f3519 = 1.0f;
            this.f3520 = null;
        }
    }

    /* compiled from: Fragment.java */
    public static class k extends RuntimeException {
        public k(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* compiled from: Fragment.java */
    private static abstract class l {
        private l() {
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        /* renamed from: ʻ */
        abstract void mo4022();
    }

    /* compiled from: Fragment.java */
    interface m {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo4025();

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo4026();
    }

    /* compiled from: Fragment.java */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        final Bundle f3524;

        /* compiled from: Fragment.java */
        class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public n[] newArray(int i5) {
                return new n[i5];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3524 = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeBundle(this.f3524);
        }
    }

    public e() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new o();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = l.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.v<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        l.b bVar = this.mMaxState;
        return (bVar == l.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mSavedStateRegistryController = n0.e.m10410(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static e instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> c.c<I> prepareCallInternal(d.a<I, O> aVar, k.a<Void, c.d> aVar2, c.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new h(aVar2, atomicReference, aVar, bVar));
            return new i(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.mo4022();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    void callStartTransitionListener(boolean z5) {
        ViewGroup viewGroup;
        androidx.fragment.app.n nVar;
        j jVar = this.mAnimationInfo;
        m mVar = null;
        if (jVar != null) {
            jVar.f3521 = false;
            m mVar2 = jVar.f3522;
            jVar.f3522 = null;
            mVar = mVar2;
        }
        if (mVar != null) {
            mVar.mo4025();
            return;
        }
        if (!androidx.fragment.app.n.f3600 || this.mView == null || (viewGroup = this.mContainer) == null || (nVar = this.mFragmentManager) == null) {
            return;
        }
        g0 m4059 = g0.m4059(viewGroup, nVar);
        m4059.m4071();
        if (z5) {
            this.mHost.m4120().post(new c(m4059));
        } else {
            m4059.m4066();
        }
    }

    androidx.fragment.app.h createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        e targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.m4518(this).mo4519(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m4252(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    e findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.m4177(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.f getActivity() {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.f) kVar.m4118();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3518) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f3517) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3501;
    }

    Animator getAnimator() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3502;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final androidx.fragment.app.n getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return kVar.m4119();
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ j0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.i.m4432(this);
    }

    public o0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && androidx.fragment.app.n.m4148(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new k0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3504;
    }

    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3511;
    }

    androidx.core.app.t getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3505;
    }

    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3513;
    }

    androidx.core.app.t getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3520;
    }

    @Deprecated
    public final androidx.fragment.app.n getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar == null) {
            return null;
        }
        return kVar.mo4045();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.l getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.m4518(this);
    }

    int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3508;
    }

    public final e getParentFragment() {
        return this.mParentFragment;
    }

    public final androidx.fragment.app.n getParentFragmentManager() {
        androidx.fragment.app.n nVar = this.mFragmentManager;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3503;
    }

    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3506;
    }

    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f3507;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f3519;
    }

    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3514;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3512;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // n0.f
    public final n0.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m10411();
    }

    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f3515;
    }

    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f3516;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f3509) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f3510) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i5) {
        return getResources().getString(i5);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final e getTargetFragment() {
        String str;
        e eVar = this.mTarget;
        if (eVar != null) {
            return eVar;
        }
        androidx.fragment.app.n nVar = this.mFragmentManager;
        if (nVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return nVar.m4174(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i5) {
        return getResources().getText(i5);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.p getViewLifecycleOwner() {
        e0 e0Var = this.mViewLifecycleOwner;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public androidx.lifecycle.t<androidx.lifecycle.p> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.s0
    public r0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != l.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.m4190(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new o();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3523;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        androidx.fragment.app.n nVar;
        return this.mMenuVisible && ((nVar = this.mFragmentManager) == null || nVar.m4195(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f3521;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    final boolean isRemovingParent() {
        e parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        androidx.fragment.app.n nVar = this.mFragmentManager;
        if (nVar == null) {
            return false;
        }
        return nVar.m4198();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.m4206();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i5, int i6, Intent intent) {
        if (androidx.fragment.app.n.m4148(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i5 + " resultCode: " + i6 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        androidx.fragment.app.k<?> kVar = this.mHost;
        Activity m4118 = kVar == null ? null : kVar.m4118();
        if (m4118 != null) {
            this.mCalled = false;
            onAttach(m4118);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.m4197(1)) {
            return;
        }
        this.mChildFragmentManager.m4246();
    }

    public Animation onCreateAnimation(int i5, boolean z5, int i6) {
        return null;
    }

    public Animator onCreateAnimator(int i5, boolean z5, int i6) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            return layoutInflater.inflate(i5, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        androidx.fragment.app.k<?> kVar = this.mHost;
        Activity m4118 = kVar == null ? null : kVar.m4118();
        if (m4118 != null) {
            this.mCalled = false;
            onInflate(m4118, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m4206();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m4253();
        } else {
            throw new i0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4022();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m4234(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m4119());
        if (this.mCalled) {
            this.mFragmentManager.m4226(this);
            this.mChildFragmentManager.m4254();
        } else {
            throw new i0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m4255(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4256(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m4206();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4444(new C0047e());
        this.mSavedStateRegistryController.m10413(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m4485(l.a.ON_CREATE);
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z5 = true;
        }
        return z5 | this.mChildFragmentManager.m4248(menu, menuInflater);
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m4206();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new e0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.m4032()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.m4031();
            t0.m4515(this.mView, this.mViewLifecycleOwner);
            u0.m4516(this.mView, this.mViewLifecycleOwner);
            n0.g.m10416(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo4511(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.m4171();
        this.mLifecycleRegistry.m4485(l.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.m4213();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo4445().m4455(l.b.CREATED)) {
            this.mViewLifecycleOwner.m4030(l.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.m4518(this).mo4520();
            this.mPerformedCreateView = false;
        } else {
            throw new i0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.m4194()) {
                return;
            }
            this.mChildFragmentManager.m4171();
            this.mChildFragmentManager = new o();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m4189();
    }

    void performMultiWindowModeChanged(boolean z5) {
        onMultiWindowModeChanged(z5);
        this.mChildFragmentManager.m4228(z5);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m4244(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m4230(menu);
    }

    void performPause() {
        this.mChildFragmentManager.m4232();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4030(l.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m4485(l.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z5) {
        onPictureInPictureModeChanged(z5);
        this.mChildFragmentManager.m4237(z5);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z5 = true;
        }
        return z5 | this.mChildFragmentManager.m4235(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean m4196 = this.mFragmentManager.m4196(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m4196) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m4196);
            onPrimaryNavigationFragmentChanged(m4196);
            this.mChildFragmentManager.m4240();
        }
    }

    void performResume() {
        this.mChildFragmentManager.m4206();
        this.mChildFragmentManager.m4172(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new i0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.q qVar = this.mLifecycleRegistry;
        l.a aVar = l.a.ON_RESUME;
        qVar.m4485(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4030(aVar);
        }
        this.mChildFragmentManager.m4239();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m10414(bundle);
        Parcelable m4219 = this.mChildFragmentManager.m4219();
        if (m4219 != null) {
            bundle.putParcelable("android:support:fragments", m4219);
        }
    }

    void performStart() {
        this.mChildFragmentManager.m4206();
        this.mChildFragmentManager.m4172(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new i0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.q qVar = this.mLifecycleRegistry;
        l.a aVar = l.a.ON_START;
        qVar.m4485(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4030(aVar);
        }
        this.mChildFragmentManager.m4242();
    }

    void performStop() {
        this.mChildFragmentManager.m4243();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4030(l.a.ON_STOP);
        }
        this.mLifecycleRegistry.m4485(l.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m4249();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f3521 = true;
    }

    public final <I, O> c.c<I> registerForActivityResult(d.a<I, O> aVar, c.b<O> bVar) {
        return prepareCallInternal(aVar, new f(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i5) {
        if (this.mHost != null) {
            getParentFragmentManager().m4199(this, strArr, i5);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final androidx.fragment.app.f requireActivity() {
        androidx.fragment.app.f activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final androidx.fragment.app.n requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final e requireParentFragment() {
        e parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.m4218(parcelable);
        this.mChildFragmentManager.m4246();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4033(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m4030(l.a.ON_CREATE);
            }
        } else {
            throw new i0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z5) {
        ensureAnimationInfo().f3518 = Boolean.valueOf(z5);
    }

    public void setAllowReturnTransitionOverlap(boolean z5) {
        ensureAnimationInfo().f3517 = Boolean.valueOf(z5);
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f3501 = view;
    }

    void setAnimations(int i5, int i6, int i7, int i8) {
        if (this.mAnimationInfo == null && i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            return;
        }
        ensureAnimationInfo().f3504 = i5;
        ensureAnimationInfo().f3505 = i6;
        ensureAnimationInfo().f3506 = i7;
        ensureAnimationInfo().f3507 = i8;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f3502 = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.t tVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f3511 = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.t tVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f3513 = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f3520 = view;
    }

    public void setHasOptionsMenu(boolean z5) {
        if (this.mHasMenu != z5) {
            this.mHasMenu = z5;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo4049();
        }
    }

    void setHideReplaced(boolean z5) {
        ensureAnimationInfo().f3523 = z5;
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f3524) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z5) {
        if (this.mMenuVisible != z5) {
            this.mMenuVisible = z5;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo4049();
            }
        }
    }

    void setNextTransition(int i5) {
        if (this.mAnimationInfo == null && i5 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f3508 = i5;
    }

    void setOnStartEnterTransitionListener(m mVar) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        m mVar2 = jVar.f3522;
        if (mVar == mVar2) {
            return;
        }
        if (mVar != null && mVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (jVar.f3521) {
            jVar.f3522 = mVar;
        }
        if (mVar != null) {
            mVar.mo4026();
        }
    }

    void setPopDirection(boolean z5) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f3503 = z5;
    }

    void setPostOnViewCreatedAlpha(float f5) {
        ensureAnimationInfo().f3519 = f5;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f3514 = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z5) {
        this.mRetainInstance = z5;
        androidx.fragment.app.n nVar = this.mFragmentManager;
        if (nVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z5) {
            nVar.m4231(this);
        } else {
            nVar.m4217(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f3512 = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f3515 = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f3509 = arrayList;
        jVar.f3510 = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f3516 = obj;
    }

    @Deprecated
    public void setTargetFragment(e eVar, int i5) {
        androidx.fragment.app.n nVar = this.mFragmentManager;
        androidx.fragment.app.n nVar2 = eVar != null ? eVar.mFragmentManager : null;
        if (nVar != null && nVar2 != null && nVar != nVar2) {
            throw new IllegalArgumentException("Fragment " + eVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (e eVar2 = eVar; eVar2 != null; eVar2 = eVar2.getTargetFragment()) {
            if (eVar2.equals(this)) {
                throw new IllegalArgumentException("Setting " + eVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (eVar == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || eVar.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = eVar;
        } else {
            this.mTargetWho = eVar.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i5;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z5) {
        if (!this.mUserVisibleHint && z5 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            androidx.fragment.app.n nVar = this.mFragmentManager;
            nVar.m4208(nVar.m4250(this));
        }
        this.mUserVisibleHint = z5;
        this.mDeferStart = this.mState < 5 && !z5;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z5);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar != null) {
            return kVar.mo4048(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5) {
        startActivityForResult(intent, i5, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (androidx.fragment.app.n.m4148(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i5 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m4201(this, intentSender, i5, intent, i6, i7, i8, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f3521) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f3521 = false;
        } else if (Looper.myLooper() != this.mHost.m4120().getLooper()) {
            this.mHost.m4120().postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static e instantiate(Context context, String str, Bundle bundle) {
        try {
            e newInstance = androidx.fragment.app.j.m4116(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e5) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (InstantiationException e6) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e6);
        } catch (NoSuchMethodException e7) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e7);
        } catch (InvocationTargetException e8) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e8);
        }
    }

    public final String getString(int i5, Object... objArr) {
        return getResources().getString(i5, objArr);
    }

    public final void postponeEnterTransition(long j5, TimeUnit timeUnit) {
        ensureAnimationInfo().f3521 = true;
        androidx.fragment.app.n nVar = this.mFragmentManager;
        Handler m4120 = nVar != null ? nVar.m4183().m4120() : new Handler(Looper.getMainLooper());
        m4120.removeCallbacks(this.mPostponedDurationRunnable);
        m4120.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j5));
    }

    public final <I, O> c.c<I> registerForActivityResult(d.a<I, O> aVar, c.d dVar, c.b<O> bVar) {
        return prepareCallInternal(aVar, new g(dVar), bVar);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar != null) {
            kVar.m4122(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i5, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m4200(this, intent, i5, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        androidx.fragment.app.k<?> kVar = this.mHost;
        if (kVar != null) {
            LayoutInflater mo4046 = kVar.mo4046();
            androidx.core.view.t.m3318(mo4046, this.mChildFragmentManager.m4184());
            return mo4046;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (androidx.fragment.app.n.m4148(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public e(int i5) {
        this();
        this.mContentLayoutId = i5;
    }

    @Deprecated
    public void onAttachFragment(e eVar) {
    }

    public void onHiddenChanged(boolean z5) {
    }

    public void onMultiWindowModeChanged(boolean z5) {
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z5) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z5) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onDestroyOptionsMenu() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
    }
}
