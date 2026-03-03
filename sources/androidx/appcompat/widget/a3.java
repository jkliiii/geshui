package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a3 extends ContextWrapper {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Object f1157 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    private static ArrayList<WeakReference<a3>> f1158;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Resources f1159;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Resources.Theme f1160;

    private a3(Context context) {
        super(context);
        if (!o3.m1461()) {
            this.f1159 = new c3(this, context.getResources());
            this.f1160 = null;
            return;
        }
        o3 o3Var = new o3(this, context.getResources());
        this.f1159 = o3Var;
        Resources.Theme newTheme = o3Var.newTheme();
        this.f1160 = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m1137(Context context) {
        if ((context instanceof a3) || (context.getResources() instanceof c3) || (context.getResources() instanceof o3)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || o3.m1461();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Context m1138(Context context) {
        if (!m1137(context)) {
            return context;
        }
        synchronized (f1157) {
            ArrayList<WeakReference<a3>> arrayList = f1158;
            if (arrayList == null) {
                f1158 = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<a3> weakReference = f1158.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1158.remove(size);
                    }
                }
                for (int size2 = f1158.size() - 1; size2 >= 0; size2--) {
                    WeakReference<a3> weakReference2 = f1158.get(size2);
                    a3 a3Var = weakReference2 != null ? weakReference2.get() : null;
                    if (a3Var != null && a3Var.getBaseContext() == context) {
                        return a3Var;
                    }
                }
            }
            a3 a3Var2 = new a3(context);
            f1158.add(new WeakReference<>(a3Var2));
            return a3Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1159.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1159;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1160;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i5) {
        Resources.Theme theme = this.f1160;
        if (theme == null) {
            super.setTheme(i5);
        } else {
            theme.applyStyle(i5, true);
        }
    }
}
