package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l implements LayoutInflater.Factory2 {

    /* renamed from: ʾ, reason: contains not printable characters */
    final n f3593;

    l(n nVar) {
        this.f3593 = nVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        t m4250;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3593);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f7832);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(g0.c.f7833);
        }
        int resourceId = obtainStyledAttributes.getResourceId(g0.c.f7834, -1);
        String string = obtainStyledAttributes.getString(g0.c.f7835);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !j.m4114(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        e m4175 = resourceId != -1 ? this.f3593.m4175(resourceId) : null;
        if (m4175 == null && string != null) {
            m4175 = this.f3593.m4176(string);
        }
        if (m4175 == null && id != -1) {
            m4175 = this.f3593.m4175(id);
        }
        if (m4175 == null) {
            m4175 = this.f3593.m4180().mo4117(context.getClassLoader(), attributeValue);
            m4175.mFromLayout = true;
            m4175.mFragmentId = resourceId != 0 ? resourceId : id;
            m4175.mContainerId = id;
            m4175.mTag = string;
            m4175.mInLayout = true;
            n nVar = this.f3593;
            m4175.mFragmentManager = nVar;
            m4175.mHost = nVar.m4183();
            m4175.onInflate(this.f3593.m4183().m4119(), attributeSet, m4175.mSavedFragmentState);
            m4250 = this.f3593.m4227(m4175);
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Fragment " + m4175 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (m4175.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            m4175.mInLayout = true;
            n nVar2 = this.f3593;
            m4175.mFragmentManager = nVar2;
            m4175.mHost = nVar2.m4183();
            m4175.onInflate(this.f3593.m4183().m4119(), attributeSet, m4175.mSavedFragmentState);
            m4250 = this.f3593.m4250(m4175);
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Retained Fragment " + m4175 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        m4175.mContainer = (ViewGroup) view;
        m4250.m4303();
        m4250.m4301();
        View view2 = m4175.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (m4175.mView.getTag() == null) {
            m4175.mView.setTag(string);
        }
        m4175.mView.addOnAttachStateChangeListener(new a(m4250));
        return m4175.mView;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ t f3594;

        a(t tVar) {
            this.f3594 = tVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e m4302 = this.f3594.m4302();
            this.f3594.m4303();
            g0.m4059((ViewGroup) m4302.mView.getParent(), l.this.f3593).m4067();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
