package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialCalendar<S> extends o<S> {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String CURRENT_MONTH_KEY = "CURRENT_MONTH_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    private static final String GRID_SELECTOR_KEY = "GRID_SELECTOR_KEY";
    private static final int SMOOTH_SCROLL_MAX = 3;
    private static final String THEME_RES_ID_KEY = "THEME_RES_ID_KEY";
    private CalendarConstraints calendarConstraints;
    private l calendarSelector;
    private com.google.android.material.datepicker.b calendarStyle;
    private com.google.android.material.datepicker.m current;
    private DateSelector<S> dateSelector;
    private View dayFrame;
    private DayViewDecorator dayViewDecorator;
    private View monthNext;
    private View monthPrev;
    private RecyclerView recyclerView;
    private int themeResId;
    private View yearFrame;
    private RecyclerView yearSelector;
    static final Object MONTHS_VIEW_GROUP_TAG = "MONTHS_VIEW_GROUP_TAG";
    static final Object NAVIGATION_PREV_TAG = "NAVIGATION_PREV_TAG";
    static final Object NAVIGATION_NEXT_TAG = "NAVIGATION_NEXT_TAG";
    static final Object SELECTOR_TOGGLE_TAG = "SELECTOR_TOGGLE_TAG";

    class a implements View.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ MonthsPagerAdapter f5597;

        a(MonthsPagerAdapter monthsPagerAdapter) {
            this.f5597 = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m4720 = MaterialCalendar.this.getLayoutManager().m4720() - 1;
            if (m4720 >= 0) {
                MaterialCalendar.this.setCurrentMonth(this.f5597.m6680(m4720));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f5599;

        b(int i5) {
            this.f5599 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialCalendar.this.recyclerView.smoothScrollToPosition(this.f5599);
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2643(null);
        }
    }

    class d extends p {

        /* renamed from: ᐧ, reason: contains not printable characters */
        final /* synthetic */ int f5602;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i5, boolean z5, int i6) {
            super(context, i5, z5);
            this.f5602 = i6;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: ʻ */
        protected void mo4710(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.f5602 == 0) {
                iArr[0] = MaterialCalendar.this.recyclerView.getWidth();
                iArr[1] = MaterialCalendar.this.recyclerView.getWidth();
            } else {
                iArr[0] = MaterialCalendar.this.recyclerView.getHeight();
                iArr[1] = MaterialCalendar.this.recyclerView.getHeight();
            }
        }
    }

    class e implements m {
        e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.MaterialCalendar.m
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo6669(long j5) {
            if (MaterialCalendar.this.calendarConstraints.getDateValidator().isValid(j5)) {
                MaterialCalendar.this.dateSelector.select(j5);
                Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.onSelectionChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().onSelectionChanged(MaterialCalendar.this.dateSelector.getSelection());
                }
                MaterialCalendar.this.recyclerView.getAdapter().m4812();
                if (MaterialCalendar.this.yearSelector != null) {
                    MaterialCalendar.this.yearSelector.getAdapter().m4812();
                }
            }
        }
    }

    class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2663(false);
        }
    }

    class g extends RecyclerView.o {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Calendar f5606 = w.m6786();

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Calendar f5607 = w.m6786();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.d<Long, Long> dVar : MaterialCalendar.this.dateSelector.getSelectedRanges()) {
                    Long l5 = dVar.f2843;
                    if (l5 != null && dVar.f2844 != null) {
                        this.f5606.setTimeInMillis(l5.longValue());
                        this.f5607.setTimeInMillis(dVar.f2844.longValue());
                        int m6693 = yearGridAdapter.m6693(this.f5606.get(1));
                        int m66932 = yearGridAdapter.m6693(this.f5607.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(m6693);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(m66932);
                        int m4668 = m6693 / gridLayoutManager.m4668();
                        int m46682 = m66932 / gridLayoutManager.m4668();
                        int i5 = m4668;
                        while (i5 <= m46682) {
                            if (gridLayoutManager.findViewByPosition(gridLayoutManager.m4668() * i5) != null) {
                                canvas.drawRect((i5 != m4668 || findViewByPosition == null) ? 0 : findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2), r9.getTop() + MaterialCalendar.this.calendarStyle.f5660.m6696(), (i5 != m46682 || findViewByPosition2 == null) ? recyclerView.getWidth() : findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2), r9.getBottom() - MaterialCalendar.this.calendarStyle.f5660.m6695(), MaterialCalendar.this.calendarStyle.f5664);
                            }
                            i5++;
                        }
                    }
                }
            }
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2652(MaterialCalendar.this.dayFrame.getVisibility() == 0 ? MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_year_selection) : MaterialCalendar.this.getString(R.string.mtrl_picker_toggle_to_day_selection));
        }
    }

    class i extends RecyclerView.u {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ MonthsPagerAdapter f5610;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ MaterialButton f5611;

        i(MonthsPagerAdapter monthsPagerAdapter, MaterialButton materialButton) {
            this.f5610 = monthsPagerAdapter;
            this.f5611 = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʻ */
        public void mo4874(RecyclerView recyclerView, int i5) {
            if (i5 == 0) {
                recyclerView.announceForAccessibility(this.f5611.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʼ */
        public void mo4875(RecyclerView recyclerView, int i5, int i6) {
            int m4719 = i5 < 0 ? MaterialCalendar.this.getLayoutManager().m4719() : MaterialCalendar.this.getLayoutManager().m4720();
            MaterialCalendar.this.current = this.f5610.m6680(m4719);
            this.f5611.setText(this.f5610.m6681(m4719));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialCalendar.this.toggleVisibleSelector();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ MonthsPagerAdapter f5614;

        k(MonthsPagerAdapter monthsPagerAdapter) {
            this.f5614 = monthsPagerAdapter;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m4719 = MaterialCalendar.this.getLayoutManager().m4719() + 1;
            if (m4719 < MaterialCalendar.this.recyclerView.getAdapter().mo4807()) {
                MaterialCalendar.this.setCurrentMonth(this.f5614.m6680(m4719));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        /* renamed from: ʻ */
        void mo6669(long j5);
    }

    private void addActionsToMonthNavigation(View view, MonthsPagerAdapter monthsPagerAdapter) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(SELECTOR_TOGGLE_TAG);
        f1.m2830(materialButton, new h());
        View findViewById = view.findViewById(R.id.month_navigation_previous);
        this.monthPrev = findViewById;
        findViewById.setTag(NAVIGATION_PREV_TAG);
        View findViewById2 = view.findViewById(R.id.month_navigation_next);
        this.monthNext = findViewById2;
        findViewById2.setTag(NAVIGATION_NEXT_TAG);
        this.yearFrame = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.dayFrame = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        setSelector(l.DAY);
        materialButton.setText(this.current.m6736());
        this.recyclerView.addOnScrollListener(new i(monthsPagerAdapter, materialButton));
        materialButton.setOnClickListener(new j());
        this.monthNext.setOnClickListener(new k(monthsPagerAdapter));
        this.monthPrev.setOnClickListener(new a(monthsPagerAdapter));
    }

    private RecyclerView.o createItemDecoration() {
        return new g();
    }

    static int getDayHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private static int getDialogPickerHeight(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = n.f5691;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + ((i5 - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding);
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i5, CalendarConstraints calendarConstraints) {
        return newInstance(dateSelector, i5, calendarConstraints, null);
    }

    private void postSmoothRecyclerViewScroll(int i5) {
        this.recyclerView.post(new b(i5));
    }

    private void setUpForAccessibility() {
        f1.m2830(this.recyclerView, new f());
    }

    @Override // com.google.android.material.datepicker.o
    public boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    CalendarConstraints getCalendarConstraints() {
        return this.calendarConstraints;
    }

    com.google.android.material.datepicker.b getCalendarStyle() {
        return this.calendarStyle;
    }

    com.google.android.material.datepicker.m getCurrentMonth() {
        return this.current;
    }

    @Override // com.google.android.material.datepicker.o
    public DateSelector<S> getDateSelector() {
        return this.dateSelector;
    }

    @Override // androidx.fragment.app.e, androidx.lifecycle.j
    public /* bridge */ /* synthetic */ j0.a getDefaultViewModelCreationExtras() {
        return androidx.lifecycle.i.m4432(this);
    }

    LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.recyclerView.getLayoutManager();
    }

    @Override // androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.themeResId = bundle.getInt(THEME_RES_ID_KEY);
        this.dateSelector = (DateSelector) bundle.getParcelable(GRID_SELECTOR_KEY);
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(CALENDAR_CONSTRAINTS_KEY);
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(DAY_VIEW_DECORATOR_KEY);
        this.current = (com.google.android.material.datepicker.m) bundle.getParcelable(CURRENT_MONTH_KEY);
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i5;
        int i6;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.themeResId);
        this.calendarStyle = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.m start = this.calendarConstraints.getStart();
        if (MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            i5 = R.layout.mtrl_calendar_vertical;
            i6 = 1;
        } else {
            i5 = R.layout.mtrl_calendar_horizontal;
            i6 = 0;
        }
        View inflate = cloneInContext.inflate(i5, viewGroup, false);
        inflate.setMinimumHeight(getDialogPickerHeight(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        f1.m2830(gridView, new c());
        int firstDayOfWeek = this.calendarConstraints.getFirstDayOfWeek();
        gridView.setAdapter((ListAdapter) (firstDayOfWeek > 0 ? new com.google.android.material.datepicker.k(firstDayOfWeek) : new com.google.android.material.datepicker.k()));
        gridView.setNumColumns(start.f5687);
        gridView.setEnabled(false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.recyclerView.setLayoutManager(new d(getContext(), i6, false, i6));
        this.recyclerView.setTag(MONTHS_VIEW_GROUP_TAG);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.dateSelector, this.calendarConstraints, this.dayViewDecorator, new e());
        this.recyclerView.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.yearSelector = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.yearSelector.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.yearSelector.setAdapter(new YearGridAdapter(this));
            this.yearSelector.addItemDecoration(createItemDecoration());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            addActionsToMonthNavigation(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.isFullscreen(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().attachToRecyclerView(this.recyclerView);
        }
        this.recyclerView.scrollToPosition(monthsPagerAdapter.m6678(this.current));
        setUpForAccessibility();
        return inflate;
    }

    @Override // androidx.fragment.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(THEME_RES_ID_KEY, this.themeResId);
        bundle.putParcelable(GRID_SELECTOR_KEY, this.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, this.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, this.current);
    }

    void setCurrentMonth(com.google.android.material.datepicker.m mVar) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.recyclerView.getAdapter();
        int m6678 = monthsPagerAdapter.m6678(mVar);
        int m66782 = m6678 - monthsPagerAdapter.m6678(this.current);
        boolean z5 = Math.abs(m66782) > 3;
        boolean z6 = m66782 > 0;
        this.current = mVar;
        if (z5 && z6) {
            this.recyclerView.scrollToPosition(m6678 - 3);
            postSmoothRecyclerViewScroll(m6678);
        } else if (!z5) {
            postSmoothRecyclerViewScroll(m6678);
        } else {
            this.recyclerView.scrollToPosition(m6678 + 3);
            postSmoothRecyclerViewScroll(m6678);
        }
    }

    void setSelector(l lVar) {
        this.calendarSelector = lVar;
        if (lVar == l.YEAR) {
            this.yearSelector.getLayoutManager().scrollToPosition(((YearGridAdapter) this.yearSelector.getAdapter()).m6693(this.current.f5686));
            this.yearFrame.setVisibility(0);
            this.dayFrame.setVisibility(8);
            this.monthPrev.setVisibility(8);
            this.monthNext.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.yearFrame.setVisibility(8);
            this.dayFrame.setVisibility(0);
            this.monthPrev.setVisibility(0);
            this.monthNext.setVisibility(0);
            setCurrentMonth(this.current);
        }
    }

    void toggleVisibleSelector() {
        l lVar = this.calendarSelector;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            setSelector(l.DAY);
        } else if (lVar == l.DAY) {
            setSelector(lVar2);
        }
    }

    public static <T> MaterialCalendar<T> newInstance(DateSelector<T> dateSelector, int i5, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt(THEME_RES_ID_KEY, i5);
        bundle.putParcelable(GRID_SELECTOR_KEY, dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, dayViewDecorator);
        bundle.putParcelable(CURRENT_MONTH_KEY, calendarConstraints.getOpenAt());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }
}
