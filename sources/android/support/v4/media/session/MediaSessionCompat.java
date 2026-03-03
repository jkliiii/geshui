package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MediaSessionCompat {

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        ResultReceiver f157;

        static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i5) {
                return new ResultReceiverWrapper[i5];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f157 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            this.f157.writeToParcel(parcel, i5);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Object f158;

        /* renamed from: ʿ, reason: contains not printable characters */
        private b f159;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Bundle f160;

        static class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public Token[] newArray(int i5) {
                return new Token[i5];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f158;
            if (obj2 == null) {
                return token.f158 == null;
            }
            Object obj3 = token.f158;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f158;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f158, i5);
            } else {
                parcel.writeStrongBinder((IBinder) this.f158);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public b m274() {
            return this.f159;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m275(b bVar) {
            this.f159 = bVar;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m276(Bundle bundle) {
            this.f160 = bundle;
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f158 = obj;
            this.f159 = bVar;
            this.f160 = bundle;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m267(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        private final MediaDescriptionCompat f154;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final long f155;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Object f156;

        static class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i5) {
                return new QueueItem[i5];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j5) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j5 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f154 = mediaDescriptionCompat;
            this.f155 = j5;
            this.f156 = obj;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static QueueItem m268(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m206(o.m342(obj)), o.m343(obj));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static List<QueueItem> m269(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m268(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f154 + ", Id=" + this.f155 + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            this.f154.writeToParcel(parcel, i5);
            parcel.writeLong(this.f155);
        }

        QueueItem(Parcel parcel) {
            this.f154 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f155 = parcel.readLong();
        }
    }
}
