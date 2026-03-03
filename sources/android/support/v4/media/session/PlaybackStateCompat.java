package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.c0;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    final int f166;

    /* renamed from: ʿ, reason: contains not printable characters */
    final long f167;

    /* renamed from: ˆ, reason: contains not printable characters */
    final long f168;

    /* renamed from: ˈ, reason: contains not printable characters */
    final float f169;

    /* renamed from: ˉ, reason: contains not printable characters */
    final long f170;

    /* renamed from: ˊ, reason: contains not printable characters */
    final int f171;

    /* renamed from: ˋ, reason: contains not printable characters */
    final CharSequence f172;

    /* renamed from: ˎ, reason: contains not printable characters */
    final long f173;

    /* renamed from: ˏ, reason: contains not printable characters */
    List<CustomAction> f174;

    /* renamed from: ˑ, reason: contains not printable characters */
    final long f175;

    /* renamed from: י, reason: contains not printable characters */
    final Bundle f176;

    /* renamed from: ـ, reason: contains not printable characters */
    private Object f177;

    static class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i5) {
            return new PlaybackStateCompat[i5];
        }
    }

    PlaybackStateCompat(int i5, long j5, long j6, float f5, long j7, int i6, CharSequence charSequence, long j8, List<CustomAction> list, long j9, Bundle bundle) {
        this.f166 = i5;
        this.f167 = j5;
        this.f168 = j6;
        this.f169 = f5;
        this.f170 = j7;
        this.f171 = i6;
        this.f172 = charSequence;
        this.f173 = j8;
        this.f174 = new ArrayList(list);
        this.f175 = j9;
        this.f176 = bundle;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static PlaybackStateCompat m281(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> m317 = c0.m317(obj);
        if (m317 != null) {
            ArrayList arrayList2 = new ArrayList(m317.size());
            Iterator<Object> it = m317.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m282(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(c0.m322(obj), c0.m321(obj), c0.m316(obj), c0.m320(obj), c0.m314(obj), 0, c0.m318(obj), c0.m319(obj), arrayList, c0.m315(obj), Build.VERSION.SDK_INT >= 22 ? e0.m332(obj) : null);
        playbackStateCompat.f177 = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f166 + ", position=" + this.f167 + ", buffered position=" + this.f168 + ", speed=" + this.f169 + ", updated=" + this.f173 + ", actions=" + this.f170 + ", error code=" + this.f171 + ", error message=" + this.f172 + ", custom actions=" + this.f174 + ", active item id=" + this.f175 + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f166);
        parcel.writeLong(this.f167);
        parcel.writeFloat(this.f169);
        parcel.writeLong(this.f173);
        parcel.writeLong(this.f168);
        parcel.writeLong(this.f170);
        TextUtils.writeToParcel(this.f172, parcel, i5);
        parcel.writeTypedList(this.f174);
        parcel.writeLong(this.f175);
        parcel.writeBundle(this.f176);
        parcel.writeInt(this.f171);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        private final String f178;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final CharSequence f179;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final int f180;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final Bundle f181;

        /* renamed from: ˉ, reason: contains not printable characters */
        private Object f182;

        static class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i5) {
                return new CustomAction[i5];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i5, Bundle bundle) {
            this.f178 = str;
            this.f179 = charSequence;
            this.f180 = i5;
            this.f181 = bundle;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static CustomAction m282(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(c0.a.m323(obj), c0.a.m326(obj), c0.a.m325(obj), c0.a.m324(obj));
            customAction.f182 = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f179) + ", mIcon=" + this.f180 + ", mExtras=" + this.f181;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeString(this.f178);
            TextUtils.writeToParcel(this.f179, parcel, i5);
            parcel.writeInt(this.f180);
            parcel.writeBundle(this.f181);
        }

        CustomAction(Parcel parcel) {
            this.f178 = parcel.readString();
            this.f179 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f180 = parcel.readInt();
            this.f181 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f166 = parcel.readInt();
        this.f167 = parcel.readLong();
        this.f169 = parcel.readFloat();
        this.f173 = parcel.readLong();
        this.f168 = parcel.readLong();
        this.f170 = parcel.readLong();
        this.f172 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f174 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f175 = parcel.readLong();
        this.f176 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f171 = parcel.readInt();
    }
}
