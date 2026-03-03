package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends ActionMode {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Context f702;

    /* renamed from: ʼ, reason: contains not printable characters */
    final b f703;

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements b.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final ActionMode.Callback f704;

        /* renamed from: ʼ, reason: contains not printable characters */
        final Context f705;

        /* renamed from: ʽ, reason: contains not printable characters */
        final ArrayList<f> f706 = new ArrayList<>();

        /* renamed from: ʾ, reason: contains not printable characters */
        final m.g<Menu, Menu> f707 = new m.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f705 = context;
            this.f704 = callback;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private Menu m845(Menu menu) {
            Menu menu2 = this.f707.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f705, (v.a) menu);
            this.f707.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʻ */
        public boolean mo695(b bVar, Menu menu) {
            return this.f704.onPrepareActionMode(m846(bVar), m845(menu));
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʼ */
        public void mo696(b bVar) {
            this.f704.onDestroyActionMode(m846(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʽ */
        public boolean mo697(b bVar, MenuItem menuItem) {
            return this.f704.onActionItemClicked(m846(bVar), new androidx.appcompat.view.menu.j(this.f705, (v.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        /* renamed from: ʾ */
        public boolean mo698(b bVar, Menu menu) {
            return this.f704.onCreateActionMode(m846(bVar), m845(menu));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public ActionMode m846(b bVar) {
            int size = this.f706.size();
            for (int i5 = 0; i5 < size; i5++) {
                f fVar = this.f706.get(i5);
                if (fVar != null && fVar.f703 == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f705, bVar);
            this.f706.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f702 = context;
        this.f703 = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f703.mo563();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f703.mo564();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f702, (v.a) this.f703.mo565());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f703.mo566();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f703.mo567();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f703.m835();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f703.mo568();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f703.m836();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f703.mo569();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f703.mo570();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f703.mo571(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f703.mo573(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f703.m837(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f703.mo575(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z5) {
        this.f703.mo576(z5);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i5) {
        this.f703.mo572(i5);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i5) {
        this.f703.mo574(i5);
    }
}
