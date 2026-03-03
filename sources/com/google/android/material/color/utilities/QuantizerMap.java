package com.google.android.material.color.utilities;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class QuantizerMap {
    Map<Integer, Integer> colorToCount;

    public Map<Integer, Integer> getColorToCount() {
        return this.colorToCount;
    }

    public QuantizerResult quantize(int[] iArr, int i5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i6 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i6));
            int i7 = 1;
            if (num != null) {
                i7 = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i6), Integer.valueOf(i7));
        }
        this.colorToCount = linkedHashMap;
        return new QuantizerResult(linkedHashMap);
    }
}
