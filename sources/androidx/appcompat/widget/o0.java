package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.c;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class o0 {

    /* compiled from: AppCompatReceiveContentHelper.java */
    private static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m1449(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.f1.m2820(textView, new c.a(dragEvent.getClipData(), 3).m2770());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m1450(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.f1.m2820(view, new c.a(dragEvent.getClipData(), 3).m2770());
            return true;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static boolean m1446(View view, DragEvent dragEvent) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31 && i5 >= 24 && dragEvent.getLocalState() == null && androidx.core.view.f1.m2885(view) != null) {
            Activity m1448 = m1448(view);
            if (m1448 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? a.m1449(dragEvent, (TextView) view, m1448) : a.m1450(dragEvent, view, m1448);
            }
        }
        return false;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static boolean m1447(TextView textView, int i5) {
        if (Build.VERSION.SDK_INT >= 31 || androidx.core.view.f1.m2885(textView) == null || !(i5 == 16908322 || i5 == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.f1.m2820(textView, new c.a(primaryClip, 1).m2772(i5 != 16908322 ? 1 : 0).m2770());
        }
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static Activity m1448(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
