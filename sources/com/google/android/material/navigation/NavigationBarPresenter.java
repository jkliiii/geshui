package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.r;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NavigationBarPresenter implements m {
    private int id;
    private g menu;
    private NavigationBarMenuView menuView;
    private boolean updateSuspended = false;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0083a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f5898;

        /* renamed from: ʿ, reason: contains not printable characters */
        ParcelableSparseArray f5899;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$a$a, reason: collision with other inner class name */
        class C0083a implements Parcelable.Creator<a> {
            C0083a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public a[] newArray(int i5) {
                return new a[i5];
            }
        }

        a() {
        }

        a(Parcel parcel) {
            this.f5898 = parcel.readInt();
            this.f5899 = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeInt(this.f5898);
            parcel.writeParcelable(this.f5899, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean collapseItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean expandItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.id;
    }

    public n getMenuView(ViewGroup viewGroup) {
        return this.menuView;
    }

    @Override // androidx.appcompat.view.menu.m
    public void initForMenu(Context context, g gVar) {
        this.menu = gVar;
        this.menuView.initialize(gVar);
    }

    @Override // androidx.appcompat.view.menu.m
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.menuView.tryRestoreSelectedItemId(aVar.f5898);
            this.menuView.restoreBadgeDrawables(BadgeUtils.createBadgeDrawablesFromSavedStates(this.menuView.getContext(), aVar.f5899));
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable onSaveInstanceState() {
        a aVar = new a();
        aVar.f5898 = this.menuView.getSelectedItemId();
        aVar.f5899 = BadgeUtils.createParcelableBadgeStates(this.menuView.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(r rVar) {
        return false;
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setMenuView(NavigationBarMenuView navigationBarMenuView) {
        this.menuView = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z5) {
        this.updateSuspended = z5;
    }

    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        if (this.updateSuspended) {
            return;
        }
        if (z5) {
            this.menuView.buildMenuView();
        } else {
            this.menuView.updateMenuView();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(g gVar, boolean z5) {
    }
}
