package com.google.android.material.color;

import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: E:\78999\cookie_5123796.dex */
public class HarmonizedColorsOptions {
    private final int colorAttributeToHarmonizeWith;
    private final HarmonizedColorAttributes colorAttributes;
    private final int[] colorResourceIds;

    public static class Builder {
        private HarmonizedColorAttributes colorAttributes;
        private int[] colorResourceIds = new int[0];
        private int colorAttributeToHarmonizeWith = R.attr.colorPrimary;

        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @CanIgnoreReturnValue
        public Builder setColorAttributeToHarmonizeWith(int i5) {
            this.colorAttributeToHarmonizeWith = i5;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorAttributes(HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setColorResourceIds(int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }
    }

    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    int getThemeOverlayResourceId(int i5) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i5 : this.colorAttributes.getThemeOverlay();
    }

    private HarmonizedColorsOptions(Builder builder) {
        this.colorResourceIds = builder.colorResourceIds;
        this.colorAttributes = builder.colorAttributes;
        this.colorAttributeToHarmonizeWith = builder.colorAttributeToHarmonizeWith;
    }
}
