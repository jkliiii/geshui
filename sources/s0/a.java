package s0;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewBindings.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static <T extends View> T m11702(View view, int i5) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            T t5 = (T) viewGroup.getChildAt(i6).findViewById(i5);
            if (t5 != null) {
                return t5;
            }
        }
        return null;
    }
}
