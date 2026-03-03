package n3;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.lt.plugin.topsnackbar.TSnackbar;

/* compiled from: Snack.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TSnackbar f9937;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Snackbar f9938;

    private k1(int i5, View view, CharSequence charSequence, int i6) {
        if (i5 == 1) {
            this.f9937 = TSnackbar.m8053(view, charSequence, i6);
            this.f9938 = null;
        } else {
            this.f9937 = null;
            this.f9938 = Snackbar.make(view, charSequence, i6).setAnimationMode(0);
        }
        m10802(-1);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static k1 m10797(int i5, View view, CharSequence charSequence, int i6) {
        return new k1(i5, view, charSequence, i6);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public k1 m10798(int i5) {
        TSnackbar tSnackbar = this.f9937;
        if (tSnackbar != null) {
            tSnackbar.m8059(i5);
        } else {
            this.f9938.setBackgroundTint(i5);
        }
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m10799() {
        TSnackbar tSnackbar = this.f9937;
        if (tSnackbar != null) {
            tSnackbar.m8055();
        } else {
            this.f9938.dismiss();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m10800() {
        TSnackbar tSnackbar = this.f9937;
        return tSnackbar != null ? tSnackbar.m8057() : this.f9938.isShown();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public k1 m10801() {
        TSnackbar tSnackbar = this.f9937;
        if (tSnackbar != null) {
            tSnackbar.m8064();
        } else {
            this.f9938.show();
        }
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public k1 m10802(int i5) {
        TSnackbar tSnackbar = this.f9937;
        if (tSnackbar != null) {
            tSnackbar.m8062(i5);
        } else {
            this.f9938.setTextColor(i5);
        }
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public k1 m10803(int i5) {
        TSnackbar tSnackbar = this.f9937;
        if (tSnackbar != null) {
            tSnackbar.m8063(i5);
        } else {
            this.f9938.setTextMaxLines(i5);
        }
        return this;
    }
}
