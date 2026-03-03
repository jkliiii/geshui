package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r2 {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static r2 f1445;

    /* renamed from: ʻ, reason: contains not printable characters */
    private WeakHashMap<Context, m.h<ColorStateList>> f1447;

    /* renamed from: ʼ, reason: contains not printable characters */
    private m.g<String, e> f1448;

    /* renamed from: ʽ, reason: contains not printable characters */
    private m.h<String> f1449;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final WeakHashMap<Context, m.d<WeakReference<Drawable.ConstantState>>> f1450 = new WeakHashMap<>(0);

    /* renamed from: ʿ, reason: contains not printable characters */
    private TypedValue f1451;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f1452;

    /* renamed from: ˈ, reason: contains not printable characters */
    private f f1453;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final PorterDuff.Mode f1444 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final c f1446 = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.r2.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public Drawable mo1539(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.m752(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e5);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.r2.e
        /* renamed from: ʻ */
        public Drawable mo1539(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.m5433(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e5);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class c extends m.e<Integer, PorterDuffColorFilter> {
        public c(int i5) {
            super(i5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private static int m1540(int i5, PorterDuff.Mode mode) {
            return ((i5 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        PorterDuffColorFilter m1541(int i5, PorterDuff.Mode mode) {
            return m9807(Integer.valueOf(m1540(i5, mode)));
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        PorterDuffColorFilter m1542(int i5, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m9808(Integer.valueOf(m1540(i5, mode)), porterDuffColorFilter);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.r2.e
        /* renamed from: ʻ */
        public Drawable mo1539(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        g.f.m8659(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e5) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e5);
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    private interface e {
        /* renamed from: ʻ */
        Drawable mo1539(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    public interface f {
        /* renamed from: ʻ */
        boolean mo1391(Context context, int i5, Drawable drawable);

        /* renamed from: ʼ */
        PorterDuff.Mode mo1392(int i5);

        /* renamed from: ʽ */
        Drawable mo1393(r2 r2Var, Context context, int i5);

        /* renamed from: ʾ */
        ColorStateList mo1394(Context context, int i5);

        /* renamed from: ʿ */
        boolean mo1395(Context context, int i5, Drawable drawable);
    }

    /* compiled from: ResourceManagerInternal.java */
    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.r2.e
        /* renamed from: ʻ */
        public Drawable mo1539(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.o.m5472(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e5) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e5);
                return null;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1515(String str, e eVar) {
        if (this.f1448 == null) {
            this.f1448 = new m.g<>();
        }
        this.f1448.put(str, eVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private synchronized boolean m1516(Context context, long j5, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        m.d<WeakReference<Drawable.ConstantState>> dVar = this.f1450.get(context);
        if (dVar == null) {
            dVar = new m.d<>();
            this.f1450.put(context, dVar);
        }
        dVar.m9799(j5, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m1517(Context context, int i5, ColorStateList colorStateList) {
        if (this.f1447 == null) {
            this.f1447 = new WeakHashMap<>();
        }
        m.h<ColorStateList> hVar = this.f1447.get(context);
        if (hVar == null) {
            hVar = new m.h<>();
            this.f1447.put(context, hVar);
        }
        hVar.m9836(i5, colorStateList);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m1518(Context context) {
        if (this.f1452) {
            return;
        }
        this.f1452 = true;
        Drawable m1531 = m1531(context, g.g.f7802);
        if (m1531 == null || !m1527(m1531)) {
            this.f1452 = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static long m1519(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private Drawable m1520(Context context, int i5) {
        if (this.f1451 == null) {
            this.f1451 = new TypedValue();
        }
        TypedValue typedValue = this.f1451;
        context.getResources().getValue(i5, typedValue, true);
        long m1519 = m1519(typedValue);
        Drawable m1523 = m1523(context, m1519);
        if (m1523 != null) {
            return m1523;
        }
        f fVar = this.f1453;
        Drawable mo1393 = fVar == null ? null : fVar.mo1393(this, context, i5);
        if (mo1393 != null) {
            mo1393.setChangingConfigurations(typedValue.changingConfigurations);
            m1516(context, m1519, mo1393);
        }
        return mo1393;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static PorterDuffColorFilter m1521(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1524(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static synchronized r2 m1522() {
        r2 r2Var;
        synchronized (r2.class) {
            if (f1445 == null) {
                r2 r2Var2 = new r2();
                f1445 = r2Var2;
                m1526(r2Var2);
            }
            r2Var = f1445;
        }
        return r2Var;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private synchronized Drawable m1523(Context context, long j5) {
        m.d<WeakReference<Drawable.ConstantState>> dVar = this.f1450.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m9795 = dVar.m9795(j5);
        if (m9795 != null) {
            Drawable.ConstantState constantState = m9795.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m9800(j5);
        }
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m1524(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1541;
        synchronized (r2.class) {
            c cVar = f1446;
            m1541 = cVar.m1541(i5, mode);
            if (m1541 == null) {
                m1541 = new PorterDuffColorFilter(i5, mode);
                cVar.m1542(i5, mode, m1541);
            }
        }
        return m1541;
    }

    /* renamed from: י, reason: contains not printable characters */
    private ColorStateList m1525(Context context, int i5) {
        m.h<ColorStateList> hVar;
        WeakHashMap<Context, m.h<ColorStateList>> weakHashMap = this.f1447;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.m9839(i5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static void m1526(r2 r2Var) {
        if (Build.VERSION.SDK_INT < 24) {
            r2Var.m1515("vector", new g());
            r2Var.m1515("animated-vector", new b());
            r2Var.m1515("animated-selector", new a());
            r2Var.m1515("drawable", new d());
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static boolean m1527(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.o) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Drawable m1528(Context context, int i5) {
        int next;
        m.g<String, e> gVar = this.f1448;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        m.h<String> hVar = this.f1449;
        if (hVar != null) {
            String m9839 = hVar.m9839(i5);
            if ("appcompat_skip_skip".equals(m9839) || (m9839 != null && this.f1448.get(m9839) == null)) {
                return null;
            }
        } else {
            this.f1449 = new m.h<>();
        }
        if (this.f1451 == null) {
            this.f1451 = new TypedValue();
        }
        TypedValue typedValue = this.f1451;
        Resources resources = context.getResources();
        resources.getValue(i5, typedValue, true);
        long m1519 = m1519(typedValue);
        Drawable m1523 = m1523(context, m1519);
        if (m1523 != null) {
            return m1523;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
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
                this.f1449.m9836(i5, name);
                e eVar = this.f1448.get(name);
                if (eVar != null) {
                    m1523 = eVar.mo1539(context, xml, asAttributeSet, context.getTheme());
                }
                if (m1523 != null) {
                    m1523.setChangingConfigurations(typedValue.changingConfigurations);
                    m1516(context, m1519, m1523);
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (m1523 == null) {
            this.f1449.m9836(i5, "appcompat_skip_skip");
        }
        return m1523;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Drawable m1529(Context context, int i5, boolean z5, Drawable drawable) {
        ColorStateList m1533 = m1533(context, i5);
        if (m1533 == null) {
            f fVar = this.f1453;
            if ((fVar == null || !fVar.mo1395(context, i5, drawable)) && !m1538(context, i5, drawable) && z5) {
                return null;
            }
            return drawable;
        }
        if (b2.m1142(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(drawable);
        androidx.core.graphics.drawable.a.m2210(m2213, m1533);
        PorterDuff.Mode m1534 = m1534(i5);
        if (m1534 == null) {
            return m2213;
        }
        androidx.core.graphics.drawable.a.m2211(m2213, m1534);
        return m2213;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static void m1530(Drawable drawable, b3 b3Var, int[] iArr) {
        int[] state = drawable.getState();
        if (b2.m1142(drawable)) {
            if (!(drawable.mutate() == drawable)) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = b3Var.f1174;
        if (z5 || b3Var.f1173) {
            drawable.setColorFilter(m1521(z5 ? b3Var.f1171 : null, b3Var.f1173 ? b3Var.f1172 : f1444, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public synchronized Drawable m1531(Context context, int i5) {
        return m1532(context, i5, false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    synchronized Drawable m1532(Context context, int i5, boolean z5) {
        Drawable m1528;
        m1518(context);
        m1528 = m1528(context, i5);
        if (m1528 == null) {
            m1528 = m1520(context, i5);
        }
        if (m1528 == null) {
            m1528 = androidx.core.content.a.m1993(context, i5);
        }
        if (m1528 != null) {
            m1528 = m1529(context, i5, z5, m1528);
        }
        if (m1528 != null) {
            b2.m1143(m1528);
        }
        return m1528;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    synchronized ColorStateList m1533(Context context, int i5) {
        ColorStateList m1525;
        m1525 = m1525(context, i5);
        if (m1525 == null) {
            f fVar = this.f1453;
            m1525 = fVar == null ? null : fVar.mo1394(context, i5);
            if (m1525 != null) {
                m1517(context, i5, m1525);
            }
        }
        return m1525;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    PorterDuff.Mode m1534(int i5) {
        f fVar = this.f1453;
        if (fVar == null) {
            return null;
        }
        return fVar.mo1392(i5);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public synchronized void m1535(Context context) {
        m.d<WeakReference<Drawable.ConstantState>> dVar = this.f1450.get(context);
        if (dVar != null) {
            dVar.m9793();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    synchronized Drawable m1536(Context context, o3 o3Var, int i5) {
        Drawable m1528 = m1528(context, i5);
        if (m1528 == null) {
            m1528 = o3Var.m1547(i5);
        }
        if (m1528 == null) {
            return null;
        }
        return m1529(context, i5, false, m1528);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public synchronized void m1537(f fVar) {
        this.f1453 = fVar;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    boolean m1538(Context context, int i5, Drawable drawable) {
        f fVar = this.f1453;
        return fVar != null && fVar.mo1391(context, i5, drawable);
    }
}
