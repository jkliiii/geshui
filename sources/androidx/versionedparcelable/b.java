package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final SparseIntArray f4695;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Parcel f4696;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f4697;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f4698;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final String f4699;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f4700;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f4701;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f4702;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new m.a(), new m.a(), new m.a());
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ʻ */
    public void mo5516() {
        int i5 = this.f4700;
        if (i5 >= 0) {
            int i6 = this.f4695.get(i5);
            int dataPosition = this.f4696.dataPosition();
            this.f4696.setDataPosition(i6);
            this.f4696.writeInt(dataPosition - i6);
            this.f4696.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ʻʻ */
    protected void mo5517(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4696, 0);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ʼ */
    protected a mo5518() {
        Parcel parcel = this.f4696;
        int dataPosition = parcel.dataPosition();
        int i5 = this.f4701;
        if (i5 == this.f4697) {
            i5 = this.f4698;
        }
        return new b(parcel, dataPosition, i5, this.f4699 + "  ", this.f4692, this.f4693, this.f4694);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ʼʼ */
    public void mo5519(int i5) {
        this.f4696.writeInt(i5);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ʾʾ */
    public void mo5521(Parcelable parcelable) {
        this.f4696.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ˆˆ */
    public void mo5524(String str) {
        this.f4696.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ˈ */
    public boolean mo5525() {
        return this.f4696.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ˊ */
    public byte[] mo5529() {
        int readInt = this.f4696.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4696.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ˎ */
    protected CharSequence mo5533() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4696);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ˑ */
    public boolean mo5535(int i5) {
        while (this.f4701 < this.f4698) {
            int i6 = this.f4702;
            if (i6 == i5) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            this.f4696.setDataPosition(this.f4701);
            int readInt = this.f4696.readInt();
            this.f4702 = this.f4696.readInt();
            this.f4701 += readInt;
        }
        return this.f4702 == i5;
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ـ */
    public int mo5537() {
        return this.f4696.readInt();
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ᐧ */
    public <T extends Parcelable> T mo5540() {
        return (T) this.f4696.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ᐧᐧ */
    public void mo5541(byte[] bArr) {
        if (bArr == null) {
            this.f4696.writeInt(-1);
        } else {
            this.f4696.writeInt(bArr.length);
            this.f4696.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ᵎ */
    public String mo5544() {
        return this.f4696.readString();
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ﹳ */
    public void mo5548(int i5) {
        mo5516();
        this.f4700 = i5;
        this.f4695.put(i5, this.f4696.dataPosition());
        mo5519(0);
        mo5519(i5);
    }

    @Override // androidx.versionedparcelable.a
    /* renamed from: ﾞ */
    public void mo5550(boolean z5) {
        this.f4696.writeInt(z5 ? 1 : 0);
    }

    private b(Parcel parcel, int i5, int i6, String str, m.a<String, Method> aVar, m.a<String, Method> aVar2, m.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4695 = new SparseIntArray();
        this.f4700 = -1;
        this.f4702 = -1;
        this.f4696 = parcel;
        this.f4697 = i5;
        this.f4698 = i6;
        this.f4701 = i5;
        this.f4699 = str;
    }
}
