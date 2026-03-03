package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.v0;

/* compiled from: TextViewOnReceiveContentListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class o0 implements v0 {

    /* compiled from: TextViewOnReceiveContentListener.java */
    private static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static CharSequence m3645(Context context, ClipData.Item item, int i5) {
            if ((i5 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static CharSequence m3643(Context context, ClipData.Item item, int i5) {
        return a.m3645(context, item, i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m3644(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.v0
    /* renamed from: ʻ */
    public androidx.core.view.c mo3374(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + cVar);
        }
        if (cVar.m2768() == 2) {
            return cVar;
        }
        ClipData m2766 = cVar.m2766();
        int m2767 = cVar.m2767();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z5 = false;
        for (int i5 = 0; i5 < m2766.getItemCount(); i5++) {
            CharSequence m3643 = m3643(context, m2766.getItemAt(i5), m2767);
            if (m3643 != null) {
                if (z5) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m3643);
                } else {
                    m3644(editable, m3643);
                    z5 = true;
                }
            }
        }
        return null;
    }
}
