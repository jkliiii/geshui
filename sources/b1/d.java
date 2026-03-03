package b1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: GifHeaderParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʼ, reason: contains not printable characters */
    private ByteBuffer f4829;

    /* renamed from: ʽ, reason: contains not printable characters */
    private c f4830;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final byte[] f4828 = new byte[256];

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f4831 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m5652() {
        return this.f4830.f4816 != 0;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private int m5653() {
        try {
            return this.f4829.get() & 255;
        } catch (Exception unused) {
            this.f4830.f4816 = 1;
            return 0;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5654() {
        this.f4830.f4818.f4804 = m5663();
        this.f4830.f4818.f4805 = m5663();
        this.f4830.f4818.f4806 = m5663();
        this.f4830.f4818.f4807 = m5663();
        int m5653 = m5653();
        boolean z5 = (m5653 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (m5653 & 7) + 1);
        b bVar = this.f4830.f4818;
        bVar.f4808 = (m5653 & 64) != 0;
        if (z5) {
            bVar.f4814 = m5656(pow);
        } else {
            bVar.f4814 = null;
        }
        this.f4830.f4818.f4813 = this.f4829.position();
        m5666();
        if (m5652()) {
            return;
        }
        c cVar = this.f4830;
        cVar.f4817++;
        cVar.f4819.add(cVar.f4818);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5655() {
        int m5653 = m5653();
        this.f4831 = m5653;
        if (m5653 <= 0) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            try {
                i6 = this.f4831;
                if (i5 >= i6) {
                    return;
                }
                i6 -= i5;
                this.f4829.get(this.f4828, i5, i6);
                i5 += i6;
            } catch (Exception e5) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i5 + " count: " + i6 + " blockSize: " + this.f4831, e5);
                }
                this.f4830.f4816 = 1;
                return;
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int[] m5656(int i5) {
        byte[] bArr = new byte[i5 * 3];
        int[] iArr = null;
        try {
            this.f4829.get(bArr);
            iArr = new int[256];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i6 + 1;
                iArr[i6] = ((bArr[i7] & 255) << 16) | (-16777216) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
                i7 = i10;
                i6 = i11;
            }
        } catch (BufferUnderflowException e5) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e5);
            }
            this.f4830.f4816 = 1;
        }
        return iArr;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5657() {
        m5658(Integer.MAX_VALUE);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m5658(int i5) {
        boolean z5 = false;
        while (!z5 && !m5652() && this.f4830.f4817 <= i5) {
            int m5653 = m5653();
            if (m5653 == 33) {
                int m56532 = m5653();
                if (m56532 == 1) {
                    m5665();
                } else if (m56532 == 249) {
                    this.f4830.f4818 = new b();
                    m5659();
                } else if (m56532 == 254) {
                    m5665();
                } else if (m56532 != 255) {
                    m5665();
                } else {
                    m5655();
                    StringBuilder sb = new StringBuilder();
                    for (int i6 = 0; i6 < 11; i6++) {
                        sb.append((char) this.f4828[i6]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        m5662();
                    } else {
                        m5665();
                    }
                }
            } else if (m5653 == 44) {
                c cVar = this.f4830;
                if (cVar.f4818 == null) {
                    cVar.f4818 = new b();
                }
                m5654();
            } else if (m5653 != 59) {
                this.f4830.f4816 = 1;
            } else {
                z5 = true;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m5659() {
        m5653();
        int m5653 = m5653();
        b bVar = this.f4830.f4818;
        int i5 = (m5653 & 28) >> 2;
        bVar.f4810 = i5;
        if (i5 == 0) {
            bVar.f4810 = 1;
        }
        bVar.f4809 = (m5653 & 1) != 0;
        int m5663 = m5663();
        if (m5663 < 2) {
            m5663 = 10;
        }
        b bVar2 = this.f4830.f4818;
        bVar2.f4812 = m5663 * 10;
        bVar2.f4811 = m5653();
        m5653();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5660() {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < 6; i5++) {
            sb.append((char) m5653());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4830.f4816 = 1;
            return;
        }
        m5661();
        if (!this.f4830.f4822 || m5652()) {
            return;
        }
        c cVar = this.f4830;
        cVar.f4815 = m5656(cVar.f4823);
        c cVar2 = this.f4830;
        cVar2.f4826 = cVar2.f4815[cVar2.f4824];
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m5661() {
        this.f4830.f4820 = m5663();
        this.f4830.f4821 = m5663();
        int m5653 = m5653();
        c cVar = this.f4830;
        cVar.f4822 = (m5653 & 128) != 0;
        cVar.f4823 = (int) Math.pow(2.0d, (m5653 & 7) + 1);
        this.f4830.f4824 = m5653();
        this.f4830.f4825 = m5653();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m5662() {
        do {
            m5655();
            byte[] bArr = this.f4828;
            if (bArr[0] == 1) {
                this.f4830.f4827 = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f4831 <= 0) {
                return;
            }
        } while (!m5652());
    }

    /* renamed from: י, reason: contains not printable characters */
    private int m5663() {
        return this.f4829.getShort();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m5664() {
        this.f4829 = null;
        Arrays.fill(this.f4828, (byte) 0);
        this.f4830 = new c();
        this.f4831 = 0;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m5665() {
        int m5653;
        do {
            m5653 = m5653();
            this.f4829.position(Math.min(this.f4829.position() + m5653, this.f4829.limit()));
        } while (m5653 > 0);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m5666() {
        m5653();
        m5665();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m5667() {
        this.f4829 = null;
        this.f4830 = null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public c m5668() {
        if (this.f4829 == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (m5652()) {
            return this.f4830;
        }
        m5660();
        if (!m5652()) {
            m5657();
            c cVar = this.f4830;
            if (cVar.f4817 < 0) {
                cVar.f4816 = 1;
            }
        }
        return this.f4830;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public d m5669(ByteBuffer byteBuffer) {
        m5664();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4829 = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f4829.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
