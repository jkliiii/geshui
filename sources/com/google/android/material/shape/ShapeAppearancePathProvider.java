package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ShapeAppearancePathProvider {
    private final ShapePath[] cornerPaths = new ShapePath[4];
    private final Matrix[] cornerTransforms = new Matrix[4];
    private final Matrix[] edgeTransforms = new Matrix[4];
    private final PointF pointF = new PointF();
    private final Path overlappedEdgePath = new Path();
    private final Path boundsPath = new Path();
    private final ShapePath shapePath = new ShapePath();
    private final float[] scratch = new float[2];
    private final float[] scratch2 = new float[2];
    private final Path edgePath = new Path();
    private final Path cornerPath = new Path();
    private boolean edgeIntersectionCheckEnabled = true;

    public interface PathListener {
        void onCornerPathCreated(ShapePath shapePath, Matrix matrix, int i5);

        void onEdgePathCreated(ShapePath shapePath, Matrix matrix, int i5);
    }

    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final ShapeAppearancePathProvider f6053 = new ShapeAppearancePathProvider();
    }

    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final ShapeAppearanceModel f6054;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final Path f6055;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final RectF f6056;

        /* renamed from: ʾ, reason: contains not printable characters */
        public final PathListener f6057;

        /* renamed from: ʿ, reason: contains not printable characters */
        public final float f6058;

        b(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, PathListener pathListener, Path path) {
            this.f6057 = pathListener;
            this.f6054 = shapeAppearanceModel;
            this.f6058 = f5;
            this.f6056 = rectF;
            this.f6055 = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i5 = 0; i5 < 4; i5++) {
            this.cornerPaths[i5] = new ShapePath();
            this.cornerTransforms[i5] = new Matrix();
            this.edgeTransforms[i5] = new Matrix();
        }
    }

    private float angleOfEdge(int i5) {
        return ((i5 + 1) % 4) * 90;
    }

    private void appendCornerPath(b bVar, int i5) {
        this.scratch[0] = this.cornerPaths[i5].getStartX();
        this.scratch[1] = this.cornerPaths[i5].getStartY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        if (i5 == 0) {
            Path path = bVar.f6055;
            float[] fArr = this.scratch;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f6055;
            float[] fArr2 = this.scratch;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.cornerPaths[i5].applyToPath(this.cornerTransforms[i5], bVar.f6055);
        PathListener pathListener = bVar.f6057;
        if (pathListener != null) {
            pathListener.onCornerPathCreated(this.cornerPaths[i5], this.cornerTransforms[i5], i5);
        }
    }

    private void appendEdgePath(b bVar, int i5) {
        int i6 = (i5 + 1) % 4;
        this.scratch[0] = this.cornerPaths[i5].getEndX();
        this.scratch[1] = this.cornerPaths[i5].getEndY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[i6].getStartX();
        this.scratch2[1] = this.cornerPaths[i6].getStartY();
        this.cornerTransforms[i6].mapPoints(this.scratch2);
        float f5 = this.scratch[0];
        float[] fArr = this.scratch2;
        float max = Math.max(((float) Math.hypot(f5 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float edgeCenterForIndex = getEdgeCenterForIndex(bVar.f6056, i5);
        this.shapePath.reset(0.0f, 0.0f);
        EdgeTreatment edgeTreatmentForIndex = getEdgeTreatmentForIndex(i5, bVar.f6054);
        edgeTreatmentForIndex.getEdgePath(max, edgeCenterForIndex, bVar.f6058, this.shapePath);
        this.edgePath.reset();
        this.shapePath.applyToPath(this.edgeTransforms[i5], this.edgePath);
        if (this.edgeIntersectionCheckEnabled && (edgeTreatmentForIndex.forceIntersection() || pathOverlapsCorner(this.edgePath, i5) || pathOverlapsCorner(this.edgePath, i6))) {
            Path path = this.edgePath;
            path.op(path, this.boundsPath, Path.Op.DIFFERENCE);
            this.scratch[0] = this.shapePath.getStartX();
            this.scratch[1] = this.shapePath.getStartY();
            this.edgeTransforms[i5].mapPoints(this.scratch);
            Path path2 = this.overlappedEdgePath;
            float[] fArr2 = this.scratch;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.shapePath.applyToPath(this.edgeTransforms[i5], this.overlappedEdgePath);
        } else {
            this.shapePath.applyToPath(this.edgeTransforms[i5], bVar.f6055);
        }
        PathListener pathListener = bVar.f6057;
        if (pathListener != null) {
            pathListener.onEdgePathCreated(this.shapePath, this.edgeTransforms[i5], i5);
        }
    }

    private void getCoordinatesOfCorner(int i5, RectF rectF, PointF pointF) {
        if (i5 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i5 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i5 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private CornerSize getCornerSizeForIndex(int i5, ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getTopRightCornerSize() : shapeAppearanceModel.getTopLeftCornerSize() : shapeAppearanceModel.getBottomLeftCornerSize() : shapeAppearanceModel.getBottomRightCornerSize();
    }

    private CornerTreatment getCornerTreatmentForIndex(int i5, ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getTopRightCorner() : shapeAppearanceModel.getTopLeftCorner() : shapeAppearanceModel.getBottomLeftCorner() : shapeAppearanceModel.getBottomRightCorner();
    }

    private float getEdgeCenterForIndex(RectF rectF, int i5) {
        float[] fArr = this.scratch;
        ShapePath shapePath = this.cornerPaths[i5];
        fArr[0] = shapePath.endX;
        fArr[1] = shapePath.endY;
        this.cornerTransforms[i5].mapPoints(fArr);
        return (i5 == 1 || i5 == 3) ? Math.abs(rectF.centerX() - this.scratch[0]) : Math.abs(rectF.centerY() - this.scratch[1]);
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int i5, ShapeAppearanceModel shapeAppearanceModel) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? shapeAppearanceModel.getRightEdge() : shapeAppearanceModel.getTopEdge() : shapeAppearanceModel.getLeftEdge() : shapeAppearanceModel.getBottomEdge();
    }

    public static ShapeAppearancePathProvider getInstance() {
        return a.f6053;
    }

    private boolean pathOverlapsCorner(Path path, int i5) {
        this.cornerPath.reset();
        this.cornerPaths[i5].applyToPath(this.cornerTransforms[i5], this.cornerPath);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.cornerPath.computeBounds(rectF, true);
        path.op(this.cornerPath, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void setCornerPathAndTransform(b bVar, int i5) {
        getCornerTreatmentForIndex(i5, bVar.f6054).getCornerPath(this.cornerPaths[i5], 90.0f, bVar.f6058, bVar.f6056, getCornerSizeForIndex(i5, bVar.f6054));
        float angleOfEdge = angleOfEdge(i5);
        this.cornerTransforms[i5].reset();
        getCoordinatesOfCorner(i5, bVar.f6056, this.pointF);
        Matrix matrix = this.cornerTransforms[i5];
        PointF pointF = this.pointF;
        matrix.setTranslate(pointF.x, pointF.y);
        this.cornerTransforms[i5].preRotate(angleOfEdge);
    }

    private void setEdgePathAndTransform(int i5) {
        this.scratch[0] = this.cornerPaths[i5].getEndX();
        this.scratch[1] = this.cornerPaths[i5].getEndY();
        this.cornerTransforms[i5].mapPoints(this.scratch);
        float angleOfEdge = angleOfEdge(i5);
        this.edgeTransforms[i5].reset();
        Matrix matrix = this.edgeTransforms[i5];
        float[] fArr = this.scratch;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.edgeTransforms[i5].preRotate(angleOfEdge);
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, Path path) {
        calculatePath(shapeAppearanceModel, f5, rectF, null, path);
    }

    void setEdgeIntersectionCheckEnable(boolean z5) {
        this.edgeIntersectionCheckEnabled = z5;
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float f5, RectF rectF, PathListener pathListener, Path path) {
        path.rewind();
        this.overlappedEdgePath.rewind();
        this.boundsPath.rewind();
        this.boundsPath.addRect(rectF, Path.Direction.CW);
        b bVar = new b(shapeAppearanceModel, f5, rectF, pathListener, path);
        for (int i5 = 0; i5 < 4; i5++) {
            setCornerPathAndTransform(bVar, i5);
            setEdgePathAndTransform(i5);
        }
        for (int i6 = 0; i6 < 4; i6++) {
            appendCornerPath(bVar, i6);
            appendEdgePath(bVar, i6);
        }
        path.close();
        this.overlappedEdgePath.close();
        if (this.overlappedEdgePath.isEmpty()) {
            return;
        }
        path.op(this.overlappedEdgePath, Path.Op.UNION);
    }
}
