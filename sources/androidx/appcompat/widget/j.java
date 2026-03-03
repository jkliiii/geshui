package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.r2;

/* compiled from: AppCompatDrawableManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final PorterDuff.Mode f1343 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static j f1344;

    /* renamed from: ʻ, reason: contains not printable characters */
    private r2 f1345;

    /* compiled from: AppCompatDrawableManager.java */
    class a implements r2.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int[] f1346 = {e.e.f6979, e.e.f6977, e.e.f6952};

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int[] f1347 = {e.e.f6980, e.e.f6986, e.e.f6989, e.e.f6982, e.e.f6983, e.e.f6987, e.e.f6985};

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int[] f1348 = {e.e.f6973, e.e.f6990, e.e.f6972, e.e.f6965, e.e.f6971, e.e.f6969, e.e.f6975};

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int[] f1349 = {e.e.f6993, e.e.f6968, e.e.f6992};

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int[] f1350 = {e.e.f6967, e.e.f6988};

        /* renamed from: ˆ, reason: contains not printable characters */
        private final int[] f1351 = {e.e.f6956, e.e.f6964, e.e.f6958, e.e.f6966};

        a() {
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m1383(int[] iArr, int i5) {
            for (int i6 : iArr) {
                if (i6 == i5) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private ColorStateList m1384(Context context) {
            return m1385(context, 0);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private ColorStateList m1385(Context context, int i5) {
            int m1652 = y2.m1652(context, e.a.f6924);
            return new ColorStateList(new int[][]{y2.f1532, y2.f1535, y2.f1533, y2.f1539}, new int[]{y2.m1651(context, e.a.f6922), androidx.core.graphics.g0.m2275(m1652, i5), androidx.core.graphics.g0.m2275(m1652, i5), i5});
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private ColorStateList m1386(Context context) {
            return m1385(context, y2.m1652(context, e.a.f6920));
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private ColorStateList m1387(Context context) {
            return m1385(context, y2.m1652(context, e.a.f6922));
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private ColorStateList m1388(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i5 = e.a.f6927;
            ColorStateList m1654 = y2.m1654(context, i5);
            if (m1654 == null || !m1654.isStateful()) {
                iArr[0] = y2.f1532;
                iArr2[0] = y2.m1651(context, i5);
                iArr[1] = y2.f1536;
                iArr2[1] = y2.m1652(context, e.a.f6923);
                iArr[2] = y2.f1539;
                iArr2[2] = y2.m1652(context, i5);
            } else {
                int[] iArr3 = y2.f1532;
                iArr[0] = iArr3;
                iArr2[0] = m1654.getColorForState(iArr3, 0);
                iArr[1] = y2.f1536;
                iArr2[1] = y2.m1652(context, e.a.f6923);
                iArr[2] = y2.f1539;
                iArr2[2] = m1654.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private LayerDrawable m1389(r2 r2Var, Context context, int i5) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i5);
            Drawable m1531 = r2Var.m1531(context, e.e.f6961);
            Drawable m15312 = r2Var.m1531(context, e.e.f6959);
            if ((m1531 instanceof BitmapDrawable) && m1531.getIntrinsicWidth() == dimensionPixelSize && m1531.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) m1531;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                m1531.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m1531.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((m15312 instanceof BitmapDrawable) && m15312.getIntrinsicWidth() == dimensionPixelSize && m15312.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) m15312;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                m15312.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                m15312.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private void m1390(Drawable drawable, int i5, PorterDuff.Mode mode) {
            if (b2.m1142(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1343;
            }
            drawable.setColorFilter(j.m1376(i5, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.r2.f
        /* renamed from: ʻ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo1391(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.j.m1374()
                int[] r1 = r6.f1346
                boolean r1 = r6.m1383(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = e.a.f6925
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f1348
                boolean r1 = r6.m1383(r1, r8)
                if (r1 == 0) goto L20
                int r8 = e.a.f6923
                goto L11
            L20:
                int[] r1 = r6.f1349
                boolean r1 = r6.m1383(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = e.e.f6991
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = e.e.f6974
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = androidx.appcompat.widget.b2.m1142(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = androidx.appcompat.widget.y2.m1652(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.j.m1376(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.a.mo1391(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.r2.f
        /* renamed from: ʼ, reason: contains not printable characters */
        public PorterDuff.Mode mo1392(int i5) {
            if (i5 == e.e.f6981) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r2.f
        /* renamed from: ʽ, reason: contains not printable characters */
        public Drawable mo1393(r2 r2Var, Context context, int i5) {
            if (i5 == e.e.f6970) {
                return new LayerDrawable(new Drawable[]{r2Var.m1531(context, e.e.f6968), r2Var.m1531(context, e.e.f6972)});
            }
            if (i5 == e.e.f6995) {
                return m1389(r2Var, context, e.d.f6945);
            }
            if (i5 == e.e.f6994) {
                return m1389(r2Var, context, e.d.f6946);
            }
            if (i5 == e.e.f6996) {
                return m1389(r2Var, context, e.d.f6947);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r2.f
        /* renamed from: ʾ, reason: contains not printable characters */
        public ColorStateList mo1394(Context context, int i5) {
            if (i5 == e.e.f6976) {
                return f.a.m8474(context, e.c.f6933);
            }
            if (i5 == e.e.f6963) {
                return f.a.m8474(context, e.c.f6936);
            }
            if (i5 == e.e.f6981) {
                return m1388(context);
            }
            if (i5 == e.e.f6962) {
                return m1387(context);
            }
            if (i5 == e.e.f6954) {
                return m1384(context);
            }
            if (i5 == e.e.f6960) {
                return m1386(context);
            }
            if (i5 == e.e.f6957 || i5 == e.e.f6955) {
                return f.a.m8474(context, e.c.f6935);
            }
            if (m1383(this.f1347, i5)) {
                return y2.m1654(context, e.a.f6925);
            }
            if (m1383(this.f1350, i5)) {
                return f.a.m8474(context, e.c.f6932);
            }
            if (m1383(this.f1351, i5)) {
                return f.a.m8474(context, e.c.f6931);
            }
            if (i5 == e.e.f6984) {
                return f.a.m8474(context, e.c.f6934);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.r2.f
        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean mo1395(Context context, int i5, Drawable drawable) {
            if (i5 == e.e.f6953) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i6 = e.a.f6925;
                m1390(findDrawableByLayerId, y2.m1652(context, i6), j.f1343);
                m1390(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), y2.m1652(context, i6), j.f1343);
                m1390(layerDrawable.findDrawableByLayerId(R.id.progress), y2.m1652(context, e.a.f6923), j.f1343);
                return true;
            }
            if (i5 != e.e.f6995 && i5 != e.e.f6994 && i5 != e.e.f6996) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m1390(layerDrawable2.findDrawableByLayerId(R.id.background), y2.m1651(context, e.a.f6925), j.f1343);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i7 = e.a.f6923;
            m1390(findDrawableByLayerId2, y2.m1652(context, i7), j.f1343);
            m1390(layerDrawable2.findDrawableByLayerId(R.id.progress), y2.m1652(context, i7), j.f1343);
            return true;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static synchronized j m1375() {
        j jVar;
        synchronized (j.class) {
            if (f1344 == null) {
                m1377();
            }
            jVar = f1344;
        }
        return jVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m1376(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter m1524;
        synchronized (j.class) {
            m1524 = r2.m1524(i5, mode);
        }
        return m1524;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static synchronized void m1377() {
        synchronized (j.class) {
            if (f1344 == null) {
                j jVar = new j();
                f1344 = jVar;
                jVar.f1345 = r2.m1522();
                f1344.f1345.m1537(new a());
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1378(Drawable drawable, b3 b3Var, int[] iArr) {
        r2.m1530(drawable, b3Var, iArr);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized Drawable m1379(Context context, int i5) {
        return this.f1345.m1531(context, i5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    synchronized Drawable m1380(Context context, int i5, boolean z5) {
        return this.f1345.m1532(context, i5, z5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    synchronized ColorStateList m1381(Context context, int i5) {
        return this.f1345.m1533(context, i5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public synchronized void m1382(Context context) {
        this.f1345.m1535(context);
    }
}
