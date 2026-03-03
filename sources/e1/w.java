package e1;

import com.bumptech.glide.load.data.d;
import e1.f;
import i1.o;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class w implements f, d.a<Object> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final f.a f7550;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final g<?> f7551;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f7552;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f7553 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    private c1.f f7554;

    /* renamed from: ˊ, reason: contains not printable characters */
    private List<i1.o<File, ?>> f7555;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f7556;

    /* renamed from: ˎ, reason: contains not printable characters */
    private volatile o.a<?> f7557;

    /* renamed from: ˏ, reason: contains not printable characters */
    private File f7558;

    /* renamed from: ˑ, reason: contains not printable characters */
    private x f7559;

    w(g<?> gVar, f.a aVar) {
        this.f7551 = gVar;
        this.f7550 = aVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m8441() {
        return this.f7556 < this.f7555.size();
    }

    @Override // e1.f
    public void cancel() {
        o.a<?> aVar = this.f7557;
        if (aVar != null) {
            aVar.f8513.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    /* renamed from: ʽ */
    public void mo6145(Exception exc) {
        this.f7550.mo8292(this.f7559, exc, this.f7557.f8513, c1.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d.a
    /* renamed from: ʾ */
    public void mo6146(Object obj) {
        this.f7550.mo8294(this.f7554, obj, this.f7557.f8513, c1.a.RESOURCE_DISK_CACHE, this.f7559);
    }

    @Override // e1.f
    /* renamed from: ʿ */
    public boolean mo8290() {
        z1.b.m13143("ResourceCacheGenerator.startNext");
        try {
            List<c1.f> m8297 = this.f7551.m8297();
            boolean z5 = false;
            if (m8297.isEmpty()) {
                return false;
            }
            List<Class<?>> m8307 = this.f7551.m8307();
            if (m8307.isEmpty()) {
                if (File.class.equals(this.f7551.m8312())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f7551.m8303() + " to " + this.f7551.m8312());
            }
            while (true) {
                if (this.f7555 != null && m8441()) {
                    this.f7557 = null;
                    while (!z5 && m8441()) {
                        List<i1.o<File, ?>> list = this.f7555;
                        int i5 = this.f7556;
                        this.f7556 = i5 + 1;
                        this.f7557 = list.get(i5).mo9113(this.f7558, this.f7551.m8314(), this.f7551.m8300(), this.f7551.m8305());
                        if (this.f7557 != null && this.f7551.m8315(this.f7557.f8513.mo6132())) {
                            this.f7557.f8513.mo6141(this.f7551.m8306(), this);
                            z5 = true;
                        }
                    }
                    return z5;
                }
                int i6 = this.f7553 + 1;
                this.f7553 = i6;
                if (i6 >= m8307.size()) {
                    int i7 = this.f7552 + 1;
                    this.f7552 = i7;
                    if (i7 >= m8297.size()) {
                        return false;
                    }
                    this.f7553 = 0;
                }
                c1.f fVar = m8297.get(this.f7552);
                Class<?> cls = m8307.get(this.f7553);
                this.f7559 = new x(this.f7551.m8296(), fVar, this.f7551.m8310(), this.f7551.m8314(), this.f7551.m8300(), this.f7551.m8313(cls), cls, this.f7551.m8305());
                File mo8660 = this.f7551.m8298().mo8660(this.f7559);
                this.f7558 = mo8660;
                if (mo8660 != null) {
                    this.f7554 = fVar;
                    this.f7555 = this.f7551.m8304(mo8660);
                    this.f7556 = 0;
                }
            }
        } finally {
            z1.b.m13147();
        }
    }
}
