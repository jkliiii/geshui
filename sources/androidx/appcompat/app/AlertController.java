package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.f1;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: E:\78999\cookie_5123796.dex */
class AlertController {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f287;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private Drawable f288;

    /* renamed from: ʼ, reason: contains not printable characters */
    final t f289;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private TextView f290;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Window f291;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private ImageView f292;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f293;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private View f294;

    /* renamed from: ʿ, reason: contains not printable characters */
    private CharSequence f295;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private TextView f296;

    /* renamed from: ˆ, reason: contains not printable characters */
    private CharSequence f297;

    /* renamed from: ˈ, reason: contains not printable characters */
    ListView f299;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private int f300;

    /* renamed from: ˉ, reason: contains not printable characters */
    private View f301;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private int f302;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f303;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    int f304;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f305;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    int f306;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f307;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    int f308;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f309;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    int f310;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f311;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private boolean f312;

    /* renamed from: יי, reason: contains not printable characters */
    Handler f314;

    /* renamed from: ـ, reason: contains not printable characters */
    Button f315;

    /* renamed from: ــ, reason: contains not printable characters */
    ListAdapter f316;

    /* renamed from: ٴ, reason: contains not printable characters */
    private CharSequence f317;

    /* renamed from: ᐧ, reason: contains not printable characters */
    Message f318;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    NestedScrollView f319;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private Drawable f320;

    /* renamed from: ᵎ, reason: contains not printable characters */
    Button f322;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private CharSequence f324;

    /* renamed from: ᵢ, reason: contains not printable characters */
    Message f326;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Drawable f327;

    /* renamed from: ﹳ, reason: contains not printable characters */
    Button f328;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private CharSequence f329;

