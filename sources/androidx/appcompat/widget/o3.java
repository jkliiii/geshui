package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorEnabledTintResources.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o3 extends s2 {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean f1388 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final WeakReference<Context> f1389;

    public o3(Context context, Resources resources) {
        super(resources);
        this.f1389 = new WeakReference<>(context);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m1460() {
        return f1388;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m1461() {
        return m1460() && Build.VERSION.SDK_INT <= 20;
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i5) throws Resources.NotFoundException {
        return super.getAnimation(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i5) throws Resources.NotFoundException {
        return super.getBoolean(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i5) throws Resources.NotFoundException {
        return super.getColor(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i5) throws Resources.NotFoundException {
        return super.getColorStateList(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i5) throws Resources.NotFoundException {
        return super.getDimension(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i5) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i5) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i5, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i5, theme);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i5, int i6) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i5, i6);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i5, int i6, int i7) {
        return super.getFraction(i5, i6, i7);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i5) throws Resources.NotFoundException {
        return super.getIntArray(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i5) throws Resources.NotFoundException {
        return super.getInteger(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i5) throws Resources.NotFoundException {
        return super.getLayout(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i5) throws Resources.NotFoundException {
        return super.getMovie(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i5, int i6) throws Resources.NotFoundException {
        return super.getQuantityString(i5, i6);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i5, int i6) throws Resources.NotFoundException {
        return super.getQuantityText(i5, i6);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i5) throws Resources.NotFoundException {
        return super.getResourceEntryName(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i5) throws Resources.NotFoundException {
        return super.getResourceName(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i5) throws Resources.NotFoundException {
        return super.getResourcePackageName(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i5) throws Resources.NotFoundException {
        return super.getResourceTypeName(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i5) throws Resources.NotFoundException {
        return super.getString(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i5) throws Resources.NotFoundException {
        return super.getStringArray(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i5) throws Resources.NotFoundException {
        return super.getText(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i5) throws Resources.NotFoundException {
        return super.getTextArray(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i5, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        super.getValue(i5, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i5, int i6, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        super.getValueForDensity(i5, i6, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i5) throws Resources.NotFoundException {
        return super.getXml(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i5) throws Resources.NotFoundException {
        return super.obtainTypedArray(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i5) throws Resources.NotFoundException {
        return super.openRawResource(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i5) throws Resources.NotFoundException {
        return super.openRawResourceFd(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5) throws Resources.NotFoundException {
        Context context = this.f1389.get();
        return context != null ? r2.m1522().m1536(context, this, i5) : m1547(i5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i5, int i6, Resources.Theme theme) {
        return super.getDrawableForDensity(i5, i6, theme);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i5, int i6, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i5, i6, objArr);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i5, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i5, objArr);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i5, CharSequence charSequence) {
        return super.getText(i5, charSequence);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z5);
    }

    @Override // androidx.appcompat.widget.s2, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i5, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i5, typedValue);
    }
}
