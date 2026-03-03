package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static d0 f431;

    /* renamed from: ʻ, reason: contains not printable characters */
    public long f432;

    /* renamed from: ʼ, reason: contains not printable characters */
    public long f433;

    /* renamed from: ʽ, reason: contains not printable characters */
    public int f434;

    d0() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static d0 m531() {
        if (f431 == null) {
            f431 = new d0();
        }
        return f431;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m532(long j5, double d6, double d7) {
        float f5 = (j5 - 946728000000L) / 8.64E7f;
        double d8 = (0.01720197f * f5) + 6.24006f;
        double sin = Math.sin(d8) * 0.03341960161924362d;
        Double.isNaN(d8);
        double sin2 = sin + d8 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f5 - 9.0E-4f);
        double round = Math.round(r11 - r7) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = round + ((-d7) / 360.0d) + (Math.sin(d8) * 0.0053d) + (Math.sin(2.0d * sin2) * (-0.0069d));
        double asin = Math.asin(Math.sin(sin2) * Math.sin(0.4092797040939331d));
        double d9 = 0.01745329238474369d * d6;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(d9) * Math.sin(asin))) / (Math.cos(d9) * Math.cos(asin));
        if (sin4 >= 1.0d) {
            this.f434 = 1;
            this.f432 = -1L;
            this.f433 = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f434 = 0;
            this.f432 = -1L;
            this.f433 = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f432 = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        this.f433 = round2;
        if (round2 >= j5 || this.f432 <= j5) {
            this.f434 = 1;
        } else {
            this.f434 = 0;
        }
    }
}