    /* renamed from: ﾞ, reason: contains not printable characters */
    Message f330;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private Drawable f331;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f313 = false;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private int f321 = 0;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    int f298 = -1;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private int f325 = 0;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private final View.OnClickListener f323 = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int f332;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f333;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f7205);
            this.f333 = obtainStyledAttributes.getDimensionPixelOffset(e.j.f7206, -1);
            this.f332 = obtainStyledAttributes.getDimensionPixelOffset(e.j.f7207, -1);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m471(boolean z5, boolean z6) {
            if (z6 && z5) {
                return;
            }
            setPadding(getPaddingLeft(), z5 ? getPaddingTop() : this.f332, getPaddingRight(), z6 ? getPaddingBottom() : this.f333);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f315 || (message3 = alertController.f318) == null) ? (view != alertController.f322 || (message2 = alertController.f326) == null) ? (view != alertController.f328 || (message = alertController.f330) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f314.obtainMessage(1, alertController2.f289).sendToTarget();
        }
    }

    class b implements NestedScrollView.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f335;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ View f336;

        b(View view, View view2) {
            this.f335 = view;
            this.f336 = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo472(NestedScrollView nestedScrollView, int i5, int i6, int i7, int i8) {
            AlertController.m447(nestedScrollView, this.f335, this.f336);
        }
    }

    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f338;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f339;

        c(View view, View view2) {
            this.f338 = view;
            this.f339 = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m447(AlertController.this.f319, this.f338, this.f339);
        }
    }

    class e implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f344;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f345;

        e(View view, View view2) {
            this.f344 = view;
            this.f345 = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m447(AlertController.this.f299, this.f344, this.f345);
        }
    }

    public static class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Context f347;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        public int f348;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final LayoutInflater f349;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        public int f352;

        /* renamed from: ʾ, reason: contains not printable characters */
        public Drawable f353;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public boolean f354;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        public boolean[] f356;

        /* renamed from: ˆ, reason: contains not printable characters */
        public CharSequence f357;

        /* renamed from: ˈ, reason: contains not printable characters */
        public View f359;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        public Cursor f360;

        /* renamed from: ˉ, reason: contains not printable characters */
        public CharSequence f361;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        public DialogInterface.OnMultiChoiceClickListener f362;

        /* renamed from: ˊ, reason: contains not printable characters */
        public CharSequence f363;

        /* renamed from: ˊˊ, reason: contains not printable characters */
        public String f364;

        /* renamed from: ˋ, reason: contains not printable characters */
        public Drawable f365;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public String f366;

        /* renamed from: ˎ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f367;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        public AdapterView.OnItemSelectedListener f368;

        /* renamed from: ˏ, reason: contains not printable characters */
        public CharSequence f369;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        public boolean f370;

        /* renamed from: ˑ, reason: contains not printable characters */
        public Drawable f371;

        /* renamed from: י, reason: contains not printable characters */
        public DialogInterface.OnClickListener f373;

        /* renamed from: ـ, reason: contains not printable characters */
        public CharSequence f374;

        /* renamed from: ــ, reason: contains not printable characters */
        public boolean f375;

        /* renamed from: ٴ, reason: contains not printable characters */
        public Drawable f376;

        /* renamed from: ᐧ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f377;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        public int f378;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        public int f380;

        /* renamed from: ᵎ, reason: contains not printable characters */
        public DialogInterface.OnCancelListener f381;

        /* renamed from: ᵔ, reason: contains not printable characters */
        public DialogInterface.OnDismissListener f382;

        /* renamed from: ᵢ, reason: contains not printable characters */
        public DialogInterface.OnKeyListener f383;

        /* renamed from: ⁱ, reason: contains not printable characters */
        public CharSequence[] f384;

        /* renamed from: ﹳ, reason: contains not printable characters */
        public ListAdapter f385;

        /* renamed from: ﹶ, reason: contains not printable characters */
        public DialogInterface.OnClickListener f386;

        /* renamed from: ﾞ, reason: contains not printable characters */
        public int f387;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        public View f388;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f351 = 0;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f355 = 0;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        public boolean f350 = false;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        public int f358 = -1;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        public boolean f372 = true;

        /* renamed from: ᴵ, reason: contains not printable characters */
        public boolean f379 = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ RecycleListView f389;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i5, int i6, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i5, i6, charSequenceArr);
                this.f389 = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i5, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i5, view, viewGroup);
                boolean[] zArr = f.this.f356;
                if (zArr != null && zArr[i5]) {
                    this.f389.setItemChecked(i5, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: ʾ, reason: contains not printable characters */
            private final int f391;

            /* renamed from: ʿ, reason: contains not printable characters */
            private final int f392;

            /* renamed from: ˆ, reason: contains not printable characters */
            final /* synthetic */ RecycleListView f393;

            /* renamed from: ˈ, reason: contains not printable characters */
            final /* synthetic */ AlertController f394;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z5, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z5);
                this.f393 = recycleListView;
                this.f394 = alertController;
                Cursor cursor2 = getCursor();
                this.f391 = cursor2.getColumnIndexOrThrow(f.this.f366);
                this.f392 = cursor2.getColumnIndexOrThrow(f.this.f364);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f391));
                this.f393.setItemChecked(cursor.getPosition(), cursor.getInt(this.f392) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f349.inflate(this.f394.f304, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ AlertController f396;

            c(AlertController alertController) {
                this.f396 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                f.this.f386.onClick(this.f396.f289, i5);
                if (f.this.f375) {
                    return;
                }
                this.f396.f289.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ RecycleListView f398;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ AlertController f399;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f398 = recycleListView;
                this.f399 = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                boolean[] zArr = f.this.f356;
                if (zArr != null) {
                    zArr[i5] = this.f398.isItemChecked(i5);
                }
                f.this.f362.onClick(this.f399.f289, i5, this.f398.isItemChecked(i5));
            }
        }

        public f(Context context) {
            this.f347 = context;
            this.f349 = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m473(AlertController alertController) {
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f349.inflate(alertController.f306, (ViewGroup) null);
            if (this.f354) {
                listAdapter = this.f360 == null ? new a(this.f347, alertController.f304, R.id.text1, this.f384, recycleListView) : new b(this.f347, this.f360, false, recycleListView, alertController);
            } else {
                int i5 = this.f375 ? alertController.f310 : alertController.f308;
                if (this.f360 != null) {
                    listAdapter = new SimpleCursorAdapter(this.f347, i5, this.f360, new String[]{this.f366}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f385;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f347, i5, R.id.text1, this.f384);
                    }
                }
            }
            alertController.f316 = listAdapter;
            alertController.f298 = this.f358;
            if (this.f386 != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f362 != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f368;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f375) {
                recycleListView.setChoiceMode(1);
            } else if (this.f354) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f299 = recycleListView;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m474(AlertController alertController) {
            View view = this.f359;
            if (view != null) {
                alertController.m463(view);
            } else {
                CharSequence charSequence = this.f357;
                if (charSequence != null) {
                    alertController.m467(charSequence);
                }
                Drawable drawable = this.f353;
                if (drawable != null) {
                    alertController.m465(drawable);
                }
                int i5 = this.f351;
                if (i5 != 0) {
                    alertController.m464(i5);
                }
                int i6 = this.f355;
                if (i6 != 0) {
                    alertController.m464(alertController.m457(i6));
                }
            }
            CharSequence charSequence2 = this.f361;
            if (charSequence2 != null) {
                alertController.m466(charSequence2);
            }
            CharSequence charSequence3 = this.f363;
            if (charSequence3 != null || this.f365 != null) {
                alertController.m462(-1, charSequence3, this.f367, null, this.f365);
            }
            CharSequence charSequence4 = this.f369;
            if (charSequence4 != null || this.f371 != null) {
                alertController.m462(-2, charSequence4, this.f373, null, this.f371);
            }
            CharSequence charSequence5 = this.f374;
            if (charSequence5 != null || this.f376 != null) {
                alertController.m462(-3, charSequence5, this.f377, null, this.f376);
            }
            if (this.f384 != null || this.f360 != null || this.f385 != null) {
                m473(alertController);
            }
            View view2 = this.f388;
            if (view2 != null) {
                if (this.f350) {
                    alertController.m470(view2, this.f378, this.f380, this.f348, this.f352);
                    return;
                } else {
                    alertController.m469(view2);
                    return;
                }
            }
            int i7 = this.f387;
            if (i7 != 0) {
                alertController.m468(i7);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: ʻ, reason: contains not printable characters */
        private WeakReference<DialogInterface> f401;

        public g(DialogInterface dialogInterface) {
            this.f401 = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == -3 || i5 == -2 || i5 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f401.get(), message.what);
            } else {
                if (i5 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i5, int i6, CharSequence[] charSequenceArr) {
            super(context, i5, i6, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, t tVar, Window window) {
        this.f287 = context;
        this.f289 = tVar;
        this.f291 = window;
        this.f314 = new g(tVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e.j.f7188, e.a.f6910, 0);
        this.f302 = obtainStyledAttributes.getResourceId(e.j.f7161, 0);
        this.f300 = obtainStyledAttributes.getResourceId(e.j.f7215, 0);
        this.f306 = obtainStyledAttributes.getResourceId(e.j.f7242, 0);
        this.f304 = obtainStyledAttributes.getResourceId(e.j.f7310, 0);
        this.f310 = obtainStyledAttributes.getResourceId(e.j.f7314, 0);
        this.f308 = obtainStyledAttributes.getResourceId(e.j.f7269, 0);
        this.f312 = obtainStyledAttributes.getBoolean(e.j.f7296, true);
        this.f293 = obtainStyledAttributes.getDimensionPixelSize(e.j.f7320, 0);
        obtainStyledAttributes.recycle();
        tVar.supportRequestWindowFeature(1);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static boolean m445(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m445(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m446(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static void m447(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private ViewGroup m448(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m449() {
        int i5 = this.f300;
        return i5 == 0 ? this.f302 : this.f325 == 1 ? i5 : this.f302;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m450(ViewGroup viewGroup, View view, int i5, int i6) {
        View findViewById = this.f291.findViewById(e.f.f7034);
        View findViewById2 = this.f291.findViewById(e.f.f7033);
        if (Build.VERSION.SDK_INT >= 23) {
            f1.m2850(view, i5, i6);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i5 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i5 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById == null && findViewById2 == null) {
            return;
        }
        if (this.f297 != null) {
            this.f319.setOnScrollChangeListener(new b(findViewById, findViewById2));
            this.f319.post(new c(findViewById, findViewById2));
            return;
        }
        ListView listView = this.f299;
        if (listView != null) {
            listView.setOnScrollListener(new d(findViewById, findViewById2));
            this.f299.post(new e(findViewById, findViewById2));
            return;
        }
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m451(ViewGroup viewGroup) {
        int i5;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f315 = button;
        button.setOnClickListener(this.f323);
        if (TextUtils.isEmpty(this.f317) && this.f320 == null) {
            this.f315.setVisibility(8);
            i5 = 0;
        } else {
            this.f315.setText(this.f317);
            Drawable drawable = this.f320;
            if (drawable != null) {
                int i6 = this.f293;
                drawable.setBounds(0, 0, i6, i6);
                this.f315.setCompoundDrawables(this.f320, null, null, null);
            }
            this.f315.setVisibility(0);
            i5 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f322 = button2;
        button2.setOnClickListener(this.f323);
        if (TextUtils.isEmpty(this.f324) && this.f327 == null) {
            this.f322.setVisibility(8);
        } else {
            this.f322.setText(this.f324);
            Drawable drawable2 = this.f327;
            if (drawable2 != null) {
                int i7 = this.f293;
                drawable2.setBounds(0, 0, i7, i7);
                this.f322.setCompoundDrawables(this.f327, null, null, null);
            }
            this.f322.setVisibility(0);
            i5 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f328 = button3;
        button3.setOnClickListener(this.f323);
        if (TextUtils.isEmpty(this.f329) && this.f331 == null) {
            this.f328.setVisibility(8);
        } else {
            this.f328.setText(this.f329);
            Drawable drawable3 = this.f331;
            if (drawable3 != null) {
                int i8 = this.f293;
                drawable3.setBounds(0, 0, i8, i8);
                this.f328.setCompoundDrawables(this.f331, null, null, null);
            }
            this.f328.setVisibility(0);
            i5 |= 4;
        }
        if (m456(this.f287)) {
            if (i5 == 1) {
                m446(this.f315);
            } else if (i5 == 2) {
                m446(this.f322);
            } else if (i5 == 4) {
                m446(this.f328);
            }
        }
        if (i5 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m452(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f291.findViewById(e.f.f7035);
        this.f319 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f319.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f296 = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f297;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f319.removeView(this.f296);
        if (this.f299 == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f319.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f319);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f299, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m453(ViewGroup viewGroup) {
        View view = this.f301;
        if (view == null) {
            view = this.f303 != 0 ? LayoutInflater.from(this.f287).inflate(this.f303, viewGroup, false) : null;
        }
        boolean z5 = view != null;
        if (!z5 || !m445(view)) {
            this.f291.setFlags(131072, 131072);
        }
        if (!z5) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f291.findViewById(e.f.f7023);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f313) {
            frameLayout.setPadding(this.f305, this.f307, this.f309, this.f311);
        }
        if (this.f299 != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m454(ViewGroup viewGroup) {
        if (this.f294 != null) {
            viewGroup.addView(this.f294, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f291.findViewById(e.f.f7018).setVisibility(8);
            return;
        }
        this.f292 = (ImageView) this.f291.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f295)) || !this.f312) {
            this.f291.findViewById(e.f.f7018).setVisibility(8);
            this.f292.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f291.findViewById(e.f.f7015);
        this.f290 = textView;
        textView.setText(this.f295);
        int i5 = this.f321;
        if (i5 != 0) {
            this.f292.setImageResource(i5);
            return;
        }
        Drawable drawable = this.f288;
        if (drawable != null) {
            this.f292.setImageDrawable(drawable);
        } else {
            this.f290.setPadding(this.f292.getPaddingLeft(), this.f292.getPaddingTop(), this.f292.getPaddingRight(), this.f292.getPaddingBottom());
            this.f292.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m455() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f291.findViewById(e.f.f7032);
        int i5 = e.f.f7022;
        View findViewById4 = findViewById3.findViewById(i5);
        int i6 = e.f.f7021;
        View findViewById5 = findViewById3.findViewById(i6);
        int i7 = e.f.f7017;
        View findViewById6 = findViewById3.findViewById(i7);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(e.f.f7024);
        m453(viewGroup);
        View findViewById7 = viewGroup.findViewById(i5);
        View findViewById8 = viewGroup.findViewById(i6);
        View findViewById9 = viewGroup.findViewById(i7);
        ViewGroup m448 = m448(findViewById7, findViewById4);
        ViewGroup m4482 = m448(findViewById8, findViewById5);
        ViewGroup m4483 = m448(findViewById9, findViewById6);
        m452(m4482);
        m451(m4483);
        m454(m448);
        boolean z5 = viewGroup.getVisibility() != 8;
        boolean z6 = (m448 == null || m448.getVisibility() == 8) ? 0 : 1;
        boolean z7 = (m4483 == null || m4483.getVisibility() == 8) ? false : true;
        if (!z7 && m4482 != null && (findViewById2 = m4482.findViewById(e.f.f7010)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z6 != 0) {
            NestedScrollView nestedScrollView = this.f319;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f297 == null && this.f299 == null) ? null : m448.findViewById(e.f.f7020);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m4482 != null && (findViewById = m4482.findViewById(e.f.f7016)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f299;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m471(z6, z7);
        }
        if (!z5) {
            View view = this.f299;
            if (view == null) {
                view = this.f319;
            }
            if (view != null) {
                m450(m4482, view, z6 | (z7 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f299;
        if (listView2 == null || (listAdapter = this.f316) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = this.f298;
        if (i8 > -1) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static boolean m456(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f6908, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m457(int i5) {
        TypedValue typedValue = new TypedValue();
        this.f287.getTheme().resolveAttribute(i5, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public ListView m458() {
        return this.f299;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m459() {
        this.f289.setContentView(m449());
        m455();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m460(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f319;
        return nestedScrollView != null && nestedScrollView.m3503(keyEvent);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m461(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f319;
        return nestedScrollView != null && nestedScrollView.m3503(keyEvent);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m462(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f314.obtainMessage(i5, onClickListener);
        }
        if (i5 == -3) {
            this.f329 = charSequence;
            this.f330 = message;
            this.f331 = drawable;
        } else if (i5 == -2) {
            this.f324 = charSequence;
            this.f326 = message;
            this.f327 = drawable;
        } else {
            if (i5 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f317 = charSequence;
            this.f318 = message;
            this.f320 = drawable;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m463(View view) {
        this.f294 = view;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m464(int i5) {
        this.f288 = null;
        this.f321 = i5;
        ImageView imageView = this.f292;
        if (imageView != null) {
            if (i5 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f292.setImageResource(this.f321);
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m465(Drawable drawable) {
        this.f288 = drawable;
        this.f321 = 0;
        ImageView imageView = this.f292;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f292.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m466(CharSequence charSequence) {
        this.f297 = charSequence;
        TextView textView = this.f296;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m467(CharSequence charSequence) {
        this.f295 = charSequence;
        TextView textView = this.f290;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m468(int i5) {
        this.f301 = null;
        this.f303 = i5;
        this.f313 = false;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m469(View view) {
        this.f301 = view;
        this.f303 = 0;
        this.f313 = false;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m470(View view, int i5, int i6, int i7, int i8) {
        this.f301 = view;
        this.f303 = 0;
        this.f313 = true;
        this.f305 = i5;
        this.f307 = i6;
        this.f309 = i7;
        this.f311 = i8;
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f341;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ View f342;

        d(View view, View view2) {
            this.f341 = view;
            this.f342 = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
            AlertController.m447(absListView, this.f341, this.f342);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i5) {
        }
    }
}
