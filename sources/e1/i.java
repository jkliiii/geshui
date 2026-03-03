package e1;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodePath.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Class<DataType> f7445;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<? extends c1.j<DataType, ResourceType>> f7446;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final q1.e<ResourceType, Transcode> f7447;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final androidx.core.util.e<List<Throwable>> f7448;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final String f7449;

    /* compiled from: DecodePath.java */
    interface a<ResourceType> {
        /* renamed from: ʻ */
        v<ResourceType> mo8350(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends c1.j<DataType, ResourceType>> list, q1.e<ResourceType, Transcode> eVar, androidx.core.util.e<List<Throwable>> eVar2) {
        this.f7445 = cls;
        this.f7446 = list;
        this.f7447 = eVar;
        this.f7448 = eVar2;
        this.f7449 = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private v<ResourceType> m8363(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, c1.h hVar) throws q {
        List<Throwable> list = (List) y1.k.m12893(this.f7448.mo2575());
        try {
            return m8364(eVar, i5, i6, hVar, list);
        } finally {
            this.f7448.mo2574(list);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private v<ResourceType> m8364(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, c1.h hVar, List<Throwable> list) throws q {
        int size = this.f7446.size();
        v<ResourceType> vVar = null;
        for (int i7 = 0; i7 < size; i7++) {
            c1.j<DataType, ResourceType> jVar = this.f7446.get(i7);
            try {
                if (jVar.mo5836(eVar.mo6126(), hVar)) {
                    vVar = jVar.mo5835(eVar.mo6126(), i5, i6, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e5);
                }
                list.add(e5);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f7449, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f7445 + ", decoders=" + this.f7446 + ", transcoder=" + this.f7447 + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public v<Transcode> m8365(com.bumptech.glide.load.data.e<DataType> eVar, int i5, int i6, c1.h hVar, a<ResourceType> aVar) throws q {
        return this.f7447.mo11467(aVar.mo8350(m8363(eVar, i5, i6, hVar)), hVar);
    }
}
