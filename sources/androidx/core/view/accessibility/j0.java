package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int f2853;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AccessibilityNodeInfo f2854;

    /* renamed from: ʼ, reason: contains not printable characters */
    public int f2855 = -1;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f2856 = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class a {

        /* renamed from: ʻʻ, reason: contains not printable characters */
        public static final a f2857;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        public static final a f2858;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        public static final a f2859;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public static final a f2860;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        public static final a f2862;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        public static final a f2864;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        public static final a f2866;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        public static final a f2868;

        /* renamed from: ˊˊ, reason: contains not printable characters */
        public static final a f2870;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public static final a f2872;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        public static final a f2874;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        public static final a f2876;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        public static final a f2878;

        /* renamed from: יי, reason: contains not printable characters */
        public static final a f2880;

        /* renamed from: ــ, reason: contains not printable characters */
        public static final a f2882;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        public static final a f2885;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        public static final a f2887;

        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        public static final a f2889;

        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        public static final a f2891;

        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        public static final a f2893;

        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        public static final a f2895;

        /* renamed from: ʻ, reason: contains not printable characters */
        final Object f2900;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f2901;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Class<? extends o0.a> f2902;

        /* renamed from: ʾ, reason: contains not printable characters */
        protected final o0 f2903;

        /* renamed from: ʿ, reason: contains not printable characters */
        public static final a f2861 = new a(1, null);

        /* renamed from: ˆ, reason: contains not printable characters */
        public static final a f2863 = new a(2, null);

        /* renamed from: ˈ, reason: contains not printable characters */
        public static final a f2865 = new a(4, null);

        /* renamed from: ˉ, reason: contains not printable characters */
        public static final a f2867 = new a(8, null);

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final a f2869 = new a(16, null);

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final a f2871 = new a(32, null);

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final a f2873 = new a(64, null);

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final a f2875 = new a(128, null);

        /* renamed from: ˑ, reason: contains not printable characters */
        public static final a f2877 = new a(256, (CharSequence) null, (Class<? extends o0.a>) o0.b.class);

        /* renamed from: י, reason: contains not printable characters */
        public static final a f2879 = new a(512, (CharSequence) null, (Class<? extends o0.a>) o0.b.class);

        /* renamed from: ـ, reason: contains not printable characters */
        public static final a f2881 = new a(1024, (CharSequence) null, (Class<? extends o0.a>) o0.c.class);

        /* renamed from: ٴ, reason: contains not printable characters */
        public static final a f2883 = new a(2048, (CharSequence) null, (Class<? extends o0.a>) o0.c.class);

        /* renamed from: ᐧ, reason: contains not printable characters */
        public static final a f2884 = new a(4096, null);

        /* renamed from: ᴵ, reason: contains not printable characters */
        public static final a f2886 = new a(8192, null);

        /* renamed from: ᵎ, reason: contains not printable characters */
        public static final a f2888 = new a(16384, null);

        /* renamed from: ᵔ, reason: contains not printable characters */
        public static final a f2890 = new a(32768, null);

        /* renamed from: ᵢ, reason: contains not printable characters */
        public static final a f2892 = new a(65536, null);

        /* renamed from: ⁱ, reason: contains not printable characters */
        public static final a f2894 = new a(131072, (CharSequence) null, (Class<? extends o0.a>) o0.g.class);

        /* renamed from: ﹳ, reason: contains not printable characters */
        public static final a f2896 = new a(262144, null);

        /* renamed from: ﹶ, reason: contains not printable characters */
        public static final a f2897 = new a(524288, null);

        /* renamed from: ﾞ, reason: contains not printable characters */
        public static final a f2898 = new a(1048576, null);

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        public static final a f2899 = new a(2097152, (CharSequence) null, (Class<? extends o0.a>) o0.h.class);

        static {
            int i5 = Build.VERSION.SDK_INT;
            f2885 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f2887 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, o0.e.class);
            f2857 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f2859 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f2858 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f2862 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f2860 = new a(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f2882 = new a(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f2864 = new a(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f2868 = new a(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f2866 = new a(i5 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f2872 = new a(i5 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, o0.f.class);
            f2870 = new a(i5 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, o0.d.class);
            f2876 = new a(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f2874 = new a(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f2878 = new a(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f2891 = new a(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f2880 = new a(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f2889 = new a(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f2893 = new a(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f2895 = new a(i5 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i5, CharSequence charSequence) {
            this(null, i5, charSequence, null, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f2900;
            return obj2 == null ? aVar.f2900 == null : obj2.equals(aVar.f2900);
        }

        public int hashCode() {
            Object obj = this.f2900;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m2705(CharSequence charSequence, o0 o0Var) {
            return new a(null, this.f2901, charSequence, o0Var, this.f2902);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m2706() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2900).getId();
            }
            return 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public CharSequence m2707() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f2900).getLabel();
            }
            return null;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m2708(View view, Bundle bundle) {
            if (this.f2903 == null) {
                return false;
            }
            Class<? extends o0.a> cls = this.f2902;
            o0.a aVar = null;
            if (cls != null) {
                try {
                    o0.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        newInstance.m2732(bundle);
                        aVar = newInstance;
                    } catch (Exception e5) {
                        e = e5;
                        aVar = newInstance;
                        Class<? extends o0.a> cls2 = this.f2902;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f2903.mo2731(view, aVar);
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            }
            return this.f2903.mo2731(view, aVar);
        }

        public a(int i5, CharSequence charSequence, o0 o0Var) {
            this(null, i5, charSequence, o0Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i5, CharSequence charSequence, Class<? extends o0.a> cls) {
            this(null, i5, charSequence, null, cls);
        }

        a(Object obj, int i5, CharSequence charSequence, o0 o0Var, Class<? extends o0.a> cls) {
            this.f2901 = i5;
            this.f2903 = o0Var;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f2900 = new AccessibilityNodeInfo.AccessibilityAction(i5, charSequence);
            } else {
                this.f2900 = obj;
            }
            this.f2902 = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Object f2904;

        b(Object obj) {
            this.f2904 = obj;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static b m2709(int i5, int i6, boolean z5) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i6, z5));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static b m2710(int i5, int i6, boolean z5, int i7) {
            return Build.VERSION.SDK_INT >= 21 ? new b(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i6, z5, i7)) : new b(AccessibilityNodeInfo.CollectionInfo.obtain(i5, i6, z5));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Object f2905;

        c(Object obj) {
            this.f2905 = obj;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static c m2711(int i5, int i6, int i7, int i8, boolean z5, boolean z6) {
            return Build.VERSION.SDK_INT >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i6, i7, i8, z5, z6)) : new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i5, i6, i7, i8, z5));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    public static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Object f2906;

        d(Object obj) {
            this.f2906 = obj;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static d m2712(int i5, float f5, float f6, float f7) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i5, f5, f6, f7));
        }
    }

    private j0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2854 = accessibilityNodeInfo;
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    public static j0 m2620(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new j0(accessibilityNodeInfo);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m2621(ClickableSpan clickableSpan, Spanned spanned, int i5) {
        m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i5));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m2622() {
        this.f2854.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f2854.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f2854.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f2854.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private List<Integer> m2623(String str) {
        ArrayList<Integer> integerArrayList = this.f2854.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2854.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static String m2624(int i5) {
        if (i5 == 1) {
            return "ACTION_FOCUS";
        }
        if (i5 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i5) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i5) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i5) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i5) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static j0 m2625() {
        return m2620(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m2626(int i5) {
        Bundle m2696 = m2696();
        return m2696 != null && (m2696.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i5) == i5;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static j0 m2627(View view) {
        return m2620(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private void m2628(int i5, boolean z5) {
        Bundle m2696 = m2696();
        if (m2696 != null) {
            int i6 = m2696.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i5 ^ (-1));
            if (!z5) {
                i5 = 0;
            }
            m2696.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i5 | i6);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static ClickableSpan[] m2629(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int m2630(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                if (clickableSpan.equals(sparseArray.valueAt(i5).get())) {
                    return sparseArray.keyAt(i5);
                }
            }
        }
        int i6 = f2853;
        f2853 = i6 + 1;
        return i6;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private SparseArray<WeakReference<ClickableSpan>> m2631(View view) {
        SparseArray<WeakReference<ClickableSpan>> m2633 = m2633(view);
        if (m2633 != null) {
            return m2633;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(u.b.f11358, sparseArray);
        return sparseArray;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static j0 m2632(j0 j0Var) {
        return m2620(AccessibilityNodeInfo.obtain(j0Var.f2854));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private SparseArray<WeakReference<ClickableSpan>> m2633(View view) {
        return (SparseArray) view.getTag(u.b.f11358);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private void m2634(View view) {
        SparseArray<WeakReference<ClickableSpan>> m2633 = m2633(view);
        if (m2633 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < m2633.size(); i5++) {
                if (m2633.valueAt(i5).get() == null) {
                    arrayList.add(Integer.valueOf(i5));
                }
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                m2633.remove(((Integer) arrayList.get(i6)).intValue());
            }
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean m2635() {
        return !m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2854;
        if (accessibilityNodeInfo == null) {
            if (j0Var.f2854 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(j0Var.f2854)) {
            return false;
        }
        return this.f2856 == j0Var.f2856 && this.f2855 == j0Var.f2855;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2854;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m2688(rect);
        sb.append("; boundsInParent: " + rect);
        m2689(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m2698());
        sb.append("; className: ");
        sb.append(m2693());
        sb.append("; text: ");
        sb.append(m2700());
        sb.append("; contentDescription: ");
        sb.append(m2694());
        sb.append("; viewId: ");
        sb.append(m2704());
        sb.append("; uniqueId: ");
        sb.append(m2702());
        sb.append("; checkable: ");
        sb.append(m2637());
        sb.append("; checked: ");
        sb.append(m2675());
        sb.append("; focusable: ");
        sb.append(m2677());
        sb.append("; focused: ");
        sb.append(m2692());
        sb.append("; selected: ");
        sb.append(m2685());
        sb.append("; clickable: ");
        sb.append(m2664());
        sb.append("; longClickable: ");
        sb.append(m2680());
        sb.append("; enabled: ");
        sb.append(m2678());
        sb.append("; password: ");
        sb.append(m2682());
        sb.append("; scrollable: " + m2681());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> m2683 = m2683();
            for (int i5 = 0; i5 < m2683.size(); i5++) {
                a aVar = m2683.get(i5);
                String m2624 = m2624(aVar.m2706());
                if (m2624.equals("ACTION_UNKNOWN") && aVar.m2707() != null) {
                    m2624 = aVar.m2707().toString();
                }
                sb.append(m2624);
                if (i5 != m2683.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int m2686 = m2686();
            while (m2686 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m2686);
                m2686 &= numberOfTrailingZeros ^ (-1);
                sb.append(m2624(numberOfTrailingZeros));
                if (m2686 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m2636(int i5) {
        this.f2854.addAction(i5);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean m2637() {
        return this.f2854.isCheckable();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public void m2638(Rect rect) {
        this.f2854.setBoundsInScreen(rect);
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public void m2639(boolean z5) {
        this.f2854.setCheckable(z5);
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public void m2640(boolean z5) {
        this.f2854.setChecked(z5);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public void m2641(CharSequence charSequence) {
        this.f2854.setClassName(charSequence);
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public void m2642(boolean z5) {
        this.f2854.setClickable(z5);
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public void m2643(Object obj) {
        this.f2854.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2904);
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public void m2644(Object obj) {
        this.f2854.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f2905);
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public void m2645(CharSequence charSequence) {
        this.f2854.setContentDescription(charSequence);
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    public void m2646(boolean z5) {
        this.f2854.setDismissable(z5);
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public void m2647(boolean z5) {
        this.f2854.setEnabled(z5);
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public void m2648(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2854.setError(charSequence);
        }
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public void m2649(boolean z5) {
        this.f2854.setFocusable(z5);
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    public void m2650(boolean z5) {
        this.f2854.setFocused(z5);
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public void m2651(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2854.setHeading(z5);
        } else {
            m2628(2, z5);
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public void m2652(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2854.setHintText(charSequence);
        } else {
            this.f2854.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public void m2653(View view) {
        this.f2854.setLabelFor(view);
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    public void m2654(int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2854.setMaxTextLength(i5);
        }
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public void m2655(CharSequence charSequence) {
        this.f2854.setPackageName(charSequence);
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    public void m2656(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2854.setPaneTitle(charSequence);
        } else {
            this.f2854.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    public void m2657(View view) {
        this.f2855 = -1;
        this.f2854.setParent(view);
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    public void m2658(View view, int i5) {
        this.f2855 = i5;
        this.f2854.setParent(view, i5);
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public void m2659(d dVar) {
        this.f2854.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f2906);
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public void m2660(CharSequence charSequence) {
        this.f2854.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    public void m2661(boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2854.setScreenReaderFocusable(z5);
        } else {
            m2628(1, z5);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m2662(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2854.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2900);
        }
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    public void m2663(boolean z5) {
        this.f2854.setScrollable(z5);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public boolean m2664() {
        return this.f2854.isClickable();
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public void m2665(boolean z5) {
        this.f2854.setSelected(z5);
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public void m2666(boolean z5) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2854.setShowingHintText(z5);
        } else {
            m2628(4, z5);
        }
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    public void m2667(View view) {
        this.f2856 = -1;
        this.f2854.setSource(view);
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    public void m2668(View view, int i5) {
        this.f2856 = i5;
        this.f2854.setSource(view, i5);
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public void m2669(CharSequence charSequence) {
        if (androidx.core.os.a.m2403()) {
            this.f2854.setStateDescription(charSequence);
        } else {
            this.f2854.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    public void m2670(CharSequence charSequence) {
        this.f2854.setText(charSequence);
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    public void m2671(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f2854.setTraversalAfter(view);
        }
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    public void m2672(boolean z5) {
        this.f2854.setVisibleToUser(z5);
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    public AccessibilityNodeInfo m2673() {
        return this.f2854;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m2674(View view) {
        this.f2854.addChild(view);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public boolean m2675() {
        return this.f2854.isChecked();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m2676(View view, int i5) {
        this.f2854.addChild(view, i5);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public boolean m2677() {
        return this.f2854.isFocusable();
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public boolean m2678() {
        return this.f2854.isEnabled();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m2679(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m2622();
            m2634(view);
            ClickableSpan[] m2629 = m2629(charSequence);
            if (m2629 == null || m2629.length <= 0) {
                return;
            }
            m2696().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", u.b.f11347);
            SparseArray<WeakReference<ClickableSpan>> m2631 = m2631(view);
            for (int i5 = 0; i5 < m2629.length; i5++) {
                int m2630 = m2630(m2629[i5], m2631);
                m2631.put(m2630, new WeakReference<>(m2629[i5]));
                m2621(m2629[i5], (Spanned) charSequence, m2630);
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public boolean m2680() {
        return this.f2854.isLongClickable();
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public boolean m2681() {
        return this.f2854.isScrollable();
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public boolean m2682() {
        return this.f2854.isPassword();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public List<a> m2683() {
        List actionList = Build.VERSION.SDK_INT >= 21 ? this.f2854.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new a(actionList.get(i5)));
        }
        return arrayList;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public boolean m2684() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2854.isShowingHintText() : m2626(4);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public boolean m2685() {
        return this.f2854.isSelected();
    }

    @Deprecated
    /* renamed from: ˎ, reason: contains not printable characters */
    public int m2686() {
        return this.f2854.getActions();
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public boolean m2687() {
        return this.f2854.isVisibleToUser();
    }

    @Deprecated
    /* renamed from: ˑ, reason: contains not printable characters */
    public void m2688(Rect rect) {
        this.f2854.getBoundsInParent(rect);
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m2689(Rect rect) {
        this.f2854.getBoundsInScreen(rect);
    }

    /* renamed from: יי, reason: contains not printable characters */
    public boolean m2690(int i5, Bundle bundle) {
        return this.f2854.performAction(i5, bundle);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public int m2691() {
        return this.f2854.getChildCount();
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public boolean m2692() {
        return this.f2854.isFocused();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public CharSequence m2693() {
        return this.f2854.getClassName();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public CharSequence m2694() {
        return this.f2854.getContentDescription();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean m2695() {
        return this.f2854.isAccessibilityFocused();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public Bundle m2696() {
        return this.f2854.getExtras();
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public void m2697() {
        this.f2854.recycle();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public CharSequence m2698() {
        return this.f2854.getPackageName();
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public boolean m2699(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f2854.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2900);
        }
        return false;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public CharSequence m2700() {
        if (!m2635()) {
            return this.f2854.getText();
        }
        List<Integer> m2623 = m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m26232 = m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m26233 = m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m26234 = m2623("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2854.getText(), 0, this.f2854.getText().length()));
        for (int i5 = 0; i5 < m2623.size(); i5++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(m26234.get(i5).intValue(), this, m2696().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m2623.get(i5).intValue(), m26232.get(i5).intValue(), m26233.get(i5).intValue());
        }
        return spannableString;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m2701(boolean z5) {
        this.f2854.setAccessibilityFocused(z5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public String m2702() {
        return androidx.core.os.a.m2404() ? this.f2854.getUniqueId() : this.f2854.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    @Deprecated
    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public void m2703(Rect rect) {
        this.f2854.setBoundsInParent(rect);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public String m2704() {
        return this.f2854.getViewIdResourceName();
    }
}
