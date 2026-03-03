package i1;

import com.bumptech.glide.load.data.d;
import i1.o;

/* compiled from: UnitModelLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final x<?> f8547 = new x<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final a<?> f8548 = new a<>();

        @Deprecated
        public a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static <T> a<T> m9211() {
            return (a<T>) f8548;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Model, Model> mo9118(s sVar) {
            return x.m9210();
        }
    }

    @Deprecated
    public x() {
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T> x<T> m9210() {
        return (x<T>) f8547;
    }

    @Override // i1.o
    /* renamed from: ʻ */
    public o.a<Model> mo9113(Model model, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(model), new b(model));
    }

    @Override // i1.o
    /* renamed from: ʼ */
    public boolean mo9114(Model model) {
        return true;
    }

    /* compiled from: UnitModelLoader.java */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Model f8549;

        b(Model model) {
            this.f8549 = model;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<Model> mo6132() {
            return (Class<Model>) this.f8549.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.mo6146(this.f8549);
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
        }
    }
}
