package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* loaded from: E:\78999\cookie_5123796.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: ʻ, reason: contains not printable characters */
    AudioAttributes f3906;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f3907 = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f3906.equals(((AudioAttributesImplApi21) obj).f3906);
        }
        return false;
    }

    public int hashCode() {
        return this.f3906.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3906;
    }
}
