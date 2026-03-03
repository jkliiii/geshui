package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: AppCompatHintHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n {
    /* renamed from: ʻ, reason: contains not printable characters */
    static InputConnection m1437(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof q3) {
                    editorInfo.hintText = ((q3) parent).m1488();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
