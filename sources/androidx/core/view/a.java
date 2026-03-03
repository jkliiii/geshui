package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.j0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0032a extends View.AccessibilityDelegate {

        /* renamed from: ʻ, reason: contains not printable characters */
        final a f2848;

        C0032a(a aVar) {
            this.f2848 = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2848.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            androidx.core.view.accessibility.m0 accessibilityNodeProvider = this.f2848.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m2720();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2848.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.j0 m2620 = androidx.core.view.accessibility.j0.m2620(accessibilityNodeInfo);
            m2620.m2661(f1.m2811(view));
            m2620.m2651(f1.m2887(view));
            m2620.m2656(f1.m2890(view));
            m2620.m2669(f1.m2873(view));
            this.f2848.onInitializeAccessibilityNodeInfo(view, m2620);
            m2620.m2679(accessibilityNodeInfo.getText(), view);
            List<j0.a> actionList = a.getActionList(view);
            for (int i5 = 0; i5 < actionList.size(); i5++) {
                m2620.m2662(actionList.get(i5));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2848.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2848.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            return this.f2848.performAccessibilityAction(view, i5, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i5) {
            this.f2848.sendAccessibilityEvent(view, i5);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2848.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static AccessibilityNodeProvider m2586(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2587(View.AccessibilityDelegate accessibilityDelegate, View view, int i5, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i5, bundle);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    static List<j0.a> getActionList(View view) {
        List<j0.a> list = (List) view.getTag(u.b.f11376);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m2629 = androidx.core.view.accessibility.j0.m2629(view.createAccessibilityNodeInfo().getText());
            for (int i5 = 0; m2629 != null && i5 < m2629.length; i5++) {
                if (clickableSpan.equals(m2629[i5])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i5, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(u.b.f11358);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i5)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public androidx.core.view.accessibility.m0 getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider m2586 = b.m2586(this.mOriginalDelegate, view);
        if (m2586 != null) {
            return new androidx.core.view.accessibility.m0(m2586);
        }
        return null;
    }

    View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j0 j0Var) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, j0Var.m2673());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        List<j0.a> actionList = getActionList(view);
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= actionList.size()) {
                break;
            }
            j0.a aVar = actionList.get(i6);
            if (aVar.m2706() == i5) {
                z5 = aVar.m2708(view, bundle);
                break;
            }
            i6++;
        }
        if (!z5) {
            z5 = b.m2587(this.mOriginalDelegate, view, i5, bundle);
        }
        return (z5 || i5 != u.b.f11347 || bundle == null) ? z5 : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i5) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i5);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0032a(this);
    }
}
