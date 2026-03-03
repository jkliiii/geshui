package y;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c extends a {

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f12428;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f12429;

    /* renamed from: י, reason: contains not printable characters */
    private LayoutInflater f12430;

    @Deprecated
    public c(Context context, int i5, Cursor cursor, boolean z5) {
        super(context, cursor, z5);
        this.f12429 = i5;
        this.f12428 = i5;
        this.f12430 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // y.a
    /* renamed from: ˆ */
    public View mo12835(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12430.inflate(this.f12429, viewGroup, false);
    }

    @Override // y.a
    /* renamed from: ˈ */
    public View mo1592(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f12430.inflate(this.f12428, viewGroup, false);
    }
}
