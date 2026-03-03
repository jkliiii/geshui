package f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d implements InputFilter {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TextView f7647;

    /* renamed from: ʼ, reason: contains not printable characters */
    private e.AbstractC0043e f7648;

    /* compiled from: EmojiInputFilter.java */
    private static class a extends e.AbstractC0043e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Reference<TextView> f7649;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Reference<d> f7650;

        a(TextView textView, d dVar) {
            this.f7649 = new WeakReference(textView);
            this.f7650 = new WeakReference(dVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean m8489(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        /* renamed from: ʼ */
        public void mo1605() {
            CharSequence text;
            CharSequence m3794;
            super.mo1605();
            TextView textView = this.f7649.get();
            if (m8489(textView, this.f7650.get()) && textView.isAttachedToWindow() && text != (m3794 = androidx.emoji2.text.e.m3781().m3794((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(m3794);
                int selectionEnd = Selection.getSelectionEnd(m3794);
                textView.setText(m3794);
                if (m3794 instanceof Spannable) {
                    d.m8488((Spannable) m3794, selectionStart, selectionEnd);
                }
            }
        }
    }

    d(TextView textView) {
        this.f7647 = textView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private e.AbstractC0043e m8487() {
        if (this.f7648 == null) {
            this.f7648 = new a(this.f7647, this);
        }
        return this.f7648;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m8488(Spannable spannable, int i5, int i6) {
        if (i5 >= 0 && i6 >= 0) {
            Selection.setSelection(spannable, i5, i6);
        } else if (i5 >= 0) {
            Selection.setSelection(spannable, i5);
        } else if (i6 >= 0) {
            Selection.setSelection(spannable, i6);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i5, int i6, Spanned spanned, int i7, int i8) {
        if (this.f7647.isInEditMode()) {
            return charSequence;
        }
        int m3789 = androidx.emoji2.text.e.m3781().m3789();
        if (m3789 != 0) {
            boolean z5 = true;
            if (m3789 == 1) {
                if (i8 == 0 && i7 == 0 && spanned.length() == 0 && charSequence == this.f7647.getText()) {
                    z5 = false;
                }
                if (!z5 || charSequence == null) {
                    return charSequence;
                }
                if (i5 != 0 || i6 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i5, i6);
                }
                return androidx.emoji2.text.e.m3781().m3795(charSequence, 0, charSequence.length());
            }
            if (m3789 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.e.m3781().m3798(m8487());
        return charSequence;
    }
}
