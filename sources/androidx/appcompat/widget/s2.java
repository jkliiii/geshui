package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class s2 extends Resources {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Resources f1456;

    public s2(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1456 = resources;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i5) throws Resources.NotFoundException {
        return this.f1456.getAnimation(i5);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i5) throws Resources.NotFoundException {
        return this.f1456.getBoolean(i5);
    }

    @Override // android.content.res.Resources
    public int getColor(int i5) throws Resources.NotFoundException {
        return this.f1456.getColor(i5);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i5) throws Resources.NotFoundException {
        return this.f1456.getColorStateList(i5);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f1456.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i5) throws Resources.NotFoundException {
        return this.f1456.getDimension(i5);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i5) throws Resources.NotFoundException {
        return this.f1456.getDimensionPixelOffset(i5);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i5) throws Resources.NotFoundException {
        return this.f1456.getDimensionPixelSize(i5);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f1456.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5, Resources.Theme theme) throws Resources.NotFoundException {
        return androidx.core.content.res.i.m2110(this.f1456, i5, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i5, int i6) throws Resources.NotFoundException {
        return androidx.core.content.res.i.m2111(this.f1456, i5, i6, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i5, int i6, int i7) {
        return this.f1456.getFraction(i5, i6, i7);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f1456.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i5) throws Resources.NotFoundException {
        return this.f1456.getIntArray(i5);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i5) throws Resources.NotFoundException {
        return this.f1456.getInteger(i5);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i5) throws Resources.NotFoundException {
        return this.f1456.getLayout(i5);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i5) throws Resources.NotFoundException {
        return this.f1456.getMovie(i5);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i5, int i6, Object... objArr) throws Resources.NotFoundException {
        return this.f1456.getQuantityString(i5, i6, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i5, int i6) throws Resources.NotFoundException {
        return this.f1456.getQuantityText(i5, i6);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i5) throws Resources.NotFoundException {
        return this.f1456.getResourceEntryName(i5);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i5) throws Resources.NotFoundException {
        return this.f1456.getResourceName(i5);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i5) throws Resources.NotFoundException {
        return this.f1456.getResourcePackageName(i5);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i5) throws Resources.NotFoundException {
        return this.f1456.getResourceTypeName(i5);
    }

    @Override // android.content.res.Resources
    public String getString(int i5) throws Resources.NotFoundException {
        return this.f1456.getString(i5);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i5) throws Resources.NotFoundException {
        return this.f1456.getStringArray(i5);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i5) throws Resources.NotFoundException {
        return this.f1456.getText(i5);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i5) throws Resources.NotFoundException {
        return this.f1456.getTextArray(i5);
    }

    @Override // android.content.res.Resources
    public void getValue(int i5, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        this.f1456.getValue(i5, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i5, int i6, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        g.a.m8652(this.f1456, i5, i6, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i5) throws Resources.NotFoundException {
        return this.f1456.getXml(i5);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1456.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i5) throws Resources.NotFoundException {
        return this.f1456.obtainTypedArray(i5);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i5) throws Resources.NotFoundException {
        return this.f1456.openRawResource(i5);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i5) throws Resources.NotFoundException {
        return this.f1456.openRawResourceFd(i5);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f1456.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f1456.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1456;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final Drawable m1547(int i5) throws Resources.NotFoundException {
        return super.getDrawable(i5);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i5, int i6, Resources.Theme theme) {
        return androidx.core.content.res.i.m2111(this.f1456, i5, i6, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i5, int i6) throws Resources.NotFoundException {
        return this.f1456.getQuantityString(i5, i6);
    }

    @Override // android.content.res.Resources
    public String getString(int i5, Object... objArr) throws Resources.NotFoundException {
        return this.f1456.getString(i5, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i5, CharSequence charSequence) {
        return this.f1456.getText(i5, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z5) throws Resources.NotFoundException {
        this.f1456.getValue(str, typedValue, z5);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i5, TypedValue typedValue) throws Resources.NotFoundException {
        return this.f1456.openRawResource(i5, typedValue);
    }
}
