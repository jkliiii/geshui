package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class x0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private TextView f1507;

    /* renamed from: ʼ, reason: contains not printable characters */
    private TextClassifier f1508;

    /* compiled from: AppCompatTextClassifierHelper.java */
    private static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static TextClassifier m1599(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    x0(TextView textView) {
        this.f1507 = (TextView) androidx.core.util.h.m2583(textView);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public TextClassifier m1597() {
        TextClassifier textClassifier = this.f1508;
        return textClassifier == null ? a.m1599(this.f1507) : textClassifier;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1598(TextClassifier textClassifier) {
        this.f1508 = textClassifier;
    }
}
