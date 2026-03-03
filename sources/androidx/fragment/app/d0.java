package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e4;
import androidx.core.view.f1;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d0 {

    /* compiled from: FragmentTransitionImpl.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f3472;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3473;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3474;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3475;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3476;

        a(int i5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3472 = i5;
            this.f3473 = arrayList;
            this.f3474 = arrayList2;
            this.f3475 = arrayList3;
            this.f3476 = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i5 = 0; i5 < this.f3472; i5++) {
                f1.m2852((View) this.f3473.get(i5), (String) this.f3474.get(i5));
                f1.m2852((View) this.f3475.get(i5), (String) this.f3476.get(i5));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3478;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Map f3479;

        b(ArrayList arrayList, Map map) {
            this.f3478 = arrayList;
            this.f3479 = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3478.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) this.f3478.get(i5);
                String m2879 = f1.m2879(view);
                if (m2879 != null) {
                    f1.m2852(view, d0.m4011(this.f3479, m2879));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3481;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Map f3482;

        c(ArrayList arrayList, Map map) {
            this.f3481 = arrayList;
            this.f3482 = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3481.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view = (View) this.f3481.get(i5);
                f1.m2852(view, (String) this.f3482.get(f1.m2879(view)));
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected static void m4009(List<View> list, View view) {
        int size = list.size();
        if (m4010(list, view, size)) {
            return;
        }
        if (f1.m2879(view) != null) {
            list.add(view);
        }
        for (int i5 = size; i5 < list.size(); i5++) {
            View view2 = list.get(i5);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (!m4010(list, childAt, size) && f1.m2879(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m4010(List<View> list, View view, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            if (list.get(i6) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static String m4011(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected static boolean m4012(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: ʻ */
    public abstract void mo3988(Object obj, View view);

    /* renamed from: ʼ */
    public abstract void mo3989(Object obj, ArrayList<View> arrayList);

    /* renamed from: ʽ */
    public abstract void mo3990(ViewGroup viewGroup, Object obj);

    /* renamed from: ʿ */
    public abstract boolean mo3991(Object obj);

    /* renamed from: ˆ, reason: contains not printable characters */
    void m4013(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (e4.m2798(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                m4013(arrayList, viewGroup.getChildAt(i5));
            }
        }
    }

    /* renamed from: ˈ */
    public abstract Object mo3992(Object obj);

    /* renamed from: ˋ, reason: contains not printable characters */
    void m4014(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m2879 = f1.m2879(view);
            if (m2879 != null) {
                map.put(m2879, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    m4014(map, viewGroup.getChildAt(i5));
                }
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected void m4015(View view, Rect rect) {
        if (f1.m2903(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: ˑ */
    public abstract Object mo3993(Object obj, Object obj2, Object obj3);

    /* renamed from: י */
    public abstract Object mo3994(Object obj, Object obj2, Object obj3);

    /* renamed from: ـ, reason: contains not printable characters */
    ArrayList<String> m4016(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = arrayList.get(i5);
            arrayList2.add(f1.m2879(view));
            f1.m2852(view, null);
        }
        return arrayList2;
    }

    /* renamed from: ٴ */
    public abstract void mo3995(Object obj, View view);

    /* renamed from: ᐧ */
    public abstract void mo3996(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: ᐧᐧ */
    public abstract void mo3997(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: ᴵ */
    public abstract void mo3998(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: ᴵᴵ */
    public abstract Object mo3999(Object obj);

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m4017(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        x0.m3434(viewGroup, new c(arrayList, map));
    }

    /* renamed from: ᵔ */
    public abstract void mo4000(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: ᵢ */
    public abstract void mo4001(Object obj, Rect rect);

    /* renamed from: ⁱ */
    public abstract void mo4002(Object obj, View view);

    /* renamed from: ﹳ */
    public void mo4003(e eVar, Object obj, androidx.core.os.g gVar, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m4018(View view, ArrayList<View> arrayList, Map<String, String> map) {
        x0.m3434(view, new b(arrayList, map));
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m4019(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = arrayList.get(i5);
            String m2879 = f1.m2879(view2);
            arrayList4.add(m2879);
            if (m2879 != null) {
                f1.m2852(view2, null);
                String str = map.get(m2879);
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i6))) {
                        f1.m2852(arrayList2.get(i6), m2879);
                        break;
                    }
                    i6++;
                }
            }
        }
        x0.m3434(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: ﾞﾞ */
    public abstract void mo4004(Object obj, View view, ArrayList<View> arrayList);
}
