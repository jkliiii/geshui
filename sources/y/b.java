package y;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends Filter {

    /* renamed from: ʻ, reason: contains not printable characters */
    a f12427;

    /* compiled from: CursorFilter.java */
    interface a {
        CharSequence convertToString(Cursor cursor);

        /* renamed from: ʻ */
        void mo1589(Cursor cursor);

        /* renamed from: ʼ */
        Cursor mo12833();

        /* renamed from: ʽ */
        Cursor mo1590(CharSequence charSequence);
    }

    b(a aVar) {
        this.f12427 = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f12427.convertToString((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor mo1590 = this.f12427.mo1590(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (mo1590 != null) {
            filterResults.count = mo1590.getCount();
            filterResults.values = mo1590;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor mo12833 = this.f12427.mo12833();
        Object obj = filterResults.values;
        if (obj == null || obj == mo12833) {
            return;
        }
        this.f12427.mo1589((Cursor) obj);
    }
}
