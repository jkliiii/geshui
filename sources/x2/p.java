package x2;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import x2.e;

/* compiled from: IonImageViewRequestBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p extends m implements a3.d {

    /* renamed from: ˎ, reason: contains not printable characters */
    Drawable f12273;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f12274;

    /* renamed from: ˑ, reason: contains not printable characters */
    Drawable f12275;

    /* renamed from: י, reason: contains not printable characters */
    int f12276;

    /* renamed from: ـ, reason: contains not printable characters */
    Animation f12277;

    /* renamed from: ٴ, reason: contains not printable characters */
    Animation f12278;

    /* renamed from: ᐧ, reason: contains not printable characters */
    int f12279;

    /* renamed from: ᴵ, reason: contains not printable characters */
    int f12280;

    /* renamed from: ᵎ, reason: contains not printable characters */
    e.c f12281;

    /* renamed from: ᵔ, reason: contains not printable characters */
    boolean f12282;

    /* renamed from: ᵢ, reason: contains not printable characters */
    boolean f12283;

    /* renamed from: ⁱ, reason: contains not printable characters */
    b f12284;

    public p(r rVar) {
        super(rVar);
        this.f12282 = true;
        this.f12284 = b.f12136;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static boolean m12768(ImageView imageView) {
        return m12769(imageView);
    }

    @TargetApi(16)
    /* renamed from: ᵔ, reason: contains not printable characters */
    private static boolean m12769(ImageView imageView) {
        return imageView.getAdjustViewBounds();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private o m12770(ImageView imageView, c cVar, b0 b0Var) {
        z2.b bVar = cVar != null ? cVar.f12144 : null;
        if (bVar != null) {
            cVar = null;
        }
        o m12753 = o.m12742(imageView).m12750(this.f12221).m12751(bVar, b0Var).m12753(cVar);
        boolean z5 = true;
        o m12757 = m12753.m12758(this.f12226 == a3.a.ANIMATE).m12759(this.f12224, this.f12225).m12754(this.f12276, this.f12275).m12757(this.f12274, this.f12273);
        if (!this.f12282 && !this.f12283) {
            z5 = false;
        }
        o m12760 = m12757.m12755(z5).m12752(this.f12284).m12760();
        imageView.setImageDrawable(m12760);
        return m12760;
    }

    @Override // a3.h
    /* renamed from: ʼ */
    public d3.a mo189(String str) {
        m12771();
        this.f12220.mo187(str);
        return mo186(this.f12281.get());
    }

    @Override // x2.m
    /* renamed from: ʽ */
    public /* bridge */ /* synthetic */ void mo12733() {
        super.mo12733();
    }

    @Override // a3.f
    /* renamed from: ʿ */
    public d3.a mo186(ImageView imageView) {
        if (imageView == null) {
            throw new NullPointerException("imageView");
        }
        if (this.f12220.f12289 == null) {
            m12770(imageView, null, b0.LOADED_FROM_NETWORK).m12746();
            return i.f12179;
        }
        m12773(imageView);
        if (this.f12283) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof o) {
                drawable = ((o) drawable).m12748();
            }
            m12772(drawable);
        }
        int i5 = this.f12224;
        int i6 = this.f12225;
        if (i6 == 0 && i5 == 0 && !m12768(imageView)) {
            i5 = imageView.getMeasuredWidth();
            i6 = imageView.getMeasuredHeight();
        } else {
            mo12733();
        }
        c m12736 = m12736(i5, i6);
        if (m12736.f12144 == null) {
            o m12770 = m12770(imageView, m12736, b0.LOADED_FROM_NETWORK);
            m.m12732(imageView, this.f12278, this.f12279);
            i m12704 = i.m12702(this.f12281, m12770).m12703(this.f12277, this.f12280).m12704(this.f12223);
            m12704.m9900();
            return m12704;
        }
        m.m12732(imageView, null, 0);
        o m127702 = m12770(imageView, m12736, b0.LOADED_FROM_MEMORY);
        m127702.m12746();
        i m127042 = i.m12702(this.f12281, m127702).m12703(this.f12277, this.f12280).m12704(this.f12223);
        i.m12701(imageView, this.f12223);
        m127042.m9900();
        m127042.m9904(m12736.f12144.f12775, imageView);
        return m127042;
    }

    @Override // x2.m
    /* renamed from: ˈ */
    public /* bridge */ /* synthetic */ String mo12734(String str) {
        return super.mo12734(str);
    }

    @Override // x2.m
    /* renamed from: ٴ */
    void mo12738() {
        super.mo12738();
        this.f12282 = true;
        this.f12283 = false;
        this.f12281 = null;
        this.f12273 = null;
        this.f12284 = b.f12136;
        this.f12274 = 0;
        this.f12275 = null;
        this.f12276 = 0;
        this.f12277 = null;
        this.f12280 = 0;
        this.f12278 = null;
        this.f12279 = 0;
    }

    @Override // x2.m, a3.b
    /* renamed from: ᐧ */
    public /* bridge */ /* synthetic */ m2.f mo181() {
        return super.mo181();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    protected r m12771() {
        if (this.f12220 == null) {
            this.f12220 = new r(e.m12693(this.f12281.getContext().getApplicationContext()), this.f12221);
        }
        return this.f12220;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public p m12772(Drawable drawable) {
        this.f12273 = drawable;
        return this;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    p m12773(ImageView imageView) {
        e.c cVar = this.f12281;
        if (cVar == null || cVar.get() != imageView) {
            this.f12281 = new e.c(imageView);
        }
        return this;
    }

    public p(l lVar) {
        super(lVar);
        this.f12282 = true;
        this.f12284 = b.f12136;
    }
}
