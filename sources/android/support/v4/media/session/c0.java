package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* compiled from: PlaybackStateCompatApi21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 {

    /* compiled from: PlaybackStateCompatApi21.java */
    static final class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static String m323(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static Bundle m324(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static int m325(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static CharSequence m326(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static long m314(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static long m315(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static long m316(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static List<Object> m317(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static CharSequence m318(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static long m319(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static float m320(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static long m321(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m322(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
