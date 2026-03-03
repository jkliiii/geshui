package x2;

import android.graphics.Bitmap;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: IonBitmapRequestBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class m implements a3.b, a3.f {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final m2.t<Bitmap> f12219 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    r f12220;

    /* renamed from: ʼ, reason: contains not printable characters */
    l f12221;

    /* renamed from: ʽ, reason: contains not printable characters */
    ArrayList<z2.j> f12222;

    /* renamed from: ʾ, reason: contains not printable characters */
    c0 f12223;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f12224;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f12225;

    /* renamed from: ˈ, reason: contains not printable characters */
    a3.a f12226 = a3.a.ANIMATE;

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean f12227;

    /* renamed from: ˊ, reason: contains not printable characters */
    ArrayList<z2.g> f12228;

    /* compiled from: IonBitmapRequestBuilder.java */
    static class a extends m2.t<Bitmap> {
        a() {
            m9905(new NullPointerException("uri"));
        }
    }

    /* compiled from: IonBitmapRequestBuilder.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c f12229;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ d f12230;

        b(c cVar, d dVar) {
            this.f12229 = cVar;
            this.f12230 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12229.m12688();
            m.this.f12221.f12208.m12349(this.f12229.f12143, this.f12230);
        }
    }

    public m(r rVar) {
        this.f12220 = rVar;
        this.f12221 = rVar.f12285;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static String m12729(String str, List<z2.j> list) {
        if (list == null || list.size() <= 0) {
            return str;
        }
        Iterator<z2.j> it = list.iterator();
        while (it.hasNext()) {
            str = str + it.next().mo12699();
        }
        return v2.d.m12329(str);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private String m12730() {
        return m12731(this.f12220, this.f12224, this.f12225, this.f12226 != a3.a.NO_ANIMATE, this.f12227);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static String m12731(r rVar, int i5, int i6, boolean z5, boolean z6) {
        String str = rVar.f12289 + "resize=" + i5 + "," + i6;
        if (!z5) {
            str = str + ":noAnimate";
        }
        if (z6) {
            str = str + ":deepZoom";
        }
        return v2.d.m12329(str);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m12732(ImageView imageView, Animation animation, int i5) {
        if (imageView == null) {
            return;
        }
        if (animation == null && i5 != 0) {
            animation = AnimationUtils.loadAnimation(imageView.getContext(), i5);
        }
        if (animation == null) {
            imageView.setAnimation(null);
        } else {
            imageView.startAnimation(animation);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo12733() {
        if (this.f12225 > 0 || this.f12224 > 0) {
            if (this.f12222 == null) {
                this.f12222 = new ArrayList<>();
            }
            this.f12222.add(0, new f(this.f12224, this.f12225, this.f12223));
        } else {
            if (this.f12223 == null) {
                return;
            }
            throw new IllegalStateException("Must call resize when using " + this.f12223);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public String mo12734(String str) {
        return m12729(str, this.f12222);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    c m12735() {
        return m12736(this.f12224, this.f12225);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    c m12736(int i5, int i6) {
        z2.b m13164;
        String m12730 = m12730();
        String mo12734 = mo12734(m12730);
        c cVar = new c();
        cVar.f12143 = mo12734;
        cVar.f12142 = m12730;
        cVar.f12145 = m12737();
        cVar.f12148 = i5;
        cVar.f12149 = i6;
        r rVar = this.f12220;
        cVar.f12147 = rVar;
        cVar.f12146 = this.f12222;
        cVar.f12150 = this.f12226 != a3.a.NO_ANIMATE;
        cVar.f12151 = this.f12227;
        cVar.f12152 = this.f12228;
        if (!rVar.f12292 && (m13164 = rVar.f12285.f12210.m13164(mo12734)) != null) {
            cVar.f12144 = m13164;
        }
        return cVar;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    boolean m12737() {
        ArrayList<z2.j> arrayList = this.f12222;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void mo12738() {
        this.f12221 = null;
        this.f12222 = null;
        this.f12223 = null;
        this.f12224 = 0;
        this.f12225 = 0;
        this.f12226 = a3.a.ANIMATE;
        this.f12220 = null;
        this.f12227 = false;
        this.f12228 = null;
    }

    @Override // a3.b
    /* renamed from: ᐧ */
    public m2.f<Bitmap> mo181() {
        if (this.f12220.f12289 == null) {
            return f12219;
        }
        mo12733();
        c m12735 = m12735();
        if (m12735.f12144 == null) {
            d dVar = new d(this.f12220.f12286);
            k2.k.m9449(l.f12189, new b(m12735, dVar));
            return dVar;
        }
        m2.t tVar = new m2.t();
        z2.b bVar = m12735.f12144;
        tVar.m9904(bVar.f12775, bVar.f12774);
        return tVar;
    }

    public m(l lVar) {
        this.f12221 = lVar;
    }
}
