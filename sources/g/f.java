package g;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Compatibility.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static Drawable m8657(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m8658(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m8659(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
