package y4;

import java.io.IOException;
import java.util.List;

/* compiled from: PushObserver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface l {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final l f12658 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean mo13087(int i5, List<c> list);

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean mo13088(int i5, List<c> list, boolean z5);

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean mo13089(int i5, c5.e eVar, int i6, boolean z5) throws IOException;

    /* renamed from: ʾ, reason: contains not printable characters */
    void mo13090(int i5, b bVar);

    /* compiled from: PushObserver.java */
    class a implements l {
        a() {
        }

        @Override // y4.l
        /* renamed from: ʻ */
        public boolean mo13087(int i5, List<c> list) {
            return true;
        }

        @Override // y4.l
        /* renamed from: ʼ */
        public boolean mo13088(int i5, List<c> list, boolean z5) {
            return true;
        }

        @Override // y4.l
        /* renamed from: ʽ */
        public boolean mo13089(int i5, c5.e eVar, int i6, boolean z5) throws IOException {
            eVar.skip(i6);
            return true;
        }

        @Override // y4.l
        /* renamed from: ʾ */
        public void mo13090(int i5, b bVar) {
        }
    }
}
