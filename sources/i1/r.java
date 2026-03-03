package i1;

import com.bumptech.glide.load.data.d;
import i1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class r<Model, Data> implements o<Model, Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<o<Model, Data>> f8518;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.core.util.e<List<Throwable>> f8519;

    /* compiled from: MultiModelLoader.java */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<com.bumptech.glide.load.data.d<Data>> f8520;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final androidx.core.util.e<List<Throwable>> f8521;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f8522;

        /* renamed from: ˈ, reason: contains not printable characters */
        private com.bumptech.glide.g f8523;

        /* renamed from: ˉ, reason: contains not printable characters */
        private d.a<? super Data> f8524;

        /* renamed from: ˊ, reason: contains not printable characters */
        private List<Throwable> f8525;

        /* renamed from: ˋ, reason: contains not printable characters */
        private boolean f8526;

        a(List<com.bumptech.glide.load.data.d<Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
            this.f8521 = eVar;
            y1.k.m12892(list);
            this.f8520 = list;
            this.f8522 = 0;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m9185() {
            if (this.f8526) {
                return;
            }
            if (this.f8522 < this.f8520.size() - 1) {
                this.f8522++;
                mo6141(this.f8523, this.f8524);
            } else {
                y1.k.m12893(this.f8525);
                this.f8524.mo6145(new e1.q("Fetch failed", new ArrayList(this.f8525)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f8526 = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f8520.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<Data> mo6132() {
            return this.f8520.get(0).mo6132();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
            List<Throwable> list = this.f8525;
            if (list != null) {
                this.f8521.mo2574(list);
            }
            this.f8525 = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f8520.iterator();
            while (it.hasNext()) {
                it.next().mo6137();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        /* renamed from: ʽ */
        public void mo6145(Exception exc) {
            ((List) y1.k.m12893(this.f8525)).add(exc);
            m9185();
        }

        @Override // com.bumptech.glide.load.data.d.a
        /* renamed from: ʾ */
        public void mo6146(Data data) {
            if (data != null) {
                this.f8524.mo6146(data);
            } else {
                m9185();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return this.f8520.get(0).mo6140();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f8523 = gVar;
            this.f8524 = aVar;
            this.f8525 = this.f8521.mo2575();
            this.f8520.get(this.f8522).mo6141(gVar, this);
            if (this.f8526) {
                cancel();
            }
        }
    }

    r(List<o<Model, Data>> list, androidx.core.util.e<List<Throwable>> eVar) {
        this.f8518 = list;
        this.f8519 = eVar;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f8518.toArray()) + '}';
    }

    @Override // i1.o
    /* renamed from: ʻ */
    public o.a<Data> mo9113(Model model, int i5, int i6, c1.h hVar) {
        o.a<Data> mo9113;
        int size = this.f8518.size();
        ArrayList arrayList = new ArrayList(size);
        c1.f fVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            o<Model, Data> oVar = this.f8518.get(i7);
            if (oVar.mo9114(model) && (mo9113 = oVar.mo9113(model, i5, i6, hVar)) != null) {
                fVar = mo9113.f8511;
                arrayList.add(mo9113.f8513);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f8519));
    }

    @Override // i1.o
    /* renamed from: ʼ */
    public boolean mo9114(Model model) {
        Iterator<o<Model, Data>> it = this.f8518.iterator();
        while (it.hasNext()) {
            if (it.next().mo9114(model)) {
                return true;
            }
        }
        return false;
    }
}
