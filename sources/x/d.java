package x;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* compiled from: EditorInfoCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final String[] f12087 = new String[0];

    /* compiled from: EditorInfoCompat.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m12638(EditorInfo editorInfo, CharSequence charSequence, int i5) {
            editorInfo.setInitialSurroundingSubText(charSequence, i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String[] m12630(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f12087;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f12087;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f12087;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m12631(CharSequence charSequence, int i5, int i6) {
        if (i6 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i5));
        }
        if (i6 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i5));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m12632(int i5) {
        int i6 = i5 & 4095;
        return i6 == 129 || i6 == 225 || i6 == 18;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m12633(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12634(EditorInfo editorInfo, CharSequence charSequence, int i5) {
        androidx.core.util.h.m2583(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m12638(editorInfo, charSequence, i5);
            return;
        }
        int i6 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i6 > i7 ? i7 - i5 : i6 - i5;
        int i9 = i6 > i7 ? i6 - i5 : i7 - i5;
        int length = charSequence.length();
        if (i5 < 0 || i8 < 0 || i9 > length) {
            m12636(editorInfo, null, 0, 0);
            return;
        }
        if (m12632(editorInfo.inputType)) {
            m12636(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m12636(editorInfo, charSequence, i8, i9);
        } else {
            m12637(editorInfo, charSequence, i8, i9);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12635(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m12638(editorInfo, charSequence, 0);
        } else {
            m12634(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m12636(EditorInfo editorInfo, CharSequence charSequence, int i5, int i6) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i5);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i6);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static void m12637(EditorInfo editorInfo, CharSequence charSequence, int i5, int i6) {
        int i7 = i6 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int length = charSequence.length() - i6;
        int i9 = 2048 - i8;
        double d6 = i9;
        Double.isNaN(d6);
        int min = Math.min(length, i9 - Math.min(i5, (int) (d6 * 0.8d)));
        int min2 = Math.min(i5, i9 - min);
        int i10 = i5 - min2;
        if (m12631(charSequence, i10, 0)) {
            i10++;
            min2--;
        }
        if (m12631(charSequence, (i6 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i6, min + i6)) : charSequence.subSequence(i10, min2 + i8 + min + i10);
        int i11 = min2 + 0;
        m12636(editorInfo, concat, i11, i8 + i11);
    }
}
