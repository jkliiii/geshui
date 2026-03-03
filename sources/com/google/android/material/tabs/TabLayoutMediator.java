package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.a;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class TabLayoutMediator {
    private RecyclerView.h<?> adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private b onPageChangeCallback;
    private TabLayout.OnTabSelectedListener onTabSelectedListener;
    private RecyclerView.j pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabConfigurationStrategy tabConfigurationStrategy;
    private final TabLayout tabLayout;
    private final androidx.viewpager2.widget.a viewPager;

    public interface TabConfigurationStrategy {
        void onConfigureTab(TabLayout.Tab tab, int i5);
    }

    private class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        /* renamed from: ʻ */
        public void mo4830() {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        /* renamed from: ʼ */
        public void mo4831(int i5, int i6) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        /* renamed from: ʽ */
        public void mo4832(int i5, int i6, Object obj) {
            TabLayoutMediator.this.populateTabsFromPagerAdapter();
        }
    }

    private static class b extends a.AbstractC0067a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final WeakReference<TabLayout> f6155;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f6156;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f6157;

        b(TabLayout tabLayout) {
            this.f6155 = new WeakReference<>(tabLayout);
            m7266();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m7266() {
            this.f6157 = 0;
            this.f6156 = 0;
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, androidx.viewpager2.widget.a aVar, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, aVar, true, tabConfigurationStrategy);
    }

    public void attach() {
        if (this.attached) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.h<?> adapter = this.viewPager.getAdapter();
        this.adapter = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.attached = true;
        b bVar = new b(this.tabLayout);
        this.onPageChangeCallback = bVar;
        this.viewPager.m5622(bVar);
        c cVar = new c(this.viewPager, this.smoothScroll);
        this.onTabSelectedListener = cVar;
        this.tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) cVar);
        if (this.autoRefresh) {
            a aVar = new a();
            this.pagerAdapterObserver = aVar;
            this.adapter.m4823(aVar);
        }
        populateTabsFromPagerAdapter();
        this.tabLayout.setScrollPosition(this.viewPager.getCurrentItem(), 0.0f, true);
    }

    public void detach() {
        RecyclerView.h<?> hVar;
        if (this.autoRefresh && (hVar = this.adapter) != null) {
            hVar.m4825(this.pagerAdapterObserver);
            this.pagerAdapterObserver = null;
        }
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        this.viewPager.m5625(this.onPageChangeCallback);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        RecyclerView.h<?> hVar = this.adapter;
        if (hVar != null) {
            int mo4807 = hVar.mo4807();
            for (int i5 = 0; i5 < mo4807; i5++) {
                TabLayout.Tab newTab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(newTab, i5);
                this.tabLayout.addTab(newTab, false);
            }
            if (mo4807 > 0) {
                int min = Math.min(this.viewPager.getCurrentItem(), this.tabLayout.getTabCount() - 1);
                if (min != this.tabLayout.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.tabLayout;
                    tabLayout.selectTab(tabLayout.getTabAt(min));
                }
            }
        }
    }

    public TabLayoutMediator(TabLayout tabLayout, androidx.viewpager2.widget.a aVar, boolean z5, TabConfigurationStrategy tabConfigurationStrategy) {
        this(tabLayout, aVar, z5, true, tabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, androidx.viewpager2.widget.a aVar, boolean z5, boolean z6, TabConfigurationStrategy tabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = aVar;
        this.autoRefresh = z5;
        this.smoothScroll = z6;
        this.tabConfigurationStrategy = tabConfigurationStrategy;
    }

    private static class c implements TabLayout.OnTabSelectedListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.viewpager2.widget.a f6158;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f6159;

        c(androidx.viewpager2.widget.a aVar, boolean z5) {
            this.f6158 = aVar;
            this.f6159 = z5;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.f6158.m5623(tab.getPosition(), this.f6159);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }
}
