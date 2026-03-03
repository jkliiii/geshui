package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    final String f3680;

    /* renamed from: ʿ, reason: contains not printable characters */
    final String f3681;

    /* renamed from: ˆ, reason: contains not printable characters */
    final boolean f3682;

    /* renamed from: ˈ, reason: contains not printable characters */
    final int f3683;

    /* renamed from: ˉ, reason: contains not printable characters */
    final int f3684;

    /* renamed from: ˊ, reason: contains not printable characters */
    final String f3685;

    /* renamed from: ˋ, reason: contains not printable characters */
    final boolean f3686;

    /* renamed from: ˎ, reason: contains not printable characters */
    final boolean f3687;

    /* renamed from: ˏ, reason: contains not printable characters */
    final boolean f3688;

    /* renamed from: ˑ, reason: contains not printable characters */
    final Bundle f3689;

    /* renamed from: י, reason: contains not printable characters */
    final boolean f3690;

    /* renamed from: ـ, reason: contains not printable characters */
    final int f3691;

    /* renamed from: ٴ, reason: contains not printable characters */
    Bundle f3692;

    /* compiled from: FragmentState.java */
    class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public s[] newArray(int i5) {
            return new s[i5];
        }
    }

    s(e eVar) {
        this.f3680 = eVar.getClass().getName();
        this.f3681 = eVar.mWho;
        this.f3682 = eVar.mFromLayout;
        this.f3683 = eVar.mFragmentId;
        this.f3684 = eVar.mContainerId;
        this.f3685 = eVar.mTag;
        this.f3686 = eVar.mRetainInstance;
        this.f3687 = eVar.mRemoving;
        this.f3688 = eVar.mDetached;
        this.f3689 = eVar.mArguments;
        this.f3690 = eVar.mHidden;
        this.f3691 = eVar.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3680);
        sb.append(" (");
        sb.append(this.f3681);
        sb.append(")}:");
        if (this.f3682) {
            sb.append(" fromLayout");
        }
        if (this.f3684 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3684));
        }
        String str = this.f3685;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3685);
        }
        if (this.f3686) {
            sb.append(" retainInstance");
        }
        if (this.f3687) {
            sb.append(" removing");
        }
        if (this.f3688) {
            sb.append(" detached");
        }
        if (this.f3690) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f3680);
        parcel.writeString(this.f3681);
        parcel.writeInt(this.f3682 ? 1 : 0);
        parcel.writeInt(this.f3683);
        parcel.writeInt(this.f3684);
        parcel.writeString(this.f3685);
        parcel.writeInt(this.f3686 ? 1 : 0);
        parcel.writeInt(this.f3687 ? 1 : 0);
        parcel.writeInt(this.f3688 ? 1 : 0);
        parcel.writeBundle(this.f3689);
        parcel.writeInt(this.f3690 ? 1 : 0);
        parcel.writeBundle(this.f3692);
        parcel.writeInt(this.f3691);
    }

    s(Parcel parcel) {
        this.f3680 = parcel.readString();
        this.f3681 = parcel.readString();
        this.f3682 = parcel.readInt() != 0;
        this.f3683 = parcel.readInt();
        this.f3684 = parcel.readInt();
        this.f3685 = parcel.readString();
        this.f3686 = parcel.readInt() != 0;
        this.f3687 = parcel.readInt() != 0;
        this.f3688 = parcel.readInt() != 0;
        this.f3689 = parcel.readBundle();
        this.f3690 = parcel.readInt() != 0;
        this.f3692 = parcel.readBundle();
        this.f3691 = parcel.readInt();
    }
}
