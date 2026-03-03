package z2;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import java.io.File;
import x2.b0;

/* compiled from: BitmapInfo.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Point f12769;

    /* renamed from: ʽ, reason: contains not printable characters */
    public long f12771;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final String f12772;

    /* renamed from: ʿ, reason: contains not printable characters */
    public b0 f12773;

    /* renamed from: ˆ, reason: contains not printable characters */
    public final Bitmap f12774;

    /* renamed from: ˈ, reason: contains not printable characters */
    public Exception f12775;

    /* renamed from: ˉ, reason: contains not printable characters */
    public e3.a f12776;

    /* renamed from: ˊ, reason: contains not printable characters */
    public BitmapRegionDecoder f12777;

    /* renamed from: ˋ, reason: contains not printable characters */
    public File f12778;

    /* renamed from: ˎ, reason: contains not printable characters */
    public final String f12779;

    /* renamed from: ʼ, reason: contains not printable characters */
    public long f12770 = System.currentTimeMillis();

    /* renamed from: ˏ, reason: contains not printable characters */
    public final v2.j f12780 = new v2.j();

    public b(String str, String str2, Bitmap bitmap, Point point) {
        this.f12769 = point;
        this.f12774 = bitmap;
        this.f12772 = str;
        this.f12779 = str2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m13152() {
        Bitmap bitmap = this.f12774;
        if (bitmap != null) {
            return bitmap.getRowBytes() * this.f12774.getHeight();
        }
        e3.a aVar = this.f12776;
        if (aVar != null) {
            return aVar.m8466();
        }
        return 0;
    }
}
