package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class w2 extends y.c implements View.OnClickListener {

    /* renamed from: ـ, reason: contains not printable characters */
    private final SearchView f1488;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final SearchableInfo f1489;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final Context f1490;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int f1491;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f1492;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private int f1493;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final int f1494;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f1495;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f1496;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private ColorStateList f1497;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f1498;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f1499;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int f1500;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f1501;

    /* compiled from: SuggestionsAdapter.java */
    private static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final TextView f1502;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final TextView f1503;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final ImageView f1504;

        /* renamed from: ʾ, reason: contains not printable characters */
        public final ImageView f1505;

        /* renamed from: ʿ, reason: contains not printable characters */
        public final ImageView f1506;

        public a(View view) {
            this.f1502 = (TextView) view.findViewById(R.id.text1);
            this.f1503 = (TextView) view.findViewById(R.id.text2);
            this.f1504 = (ImageView) view.findViewById(R.id.icon1);
            this.f1505 = (ImageView) view.findViewById(R.id.icon2);
            this.f1506 = (ImageView) view.findViewById(e.f.f7027);
        }
    }

    public w2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1495 = false;
        this.f1496 = 1;
        this.f1498 = -1;
        this.f1499 = -1;
        this.f1500 = -1;
        this.f1501 = -1;
        this.f1491 = -1;
        this.f1493 = -1;
        this.f1488 = searchView;
        this.f1489 = searchableInfo;
        this.f1494 = searchView.getSuggestionCommitIconResId();
        this.f1490 = context;
        this.f1492 = weakHashMap;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private Drawable m1574(String str) {
        Drawable.ConstantState constantState = this.f1492.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private CharSequence m1575(CharSequence charSequence) {
        if (this.f1497 == null) {
            TypedValue typedValue = new TypedValue();
            this.f1490.getTheme().resolveAttribute(e.a.f6909, typedValue, true);
            this.f1497 = this.f1490.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1497, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private Drawable m1576(ComponentName componentName) {
        PackageManager packageManager = this.f1490.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("SuggestionsAdapter", e5.toString());
            return null;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private Drawable m1577(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f1492.containsKey(flattenToShortString)) {
            Drawable m1576 = m1576(componentName);
            this.f1492.put(flattenToShortString, m1576 != null ? m1576.getConstantState() : null);
            return m1576;
        }
        Drawable.ConstantState constantState = this.f1492.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1490.getResources());
    }

    /* renamed from: י, reason: contains not printable characters */
    public static String m1578(Cursor cursor, String str) {
        return m1585(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private Drawable m1579() {
        Drawable m1577 = m1577(this.f1489.getSearchActivity());
        return m1577 != null ? m1577 : this.f1490.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private Drawable m1580(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m1593(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f1490.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e5) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e5);
                }
            }
        } catch (FileNotFoundException e6) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e6.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e6.getMessage());
        return null;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m1581(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Drawable m1582(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1490.getPackageName() + "/" + parseInt;
            Drawable m1574 = m1574(str2);
            if (m1574 != null) {
                return m1574;
            }
            Drawable m1993 = androidx.core.content.a.m1993(this.f1490, parseInt);
            m1588(str2, m1993);
            return m1993;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable m15742 = m1574(str);
            if (m15742 != null) {
                return m15742;
            }
            Drawable m1580 = m1580(Uri.parse(str));
            m1588(str, m1580);
            return m1580;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private Drawable m1583(Cursor cursor) {
        int i5 = this.f1501;
        if (i5 == -1) {
            return null;
        }
        Drawable m1582 = m1582(cursor.getString(i5));
        return m1582 != null ? m1582 : m1579();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Drawable m1584(Cursor cursor) {
        int i5 = this.f1491;
        if (i5 == -1) {
            return null;
        }
        return m1582(cursor.getString(i5));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static String m1585(Cursor cursor, int i5) {
        if (i5 == -1) {
            return null;
        }
        try {
            return cursor.getString(i5);
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e5);
            return null;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m1586(ImageView imageView, Drawable drawable, int i5) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i5);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m1587(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m1588(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1492.put(str, drawable.getConstantState());
        }
    }

    @Override // y.a, y.b.a
    public CharSequence convertToString(Cursor cursor) {
        String m1578;
        String m15782;
        if (cursor == null) {
            return null;
        }
        String m15783 = m1578(cursor, "suggest_intent_query");
        if (m15783 != null) {
            return m15783;
        }
        if (this.f1489.shouldRewriteQueryFromData() && (m15782 = m1578(cursor, "suggest_intent_data")) != null) {
            return m15782;
        }
        if (!this.f1489.shouldRewriteQueryFromText() || (m1578 = m1578(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return m1578;
    }

    @Override // y.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i5, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View mo12835 = mo12835(this.f1490, mo12833(), viewGroup);
            if (mo12835 != null) {
                ((a) mo12835.getTag()).f1502.setText(e5.toString());
            }
            return mo12835;
        }
    }

    @Override // y.a, android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i5, view, viewGroup);
        } catch (RuntimeException e5) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e5);
            View mo1592 = mo1592(this.f1490, mo12833(), viewGroup);
            if (mo1592 != null) {
                ((a) mo1592.getTag()).f1502.setText(e5.toString());
            }
            return mo1592;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1581(mo12833());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1581(mo12833());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1488.m1099((CharSequence) tag);
        }
    }

    @Override // y.a, y.b.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo1589(Cursor cursor) {
        if (this.f1495) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1589(cursor);
            if (cursor != null) {
                this.f1498 = cursor.getColumnIndex("suggest_text_1");
                this.f1499 = cursor.getColumnIndex("suggest_text_2");
                this.f1500 = cursor.getColumnIndex("suggest_text_2_url");
                this.f1501 = cursor.getColumnIndex("suggest_icon_1");
                this.f1491 = cursor.getColumnIndex("suggest_icon_2");
                this.f1493 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e5) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e5);
        }
    }

    @Override // y.b.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public Cursor mo1590(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? BuildConfig.FLAVOR : charSequence.toString();
        if (this.f1488.getVisibility() == 0 && this.f1488.getWindowVisibility() == 0) {
            try {
                Cursor m1594 = m1594(this.f1489, charSequence2, 50);
                if (m1594 != null) {
                    m1594.getCount();
                    return m1594;
                }
            } catch (RuntimeException e5) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e5);
            }
        }
        return null;
    }

    @Override // y.a
    /* renamed from: ʾ, reason: contains not printable characters */
    public void mo1591(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i5 = this.f1493;
        int i6 = i5 != -1 ? cursor.getInt(i5) : 0;
        if (aVar.f1502 != null) {
            m1587(aVar.f1502, m1585(cursor, this.f1498));
        }
        if (aVar.f1503 != null) {
            String m1585 = m1585(cursor, this.f1500);
            CharSequence m1575 = m1585 != null ? m1575(m1585) : m1585(cursor, this.f1499);
            if (TextUtils.isEmpty(m1575)) {
                TextView textView = aVar.f1502;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1502.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1502;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1502.setMaxLines(1);
                }
            }
            m1587(aVar.f1503, m1575);
        }
        ImageView imageView = aVar.f1504;
        if (imageView != null) {
            m1586(imageView, m1583(cursor), 4);
        }
        ImageView imageView2 = aVar.f1505;
        if (imageView2 != null) {
            m1586(imageView2, m1584(cursor), 8);
        }
        int i7 = this.f1496;
        if (i7 != 2 && (i7 != 1 || (i6 & 1) == 0)) {
            aVar.f1506.setVisibility(8);
            return;
        }
        aVar.f1506.setVisibility(0);
        aVar.f1506.setTag(aVar.f1502.getText());
        aVar.f1506.setOnClickListener(this);
    }

    @Override // y.c, y.a
    /* renamed from: ˈ, reason: contains not printable characters */
    public View mo1592(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo1592 = super.mo1592(context, cursor, viewGroup);
        mo1592.setTag(new a(mo1592));
        ((ImageView) mo1592.findViewById(e.f.f7027)).setImageResource(this.f1494);
        return mo1592;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    Drawable m1593(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1490.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    Cursor m1594(SearchableInfo searchableInfo, String str, int i5) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query(BuildConfig.FLAVOR).fragment(BuildConfig.FLAVOR);
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i5 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i5));
        }
        return this.f1490.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m1595(int i5) {
        this.f1496 = i5;
    }
}
