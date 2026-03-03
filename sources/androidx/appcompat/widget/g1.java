package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g1 {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final RectF f1241 = new RectF();

    /* renamed from: ˑ, reason: contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f1242 = new ConcurrentHashMap<>();

    /* renamed from: י, reason: contains not printable characters */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f1243 = new ConcurrentHashMap<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f1244 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f1245 = false;

    /* renamed from: ʽ, reason: contains not printable characters */
    private float f1246 = -1.0f;

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f1247 = -1.0f;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f1248 = -1.0f;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int[] f1249 = new int[0];

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f1250 = false;

    /* renamed from: ˉ, reason: contains not printable characters */
    private TextPaint f1251;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final TextView f1252;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Context f1253;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final f f1254;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static StaticLayout m1267(CharSequence charSequence, Layout.Alignment alignment, int i5, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i5, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m1268(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static final class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m1269(View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static final class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static StaticLayout m1270(CharSequence charSequence, Layout.Alignment alignment, int i5, int i6, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i5);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i6 == -1) {
                i6 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i6);
            try {
                fVar.mo1271(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.g1.f
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo1271(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) g1.m1245(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.g1.d, androidx.appcompat.widget.g1.f
        /* renamed from: ʻ */
        void mo1271(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.g1.f
        /* renamed from: ʼ, reason: contains not printable characters */
        boolean mo1272(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    g1(TextView textView) {
        this.f1252 = textView;
        this.f1253 = textView.getContext();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f1254 = new e();
        } else if (i5 >= 23) {
            this.f1254 = new d();
        } else {
            this.f1254 = new f();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private int[] m1241(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
        }
        return iArr2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m1242() {
        this.f1244 = 0;
        this.f1247 = -1.0f;
        this.f1248 = -1.0f;
        this.f1246 = -1.0f;
        this.f1249 = new int[0];
        this.f1245 = false;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m1243(RectF rectF) {
        int length = this.f1249.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i5 = 1;
        int i6 = length - 1;
        int i7 = 0;
        while (i5 <= i6) {
            int i8 = (i5 + i6) / 2;
            if (m1250(this.f1249[i8], rectF)) {
                int i9 = i8 + 1;
                i7 = i5;
                i5 = i9;
            } else {
                i7 = i8 - 1;
                i6 = i7;
            }
        }
        return this.f1249[i7];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Method m1244(String str) {
        try {
            Method method = f1242.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1242.put(str, method);
            }
            return method;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static <T> T m1245(Object obj, String str, T t5) {
        try {
            return (T) m1244(str).invoke(obj, new Object[0]);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return t5;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m1246(float f5) {
        if (f5 != this.f1252.getPaint().getTextSize()) {
            this.f1252.getPaint().setTextSize(f5);
            boolean m1269 = b.m1269(this.f1252);
            if (this.f1252.getLayout() != null) {
                this.f1245 = false;
                try {
                    Method m1244 = m1244("nullLayouts");
                    if (m1244 != null) {
                        m1244.invoke(this.f1252, new Object[0]);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (m1269) {
                    this.f1252.forceLayout();
                } else {
                    this.f1252.requestLayout();
                }
                this.f1252.invalidate();
            }
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m1247() {
        if (m1251() && this.f1244 == 1) {
            if (!this.f1250 || this.f1249.length == 0) {
                int floor = ((int) Math.floor((this.f1248 - this.f1247) / this.f1246)) + 1;
                int[] iArr = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr[i5] = Math.round(this.f1247 + (i5 * this.f1246));
                }
                this.f1249 = m1241(iArr);
            }
            this.f1245 = true;
        } else {
            this.f1245 = false;
        }
        return this.f1245;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m1248(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = typedArray.getDimensionPixelSize(i5, -1);
            }
            this.f1249 = m1241(iArr);
            m1249();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m1249() {
        boolean z5 = this.f1249.length > 0;
        this.f1250 = z5;
        if (z5) {
            this.f1244 = 1;
            this.f1247 = r0[0];
            this.f1248 = r0[r1 - 1];
            this.f1246 = -1.0f;
        }
        return z5;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean m1250(int i5, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1252.getText();
        TransformationMethod transformationMethod = this.f1252.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1252)) != null) {
            text = transformation;
        }
        int m1268 = a.m1268(this.f1252);
        m1260(i5);
        StaticLayout m1254 = m1254(text, (Layout.Alignment) m1245(this.f1252, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m1268);
        return (m1268 == -1 || (m1254.getLineCount() <= m1268 && m1254.getLineEnd(m1254.getLineCount() - 1) == text.length())) && ((float) m1254.getHeight()) <= rectF.bottom;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean m1251() {
        return !(this.f1252 instanceof k);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m1252(float f5, float f6, float f7) throws IllegalArgumentException {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f5 + "px) is less or equal to (0px)");
        }
        if (f6 <= f5) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f6 + "px) is less or equal to minimum auto-size text size (" + f5 + "px)");
        }
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f7 + "px) is less or equal to (0px)");
        }
        this.f1244 = 1;
        this.f1247 = f5;
        this.f1248 = f6;
        this.f1246 = f7;
        this.f1250 = false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m1253() {
        if (m1261()) {
            if (this.f1245) {
                if (this.f1252.getMeasuredHeight() <= 0 || this.f1252.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1254.mo1272(this.f1252) ? 1048576 : (this.f1252.getMeasuredWidth() - this.f1252.getTotalPaddingLeft()) - this.f1252.getTotalPaddingRight();
                int height = (this.f1252.getHeight() - this.f1252.getCompoundPaddingBottom()) - this.f1252.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1241;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m1243 = m1243(rectF);
                    if (m1243 != this.f1252.getTextSize()) {
                        m1266(0, m1243);
                    }
                }
            }
            this.f1245 = true;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    StaticLayout m1254(CharSequence charSequence, Layout.Alignment alignment, int i5, int i6) {
        return Build.VERSION.SDK_INT >= 23 ? c.m1270(charSequence, alignment, i5, i6, this.f1252, this.f1251, this.f1254) : a.m1267(charSequence, alignment, i5, this.f1252, this.f1251);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m1255() {
        return Math.round(this.f1248);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m1256() {
        return Math.round(this.f1247);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    int m1257() {
        return Math.round(this.f1246);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    int[] m1258() {
        return this.f1249;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    int m1259() {
        return this.f1244;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m1260(int i5) {
        TextPaint textPaint = this.f1251;
        if (textPaint == null) {
            this.f1251 = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1251.set(this.f1252.getPaint());
        this.f1251.setTextSize(i5);
    }

    /* renamed from: י, reason: contains not printable characters */
    boolean m1261() {
        return m1251() && this.f1244 != 0;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m1262(AttributeSet attributeSet, int i5) {
        int resourceId;
        Context context = this.f1253;
        int[] iArr = e.j.f7089;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        TextView textView = this.f1252;
        androidx.core.view.f1.m2828(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i5, 0);
        int i6 = e.j.f7094;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.f1244 = obtainStyledAttributes.getInt(i6, 0);
        }
        int i7 = e.j.f7093;
        float dimension = obtainStyledAttributes.hasValue(i7) ? obtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i8 = e.j.f7091;
        float dimension2 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getDimension(i8, -1.0f) : -1.0f;
        int i9 = e.j.f7090;
        float dimension3 = obtainStyledAttributes.hasValue(i9) ? obtainStyledAttributes.getDimension(i9, -1.0f) : -1.0f;
        int i10 = e.j.f7092;
        if (obtainStyledAttributes.hasValue(i10) && (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1248(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1251()) {
            this.f1244 = 0;
            return;
        }
        if (this.f1244 == 1) {
            if (!this.f1250) {
                DisplayMetrics displayMetrics = this.f1253.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1252(dimension2, dimension3, dimension);
            }
            m1247();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m1263(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (m1251()) {
            DisplayMetrics displayMetrics = this.f1253.getResources().getDisplayMetrics();
            m1252(TypedValue.applyDimension(i8, i5, displayMetrics), TypedValue.applyDimension(i8, i6, displayMetrics), TypedValue.applyDimension(i8, i7, displayMetrics));
            if (m1247()) {
                m1253();
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m1264(int[] iArr, int i5) throws IllegalArgumentException {
        if (m1251()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i5 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1253.getResources().getDisplayMetrics();
                    for (int i6 = 0; i6 < length; i6++) {
                        iArr2[i6] = Math.round(TypedValue.applyDimension(i5, iArr[i6], displayMetrics));
                    }
                }
                this.f1249 = m1241(iArr2);
                if (!m1249()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1250 = false;
            }
            if (m1247()) {
                m1253();
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m1265(int i5) {
        if (m1251()) {
            if (i5 == 0) {
                m1242();
                return;
            }
            if (i5 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i5);
            }
            DisplayMetrics displayMetrics = this.f1253.getResources().getDisplayMetrics();
            m1252(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1247()) {
                m1253();
            }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m1266(int i5, float f5) {
        Context context = this.f1253;
        m1246(TypedValue.applyDimension(i5, f5, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class f {
        f() {
        }

        /* renamed from: ʼ */
        boolean mo1272(TextView textView) {
            return ((Boolean) g1.m1245(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        /* renamed from: ʻ */
        void mo1271(StaticLayout.Builder builder, TextView textView) {
        }
    }
}
