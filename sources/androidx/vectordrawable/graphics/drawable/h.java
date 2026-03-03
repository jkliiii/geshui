package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.q;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends n implements Animatable {

    /* renamed from: ʿ, reason: contains not printable characters */
    private c f4602;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Context f4603;

    /* renamed from: ˈ, reason: contains not printable characters */
    private ArgbEvaluator f4604;

    /* renamed from: ˉ, reason: contains not printable characters */
    d f4605;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Animator.AnimatorListener f4606;

    /* renamed from: ˋ, reason: contains not printable characters */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f4607;

    /* renamed from: ˎ, reason: contains not printable characters */
    final Drawable.Callback f4608;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            h.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            h.this.scheduleSelf(runnable, j5);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            h.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(h.this.f4607);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i5)).mo5425(h.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(h.this.f4607);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i5)).mo5426(h.this);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    private static class c extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4611;

        /* renamed from: ʼ, reason: contains not printable characters */
        o f4612;

        /* renamed from: ʽ, reason: contains not printable characters */
        AnimatorSet f4613;

        /* renamed from: ʾ, reason: contains not printable characters */
        ArrayList<Animator> f4614;

        /* renamed from: ʿ, reason: contains not printable characters */
        m.a<Animator, String> f4615;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f4611 = cVar.f4611;
                o oVar = cVar.f4612;
                if (oVar != null) {
                    Drawable.ConstantState constantState = oVar.getConstantState();
                    if (resources != null) {
                        this.f4612 = (o) constantState.newDrawable(resources);
                    } else {
                        this.f4612 = (o) constantState.newDrawable();
                    }
                    o oVar2 = (o) this.f4612.mutate();
                    this.f4612 = oVar2;
                    oVar2.setCallback(callback);
                    this.f4612.setBounds(cVar.f4612.getBounds());
                    this.f4612.m5478(false);
                }
                ArrayList<Animator> arrayList = cVar.f4614;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4614 = new ArrayList<>(size);
                    this.f4615 = new m.a<>(size);
                    for (int i5 = 0; i5 < size; i5++) {
                        Animator animator = cVar.f4614.get(i5);
                        Animator clone = animator.clone();
                        String str = cVar.f4615.get(animator);
                        clone.setTarget(this.f4612.m5477(str));
                        this.f4614.add(clone);
                        this.f4615.put(clone, str);
                    }
                    m5441();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4611;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m5441() {
            if (this.f4613 == null) {
                this.f4613 = new AnimatorSet();
            }
            this.f4613.playTogether(this.f4614);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    h() {
        this(null, null, null);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static h m5432(Context context, int i5) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h(context);
            Drawable m2110 = androidx.core.content.res.i.m2110(context.getResources(), i5, context.getTheme());
            hVar.f4621 = m2110;
            m2110.setCallback(hVar.f4608);
            hVar.f4605 = new d(hVar.f4621.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i5);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return m5433(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e5) {
            Log.e("AnimatedVDCompat", "parser error", e5);
            return null;
        } catch (XmlPullParserException e6) {
            Log.e("AnimatedVDCompat", "parser error", e6);
            return null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static h m5433(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h(context);
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m5434(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.m5424());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5435() {
        Animator.AnimatorListener animatorListener = this.f4606;
        if (animatorListener != null) {
            this.f4602.f4613.removeListener(animatorListener);
            this.f4606 = null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5436(String str, Animator animator) {
        animator.setTarget(this.f4602.f4612.m5477(str));
        if (Build.VERSION.SDK_INT < 21) {
            m5437(animator);
        }
        c cVar = this.f4602;
        if (cVar.f4614 == null) {
            cVar.f4614 = new ArrayList<>();
            this.f4602.f4615 = new m.a<>();
        }
        this.f4602.f4614.add(animator);
        this.f4602.f4615.put(animator, str);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5437(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i5 = 0; i5 < childAnimations.size(); i5++) {
                m5437(childAnimations.get(i5));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4604 == null) {
                    this.f4604 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4604);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m5438(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.m5424());
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2196(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.m2197(drawable);
        }
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
        this.f4602.f4612.draw(canvas);
        if (this.f4602.f4613.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2199(drawable) : this.f4602.f4612.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4602.f4611;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2200(drawable) : this.f4602.f4612.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4621 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f4621.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4602.f4612.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4602.f4612.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f4602.f4612.getOpacity();
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
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2202(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4592);
                    int resourceId = m2150.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o m5471 = o.m5471(resources, resourceId, theme);
                        m5471.m5478(false);
                        m5471.setCallback(this.f4608);
                        o oVar = this.f4602.f4612;
                        if (oVar != null) {
                            oVar.setCallback(null);
                        }
                        this.f4602.f4612 = m5471;
                    }
                    m2150.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f4593);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4603;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        m5436(string, k.m5453(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4602.m5441();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4621;
        return drawable != null ? androidx.core.graphics.drawable.a.m2203(drawable) : this.f4602.f4612.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f4621;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4602.f4613.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.isStateful() : this.f4602.f4612.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4602.f4612.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.n, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.setLevel(i5) : this.f4602.f4612.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4621;
        return drawable != null ? drawable.setState(iArr) : this.f4602.f4612.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setAlpha(i5);
        } else {
            this.f4602.f4612.setAlpha(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2205(drawable, z5);
        } else {
            this.f4602.f4612.setAutoMirrored(z5);
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
            this.f4602.f4612.setTint(i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
        } else {
            this.f4602.f4612.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.y
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2211(drawable, mode);
        } else {
            this.f4602.f4612.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f4602.f4612.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f4602.f4613.isStarted()) {
                return;
            }
            this.f4602.f4613.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4602.f4613.end();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m5439(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            m5434((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f4607 == null) {
            this.f4607 = new ArrayList<>();
        }
        if (this.f4607.contains(bVar)) {
            return;
        }
        this.f4607.add(bVar);
        if (this.f4606 == null) {
            this.f4606 = new b();
        }
        this.f4602.f4613.addListener(this.f4606);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m5440(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            m5438((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f4607;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(bVar);
        if (this.f4607.size() == 0) {
            m5435();
        }
        return remove;
    }

    private h(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4621;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4602.f4612.setColorFilter(colorFilter);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    private static class d extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Drawable.ConstantState f4616;

        public d(Drawable.ConstantState constantState) {
            this.f4616 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4616.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4616.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            Drawable newDrawable = this.f4616.newDrawable();
            hVar.f4621 = newDrawable;
            newDrawable.setCallback(hVar.f4608);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            Drawable newDrawable = this.f4616.newDrawable(resources);
            hVar.f4621 = newDrawable;
            newDrawable.setCallback(hVar.f4608);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            Drawable newDrawable = this.f4616.newDrawable(resources, theme);
            hVar.f4621 = newDrawable;
            newDrawable.setCallback(hVar.f4608);
            return hVar;
        }
    }

    private h(Context context, c cVar, Resources resources) {
        this.f4604 = null;
        this.f4606 = null;
        this.f4607 = null;
        a aVar = new a();
        this.f4608 = aVar;
        this.f4603 = context;
        if (cVar != null) {
            this.f4602 = cVar;
        } else {
            this.f4602 = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
