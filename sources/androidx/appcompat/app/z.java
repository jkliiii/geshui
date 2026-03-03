package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: LayoutIncludeDetector.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class z {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Deque<WeakReference<XmlPullParser>> f606 = new ArrayDeque();

    z() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m748(XmlPullParser xmlPullParser) {
        if (xmlPullParser == null) {
            return true;
        }
        try {
            if (xmlPullParser.getEventType() != 3) {
                return xmlPullParser.getEventType() == 1;
            }
            return true;
        } catch (XmlPullParserException unused) {
            return true;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static XmlPullParser m749(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!m748(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static boolean m750(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean m751(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser m749 = m749(this.f606);
        this.f606.push(new WeakReference<>(xmlPullParser));
        return m750(xmlPullParser, m749);
    }
}
