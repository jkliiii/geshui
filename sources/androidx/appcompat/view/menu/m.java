package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* compiled from: MenuPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface m {

    /* compiled from: MenuPresenter.java */
    public interface a {
        void onCloseMenu(g gVar, boolean z5);

        /* renamed from: ʻ */
        boolean mo527(g gVar);
    }

    boolean collapseItemActionView(g gVar, i iVar);

    boolean expandItemActionView(g gVar, i iVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, g gVar);

    void onCloseMenu(g gVar, boolean z5);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(r rVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z5);
}
