package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final InternalRewinder f5212;

    private static final class InternalRewinder {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ParcelFileDescriptor f5213;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f5213 = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f5213.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f5213;
            } catch (ErrnoException e5) {
                throw new IOException(e5);
            }
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public Class<ParcelFileDescriptor> mo6129() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> mo6130(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5212 = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m6125() {
        return Build.VERSION.SDK_INT >= 21 && !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo6126() throws IOException {
        return this.f5212.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo6127() {
    }
}
