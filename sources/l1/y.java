package l1;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: HardwareConfigState.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class y {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final boolean f9015;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final boolean f9016;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final File f9017;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static volatile y f9018;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f9020;

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f9021 = true;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final AtomicBoolean f9022 = new AtomicBoolean(false);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f9019 = 20000;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f9015 = i5 < 29;
        f9016 = i5 >= 28;
        f9017 = new File("/proc/self/fd");
    }

    y() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m9711() {
        return f9015 && !this.f9022.get();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static y m9712() {
        if (f9018 == null) {
            synchronized (y.class) {
                if (f9018 == null) {
                    f9018 = new y();
                }
            }
        }
        return f9018;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m9713() {
        if (m9715()) {
            return 500;
        }
        return this.f9019;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private synchronized boolean m9714() {
        boolean z5 = true;
        int i5 = this.f9020 + 1;
        this.f9020 = i5;
        if (i5 >= 50) {
            this.f9020 = 0;
            int length = f9017.list().length;
            long m9713 = m9713();
            if (length >= m9713) {
                z5 = false;
            }
            this.f9021 = z5;
            if (!z5 && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + m9713);
            }
        }
        return this.f9021;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean m9715() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m9716(int i5, int i6, boolean z5, boolean z6) {
        if (!z5) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f9016) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (m9711()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z6) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i5 < 0 || i6 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (m9714()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    @TargetApi(26)
    /* renamed from: ˈ, reason: contains not printable characters */
    boolean m9717(int i5, int i6, BitmapFactory.Options options, boolean z5, boolean z6) {
        boolean m9716 = m9716(i5, i6, z5, z6);
        if (m9716) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return m9716;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m9718() {
        y1.l.m12895();
        this.f9022.set(true);
    }
}
