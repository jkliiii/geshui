package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static e0 f436;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f437;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final LocationManager f438;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final a f439 = new a();

    /* compiled from: TwilightManager.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f440;

        /* renamed from: ʼ, reason: contains not printable characters */
        long f441;

        a() {
        }
    }

    e0(Context context, LocationManager locationManager) {
        this.f437 = context;
        this.f438 = locationManager;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static e0 m533(Context context) {
        if (f436 == null) {
            Context applicationContext = context.getApplicationContext();
            f436 = new e0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f436;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: ʼ, reason: contains not printable characters */
    private Location m534() {
        Location m535 = androidx.core.content.j.m2033(this.f437, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m535("network") : null;
        Location m5352 = androidx.core.content.j.m2033(this.f437, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m535("gps") : null;
        return (m5352 == null || m535 == null) ? m5352 != null ? m5352 : m535 : m5352.getTime() > m535.getTime() ? m5352 : m535;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Location m535(String str) {
        try {
            if (this.f438.isProviderEnabled(str)) {
                return this.f438.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e5) {
            Log.d("TwilightManager", "Failed to get last known location", e5);
            return null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m536() {
        return this.f439.f441 > System.currentTimeMillis();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m537(Location location) {
        long j5;
        a aVar = this.f439;
        long currentTimeMillis = System.currentTimeMillis();
        d0 m531 = d0.m531();
        m531.m532(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m531.m532(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z5 = m531.f434 == 1;
        long j6 = m531.f433;
        long j7 = m531.f432;
        m531.m532(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j8 = m531.f433;
        if (j6 == -1 || j7 == -1) {
            j5 = 43200000 + currentTimeMillis;
        } else {
            j5 = (currentTimeMillis > j7 ? j8 + 0 : currentTimeMillis > j6 ? j7 + 0 : j6 + 0) + 60000;
        }
        aVar.f440 = z5;
        aVar.f441 = j5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m538() {
        a aVar = this.f439;
        if (m536()) {
            return aVar.f440;
        }
        Location m534 = m534();
        if (m534 != null) {
            m537(m534);
            return aVar.f440;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i5 = Calendar.getInstance().get(11);
        return i5 < 6 || i5 >= 22;
    }
}
