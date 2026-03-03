package androidx.media;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3908 = aVar.m5539(audioAttributesImplBase.f3908, 1);
        audioAttributesImplBase.f3909 = aVar.m5539(audioAttributesImplBase.f3909, 2);
        audioAttributesImplBase.f3910 = aVar.m5539(audioAttributesImplBase.f3910, 3);
        audioAttributesImplBase.f3911 = aVar.m5539(audioAttributesImplBase.f3911, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.m5549(false, false);
        aVar.m5522(audioAttributesImplBase.f3908, 1);
        aVar.m5522(audioAttributesImplBase.f3909, 2);
        aVar.m5522(audioAttributesImplBase.f3910, 3);
        aVar.m5522(audioAttributesImplBase.f3911, 4);
    }
}
