package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.u;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    private static final String LOG_TAG = "MButtonToggleGroup";
    private Set<Integer> checkedIds;
    private Integer[] childOrder;
    private final Comparator<MaterialButton> childOrderComparator;
    private final int defaultCheckId;
    private final LinkedHashSet<OnButtonCheckedListener> onButtonCheckedListeners;
    private final List<c> originalCornerData;
    private final d pressedStateTracker;
    private boolean selectionRequired;
    private boolean singleSelection;
    private boolean skipCheckedStateTracker;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5);
    }

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2644(j0.c.m2711(0, 1, MaterialButtonToggleGroup.this.getIndexWithinVisibleButtons(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: ʿ, reason: contains not printable characters */
        private static final CornerSize f5355 = new AbsoluteCornerSize(0.0f);

        /* renamed from: ʻ, reason: contains not printable characters */
        CornerSize f5356;

        /* renamed from: ʼ, reason: contains not printable characters */
        CornerSize f5357;

        /* renamed from: ʽ, reason: contains not printable characters */
        CornerSize f5358;

        /* renamed from: ʾ, reason: contains not printable characters */
        CornerSize f5359;

        c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f5356 = cornerSize;
            this.f5357 = cornerSize3;
            this.f5358 = cornerSize4;
            this.f5359 = cornerSize2;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static c m6243(c cVar) {
            CornerSize cornerSize = f5355;
            return new c(cornerSize, cVar.f5359, cornerSize, cVar.f5358);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static c m6244(c cVar, View view) {
            return ViewUtils.isLayoutRtl(view) ? m6245(cVar) : m6246(cVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static c m6245(c cVar) {
            CornerSize cornerSize = cVar.f5356;
            CornerSize cornerSize2 = cVar.f5359;
            CornerSize cornerSize3 = f5355;
            return new c(cornerSize, cornerSize2, cornerSize3, cornerSize3);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static c m6246(c cVar) {
            CornerSize cornerSize = f5355;
            return new c(cornerSize, cornerSize, cVar.f5357, cVar.f5358);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static c m6247(c cVar, View view) {
            return ViewUtils.isLayoutRtl(view) ? m6246(cVar) : m6245(cVar);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static c m6248(c cVar) {
            CornerSize cornerSize = cVar.f5356;
            CornerSize cornerSize2 = f5355;
            return new c(cornerSize, cornerSize2, cVar.f5357, cornerSize2);
        }
    }

    private class d implements MaterialButton.a {
        private d() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        /* renamed from: ʻ */
        public void mo6237(MaterialButton materialButton, boolean z5) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ d(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    private void adjustChildMarginsAndUpdateLayout() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
            MaterialButton childButton = getChildButton(i5);
            int min = Math.min(childButton.getStrokeWidth(), getChildButton(i5 - 1).getStrokeWidth());
            LinearLayout.LayoutParams buildLayoutParams = buildLayoutParams(childButton);
            if (getOrientation() == 0) {
                u.m3355(buildLayoutParams, 0);
                u.m3356(buildLayoutParams, -min);
                buildLayoutParams.topMargin = 0;
            } else {
                buildLayoutParams.bottomMargin = 0;
                buildLayoutParams.topMargin = -min;
                u.m3356(buildLayoutParams, 0);
            }
            childButton.setLayoutParams(buildLayoutParams);
        }
        resetChildMargins(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams buildLayoutParams(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void checkInternal(int i5, boolean z5) {
        if (i5 == -1) {
            Log.e(LOG_TAG, "Button ID is not valid: " + i5);
            return;
        }
        HashSet hashSet = new HashSet(this.checkedIds);
        if (z5 && !hashSet.contains(Integer.valueOf(i5))) {
            if (this.singleSelection && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i5));
        } else {
            if (z5 || !hashSet.contains(Integer.valueOf(i5))) {
                return;
            }
            if (!this.selectionRequired || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i5));
            }
        }
        updateCheckedIds(hashSet);
    }

    private void dispatchOnButtonChecked(int i5, boolean z5) {
        Iterator<OnButtonCheckedListener> it = this.onButtonCheckedListeners.iterator();
        while (it.hasNext()) {
            it.next().onButtonChecked(this, i5, z5);
        }
    }

    private MaterialButton getChildButton(int i5) {
        return (MaterialButton) getChildAt(i5);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (isChildVisible(i5)) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getIndexWithinVisibleButtons(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == view) {
                return i5;
            }
            if ((getChildAt(i6) instanceof MaterialButton) && isChildVisible(i6)) {
                i5++;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (isChildVisible(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private c getNewCornerData(int i5, int i6, int i7) {
        c cVar = this.originalCornerData.get(i5);
        if (i6 == i7) {
            return cVar;
        }
        boolean z5 = getOrientation() == 0;
        if (i5 == i6) {
            return z5 ? c.m6247(cVar, this) : c.m6248(cVar);
        }
        if (i5 == i7) {
            return z5 ? c.m6244(cVar, this) : c.m6243(cVar);
        }
        return null;
    }

    private int getVisibleButtonCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && isChildVisible(i6)) {
                i5++;
            }
        }
        return i5;
    }

    private boolean isChildVisible(int i5) {
        return getChildAt(i5).getVisibility() != 8;
    }

    private void resetChildMargins(int i5) {
        if (getChildCount() == 0 || i5 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildButton(i5).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            u.m3355(layoutParams, 0);
            u.m3356(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void setCheckedStateForView(int i5, boolean z5) {
        View findViewById = findViewById(i5);
        if (findViewById instanceof MaterialButton) {
            this.skipCheckedStateTracker = true;
            ((MaterialButton) findViewById).setChecked(z5);
            this.skipCheckedStateTracker = false;
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(f1.m2880());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.pressedStateTracker);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder builder, c cVar) {
        if (cVar == null) {
            builder.setAllCornerSizes(0.0f);
        } else {
            builder.setTopLeftCornerSize(cVar.f5356).setBottomLeftCornerSize(cVar.f5359).setTopRightCornerSize(cVar.f5357).setBottomRightCornerSize(cVar.f5358);
        }
    }

    private void updateCheckedIds(Set<Integer> set) {
        Set<Integer> set2 = this.checkedIds;
        this.checkedIds = new HashSet(set);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = getChildButton(i5).getId();
            setCheckedStateForView(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                dispatchOnButtonChecked(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void updateChildOrder() {
        TreeMap treeMap = new TreeMap(this.childOrderComparator);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            treeMap.put(getChildButton(i5), Integer.valueOf(i5));
        }
        this.childOrder = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void updateChildrenA11yClassName() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildButton(i5).setA11yClassName((this.singleSelection ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void addOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.add(onButtonCheckedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(LOG_TAG, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i5, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        checkInternal(materialButton.getId(), materialButton.isChecked());
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.originalCornerData.add(new c(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
        materialButton.setEnabled(isEnabled());
        f1.m2830(materialButton, new b());
    }

    public void check(int i5) {
        checkInternal(i5, true);
    }

    public void clearChecked() {
        updateCheckedIds(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.onButtonCheckedListeners.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        updateChildOrder();
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = getChildButton(i5).getId();
            if (this.checkedIds.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        Integer[] numArr = this.childOrder;
        if (numArr != null && i6 < numArr.length) {
            return numArr[i6].intValue();
        }
        Log.w(LOG_TAG, "Child order wasn't updated");
        return i6;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    void onButtonCheckedStateChanged(MaterialButton materialButton, boolean z5) {
        if (this.skipCheckedStateTracker) {
            return;
        }
        checkInternal(materialButton.getId(), z5);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.defaultCheckId;
        if (i5 != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i5)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j0.m2620(accessibilityNodeInfo).m2643(j0.b.m2710(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
        super.onMeasure(i5, i6);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.originalCornerData.remove(indexOfChild);
        }
        updateChildShapes();
        adjustChildMarginsAndUpdateLayout();
    }

    public void removeOnButtonCheckedListener(OnButtonCheckedListener onButtonCheckedListener) {
        this.onButtonCheckedListeners.remove(onButtonCheckedListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildButton(i5).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.selectionRequired = z5;
    }

    public void setSingleSelection(boolean z5) {
        if (this.singleSelection != z5) {
            this.singleSelection = z5;
            clearChecked();
        }
        updateChildrenA11yClassName();
    }

    public void uncheck(int i5) {
        checkInternal(i5, false);
    }

    void updateChildShapes() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i5 = 0; i5 < childCount; i5++) {
            MaterialButton childButton = getChildButton(i5);
            if (childButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = childButton.getShapeAppearanceModel().toBuilder();
                updateBuilderWithCornerData(builder, getNewCornerData(i5, firstVisibleChildIndex, lastVisibleChildIndex));
                childButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.originalCornerData = new ArrayList();
        this.pressedStateTracker = new d(this, null);
        this.onButtonCheckedListeners = new LinkedHashSet<>();
        this.childOrderComparator = new a();
        this.skipCheckedStateTracker = false;
        this.checkedIds = new HashSet();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i5, i6, new int[0]);
        setSingleSelection(obtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.defaultCheckId = obtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.selectionRequired = obtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(obtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        obtainStyledAttributes.recycle();
        f1.m2843(this, 1);
    }

    public void setSingleSelection(int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }
}
