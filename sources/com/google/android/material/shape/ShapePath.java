package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;

    @Deprecated
    public float currentShadowAngle;

    @Deprecated
    public float endShadowAngle;

    @Deprecated
    public float endX;

    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<e> shadowCompatOperations = new ArrayList();

    @Deprecated
    public float startX;

    @Deprecated
    public float startY;

    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();

        @Deprecated
        public float bottom;

        @Deprecated
        public float left;

        @Deprecated
        public float right;

        @Deprecated
        public float startAngle;

        @Deprecated
        public float sweepAngle;

        /* renamed from: top, reason: collision with root package name */
        @Deprecated
        public float f12852top;

        public PathArcOperation(float f5, float f6, float f7, float f8) {
            setLeft(f5);
            setTop(f6);
            setRight(f7);
            setBottom(f8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.f12852top;
        }

        private void setBottom(float f5) {
            this.bottom = f5;
        }

        private void setLeft(float f5) {
            this.left = f5;
        }

        private void setRight(float f5) {
            this.right = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f5) {
            this.startAngle = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f5) {
            this.sweepAngle = f5;
        }

        private void setTop(float f5) {
            this.f12852top = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f5, float f6, float f7, float f8, float f9, float f10) {
            setControlX1(f5);
            setControlY1(f6);
            setControlX2(f7);
            setControlY2(f8);
            setEndX(f9);
            setEndY(f10);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f5) {
            this.controlX1 = f5;
        }

        private void setControlX2(float f5) {
            this.controlX2 = f5;
        }

        private void setControlY1(float f5) {
            this.controlY1 = f5;
        }

        private void setControlY2(float f5) {
            this.controlY2 = f5;
        }

        private void setEndX(float f5) {
            this.endX = f5;
        }

        private void setEndY(float f5) {
            this.endY = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* renamed from: x, reason: collision with root package name */
        private float f12853x;

        /* renamed from: y, reason: collision with root package name */
        private float f12854y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f12853x, this.f12854y);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {

        @Deprecated
        public float controlX;

        @Deprecated
        public float controlY;

        @Deprecated
        public float endX;

        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f5) {
            this.controlX = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f5) {
            this.controlY = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f5) {
            this.endX = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f5) {
            this.endY = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(Matrix matrix, Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    class a extends e {

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ List f6059;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Matrix f6060;

        a(List list, Matrix matrix) {
            this.f6059 = list;
            this.f6060 = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo7170(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            Iterator it = this.f6059.iterator();
            while (it.hasNext()) {
                ((e) it.next()).mo7170(this.f6060, shadowRenderer, i5, canvas);
            }
        }
    }

    static class b extends e {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final PathArcOperation f6062;

        public b(PathArcOperation pathArcOperation) {
            this.f6062 = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.e
        /* renamed from: ʻ */
        public void mo7170(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.f6062.getLeft(), this.f6062.getTop(), this.f6062.getRight(), this.f6062.getBottom()), i5, this.f6062.getStartAngle(), this.f6062.getSweepAngle());
        }
    }

    static class c extends e {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final PathLineOperation f6063;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final PathLineOperation f6064;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final float f6065;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final float f6066;

        public c(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f5, float f6) {
            this.f6063 = pathLineOperation;
            this.f6064 = pathLineOperation2;
            this.f6065 = f5;
            this.f6066 = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.e
        /* renamed from: ʻ */
        public void mo7170(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            ShadowRenderer shadowRenderer2;
            float m7173 = m7173();
            if (m7173 > 0.0f) {
                return;
            }
            double hypot = Math.hypot(this.f6063.f12853x - this.f6065, this.f6063.f12854y - this.f6066);
            double hypot2 = Math.hypot(this.f6064.f12853x - this.f6063.f12853x, this.f6064.f12854y - this.f6063.f12854y);
            float min = (float) Math.min(i5, Math.min(hypot, hypot2));
            double d6 = min;
            double tan = Math.tan(Math.toRadians((-m7173) / 2.0f));
            Double.isNaN(d6);
            double d7 = tan * d6;
            if (hypot > d7) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - d7), 0.0f);
                this.f6071.set(matrix);
                this.f6071.preTranslate(this.f6065, this.f6066);
                this.f6071.preRotate(m7172());
                shadowRenderer2 = shadowRenderer;
                shadowRenderer2.drawEdgeShadow(canvas, this.f6071, rectF, i5);
            } else {
                shadowRenderer2 = shadowRenderer;
            }
            float f5 = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f5, f5);
            this.f6071.set(matrix);
            this.f6071.preTranslate(this.f6063.f12853x, this.f6063.f12854y);
            this.f6071.preRotate(m7172());
            Matrix matrix2 = this.f6071;
            Double.isNaN(d6);
            matrix2.preTranslate((float) ((-d7) - d6), (-2.0f) * min);
            Double.isNaN(d6);
            shadowRenderer.drawInnerCornerShadow(canvas, this.f6071, rectF2, (int) min, 450.0f, m7173, new float[]{(float) (d6 + d7), f5});
            if (hypot2 > d7) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - d7), 0.0f);
                this.f6071.set(matrix);
                this.f6071.preTranslate(this.f6063.f12853x, this.f6063.f12854y);
                this.f6071.preRotate(m7171());
                this.f6071.preTranslate((float) d7, 0.0f);
                shadowRenderer2.drawEdgeShadow(canvas, this.f6071, rectF3, i5);
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        float m7171() {
            return (float) Math.toDegrees(Math.atan((this.f6064.f12854y - this.f6063.f12854y) / (this.f6064.f12853x - this.f6063.f12853x)));
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        float m7172() {
            return (float) Math.toDegrees(Math.atan((this.f6063.f12854y - this.f6066) / (this.f6063.f12853x - this.f6065)));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        float m7173() {
            float m7171 = ((m7171() - m7172()) + 360.0f) % 360.0f;
            return m7171 <= ShapePath.ANGLE_LEFT ? m7171 : m7171 - 360.0f;
        }
    }

    static class d extends e {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final PathLineOperation f6067;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final float f6068;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final float f6069;

        public d(PathLineOperation pathLineOperation, float f5, float f6) {
            this.f6067 = pathLineOperation;
            this.f6068 = f5;
            this.f6069 = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.e
        /* renamed from: ʻ */
        public void mo7170(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f6067.f12854y - this.f6069, this.f6067.f12853x - this.f6068), 0.0f);
            this.f6071.set(matrix);
            this.f6071.preTranslate(this.f6068, this.f6069);
            this.f6071.preRotate(m7174());
            shadowRenderer.drawEdgeShadow(canvas, this.f6071, rectF, i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        float m7174() {
            return (float) Math.toDegrees(Math.atan((this.f6067.f12854y - this.f6069) / (this.f6067.f12853x - this.f6068)));
        }
    }

    static abstract class e {

        /* renamed from: ʼ, reason: contains not printable characters */
        static final Matrix f6070 = new Matrix();

        /* renamed from: ʻ, reason: contains not printable characters */
        final Matrix f6071 = new Matrix();

        e() {
        }

        /* renamed from: ʻ */
        public abstract void mo7170(Matrix matrix, ShadowRenderer shadowRenderer, int i5, Canvas canvas);

        /* renamed from: ʼ, reason: contains not printable characters */
        public final void m7175(ShadowRenderer shadowRenderer, int i5, Canvas canvas) {
            mo7170(f6070, shadowRenderer, i5, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f5) {
        if (getCurrentShadowAngle() == f5) {
            return;
        }
        float currentShadowAngle = ((f5 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > ANGLE_LEFT) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new b(pathArcOperation));
        setCurrentShadowAngle(f5);
    }

    private void addShadowCompatOperation(e eVar, float f5, float f6) {
        addConnectingShadowIfNecessary(f5);
        this.shadowCompatOperations.add(eVar);
        setCurrentShadowAngle(f6);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f5) {
        this.currentShadowAngle = f5;
    }

    private void setEndShadowAngle(float f5) {
        this.endShadowAngle = f5;
    }

    private void setEndX(float f5) {
        this.endX = f5;
    }

    private void setEndY(float f5) {
        this.endY = f5;
    }

    private void setStartX(float f5) {
        this.startX = f5;
    }

    private void setStartY(float f5) {
        this.startY = f5;
    }

    public void addArc(float f5, float f6, float f7, float f8, float f9, float f10) {
        PathArcOperation pathArcOperation = new PathArcOperation(f5, f6, f7, f8);
        pathArcOperation.setStartAngle(f9);
        pathArcOperation.setSweepAngle(f10);
        this.operations.add(pathArcOperation);
        b bVar = new b(pathArcOperation);
        float f11 = f9 + f10;
        boolean z5 = f10 < 0.0f;
        if (z5) {
            f9 = (f9 + ANGLE_LEFT) % 360.0f;
        }
        addShadowCompatOperation(bVar, f9, z5 ? (ANGLE_LEFT + f11) % 360.0f : f11);
        double d6 = f11;
        setEndX(((f5 + f7) * 0.5f) + (((f7 - f5) / 2.0f) * ((float) Math.cos(Math.toRadians(d6)))));
        setEndY(((f6 + f8) * 0.5f) + (((f8 - f6) / 2.0f) * ((float) Math.sin(Math.toRadians(d6)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.operations.get(i5).applyToPath(matrix, path);
        }
    }

    boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    e createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        return new a(new ArrayList(this.shadowCompatOperations), new Matrix(matrix));
    }

    public void cubicToPoint(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.operations.add(new PathCubicOperation(f5, f6, f7, f8, f9, f10));
        this.containsIncompatibleShadowOp = true;
        setEndX(f9);
        setEndY(f10);
    }

    float getEndX() {
        return this.endX;
    }

    float getEndY() {
        return this.endY;
    }

    float getStartX() {
        return this.startX;
    }

    float getStartY() {
        return this.startY;
    }

    public void lineTo(float f5, float f6) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f12853x = f5;
        pathLineOperation.f12854y = f6;
        this.operations.add(pathLineOperation);
        d dVar = new d(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(dVar, dVar.m7174() + ANGLE_UP, dVar.m7174() + ANGLE_UP);
        setEndX(f5);
        setEndY(f6);
    }

    public void quadToPoint(float f5, float f6, float f7, float f8) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f5);
        pathQuadOperation.setControlY(f6);
        pathQuadOperation.setEndX(f7);
        pathQuadOperation.setEndY(f8);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f7);
        setEndY(f8);
    }

    public void reset(float f5, float f6) {
        reset(f5, f6, ANGLE_UP, 0.0f);
    }

    public void reset(float f5, float f6, float f7, float f8) {
        setStartX(f5);
        setStartY(f6);
        setEndX(f5);
        setEndY(f6);
        setCurrentShadowAngle(f7);
        setEndShadowAngle((f7 + f8) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f5, float f6) {
        reset(f5, f6);
    }

    public void lineTo(float f5, float f6, float f7, float f8) {
        if ((Math.abs(f5 - getEndX()) < 0.001f && Math.abs(f6 - getEndY()) < 0.001f) || (Math.abs(f5 - f7) < 0.001f && Math.abs(f6 - f8) < 0.001f)) {
            lineTo(f7, f8);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f12853x = f5;
        pathLineOperation.f12854y = f6;
        this.operations.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f12853x = f7;
        pathLineOperation2.f12854y = f8;
        this.operations.add(pathLineOperation2);
        c cVar = new c(pathLineOperation, pathLineOperation2, getEndX(), getEndY());
        if (cVar.m7173() > 0.0f) {
            lineTo(f5, f6);
            lineTo(f7, f8);
        } else {
            addShadowCompatOperation(cVar, cVar.m7172() + ANGLE_UP, cVar.m7171() + ANGLE_UP);
            setEndX(f7);
            setEndY(f8);
        }
    }
}
