package c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import f4.g;
import f4.k;

/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f implements Parcelable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final IntentSender f4901;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Intent f4902;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f4903;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f4904;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final c f4900 = new c(null);
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* compiled from: IntentSenderRequest.kt */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final IntentSender f4905;

        /* renamed from: ʼ, reason: contains not printable characters */
        private Intent f4906;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f4907;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f4908;

        public a(IntentSender intentSender) {
            k.m8623(intentSender, "intentSender");
            this.f4905 = intentSender;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final f m5743() {
            return new f(this.f4905, this.f4906, this.f4907, this.f4908);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final a m5744(Intent intent) {
            this.f4906 = intent;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final a m5745(int i5, int i6) {
            this.f4908 = i5;
            this.f4907 = i6;
            return this;
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    public static final class b implements Parcelable.Creator<f> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            k.m8623(parcel, "inParcel");
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public f[] newArray(int i5) {
            return new f[i5];
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(g gVar) {
            this();
        }
    }

    public f(IntentSender intentSender, Intent intent, int i5, int i6) {
        k.m8623(intentSender, "intentSender");
        this.f4901 = intentSender;
        this.f4902 = intent;
        this.f4903 = i5;
        this.f4904 = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        k.m8623(parcel, "dest");
        parcel.writeParcelable(this.f4901, i5);
        parcel.writeParcelable(this.f4902, i5);
        parcel.writeInt(this.f4903);
        parcel.writeInt(this.f4904);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Intent m5739() {
        return this.f4902;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m5740() {
        return this.f4903;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m5741() {
        return this.f4904;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final IntentSender m5742() {
        return this.f4901;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Parcel parcel) {
        k.m8623(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        k.m8620(readParcelable);
        this((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
