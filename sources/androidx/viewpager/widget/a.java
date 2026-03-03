package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PagerAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final DataSetObservable f4780 = new DataSetObservable();

    /* renamed from: ʼ, reason: contains not printable characters */
    private DataSetObserver f4781;

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract void mo5602(ViewGroup viewGroup, int i5, Object obj);

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m5604(ViewGroup viewGroup) {
        m5603(viewGroup);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public abstract int mo5605();

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m5606(Object obj) {
        return -1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public CharSequence m5607(int i5) {
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public float m5608(int i5) {
        return 1.0f;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public abstract Object mo5609(ViewGroup viewGroup, int i5);

    /* renamed from: ˊ, reason: contains not printable characters */
    public abstract boolean mo5610(View view, Object obj);

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m5611(DataSetObserver dataSetObserver) {
        this.f4780.registerObserver(dataSetObserver);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public Parcelable m5613() {
        return null;
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m5615(ViewGroup viewGroup, int i5, Object obj) {
        m5614(viewGroup, i5, obj);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m5616(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f4781 = dataSetObserver;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m5618(ViewGroup viewGroup) {
        m5617(viewGroup);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m5619(DataSetObserver dataSetObserver) {
        this.f4780.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    /* renamed from: ʼ, reason: contains not printable characters */
    public void m5603(View view) {
    }

    @Deprecated
    /* renamed from: ٴ, reason: contains not printable characters */
    public void m5617(View view) {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m5612(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: ˑ, reason: contains not printable characters */
    public void m5614(View view, int i5, Object obj) {
    }
}
