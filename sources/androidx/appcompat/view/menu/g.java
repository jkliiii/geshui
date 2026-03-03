package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g implements v.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private i mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<i> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<i> mItems = new ArrayList<>();
    private ArrayList<i> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<i> mActionItems = new ArrayList<>();
    private ArrayList<i> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* compiled from: MenuBuilder.java */
    public interface a {
        /* renamed from: ʻ */
        boolean mo528(g gVar, MenuItem menuItem);

        /* renamed from: ʼ */
        void mo529(g gVar);
    }

    /* compiled from: MenuBuilder.java */
    public interface b {
        /* renamed from: ʻ */
        boolean mo885(i iVar);
    }

    public g(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private i createNewMenuItem(int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        return new i(this, i5, i6, i7, i8, charSequence, i9);
    }

    private void dispatchPresenterUpdate(boolean z5) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.mPresenters.remove(next);
            } else {
                mVar.updateMenuView(z5);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id = mVar.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    mVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable onSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.mPresenters.remove(next);
            } else {
                int id = mVar.getId();
                if (id > 0 && (onSaveInstanceState = mVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id, onSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(r rVar, m mVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean onSubMenuSelected = mVar != null ? mVar.onSubMenuSelected(rVar) : false;
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.mPresenters.remove(next);
            } else if (!onSubMenuSelected) {
                onSubMenuSelected = mVar2.onSubMenuSelected(rVar);
            }
        }
        return onSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<i> arrayList, int i5) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m949() <= i5) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i5) {
        int i6 = ((-65536) & i5) >> 16;
        if (i6 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i6 < iArr.length) {
                return (i5 & 65535) | (iArr[i6] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i5, boolean z5) {
        if (i5 < 0 || i5 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i5);
        if (z5) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i5, CharSequence charSequence, int i6, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i5 > 0) {
                this.mHeaderTitle = resources.getText(i5);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i6 > 0) {
                this.mHeaderIcon = androidx.core.content.a.m1993(getContext(), i6);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setShortcutsVisibleInner(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.y3.m3450(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.setShortcutsVisibleInner(boolean):void");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        int i9;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i8 & 1) == 0) {
            removeGroup(i5);
        }
        for (int i10 = 0; i10 < size; i10++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i10);
            int i11 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i11 < 0 ? intent : intentArr[i11]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i5, i6, i7, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i9 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i9] = intent3;
            }
        }
        return size;
    }

    protected MenuItem addInternal(int i5, int i6, int i7, CharSequence charSequence) {
        int ordering = getOrdering(i7);
        i createNewMenuItem = createNewMenuItem(i5, i6, i7, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            createNewMenuItem.m967(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), createNewMenuItem);
        onItemsChanged(true);
        return createNewMenuItem;
    }

    public void addMenuPresenter(m mVar) {
        addMenuPresenter(mVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.mo529(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.mExpandedItem;
        if (iVar != null) {
            collapseItemActionView(iVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z5) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.mPresenters.remove(next);
            } else {
                mVar.onCloseMenu(this, z5);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(i iVar) {
        boolean z5 = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == iVar) {
            stopDispatchingItemsChanged();
            Iterator<WeakReference<m>> it = this.mPresenters.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z5 = mVar.collapseItemActionView(this, iVar);
                    if (z5) {
                        break;
                    }
                }
            }
            startDispatchingItemsChanged();
            if (z5) {
                this.mExpandedItem = null;
            }
        }
        return z5;
    }

    boolean dispatchMenuItemSelected(g gVar, MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.mo528(gVar, menuItem);
    }

    public boolean expandItemActionView(i iVar) {
        boolean z5 = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.mPresenters.remove(next);
            } else {
                z5 = mVar.expandItemActionView(this, iVar);
                if (z5) {
                    break;
                }
            }
        }
        startDispatchingItemsChanged();
        if (z5) {
            this.mExpandedItem = iVar;
        }
        return z5;
    }

    public int findGroupIndex(int i5) {
        return findGroupIndex(i5, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i5) {
        MenuItem findItem;
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = this.mItems.get(i6);
            if (iVar.getItemId() == i5) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i5)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i5) {
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.mItems.get(i6).getItemId() == i5) {
                return i6;
            }
        }
        return -1;
    }

    i findItemWithShortcutForKey(int i5, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i5, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean isQwertyMode = isQwertyMode();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = arrayList.get(i6);
            char alphabeticShortcut = isQwertyMode ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (isQwertyMode && alphabeticShortcut == '\b' && i5 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    void findItemsWithShortcutForKey(List<i> list, int i5, KeyEvent keyEvent) {
        boolean isQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i5 == 67) {
            int size = this.mItems.size();
            for (int i6 = 0; i6 < size; i6++) {
                i iVar = this.mItems.get(i6);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).findItemsWithShortcutForKey(list, i5, keyEvent);
                }
                char alphabeticShortcut = isQwertyMode ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((isQwertyMode ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (isQwertyMode && alphabeticShortcut == '\b' && i5 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<i> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            Iterator<WeakReference<m>> it = this.mPresenters.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.mPresenters.remove(next);
                } else {
                    z5 |= mVar.flagActionItems();
                }
            }
            if (z5) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i5 = 0; i5 < size; i5++) {
                    i iVar = visibleItems.get(i5);
                    if (iVar.m955()) {
                        this.mActionItems.add(iVar);
                    } else {
                        this.mNonActionItems.add(iVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<i> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    protected String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public i getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i5) {
        return this.mItems.get(i5);
    }

    public ArrayList<i> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    Resources getResources() {
        return this.mResources;
    }

    public ArrayList<i> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = this.mItems.get(i5);
            if (iVar.isVisible()) {
                this.mVisibleItems.add(iVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.mItems.get(i5).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i5, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    void onItemActionRequestChanged(i iVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    void onItemVisibleChanged(i iVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z5) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z5) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z5) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z5);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i5, int i6) {
        return performItemAction(findItem(i5), i6);
    }

    public boolean performItemAction(MenuItem menuItem, int i5) {
        return performItemAction(menuItem, null, i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        i findItemWithShortcutForKey = findItemWithShortcutForKey(i5, keyEvent);
        boolean performItemAction = findItemWithShortcutForKey != null ? performItemAction(findItemWithShortcutForKey, i6) : false;
        if ((i6 & 2) != 0) {
            close(true);
        }
        return performItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i5) {
        int findGroupIndex = findGroupIndex(i5);
        if (findGroupIndex >= 0) {
            int size = this.mItems.size() - findGroupIndex;
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                if (i6 >= size || this.mItems.get(findGroupIndex).getGroupId() != i5) {
                    break;
                }
                removeItemAtInt(findGroupIndex, false);
                i6 = i7;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i5) {
        removeItemAtInt(findItemIndex(i5), true);
    }

    public void removeItemAt(int i5) {
        removeItemAtInt(i5, true);
    }

    public void removeMenuPresenter(m mVar) {
        Iterator<WeakReference<m>> it = this.mPresenters.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.mPresenters.remove(next);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i6 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i6 <= 0 || (findItem = findItem(i6)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = getItem(i5);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public g setDefaultShowAsAction(int i5) {
        this.mDefaultShowAsAction = i5;
        return this;
    }

    void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i5 = 0; i5 < size; i5++) {
            i iVar = this.mItems.get(i5);
            if (iVar.getGroupId() == groupId && iVar.m956() && iVar.isCheckable()) {
                iVar.m964(iVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i5, boolean z5, boolean z6) {
        int size = this.mItems.size();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = this.mItems.get(i6);
            if (iVar.getGroupId() == i5) {
                iVar.m965(z6);
                iVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.mGroupDividerEnabled = z5;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i5, boolean z5) {
        int size = this.mItems.size();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = this.mItems.get(i6);
            if (iVar.getGroupId() == i5) {
                iVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i5, boolean z5) {
        int size = this.mItems.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = this.mItems.get(i6);
            if (iVar.getGroupId() == i5 && iVar.m970(z5)) {
                z6 = true;
            }
        }
        if (z6) {
            onItemsChanged(true);
        }
    }

    protected g setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    protected g setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    protected g setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z5) {
        this.mOptionalIconsVisible = z5;
    }

    public void setOverrideVisibleItems(boolean z5) {
        this.mOverrideVisibleItems = z5;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.mQwertyMode = z5;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z5) {
        if (this.mShortcutsVisible == z5) {
            return;
        }
        setShortcutsVisibleInner(z5);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5) {
        return addInternal(0, 0, 0, this.mResources.getString(i5));
    }

    public void addMenuPresenter(m mVar, Context context) {
        this.mPresenters.add(new WeakReference<>(mVar));
        mVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i5));
    }

    public int findGroupIndex(int i5, int i6) {
        int size = size();
        if (i6 < 0) {
            i6 = 0;
        }
        while (i6 < size) {
            if (this.mItems.get(i6).getGroupId() == i5) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, m mVar, int i5) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean m954 = iVar.m954();
        androidx.core.view.b mo894 = iVar.mo894();
        boolean z5 = mo894 != null && mo894.mo973();
        if (iVar.m953()) {
            m954 |= iVar.expandActionView();
            if (m954) {
                close(true);
            }
        } else if (iVar.hasSubMenu() || z5) {
            if ((i5 & 4) == 0) {
                close(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.m969(new r(getContext(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z5) {
                mo894.mo976(rVar);
            }
            m954 |= dispatchSubMenuSelected(rVar, mVar);
            if (!m954) {
                close(true);
            }
        } else if ((i5 & 1) == 0) {
            close(true);
        }
        return m954;
    }

    protected g setHeaderIconInt(int i5) {
        setHeaderInternal(0, null, i5, null, null);
        return this;
    }

    protected g setHeaderTitleInt(int i5) {
        setHeaderInternal(i5, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return addInternal(i5, i6, i7, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        i iVar = (i) addInternal(i5, i6, i7, charSequence);
        r rVar = new r(this.mContext, this, iVar);
        iVar.m969(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, int i8) {
        return addInternal(i5, i6, i7, this.mResources.getString(i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return addSubMenu(i5, i6, i7, this.mResources.getString(i8));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public g getRootMenu() {
        return this;
    }
}
