package c0;

import c0.b;

/* compiled from: SpringForce.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    double f4953;

    /* renamed from: ʼ, reason: contains not printable characters */
    double f4954;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f4955;

    /* renamed from: ʾ, reason: contains not printable characters */
    private double f4956;

    /* renamed from: ʿ, reason: contains not printable characters */
    private double f4957;

    /* renamed from: ˆ, reason: contains not printable characters */
    private double f4958;

    /* renamed from: ˈ, reason: contains not printable characters */
    private double f4959;

    /* renamed from: ˉ, reason: contains not printable characters */
    private double f4960;

    /* renamed from: ˊ, reason: contains not printable characters */
    private double f4961;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final b.o f4962;

    public e() {
        this.f4953 = Math.sqrt(1500.0d);
        this.f4954 = 0.5d;
        this.f4955 = false;
        this.f4961 = Double.MAX_VALUE;
        this.f4962 = new b.o();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5809() {
        if (this.f4955) {
            return;
        }
        if (this.f4961 == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d6 = this.f4954;
        if (d6 > 1.0d) {
            double d7 = this.f4953;
            this.f4958 = ((-d6) * d7) + (d7 * Math.sqrt((d6 * d6) - 1.0d));
            double d8 = this.f4954;
            double d9 = this.f4953;
            this.f4959 = ((-d8) * d9) - (d9 * Math.sqrt((d8 * d8) - 1.0d));
        } else if (d6 >= 0.0d && d6 < 1.0d) {
            this.f4960 = this.f4953 * Math.sqrt(1.0d - (d6 * d6));
        }
        this.f4955 = true;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public float m5810() {
        return (float) this.f4961;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m5811(float f5, float f6) {
        return ((double) Math.abs(f6)) < this.f4957 && ((double) Math.abs(f5 - m5810())) < this.f4956;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public e m5812(float f5) {
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f4954 = f5;
        this.f4955 = false;
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public e m5813(float f5) {
        this.f4961 = f5;
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public e m5814(float f5) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f4953 = Math.sqrt(f5);
        this.f4955 = false;
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m5815(double d6) {
        double abs = Math.abs(d6);
        this.f4956 = abs;
        this.f4957 = abs * 62.5d;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    b.o m5816(double d6, double d7, long j5) {
        double cos;
        double d8;
        m5809();
        double d9 = j5;
        Double.isNaN(d9);
        double d10 = d9 / 1000.0d;
        double d11 = d6 - this.f4961;
        double d12 = this.f4954;
        if (d12 > 1.0d) {
            double d13 = this.f4959;
            double d14 = this.f4958;
            double d15 = d11 - (((d13 * d11) - d7) / (d13 - d14));
            double d16 = ((d11 * d13) - d7) / (d13 - d14);
            d8 = (Math.pow(2.718281828459045d, d13 * d10) * d15) + (Math.pow(2.718281828459045d, this.f4958 * d10) * d16);
            double d17 = this.f4959;
            double pow = d15 * d17 * Math.pow(2.718281828459045d, d17 * d10);
            double d18 = this.f4958;
            cos = pow + (d16 * d18 * Math.pow(2.718281828459045d, d18 * d10));
        } else if (d12 == 1.0d) {
            double d19 = this.f4953;
            double d20 = d7 + (d19 * d11);
            double d21 = d11 + (d20 * d10);
            d8 = Math.pow(2.718281828459045d, (-d19) * d10) * d21;
            double pow2 = d21 * Math.pow(2.718281828459045d, (-this.f4953) * d10);
            double d22 = this.f4953;
            cos = (d20 * Math.pow(2.718281828459045d, (-d22) * d10)) + (pow2 * (-d22));
        } else {
            double d23 = 1.0d / this.f4960;
            double d24 = this.f4953;
            double d25 = d23 * ((d12 * d24 * d11) + d7);
            double pow3 = Math.pow(2.718281828459045d, (-d12) * d24 * d10) * ((Math.cos(this.f4960 * d10) * d11) + (Math.sin(this.f4960 * d10) * d25));
            double d26 = this.f4953;
            double d27 = this.f4954;
            double d28 = (-d26) * pow3 * d27;
            double pow4 = Math.pow(2.718281828459045d, (-d27) * d26 * d10);
            double d29 = this.f4960;
            double sin = (-d29) * d11 * Math.sin(d29 * d10);
            double d30 = this.f4960;
            cos = d28 + (pow4 * (sin + (d25 * d30 * Math.cos(d30 * d10))));
            d8 = pow3;
        }
        b.o oVar = this.f4962;
        oVar.f4947 = (float) (d8 + this.f4961);
        oVar.f4948 = (float) cos;
        return oVar;
    }

    public e(float f5) {
        this.f4953 = Math.sqrt(1500.0d);
        this.f4954 = 0.5d;
        this.f4955 = false;
        this.f4961 = Double.MAX_VALUE;
        this.f4962 = new b.o();
        this.f4961 = f5;
    }
}
