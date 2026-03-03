package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.v;
import androidx.lifecycle.l;
import java.util.ArrayList;

/* compiled from: BackStackState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    final int[] f3394;

    /* renamed from: ʿ, reason: contains not printable characters */
    final ArrayList<String> f3395;

    /* renamed from: ˆ, reason: contains not printable characters */
    final int[] f3396;

    /* renamed from: ˈ, reason: contains not printable characters */
    final int[] f3397;

    /* renamed from: ˉ, reason: contains not printable characters */
    final int f3398;

    /* renamed from: ˊ, reason: contains not printable characters */
    final String f3399;

    /* renamed from: ˋ, reason: contains not printable characters */
    final int f3400;

    /* renamed from: ˎ, reason: contains not printable characters */
    final int f3401;

    /* renamed from: ˏ, reason: contains not printable characters */
    final CharSequence f3402;

    /* renamed from: ˑ, reason: contains not printable characters */
    final int f3403;

    /* renamed from: י, reason: contains not printable characters */
    final CharSequence f3404;

    /* renamed from: ـ, reason: contains not printable characters */
    final ArrayList<String> f3405;

    /* renamed from: ٴ, reason: contains not printable characters */
    final ArrayList<String> f3406;

    /* renamed from: ᐧ, reason: contains not printable characters */
    final boolean f3407;

    /* compiled from: BackStackState.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b[] newArray(int i5) {
            return new b[i5];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f3706.size();
        this.f3394 = new int[size * 5];
        if (!aVar.f3712) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3395 = new ArrayList<>(size);
        this.f3396 = new int[size];
        this.f3397 = new int[size];
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            v.a aVar2 = aVar.f3706.get(i5);
            int i7 = i6 + 1;
            this.f3394[i6] = aVar2.f3723;
            ArrayList<String> arrayList = this.f3395;
            e eVar = aVar2.f3724;
            arrayList.add(eVar != null ? eVar.mWho : null);
            int[] iArr = this.f3394;
            int i8 = i7 + 1;
            iArr[i7] = aVar2.f3725;
            int i9 = i8 + 1;
            iArr[i8] = aVar2.f3726;
            int i10 = i9 + 1;
            iArr[i9] = aVar2.f3727;
            iArr[i10] = aVar2.f3728;
            this.f3396[i5] = aVar2.f3729.ordinal();
            this.f3397[i5] = aVar2.f3730.ordinal();
            i5++;
            i6 = i10 + 1;
        }
        this.f3398 = aVar.f3711;
        this.f3399 = aVar.f3714;
        this.f3400 = aVar.f3393;
        this.f3401 = aVar.f3715;
        this.f3402 = aVar.f3716;
        this.f3403 = aVar.f3717;
        this.f3404 = aVar.f3718;
        this.f3405 = aVar.f3719;
        this.f3406 = aVar.f3720;
        this.f3407 = aVar.f3721;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeIntArray(this.f3394);
        parcel.writeStringList(this.f3395);
        parcel.writeIntArray(this.f3396);
        parcel.writeIntArray(this.f3397);
        parcel.writeInt(this.f3398);
        parcel.writeString(this.f3399);
        parcel.writeInt(this.f3400);
        parcel.writeInt(this.f3401);
        TextUtils.writeToParcel(this.f3402, parcel, 0);
        parcel.writeInt(this.f3403);
        TextUtils.writeToParcel(this.f3404, parcel, 0);
        parcel.writeStringList(this.f3405);
        parcel.writeStringList(this.f3406);
        parcel.writeInt(this.f3407 ? 1 : 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public androidx.fragment.app.a m3965(n nVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(nVar);
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.f3394.length) {
            v.a aVar2 = new v.a();
            int i7 = i5 + 1;
            aVar2.f3723 = this.f3394[i5];
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i6 + " base fragment #" + this.f3394[i7]);
            }
            String str = this.f3395.get(i6);
            if (str != null) {
                aVar2.f3724 = nVar.m4174(str);
            } else {
                aVar2.f3724 = null;
            }
            aVar2.f3729 = l.b.values()[this.f3396[i6]];
            aVar2.f3730 = l.b.values()[this.f3397[i6]];
            int[] iArr = this.f3394;
            int i8 = i7 + 1;
            int i9 = iArr[i7];
            aVar2.f3725 = i9;
            int i10 = i8 + 1;
            int i11 = iArr[i8];
            aVar2.f3726 = i11;
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            aVar2.f3727 = i13;
            int i14 = iArr[i12];
            aVar2.f3728 = i14;
            aVar.f3707 = i9;
            aVar.f3708 = i11;
            aVar.f3709 = i13;
            aVar.f3710 = i14;
            aVar.m4339(aVar2);
            i6++;
            i5 = i12 + 1;
        }
        aVar.f3711 = this.f3398;
        aVar.f3714 = this.f3399;
        aVar.f3393 = this.f3400;
        aVar.f3712 = true;
        aVar.f3715 = this.f3401;
        aVar.f3716 = this.f3402;
        aVar.f3717 = this.f3403;
        aVar.f3718 = this.f3404;
        aVar.f3719 = this.f3405;
        aVar.f3720 = this.f3406;
        aVar.f3721 = this.f3407;
        aVar.m3953(1);
        return aVar;
    }

    public b(Parcel parcel) {
        this.f3394 = parcel.createIntArray();
        this.f3395 = parcel.createStringArrayList();
        this.f3396 = parcel.createIntArray();
        this.f3397 = parcel.createIntArray();
        this.f3398 = parcel.readInt();
        this.f3399 = parcel.readString();
        this.f3400 = parcel.readInt();
        this.f3401 = parcel.readInt();
        this.f3402 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3403 = parcel.readInt();
        this.f3404 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3405 = parcel.createStringArrayList();
        this.f3406 = parcel.createStringArrayList();
        this.f3407 = parcel.readInt() != 0;
    }
}
