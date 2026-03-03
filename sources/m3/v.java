package m3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import com.lt.app.App;
import h3.j2;
import h3.z;
import java.util.List;
import n3.z1;
import org.json.JSONObject;

/* compiled from: LTDrawer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v implements View.OnClickListener {

    /* renamed from: י, reason: contains not printable characters */
    private static v f9292;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final DrawerLayout f9293;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final j2.f f9294;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final l3.j f9295;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f9296 = 0;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f9297 = 1;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f9298 = 2;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final int f9299 = 3;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f9300 = 4;

    /* renamed from: ˏ, reason: contains not printable characters */
    private NavigationView f9301 = null;

    /* renamed from: ˑ, reason: contains not printable characters */
    private String f9302 = null;

    /* compiled from: LTDrawer.java */
    class a implements NavigationView.OnNavigationItemSelectedListener {

        /* compiled from: LTDrawer.java */
        /* renamed from: m3.v$a$a, reason: collision with other inner class name */
        class C0133a implements z.c {
            C0133a() {
            }

            @Override // h3.z.c
            /* renamed from: ʻ */
            public void mo8744() {
                com.lt.app.c.m7959(v.this.f9294.getContext(), 2131820574);
            }
        }

        a() {
        }

        @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
        public boolean onNavigationItemSelected(MenuItem menuItem) {
            v.this.m10079();
            if (menuItem.getGroupId() == 1) {
                l3.k kVar = v.this.f9295.ms.get(menuItem.getItemId());
                if (TextUtils.isEmpty(kVar.f12867u)) {
                    return true;
                }
                v.this.m10075(kVar.f12867u, kVar.f12866t);
            } else {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    j2.m8909(9, v.this.f9294, null, null, true);
                } else if (itemId == 1) {
                    v.this.f9294.reload();
                } else if (itemId != 2) {
                    if (itemId != 3) {
                        if (itemId == 4) {
                            com.lt.app.c.m7963(v.this.f9294.getContext());
                        }
                    } else if (App.m7815(8, true)) {
                        g3.a0.m8719((com.lt.app.b) v.this.f9294.getContext(), v.this.f9294);
                    } else {
                        com.lt.app.c.m7959(v.this.f9294.getContext(), 2131820688);
                    }
                } else if (App.m7815(6, true)) {
                    h3.z.m9099(new C0133a(), v.this.f9294);
                } else {
                    com.lt.app.c.m7959(v.this.f9294.getContext(), 2131820688);
                }
            }
            return true;
        }
    }

    /* compiled from: LTDrawer.java */
    class b implements m2.g<Bitmap> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ MenuItem f9305;

        b(MenuItem menuItem) {
            this.f9305 = menuItem;
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, Bitmap bitmap) {
            if (bitmap != null) {
                this.f9305.setIcon(new BitmapDrawable(v.this.f9293.getResources(), bitmap));
            }
        }
    }

    private v(DrawerLayout drawerLayout, j2.f fVar, l3.j jVar) {
        this.f9293 = drawerLayout;
        this.f9294 = fVar;
        this.f9295 = jVar;
        m10077();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public void m10075(String str, int i5) {
        String m10888 = z1.m10888(this.f9294.getContext(), str);
        if (TextUtils.isEmpty(m10888)) {
            return;
        }
        if (URLUtil.isHttpsUrl(m10888) || URLUtil.isHttpUrl(m10888) || m10888.startsWith("file:")) {
            if (i5 == 0) {
                this.f9294.loadUrl(m10888, null);
                return;
            } else {
                com.lt.app.c.m7986(this.f9294.getContext(), m10888, i5 == 2);
                return;
            }
        }
        if (URLUtil.isJavaScriptUrl(m10888)) {
            this.f9294.mo7788(m10888);
        } else {
            com.lt.app.c.m7985(this.f9294.getContext(), m10888);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static v m10076() {
        return f9292;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m10077() {
        NavigationView navigationView = (NavigationView) View.inflate(this.f9294.getContext(), 2131427377, null);
        this.f9301 = navigationView;
        this.f9293.addView(navigationView, new DrawerLayout.e(-2, -1, 8388611));
        this.f9301.setNavigationItemSelectedListener(new a());
        this.f9301.setBackgroundColor(Color.parseColor(this.f9295.cb));
        this.f9301.setItemTextColor(ColorStateList.valueOf(Color.parseColor(this.f9295.ct)));
        this.f9301.setItemIconTintList(ColorStateList.valueOf(Color.parseColor(this.f9295.ci)));
        if (this.f9295.m9739(0)) {
            View inflateHeaderView = this.f9301.inflateHeaderView(2131427378);
            if (this.f9295.m9739(1)) {
                ImageView imageView = (ImageView) inflateHeaderView.findViewById(2131230959);
                imageView.setVisibility(0);
                x2.l.m12713(imageView).mo189(this.f9295.hi);
            } else {
                inflateHeaderView.setBackgroundColor(Color.parseColor(this.f9295.hc));
            }
            TextView textView = (TextView) inflateHeaderView.findViewById(2131231245);
            textView.setText(App.m7835().m7849());
            textView.setTextColor(Color.parseColor(this.f9295.ht));
        }
        Menu menu = this.f9301.getMenu();
        List<l3.k> list = this.f9295.ms;
        if (list != null && list.size() > 0) {
            int i5 = 0;
            for (l3.k kVar : this.f9295.ms) {
                int i6 = i5 + 1;
                x2.l.m12714(this.f9294.getContext()).mo187(kVar.f12864i).mo181().mo9865(new b(menu.add(1, i5, 0, kVar.f12865n)));
                i5 = i6;
            }
        }
        Resources resources = this.f9293.getResources();
        if (this.f9295.m9739(6)) {
            menu.add(2, 0, 0, 2131820585).setIcon(resources.getDrawable(2131165320));
        }
        if (this.f9295.m9739(7)) {
            menu.add(2, 1, 0, 2131820583).setIcon(resources.getDrawable(2131165321));
        }
        if (this.f9295.m9739(8)) {
            menu.add(2, 2, 0, 2131820573).setIcon(resources.getDrawable(2131165322));
        }
        if (this.f9295.m9739(9)) {
            menu.add(2, 3, 0, 2131820584).setIcon(resources.getDrawable(2131165323));
        }
        if (this.f9295.m9739(10)) {
            menu.add(2, 4, 0, 2131820576).setIcon(resources.getDrawable(2131165319));
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static v m10078(View view, j2.f fVar) {
        l3.j jVar;
        if (!(view instanceof DrawerLayout)) {
            return null;
        }
        f9292 = null;
        l3.a m7827 = App.m7827();
        if (m7827 == null || (jVar = m7827.m52) == null) {
            return null;
        }
        v vVar = new v((DrawerLayout) view, fVar, jVar);
        f9292 = vVar;
        return vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (TextUtils.isEmpty(this.f9302)) {
            return;
        }
        m10079();
        m10075(this.f9302, 0);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m10079() {
        if (!this.f9293.m3696(8388611)) {
            return false;
        }
        this.f9293.m3703(8388611);
        return true;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m10080(JSONObject jSONObject) {
        if (jSONObject == null || this.f9301.getHeaderCount() == 0) {
            return;
        }
        View headerView = this.f9301.getHeaderView(0);
        String optString = jSONObject.optString("background");
        if (!TextUtils.isEmpty(optString)) {
            ImageView imageView = (ImageView) headerView.findViewById(2131230959);
            if (optString.startsWith("#")) {
                imageView.setVisibility(8);
                headerView.setBackgroundColor(g3.a0.m8711(optString, -16777216));
            } else {
                imageView.setVisibility(0);
                x2.l.m12713(imageView).mo189(optString);
            }
        }
        String optString2 = jSONObject.optString("textColor");
        if (!TextUtils.isEmpty(optString2)) {
            ((TextView) headerView.findViewById(2131231245)).setTextColor(g3.a0.m8711(optString2, -1));
        }
        String optString3 = jSONObject.optString("text");
        if (!TextUtils.isEmpty(optString3)) {
            ((TextView) headerView.findViewById(2131231245)).setText(optString3);
        }
        String optString4 = jSONObject.optString("icon");
        if (!TextUtils.isEmpty(optString4)) {
            x2.l.m12713((ImageView) headerView.findViewById(2131230967)).mo189(optString4);
        }
        if (jSONObject.has("action")) {
            String optString5 = jSONObject.optString("action");
            this.f9302 = optString5;
            if (TextUtils.isEmpty(optString5)) {
                return;
            }
            headerView.setOnClickListener(this);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m10081() {
        return this.f9293.m3696(8388611);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m10082() {
        if (this.f9293.m3696(8388611)) {
            return;
        }
        this.f9293.m3712(8388611);
    }
}
