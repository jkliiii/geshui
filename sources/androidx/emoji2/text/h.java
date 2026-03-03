package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.l;
import java.util.Arrays;

/* compiled from: EmojiProcessor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e.i f3259;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final l f3260;

    /* renamed from: ʽ, reason: contains not printable characters */
    private e.d f3261;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final boolean f3262;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int[] f3263;

    /* compiled from: EmojiProcessor.java */
    private static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3827(CharSequence charSequence, int i5, int i6) {
            int length = charSequence.length();
            if (i5 < 0 || length < i5 || i6 < 0) {
                return -1;
            }
            while (true) {
                boolean z5 = false;
                while (i6 != 0) {
                    i5--;
                    if (i5 < 0) {
                        return z5 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i5);
                    if (z5) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i6--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i6--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z5 = true;
                    }
                }
                return i5;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3828(CharSequence charSequence, int i5, int i6) {
            int length = charSequence.length();
            if (i5 < 0 || length < i5 || i6 < 0) {
                return -1;
            }
            while (true) {
                boolean z5 = false;
                while (i6 != 0) {
                    if (i5 >= length) {
                        if (z5) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i5);
                    if (z5) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i6--;
                        i5++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i6--;
                        i5++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i5++;
                        z5 = true;
                    }
                }
                return i5;
            }
        }
    }

    /* compiled from: EmojiProcessor.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f3264 = 1;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final l.a f3265;

        /* renamed from: ʽ, reason: contains not printable characters */
        private l.a f3266;

        /* renamed from: ʾ, reason: contains not printable characters */
        private l.a f3267;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f3268;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f3269;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final boolean f3270;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final int[] f3271;

        b(l.a aVar, boolean z5, int[] iArr) {
            this.f3265 = aVar;
            this.f3266 = aVar;
            this.f3270 = z5;
            this.f3271 = iArr;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private static boolean m3829(int i5) {
            return i5 == 65039;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private static boolean m3830(int i5) {
            return i5 == 65038;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private int m3831() {
            this.f3264 = 1;
            this.f3266 = this.f3265;
            this.f3269 = 0;
            return 1;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean m3832() {
            if (this.f3266.m3863().m3817() || m3829(this.f3268)) {
                return true;
            }
            if (this.f3270) {
                if (this.f3271 == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3271, this.f3266.m3863().m3810(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        int m3833(int i5) {
            l.a m3862 = this.f3266.m3862(i5);
            int i6 = 2;
            if (this.f3264 != 2) {
                if (m3862 == null) {
                    i6 = m3831();
                } else {
                    this.f3264 = 2;
                    this.f3266 = m3862;
                    this.f3269 = 1;
                }
            } else if (m3862 != null) {
                this.f3266 = m3862;
                this.f3269++;
            } else if (m3830(i5)) {
                i6 = m3831();
            } else if (!m3829(i5)) {
                if (this.f3266.m3863() != null) {
                    i6 = 3;
                    if (this.f3269 != 1) {
                        this.f3267 = this.f3266;
                        m3831();
                    } else if (m3832()) {
                        this.f3267 = this.f3266;
                        m3831();
                    } else {
                        i6 = m3831();
                    }
                } else {
                    i6 = m3831();
                }
            }
            this.f3268 = i5;
            return i6;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        g m3834() {
            return this.f3266.m3863();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        g m3835() {
            return this.f3267.m3863();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean m3836() {
            return this.f3264 == 2 && this.f3266.m3863() != null && (this.f3269 > 1 || m3832());
        }
    }

    h(l lVar, e.i iVar, e.d dVar, boolean z5, int[] iArr) {
        this.f3259 = iVar;
        this.f3260 = lVar;
        this.f3261 = dVar;
        this.f3262 = z5;
        this.f3263 = iArr;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3819(Spannable spannable, g gVar, int i5, int i6) {
        spannable.setSpan(this.f3259.m3807(gVar), i5, i6, 33);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m3820(Editable editable, KeyEvent keyEvent, boolean z5) {
        d0.a[] aVarArr;
        if (m3825(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m3824(selectionStart, selectionEnd) && (aVarArr = (d0.a[]) editable.getSpans(selectionStart, selectionEnd, d0.a.class)) != null && aVarArr.length > 0) {
            for (d0.a aVar : aVarArr) {
                int spanStart = editable.getSpanStart(aVar);
                int spanEnd = editable.getSpanEnd(aVar);
                if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean m3821(InputConnection inputConnection, Editable editable, int i5, int i6, boolean z5) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i5 >= 0 && i6 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m3824(selectionStart, selectionEnd)) {
                return false;
            }
            if (z5) {
                max = a.m3827(editable, selectionStart, Math.max(i5, 0));
                min = a.m3828(editable, selectionEnd, Math.max(i6, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i5, 0);
                min = Math.min(selectionEnd + i6, editable.length());
            }
            d0.a[] aVarArr = (d0.a[]) editable.getSpans(max, min, d0.a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                for (d0.a aVar : aVarArr) {
                    int spanStart = editable.getSpanStart(aVar);
                    int spanEnd = editable.getSpanEnd(aVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static boolean m3822(Editable editable, int i5, KeyEvent keyEvent) {
        if (!(i5 != 67 ? i5 != 112 ? false : m3820(editable, keyEvent, true) : m3820(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m3823(CharSequence charSequence, int i5, int i6, g gVar) {
        if (gVar.m3812() == 0) {
            gVar.m3818(this.f3261.mo3779(charSequence, i5, i6, gVar.m3815()));
        }
        return gVar.m3812() == 2;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean m3824(int i5, int i6) {
        return i5 == -1 || i6 == -1 || i5 != i6;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean m3825(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    CharSequence m3826(CharSequence charSequence, int i5, int i6, int i7, boolean z5) {
        m mVar;
        int i8;
        d0.a[] aVarArr;
        boolean z6 = charSequence instanceof d0.b;
        if (z6) {
            ((d0.b) charSequence).m8164();
        }
        if (!z6) {
            try {
                mVar = charSequence instanceof Spannable ? new m((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i5 + (-1), i6 + 1, d0.a.class) > i6) ? null : new m(charSequence);
            } finally {
                if (z6) {
                    ((d0.b) charSequence).m8165();
                }
            }
        }
        if (mVar != null && (aVarArr = (d0.a[]) mVar.getSpans(i5, i6, d0.a.class)) != null && aVarArr.length > 0) {
            for (d0.a aVar : aVarArr) {
                int spanStart = mVar.getSpanStart(aVar);
                int spanEnd = mVar.getSpanEnd(aVar);
                if (spanStart != i6) {
                    mVar.removeSpan(aVar);
                }
                i5 = Math.min(spanStart, i5);
                i6 = Math.max(spanEnd, i6);
            }
        }
        if (i5 != i6 && i5 < charSequence.length()) {
            if (i7 != Integer.MAX_VALUE && mVar != null) {
                i7 -= ((d0.a[]) mVar.getSpans(0, mVar.length(), d0.a.class)).length;
            }
            b bVar = new b(this.f3260.m3859(), this.f3262, this.f3263);
            m mVar2 = mVar;
            int codePointAt = Character.codePointAt(charSequence, i5);
            int i9 = 0;
            loop1: while (true) {
                i8 = i5;
                while (i5 < i6 && i9 < i7) {
                    int m3833 = bVar.m3833(codePointAt);
                    if (m3833 == 1) {
                        i8 += Character.charCount(Character.codePointAt(charSequence, i8));
                        if (i8 < i6) {
                            codePointAt = Character.codePointAt(charSequence, i8);
                        }
                        i5 = i8;
                    } else if (m3833 == 2) {
                        i5 += Character.charCount(codePointAt);
                        if (i5 < i6) {
                            codePointAt = Character.codePointAt(charSequence, i5);
                        }
                    } else if (m3833 == 3) {
                        if (z5 || !m3823(charSequence, i8, i5, bVar.m3835())) {
                            if (mVar2 == null) {
                                mVar2 = new m((Spannable) new SpannableString(charSequence));
                            }
                            m3819(mVar2, bVar.m3835(), i8, i5);
                            i9++;
                        }
                    }
                }
            }
            if (bVar.m3836() && i9 < i7 && (z5 || !m3823(charSequence, i8, i5, bVar.m3834()))) {
                if (mVar2 == null) {
                    mVar2 = new m(charSequence);
                }
                m3819(mVar2, bVar.m3834(), i8, i5);
            }
            if (mVar2 != null) {
                return mVar2.m3867();
            }
            if (z6) {
                ((d0.b) charSequence).m8165();
            }
            return charSequence;
        }
        if (z6) {
            ((d0.b) charSequence).m8165();
        }
        return charSequence;
    }
}
