package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ConstraintLayoutStates.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ConstraintLayout f1861;

    /* renamed from: ʼ, reason: contains not printable characters */
    f f1862;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f1863 = -1;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f1864 = -1;

    /* renamed from: ʿ, reason: contains not printable characters */
    private SparseArray<a> f1865 = new SparseArray<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    private SparseArray<f> f1866 = new SparseArray<>();

    /* compiled from: ConstraintLayoutStates.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f1867;

        /* renamed from: ʼ, reason: contains not printable characters */
        ArrayList<b> f1868 = new ArrayList<>();

        /* renamed from: ʽ, reason: contains not printable characters */
        int f1869;

        /* renamed from: ʾ, reason: contains not printable characters */
        f f1870;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1869 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.f2446);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2447) {
                    this.f1867 = obtainStyledAttributes.getResourceId(index, this.f1867);
                } else if (index == l.f2448) {
                    this.f1869 = obtainStyledAttributes.getResourceId(index, this.f1869);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1869);
                    context.getResources().getResourceName(this.f1869);
                    if ("layout".equals(resourceTypeName)) {
                        f fVar = new f();
                        this.f1870 = fVar;
                        fVar.m1858(context, this.f1869);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1842(b bVar) {
            this.f1868.add(bVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m1843(float f5, float f6) {
            for (int i5 = 0; i5 < this.f1868.size(); i5++) {
                if (this.f1868.get(i5).m1844(f5, f6)) {
                    return i5;
                }
            }
            return -1;
        }
    }

    /* compiled from: ConstraintLayoutStates.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        float f1871;

        /* renamed from: ʼ, reason: contains not printable characters */
        float f1872;

        /* renamed from: ʽ, reason: contains not printable characters */
        float f1873;

        /* renamed from: ʾ, reason: contains not printable characters */
        float f1874;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f1875;

        /* renamed from: ˆ, reason: contains not printable characters */
        f f1876;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1871 = Float.NaN;
            this.f1872 = Float.NaN;
            this.f1873 = Float.NaN;
            this.f1874 = Float.NaN;
            this.f1875 = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), l.f2472);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2473) {
                    this.f1875 = obtainStyledAttributes.getResourceId(index, this.f1875);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1875);
                    context.getResources().getResourceName(this.f1875);
                    if ("layout".equals(resourceTypeName)) {
                        f fVar = new f();
                        this.f1876 = fVar;
                        fVar.m1858(context, this.f1875);
                    }
                } else if (index == l.f2474) {
                    this.f1874 = obtainStyledAttributes.getDimension(index, this.f1874);
                } else if (index == l.f2475) {
                    this.f1872 = obtainStyledAttributes.getDimension(index, this.f1872);
                } else if (index == l.f2476) {
                    this.f1873 = obtainStyledAttributes.getDimension(index, this.f1873);
                } else if (index == l.f2477) {
                    this.f1871 = obtainStyledAttributes.getDimension(index, this.f1871);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m1844(float f5, float f6) {
            if (!Float.isNaN(this.f1871) && f5 < this.f1871) {
                return false;
            }
            if (!Float.isNaN(this.f1872) && f6 < this.f1872) {
                return false;
            }
            if (Float.isNaN(this.f1873) || f5 <= this.f1873) {
                return Float.isNaN(this.f1874) || f6 <= this.f1874;
            }
            return false;
        }
    }

    e(Context context, ConstraintLayout constraintLayout, int i5) {
        this.f1861 = constraintLayout;
        m1838(context, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1838(android.content.Context r8, int r9) {
        /*
            r7 = this;
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)
            int r0 = r9.getEventType()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r1 = 0
        Ld:
            r2 = 1
            if (r0 == r2) goto L8b
            if (r0 == 0) goto L7a
            r3 = 2
            if (r0 == r3) goto L17
            goto L7d
        L17:
            java.lang.String r0 = r9.getName()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            int r4 = r0.hashCode()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L4c;
                case 80204913: goto L42;
                case 1382829617: goto L39;
                case 1657696882: goto L2f;
                case 1901439077: goto L25;
                default: goto L24;
            }     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
        L24:
            goto L56
        L25:
            java.lang.String r2 = "Variant"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = 3
            goto L57
        L2f:
            java.lang.String r2 = "layoutDescription"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = 0
            goto L57
        L39:
            java.lang.String r4 = "StateSet"
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            goto L57
        L42:
            java.lang.String r2 = "State"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = 2
            goto L57
        L4c:
            java.lang.String r2 = "ConstraintSet"
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r0 == 0) goto L56
            r2 = 4
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == r3) goto L6d
            if (r2 == r6) goto L62
            if (r2 == r5) goto L5e
            goto L7d
        L5e:
            r7.m1839(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L62:
            androidx.constraintlayout.widget.e$b r0 = new androidx.constraintlayout.widget.e$b     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r0.<init>(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            if (r1 == 0) goto L7d
            r1.m1842(r0)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L6d:
            androidx.constraintlayout.widget.e$a r1 = new androidx.constraintlayout.widget.e$a     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r1.<init>(r8, r9)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            android.util.SparseArray<androidx.constraintlayout.widget.e$a> r0 = r7.f1865     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            int r2 = r1.f1867     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            r0.put(r2, r1)     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto L7d
        L7a:
            r9.getName()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
        L7d:
            int r0 = r9.next()     // Catch: java.io.IOException -> L82 org.xmlpull.v1.XmlPullParserException -> L87
            goto Ld
        L82:
            r8 = move-exception
            r8.printStackTrace()
            goto L8b
        L87:
            r8 = move-exception
            r8.printStackTrace()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.m1838(android.content.Context, int):void");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1839(Context context, XmlPullParser xmlPullParser) {
        f fVar = new f();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeName = xmlPullParser.getAttributeName(i5);
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                fVar.m1863(context, xmlPullParser);
                this.f1866.put(identifier, fVar);
                return;
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m1841(int i5, float f5, float f6) {
        int m1843;
        int i6 = this.f1863;
        if (i6 == i5) {
            a valueAt = i5 == -1 ? this.f1865.valueAt(0) : this.f1865.get(i6);
            int i7 = this.f1864;
            if ((i7 == -1 || !valueAt.f1868.get(i7).m1844(f5, f6)) && this.f1864 != (m1843 = valueAt.m1843(f5, f6))) {
                f fVar = m1843 == -1 ? this.f1862 : valueAt.f1868.get(m1843).f1876;
                if (m1843 != -1) {
                    int i8 = valueAt.f1868.get(m1843).f1875;
                }
                if (fVar == null) {
                    return;
                }
                this.f1864 = m1843;
                fVar.m1856(this.f1861);
                return;
            }
            return;
        }
        this.f1863 = i5;
        a aVar = this.f1865.get(i5);
        int m18432 = aVar.m1843(f5, f6);
        f fVar2 = m18432 == -1 ? aVar.f1870 : aVar.f1868.get(m18432).f1876;
        if (m18432 != -1) {
            int i9 = aVar.f1868.get(m18432).f1875;
        }
        if (fVar2 != null) {
            this.f1864 = m18432;
            fVar2.m1856(this.f1861);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i5 + ", dim =" + f5 + ", " + f6);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m1840(h hVar) {
    }
}
