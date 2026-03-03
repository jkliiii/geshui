package androidx.media;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3905 = (AudioAttributesImpl) aVar.m5547(audioAttributesCompat.f3905, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        aVar.m5549(false, false);
        aVar.m5530(audioAttributesCompat.f3905, 1);
    }
}
