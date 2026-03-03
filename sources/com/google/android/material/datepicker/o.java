package com.google.android.material.datepicker;

import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class o<S> extends androidx.fragment.app.e {
    protected final LinkedHashSet<OnSelectionChangedListener<S>> onSelectionChangedListeners = new LinkedHashSet<>();

    o() {
    }

    boolean addOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.add(onSelectionChangedListener);
    }

    void clearOnSelectionChangedListeners() {
        this.onSelectionChangedListeners.clear();
    }

    abstract DateSelector<S> getDateSelector();

    boolean removeOnSelectionChangedListener(OnSelectionChangedListener<S> onSelectionChangedListener) {
        return this.onSelectionChangedListeners.remove(onSelectionChangedListener);
    }
}
