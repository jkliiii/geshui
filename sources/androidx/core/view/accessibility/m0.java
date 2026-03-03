package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AccessibilityNodeProviderCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Object f2907;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: ʻ, reason: contains not printable characters */
        final m0 f2908;

        a(m0 m0Var) {
            this.f2908 = m0Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
            j0 mo50 = this.f2908.mo50(i5);
            if (mo50 == null) {
                return null;
            }
            return mo50.m2673();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i5) {
            List<j0> m2719 = this.f2908.m2719(str, i5);
            if (m2719 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m2719.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(m2719.get(i6).m2673());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i5, int i6, Bundle bundle) {
            return this.f2908.mo52(i5, i6, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class b extends a {
        b(m0 m0Var) {
            super(m0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i5) {
            j0 mo51 = this.f2908.mo51(i5);
            if (mo51 == null) {
                return null;
            }
            return mo51.m2673();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    static class c extends b {
        c(m0 m0Var) {
            super(m0Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2908.m2718(i5, j0.m2620(accessibilityNodeInfo), str, bundle);
        }
    }

    public m0() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2907 = new c(this);
        } else {
            this.f2907 = new b(this);
        }
    }

    /* renamed from: ʼ */
    public j0 mo50(int i5) {
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public List<j0> m2719(String str, int i5) {
        return null;
    }

    /* renamed from: ʾ */
    public j0 mo51(int i5) {
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Object m2720() {
        return this.f2907;
    }

    /* renamed from: ˆ */
    public boolean mo52(int i5, int i6, Bundle bundle) {
        return false;
    }

    public m0(Object obj) {
        this.f2907 = obj;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m2718(int i5, j0 j0Var, String str, Bundle bundle) {
    }
}
