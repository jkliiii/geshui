package androidx.media;

import java.util.Arrays;

/* loaded from: E:\78999\cookie_5123796.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: ʻ, reason: contains not printable characters */
    int f3908 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f3909 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f3910 = 0;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f3911 = -1;

    AudioAttributesImplBase() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3909 == audioAttributesImplBase.m4529() && this.f3910 == audioAttributesImplBase.m4530() && this.f3908 == audioAttributesImplBase.m4532() && this.f3911 == audioAttributesImplBase.f3911;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3909), Integer.valueOf(this.f3910), Integer.valueOf(this.f3908), Integer.valueOf(this.f3911)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3911 != -1) {
            sb.append(" stream=");
            sb.append(this.f3911);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4528(this.f3908));
        sb.append(" content=");
        sb.append(this.f3909);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3910).toUpperCase());
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m4529() {
        return this.f3909;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m4530() {
        int i5 = this.f3910;
        int m4531 = m4531();
        if (m4531 == 6) {
            i5 |= 4;
        } else if (m4531 == 7) {
            i5 |= 1;
        }
        return i5 & 273;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m4531() {
        int i5 = this.f3911;
        return i5 != -1 ? i5 : AudioAttributesCompat.m4527(false, this.f3910, this.f3908);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m4532() {
        return this.f3908;
    }
}
