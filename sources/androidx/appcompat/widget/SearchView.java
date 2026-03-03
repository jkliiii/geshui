package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static final o f1059;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    y.a f1060;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private CharSequence f1061;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private boolean f1062;

    /* renamed from: ʾ, reason: contains not printable characters */
    final SearchAutoComplete f1063;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean f1064;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final View f1065;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private boolean f1066;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final View f1067;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean f1068;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final View f1069;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private CharSequence f1070;

    /* renamed from: ˉ, reason: contains not printable characters */
    final ImageView f1071;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private CharSequence f1072;

    /* renamed from: ˊ, reason: contains not printable characters */
    final ImageView f1073;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private int f1074;

    /* renamed from: ˋ, reason: contains not printable characters */
    final ImageView f1075;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private boolean f1076;

    /* renamed from: ˎ, reason: contains not printable characters */
    final ImageView f1077;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private Bundle f1078;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final View f1079;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    SearchableInfo f1080;

    /* renamed from: ˑ, reason: contains not printable characters */
    private q f1081;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private final Runnable f1082;

    /* renamed from: י, reason: contains not printable characters */
    private Rect f1083;

    /* renamed from: יי, reason: contains not printable characters */
    private final WeakHashMap<String, Drawable.ConstantState> f1084;

    /* renamed from: ـ, reason: contains not printable characters */
    private Rect f1085;

    /* renamed from: ــ, reason: contains not printable characters */
    private int f1086;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int[] f1087;

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private final AdapterView.OnItemSelectedListener f1088;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int[] f1089;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private boolean f1090;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final ImageView f1091;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean f1092;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final Drawable f1093;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private final View.OnClickListener f1094;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final int f1095;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private Runnable f1096;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final int f1097;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    View.OnKeyListener f1098;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final Intent f1099;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private final TextView.OnEditorActionListener f1100;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private final Intent f1101;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private final AdapterView.OnItemClickListener f1102;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private final CharSequence f1103;

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private TextWatcher f1104;

    /* renamed from: ﾞ, reason: contains not printable characters */
    View.OnFocusChangeListener f1105;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private View.OnClickListener f1106;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f1107;

        /* renamed from: ʿ, reason: contains not printable characters */
        private SearchView f1108;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f1109;

        /* renamed from: ˈ, reason: contains not printable characters */
        final Runnable f1110;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m1107();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, e.a.f6914);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            if (i5 >= 960 && i6 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i5 < 600) {
                return (i5 < 640 || i6 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1107 <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1109) {
                removeCallbacks(this.f1110);
                post(this.f1110);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z5, int i5, Rect rect) {
            super.onFocusChanged(z5, i5, rect);
            this.f1108.m1104();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i5, KeyEvent keyEvent) {
            if (i5 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1108.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i5, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z5) {
            super.onWindowFocusChanged(z5);
            if (z5 && this.f1108.hasFocus() && getVisibility() == 0) {
                this.f1109 = true;
                if (SearchView.m1083(getContext())) {
                    m1105();
                }
            }
        }

        void setImeVisibility(boolean z5) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z5) {
                this.f1109 = false;
                removeCallbacks(this.f1110);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1109 = true;
                    return;
                }
                this.f1109 = false;
                removeCallbacks(this.f1110);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1108 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i5) {
            super.setThreshold(i5);
            this.f1107 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1105() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f1059.m1113(this);
                return;
            }
            k.m1109(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m1106() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m1107() {
            if (this.f1109) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1109 = false;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i5) {
            super(context, attributeSet, i5);
            this.f1110 = new a();
            this.f1107 = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m1091();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.a aVar = SearchView.this.f1060;
            if (aVar instanceof w2) {
                aVar.mo1589(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1105;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z5);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            SearchView.this.m1089();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1071) {
                searchView.m1100();
                return;
            }
            if (view == searchView.f1075) {
                searchView.m1096();
                return;
            }
            if (view == searchView.f1073) {
                searchView.m1101();
            } else if (view == searchView.f1077) {
                searchView.m1095();
            } else if (view == searchView.f1063) {
                searchView.m1092();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i5, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1080 == null) {
                return false;
            }
            if (searchView.f1063.isPopupShowing() && SearchView.this.f1063.getListSelection() != -1) {
                return SearchView.this.m1102(view, i5, keyEvent);
            }
            if (SearchView.this.f1063.m1106() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i5 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m1094(0, null, searchView2.f1063.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
            SearchView.this.m1101();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            SearchView.this.m1097(i5, 0, null);
        }
    }

    static class k {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1108(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1109(SearchAutoComplete searchAutoComplete, int i5) {
            searchAutoComplete.setInputMethodMode(i5);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    private static class o {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Method f1122;

        /* renamed from: ʼ, reason: contains not printable characters */
        private Method f1123;

        /* renamed from: ʽ, reason: contains not printable characters */
        private Method f1124;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f1122 = null;
            this.f1123 = null;
            this.f1124 = null;
            m1110();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1122 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1123 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1124 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private static void m1110() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1111(AutoCompleteTextView autoCompleteTextView) {
            m1110();
            Method method = this.f1123;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1112(AutoCompleteTextView autoCompleteTextView) {
            m1110();
            Method method = this.f1122;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m1113(AutoCompleteTextView autoCompleteTextView) {
            m1110();
            Method method = this.f1124;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends androidx.customview.view.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f1125;

        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public p[] newArray(int i5) {
                return new p[i5];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1125 + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeValue(Boolean.valueOf(this.f1125));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1125 = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final View f1126;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Rect f1127;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Rect f1128;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Rect f1129;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f1130;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f1131;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1130 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1127 = new Rect();
            this.f1129 = new Rect();
            this.f1128 = new Rect();
            m1117(rect, rect2);
            this.f1126 = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z5;
            boolean z6;
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z7 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z6 = this.f1131;
                    if (z6 && !this.f1129.contains(x5, y5)) {
                        z7 = z6;
                        z5 = false;
                    }
                } else {
                    if (action == 3) {
                        z6 = this.f1131;
                        this.f1131 = false;
                    }
                    z5 = true;
                    z7 = false;
                }
                z7 = z6;
                z5 = true;
            } else {
                if (this.f1127.contains(x5, y5)) {
                    this.f1131 = true;
                    z5 = true;
                }
                z5 = true;
                z7 = false;
            }
            if (!z7) {
                return false;
            }
            if (!z5 || this.f1128.contains(x5, y5)) {
                Rect rect = this.f1128;
                motionEvent.setLocation(x5 - rect.left, y5 - rect.top);
            } else {
                motionEvent.setLocation(this.f1126.getWidth() / 2, this.f1126.getHeight() / 2);
            }
            return this.f1126.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1117(Rect rect, Rect rect2) {
            this.f1127.set(rect);
            this.f1129.set(rect);
            Rect rect3 = this.f1129;
            int i5 = this.f1130;
            rect3.inset(-i5, -i5);
            this.f1128.set(rect2);
        }
    }

    static {
        f1059 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(e.d.f6943);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(e.d.f6944);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1063.setText(charSequence);
        this.f1063.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m1068(int i5) {
        Editable text = this.f1063.getText();
        Cursor mo12833 = this.f1060.mo12833();
        if (mo12833 == null) {
            return;
        }
        if (!mo12833.moveToPosition(i5)) {
            setQuery(text);
            return;
        }
        CharSequence convertToString = this.f1060.convertToString(mo12833);
        if (convertToString != null) {
            setQuery(convertToString);
        } else {
            setQuery(text);
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private void m1069() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f1063.getText());
        if (!z6 && (!this.f1090 || this.f1076)) {
            z5 = false;
        }
        this.f1075.setVisibility(z5 ? 0 : 8);
        Drawable drawable = this.f1075.getDrawable();
        if (drawable != null) {
            drawable.setState(z6 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Intent m1070(String str, Uri uri, String str2, String str3, int i5, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1070);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1078;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i5 != 0) {
            intent.putExtra("action_key", i5);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1080.getSearchActivity());
        return intent;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Intent m1071(Cursor cursor, int i5, String str) {
        int i6;
        String m1578;
        try {
            String m15782 = w2.m1578(cursor, "suggest_intent_action");
            if (m15782 == null) {
                m15782 = this.f1080.getSuggestIntentAction();
            }
            if (m15782 == null) {
                m15782 = "android.intent.action.SEARCH";
            }
            String str2 = m15782;
            String m15783 = w2.m1578(cursor, "suggest_intent_data");
            if (m15783 == null) {
                m15783 = this.f1080.getSuggestIntentData();
            }
            if (m15783 != null && (m1578 = w2.m1578(cursor, "suggest_intent_data_id")) != null) {
                m15783 = m15783 + "/" + Uri.encode(m1578);
            }
            return m1070(str2, m15783 == null ? null : Uri.parse(m15783), w2.m1578(cursor, "suggest_intent_extra_data"), w2.m1578(cursor, "suggest_intent_query"), i5, str);
        } catch (RuntimeException e5) {
            try {
                i6 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i6 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i6 + " returned exception.", e5);
            return null;
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m1072() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1063;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(m1080(queryHint));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private Intent m1073(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1078;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private Intent m1074(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m1075() {
        this.f1069.setVisibility((m1084() && (this.f1073.getVisibility() == 0 || this.f1077.getVisibility() == 0)) ? 0 : 8);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m1076() {
        this.f1063.dismissDropDown();
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private void m1077(boolean z5) {
        this.f1092 = z5;
        int i5 = z5 ? 0 : 8;
        boolean z6 = !TextUtils.isEmpty(this.f1063.getText());
        this.f1071.setVisibility(i5);
        m1078(z6);
        this.f1065.setVisibility(z5 ? 8 : 0);
        this.f1091.setVisibility((this.f1091.getDrawable() == null || this.f1090) ? 8 : 0);
        m1069();
        m1081(!z6);
        m1075();
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m1078(boolean z5) {
        this.f1073.setVisibility((this.f1062 && m1084() && hasFocus() && (z5 || !this.f1068)) ? 0 : 8);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m1079(View view, Rect rect) {
        view.getLocationInWindow(this.f1087);
        getLocationInWindow(this.f1089);
        int[] iArr = this.f1087;
        int i5 = iArr[1];
        int[] iArr2 = this.f1089;
        int i6 = i5 - iArr2[1];
        int i7 = iArr[0] - iArr2[0];
        rect.set(i7, i6, view.getWidth() + i7, view.getHeight() + i6);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private CharSequence m1080(CharSequence charSequence) {
        if (!this.f1090 || this.f1093 == null) {
            return charSequence;
        }
        double textSize = this.f1063.getTextSize();
        Double.isNaN(textSize);
        int i5 = (int) (textSize * 1.25d);
        this.f1093.setBounds(0, 0, i5, i5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1093), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m1081(boolean z5) {
        int i5 = 8;
        if (this.f1068 && !m1093() && z5) {
            this.f1073.setVisibility(8);
            i5 = 0;
        }
        this.f1077.setVisibility(i5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean m1082() {
        SearchableInfo searchableInfo = this.f1080;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f1080.getVoiceSearchLaunchWebSearch() ? this.f1099 : this.f1080.getVoiceSearchLaunchRecognizer() ? this.f1101 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static boolean m1083(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: י, reason: contains not printable characters */
    private boolean m1084() {
        return (this.f1062 || this.f1068) && !m1093();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m1085(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e5) {
            Log.e("SearchView", "Failed launch activity: " + intent, e5);
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m1086() {
        this.f1063.setThreshold(this.f1080.getSuggestThreshold());
        this.f1063.setImeOptions(this.f1080.getImeOptions());
        int inputType = this.f1080.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1080.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1063.setInputType(inputType);
        y.a aVar = this.f1060;
        if (aVar != null) {
            aVar.mo1589(null);
        }
        if (this.f1080.getSuggestAuthority() != null) {
            w2 w2Var = new w2(getContext(), this, this.f1080, this.f1084);
            this.f1060 = w2Var;
            this.f1063.setAdapter(w2Var);
            ((w2) this.f1060).m1595(this.f1066 ? 2 : 1);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean m1087(int i5, int i6, String str) {
        Cursor mo12833 = this.f1060.mo12833();
        if (mo12833 == null || !mo12833.moveToPosition(i5)) {
            return false;
        }
        m1085(m1071(mo12833, i6, str));
        return true;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m1088() {
        post(this.f1082);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1064 = true;
        super.clearFocus();
        this.f1063.clearFocus();
        this.f1063.setImeVisibility(false);
        this.f1064 = false;
    }

    public int getImeOptions() {
        return this.f1063.getImeOptions();
    }

    public int getInputType() {
        return this.f1063.getInputType();
    }

    public int getMaxWidth() {
        return this.f1086;
    }

    public CharSequence getQuery() {
        return this.f1063.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1061;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1080;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1103 : getContext().getText(this.f1080.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f1097;
    }

    int getSuggestionRowLayout() {
        return this.f1095;
    }

    public y.a getSuggestionsAdapter() {
        return this.f1060;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        m1090(BuildConfig.FLAVOR, false);
        clearFocus();
        m1077(true);
        this.f1063.setImeOptions(this.f1074);
        this.f1076 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f1076) {
            return;
        }
        this.f1076 = true;
        int imeOptions = this.f1063.getImeOptions();
        this.f1074 = imeOptions;
        this.f1063.setImeOptions(imeOptions | 33554432);
        this.f1063.setText(BuildConfig.FLAVOR);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1082);
        post(this.f1096);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        if (z5) {
            m1079(this.f1063, this.f1083);
            Rect rect = this.f1085;
            Rect rect2 = this.f1083;
            rect.set(rect2.left, 0, rect2.right, i8 - i6);
            q qVar = this.f1081;
            if (qVar != null) {
                qVar.m1117(this.f1085, this.f1083);
                return;
            }
            q qVar2 = new q(this.f1085, this.f1083, this.f1063);
            this.f1081 = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        if (m1093()) {
            super.onMeasure(i5, i6);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            int i8 = this.f1086;
            size = i8 > 0 ? Math.min(i8, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1086;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i7 = this.f1086) > 0) {
            size = Math.min(i7, size);
        }
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        m1077(pVar.f1125);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1125 = m1093();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        m1088();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i5, Rect rect) {
        if (this.f1064 || !isFocusable()) {
            return false;
        }
        if (m1093()) {
            return super.requestFocus(i5, rect);
        }
        boolean requestFocus = this.f1063.requestFocus(i5, rect);
        if (requestFocus) {
            m1077(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1078 = bundle;
    }

    public void setIconified(boolean z5) {
        if (z5) {
            m1096();
        } else {
            m1100();
        }
    }

    public void setIconifiedByDefault(boolean z5) {
        if (this.f1090 == z5) {
            return;
        }
        this.f1090 = z5;
        m1077(z5);
        m1072();
    }

    public void setImeOptions(int i5) {
        this.f1063.setImeOptions(i5);
    }

    public void setInputType(int i5) {
        this.f1063.setInputType(i5);
    }

    public void setMaxWidth(int i5) {
        this.f1086 = i5;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1105 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1106 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1061 = charSequence;
        m1072();
    }

    public void setQueryRefinementEnabled(boolean z5) {
        this.f1066 = z5;
        y.a aVar = this.f1060;
        if (aVar instanceof w2) {
            ((w2) aVar).m1595(z5 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1080 = searchableInfo;
        if (searchableInfo != null) {
            m1086();
            m1072();
        }
        boolean m1082 = m1082();
        this.f1068 = m1082;
        if (m1082) {
            this.f1063.setPrivateImeOptions("nm");
        }
        m1077(m1093());
    }

    public void setSubmitButtonEnabled(boolean z5) {
        this.f1062 = z5;
        m1077(m1093());
    }

    public void setSuggestionsAdapter(y.a aVar) {
        this.f1060 = aVar;
        this.f1063.setAdapter(aVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1089() {
        if (this.f1079.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1067.getPaddingLeft();
            Rect rect = new Rect();
            boolean m1477 = p3.m1477(this);
            int dimensionPixelSize = this.f1090 ? resources.getDimensionPixelSize(e.d.f6941) + resources.getDimensionPixelSize(e.d.f6942) : 0;
            this.f1063.getDropDownBackground().getPadding(rect);
            this.f1063.setDropDownHorizontalOffset(m1477 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1063.setDropDownWidth((((this.f1079.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m1090(CharSequence charSequence, boolean z5) {
        this.f1063.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1063;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1070 = charSequence;
        }
        if (!z5 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m1101();
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    void m1091() {
        int[] iArr = this.f1063.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1067.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1069.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1092() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.m1108(this.f1063);
            return;
        }
        o oVar = f1059;
        oVar.m1112(this.f1063);
        oVar.m1111(this.f1063);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m1093() {
        return this.f1092;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m1094(int i5, String str, String str2) {
        getContext().startActivity(m1070("android.intent.action.SEARCH", null, null, str2, i5, str));
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m1095() {
        SearchableInfo searchableInfo = this.f1080;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m1074(this.f1099, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m1073(this.f1101, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m1096() {
        if (!TextUtils.isEmpty(this.f1063.getText())) {
            this.f1063.setText(BuildConfig.FLAVOR);
            this.f1063.requestFocus();
            this.f1063.setImeVisibility(true);
        } else if (this.f1090) {
            clearFocus();
            m1077(true);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    boolean m1097(int i5, int i6, String str) {
        m1087(i5, 0, null);
        this.f1063.setImeVisibility(false);
        m1076();
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    boolean m1098(int i5) {
        m1068(i5);
        return true;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    protected void m1099(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m1100() {
        m1077(false);
        this.f1063.requestFocus();
        this.f1063.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1106;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m1101() {
        Editable text = this.f1063.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1080 != null) {
            m1094(0, null, text.toString());
        }
        this.f1063.setImeVisibility(false);
        m1076();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    boolean m1102(View view, int i5, KeyEvent keyEvent) {
        if (this.f1080 != null && this.f1060 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i5 == 66 || i5 == 84 || i5 == 61) {
                return m1097(this.f1063.getListSelection(), 0, null);
            }
            if (i5 == 21 || i5 == 22) {
                this.f1063.setSelection(i5 == 21 ? 0 : this.f1063.length());
                this.f1063.setListSelection(0);
                this.f1063.clearListSelection();
                this.f1063.m1105();
                return true;
            }
            if (i5 == 19) {
                this.f1063.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m1103(CharSequence charSequence) {
        Editable text = this.f1063.getText();
        this.f1070 = text;
        boolean z5 = !TextUtils.isEmpty(text);
        m1078(z5);
        m1081(!z5);
        m1069();
        m1075();
        this.f1072 = charSequence.toString();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    void m1104() {
        m1077(m1093());
        m1088();
        if (this.f1063.hasFocus()) {
            m1092();
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6903);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1083 = new Rect();
        this.f1085 = new Rect();
        this.f1087 = new int[2];
        this.f1089 = new int[2];
        this.f1082 = new b();
        this.f1096 = new c();
        this.f1084 = new WeakHashMap<>();
        f fVar = new f();
        this.f1094 = fVar;
        this.f1098 = new g();
        h hVar = new h();
        this.f1100 = hVar;
        i iVar = new i();
        this.f1102 = iVar;
        j jVar = new j();
        this.f1088 = jVar;
        this.f1104 = new a();
        int[] iArr = e.j.f7208;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        androidx.core.view.f1.m2828(this, context, iArr, attributeSet, m1181.m1199(), i5, 0);
        LayoutInflater.from(context).inflate(m1181.m1195(e.j.f7220, e.g.f7056), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(e.f.f7002);
        this.f1063 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1065 = findViewById(e.f.f7038);
        View findViewById = findViewById(e.f.f6998);
        this.f1067 = findViewById;
        View findViewById2 = findViewById(e.f.f7012);
        this.f1069 = findViewById2;
        ImageView imageView = (ImageView) findViewById(e.f.f7036);
        this.f1071 = imageView;
        ImageView imageView2 = (ImageView) findViewById(e.f.f7028);
        this.f1073 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(e.f.f7037);
        this.f1075 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(e.f.f7000);
        this.f1077 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(e.f.f7030);
        this.f1091 = imageView5;
        androidx.core.view.f1.m2836(findViewById, m1181.m1188(e.j.f7221));
        androidx.core.view.f1.m2836(findViewById2, m1181.m1188(e.j.f7225));
        int i6 = e.j.f7224;
        imageView.setImageDrawable(m1181.m1188(i6));
        imageView2.setImageDrawable(m1181.m1188(e.j.f7218));
        imageView3.setImageDrawable(m1181.m1188(e.j.f7214));
        imageView4.setImageDrawable(m1181.m1188(e.j.f7227));
        imageView5.setImageDrawable(m1181.m1188(i6));
        this.f1093 = m1181.m1188(e.j.f7223);
        j3.m1399(imageView, getResources().getString(e.h.f7072));
        this.f1095 = m1181.m1195(e.j.f7226, e.g.f7055);
        this.f1097 = m1181.m1195(e.j.f7216, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1104);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1098);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(m1181.m1182(e.j.f7219, true));
        int m1187 = m1181.m1187(e.j.f7211, -1);
        if (m1187 != -1) {
            setMaxWidth(m1187);
        }
        this.f1103 = m1181.m1197(e.j.f7217);
        this.f1061 = m1181.m1197(e.j.f7222);
        int m1192 = m1181.m1192(e.j.f7213, -1);
        if (m1192 != -1) {
            setImeOptions(m1192);
        }
        int m11922 = m1181.m1192(e.j.f7212, -1);
        if (m11922 != -1) {
            setInputType(m11922);
        }
        setFocusable(m1181.m1182(e.j.f7210, true));
        m1181.m1201();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1099 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1101 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1079 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        m1077(this.f1090);
        m1072();
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            SearchView.this.m1103(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
            SearchView.this.m1098(i5);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
