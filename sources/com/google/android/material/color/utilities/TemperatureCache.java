package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class TemperatureCache {
    private final Hct input;
    private Hct precomputedComplement;
    private List<Hct> precomputedHctsByHue;
    private List<Hct> precomputedHctsByTemp;
    private Map<Hct, Double> precomputedTempsByHct;

    private TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    private Hct getColdest() {
        return getHctsByTemp().get(0);
    }

    private List<Hct> getHctsByHue() {
        List<Hct> list = this.precomputedHctsByHue;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d6 = 0.0d; d6 <= 360.0d; d6 += 1.0d) {
            arrayList.add(Hct.from(d6, this.input.getChroma(), this.input.getTone()));
        }
        List<Hct> unmodifiableList = Collections.unmodifiableList(arrayList);
        this.precomputedHctsByHue = unmodifiableList;
        return unmodifiableList;
    }

    private List<Hct> getHctsByTemp() {
        List<Hct> list = this.precomputedHctsByTemp;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: com.google.android.material.color.utilities.s5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f5589.lambda$getHctsByTemp$0((Hct) obj);
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.t5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.precomputedHctsByTemp = arrayList;
        return arrayList;
    }

    private Map<Hct, Double> getTempsByHct() {
        Map<Hct, Double> map = this.precomputedTempsByHct;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(getHctsByHue());
        arrayList.add(this.input);
        HashMap hashMap = new HashMap();
        for (Hct hct : arrayList) {
            hashMap.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.precomputedTempsByHct = hashMap;
        return hashMap;
    }

    private Hct getWarmest() {
        return getHctsByTemp().get(getHctsByTemp().size() - 1);
    }

    private static boolean isBetween(double d6, double d7, double d8) {
        return d7 < d8 ? d7 <= d6 && d6 <= d8 : d7 <= d6 || d6 <= d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$getHctsByTemp$0(Hct hct) {
        return getTempsByHct().get(hct);
    }

    public static double rawTemperature(Hct hct) {
        double[] labFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return ((Math.pow(Math.hypot(labFromArgb[1], labFromArgb[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(labFromArgb[2], labFromArgb[1]))) - 50.0d)))) - 0.5d;
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        Hct hct = this.precomputedComplement;
        if (hct != null) {
            return hct;
        }
        double hue = getColdest().getHue();
        double doubleValue = getTempsByHct().get(getColdest()).doubleValue();
        double hue2 = getWarmest().getHue();
        double doubleValue2 = getTempsByHct().get(getWarmest()).doubleValue() - doubleValue;
        boolean isBetween = isBetween(this.input.getHue(), hue, hue2);
        double d6 = isBetween ? hue2 : hue;
        if (!isBetween) {
            hue = hue2;
        }
        Hct hct2 = getHctsByHue().get((int) Math.round(this.input.getHue()));
        double relativeTemperature = 1.0d - getRelativeTemperature(this.input);
        double d7 = 1000.0d;
        for (double d8 = 0.0d; d8 <= 360.0d; d8 += 1.0d) {
            double sanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble(d6 + (1.0d * d8));
            if (isBetween(sanitizeDegreesDouble, d6, hue)) {
                Hct hct3 = getHctsByHue().get((int) Math.round(sanitizeDegreesDouble));
                double abs = Math.abs(relativeTemperature - ((getTempsByHct().get(hct3).doubleValue() - doubleValue) / doubleValue2));
                if (abs < d7) {
                    hct2 = hct3;
                    d7 = abs;
                }
            }
        }
        this.precomputedComplement = hct2;
        return hct2;
    }

    public double getRelativeTemperature(Hct hct) {
        double doubleValue = getTempsByHct().get(getWarmest()).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        double doubleValue2 = getTempsByHct().get(hct).doubleValue() - getTempsByHct().get(getColdest()).doubleValue();
        if (doubleValue == 0.0d) {
            return 0.5d;
        }
        return doubleValue2 / doubleValue;
    }

    public List<Hct> getAnalogousColors(int i5, int i6) {
        int round = (int) Math.round(this.input.getHue());
        Hct hct = getHctsByHue().get(round);
        double relativeTemperature = getRelativeTemperature(hct);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct);
        double d6 = 0.0d;
        double d7 = 0.0d;
        int i7 = 0;
        while (i7 < 360) {
            double relativeTemperature2 = getRelativeTemperature(getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i7)));
            d7 += Math.abs(relativeTemperature2 - relativeTemperature);
            i7++;
            relativeTemperature = relativeTemperature2;
        }
        double d8 = i6;
        Double.isNaN(d8);
        double d9 = d7 / d8;
        double relativeTemperature3 = getRelativeTemperature(hct);
        int i8 = 1;
        while (true) {
            if (arrayList.size() >= i6) {
                break;
            }
            Hct hct2 = getHctsByHue().get(MathUtils.sanitizeDegreesInt(round + i8));
            double relativeTemperature4 = getRelativeTemperature(hct2);
            d6 += Math.abs(relativeTemperature4 - relativeTemperature3);
            double size = arrayList.size();
            Double.isNaN(size);
            boolean z5 = d6 >= size * d9;
            int i9 = 1;
            while (z5 && arrayList.size() < i6) {
                arrayList.add(hct2);
                double size2 = arrayList.size() + i9;
                Double.isNaN(size2);
                z5 = d6 >= size2 * d9;
                i9++;
            }
            i8++;
            if (i8 > 360) {
                while (arrayList.size() < i6) {
                    arrayList.add(hct2);
                }
            } else {
                relativeTemperature3 = relativeTemperature4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.input);
        double d10 = i5;
        Double.isNaN(d10);
        int floor = (int) Math.floor((d10 - 1.0d) / 2.0d);
        for (int i10 = 1; i10 < floor + 1; i10++) {
            int i11 = 0 - i10;
            while (i11 < 0) {
                i11 += arrayList.size();
            }
            if (i11 >= arrayList.size()) {
                i11 %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(i11));
        }
        int i12 = (i5 - floor) - 1;
        for (int i13 = 1; i13 < i12 + 1; i13++) {
            int i14 = i13;
            while (i14 < 0) {
                i14 += arrayList.size();
            }
            if (i14 >= arrayList.size()) {
                i14 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(i14));
        }
        return arrayList2;
    }

    public TemperatureCache(Hct hct) {
        this.input = hct;
    }
}
