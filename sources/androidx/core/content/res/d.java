package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ComplexColorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Shader f2596;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final ColorStateList f2597;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f2598;

    private d(Shader shader, ColorStateList colorStateList, int i5) {
        this.f2596 = shader;
        this.f2597 = colorStateList;
        this.f2598 = i5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static d m2066(Resources resources, int i5, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i5);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return m2069(g.m2100(resources, xml, asAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m2068(c.m2059(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static d m2067(int i5) {
        return new d(null, null, i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static d m2068(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static d m2069(Shader shader) {
        return new d(shader, null, 0);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static d m2070(Resources resources, int i5, Resources.Theme theme) {
        try {
            return m2066(resources, i5, theme);
        } catch (Exception e5) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e5);
            return null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m2071() {
        return this.f2598;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Shader m2072() {
        return this.f2596;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m2073() {
        return this.f2596 != null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m2074() {
        ColorStateList colorStateList;
        return this.f2596 == null && (colorStateList = this.f2597) != null && colorStateList.isStateful();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m2075(int[] iArr) {
        if (m2074()) {
            ColorStateList colorStateList = this.f2597;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2598) {
                this.f2598 = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m2076(int i5) {
        this.f2598 = i5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m2077() {
        return m2073() || this.f2598 != 0;
    }
}
