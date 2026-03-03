package r1;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<u1.d> f10787 = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Set<u1.d> f10788 = new HashSet();

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f10789;

    public String toString() {
        return super.toString() + "{numRequests=" + this.f10787.size() + ", isPaused=" + this.f10789 + "}";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m11653(u1.d dVar) {
        boolean z5 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f10787.remove(dVar);
        if (!this.f10788.remove(dVar) && !remove) {
            z5 = false;
        }
        if (z5) {
            dVar.clear();
        }
        return z5;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m11654() {
        Iterator it = y1.l.m12904(this.f10787).iterator();
        while (it.hasNext()) {
            m11653((u1.d) it.next());
        }
        this.f10788.clear();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m11655() {
        this.f10789 = true;
        for (u1.d dVar : y1.l.m12904(this.f10787)) {
            if (dVar.isRunning() || dVar.mo12165()) {
                dVar.clear();
                this.f10788.add(dVar);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m11656() {
        this.f10789 = true;
        for (u1.d dVar : y1.l.m12904(this.f10787)) {
            if (dVar.isRunning()) {
                dVar.mo12158();
                this.f10788.add(dVar);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m11657() {
        for (u1.d dVar : y1.l.m12904(this.f10787)) {
            if (!dVar.mo12165() && !dVar.mo12160()) {
                dVar.clear();
                if (this.f10789) {
                    this.f10788.add(dVar);
                } else {
                    dVar.mo12164();
                }
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m11658() {
        this.f10789 = false;
        for (u1.d dVar : y1.l.m12904(this.f10787)) {
            if (!dVar.mo12165() && !dVar.isRunning()) {
                dVar.mo12164();
            }
        }
        this.f10788.clear();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m11659(u1.d dVar) {
        this.f10787.add(dVar);
        if (!this.f10789) {
            dVar.mo12164();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f10788.add(dVar);
    }
}
