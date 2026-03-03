package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.i;

/* compiled from: TintTypedArray.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d3 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f1206;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final TypedArray f1207;

    /* renamed from: ʽ, reason: contains not printable characters */
    private TypedValue f1208;

    private d3(Context context, TypedArray typedArray) {
        this.f1206 = context;
        this.f1207 = typedArray;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static d3 m1179(Context context, int i5, int[] iArr) {
        return new d3(context, context.obtainStyledAttributes(i5, iArr));
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static d3 m1180(Context context, AttributeSet attributeSet, int[] iArr) {
        return new d3(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static d3 m1181(Context context, AttributeSet attributeSet, int[] iArr, int i5, int i6) {
        return new d3(context, context.obtainStyledAttributes(attributeSet, iArr, i5, i6));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m1182(int i5, boolean z5) {
        return this.f1207.getBoolean(i5, z5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m1183(int i5, int i6) {
        return this.f1207.getColor(i5, i6);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public ColorStateList m1184(int i5) {
        int resourceId;
        ColorStateList m8474;
        return (!this.f1207.hasValue(i5) || (resourceId = this.f1207.getResourceId(i5, 0)) == 0 || (m8474 = f.a.m8474(this.f1206, resourceId)) == null) ? this.f1207.getColorStateList(i5) : m8474;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public float m1185(int i5, float f5) {
        return this.f1207.getDimension(i5, f5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m1186(int i5, int i6) {
        return this.f1207.getDimensionPixelOffset(i5, i6);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m1187(int i5, int i6) {
        return this.f1207.getDimensionPixelSize(i5, i6);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public Drawable m1188(int i5) {
        int resourceId;
        return (!this.f1207.hasValue(i5) || (resourceId = this.f1207.getResourceId(i5, 0)) == 0) ? this.f1207.getDrawable(i5) : f.a.m8475(this.f1206, resourceId);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public Drawable m1189(int i5) {
        int resourceId;
        if (!this.f1207.hasValue(i5) || (resourceId = this.f1207.getResourceId(i5, 0)) == 0) {
            return null;
        }
        return j.m1375().m1380(this.f1206, resourceId, true);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public float m1190(int i5, float f5) {
        return this.f1207.getFloat(i5, f5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public Typeface m1191(int i5, int i6, i.f fVar) {
        int resourceId = this.f1207.getResourceId(i5, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1208 == null) {
            this.f1208 = new TypedValue();
        }
        return androidx.core.content.res.i.m2113(this.f1206, resourceId, this.f1208, i6, fVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m1192(int i5, int i6) {
        return this.f1207.getInt(i5, i6);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m1193(int i5, int i6) {
        return this.f1207.getInteger(i5, i6);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m1194(int i5, int i6) {
        return this.f1207.getLayoutDimension(i5, i6);
    }

    /* renamed from: י, reason: contains not printable characters */
    public int m1195(int i5, int i6) {
        return this.f1207.getResourceId(i5, i6);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public String m1196(int i5) {
        return this.f1207.getString(i5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public CharSequence m1197(int i5) {
        return this.f1207.getText(i5);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public CharSequence[] m1198(int i5) {
        return this.f1207.getTextArray(i5);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public TypedArray m1199() {
        return this.f1207;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public boolean m1200(int i5) {
        return this.f1207.hasValue(i5);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m1201() {
        this.f1207.recycle();
    }
}
