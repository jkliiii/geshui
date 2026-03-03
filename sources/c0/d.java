package c0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import c0.b;

/* compiled from: SpringAnimation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d extends b<d> {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean f4950;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private e f4951;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private float f4952;

    public <K> d(K k5, c<K> cVar) {
        super(k5, cVar);
        this.f4951 = null;
        this.f4952 = Float.MAX_VALUE;
        this.f4950 = false;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m5803() {
        e eVar = this.f4951;
        if (eVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double m5810 = eVar.m5810();
        if (m5810 > this.f4941) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (m5810 < this.f4942) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // c0.b
    /* renamed from: ˏ */
    public void mo5769() {
        m5803();
        this.f4951.m5815(m5764());
        super.mo5769();
    }

    @Override // c0.b
    /* renamed from: י */
    boolean mo5770(long j5) {
        if (this.f4950) {
            float f5 = this.f4952;
            if (f5 != Float.MAX_VALUE) {
                this.f4951.m5813(f5);
                this.f4952 = Float.MAX_VALUE;
            }
            this.f4936 = this.f4951.m5810();
            this.f4935 = 0.0f;
            this.f4950 = false;
            return true;
        }
        if (this.f4952 != Float.MAX_VALUE) {
            this.f4951.m5810();
            long j6 = j5 / 2;
            b.o m5816 = this.f4951.m5816(this.f4936, this.f4935, j6);
            this.f4951.m5813(this.f4952);
            this.f4952 = Float.MAX_VALUE;
            b.o m58162 = this.f4951.m5816(m5816.f4947, m5816.f4948, j6);
            this.f4936 = m58162.f4947;
            this.f4935 = m58162.f4948;
        } else {
            b.o m58163 = this.f4951.m5816(this.f4936, this.f4935, j5);
            this.f4936 = m58163.f4947;
            this.f4935 = m58163.f4948;
        }
        float max = Math.max(this.f4936, this.f4942);
        this.f4936 = max;
        float min = Math.min(max, this.f4941);
        this.f4936 = min;
        if (!m5806(min, this.f4935)) {
            return false;
        }
        this.f4936 = this.f4951.m5810();
        this.f4935 = 0.0f;
        return true;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m5804(float f5) {
        if (m5765()) {
            this.f4952 = f5;
            return;
        }
        if (this.f4951 == null) {
            this.f4951 = new e(f5);
        }
        this.f4951.m5813(f5);
        mo5769();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m5805() {
        return this.f4951.f4954 > 0.0d;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean m5806(float f5, float f6) {
        return this.f4951.m5811(f5, f6);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public d m5807(e eVar) {
        this.f4951 = eVar;
        return this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m5808() {
        if (!m5805()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f4940) {
            this.f4950 = true;
        }
    }
}
