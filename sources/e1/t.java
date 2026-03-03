package e1;

import e1.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t<Data, ResourceType, Transcode> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Class<Data> f7541;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.core.util.e<List<Throwable>> f7542;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final List<? extends i<Data, ResourceType, Transcode>> f7543;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f7544;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, androidx.core.util.e<List<Throwable>> eVar) {
        this.f7541 = cls;
        this.f7542 = eVar;
        this.f7543 = (List) y1.k.m12892(list);
        this.f7544 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private v<Transcode> m8434(com.bumptech.glide.load.data.e<Data> eVar, c1.h hVar, int i5, int i6, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f7543.size();
        v<Transcode> vVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            try {
                vVar = this.f7543.get(i7).m8365(eVar, i5, i6, hVar, aVar);
            } catch (q e5) {
                list.add(e5);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f7544, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f7543.toArray()) + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public v<Transcode> m8435(com.bumptech.glide.load.data.e<Data> eVar, c1.h hVar, int i5, int i6, i.a<ResourceType> aVar) throws q {
        List<Throwable> list = (List) y1.k.m12893(this.f7542.mo2575());
        try {
            return m8434(eVar, hVar, i5, i6, aVar, list);
        } finally {
            this.f7542.mo2574(list);
        }
    }
}
