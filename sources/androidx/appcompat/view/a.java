package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* compiled from: ActionBarPolicy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private Context f686;

    private a(Context context) {
        this.f686 = context;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static a m827(Context context) {
        return new a(context);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m828() {
        return this.f686.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m829() {
        return this.f686.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m830() {
        Configuration configuration = this.f686.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600) {
            return 5;
        }
        if (i5 > 960 && i6 > 720) {
            return 5;
        }
        if (i5 > 720 && i6 > 960) {
            return 5;
        }
        if (i5 >= 500) {
            return 4;
        }
        if (i5 > 640 && i6 > 480) {
            return 4;
        }
        if (i5 <= 480 || i6 <= 640) {
            return i5 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m831() {
        return this.f686.getResources().getDimensionPixelSize(e.d.f6938);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m832() {
        TypedArray obtainStyledAttributes = this.f686.obtainStyledAttributes(null, e.j.f7079, e.a.f6888, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(e.j.f7309, 0);
        Resources resources = this.f686.getResources();
        if (!m833()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(e.d.f6937));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m833() {
        return this.f686.getResources().getBoolean(e.b.f6928);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m834() {
        return true;
    }
}
