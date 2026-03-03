package x0;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.k;
import java.lang.reflect.Field;
import w0.g;
import w0.j;

/* compiled from: MDTintHelper.java */
@SuppressLint({"PrivateResource"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static ColorStateList m12664(Context context, int i5) {
        int i6 = g.f11926;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{y0.a.m12849(context, i6), y0.a.m12849(context, i6), i5});
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m12665(EditText editText, int i5) {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i6 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {androidx.core.content.a.m1993(editText.getContext(), i6), androidx.core.content.a.m1993(editText.getContext(), i6)};
            drawableArr[0].setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            drawableArr[1].setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e5) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e5.getMessage());
            e5.printStackTrace();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m12666(CheckBox checkBox, int i5) {
        int m12841 = y0.a.m12841(checkBox.getContext());
        m12667(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{y0.a.m12849(checkBox.getContext(), g.f11926), i5, m12841, m12841}));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m12667(CheckBox checkBox, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            checkBox.setButtonTintList(colorStateList);
            return;
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(androidx.core.content.a.m1993(checkBox.getContext(), j.f11968));
        androidx.core.graphics.drawable.a.m2210(m2213, colorStateList);
        checkBox.setButtonDrawable(m2213);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12668(EditText editText, int i5) {
        ColorStateList m12664 = m12664(editText.getContext(), i5);
        if (editText instanceof k) {
            ((k) editText).setSupportBackgroundTintList(m12664);
        } else if (Build.VERSION.SDK_INT >= 21) {
            editText.setBackgroundTintList(m12664);
        }
        m12665(editText, i5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12669(RadioButton radioButton, int i5) {
        int m12841 = y0.a.m12841(radioButton.getContext());
        m12670(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{y0.a.m12849(radioButton.getContext(), g.f11926), i5, m12841, m12841}));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m12670(RadioButton radioButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 22) {
            radioButton.setButtonTintList(colorStateList);
            return;
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(androidx.core.content.a.m1993(radioButton.getContext(), j.f11969));
        androidx.core.graphics.drawable.a.m2210(m2213, colorStateList);
        radioButton.setButtonDrawable(m2213);
    }
}
