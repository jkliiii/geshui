package x2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* compiled from: IonDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class o extends LayerDrawable {

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static final double f12232 = Math.log(2.0d);

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private m2.g<z2.b> f12233;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Paint f12234;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f12235;

    /* renamed from: ˆ, reason: contains not printable characters */
    private z2.b f12236;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f12237;

    /* renamed from: ˉ, reason: contains not printable characters */
    private Drawable f12238;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f12239;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Drawable f12240;

    /* renamed from: ˎ, reason: contains not printable characters */
    private Resources f12241;

    /* renamed from: ˏ, reason: contains not printable characters */
    private b0 f12242;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f12243;

    /* renamed from: י, reason: contains not printable characters */
    private int f12244;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f12245;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f12246;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private l f12247;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final Drawable f12248;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private x2.c f12249;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Drawable f12250;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private b f12251;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private m2.g<o> f12252;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private c f12253;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Drawable f12254;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f12255;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f12256;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private x2.b f12257;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private final Drawable f12258;

    /* compiled from: IonDrawable.java */
    class a implements m2.g<z2.b> {
        a() {
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, z2.b bVar) {
            o.this.invalidateSelf();
        }
    }

    /* compiled from: IonDrawable.java */
    static class b implements m2.g<z2.b> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private WeakReference<o> f12260;

        /* renamed from: ʿ, reason: contains not printable characters */
        private String f12261;

        /* renamed from: ˆ, reason: contains not printable characters */
        private l f12262;

        public b(o oVar) {
            this.f12260 = new WeakReference<>(oVar);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private void m12762(l lVar, String str) {
            if (str == null) {
                return;
            }
            if (lVar.f12208.m12353(str, this)) {
                Object m12354 = lVar.f12208.m12354(str);
                if (m12354 instanceof d0) {
                    d0 d0Var = (d0) m12354;
                    lVar.f12208.m12352(d0Var.f12121);
                    if (lVar.f12208.m12353(d0Var.f12166, d0Var)) {
                        m12354 = lVar.f12208.m12354(d0Var.f12166);
                    }
                }
                if (m12354 instanceof g) {
                    lVar.f12208.m12352(((g) m12354).f12121);
                }
            }
            lVar.m12724();
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, z2.b bVar) {
            o oVar = this.f12260.get();
            if (oVar == null) {
                return;
            }
            oVar.m12751(bVar, bVar.f12773).m12760();
            m2.g gVar = oVar.f12252;
            if (gVar != null) {
                gVar.mo8740(exc, oVar);
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m12764(l lVar, String str) {
            String str2 = this.f12261;
            l lVar2 = this.f12262;
            if (TextUtils.equals(str2, str) && this.f12262 == lVar) {
                return;
            }
            this.f12262 = lVar;
            this.f12261 = str;
            if (lVar != null) {
                lVar.f12208.m12349(str, this);
            }
            m12762(lVar2, str2);
        }
    }

    /* compiled from: IonDrawable.java */
    class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        e3.a f12263;

        /* renamed from: ʼ, reason: contains not printable characters */
        Exception f12264;

        /* renamed from: ʽ, reason: contains not printable characters */
        e3.b f12265;

        /* renamed from: ʾ, reason: contains not printable characters */
        long f12266;

        /* renamed from: ʿ, reason: contains not printable characters */
        Runnable f12267 = new a();

        /* renamed from: ˆ, reason: contains not printable characters */
        Runnable f12268 = new b();

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f12269;

        /* compiled from: IonDrawable.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f12263.m8472();
                } catch (Exception e5) {
                    c.this.f12264 = e5;
                } catch (OutOfMemoryError e6) {
                    c.this.f12264 = new Exception(e6);
                }
                l.f12189.post(c.this.f12268);
            }
        }

        /* compiled from: IonDrawable.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.f12269 = false;
                o.this.invalidateSelf();
            }
        }

        public c(z2.b bVar) {
            e3.a m8471 = bVar.f12776.m8471();
            this.f12263 = m8471;
            this.f12265 = m8471.m8468();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public e3.b m12765() {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f12266 == 0) {
                this.f12266 = m12766() + currentTimeMillis;
                m12767();
            }
            if (currentTimeMillis >= this.f12266) {
                if (this.f12263.m8468() != this.f12265) {
                    this.f12265 = this.f12263.m8468();
                    if (currentTimeMillis > this.f12266 + m12766()) {
                        this.f12266 = currentTimeMillis + m12766();
                    } else {
                        this.f12266 += m12766();
                    }
                }
                m12767();
            }
            return this.f12265;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        long m12766() {
            e3.b bVar = this.f12265;
            if (bVar == null) {
                return 100L;
            }
            long j5 = bVar.f7636;
            if (j5 == 0) {
                return 100L;
            }
            return j5;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public synchronized void m12767() {
            if (this.f12269) {
                return;
            }
            if (this.f12264 != null) {
                return;
            }
            if (this.f12263.m8469() == -1 && o.this.f12246) {
                this.f12263.m8473();
            }
            this.f12269 = true;
            l.m12710().execute(this.f12267);
        }
    }

    public o(Resources resources) {
        super(new Drawable[]{new BitmapDrawable((Bitmap) null), new BitmapDrawable((Bitmap) null), new BitmapDrawable((Bitmap) null)});
        this.f12235 = 255;
        this.f12233 = new a();
        setId(0, 0);
        setId(1, 1);
        setId(2, 2);
        this.f12258 = getDrawable(0);
        this.f12248 = getDrawable(1);
        this.f12250 = getDrawable(2);
        this.f12241 = resources;
        this.f12234 = new Paint(6);
        this.f12251 = new b(this);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m12741(Canvas canvas) {
        int i5;
        int i6;
        Rect rect;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        z2.b bVar;
        int i11;
        int i12;
        int i13;
        int i14;
        z2.b bVar2;
        int i15;
        Bitmap bitmap;
        Rect clipBounds = canvas.getClipBounds();
        Rect bounds = getBounds();
        float width = canvas.getWidth() / clipBounds.width();
        float width2 = bounds.width() * width;
        float height = width * bounds.height();
        double log = Math.log(width2 / 256.0f);
        double d6 = f12232;
        double max = Math.max(log / d6, Math.log(height / 256.0f) / d6);
        int max2 = Math.max(0, clipBounds.left);
        int min = Math.min(bounds.width(), clipBounds.right);
        int max3 = Math.max(0, clipBounds.top);
        int min2 = Math.min(bounds.height(), clipBounds.bottom);
        int max4 = Math.max(Math.min(this.f12256, (int) Math.floor(max)), 0);
        int i16 = 1 << max4;
        int i17 = this.f12255 / i16;
        Bitmap bitmap2 = this.f12236.f12774;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, getBounds(), this.f12234);
        } else {
            this.f12234.setColor(-16777216);
            canvas.drawRect(getBounds(), this.f12234);
        }
        int i18 = 1;
        while (i17 / i18 > 256) {
            i18 <<= 1;
        }
        int i19 = 0;
        while (i19 < i16) {
            int i20 = i17 * i19;
            int i21 = i19 + 1;
            int min3 = Math.min(i17 * i21, bounds.bottom);
            if (min3 < max3) {
                i5 = min2;
                rect = bounds;
                i7 = max4;
                i8 = max2;
                i9 = min;
                i6 = max3;
            } else {
                if (i20 > min2) {
                    return;
                }
                int i22 = 0;
                while (i22 < i16) {
                    int i23 = i17 * i22;
                    int i24 = i22 + 1;
                    i5 = min2;
                    i6 = max3;
                    int min4 = Math.min(i17 * i24, bounds.right);
                    if (min4 < max2) {
                        rect2 = bounds;
                        i14 = max4;
                        i10 = min3;
                    } else {
                        if (i23 > min) {
                            rect = bounds;
                            i7 = max4;
                            i8 = max2;
                            i9 = min;
                            break;
                        }
                        Rect rect3 = new Rect(i23, i20, min4, min3);
                        String str = ",";
                        String m12329 = v2.d.m12329(this.f12236.f12772, ",", Integer.valueOf(max4), ",", Integer.valueOf(i22), ",", Integer.valueOf(i19));
                        rect2 = bounds;
                        z2.b m13164 = this.f12247.f12210.m13164(m12329);
                        i10 = min3;
                        if (m13164 == null || (bitmap = m13164.f12774) == null) {
                            if (this.f12247.f12208.m12354(m12329) == null) {
                                bVar = m13164;
                                i11 = max2;
                                i12 = min;
                                i13 = i22;
                                new v(this.f12247, m12329, this.f12236.f12777, rect3, i18);
                            } else {
                                bVar = m13164;
                                i11 = max2;
                                i12 = min;
                                i13 = i22;
                            }
                            this.f12247.f12208.m12349(m12329, this.f12233);
                            int i25 = max4 - 1;
                            int i26 = i13 % 2 == 1 ? 1 : 0;
                            int i27 = i19 % 2 == 1 ? 1 : 0;
                            int i28 = i13 >> 1;
                            int i29 = i19 >> 1;
                            int i30 = 1;
                            while (true) {
                                i14 = max4;
                                if (i25 < 0) {
                                    bVar2 = bVar;
                                    break;
                                }
                                bVar2 = this.f12247.f12210.m13164(v2.d.m12329(this.f12236.f12772, str, Integer.valueOf(i25), str, Integer.valueOf(i28), str, Integer.valueOf(i29)));
                                if (bVar2 != null && bVar2.f12774 != null) {
                                    break;
                                }
                                String str2 = str;
                                if (i28 % 2 == 1) {
                                    i26 += 1 << i30;
                                }
                                if (i29 % 2 == 1) {
                                    i27 += 1 << i30;
                                }
                                i25--;
                                i30++;
                                i28 >>= 1;
                                i29 >>= 1;
                                bVar = bVar2;
                                max4 = i14;
                                str = str2;
                            }
                            if (bVar2 != null && bVar2.f12774 != null) {
                                int i31 = this.f12255 / (1 << i25);
                                int i32 = 1;
                                while (true) {
                                    i15 = i31 / i32;
                                    if (i15 <= 256) {
                                        break;
                                    } else {
                                        i32 <<= 1;
                                    }
                                }
                                int i33 = i15 >> i30;
                                int i34 = i26 * i33;
                                int i35 = i27 * i33;
                                canvas.drawBitmap(bVar2.f12774, new Rect(i34, i35, i34 + i33, i33 + i35), rect3, this.f12234);
                            }
                            max4 = i14;
                            i22 = i24;
                            min2 = i5;
                            max3 = i6;
                            bounds = rect2;
                            min3 = i10;
                            max2 = i11;
                            min = i12;
                        } else {
                            canvas.drawBitmap(bitmap, (Rect) null, rect3, this.f12234);
                            i14 = max4;
                        }
                    }
                    i11 = max2;
                    i12 = min;
                    max4 = i14;
                    i22 = i24;
                    min2 = i5;
                    max3 = i6;
                    bounds = rect2;
                    min3 = i10;
                    max2 = i11;
                    min = i12;
                }
                i5 = min2;
                rect = bounds;
                i7 = max4;
                i8 = max2;
                i9 = min;
                i6 = max3;
            }
            max4 = i7;
            i19 = i21;
            min2 = i5;
            max3 = i6;
            bounds = rect;
            max2 = i8;
            min = i9;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static o m12742(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        o oVar = (drawable == null || !(drawable instanceof o)) ? new o(imageView.getResources()) : (o) drawable;
        imageView.setImageDrawable(null);
        return oVar;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private Drawable m12743() {
        Bitmap bitmap;
        Drawable drawable = this.f12254;
        if (drawable != null) {
            return drawable;
        }
        z2.b bVar = this.f12236;
        if (bVar == null || bVar.f12776 != null || bVar.f12777 != null || (bitmap = bVar.f12774) == null) {
            return null;
        }
        Drawable mo12682 = this.f12257.mo12682(this.f12241, bitmap);
        this.f12254 = mo12682;
        return mo12682;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Drawable m12744() {
        Drawable drawable = this.f12240;
        if (drawable != null) {
            return drawable;
        }
        int i5 = this.f12239;
        if (i5 == 0) {
            return null;
        }
        Drawable drawable2 = this.f12241.getDrawable(i5);
        this.f12240 = drawable2;
        return drawable2;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Drawable m12745() {
        Drawable drawable = this.f12238;
        if (drawable != null) {
            return drawable;
        }
        int i5 = this.f12237;
        if (i5 == 0) {
            return null;
        }
        Drawable drawable2 = this.f12241.getDrawable(i5);
        this.f12238 = drawable2;
        return drawable2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        z2.b bVar = this.f12236;
        if (bVar == null) {
            super.draw(canvas);
            x2.c cVar = this.f12249;
            if (cVar != null) {
                if (cVar.f12148 == 0 && cVar.f12149 == 0) {
                    if (canvas.getWidth() != 1) {
                        this.f12249.f12148 = canvas.getWidth();
                    }
                    if (canvas.getHeight() != 1) {
                        this.f12249.f12149 = canvas.getHeight();
                    }
                    this.f12249.m12689();
                    z2.b m13164 = this.f12247.f12210.m13164(this.f12249.f12143);
                    if (m13164 != null) {
                        this.f12249 = null;
                        this.f12251.mo8740(null, m13164);
                        return;
                    }
                }
                this.f12251.m12764(this.f12247, this.f12249.f12143);
                if (x2.c.m12685(this.f12247)) {
                    this.f12249.m12687();
                } else {
                    this.f12249.m12688();
                }
                this.f12249 = null;
                return;
            }
            return;
        }
        if (bVar.f12777 != null) {
            m12741(canvas);
            return;
        }
        if (bVar.f12771 == 0) {
            bVar.f12771 = SystemClock.uptimeMillis();
        }
        long j5 = this.f12235;
        if (this.f12243) {
            j5 = Math.min(((SystemClock.uptimeMillis() - this.f12236.f12771) << 8) / 200, this.f12235);
        }
        if (j5 == this.f12235) {
            if (this.f12238 != null) {
                this.f12238 = null;
                setDrawableByLayerId(0, this.f12258);
            }
        } else if (this.f12238 != null) {
            invalidateSelf();
        }
        z2.b bVar2 = this.f12236;
        if (bVar2.f12776 != null) {
            super.draw(canvas);
            e3.b m12765 = this.f12253.m12765();
            if (m12765 != null) {
                this.f12234.setAlpha((int) j5);
                canvas.drawBitmap(m12765.f7635, (Rect) null, getBounds(), this.f12234);
                this.f12234.setAlpha(this.f12235);
                invalidateSelf();
                return;
            }
            return;
        }
        if (bVar2.f12774 != null) {
            Drawable drawable = this.f12254;
            if (drawable != null) {
                drawable.setAlpha((int) j5);
            }
        } else {
            Drawable drawable2 = this.f12240;
            if (drawable2 != null) {
                drawable2.setAlpha((int) j5);
            }
        }
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable m12744;
        z2.b bVar = this.f12236;
        if (bVar != null) {
            if (bVar.f12777 != null) {
                return bVar.f12769.y;
            }
            Bitmap bitmap = bVar.f12774;
            if (bitmap != null) {
                return bitmap.getScaledHeight(this.f12241.getDisplayMetrics().densityDpi);
            }
        }
        c cVar = this.f12253;
        if (cVar != null) {
            return cVar.f12263.m8467();
        }
        int i5 = this.f12245;
        if (i5 > 0) {
            return i5;
        }
        if (bVar != null && (m12744 = m12744()) != null) {
            return m12744.getIntrinsicHeight();
        }
        Drawable m12745 = m12745();
        if (m12745 != null) {
            return m12745.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable m12744;
        z2.b bVar = this.f12236;
        if (bVar != null) {
            if (bVar.f12777 != null) {
                return bVar.f12769.x;
            }
            Bitmap bitmap = bVar.f12774;
            if (bitmap != null) {
                return bitmap.getScaledWidth(this.f12241.getDisplayMetrics().densityDpi);
            }
        }
        c cVar = this.f12253;
        if (cVar != null) {
            return cVar.f12263.m8470();
        }
        int i5 = this.f12244;
        if (i5 > 0) {
            return i5;
        }
        if (bVar != null && (m12744 = m12744()) != null) {
            return m12744.getIntrinsicWidth();
        }
        Drawable m12745 = m12745();
        if (m12745 != null) {
            return m12745.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        z2.b bVar = this.f12236;
        if (bVar == null || (bitmap = bVar.f12774) == null || bitmap.hasAlpha() || this.f12234.getAlpha() < 255) {
            return -3;
        }
        return super.getOpacity();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        super.setAlpha(i5);
        this.f12235 = i5;
        this.f12234.setAlpha(i5);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f12234.setColorFilter(colorFilter);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m12746() {
        this.f12251.m12764(null, null);
        this.f12249 = null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public z2.b m12747() {
        return this.f12236;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Drawable m12748() {
        int i5;
        z2.b bVar = this.f12236;
        if (bVar == null && (i5 = this.f12237) != 0) {
            return this.f12241.getDrawable(i5);
        }
        if (bVar != null) {
            if (bVar.f12774 != null) {
                return new BitmapDrawable(this.f12241, this.f12236.f12774);
            }
            e3.a aVar = bVar.f12776;
            if (aVar != null) {
                e3.b m8468 = aVar.m8468();
                if (m8468 != null) {
                    return new BitmapDrawable(this.f12241, m8468.f7635);
                }
                int i6 = this.f12237;
                if (i6 != 0) {
                    return this.f12241.getDrawable(i6);
                }
                return null;
            }
        }
        int i7 = this.f12239;
        if (i7 != 0) {
            return this.f12241.getDrawable(i7);
        }
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public m2.g<o> m12749() {
        return this.f12252;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public o m12750(l lVar) {
        if (lVar == null) {
            throw new AssertionError("null ion");
        }
        this.f12247 = lVar;
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public o m12751(z2.b bVar, b0 b0Var) {
        if (this.f12236 == bVar) {
            return this;
        }
        m12746();
        this.f12242 = b0Var;
        this.f12236 = bVar;
        this.f12253 = null;
        this.f12254 = null;
        invalidateSelf();
        if (bVar == null) {
            return this;
        }
        if (bVar.f12777 != null) {
            Point point = bVar.f12769;
            double d6 = point.x;
            Double.isNaN(d6);
            double d7 = point.y;
            Double.isNaN(d7);
            int ceil = (int) Math.ceil(Math.log(Math.max(d6 / 256.0d, d7 / 256.0d)) / f12232);
            this.f12256 = ceil;
            this.f12255 = 256 << ceil;
        } else if (bVar.f12776 != null) {
            this.f12253 = new c(bVar);
        }
        return this;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public o m12752(x2.b bVar) {
        this.f12257 = bVar;
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public o m12753(x2.c cVar) {
        this.f12249 = cVar;
        if (this.f12247 != null) {
            return this;
        }
        throw new AssertionError("null ion");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public o m12754(int i5, Drawable drawable) {
        if ((drawable != null && drawable == this.f12240) || (i5 != 0 && i5 == this.f12239)) {
            return this;
        }
        this.f12239 = i5;
        this.f12240 = drawable;
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public o m12755(boolean z5) {
        this.f12243 = z5;
        return this;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public o m12756(m2.g<o> gVar) {
        this.f12252 = gVar;
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public o m12757(int i5, Drawable drawable) {
        if ((drawable != null && drawable == this.f12238) || (i5 != 0 && i5 == this.f12237)) {
            return this;
        }
        this.f12237 = i5;
        this.f12238 = drawable;
        return this;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public o m12758(boolean z5) {
        this.f12246 = z5;
        return this;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public o m12759(int i5, int i6) {
        if (this.f12244 == i5 && this.f12245 == i6) {
            return this;
        }
        this.f12244 = i5;
        this.f12245 = i6;
        invalidateSelf();
        return this;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public o m12760() {
        m12745();
        Drawable drawable = this.f12238;
        if (drawable == null) {
            setDrawableByLayerId(0, this.f12258);
        } else {
            setDrawableByLayerId(0, drawable);
        }
        z2.b bVar = this.f12236;
        if (bVar == null) {
            setDrawableByLayerId(1, this.f12248);
            setDrawableByLayerId(2, this.f12250);
            return this;
        }
        if (bVar.f12774 == null && bVar.f12777 == null && bVar.f12776 == null) {
            setDrawableByLayerId(1, this.f12248);
            m12744();
            Drawable drawable2 = this.f12240;
            if (drawable2 == null) {
                setDrawableByLayerId(2, this.f12250);
            } else {
                setDrawableByLayerId(2, drawable2);
            }
            return this;
        }
        if (bVar.f12777 == null && bVar.f12776 == null) {
            m12743();
            setDrawableByLayerId(1, this.f12254);
        } else {
            setDrawableByLayerId(1, this.f12248);
        }
        setDrawableByLayerId(2, this.f12250);
        return this;
    }
}
