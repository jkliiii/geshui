package y;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import y.b;

/* compiled from: CursorAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected boolean f12417;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected boolean f12418;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected Cursor f12419;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected Context f12420;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected int f12421;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected C0178a f12422;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected DataSetObserver f12423;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected y.b f12424;

    /* compiled from: CursorAdapter.java */
    /* renamed from: y.a$a, reason: collision with other inner class name */
    private class C0178a extends ContentObserver {
        C0178a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z5) {
            a.this.m12836();
        }
    }

    /* compiled from: CursorAdapter.java */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f12417 = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f12417 = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z5) {
        m12834(context, cursor, z5 ? 1 : 2);
    }

    public abstract CharSequence convertToString(Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f12417 || (cursor = this.f12419) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f12417) {
            return null;
        }
        this.f12419.moveToPosition(i5);
        if (view == null) {
            view = mo12835(this.f12420, this.f12419, viewGroup);
        }
        mo1591(view, this.f12420, this.f12419);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f12424 == null) {
            this.f12424 = new y.b(this);
        }
        return this.f12424;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i5) {
        Cursor cursor;
        if (!this.f12417 || (cursor = this.f12419) == null) {
            return null;
        }
        cursor.moveToPosition(i5);
        return this.f12419;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        Cursor cursor;
        if (this.f12417 && (cursor = this.f12419) != null && cursor.moveToPosition(i5)) {
            return this.f12419.getLong(this.f12421);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f12417) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f12419.moveToPosition(i5)) {
            if (view == null) {
                view = mo1592(this.f12420, this.f12419, viewGroup);
            }
            mo1591(view, this.f12420, this.f12419);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i5);
    }

    /* renamed from: ʻ */
    public void mo1589(Cursor cursor) {
        Cursor m12837 = m12837(cursor);
        if (m12837 != null) {
            m12837.close();
        }
    }

    @Override // y.b.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public Cursor mo12833() {
        return this.f12419;
    }

    /* renamed from: ʾ */
    public abstract void mo1591(View view, Context context, Cursor cursor);

    /* renamed from: ʿ, reason: contains not printable characters */
    void m12834(Context context, Cursor cursor, int i5) {
        if ((i5 & 1) == 1) {
            i5 |= 2;
            this.f12418 = true;
        } else {
            this.f12418 = false;
        }
        boolean z5 = cursor != null;
        this.f12419 = cursor;
        this.f12417 = z5;
        this.f12420 = context;
        this.f12421 = z5 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i5 & 2) == 2) {
            this.f12422 = new C0178a();
            this.f12423 = new b();
        } else {
            this.f12422 = null;
            this.f12423 = null;
        }
        if (z5) {
            C0178a c0178a = this.f12422;
            if (c0178a != null) {
                cursor.registerContentObserver(c0178a);
            }
            DataSetObserver dataSetObserver = this.f12423;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public abstract View mo12835(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: ˈ */
    public abstract View mo1592(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: ˉ, reason: contains not printable characters */
    protected void m12836() {
        Cursor cursor;
        if (!this.f12418 || (cursor = this.f12419) == null || cursor.isClosed()) {
            return;
        }
        this.f12417 = this.f12419.requery();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public Cursor m12837(Cursor cursor) {
        Cursor cursor2 = this.f12419;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0178a c0178a = this.f12422;
            if (c0178a != null) {
                cursor2.unregisterContentObserver(c0178a);
            }
            DataSetObserver dataSetObserver = this.f12423;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12419 = cursor;
        if (cursor != null) {
            C0178a c0178a2 = this.f12422;
            if (c0178a2 != null) {
                cursor.registerContentObserver(c0178a2);
            }
            DataSetObserver dataSetObserver2 = this.f12423;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f12421 = cursor.getColumnIndexOrThrow("_id");
            this.f12417 = true;
            notifyDataSetChanged();
        } else {
            this.f12421 = -1;
            this.f12417 = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
