package androidx.media;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class AudioAttributesCompat implements r0.a {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final SparseIntArray f3903;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final int[] f3904;

    /* renamed from: ʻ, reason: contains not printable characters */
    AudioAttributesImpl f3905;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3903 = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f3904 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static int m4527(boolean z5, int i5, int i6) {
        if ((i5 & 1) == 1) {
            return z5 ? 1 : 7;
        }
        if ((i5 & 4) == 4) {
            return z5 ? 0 : 6;
        }
        switch (i6) {
            case 0:
                if (z5) {
                    return RecyclerView.UNDEFINED_DURATION;
                }
                return 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z5 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z5) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i6 + " in audio attributes");
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static String m4528(int i5) {
        switch (i5) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i5;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f3905;
        return audioAttributesImpl == null ? audioAttributesCompat.f3905 == null : audioAttributesImpl.equals(audioAttributesCompat.f3905);
    }

    public int hashCode() {
        return this.f3905.hashCode();
    }

    public String toString() {
        return this.f3905.toString();
    }
}
