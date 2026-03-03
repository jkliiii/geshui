package k1;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import l1.t;
import l1.y;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class n implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final y f8661 = y.m9712();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f8662;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f8663;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c1.b f8664;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final l1.n f8665;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final boolean f8666;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final c1.i f8667;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public n(int i5, int i6, c1.h hVar) {
        this.f8662 = i5;
        this.f8663 = i6;
        this.f8664 = (c1.b) hVar.m5831(t.f8997);
        this.f8665 = (l1.n) hVar.m5831(l1.n.f8992);
        c1.g<Boolean> gVar = t.f9001;
        this.f8666 = hVar.m5831(gVar) != null && ((Boolean) hVar.m5831(gVar)).booleanValue();
        this.f8667 = (c1.i) hVar.m5831(t.f8998);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z5 = false;
        if (this.f8661.m9716(this.f8662, this.f8663, this.f8666, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f8664 == c1.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int i5 = this.f8662;
        if (i5 == Integer.MIN_VALUE) {
            i5 = size.getWidth();
        }
        int i6 = this.f8663;
        if (i6 == Integer.MIN_VALUE) {
            i6 = size.getHeight();
        }
        float mo9674 = this.f8665.mo9674(size.getWidth(), size.getHeight(), i5, i6);
        int round = Math.round(size.getWidth() * mo9674);
        int round2 = Math.round(size.getHeight() * mo9674);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + mo9674);
        }
        imageDecoder.setTargetSize(round, round2);
        c1.i iVar = this.f8667;
        if (iVar != null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 28) {
                if (i7 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (iVar == c1.i.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z5 = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }
}
