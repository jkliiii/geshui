package n3;

import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;

/* compiled from: GeneralActivityBase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class l extends d {

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private boolean f9939 = false;

    @Override // n3.d, androidx.fragment.app.f, androidx.activity.h, androidx.core.app.n, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(i1.f9768);
        setContentView(f1.f9733);
        this.f9939 = getIntent().getBooleanExtra("k_dark_theme", false);
        int color = getResources().getColor(this.f9939 ? b1.f9712 : b1.f9714);
        int color2 = getResources().getColor(this.f9939 ? b1.f9713 : b1.f9715);
        z1.m10902(findViewById(e1.f9729), this.f9939, color2);
        Toolbar toolbar = (Toolbar) findViewById(e1.f9732);
        if (toolbar != null) {
            m512(toolbar);
            toolbar.setTitleTextColor(color);
            toolbar.setBackgroundColor(color2);
            androidx.appcompat.app.a m519 = m519();
            if (m519 != null) {
                m519.mo487(true);
                m519.mo489(true);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) f.a.m8475(this, d1.f9728);
                if (bitmapDrawable != null) {
                    bitmapDrawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                    m519.mo488(bitmapDrawable);
                }
            }
        }
        String stringExtra = getIntent().getStringExtra("k_title");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        setTitle(stringExtra);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // n3.d, androidx.fragment.app.f, android.app.Activity
    protected void onPause() {
        InputMethodManager inputMethodManager;
        View peekDecorView = getWindow().peekDecorView();
        if (peekDecorView != null && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(peekDecorView.getWindowToken(), 0);
        }
        super.onPause();
    }
}
