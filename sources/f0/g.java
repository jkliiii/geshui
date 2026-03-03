package f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class g implements TextWatcher {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final EditText f7658;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f7659;

    /* renamed from: ˆ, reason: contains not printable characters */
    private e.AbstractC0043e f7660;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f7661 = Integer.MAX_VALUE;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f7662 = 0;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f7663 = true;

    /* compiled from: EmojiTextWatcher.java */
    private static class a extends e.AbstractC0043e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Reference<EditText> f7664;

        a(EditText editText) {
            this.f7664 = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        /* renamed from: ʼ */
        public void mo1605() {
            super.mo1605();
            g.m8511(this.f7664.get(), 1);
        }
    }

    g(EditText editText, boolean z5) {
        this.f7658 = editText;
        this.f7659 = z5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private e.AbstractC0043e m8510() {
        if (this.f7660 == null) {
            this.f7660 = new a(this.f7658);
        }
        return this.f7660;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m8511(EditText editText, int i5) {
        if (i5 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.e.m3781().m3794(editableText);
            d.m8488(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m8512() {
        return (this.f7663 && (this.f7659 || androidx.emoji2.text.e.m3785())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        if (this.f7658.isInEditMode() || m8512() || i6 > i7 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m3789 = androidx.emoji2.text.e.m3781().m3789();
        if (m3789 != 0) {
            if (m3789 == 1) {
                androidx.emoji2.text.e.m3781().m3797((Spannable) charSequence, i5, i5 + i7, this.f7661, this.f7662);
                return;
            } else if (m3789 != 3) {
                return;
            }
        }
        androidx.emoji2.text.e.m3781().m3798(m8510());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m8513() {
        return this.f7663;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8514(boolean z5) {
        if (this.f7663 != z5) {
            if (this.f7660 != null) {
                androidx.emoji2.text.e.m3781().m3799(this.f7660);
            }
            this.f7663 = z5;
            if (z5) {
                m8511(this.f7658, androidx.emoji2.text.e.m3781().m3789());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
    }
}
