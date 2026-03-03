package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.h;
import androidx.appcompat.widget.r2;
import androidx.core.content.res.q;
import androidx.core.graphics.drawable.y;
import androidx.vectordrawable.graphics.drawable.o;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends h implements y {

    /* renamed from: ᴵ, reason: contains not printable characters */
    private c f607;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private g f608;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f609;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f610;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f611;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class b extends g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Animatable f612;

        b(Animatable animatable) {
            super();
            this.f612 = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo764() {
            this.f612.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo765() {
            this.f612.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    static class c extends h.a {

        /* renamed from: ˈˈ, reason: contains not printable characters */
        m.d<Long> f613;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        m.h<Integer> f614;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f613 = cVar.f613;
                this.f614 = cVar.f614;
            } else {
                this.f613 = new m.d<>();
                this.f614 = new m.h<>();
            }
        }

        /* renamed from: ʽʽ, reason: contains not printable characters */
        private static long m766(int i5, int i6) {
            return i6 | (i5 << 32);
        }

        @Override // androidx.appcompat.graphics.drawable.h.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        /* renamed from: ʻʻ, reason: contains not printable characters */
        int m767(int i5, int i6, Drawable drawable, boolean z5) {
            int m793 = super.m793(drawable);
            long m766 = m766(i5, i6);
            long j5 = z5 ? 8589934592L : 0L;
            long j6 = m793;
            this.f613.m9792(m766, Long.valueOf(j6 | j5));
            if (z5) {
                this.f613.m9792(m766(i6, i5), Long.valueOf(4294967296L | j6 | j5));
            }
            return m793;
        }

        /* renamed from: ʼʼ, reason: contains not printable characters */
        int m768(int i5) {
            if (i5 < 0) {
                return 0;
            }
            return this.f614.m9840(i5, 0).intValue();
        }

        /* renamed from: ʾʾ, reason: contains not printable characters */
        int m769(int i5, int i6) {
            return (int) this.f613.m9796(m766(i5, i6), -1L).longValue();
        }

        /* renamed from: ʿʿ, reason: contains not printable characters */
        int m770(int[] iArr) {
            int m825 = super.m825(iArr);
            return m825 >= 0 ? m825 : super.m825(StateSet.WILD_CARD);
        }

        /* renamed from: ˆˆ, reason: contains not printable characters */
        boolean m771(int i5, int i6) {
            return (this.f613.m9796(m766(i5, i6), -1L).longValue() & 8589934592L) != 0;
        }

        /* renamed from: ــ, reason: contains not printable characters */
        boolean m772(int i5, int i6) {
            return (this.f613.m9796(m766(i5, i6), -1L).longValue() & 4294967296L) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.h.a, androidx.appcompat.graphics.drawable.b.d
        /* renamed from: ᴵ, reason: contains not printable characters */
        void mo773() {
            this.f613 = this.f613.clone();
            this.f614 = this.f614.clone();
        }

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        int m774(int[] iArr, Drawable drawable, int i5) {
            int m826 = super.m826(iArr, drawable);
            this.f614.m9843(m826, Integer.valueOf(i5));
            return m826;
        }

        @Override // androidx.appcompat.graphics.drawable.h.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class d extends g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.vectordrawable.graphics.drawable.h f615;

        d(androidx.vectordrawable.graphics.drawable.h hVar) {
            super();
            this.f615 = hVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʽ */
        public void mo764() {
            this.f615.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʾ */
        public void mo765() {
            this.f615.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class e extends g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ObjectAnimator f616;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f617;

        e(AnimationDrawable animationDrawable, boolean z5, boolean z6) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i5 = z5 ? numberOfFrames - 1 : 0;
            int i6 = z5 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z5);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i5, i6);
            g.b.m8653(ofInt, true);
            ofInt.setDuration(fVar.m777());
            ofInt.setInterpolator(fVar);
            this.f617 = z6;
            this.f616 = ofInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo775() {
            return this.f617;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo776() {
            this.f616.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʽ */
        public void mo764() {
            this.f616.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        /* renamed from: ʾ */
        public void mo765() {
            this.f616.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static class f implements TimeInterpolator {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int[] f618;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f619;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f620;

        f(AnimationDrawable animationDrawable, boolean z5) {
            m778(animationDrawable, z5);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            int i5 = (int) ((f5 * this.f620) + 0.5f);
            int i6 = this.f619;
            int[] iArr = this.f618;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = iArr[i7];
                if (i5 < i8) {
                    break;
                }
                i5 -= i8;
                i7++;
            }
            return (i7 / i6) + (i7 < i6 ? i5 / this.f620 : 0.0f);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        int m777() {
            return this.f620;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        int m778(AnimationDrawable animationDrawable, boolean z5) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f619 = numberOfFrames;
            int[] iArr = this.f618;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f618 = new int[numberOfFrames];
            }
            int[] iArr2 = this.f618;
            int i5 = 0;
            for (int i6 = 0; i6 < numberOfFrames; i6++) {
                int duration = animationDrawable.getDuration(z5 ? (numberOfFrames - i6) - 1 : i6);
                iArr2[i6] = duration;
                i5 += duration;
            }
            this.f620 = i5;
            return i5;
        }
    }

    public a() {
        this(null, null);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static a m752(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m763(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m753(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m755(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m756(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m754() {
        onStateChange(getState());
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int m755(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, g.h.f7810);
        int resourceId = m2150.getResourceId(g.h.f7811, 0);
        int resourceId2 = m2150.getResourceId(g.h.f7812, -1);
        Drawable m1531 = resourceId2 > 0 ? r2.m1522().m1531(context, resourceId2) : null;
        m2150.recycle();
        int[] m824 = m824(attributeSet);
        if (m1531 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m1531 = xmlPullParser.getName().equals("vector") ? o.m5472(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? g.f.m8657(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m1531 != null) {
            return this.f607.m774(m824, m1531, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int m756(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, g.h.f7813);
        int resourceId = m2150.getResourceId(g.h.f7816, -1);
        int resourceId2 = m2150.getResourceId(g.h.f7815, -1);
        int resourceId3 = m2150.getResourceId(g.h.f7814, -1);
        Drawable m1531 = resourceId3 > 0 ? r2.m1522().m1531(context, resourceId3) : null;
        boolean z5 = m2150.getBoolean(g.h.f7817, false);
        m2150.recycle();
        if (m1531 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            m1531 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.h.m5433(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? g.f.m8657(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
        }
        if (m1531 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f607.m767(resourceId, resourceId2, m1531, z5);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean m757(int i5) {
        int m783;
        int m769;
        g bVar;
        g gVar = this.f608;
        if (gVar == null) {
            m783 = m783();
        } else {
            if (i5 == this.f609) {
                return true;
            }
            if (i5 == this.f610 && gVar.mo775()) {
                gVar.mo776();
                this.f609 = this.f610;
                this.f610 = i5;
                return true;
            }
            m783 = this.f609;
            gVar.mo765();
        }
        this.f608 = null;
        this.f610 = -1;
        this.f609 = -1;
        c cVar = this.f607;
        int m768 = cVar.m768(m783);
        int m7682 = cVar.m768(i5);
        if (m7682 == 0 || m768 == 0 || (m769 = cVar.m769(m768, m7682)) < 0) {
            return false;
        }
        boolean m771 = cVar.m771(m768, m7682);
        m784(m769);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m772(m768, m7682), m771);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.h)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.h) current);
        }
        bVar.mo764();
        this.f608 = bVar;
        this.f610 = m783;
        this.f609 = i5;
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m758(TypedArray typedArray) {
        c cVar = this.f607;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f641 |= g.f.m8658(typedArray);
        }
        cVar.m813(typedArray.getBoolean(g.h.f7806, cVar.f649));
        cVar.m809(typedArray.getBoolean(g.h.f7807, cVar.f652));
        cVar.m810(typedArray.getInt(g.h.f7808, cVar.f659));
        cVar.m811(typedArray.getInt(g.h.f7809, cVar.f661));
        setDither(typedArray.getBoolean(g.h.f7804, cVar.f667));
    }

    @Override // androidx.appcompat.graphics.drawable.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f608;
        if (gVar != null) {
            gVar.mo765();
            this.f608 = null;
            m784(this.f609);
            this.f609 = -1;
            this.f610 = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.h, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f611 && super.mutate() == this) {
            this.f607.mo773();
            this.f611 = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.h, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int m770 = this.f607.m770(iArr);
        boolean z5 = m770 != m783() && (m757(m770) || m784(m770));
        Drawable current = getCurrent();
        return current != null ? z5 | current.setState(iArr) : z5;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        g gVar = this.f608;
        if (gVar != null && (visible || z6)) {
            if (z5) {
                gVar.mo764();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.graphics.drawable.h, androidx.appcompat.graphics.drawable.b
    /* renamed from: ˉ, reason: contains not printable characters */
    void mo760(b.d dVar) {
        super.mo760(dVar);
        if (dVar instanceof c) {
            this.f607 = (c) dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.h
    /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c mo759() {
        return new c(this.f607, this, null);
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m763(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, g.h.f7803);
        setVisible(m2150.getBoolean(g.h.f7805, true), true);
        m758(m2150);
        m785(resources);
        m2150.recycle();
        m753(context, resources, xmlPullParser, attributeSet, theme);
        m754();
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f609 = -1;
        this.f610 = -1;
        mo760(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    private static abstract class g {
        private g() {
        }

        /* renamed from: ʻ */
        public boolean mo775() {
            return false;
        }

        /* renamed from: ʽ */
        public abstract void mo764();

        /* renamed from: ʾ */
        public abstract void mo765();

        /* renamed from: ʼ */
        public void mo776() {
        }
    }
}
