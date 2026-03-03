package androidx.media;

import android.media.AudioAttributes;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3906 = (AudioAttributes) aVar.m5542(audioAttributesImplApi21.f3906, 1);
        audioAttributesImplApi21.f3907 = aVar.m5539(audioAttributesImplApi21.f3907, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, androidx.versionedparcelable.a aVar) {
        aVar.m5549(false, false);
        aVar.m5538(audioAttributesImplApi21.f3906, 1);
        aVar.m5522(audioAttributesImplApi21.f3907, 2);
    }
}
