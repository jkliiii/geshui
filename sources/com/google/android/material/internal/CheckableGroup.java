package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.MaterialCheckable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set<Integer> set);
    }

    class a implements MaterialCheckable.OnCheckedChangeListener<T> {
        a() {
        }

        @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void onCheckedChanged(T t5, boolean z5) {
            if (!z5) {
                CheckableGroup checkableGroup = CheckableGroup.this;
                if (!checkableGroup.uncheckInternal(t5, checkableGroup.selectionRequired)) {
                    return;
                }
            } else if (!CheckableGroup.this.checkInternal(t5)) {
                return;
            }
            CheckableGroup.this.onCheckedStateChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkInternal(MaterialCheckable<T> materialCheckable) {
        int id = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        T t5 = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t5 != null) {
            uncheckInternal(t5, false);
        }
        boolean add = this.checkedIds.add(Integer.valueOf(id));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return add;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (onCheckedStateChangeListener != null) {
            onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uncheckInternal(MaterialCheckable<T> materialCheckable, boolean z5) {
        int id = materialCheckable.getId();
        if (!this.checkedIds.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z5 && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id))) {
            materialCheckable.setChecked(true);
            return false;
        }
        boolean remove = this.checkedIds.remove(Integer.valueOf(id));
        if (materialCheckable.isChecked()) {
            materialCheckable.setChecked(false);
        }
        return remove;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t5) {
        this.checkables.put(Integer.valueOf(t5.getId()), t5);
        if (t5.isChecked()) {
            checkInternal(t5);
        }
        t5.setInternalOnCheckedChangeListener(new a());
    }

    public void check(int i5) {
        T t5 = this.checkables.get(Integer.valueOf(i5));
        if (t5 != null && checkInternal(t5)) {
            onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean z5 = !this.checkedIds.isEmpty();
        Iterator<T> it = this.checkables.values().iterator();
        while (it.hasNext()) {
            uncheckInternal(it.next(), false);
        }
        if (z5) {
            onCheckedStateChanged();
        }
    }

    public Set<Integer> getCheckedIds() {
        return new HashSet(this.checkedIds);
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int getSingleCheckedId() {
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        return this.checkedIds.iterator().next().intValue();
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(T t5) {
        t5.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t5.getId()));
        this.checkedIds.remove(Integer.valueOf(t5.getId()));
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean z5) {
        this.selectionRequired = z5;
    }

    public void setSingleSelection(boolean z5) {
        if (this.singleSelection != z5) {
            this.singleSelection = z5;
            clearCheck();
        }
    }

    public void uncheck(int i5) {
        T t5 = this.checkables.get(Integer.valueOf(i5));
        if (t5 != null && uncheckInternal(t5, this.selectionRequired)) {
            onCheckedStateChanged();
        }
    }
}
