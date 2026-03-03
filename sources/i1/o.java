package i1;

import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface o<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final c1.f f8511;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final List<c1.f> f8512;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final com.bumptech.glide.load.data.d<Data> f8513;

        public a(c1.f fVar, com.bumptech.glide.load.data.d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(c1.f fVar, List<c1.f> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f8511 = (c1.f) y1.k.m12893(fVar);
            this.f8512 = (List) y1.k.m12893(list);
            this.f8513 = (com.bumptech.glide.load.data.d) y1.k.m12893(dVar);
        }
    }

    /* renamed from: ʻ */
    a<Data> mo9113(Model model, int i5, int i6, c1.h hVar);

    /* renamed from: ʼ */
    boolean mo9114(Model model);
}
