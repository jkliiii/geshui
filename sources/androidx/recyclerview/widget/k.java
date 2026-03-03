package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.m0;
import androidx.core.view.f1;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends androidx.core.view.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    final RecyclerView f4323;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final a f4324;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends androidx.core.view.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final k f4325;

        /* renamed from: ʼ, reason: contains not printable characters */
        private Map<View, androidx.core.view.a> f4326 = new WeakHashMap();

        public a(k kVar) {
            this.f4325 = kVar;
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4326.get(view);
            return aVar != null ? aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public m0 getAccessibilityNodeProvider(View view) {
            androidx.core.view.a aVar = this.f4326.get(view);
            return aVar != null ? aVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) j0 j0Var) {
            if (this.f4325.m5191() || this.f4325.f4323.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, j0Var);
                return;
            }
            this.f4325.f4323.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, j0Var);
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, j0Var);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, j0Var);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4326.get(viewGroup);
            return aVar != null ? aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i5, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f4325.m5191() || this.f4325.f4323.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i5, bundle);
            }
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i5, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i5, bundle)) {
                return true;
            }
            return this.f4325.f4323.getLayoutManager().performAccessibilityActionForItem(view, i5, bundle);
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEvent(View view, int i5) {
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i5);
            } else {
                super.sendAccessibilityEvent(view, i5);
            }
        }

        @Override // androidx.core.view.a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.view.a aVar = this.f4326.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        androidx.core.view.a m5192(View view) {
            return this.f4326.remove(view);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5193(View view) {
            androidx.core.view.a m2882 = f1.m2882(view);
            if (m2882 == null || m2882 == this) {
                return;
            }
            this.f4326.put(view, m2882);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f4323 = recyclerView;
        androidx.core.view.a m5190 = m5190();
        if (m5190 == null || !(m5190 instanceof a)) {
            this.f4324 = new a(this);
        } else {
            this.f4324 = (a) m5190;
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m5191()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) j0 j0Var) {
        super.onInitializeAccessibilityNodeInfo(view, j0Var);
        if (m5191() || this.f4323.getLayoutManager() == null) {
            return;
        }
        this.f4323.getLayoutManager().onInitializeAccessibilityNodeInfo(j0Var);
    }

    @Override // androidx.core.view.a
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i5, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i5, bundle)) {
            return true;
        }
        if (m5191() || this.f4323.getLayoutManager() == null) {
            return false;
        }
        return this.f4323.getLayoutManager().performAccessibilityAction(i5, bundle);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public androidx.core.view.a m5190() {
        return this.f4324;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean m5191() {
        return this.f4323.hasPendingAdapterUpdates();
    }
}
