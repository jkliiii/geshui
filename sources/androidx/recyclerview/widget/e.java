package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.os.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class e implements Runnable {

    /* renamed from: ˉ, reason: contains not printable characters */
    static final ThreadLocal<e> f4284 = new ThreadLocal<>();

    /* renamed from: ˊ, reason: contains not printable characters */
    static Comparator<c> f4285 = new a();

    /* renamed from: ʿ, reason: contains not printable characters */
    long f4287;

    /* renamed from: ˆ, reason: contains not printable characters */
    long f4288;

    /* renamed from: ʾ, reason: contains not printable characters */
    ArrayList<RecyclerView> f4286 = new ArrayList<>();

    /* renamed from: ˈ, reason: contains not printable characters */
    private ArrayList<c> f4289 = new ArrayList<>();

    /* compiled from: GapWorker.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4297;
            if ((recyclerView == null) != (cVar2.f4297 == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z5 = cVar.f4294;
            if (z5 != cVar2.f4294) {
                return z5 ? -1 : 1;
            }
            int i5 = cVar2.f4295 - cVar.f4295;
            if (i5 != 0) {
                return i5;
            }
            int i6 = cVar.f4296 - cVar2.f4296;
            if (i6 != 0) {
                return i6;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.p.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4290;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4291;

        /* renamed from: ʽ, reason: contains not printable characters */
        int[] f4292;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4293;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        /* renamed from: ʻ */
        public void mo4864(int i5, int i6) {
            if (i5 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i6 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i7 = this.f4293 * 2;
            int[] iArr = this.f4292;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4292 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[i7 * 2];
                this.f4292 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4292;
            iArr4[i7] = i5;
            iArr4[i7 + 1] = i6;
            this.f4293++;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5142() {
            int[] iArr = this.f4292;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4293 = 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m5143(RecyclerView recyclerView, boolean z5) {
            this.f4293 = 0;
            int[] iArr = this.f4292;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.isItemPrefetchEnabled()) {
                return;
            }
            if (z5) {
                if (!recyclerView.mAdapterHelper.m5062()) {
                    pVar.collectInitialPrefetchPositions(recyclerView.mAdapter.mo4807(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.collectAdjacentPrefetchPositions(this.f4290, this.f4291, recyclerView.mState, this);
            }
            int i5 = this.f4293;
            if (i5 > pVar.mPrefetchMaxCountObserved) {
                pVar.mPrefetchMaxCountObserved = i5;
                pVar.mPrefetchMaxObservedInInitialPrefetch = z5;
                recyclerView.mRecycler.m4919();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m5144(int i5) {
            if (this.f4292 != null) {
                int i6 = this.f4293 * 2;
                for (int i7 = 0; i7 < i6; i7 += 2) {
                    if (this.f4292[i7] == i5) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m5145(int i5, int i6) {
            this.f4290 = i5;
            this.f4291 = i6;
        }
    }

    /* compiled from: GapWorker.java */
    static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f4294;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f4295;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f4296;

        /* renamed from: ʾ, reason: contains not printable characters */
        public RecyclerView f4297;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f4298;

        c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m5146() {
            this.f4294 = false;
            this.f4295 = 0;
            this.f4296 = 0;
            this.f4297 = null;
            this.f4298 = 0;
        }
    }

    e() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5131() {
        c cVar;
        int size = this.f4286.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView = this.f4286.get(i6);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m5143(recyclerView, false);
                i5 += recyclerView.mPrefetchRegistry.f4293;
            }
        }
        this.f4289.ensureCapacity(i5);
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView2 = this.f4286.get(i8);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f4290) + Math.abs(bVar.f4291);
                for (int i9 = 0; i9 < bVar.f4293 * 2; i9 += 2) {
                    if (i7 >= this.f4289.size()) {
                        cVar = new c();
                        this.f4289.add(cVar);
                    } else {
                        cVar = this.f4289.get(i7);
                    }
                    int[] iArr = bVar.f4292;
                    int i10 = iArr[i9 + 1];
                    cVar.f4294 = i10 <= abs;
                    cVar.f4295 = abs;
                    cVar.f4296 = i10;
                    cVar.f4297 = recyclerView2;
                    cVar.f4298 = iArr[i9];
                    i7++;
                }
            }
        }
        Collections.sort(this.f4289, f4285);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5132(c cVar, long j5) {
        RecyclerView.f0 m5136 = m5136(cVar.f4297, cVar.f4298, cVar.f4294 ? Long.MAX_VALUE : j5);
        if (m5136 == null || m5136.mNestedRecyclerView == null || !m5136.isBound() || m5136.isInvalid()) {
            return;
        }
        m5135(m5136.mNestedRecyclerView.get(), j5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m5133(long j5) {
        for (int i5 = 0; i5 < this.f4289.size(); i5++) {
            c cVar = this.f4289.get(i5);
            if (cVar.f4297 == null) {
                return;
            }
            m5132(cVar, j5);
            cVar.m5146();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static boolean m5134(RecyclerView recyclerView, int i5) {
        int m5080 = recyclerView.mChildHelper.m5080();
        for (int i6 = 0; i6 < m5080; i6++) {
            RecyclerView.f0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m5079(i6));
            if (childViewHolderInt.mPosition == i5 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5135(RecyclerView recyclerView, long j5) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m5080() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.m5143(recyclerView, true);
        if (bVar.f4293 != 0) {
            try {
                t.m2443("RV Nested Prefetch");
                recyclerView.mState.m4770(recyclerView.mAdapter);
                for (int i5 = 0; i5 < bVar.f4293 * 2; i5 += 2) {
                    m5136(recyclerView, bVar.f4292[i5], j5);
                }
            } finally {
                t.m2444();
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private RecyclerView.f0 m5136(RecyclerView recyclerView, int i5, long j5) {
        if (m5134(recyclerView, i5)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.f0 m4917 = wVar.m4917(i5, false, j5);
            if (m4917 != null) {
                if (!m4917.isBound() || m4917.isInvalid()) {
                    wVar.m4897(m4917, false);
                } else {
                    wVar.m4902(m4917.itemView);
                }
            }
            return m4917;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            t.m2443("RV Prefetch");
            if (!this.f4286.isEmpty()) {
                int size = this.f4286.size();
                long j5 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = this.f4286.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j5 = Math.max(recyclerView.getDrawingTime(), j5);
                    }
                }
                if (j5 != 0) {
                    m5139(TimeUnit.MILLISECONDS.toNanos(j5) + this.f4288);
                }
            }
        } finally {
            this.f4287 = 0L;
            t.m2444();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m5137(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f4286.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f4286.add(recyclerView);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m5138(RecyclerView recyclerView, int i5, int i6) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f4286.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f4287 == 0) {
                this.f4287 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.m5145(i5, i6);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m5139(long j5) {
        m5131();
        m5133(j5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m5140(RecyclerView recyclerView) {
        boolean remove = this.f4286.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }
}
