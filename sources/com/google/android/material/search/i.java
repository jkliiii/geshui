package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.f1;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SearchBarAnimationHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i {

    /* renamed from: ʾ, reason: contains not printable characters */
    private Animator f6018;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Animator f6019;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f6020;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f6021;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<SearchBar.OnLoadAnimationCallback> f6015 = new LinkedHashSet();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Set<AnimatorListenerAdapter> f6016 = new LinkedHashSet();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Set<AnimatorListenerAdapter> f6017 = new LinkedHashSet();

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f6022 = true;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Animator f6023 = null;

    /* compiled from: SearchBarAnimationHelper.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.m7138(new g() { // from class: com.google.android.material.search.h
                @Override // com.google.android.material.search.i.g
                /* renamed from: ʻ */
                public final void mo7129(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                    onLoadAnimationCallback.onAnimationEnd();
                }
            });
        }
    }

    /* compiled from: SearchBarAnimationHelper.java */
    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6025;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Animator f6026;

        b(View view, Animator animator) {
            this.f6025 = view;
            this.f6026 = animator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6025.setVisibility(8);
            this.f6026.start();
        }
    }

    /* compiled from: SearchBarAnimationHelper.java */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f6023 = null;
        }
    }

    /* compiled from: SearchBarAnimationHelper.java */
    class d extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ SearchBar f6029;

        d(SearchBar searchBar) {
            this.f6029 = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f6020 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6029.setVisibility(4);
        }
    }

    /* compiled from: SearchBarAnimationHelper.java */
    class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f6023 = null;
        }
    }

    /* compiled from: SearchBarAnimationHelper.java */
    class f extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ SearchBar f6032;

        f(SearchBar searchBar) {
            this.f6032 = searchBar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6032.setVisibility(0);
            i.this.f6021 = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6032.stopOnLoadAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchBarAnimationHelper.java */
    interface g {
        /* renamed from: ʻ */
        void mo7129(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback);
    }

    i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public /* synthetic */ void m7131(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m7149(searchBar, view), m7142(searchBar, view, appBarLayout));
        animatorSet.addListener(new c());
        Iterator<AnimatorListenerAdapter> it = this.f6016.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z5) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f6023 = animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m7138(g gVar) {
        Iterator<SearchBar.OnLoadAnimationCallback> it = this.f6015.iterator();
        while (it.hasNext()) {
            gVar.mo7129(it.next());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private Animator m7139(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return m7143(searchBar, view, appBarLayout).setDuration(250L).addListener(new f(searchBar)).getCollapseAnimator();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private Animator m7140(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f6022 ? 250L : 0L);
        ofFloat.setStartDelay(this.f6022 ? 500L : 0L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(250L);
        ofFloat2.setStartDelay(750L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        return animatorSet;
    }

    /* renamed from: י, reason: contains not printable characters */
    private List<View> m7141(View view) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if ((!isLayoutRtl && (childAt instanceof ActionMenuView)) || (isLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private Animator m7142(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return m7143(searchBar, view, appBarLayout).setDuration(300L).addListener(new d(searchBar)).getExpandAnimator();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private ExpandCollapseAnimationHelper m7143(SearchBar searchBar, View view, AppBarLayout appBarLayout) {
        return new ExpandCollapseAnimationHelper(searchBar, view).setAdditionalUpdateListener(m7144(searchBar, view)).setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0).addEndAnchoredViews(m7141(view));
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ValueAnimator.AnimatorUpdateListener m7144(SearchBar searchBar, final View view) {
        final MaterialShapeDrawable createWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        createWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        createWithElevationOverlay.setElevation(f1.m2904(searchBar));
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                i.m7145(createWithElevationOverlay, view, valueAnimator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static /* synthetic */ void m7145(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        materialShapeDrawable.setInterpolation(1.0f - valueAnimator.getAnimatedFraction());
        f1.m2836(view, materialShapeDrawable);
        view.setAlpha(1.0f);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private List<View> m7146(SearchBar searchBar) {
        List<View> children = ViewUtils.getChildren(searchBar);
        if (searchBar.getCenterView() != null) {
            children.remove(searchBar.getCenterView());
        }
        return children;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private Animator m7148(SearchBar searchBar) {
        List<View> m7146 = m7146(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(m7146));
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Animator m7149(SearchBar searchBar, final View view) {
        List<View> m7146 = m7146(searchBar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(m7146));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(0.0f);
            }
        });
        ofFloat.setDuration(75L);
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return ofFloat;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Animator m7150(View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(view));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Animator m7151(TextView textView, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(250L);
        animatorSet.play(m7152(textView));
        if (view != null) {
            animatorSet.play(m7150(view));
        }
        return animatorSet;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private Animator m7152(TextView textView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(textView));
        ofFloat.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        ofFloat.setDuration(250L);
        return ofFloat;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    boolean m7153(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f6016.remove(animatorListenerAdapter);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    boolean m7154(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f6017.remove(animatorListenerAdapter);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    void m7155(boolean z5) {
        this.f6022 = z5;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    boolean m7156(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.f6015.remove(onLoadAnimationCallback);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    void m7157(final SearchBar searchBar, final View view, final AppBarLayout appBarLayout, final boolean z5) {
        Animator animator;
        if (m7164() && (animator = this.f6023) != null) {
            animator.cancel();
        }
        this.f6020 = true;
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.google.android.material.search.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5981.m7131(searchBar, view, appBarLayout, z5);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m7158(SearchBar searchBar) {
        Animator animator = this.f6018;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f6019;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).stopAnimation();
        }
        if (centerView != 0) {
            centerView.setAlpha(0.0f);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m7159(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f6017.add(animatorListenerAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m7160(SearchBar searchBar) {
        m7138(new g() { // from class: com.google.android.material.search.e
            @Override // com.google.android.material.search.i.g
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo7129(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
                onLoadAnimationCallback.onAnimationStart();
            }
        });
        TextView textView = searchBar.getTextView();
        View centerView = searchBar.getCenterView();
        View secondaryActionMenuItemView = ToolbarUtils.getSecondaryActionMenuItemView(searchBar);
        final Animator m7151 = m7151(textView, secondaryActionMenuItemView);
        m7151.addListener(new a());
        this.f6018 = m7151;
        textView.setAlpha(0.0f);
        if (secondaryActionMenuItemView != null) {
            secondaryActionMenuItemView.setAlpha(0.0f);
        }
        if (centerView instanceof AnimatableView) {
            ((AnimatableView) centerView).startAnimation(new AnimatableView.Listener() { // from class: com.google.android.material.search.f
                @Override // com.google.android.material.animation.AnimatableView.Listener
                public final void onAnimationEnd() {
                    m7151.start();
                }
            });
            return;
        }
        if (centerView == 0) {
            m7151.start();
            return;
        }
        centerView.setAlpha(0.0f);
        centerView.setVisibility(0);
        Animator m7140 = m7140(centerView);
        this.f6019 = m7140;
        m7140.addListener(new b(centerView, m7151));
        m7140.start();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m7161(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f6016.add(animatorListenerAdapter);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m7162(SearchBar.OnLoadAnimationCallback onLoadAnimationCallback) {
        this.f6015.add(onLoadAnimationCallback);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    void m7163(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean z5) {
        Animator animator;
        if (m7165() && (animator = this.f6023) != null) {
            animator.cancel();
        }
        this.f6021 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(m7139(searchBar, view, appBarLayout), m7148(searchBar));
        animatorSet.addListener(new e());
        Iterator<AnimatorListenerAdapter> it = this.f6017.iterator();
        while (it.hasNext()) {
            animatorSet.addListener(it.next());
        }
        if (z5) {
            animatorSet.setDuration(0L);
        }
        animatorSet.start();
        this.f6023 = animatorSet;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    boolean m7164() {
        return this.f6021;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    boolean m7165() {
        return this.f6020;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean m7166() {
        return this.f6022;
    }
}
