package f0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: EmojiInputConnection.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TextView f7645;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final a f7646;

    /* compiled from: EmojiInputConnection.java */
    public static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m8485(InputConnection inputConnection, Editable editable, int i5, int i6, boolean z5) {
            return androidx.emoji2.text.e.m3782(inputConnection, editable, i5, i6, z5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m8486(EditorInfo editorInfo) {
            if (androidx.emoji2.text.e.m3785()) {
                androidx.emoji2.text.e.m3781().m3800(editorInfo);
            }
        }
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Editable m8484() {
        return this.f7645.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i5, int i6) {
        return this.f7646.m8485(this, m8484(), i5, i6, false) || super.deleteSurroundingText(i5, i6);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i5, int i6) {
        return this.f7646.m8485(this, m8484(), i5, i6, true) || super.deleteSurroundingTextInCodePoints(i5, i6);
    }

    c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f7645 = textView;
        this.f7646 = aVar;
        aVar.m8486(editorInfo);
    }
}
