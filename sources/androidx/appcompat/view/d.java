package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends ContextWrapper {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static Configuration f689;

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f690;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Resources.Theme f691;

    /* renamed from: ʽ, reason: contains not printable characters */
    private LayoutInflater f692;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Configuration f693;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Resources f694;

    /* compiled from: ContextThemeWrapper.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Context m844(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private Resources m838() {
        if (this.f694 == null) {
            Configuration configuration = this.f693;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && m840(configuration))) {
                this.f694 = super.getResources();
            } else {
                this.f694 = a.m844(this, this.f693).getResources();
            }
        }
        return this.f694;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m839() {
        boolean z5 = this.f691 == null;
        if (z5) {
            this.f691 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f691.setTo(theme);
            }
        }
        m843(this.f691, this.f690, z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean m840(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f689 == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f689 = configuration2;
        }
        return configuration.equals(f689);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m838();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f692 == null) {
            this.f692 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f692;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f691;
        if (theme != null) {
            return theme;
        }
        if (this.f690 == 0) {
            this.f690 = e.i.f7078;
        }
        m839();
        return this.f691;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        if (this.f690 != i5) {
            this.f690 = i5;
            m839();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m841(Configuration configuration) {
        if (this.f694 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f693 != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f693 = new Configuration(configuration);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m842() {
        return this.f690;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected void m843(Resources.Theme theme, int i5, boolean z5) {
        theme.applyStyle(i5, true);
    }

    public d(Context context, int i5) {
        super(context);
        this.f690 = i5;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f691 = theme;
    }
}
