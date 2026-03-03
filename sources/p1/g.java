package p1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final b1.a f10187;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Handler f10188;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final List<b> f10189;

    /* renamed from: ʾ, reason: contains not printable characters */
    final l f10190;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final f1.d f10191;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f10192;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f10193;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f10194;

    /* renamed from: ˊ, reason: contains not printable characters */
    private k<Bitmap> f10195;

    /* renamed from: ˋ, reason: contains not printable characters */
    private a f10196;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f10197;

    /* renamed from: ˏ, reason: contains not printable characters */
    private a f10198;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Bitmap f10199;

    /* renamed from: י, reason: contains not printable characters */
    private c1.l<Bitmap> f10200;

    /* renamed from: ـ, reason: contains not printable characters */
    private a f10201;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f10202;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f10203;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f10204;

    /* compiled from: GifFrameLoader.java */
    static class a extends v1.c<Bitmap> {

        /* renamed from: ˈ, reason: contains not printable characters */
        private final Handler f10205;

        /* renamed from: ˉ, reason: contains not printable characters */
        final int f10206;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final long f10207;

        /* renamed from: ˋ, reason: contains not printable characters */
        private Bitmap f10208;

        a(Handler handler, int i5, long j5) {
            this.f10205 = handler;
            this.f10206 = i5;
            this.f10207 = j5;
        }

        @Override // v1.h
        /* renamed from: ˋ */
        public void mo9534(Drawable drawable) {
            this.f10208 = null;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        Bitmap m11058() {
            return this.f10208;
        }

        @Override // v1.h
        /* renamed from: ˑ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9533(Bitmap bitmap, w1.b<? super Bitmap> bVar) {
            this.f10208 = bitmap;
            this.f10205.sendMessageAtTime(this.f10205.obtainMessage(1, this), this.f10207);
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        /* renamed from: ʻ */
        void mo11030();
    }

    /* compiled from: GifFrameLoader.java */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 1) {
                g.this.m11054((a) message.obj);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            g.this.f10190.m6097((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, b1.a aVar, int i5, int i6, c1.l<Bitmap> lVar, Bitmap bitmap) {
        this(bVar.m6021(), com.bumptech.glide.b.m6017(bVar.m6023()), aVar, null, m11040(com.bumptech.glide.b.m6017(bVar.m6023()), i5, i6), lVar, bitmap);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static c1.f m11039() {
        return new x1.b(Double.valueOf(Math.random()));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static k<Bitmap> m11040(l lVar, int i5, int i6) {
        return lVar.m6095().mo6079(u1.g.m12175(e1.j.f7451).m12111(true).m12105(true).m12142(i5, i6));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m11041() {
        if (!this.f10192 || this.f10193) {
            return;
        }
        if (this.f10194) {
            y1.k.m12890(this.f10201 == null, "Pending target must be null when starting from the first frame");
            this.f10187.mo5641();
            this.f10194 = false;
        }
        a aVar = this.f10201;
        if (aVar != null) {
            this.f10201 = null;
            m11054(aVar);
            return;
        }
        this.f10193 = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f10187.mo5638();
        this.f10187.mo5636();
        this.f10198 = new a(this.f10188, this.f10187.mo5634(), uptimeMillis);
        this.f10195.mo6079(u1.g.m12176(m11039())).m6086(this.f10187).m6083(this.f10198);
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m11042() {
        Bitmap bitmap = this.f10199;
        if (bitmap != null) {
            this.f10191.mo8529(bitmap);
            this.f10199 = null;
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m11043() {
        if (this.f10192) {
            return;
        }
        this.f10192 = true;
        this.f10197 = false;
        m11041();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m11044() {
        this.f10192 = false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m11045() {
        this.f10189.clear();
        m11042();
        m11044();
        a aVar = this.f10196;
        if (aVar != null) {
            this.f10190.m6097(aVar);
            this.f10196 = null;
        }
        a aVar2 = this.f10198;
        if (aVar2 != null) {
            this.f10190.m6097(aVar2);
            this.f10198 = null;
        }
        a aVar3 = this.f10201;
        if (aVar3 != null) {
            this.f10190.m6097(aVar3);
            this.f10201 = null;
        }
        this.f10187.clear();
        this.f10197 = true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    ByteBuffer m11046() {
        return this.f10187.getData().asReadOnlyBuffer();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    Bitmap m11047() {
        a aVar = this.f10196;
        return aVar != null ? aVar.m11058() : this.f10199;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    int m11048() {
        a aVar = this.f10196;
        if (aVar != null) {
            return aVar.f10206;
        }
        return -1;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    Bitmap m11049() {
        return this.f10199;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m11050() {
        return this.f10187.mo5637();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    int m11051() {
        return this.f10204;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    int m11052() {
        return this.f10187.mo5639() + this.f10202;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    int m11053() {
        return this.f10203;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m11054(a aVar) {
        this.f10193 = false;
        if (this.f10197) {
            this.f10188.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f10192) {
            if (this.f10194) {
                this.f10188.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f10201 = aVar;
                return;
            }
        }
        if (aVar.m11058() != null) {
            m11042();
            a aVar2 = this.f10196;
            this.f10196 = aVar;
            for (int size = this.f10189.size() - 1; size >= 0; size--) {
                this.f10189.get(size).mo11030();
            }
            if (aVar2 != null) {
                this.f10188.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m11041();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m11055(c1.l<Bitmap> lVar, Bitmap bitmap) {
        this.f10200 = (c1.l) y1.k.m12893(lVar);
        this.f10199 = (Bitmap) y1.k.m12893(bitmap);
        this.f10195 = this.f10195.mo6079(new u1.g().m12107(lVar));
        this.f10202 = y1.l.m12902(bitmap);
        this.f10203 = bitmap.getWidth();
        this.f10204 = bitmap.getHeight();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m11056(b bVar) {
        if (this.f10197) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f10189.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f10189.isEmpty();
        this.f10189.add(bVar);
        if (isEmpty) {
            m11043();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m11057(b bVar) {
        this.f10189.remove(bVar);
        if (this.f10189.isEmpty()) {
            m11044();
        }
    }

    g(f1.d dVar, l lVar, b1.a aVar, Handler handler, k<Bitmap> kVar, c1.l<Bitmap> lVar2, Bitmap bitmap) {
        this.f10189 = new ArrayList();
        this.f10190 = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f10191 = dVar;
        this.f10188 = handler;
        this.f10195 = kVar;
        this.f10187 = aVar;
        m11055(lVar2, bitmap);
    }
}
