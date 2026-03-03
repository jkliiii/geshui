package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: AppCompatEmojiEditTextHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final EditText f1354;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f0.a f1355;

    l(EditText editText) {
        this.f1354 = editText;
        this.f1355 = new f0.a(editText, false);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    KeyListener m1406(KeyListener keyListener) {
        return m1407(keyListener) ? this.f1355.m8476(keyListener) : keyListener;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean m1407(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m1408() {
        return this.f1355.m8477();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m1409(AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = this.f1354.getContext().obtainStyledAttributes(attributeSet, e.j.f7089, i5, 0);
        try {
            int i6 = e.j.f7103;
            boolean z5 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getBoolean(i6, true) : true;
            obtainStyledAttributes.recycle();
            m1411(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    InputConnection m1410(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1355.m8478(inputConnection, editorInfo);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m1411(boolean z5) {
        this.f1355.m8479(z5);
    }
}
