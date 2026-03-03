package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    public static final class Builder {
        private EdgeTreatment bottomEdge;
        private CornerTreatment bottomLeftCorner;
        private CornerSize bottomLeftCornerSize;
        private CornerTreatment bottomRightCorner;
        private CornerSize bottomRightCornerSize;
        private EdgeTreatment leftEdge;
        private EdgeTreatment rightEdge;
        private EdgeTreatment topEdge;
        private CornerTreatment topLeftCorner;
        private CornerSize topLeftCornerSize;
        private CornerTreatment topRightCorner;
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        public Builder setAllCorners(int i5, float f5) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i5)).setAllCornerSizes(f5);
        }

        @CanIgnoreReturnValue
        public Builder setAllEdges(EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @CanIgnoreReturnValue
        public Builder setBottomEdge(EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i5, float f5) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i5)).setBottomLeftCornerSize(f5);
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(float f5) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f5);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i5, float f5) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i5)).setBottomRightCornerSize(f5);
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(float f5) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f5);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLeftEdge(EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRightEdge(EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopEdge(EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i5, float f5) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i5)).setTopLeftCornerSize(f5);
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(float f5) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f5);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i5, float f5) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i5)).setTopRightCornerSize(f5);
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(float f5) {
            this.topRightCornerSize = new AbsoluteCornerSize(f5);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCornerSize(CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCornerSize(CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCornerSize(CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCornerSize(CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setAllCorners(CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(int i5, CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i5)).setBottomLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(int i5, CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i5)).setBottomRightCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(int i5, CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i5)).setTopLeftCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(int i5, CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i5)).setTopRightCornerSize(cornerSize);
        }

        @CanIgnoreReturnValue
        public Builder setAllCornerSizes(float f5) {
            return setTopLeftCornerSize(f5).setTopRightCornerSize(f5).setBottomRightCornerSize(f5).setBottomLeftCornerSize(f5);
        }

        @CanIgnoreReturnValue
        public Builder setBottomLeftCorner(CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBottomRightCorner(CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopLeftCorner(CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTopRightCorner(CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float compatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (compatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(compatCornerTreatmentSize);
            }
            return this;
        }

        public Builder(ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }
    }

    public interface CornerSizeUnaryOperator {
        CornerSize apply(CornerSize cornerSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static CornerSize getCornerSize(TypedArray typedArray, int i5, CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i5);
        if (peekValue == null) {
            return cornerSize;
        }
        int i6 = peekValue.type;
        return i6 == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i6 == 6 ? new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    public boolean isRoundRect(RectF rectF) {
        boolean z5 = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z5 && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public ShapeAppearanceModel withCornerSize(float f5) {
        return toBuilder().setAllCornerSizes(f5).build();
    }

    public ShapeAppearanceModel withTransformedCornerSizes(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i5, int i6) {
        return builder(context, attributeSet, i5, i6, 0);
    }

    public ShapeAppearanceModel withCornerSize(CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i5, int i6, int i7) {
        return builder(context, attributeSet, i5, i6, new AbsoluteCornerSize(i7));
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i5, int i6, CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i5, i6);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, cornerSize);
    }

    public static Builder builder(Context context, int i5, int i6) {
        return builder(context, i5, i6, 0);
    }

    private static Builder builder(Context context, int i5, int i6, int i7) {
        return builder(context, i5, i6, new AbsoluteCornerSize(i7));
    }

    private static Builder builder(Context context, int i5, int i6, CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i5);
        if (i6 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i6);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R.styleable.ShapeAppearance);
        try {
            int i7 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
            int i8 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i7);
            int i9 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i7);
            int i10 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i7);
            int i11 = obtainStyledAttributes.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i7);
            CornerSize cornerSize2 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize cornerSize3 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
            CornerSize cornerSize4 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
            CornerSize cornerSize5 = getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2);
            return new Builder().setTopLeftCorner(i8, cornerSize3).setTopRightCorner(i9, cornerSize4).setBottomRightCorner(i10, cornerSize5).setBottomLeftCorner(i11, getCornerSize(obtainStyledAttributes, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }
}
