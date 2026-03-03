package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.b2;
import androidx.appcompat.widget.d3;
import androidx.core.view.l0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends MenuInflater {

    /* renamed from: ʿ, reason: contains not printable characters */
    static final Class<?>[] f708;

    /* renamed from: ˆ, reason: contains not printable characters */
    static final Class<?>[] f709;

    /* renamed from: ʻ, reason: contains not printable characters */
    final Object[] f710;

    /* renamed from: ʼ, reason: contains not printable characters */
    final Object[] f711;

    /* renamed from: ʽ, reason: contains not printable characters */
    Context f712;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Object f713;

    /* compiled from: SupportMenuInflater.java */
    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: ʽ, reason: contains not printable characters */
        private static final Class<?>[] f714 = {MenuItem.class};

        /* renamed from: ʻ, reason: contains not printable characters */
        private Object f715;

        /* renamed from: ʼ, reason: contains not printable characters */
        private Method f716;

        public a(Object obj, String str) {
            this.f715 = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f716 = cls.getMethod(str, f714);
            } catch (Exception e5) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f716.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f716.invoke(this.f715, menuItem)).booleanValue();
                }
                this.f716.invoke(this.f715, menuItem);
                return true;
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    private class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Menu f717;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        private CharSequence f718;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f719;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f721;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f723;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f724;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f726;

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f727;

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean f728;

        /* renamed from: ˊ, reason: contains not printable characters */
        private int f729;

        /* renamed from: ˋ, reason: contains not printable characters */
        private int f730;

        /* renamed from: ˎ, reason: contains not printable characters */
        private CharSequence f731;

        /* renamed from: ˏ, reason: contains not printable characters */
        private CharSequence f732;

        /* renamed from: ˑ, reason: contains not printable characters */
        private int f733;

        /* renamed from: י, reason: contains not printable characters */
        private char f734;

        /* renamed from: ـ, reason: contains not printable characters */
        private int f735;

        /* renamed from: ٴ, reason: contains not printable characters */
        private char f736;

        /* renamed from: ᐧ, reason: contains not printable characters */
        private int f737;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        androidx.core.view.b f738;

        /* renamed from: ᴵ, reason: contains not printable characters */
        private int f739;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        private CharSequence f740;

        /* renamed from: ᵎ, reason: contains not printable characters */
        private boolean f741;

        /* renamed from: ᵔ, reason: contains not printable characters */
        private boolean f742;

        /* renamed from: ᵢ, reason: contains not printable characters */
        private boolean f743;

        /* renamed from: ⁱ, reason: contains not printable characters */
        private int f744;

        /* renamed from: ﹳ, reason: contains not printable characters */
        private int f745;

        /* renamed from: ﹶ, reason: contains not printable characters */
        private String f746;

        /* renamed from: ﾞ, reason: contains not printable characters */
        private String f747;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private String f748;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        private ColorStateList f722 = null;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        private PorterDuff.Mode f720 = null;

        public b(Menu menu) {
            this.f717 = menu;
            m858();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private char m850(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private <T> T m851(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f712.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e5) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
                return null;
            }
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private void m852(MenuItem menuItem) {
            boolean z5 = false;
            menuItem.setChecked(this.f741).setVisible(this.f742).setEnabled(this.f743).setCheckable(this.f739 >= 1).setTitleCondensed(this.f732).setIcon(this.f733);
            int i5 = this.f744;
            if (i5 >= 0) {
                menuItem.setShowAsAction(i5);
            }
            if (this.f748 != null) {
                if (g.this.f712.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.m849(), this.f748));
            }
            if (this.f739 >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).m965(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).m972(true);
                }
            }
            String str = this.f746;
            if (str != null) {
                menuItem.setActionView((View) m851(str, g.f708, g.this.f710));
                z5 = true;
            }
            int i6 = this.f745;
            if (i6 > 0) {
                if (z5) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i6);
                }
            }
            androidx.core.view.b bVar = this.f738;
            if (bVar != null) {
                l0.m3178(menuItem, bVar);
            }
            l0.m3180(menuItem, this.f740);
            l0.m3184(menuItem, this.f718);
            l0.m3179(menuItem, this.f734, this.f735);
            l0.m3183(menuItem, this.f736, this.f737);
            PorterDuff.Mode mode = this.f720;
            if (mode != null) {
                l0.m3182(menuItem, mode);
            }
            ColorStateList colorStateList = this.f722;
            if (colorStateList != null) {
                l0.m3181(menuItem, colorStateList);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m853() {
            this.f728 = true;
            m852(this.f717.add(this.f719, this.f729, this.f730, this.f731));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public SubMenu m854() {
            this.f728 = true;
            SubMenu addSubMenu = this.f717.addSubMenu(this.f719, this.f729, this.f730, this.f731);
            m852(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m855() {
            return this.f728;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m856(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f712.obtainStyledAttributes(attributeSet, e.j.f7163);
            this.f719 = obtainStyledAttributes.getResourceId(e.j.f7165, 0);
            this.f721 = obtainStyledAttributes.getInt(e.j.f7167, 0);
            this.f723 = obtainStyledAttributes.getInt(e.j.f7168, 0);
            this.f724 = obtainStyledAttributes.getInt(e.j.f7169, 0);
            this.f726 = obtainStyledAttributes.getBoolean(e.j.f7166, true);
            this.f727 = obtainStyledAttributes.getBoolean(e.j.f7164, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public void m857(AttributeSet attributeSet) {
            d3 m1180 = d3.m1180(g.this.f712, attributeSet, e.j.f7170);
            this.f729 = m1180.m1195(e.j.f7173, 0);
            this.f730 = (m1180.m1192(e.j.f7176, this.f721) & (-65536)) | (m1180.m1192(e.j.f7177, this.f723) & 65535);
            this.f731 = m1180.m1197(e.j.f7178);
            this.f732 = m1180.m1197(e.j.f7179);
            this.f733 = m1180.m1195(e.j.f7171, 0);
            this.f734 = m850(m1180.m1196(e.j.f7180));
            this.f735 = m1180.m1192(e.j.f7189, 4096);
            this.f736 = m850(m1180.m1196(e.j.f7181));
            this.f737 = m1180.m1192(e.j.f7193, 4096);
            int i5 = e.j.f7182;
            if (m1180.m1200(i5)) {
                this.f739 = m1180.m1182(i5, false) ? 1 : 0;
            } else {
                this.f739 = this.f724;
            }
            this.f741 = m1180.m1182(e.j.f7174, false);
            this.f742 = m1180.m1182(e.j.f7175, this.f726);
            this.f743 = m1180.m1182(e.j.f7172, this.f727);
            this.f744 = m1180.m1192(e.j.f7194, -1);
            this.f748 = m1180.m1196(e.j.f7184);
            this.f745 = m1180.m1195(e.j.f7185, 0);
            this.f746 = m1180.m1196(e.j.f7187);
            String m1196 = m1180.m1196(e.j.f7186);
            this.f747 = m1196;
            boolean z5 = m1196 != null;
            if (z5 && this.f745 == 0 && this.f746 == null) {
                this.f738 = (androidx.core.view.b) m851(m1196, g.f709, g.this.f711);
            } else {
                if (z5) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f738 = null;
            }
            this.f740 = m1180.m1197(e.j.f7190);
            this.f718 = m1180.m1197(e.j.f7195);
            int i6 = e.j.f7192;
            if (m1180.m1200(i6)) {
                this.f720 = b2.m1146(m1180.m1192(i6, -1), this.f720);
            } else {
                this.f720 = null;
            }
            int i7 = e.j.f7191;
            if (m1180.m1200(i7)) {
                this.f722 = m1180.m1184(i7);
            } else {
                this.f722 = null;
            }
            m1180.m1201();
            this.f728 = false;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public void m858() {
            this.f719 = 0;
            this.f721 = 0;
            this.f723 = 0;
            this.f724 = 0;
            this.f726 = true;
            this.f727 = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f708 = clsArr;
        f709 = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f712 = context;
        Object[] objArr = {context};
        this.f710 = objArr;
        this.f711 = objArr;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Object m847(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? m847(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m858();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m855() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.mo973() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m854();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m853();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.m856(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m857(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m848(r13, r14, r0.m854());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m848(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m858()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m855()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f738
            if (r15 == 0) goto L82
            boolean r15 = r15.mo973()
            if (r15 == 0) goto L82
            r0.m854()
            goto Lb9
        L82:
            r0.m853()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m856(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m857(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m854()
            r12.m848(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.m848(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i5, Menu menu) {
        if (!(menu instanceof v.a)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f712.getResources().getLayout(i5);
                    m848(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e5) {
                    throw new InflateException("Error inflating menu XML", e5);
                }
            } catch (XmlPullParserException e6) {
                throw new InflateException("Error inflating menu XML", e6);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    Object m849() {
        if (this.f713 == null) {
            this.f713 = m847(this.f712);
        }
        return this.f713;
    }
}
