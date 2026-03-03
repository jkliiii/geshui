package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* compiled from: ActionMenuPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c extends androidx.appcompat.view.menu.b implements b.a {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    a f1175;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private b f1176;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    RunnableC0018c f1177;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    int f1178;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    final f f1179;

    /* renamed from: י, reason: contains not printable characters */
    d f1180;

    /* renamed from: ـ, reason: contains not printable characters */
    private Drawable f1181;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f1182;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f1183;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final SparseBooleanArray f1184;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f1185;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    e f1186;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f1187;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f1188;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f1189;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f1190;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f1191;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f1192;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f1193;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f1194;

    /* compiled from: ActionMenuPresenter.java */
    private class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, e.a.f6906);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).m955()) {
                View view2 = c.this.f1180;
                m993(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f819 : view2);
            }
            m997(c.this.f1179);
        }

        @Override // androidx.appcompat.view.menu.l
        /* renamed from: ʿ */
        protected void mo992() {
            c cVar = c.this;
            cVar.f1175 = null;
            cVar.f1178 = 0;
            super.mo992();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        /* renamed from: ʻ */
        public androidx.appcompat.view.menu.p mo884() {
            a aVar = c.this.f1175;
            if (aVar != null) {
                return aVar.m990();
            }
            return null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0018c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        private e f1197;

        public RunnableC0018c(e eVar) {
            this.f1197 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f813 != null) {
                ((androidx.appcompat.view.menu.b) c.this).f813.changeMenuMode();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f819;
            if (view != null && view.getWindowToken() != null && this.f1197.m999()) {
                c.this.f1186 = this.f1197;
            }
            c.this.f1177 = null;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class d extends q implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        class a extends g2 {

            /* renamed from: ˑ, reason: contains not printable characters */
            final /* synthetic */ c f1200;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1200 = cVar;
            }

            @Override // androidx.appcompat.widget.g2
            /* renamed from: ʼ */
            public androidx.appcompat.view.menu.p mo882() {
                e eVar = c.this.f1186;
                if (eVar == null) {
                    return null;
                }
                return eVar.m990();
            }

            @Override // androidx.appcompat.widget.g2
            /* renamed from: ʽ */
            public boolean mo883() {
                c.this.m1158();
                return true;
            }

            @Override // androidx.appcompat.widget.g2
            /* renamed from: ʾ, reason: contains not printable characters */
            public boolean mo1170() {
                c cVar = c.this;
                if (cVar.f1177 != null) {
                    return false;
                }
                cVar.m1163();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, e.a.f6904);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            j3.m1399(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.m1158();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i5, int i6, int i7, int i8) {
            boolean frame = super.setFrame(i5, i6, i7, i8);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.m2207(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        /* renamed from: ʻ */
        public boolean mo879() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        /* renamed from: ʼ */
        public boolean mo880() {
            return false;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z5) {
            super(context, gVar, view, z5, e.a.f6906);
            m995(8388613);
            m997(c.this.f1179);
        }

        @Override // androidx.appcompat.view.menu.l
        /* renamed from: ʿ */
        protected void mo992() {
            if (((androidx.appcompat.view.menu.b) c.this).f813 != null) {
                ((androidx.appcompat.view.menu.b) c.this).f813.close();
            }
            c.this.f1186 = null;
            super.mo992();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.getRootMenu().close(false);
            }
            m.a m902 = c.this.m902();
            if (m902 != null) {
                m902.onCloseMenu(gVar, z5);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        /* renamed from: ʻ */
        public boolean mo527(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f813) {
                return false;
            }
            c.this.f1178 = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a m902 = c.this.m902();
            if (m902 != null) {
                return m902.mo527(gVar);
            }
            return false;
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    @SuppressLint({"BanParcelableUsage"})
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f1204;

        /* compiled from: ActionMenuPresenter.java */
        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public g[] newArray(int i5) {
                return new g[i5];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f1204);
        }

        g(Parcel parcel) {
            this.f1204 = parcel.readInt();
        }
    }

    public c(Context context) {
        super(context, e.g.f7041, e.g.f7040);
        this.f1184 = new SparseBooleanArray();
        this.f1179 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᴵ, reason: contains not printable characters */
    private View m1157(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f819;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        ArrayList<androidx.appcompat.view.menu.i> arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f813;
        View view = null;
        int i9 = 0;
        if (gVar != null) {
            arrayList = gVar.getVisibleItems();
            i5 = arrayList.size();
        } else {
            arrayList = null;
            i5 = 0;
        }
        int i10 = cVar.f1189;
        int i11 = cVar.f1188;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f819;
        boolean z5 = false;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14++) {
            androidx.appcompat.view.menu.i iVar = arrayList.get(i14);
            if (iVar.m958()) {
                i12++;
            } else if (iVar.m957()) {
                i13++;
            } else {
                z5 = true;
            }
            if (cVar.f1193 && iVar.isActionViewExpanded()) {
                i10 = 0;
            }
        }
        if (cVar.f1183 && (z5 || i13 + i12 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = cVar.f1184;
        sparseBooleanArray.clear();
        if (cVar.f1191) {
            int i16 = cVar.f1194;
            i7 = i11 / i16;
            i6 = i16 + ((i11 % i16) / i7);
        } else {
            i6 = 0;
            i7 = 0;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i5) {
            androidx.appcompat.view.menu.i iVar2 = arrayList.get(i17);
            if (iVar2.m958()) {
                View mo903 = cVar.mo903(iVar2, view, viewGroup);
                if (cVar.f1191) {
                    i7 -= ActionMenuView.m1035(mo903, i6, i7, makeMeasureSpec, i9);
                } else {
                    mo903.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo903.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.m966(true);
                i8 = i5;
            } else if (iVar2.m957()) {
                int groupId2 = iVar2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = (i15 > 0 || z6) && i11 > 0 && (!cVar.f1191 || i7 > 0);
                boolean z8 = z7;
                i8 = i5;
                if (z7) {
                    View mo9032 = cVar.mo903(iVar2, null, viewGroup);
                    if (cVar.f1191) {
                        int m1035 = ActionMenuView.m1035(mo9032, i6, i7, makeMeasureSpec, 0);
                        i7 -= m1035;
                        if (m1035 == 0) {
                            z8 = false;
                        }
                    } else {
                        mo9032.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z9 = z8;
                    int measuredWidth2 = mo9032.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i18 == 0) {
                        i18 = measuredWidth2;
                    }
                    z7 = z9 & (!cVar.f1191 ? i11 + i18 <= 0 : i11 < 0);
                }
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i19 = 0; i19 < i17; i19++) {
                        androidx.appcompat.view.menu.i iVar3 = arrayList.get(i19);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.m955()) {
                                i15++;
                            }
                            iVar3.m966(false);
                        }
                    }
                }
                if (z7) {
                    i15--;
                }
                iVar2.m966(z7);
            } else {
                i8 = i5;
                iVar2.m966(false);
                i17++;
                view = null;
                cVar = this;
                i5 = i8;
                i9 = 0;
            }
            i17++;
            view = null;
            cVar = this;
            i5 = i8;
            i9 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void initForMenu(Context context, androidx.appcompat.view.menu.g gVar) {
        super.initForMenu(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a m827 = androidx.appcompat.view.a.m827(context);
        if (!this.f1185) {
            this.f1183 = m827.m834();
        }
        if (!this.f1192) {
            this.f1187 = m827.m829();
        }
        if (!this.f1190) {
            this.f1189 = m827.m830();
        }
        int i5 = this.f1187;
        if (this.f1183) {
            if (this.f1180 == null) {
                d dVar = new d(this.f811);
                this.f1180 = dVar;
                if (this.f1182) {
                    dVar.setImageDrawable(this.f1181);
                    this.f1181 = null;
                    this.f1182 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1180.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f1180.getMeasuredWidth();
        } else {
            this.f1180 = null;
        }
        this.f1188 = i5;
        this.f1194 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
        m1159();
        super.onCloseMenu(gVar, z5);
    }

    @Override // androidx.appcompat.view.menu.m
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i5;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i5 = ((g) parcelable).f1204) > 0 && (findItem = this.f813.findItem(i5)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.r) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable onSaveInstanceState() {
        g gVar = new g();
        gVar.f1204 = this.f1178;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.r rVar) {
        boolean z5 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.getParentMenu() != this.f813) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.getParentMenu();
        }
        View m1157 = m1157(rVar2.getItem());
        if (m1157 == null) {
            return false;
        }
        this.f1178 = rVar.getItem().getItemId();
        int size = rVar.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z5 = true;
                break;
            }
            i5++;
        }
        a aVar = new a(this.f812, rVar, m1157);
        this.f1175 = aVar;
        aVar.m994(z5);
        this.f1175.m998();
        super.onSubMenuSelected(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        super.updateMenuView(z5);
        ((View) this.f819).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f813;
        boolean z6 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> actionItems = gVar.getActionItems();
            int size = actionItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.core.view.b mo894 = actionItems.get(i5).mo894();
                if (mo894 != null) {
                    mo894.m2751(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f813;
        ArrayList<androidx.appcompat.view.menu.i> nonActionItems = gVar2 != null ? gVar2.getNonActionItems() : null;
        if (this.f1183 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z6 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f1180 == null) {
                this.f1180 = new d(this.f811);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1180.getParent();
            if (viewGroup != this.f819) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1180);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f819;
                actionMenuView.addView(this.f1180, actionMenuView.m1041());
            }
        } else {
            d dVar = this.f1180;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f819;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1180);
                }
            }
        }
        ((ActionMenuView) this.f819).setOverflowReserved(this.f1183);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean m1158() {
        androidx.appcompat.view.menu.g gVar;
        if (!this.f1183 || m1166() || (gVar = this.f813) == null || this.f819 == null || this.f1177 != null || gVar.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0018c runnableC0018c = new RunnableC0018c(new e(this.f812, this.f813, this.f1180, true));
        this.f1177 = runnableC0018c;
        ((View) this.f819).post(runnableC0018c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    /* renamed from: ʼ */
    public void mo899(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.initialize(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f819);
        if (this.f1176 == null) {
            this.f1176 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1176);
    }

    @Override // androidx.appcompat.view.menu.b
    /* renamed from: ʾ */
    public boolean mo901(ViewGroup viewGroup, int i5) {
        if (viewGroup.getChildAt(i5) == this.f1180) {
            return false;
        }
        return super.mo901(viewGroup, i5);
    }

    @Override // androidx.appcompat.view.menu.b
    /* renamed from: ˆ */
    public View mo903(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.m953()) {
            actionView = super.mo903(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    /* renamed from: ˈ */
    public androidx.appcompat.view.menu.n mo904(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f819;
        androidx.appcompat.view.menu.n mo904 = super.mo904(viewGroup);
        if (nVar != mo904) {
            ((ActionMenuView) mo904).setPresenter(this);
        }
        return mo904;
    }

    @Override // androidx.appcompat.view.menu.b
    /* renamed from: ˊ */
    public boolean mo906(int i5, androidx.appcompat.view.menu.i iVar) {
        return iVar.m955();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m1159() {
        return m1163() | m1164();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m1160(Drawable drawable) {
        d dVar = this.f1180;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f1182 = true;
            this.f1181 = drawable;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m1161(boolean z5) {
        this.f1183 = z5;
        this.f1185 = true;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public Drawable m1162() {
        d dVar = this.f1180;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1182) {
            return this.f1181;
        }
        return null;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean m1163() {
        Object obj;
        RunnableC0018c runnableC0018c = this.f1177;
        if (runnableC0018c != null && (obj = this.f819) != null) {
            ((View) obj).removeCallbacks(runnableC0018c);
            this.f1177 = null;
            return true;
        }
        e eVar = this.f1186;
        if (eVar == null) {
            return false;
        }
        eVar.m989();
        return true;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public boolean m1164() {
        a aVar = this.f1175;
        if (aVar == null) {
            return false;
        }
        aVar.m989();
        return true;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public boolean m1165() {
        return this.f1177 != null || m1166();
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public boolean m1166() {
        e eVar = this.f1186;
        return eVar != null && eVar.m991();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m1167(Configuration configuration) {
        if (!this.f1190) {
            this.f1189 = androidx.appcompat.view.a.m827(this.f812).m830();
        }
        androidx.appcompat.view.menu.g gVar = this.f813;
        if (gVar != null) {
            gVar.onItemsChanged(true);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m1168(boolean z5) {
        this.f1193 = z5;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m1169(ActionMenuView actionMenuView) {
        this.f819 = actionMenuView;
        actionMenuView.initialize(this.f813);
    }
}
