package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.q;
import androidx.core.graphics.l0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends n {

    /* renamed from: י, reason: contains not printable characters */
    static final PorterDuff.Mode f4622 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʿ, reason: contains not printable characters */
    private h f4623;

    /* renamed from: ˆ, reason: contains not printable characters */
    private PorterDuffColorFilter f4624;

    /* renamed from: ˈ, reason: contains not printable characters */
    private ColorFilter f4625;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f4626;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f4627;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Drawable.ConstantState f4628;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final float[] f4629;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final Matrix f4630;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final Rect f4631;

    /* compiled from: VectorDrawableCompat.java */
    private static class b extends f {
        b() {
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private void m5480(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4658 = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4657 = l0.m2304(string2);
            }
            this.f4659 = q.m2146(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.o.f
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean mo5481() {
            return true;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public void m5482(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (q.m2149(xmlPullParser, "pathData")) {
                TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4591);
                m5480(m2150, xmlPullParser);
                m2150.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class e {
        private e() {
        }

        /* renamed from: ʻ */
        public boolean mo5486() {
            return false;
        }

        /* renamed from: ʼ */
        public boolean mo5487(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class h extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4678;

        /* renamed from: ʼ, reason: contains not printable characters */
        g f4679;

        /* renamed from: ʽ, reason: contains not printable characters */
        ColorStateList f4680;

        /* renamed from: ʾ, reason: contains not printable characters */
        PorterDuff.Mode f4681;

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f4682;

        /* renamed from: ˆ, reason: contains not printable characters */
        Bitmap f4683;

        /* renamed from: ˈ, reason: contains not printable characters */
        ColorStateList f4684;

        /* renamed from: ˉ, reason: contains not printable characters */
        PorterDuff.Mode f4685;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f4686;

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean f4687;

        /* renamed from: ˎ, reason: contains not printable characters */
        boolean f4688;

        /* renamed from: ˏ, reason: contains not printable characters */
        Paint f4689;

        public h(h hVar) {
            this.f4680 = null;
            this.f4681 = o.f4622;
            if (hVar != null) {
                this.f4678 = hVar.f4678;
                g gVar = new g(hVar.f4679);
                this.f4679 = gVar;
                if (hVar.f4679.f4666 != null) {
                    gVar.f4666 = new Paint(hVar.f4679.f4666);
                }
                if (hVar.f4679.f4665 != null) {
                    this.f4679.f4665 = new Paint(hVar.f4679.f4665);
                }
                this.f4680 = hVar.f4680;
                this.f4681 = hVar.f4681;
                this.f4682 = hVar.f4682;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4678;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new o(this);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m5500(int i5, int i6) {
            return i5 == this.f4683.getWidth() && i6 == this.f4683.getHeight();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m5501() {
            return !this.f4688 && this.f4684 == this.f4680 && this.f4685 == this.f4681 && this.f4687 == this.f4682 && this.f4686 == this.f4679.getRootAlpha();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m5502(int i5, int i6) {
            if (this.f4683 == null || !m5500(i5, i6)) {
                this.f4683 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                this.f4688 = true;
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m5503(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4683, (Rect) null, rect, m5504(colorFilter));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public Paint m5504(ColorFilter colorFilter) {
            if (!m5505() && colorFilter == null) {
                return null;
            }
            if (this.f4689 == null) {
                Paint paint = new Paint();
                this.f4689 = paint;
                paint.setFilterBitmap(true);
            }
            this.f4689.setAlpha(this.f4679.getRootAlpha());
            this.f4689.setColorFilter(colorFilter);
            return this.f4689;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public boolean m5505() {
            return this.f4679.getRootAlpha() < 255;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean m5506() {
            return this.f4679.m5498();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public boolean m5507(int[] iArr) {
            boolean m5499 = this.f4679.m5499(iArr);
            this.f4688 |= m5499;
            return m5499;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public void m5508() {
            this.f4684 = this.f4680;
            this.f4685 = this.f4681;
            this.f4686 = this.f4679.getRootAlpha();
            this.f4687 = this.f4682;
            this.f4688 = false;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public void m5509(int i5, int i6) {
            this.f4683.eraseColor(0);
            this.f4679.m5497(new Canvas(this.f4683), i5, i6, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new o(this);
        }

        public h() {
            this.f4680 = null;
            this.f4681 = o.f4622;
            this.f4679 = new g();
        }
    }

    o() {
        this.f4627 = true;
        this.f4629 = new float[9];
        this.f4630 = new Matrix();
        this.f4631 = new Rect();
        this.f4623 = new h();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static int m5470(int i5, float f5) {
        return (i5 & 16777215) | (((int) (Color.alpha(i5) * f5)) << 24);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static o m5471(Resources resources, int i5, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            o oVar = new o();
            oVar.f4621 = androidx.core.content.res.i.m2110(resources, i5, theme);
            oVar.f4628 = new i(oVar.f4621.getConstantState());
            return oVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i5);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m5472(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e5) {
            Log.e("VectorDrawableCompat", "parser error", e5);
            return null;
        } catch (XmlPullParserException e6) {
            Log.e("VectorDrawableCompat", "parser error", e6);
            return null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static o m5472(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        o oVar = new o();
        oVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return oVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5473(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f4623;
        g gVar = hVar.f4679;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4669);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.m5488(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4645.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4677.put(cVar.getPathName(), cVar);
                    }
                    hVar.f4678 = cVar.f4660 | hVar.f4678;
                    z5 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.m5482(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4645.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4677.put(bVar.getPathName(), bVar);
                    }
                    hVar.f4678 = bVar.f4660 | hVar.f4678;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.m5491(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4645.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4677.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f4678 = dVar2.f4654 | hVar.f4678;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m5474() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.m2201(this) == 1;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static PorterDuff.Mode m5475(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m5476(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f4623;
        g gVar = hVar.f4679;
        hVar.f4681 = m5475(q.m2146(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m2142 = q.m2142(typedArray, xmlPullParser, theme, "tint", 1);
        if (m2142 != null) {
            hVar.f4680 = m2142;
        }
        hVar.f4682 = q.m2140(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f4682);
        gVar.f4672 = q.m2145(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4672);
        float m2145 = q.m2145(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4673);
        gVar.f4673 = m2145;
        if (gVar.f4672 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (m2145 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f4670 = typedArray.getDimension(3, gVar.f4670);
        float dimension = typedArray.getDimension(2, gVar.f4671);
        gVar.f4671 = dimension;
        if (gVar.f4670 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(q.m2145(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f4675 = string;
            gVar.f4677.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4621;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.m2197(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4631);
        if (this.f4631.width() <= 0 || this.f4631.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4625;
        if (colorFilter == null) {
            colorFilter = this.f4624;
        }
        canvas.getMatrix(this.f4630);
        this.f4630.getValues(this.f4629);
        float abs = Math.abs(this.f4629[0]);
        float abs2 = Math.abs(this.f4629[4]);
        float abs3 = Math.abs(this.f4629[1]);
        float abs4 = Math.abs(this.f4629[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f4631.width() * abs));
        int min2 = Math.min(2048, (int) (this.f4631.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f4631;
        canvas.translate(rect.left, rect.top);
        if (m5474()) {
            canvas.translate(this.f4631.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4631.offsetTo(0, 0);
        this.f4623.m5502(min, min2);
        if (!this.f4627) {
            this.f4623.m5509(min, min2);
        } else if (!this.f4623.m5501()) {
            this.f4623.m5509(min, min2);
            this.f4623.m5508();
        }
        this.f4623.m5503(canvas, colorFilter, this.f4631);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2199(drawable) : this.f4623.f4679.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4623.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2200(drawable) : this.f4625;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4621 != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4621.getConstantState());
        }
        this.f4623.f4678 = getChangingConfigurations();
        return this.f4623;
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4623.f4679.f4671;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4623.f4679.f4670;
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2203(drawable) : this.f4623.f4682;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f4623) != null && (hVar.m5506() || ((colorStateList = this.f4623.f4680) != null && colorStateList.isStateful())));
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4626 && super.mutate() == this) {
            this.f4623 = new h(this.f4623);
            this.f4626 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4621;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f4623;
        ColorStateList colorStateList = hVar.f4680;
        if (colorStateList == null || (mode = hVar.f4681) == null) {
            z5 = false;
        } else {
            this.f4624 = m5479(this.f4624, colorStateList, mode);
            invalidateSelf();
            z5 = true;
        }
        if (!hVar.m5506() || !hVar.m5507(iArr)) {
            return z5;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else if (this.f4623.f4679.getRootAlpha() != i5) {
            this.f4623.f4679.setRootAlpha(i5);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2205(drawable, z5);
        } else {
            this.f4623.f4682 = z5;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i5) {
        super.setChangingConfigurations(i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i5, PorterDuff.Mode mode) {
        super.setColorFilter(i5, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z5) {
        super.setFilterBitmap(z5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f5, float f6) {
        super.setHotspot(f5, f6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i5, int i6, int i7, int i8) {
        super.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTint(int i5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2209(drawable, i5);
        } else {
            setTintList(ColorStateList.valueOf(i5));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
            return;
        }
        h hVar = this.f4623;
        if (hVar.f4680 != colorStateList) {
            hVar.f4680 = colorStateList;
            this.f4624 = m5479(this.f4624, colorStateList, hVar.f4681);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2211(drawable, mode);
            return;
        }
        h hVar = this.f4623;
        if (hVar.f4681 != mode) {
            hVar.f4681 = mode;
            this.f4624 = m5479(this.f4624, hVar.f4680, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    Object m5477(String str) {
        return this.f4623.f4679.f4677.get(str);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m5478(boolean z5) {
        this.f4627 = z5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    PorterDuffColorFilter m5479(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class i extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Drawable.ConstantState f4690;

        public i(Drawable.ConstantState constantState) {
            this.f4690 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4690.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4690.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            o oVar = new o();
            oVar.f4621 = (VectorDrawable) this.f4690.newDrawable();
            return oVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            o oVar = new o();
            oVar.f4621 = (VectorDrawable) this.f4690.newDrawable(resources);
            return oVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            o oVar = new o();
            oVar.f4621 = (VectorDrawable) this.f4690.newDrawable(resources, theme);
            return oVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4625 = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static abstract class f extends e {

        /* renamed from: ʻ, reason: contains not printable characters */
        protected l0.b[] f4657;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f4658;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4659;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4660;

        public f() {
            super();
            this.f4657 = null;
            this.f4659 = 0;
        }

        public l0.b[] getPathData() {
            return this.f4657;
        }

        public String getPathName() {
            return this.f4658;
        }

        public void setPathData(l0.b[] bVarArr) {
            if (l0.m2302(this.f4657, bVarArr)) {
                l0.m2310(this.f4657, bVarArr);
            } else {
                this.f4657 = l0.m2306(bVarArr);
            }
        }

        /* renamed from: ʽ */
        public boolean mo5481() {
            return false;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m5492(Path path) {
            path.reset();
            l0.b[] bVarArr = this.f4657;
            if (bVarArr != null) {
                l0.b.m2314(bVarArr, path);
            }
        }

        public f(f fVar) {
            super();
            this.f4657 = null;
            this.f4659 = 0;
            this.f4658 = fVar.f4658;
            this.f4660 = fVar.f4660;
            this.f4657 = l0.m2306(fVar.f4657);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2202(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f4623;
        hVar.f4679 = new g();
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4588);
        m5476(m2150, xmlPullParser, theme);
        m2150.recycle();
        hVar.f4678 = getChangingConfigurations();
        hVar.f4688 = true;
        m5473(resources, xmlPullParser, attributeSet, theme);
        this.f4624 = m5479(this.f4624, hVar.f4680, hVar.f4681);
    }

    o(h hVar) {
        this.f4627 = true;
        this.f4629 = new float[9];
        this.f4630 = new Matrix();
        this.f4631 = new Rect();
        this.f4623 = hVar;
        this.f4624 = m5479(this.f4624, hVar.f4680, hVar.f4681);
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class c extends f {

        /* renamed from: ʿ, reason: contains not printable characters */
        private int[] f4632;

        /* renamed from: ˆ, reason: contains not printable characters */
        androidx.core.content.res.d f4633;

        /* renamed from: ˈ, reason: contains not printable characters */
        float f4634;

        /* renamed from: ˉ, reason: contains not printable characters */
        androidx.core.content.res.d f4635;

        /* renamed from: ˊ, reason: contains not printable characters */
        float f4636;

        /* renamed from: ˋ, reason: contains not printable characters */
        float f4637;

        /* renamed from: ˎ, reason: contains not printable characters */
        float f4638;

        /* renamed from: ˏ, reason: contains not printable characters */
        float f4639;

        /* renamed from: ˑ, reason: contains not printable characters */
        float f4640;

        /* renamed from: י, reason: contains not printable characters */
        Paint.Cap f4641;

        /* renamed from: ـ, reason: contains not printable characters */
        Paint.Join f4642;

        /* renamed from: ٴ, reason: contains not printable characters */
        float f4643;

        c() {
            this.f4634 = 0.0f;
            this.f4636 = 1.0f;
            this.f4637 = 1.0f;
            this.f4638 = 0.0f;
            this.f4639 = 1.0f;
            this.f4640 = 0.0f;
            this.f4641 = Paint.Cap.BUTT;
            this.f4642 = Paint.Join.MITER;
            this.f4643 = 4.0f;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private Paint.Cap m5483(int i5, Paint.Cap cap) {
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private Paint.Join m5484(int i5, Paint.Join join) {
            return i5 != 0 ? i5 != 1 ? i5 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m5485(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4632 = null;
            if (q.m2149(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4658 = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4657 = l0.m2304(string2);
                }
                this.f4635 = q.m2144(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4637 = q.m2145(typedArray, xmlPullParser, "fillAlpha", 12, this.f4637);
                this.f4641 = m5483(q.m2146(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4641);
                this.f4642 = m5484(q.m2146(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4642);
                this.f4643 = q.m2145(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4643);
                this.f4633 = q.m2144(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4636 = q.m2145(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4636);
                this.f4634 = q.m2145(typedArray, xmlPullParser, "strokeWidth", 4, this.f4634);
                this.f4639 = q.m2145(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4639);
                this.f4640 = q.m2145(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4640);
                this.f4638 = q.m2145(typedArray, xmlPullParser, "trimPathStart", 5, this.f4638);
                this.f4659 = q.m2146(typedArray, xmlPullParser, "fillType", 13, this.f4659);
            }
        }

        float getFillAlpha() {
            return this.f4637;
        }

        int getFillColor() {
            return this.f4635.m2071();
        }

        float getStrokeAlpha() {
            return this.f4636;
        }

        int getStrokeColor() {
            return this.f4633.m2071();
        }

        float getStrokeWidth() {
            return this.f4634;
        }

        float getTrimPathEnd() {
            return this.f4639;
        }

        float getTrimPathOffset() {
            return this.f4640;
        }

        float getTrimPathStart() {
            return this.f4638;
        }

        void setFillAlpha(float f5) {
            this.f4637 = f5;
        }

        void setFillColor(int i5) {
            this.f4635.m2076(i5);
        }

        void setStrokeAlpha(float f5) {
            this.f4636 = f5;
        }

        void setStrokeColor(int i5) {
            this.f4633.m2076(i5);
        }

        void setStrokeWidth(float f5) {
            this.f4634 = f5;
        }

        void setTrimPathEnd(float f5) {
            this.f4639 = f5;
        }

        void setTrimPathOffset(float f5) {
            this.f4640 = f5;
        }

        void setTrimPathStart(float f5) {
            this.f4638 = f5;
        }

        @Override // androidx.vectordrawable.graphics.drawable.o.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo5486() {
            return this.f4635.m2074() || this.f4633.m2074();
        }

        @Override // androidx.vectordrawable.graphics.drawable.o.e
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean mo5487(int[] iArr) {
            return this.f4633.m2075(iArr) | this.f4635.m2075(iArr);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public void m5488(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4590);
            m5485(m2150, xmlPullParser, theme);
            m2150.recycle();
        }

        c(c cVar) {
            super(cVar);
            this.f4634 = 0.0f;
            this.f4636 = 1.0f;
            this.f4637 = 1.0f;
            this.f4638 = 0.0f;
            this.f4639 = 1.0f;
            this.f4640 = 0.0f;
            this.f4641 = Paint.Cap.BUTT;
            this.f4642 = Paint.Join.MITER;
            this.f4643 = 4.0f;
            this.f4632 = cVar.f4632;
            this.f4633 = cVar.f4633;
            this.f4634 = cVar.f4634;
            this.f4636 = cVar.f4636;
            this.f4635 = cVar.f4635;
            this.f4659 = cVar.f4659;
            this.f4637 = cVar.f4637;
            this.f4638 = cVar.f4638;
            this.f4639 = cVar.f4639;
            this.f4640 = cVar.f4640;
            this.f4641 = cVar.f4641;
            this.f4642 = cVar.f4642;
            this.f4643 = cVar.f4643;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class g {

        /* renamed from: ᐧ, reason: contains not printable characters */
        private static final Matrix f4661 = new Matrix();

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Path f4662;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Path f4663;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Matrix f4664;

        /* renamed from: ʾ, reason: contains not printable characters */
        Paint f4665;

        /* renamed from: ʿ, reason: contains not printable characters */
        Paint f4666;

        /* renamed from: ˆ, reason: contains not printable characters */
        private PathMeasure f4667;

        /* renamed from: ˈ, reason: contains not printable characters */
        private int f4668;

        /* renamed from: ˉ, reason: contains not printable characters */
        final d f4669;

        /* renamed from: ˊ, reason: contains not printable characters */
        float f4670;

        /* renamed from: ˋ, reason: contains not printable characters */
        float f4671;

        /* renamed from: ˎ, reason: contains not printable characters */
        float f4672;

        /* renamed from: ˏ, reason: contains not printable characters */
        float f4673;

        /* renamed from: ˑ, reason: contains not printable characters */
        int f4674;

        /* renamed from: י, reason: contains not printable characters */
        String f4675;

        /* renamed from: ـ, reason: contains not printable characters */
        Boolean f4676;

        /* renamed from: ٴ, reason: contains not printable characters */
        final m.a<String, Object> f4677;

        public g() {
            this.f4664 = new Matrix();
            this.f4670 = 0.0f;
            this.f4671 = 0.0f;
            this.f4672 = 0.0f;
            this.f4673 = 0.0f;
            this.f4674 = 255;
            this.f4675 = null;
            this.f4676 = null;
            this.f4677 = new m.a<>();
            this.f4669 = new d();
            this.f4662 = new Path();
            this.f4663 = new Path();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private static float m5493(float f5, float f6, float f7, float f8) {
            return (f5 * f8) - (f6 * f7);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m5494(d dVar, Matrix matrix, Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            dVar.f4644.set(matrix);
            dVar.f4644.preConcat(dVar.f4653);
            canvas.save();
            for (int i7 = 0; i7 < dVar.f4645.size(); i7++) {
                e eVar = dVar.f4645.get(i7);
                if (eVar instanceof d) {
                    m5494((d) eVar, dVar.f4644, canvas, i5, i6, colorFilter);
                } else if (eVar instanceof f) {
                    m5495(dVar, (f) eVar, canvas, i5, i6, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private void m5495(d dVar, f fVar, Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            float f5 = i5 / this.f4672;
            float f6 = i6 / this.f4673;
            float min = Math.min(f5, f6);
            Matrix matrix = dVar.f4644;
            this.f4664.set(matrix);
            this.f4664.postScale(f5, f6);
            float m5496 = m5496(matrix);
            if (m5496 == 0.0f) {
                return;
            }
            fVar.m5492(this.f4662);
            Path path = this.f4662;
            this.f4663.reset();
            if (fVar.mo5481()) {
                this.f4663.setFillType(fVar.f4659 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f4663.addPath(path, this.f4664);
                canvas.clipPath(this.f4663);
                return;
            }
            c cVar = (c) fVar;
            float f7 = cVar.f4638;
            if (f7 != 0.0f || cVar.f4639 != 1.0f) {
                float f8 = cVar.f4640;
                float f9 = (f7 + f8) % 1.0f;
                float f10 = (cVar.f4639 + f8) % 1.0f;
                if (this.f4667 == null) {
                    this.f4667 = new PathMeasure();
                }
                this.f4667.setPath(this.f4662, false);
                float length = this.f4667.getLength();
                float f11 = f9 * length;
                float f12 = f10 * length;
                path.reset();
                if (f11 > f12) {
                    this.f4667.getSegment(f11, length, path, true);
                    this.f4667.getSegment(0.0f, f12, path, true);
                } else {
                    this.f4667.getSegment(f11, f12, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f4663.addPath(path, this.f4664);
            if (cVar.f4635.m2077()) {
                androidx.core.content.res.d dVar2 = cVar.f4635;
                if (this.f4666 == null) {
                    Paint paint = new Paint(1);
                    this.f4666 = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f4666;
                if (dVar2.m2073()) {
                    Shader m2072 = dVar2.m2072();
                    m2072.setLocalMatrix(this.f4664);
                    paint2.setShader(m2072);
                    paint2.setAlpha(Math.round(cVar.f4637 * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(o.m5470(dVar2.m2071(), cVar.f4637));
                }
                paint2.setColorFilter(colorFilter);
                this.f4663.setFillType(cVar.f4659 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f4663, paint2);
            }
            if (cVar.f4633.m2077()) {
                androidx.core.content.res.d dVar3 = cVar.f4633;
                if (this.f4665 == null) {
                    Paint paint3 = new Paint(1);
                    this.f4665 = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f4665;
                Paint.Join join = cVar.f4642;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f4641;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f4643);
                if (dVar3.m2073()) {
                    Shader m20722 = dVar3.m2072();
                    m20722.setLocalMatrix(this.f4664);
                    paint4.setShader(m20722);
                    paint4.setAlpha(Math.round(cVar.f4636 * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(o.m5470(dVar3.m2071(), cVar.f4636));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f4634 * min * m5496);
                canvas.drawPath(this.f4663, paint4);
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private float m5496(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float m5493 = m5493(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(m5493) / max;
            }
            return 0.0f;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4674;
        }

        public void setAlpha(float f5) {
            setRootAlpha((int) (f5 * 255.0f));
        }

        public void setRootAlpha(int i5) {
            this.f4674 = i5;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m5497(Canvas canvas, int i5, int i6, ColorFilter colorFilter) {
            m5494(this.f4669, f4661, canvas, i5, i6, colorFilter);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public boolean m5498() {
            if (this.f4676 == null) {
                this.f4676 = Boolean.valueOf(this.f4669.mo5486());
            }
            return this.f4676.booleanValue();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean m5499(int[] iArr) {
            return this.f4669.mo5487(iArr);
        }

        public g(g gVar) {
            this.f4664 = new Matrix();
            this.f4670 = 0.0f;
            this.f4671 = 0.0f;
            this.f4672 = 0.0f;
            this.f4673 = 0.0f;
            this.f4674 = 255;
            this.f4675 = null;
            this.f4676 = null;
            m.a<String, Object> aVar = new m.a<>();
            this.f4677 = aVar;
            this.f4669 = new d(gVar.f4669, aVar);
            this.f4662 = new Path(gVar.f4662);
            this.f4663 = new Path(gVar.f4663);
            this.f4670 = gVar.f4670;
            this.f4671 = gVar.f4671;
            this.f4672 = gVar.f4672;
            this.f4673 = gVar.f4673;
            this.f4668 = gVar.f4668;
            this.f4674 = gVar.f4674;
            this.f4675 = gVar.f4675;
            String str = gVar.f4675;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4676 = gVar.f4676;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    private static class d extends e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Matrix f4644;

        /* renamed from: ʼ, reason: contains not printable characters */
        final ArrayList<e> f4645;

        /* renamed from: ʽ, reason: contains not printable characters */
        float f4646;

        /* renamed from: ʾ, reason: contains not printable characters */
        private float f4647;

        /* renamed from: ʿ, reason: contains not printable characters */
        private float f4648;

        /* renamed from: ˆ, reason: contains not printable characters */
        private float f4649;

        /* renamed from: ˈ, reason: contains not printable characters */
        private float f4650;

        /* renamed from: ˉ, reason: contains not printable characters */
        private float f4651;

        /* renamed from: ˊ, reason: contains not printable characters */
        private float f4652;

        /* renamed from: ˋ, reason: contains not printable characters */
        final Matrix f4653;

        /* renamed from: ˎ, reason: contains not printable characters */
        int f4654;

        /* renamed from: ˏ, reason: contains not printable characters */
        private int[] f4655;

        /* renamed from: ˑ, reason: contains not printable characters */
        private String f4656;

        public d(d dVar, m.a<String, Object> aVar) {
            f bVar;
            super();
            this.f4644 = new Matrix();
            this.f4645 = new ArrayList<>();
            this.f4646 = 0.0f;
            this.f4647 = 0.0f;
            this.f4648 = 0.0f;
            this.f4649 = 1.0f;
            this.f4650 = 1.0f;
            this.f4651 = 0.0f;
            this.f4652 = 0.0f;
            Matrix matrix = new Matrix();
            this.f4653 = matrix;
            this.f4656 = null;
            this.f4646 = dVar.f4646;
            this.f4647 = dVar.f4647;
            this.f4648 = dVar.f4648;
            this.f4649 = dVar.f4649;
            this.f4650 = dVar.f4650;
            this.f4651 = dVar.f4651;
            this.f4652 = dVar.f4652;
            this.f4655 = dVar.f4655;
            String str = dVar.f4656;
            this.f4656 = str;
            this.f4654 = dVar.f4654;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4653);
            ArrayList<e> arrayList = dVar.f4645;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                e eVar = arrayList.get(i5);
                if (eVar instanceof d) {
                    this.f4645.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f4645.add(bVar);
                    String str2 = bVar.f4658;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private void m5489() {
            this.f4653.reset();
            this.f4653.postTranslate(-this.f4647, -this.f4648);
            this.f4653.postScale(this.f4649, this.f4650);
            this.f4653.postRotate(this.f4646, 0.0f, 0.0f);
            this.f4653.postTranslate(this.f4651 + this.f4647, this.f4652 + this.f4648);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private void m5490(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4655 = null;
            this.f4646 = q.m2145(typedArray, xmlPullParser, "rotation", 5, this.f4646);
            this.f4647 = typedArray.getFloat(1, this.f4647);
            this.f4648 = typedArray.getFloat(2, this.f4648);
            this.f4649 = q.m2145(typedArray, xmlPullParser, "scaleX", 3, this.f4649);
            this.f4650 = q.m2145(typedArray, xmlPullParser, "scaleY", 4, this.f4650);
            this.f4651 = q.m2145(typedArray, xmlPullParser, "translateX", 6, this.f4651);
            this.f4652 = q.m2145(typedArray, xmlPullParser, "translateY", 7, this.f4652);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4656 = string;
            }
            m5489();
        }

        public String getGroupName() {
            return this.f4656;
        }

        public Matrix getLocalMatrix() {
            return this.f4653;
        }

        public float getPivotX() {
            return this.f4647;
        }

        public float getPivotY() {
            return this.f4648;
        }

        public float getRotation() {
            return this.f4646;
        }

        public float getScaleX() {
            return this.f4649;
        }

        public float getScaleY() {
            return this.f4650;
        }

        public float getTranslateX() {
            return this.f4651;
        }

        public float getTranslateY() {
            return this.f4652;
        }

        public void setPivotX(float f5) {
            if (f5 != this.f4647) {
                this.f4647 = f5;
                m5489();
            }
        }

        public void setPivotY(float f5) {
            if (f5 != this.f4648) {
                this.f4648 = f5;
                m5489();
            }
        }

        public void setRotation(float f5) {
            if (f5 != this.f4646) {
                this.f4646 = f5;
                m5489();
            }
        }

        public void setScaleX(float f5) {
            if (f5 != this.f4649) {
                this.f4649 = f5;
                m5489();
            }
        }

        public void setScaleY(float f5) {
            if (f5 != this.f4650) {
                this.f4650 = f5;
                m5489();
            }
        }

        public void setTranslateX(float f5) {
            if (f5 != this.f4651) {
                this.f4651 = f5;
                m5489();
            }
        }

        public void setTranslateY(float f5) {
            if (f5 != this.f4652) {
                this.f4652 = f5;
                m5489();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.o.e
        /* renamed from: ʻ */
        public boolean mo5486() {
            for (int i5 = 0; i5 < this.f4645.size(); i5++) {
                if (this.f4645.get(i5).mo5486()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.o.e
        /* renamed from: ʼ */
        public boolean mo5487(int[] iArr) {
            boolean z5 = false;
            for (int i5 = 0; i5 < this.f4645.size(); i5++) {
                z5 |= this.f4645.get(i5).mo5487(iArr);
            }
            return z5;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m5491(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4589);
            m5490(m2150, xmlPullParser);
            m2150.recycle();
        }

        public d() {
            super();
            this.f4644 = new Matrix();
            this.f4645 = new ArrayList<>();
            this.f4646 = 0.0f;
            this.f4647 = 0.0f;
            this.f4648 = 0.0f;
            this.f4649 = 1.0f;
            this.f4650 = 1.0f;
            this.f4651 = 0.0f;
            this.f4652 = 0.0f;
            this.f4653 = new Matrix();
            this.f4656 = null;
        }
    }
}
