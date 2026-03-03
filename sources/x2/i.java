package x2;

import android.view.animation.Animation;
import android.widget.ImageView;
import x2.e;

/* compiled from: ImageViewFutureImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i extends m2.x<ImageView, o> implements d3.a {

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final i f12179 = new a();

    /* renamed from: י, reason: contains not printable characters */
    private c0 f12180;

    /* renamed from: ـ, reason: contains not printable characters */
    private Animation f12181;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f12182;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private e.c f12183;

    /* compiled from: ImageViewFutureImpl.java */
    static class a extends i {
        a() {
            m9905(new NullPointerException("uri"));
        }

        @Override // x2.i, m2.x
        /* renamed from: ﹳﹳ */
        protected /* bridge */ /* synthetic */ void mo9912(o oVar) throws Exception {
            super.mo9912(oVar);
        }
    }

    /* compiled from: ImageViewFutureImpl.java */
    static /* synthetic */ class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f12184;

        static {
            int[] iArr = new int[c0.values().length];
            f12184 = iArr;
            try {
                iArr[c0.CenterCrop.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12184[c0.FitCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12184[c0.CenterInside.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12184[c0.FitXY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    i() {
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public static void m12701(ImageView imageView, c0 c0Var) {
        if (c0Var == null) {
            return;
        }
        int i5 = b.f12184[c0Var.ordinal()];
        if (i5 == 1) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        if (i5 == 2) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i5 == 3) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            if (i5 != 4) {
                return;
            }
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public static i m12702(e.c cVar, o oVar) {
        i iVar = oVar.m12749() instanceof i ? (i) oVar.m12749() : new i();
        oVar.m12756(iVar);
        iVar.f12183 = cVar;
        return iVar;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public i m12703(Animation animation, int i5) {
        this.f12181 = animation;
        this.f12182 = i5;
        return this;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public i m12704(c0 c0Var) {
        this.f12180 = c0Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m2.x
    /* renamed from: ʻʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo9912(o oVar) throws Exception {
        ImageView imageView = this.f12183.get();
        if (this.f12183.mo12694() != null || imageView == null) {
            m9907();
            return;
        }
        if (imageView.getDrawable() != oVar) {
            m9907();
            return;
        }
        z2.b m12747 = oVar.m12747();
        if (m12747 != null && m12747.f12775 == null) {
            m12701(imageView, this.f12180);
        }
        m.m12732(imageView, this.f12181, this.f12182);
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(oVar);
        m9906(imageView);
    }
}
