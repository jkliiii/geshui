package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: E:\78999\cookie_5123796.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2670 = aVar.m5539(iconCompat.f2670, 1);
        iconCompat.f2672 = aVar.m5531(iconCompat.f2672, 2);
        iconCompat.f2673 = aVar.m5542(iconCompat.f2673, 3);
        iconCompat.f2674 = aVar.m5539(iconCompat.f2674, 4);
        iconCompat.f2675 = aVar.m5539(iconCompat.f2675, 5);
        iconCompat.f2676 = (ColorStateList) aVar.m5542(iconCompat.f2676, 6);
        iconCompat.f2678 = aVar.m5545(iconCompat.f2678, 7);
        iconCompat.f2679 = aVar.m5545(iconCompat.f2679, 8);
        iconCompat.m2182();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.m5549(true, true);
        iconCompat.m2183(aVar.m5523());
        int i5 = iconCompat.f2670;
        if (-1 != i5) {
            aVar.m5522(i5, 1);
        }
        byte[] bArr = iconCompat.f2672;
        if (bArr != null) {
            aVar.m5543(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2673;
        if (parcelable != null) {
            aVar.m5538(parcelable, 3);
        }
        int i6 = iconCompat.f2674;
        if (i6 != 0) {
            aVar.m5522(i6, 4);
        }
        int i7 = iconCompat.f2675;
        if (i7 != 0) {
            aVar.m5522(i7, 5);
        }
        ColorStateList colorStateList = iconCompat.f2676;
        if (colorStateList != null) {
            aVar.m5538(colorStateList, 6);
        }
        String str = iconCompat.f2678;
        if (str != null) {
            aVar.m5528(str, 7);
        }
        String str2 = iconCompat.f2679;
        if (str2 != null) {
            aVar.m5528(str2, 8);
        }
    }
}
