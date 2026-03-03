package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FontResourcesParserCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* compiled from: FontResourcesParserCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2087(TypedArray typedArray, int i5) {
            return typedArray.getType(i5);
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public interface b {
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class c implements b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final d[] f2599;

        public c(d[] dVarArr) {
            this.f2599 = dVarArr;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public d[] m2088() {
            return this.f2599;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f2600;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f2601;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final boolean f2602;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final String f2603;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f2604;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final int f2605;

        public d(String str, int i5, boolean z5, String str2, int i6, int i7) {
            this.f2600 = str;
            this.f2601 = i5;
            this.f2602 = z5;
            this.f2603 = str2;
            this.f2604 = i6;
            this.f2605 = i7;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public String m2089() {
            return this.f2600;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m2090() {
            return this.f2605;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m2091() {
            return this.f2604;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public String m2092() {
            return this.f2603;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int m2093() {
            return this.f2601;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public boolean m2094() {
            return this.f2602;
        }
    }

    /* compiled from: FontResourcesParserCompat.java */
    public static final class e implements b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.core.provider.e f2606;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f2607;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2608;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final String f2609;

        public e(androidx.core.provider.e eVar, int i5, int i6, String str) {
            this.f2606 = eVar;
            this.f2608 = i5;
            this.f2607 = i6;
            this.f2609 = str;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public int m2095() {
            return this.f2608;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public androidx.core.provider.e m2096() {
            return this.f2606;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public String m2097() {
            return this.f2609;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public int m2098() {
            return this.f2607;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m2079(TypedArray typedArray, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m2087(typedArray, i5);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i5, typedValue);
        return typedValue.type;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static b m2080(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2082(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static List<List<byte[]>> m2081(Resources resources, int i5) {
        if (i5 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i5);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2079(obtainTypedArray, 0) == 1) {
                for (int i6 = 0; i6 < obtainTypedArray.length(); i6++) {
                    int resourceId = obtainTypedArray.getResourceId(i6, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2086(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2086(resources.getStringArray(i5)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static b m2082(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2083(xmlPullParser, resources);
        }
        m2085(xmlPullParser);
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static b m2083(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), u.c.f11407);
        String string = obtainAttributes.getString(u.c.f11409);
        String string2 = obtainAttributes.getString(u.c.f11417);
        String string3 = obtainAttributes.getString(u.c.f11419);
        int resourceId = obtainAttributes.getResourceId(u.c.f11411, 0);
        int integer = obtainAttributes.getInteger(u.c.f11413, 1);
        int integer2 = obtainAttributes.getInteger(u.c.f11415, 500);
        String string4 = obtainAttributes.getString(u.c.f11420);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                m2085(xmlPullParser);
            }
            return new e(new androidx.core.provider.e(string, string2, string3, m2081(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(m2084(xmlPullParser, resources));
                } else {
                    m2085(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static d m2084(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), u.c.f11422);
        int i5 = u.c.f11433;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = u.c.f11425;
        }
        int i6 = obtainAttributes.getInt(i5, 400);
        int i7 = u.c.f11431;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = u.c.f11427;
        }
        boolean z5 = 1 == obtainAttributes.getInt(i7, 0);
        int i8 = u.c.f11434;
        if (!obtainAttributes.hasValue(i8)) {
            i8 = u.c.f11428;
        }
        int i9 = u.c.f11432;
        if (!obtainAttributes.hasValue(i9)) {
            i9 = u.c.f11429;
        }
        String string = obtainAttributes.getString(i9);
        int i10 = obtainAttributes.getInt(i8, 0);
        int i11 = u.c.f11430;
        if (!obtainAttributes.hasValue(i11)) {
            i11 = u.c.f11423;
        }
        int resourceId = obtainAttributes.getResourceId(i11, 0);
        String string2 = obtainAttributes.getString(i11);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2085(xmlPullParser);
        }
        return new d(string2, i6, z5, string, i10, resourceId);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m2085(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i5 = 1;
        while (i5 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i5++;
            } else if (next == 3) {
                i5--;
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static List<byte[]> m2086(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
