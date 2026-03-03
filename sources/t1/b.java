package t1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f11263 = new ArrayList();

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized void m12028(ImageHeaderParser imageHeaderParser) {
        this.f11263.add(imageHeaderParser);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized List<ImageHeaderParser> m12029() {
        return this.f11263;
    }
}
