package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.f;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: ExifInterface.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static final d[] f3296;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static final d[] f3297;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static final d[] f3298;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private static final d[] f3299;

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private static final d[] f3300;

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private static final d f3301;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private static final d[] f3302;

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private static final d[] f3303;

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private static final d[] f3304;

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private static final d[] f3305;

    /* renamed from: ʻˏ, reason: contains not printable characters */
    static final d[][] f3306;

    /* renamed from: ʻˑ, reason: contains not printable characters */
    private static final d[] f3307;

    /* renamed from: ʻי, reason: contains not printable characters */
    private static final HashMap<Integer, d>[] f3308;

    /* renamed from: ʻـ, reason: contains not printable characters */
    private static final HashMap<String, d>[] f3309;

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private static final HashSet<String> f3310;

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private static final HashMap<Integer, Integer> f3311;

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    static final Charset f3312;

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    static final byte[] f3313;

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    private static final byte[] f3314;

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    private static final Pattern f3315;

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    private static final Pattern f3316;

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    private static final Pattern f3317;

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    private static final Pattern f3318;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private static SimpleDateFormat f3339;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private static SimpleDateFormat f3341;

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f3348;

    /* renamed from: ʼ, reason: contains not printable characters */
    private FileDescriptor f3349;

    /* renamed from: ʽ, reason: contains not printable characters */
    private AssetManager.AssetInputStream f3350;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f3351;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f3352;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final HashMap<String, c>[] f3353;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Set<Integer> f3354;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ByteOrder f3355;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f3356;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f3357;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f3358;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f3359;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f3360;

    /* renamed from: י, reason: contains not printable characters */
    private byte[] f3361;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f3362;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f3363;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f3364;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f3365;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f3366;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f3367;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static final boolean f3338 = Log.isLoggable("ExifInterface", 3);

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static final List<Integer> f3340 = Arrays.asList(1, 6, 3, 8);

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static final List<Integer> f3342 = Arrays.asList(2, 7, 4, 5);

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final int[] f3344 = {8, 8, 8};

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final int[] f3346 = {4};

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final int[] f3347 = {8};

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    static final byte[] f3334 = {-1, -40, -1};

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private static final byte[] f3335 = {102, 116, 121, 112};

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static final byte[] f3295 = {109, 105, 102, 49};

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static final byte[] f3320 = {104, 101, 105, 99};

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final byte[] f3319 = {79, 76, 89, 77, 80, 0};

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static final byte[] f3322 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static final byte[] f3321 = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: ــ, reason: contains not printable characters */
    private static final byte[] f3332 = {101, 88, 73, 102};

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private static final byte[] f3323 = {73, 72, 68, 82};

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static final byte[] f3325 = {73, 69, 78, 68};

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static final byte[] f3324 = {82, 73, 70, 70};

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private static final byte[] f3327 = {87, 69, 66, 80};

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private static final byte[] f3326 = {69, 88, 73, 70};

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private static final byte[] f3329 = {-99, 1, 42};

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private static final byte[] f3328 = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private static final byte[] f3330 = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private static final byte[] f3337 = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: יי, reason: contains not printable characters */
    private static final byte[] f3331 = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private static final byte[] f3336 = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    static final String[] f3343 = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: ٴٴ, reason: contains not printable characters */
    static final int[] f3333 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    static final byte[] f3345 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.b$b, reason: collision with other inner class name */
    private static class C0044b extends InputStream implements DataInput {

        /* renamed from: ˉ, reason: contains not printable characters */
        private static final ByteOrder f3371 = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: ˊ, reason: contains not printable characters */
        private static final ByteOrder f3372 = ByteOrder.BIG_ENDIAN;

        /* renamed from: ʾ, reason: contains not printable characters */
        final DataInputStream f3373;

        /* renamed from: ʿ, reason: contains not printable characters */
        private ByteOrder f3374;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f3375;

        /* renamed from: ˈ, reason: contains not printable characters */
        private byte[] f3376;

        C0044b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f3373.available();
        }

        @Override // java.io.InputStream
        public void mark(int i5) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f3375++;
            return this.f3373.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f3375++;
            return this.f3373.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f3375++;
            int read = this.f3373.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f3375 += 2;
            return this.f3373.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i5, int i6) throws IOException {
            this.f3375 += i6;
            this.f3373.readFully(bArr, i5, i6);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f3375 += 4;
            int read = this.f3373.read();
            int read2 = this.f3373.read();
            int read3 = this.f3373.read();
            int read4 = this.f3373.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3374;
            if (byteOrder == f3371) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f3372) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f3374);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f3375 += 8;
            int read = this.f3373.read();
            int read2 = this.f3373.read();
            int read3 = this.f3373.read();
            int read4 = this.f3373.read();
            int read5 = this.f3373.read();
            int read6 = this.f3373.read();
            int read7 = this.f3373.read();
            int read8 = this.f3373.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3374;
            if (byteOrder == f3371) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f3372) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f3374);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f3375 += 2;
            int read = this.f3373.read();
            int read2 = this.f3373.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3374;
            if (byteOrder == f3371) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f3372) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f3374);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f3375 += 2;
            return this.f3373.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f3375++;
            return this.f3373.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f3375 += 2;
            int read = this.f3373.read();
            int read2 = this.f3373.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f3374;
            if (byteOrder == f3371) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f3372) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f3374);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i5) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public int m3912() {
            return this.f3375;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public long m3913() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        public void m3914(ByteOrder byteOrder) {
            this.f3374 = byteOrder;
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        public void m3915(int i5) throws IOException {
            int i6 = 0;
            while (i6 < i5) {
                int i7 = i5 - i6;
                int skip = (int) this.f3373.skip(i7);
                if (skip <= 0) {
                    if (this.f3376 == null) {
                        this.f3376 = new byte[8192];
                    }
                    skip = this.f3373.read(this.f3376, 0, Math.min(8192, i7));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i5 + " bytes.");
                    }
                }
                i6 += skip;
            }
            this.f3375 += i6;
        }

        C0044b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        C0044b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f3374 = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3373 = dataInputStream;
            dataInputStream.mark(0);
            this.f3375 = 0;
            this.f3374 = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) throws IOException {
            int read = this.f3373.read(bArr, i5, i6);
            this.f3375 += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f3375 += bArr.length;
            this.f3373.readFully(bArr);
        }
    }

    /* compiled from: ExifInterface.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int f3377;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final int f3378;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final long f3379;

        /* renamed from: ʾ, reason: contains not printable characters */
        public final byte[] f3380;

        c(int i5, int i6, byte[] bArr) {
            this(i5, i6, -1L, bArr);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public static c m3916(String str) {
            byte[] bytes = (str + (char) 0).getBytes(b.f3312);
            return new c(2, bytes.length, bytes);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static c m3917(long j5, ByteOrder byteOrder) {
            return m3918(new long[]{j5}, byteOrder);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static c m3918(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.f3333[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j5 : jArr) {
                wrap.putInt((int) j5);
            }
            return new c(4, jArr.length, wrap.array());
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static c m3919(e eVar, ByteOrder byteOrder) {
            return m3920(new e[]{eVar}, byteOrder);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static c m3920(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.f3333[5] * eVarArr.length]);
            wrap.order(byteOrder);
            for (e eVar : eVarArr) {
                wrap.putInt((int) eVar.f3385);
                wrap.putInt((int) eVar.f3386);
            }
            return new c(5, eVarArr.length, wrap.array());
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static c m3921(int i5, ByteOrder byteOrder) {
            return m3922(new int[]{i5}, byteOrder);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public static c m3922(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.f3333[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i5 : iArr) {
                wrap.putShort((short) i5);
            }
            return new c(3, iArr.length, wrap.array());
        }

        public String toString() {
            return "(" + b.f3343[this.f3377] + ", data length:" + this.f3380.length + ")";
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public double m3923(ByteOrder byteOrder) {
            Object m3926 = m3926(byteOrder);
            if (m3926 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m3926 instanceof String) {
                return Double.parseDouble((String) m3926);
            }
            if (m3926 instanceof long[]) {
                if (((long[]) m3926).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m3926 instanceof int[]) {
                if (((int[]) m3926).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m3926 instanceof double[]) {
                double[] dArr = (double[]) m3926;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m3926 instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) m3926;
            if (eVarArr.length == 1) {
                return eVarArr[0].m3928();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public int m3924(ByteOrder byteOrder) {
            Object m3926 = m3926(byteOrder);
            if (m3926 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m3926 instanceof String) {
                return Integer.parseInt((String) m3926);
            }
            if (m3926 instanceof long[]) {
                long[] jArr = (long[]) m3926;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m3926 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m3926;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public String m3925(ByteOrder byteOrder) {
            Object m3926 = m3926(byteOrder);
            if (m3926 == null) {
                return null;
            }
            if (m3926 instanceof String) {
                return (String) m3926;
            }
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            if (m3926 instanceof long[]) {
                long[] jArr = (long[]) m3926;
                while (i5 < jArr.length) {
                    sb.append(jArr[i5]);
                    i5++;
                    if (i5 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m3926 instanceof int[]) {
                int[] iArr = (int[]) m3926;
                while (i5 < iArr.length) {
                    sb.append(iArr[i5]);
                    i5++;
                    if (i5 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m3926 instanceof double[]) {
                double[] dArr = (double[]) m3926;
                while (i5 < dArr.length) {
                    sb.append(dArr[i5]);
                    i5++;
                    if (i5 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(m3926 instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) m3926;
            while (i5 < eVarArr.length) {
                sb.append(eVarArr[i5].f3385);
                sb.append('/');
                sb.append(eVarArr[i5].f3386);
                i5++;
                if (i5 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:409), block:B:168:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: ˎ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m3926(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.b.c.m3926(java.nio.ByteOrder):java.lang.Object");
        }

        c(int i5, int i6, long j5, byte[] bArr) {
            this.f3377 = i5;
            this.f3378 = i6;
            this.f3379 = j5;
            this.f3380 = bArr;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final long f3385;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final long f3386;

        e(long j5, long j6) {
            if (j6 == 0) {
                this.f3385 = 0L;
                this.f3386 = 1L;
            } else {
                this.f3385 = j5;
                this.f3386 = j6;
            }
        }

        public String toString() {
            return this.f3385 + "/" + this.f3386;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public double m3928() {
            double d6 = this.f3385;
            double d7 = this.f3386;
            Double.isNaN(d6);
            Double.isNaN(d7);
            return d6 / d7;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f3296 = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f3297 = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f3298 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f3299 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f3300 = dVarArr5;
        f3301 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f3302 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f3303 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f3304 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f3305 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f3306 = dVarArr10;
        f3307 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f3308 = new HashMap[dVarArr10.length];
        f3309 = new HashMap[dVarArr10.length];
        f3310 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3311 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f3312 = forName;
        f3313 = "Exif\u0000\u0000".getBytes(forName);
        f3314 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f3339 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f3341 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i5 = 0;
        while (true) {
            d[][] dVarArr11 = f3306;
            if (i5 >= dVarArr11.length) {
                HashMap<Integer, Integer> hashMap = f3311;
                d[] dVarArr12 = f3307;
                hashMap.put(Integer.valueOf(dVarArr12[0].f3381), 5);
                hashMap.put(Integer.valueOf(dVarArr12[1].f3381), 1);
                hashMap.put(Integer.valueOf(dVarArr12[2].f3381), 2);
                hashMap.put(Integer.valueOf(dVarArr12[3].f3381), 3);
                hashMap.put(Integer.valueOf(dVarArr12[4].f3381), 7);
                hashMap.put(Integer.valueOf(dVarArr12[5].f3381), 8);
                f3315 = Pattern.compile(".*[1-9].*");
                f3316 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f3317 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f3318 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f3308[i5] = new HashMap<>();
            f3309[i5] = new HashMap<>();
            for (d dVar : dVarArr11[i5]) {
                f3308[i5].put(Integer.valueOf(dVar.f3381), dVar);
                f3309[i5].put(dVar.f3382, dVar);
            }
            i5++;
        }
    }

    public b(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3872() {
        String m3910 = m3910("DateTimeOriginal");
        if (m3910 != null && m3910("DateTime") == null) {
            this.f3353[0].put("DateTime", c.m3916(m3910));
        }
        if (m3910("ImageWidth") == null) {
            this.f3353[0].put("ImageWidth", c.m3917(0L, this.f3355));
        }
        if (m3910("ImageLength") == null) {
            this.f3353[0].put("ImageLength", c.m3917(0L, this.f3355));
        }
        if (m3910("Orientation") == null) {
            this.f3353[0].put("Orientation", c.m3917(0L, this.f3355));
        }
        if (m3910("LightSource") == null) {
            this.f3353[1].put("LightSource", c.m3917(0L, this.f3355));
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m3873(C0044b c0044b) throws IOException {
        ByteOrder m3874 = m3874(c0044b);
        this.f3355 = m3874;
        c0044b.m3914(m3874);
        int readUnsignedShort = c0044b.readUnsignedShort();
        int i5 = this.f3351;
        if (i5 != 7 && i5 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c0044b.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i6 = readInt - 8;
        if (i6 > 0) {
            c0044b.m3915(i6);
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private ByteOrder m3874(C0044b c0044b) throws IOException {
        short readShort = c0044b.readShort();
        if (readShort == 18761) {
            if (f3338) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f3338) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m3875() {
        for (int i5 = 0; i5 < this.f3353.length; i5++) {
            Log.d("ExifInterface", "The size of tag group[" + i5 + "]: " + this.f3353[i5].size());
            for (Map.Entry<String, c> entry : this.f3353[i5].entrySet()) {
                c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m3925(this.f3355) + "'");
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private c m3876(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f3338) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i5 = 0; i5 < f3306.length; i5++) {
            c cVar = this.f3353[i5].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0283  */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3877(androidx.exifinterface.media.b.f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.b.m3877(androidx.exifinterface.media.b$f, int):void");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m3878(f fVar) throws IOException {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                f.b.m3939(mediaMetadataRetriever, new a(fVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f3353[0].put("ImageWidth", c.m3921(Integer.parseInt(str), this.f3355));
                }
                if (str2 != null) {
                    this.f3353[0].put("ImageLength", c.m3921(Integer.parseInt(str2), this.f3355));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f3353[0].put("Orientation", c.m3921(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f3355));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.m3929(parseInt2);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = parseInt2 + 6;
                    int i6 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f3313)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (fVar.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.f3363 = i5;
                    m3879(bArr2, 0);
                }
                if (f3338) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m3879(byte[] bArr, int i5) throws IOException {
        f fVar = new f(bArr);
        m3873(fVar);
        m3877(fVar, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
    
        r22.m3914(r21.f3355);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[LOOP:0: B:9:0x0038->B:33:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[FALL_THROUGH] */
    /* renamed from: ˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m3880(androidx.exifinterface.media.b.C0044b r22, int r23, int r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.b.m3880(androidx.exifinterface.media.b$b, int, int):void");
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m3881(f fVar, int i5) throws IOException {
        c cVar = this.f3353[i5].get("ImageLength");
        c cVar2 = this.f3353[i5].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = this.f3353[i5].get("JPEGInterchangeFormat");
            c cVar4 = this.f3353[i5].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int m3924 = cVar3.m3924(this.f3355);
            int m39242 = cVar3.m3924(this.f3355);
            fVar.m3929(m3924);
            byte[] bArr = new byte[m39242];
            fVar.read(bArr);
            m3880(new C0044b(bArr), m3924, i5);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private int m3882(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m3902(bArr)) {
            return 4;
        }
        if (m3905(bArr)) {
            return 9;
        }
        if (m3900(bArr)) {
            return 12;
        }
        if (m3903(bArr)) {
            return 7;
        }
        if (m3906(bArr)) {
            return 10;
        }
        if (m3904(bArr)) {
            return 13;
        }
        return m3899(bArr) ? 14 : 0;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static boolean m3883(int i5) {
        return (i5 == 4 || i5 == 9 || i5 == 13 || i5 == 14) ? false : true;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m3884(f fVar) throws IOException {
        int i5;
        int i6;
        m3890(fVar);
        c cVar = this.f3353[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f3380);
            fVar2.m3914(this.f3355);
            byte[] bArr = f3319;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.m3929(0L);
            byte[] bArr3 = f3322;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.m3929(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.m3929(12L);
            }
            m3877(fVar2, 6);
            c cVar2 = this.f3353[7].get("PreviewImageStart");
            c cVar3 = this.f3353[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f3353[5].put("JPEGInterchangeFormat", cVar2);
                this.f3353[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f3353[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.m3926(this.f3355);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i7 = iArr[2];
                int i8 = iArr[0];
                if (i7 <= i8 || (i5 = iArr[3]) <= (i6 = iArr[1])) {
                    return;
                }
                int i9 = (i7 - i8) + 1;
                int i10 = (i5 - i6) + 1;
                if (i9 < i10) {
                    int i11 = i9 + i10;
                    i10 = i11 - i10;
                    i9 = i11 - i10;
                }
                c m3921 = c.m3921(i9, this.f3355);
                c m39212 = c.m3921(i10, this.f3355);
                this.f3353[0].put("ImageWidth", m3921);
                this.f3353[0].put("ImageLength", m39212);
            }
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m3885(C0044b c0044b) throws IOException {
        HashMap<String, c> hashMap = this.f3353[4];
        c cVar = hashMap.get("Compression");
        if (cVar == null) {
            this.f3362 = 6;
            m3895(c0044b, hashMap);
            return;
        }
        int m3924 = cVar.m3924(this.f3355);
        this.f3362 = m3924;
        if (m3924 != 1) {
            if (m3924 == 6) {
                m3895(c0044b, hashMap);
                return;
            } else if (m3924 != 7) {
                return;
            }
        }
        if (m3908(hashMap)) {
            m3897(c0044b, hashMap);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m3886(C0044b c0044b) throws IOException {
        if (f3338) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0044b);
        }
        c0044b.m3914(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f3321;
        c0044b.m3915(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = c0044b.readInt();
                int i5 = length + 4;
                byte[] bArr2 = new byte[4];
                if (c0044b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i6 = i5 + 4;
                if (i6 == 16 && !Arrays.equals(bArr2, f3323)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f3325)) {
                    return;
                }
                if (Arrays.equals(bArr2, f3332)) {
                    byte[] bArr3 = new byte[readInt];
                    if (c0044b.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.f.m3933(bArr2));
                    }
                    int readInt2 = c0044b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f3363 = i6;
                        m3879(bArr3, 0);
                        m3892();
                        m3885(new C0044b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i7 = readInt + 4;
                c0044b.m3915(i7);
                length = i6 + i7;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private void m3887(f fVar, int i5) throws IOException {
        c m3921;
        c m39212;
        c cVar = this.f3353[i5].get("DefaultCropSize");
        c cVar2 = this.f3353[i5].get("SensorTopBorder");
        c cVar3 = this.f3353[i5].get("SensorLeftBorder");
        c cVar4 = this.f3353[i5].get("SensorBottomBorder");
        c cVar5 = this.f3353[i5].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                m3881(fVar, i5);
                return;
            }
            int m3924 = cVar2.m3924(this.f3355);
            int m39242 = cVar4.m3924(this.f3355);
            int m39243 = cVar5.m3924(this.f3355);
            int m39244 = cVar3.m3924(this.f3355);
            if (m39242 <= m3924 || m39243 <= m39244) {
                return;
            }
            c m39213 = c.m3921(m39242 - m3924, this.f3355);
            c m39214 = c.m3921(m39243 - m39244, this.f3355);
            this.f3353[i5].put("ImageLength", m39213);
            this.f3353[i5].put("ImageWidth", m39214);
            return;
        }
        if (cVar.f3377 == 5) {
            e[] eVarArr = (e[]) cVar.m3926(this.f3355);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            m3921 = c.m3919(eVarArr[0], this.f3355);
            m39212 = c.m3919(eVarArr[1], this.f3355);
        } else {
            int[] iArr = (int[]) cVar.m3926(this.f3355);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            m3921 = c.m3921(iArr[0], this.f3355);
            m39212 = c.m3921(iArr[1], this.f3355);
        }
        this.f3353[i5].put("ImageWidth", m3921);
        this.f3353[i5].put("ImageLength", m39212);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m3888(C0044b c0044b) throws IOException {
        boolean z5 = f3338;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0044b);
        }
        c0044b.m3915(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0044b.read(bArr);
        c0044b.read(bArr2);
        c0044b.read(bArr3);
        int i5 = ByteBuffer.wrap(bArr).getInt();
        int i6 = ByteBuffer.wrap(bArr2).getInt();
        int i7 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i6];
        c0044b.m3915(i5 - c0044b.m3912());
        c0044b.read(bArr4);
        m3880(new C0044b(bArr4), i5, 5);
        c0044b.m3915(i7 - c0044b.m3912());
        c0044b.m3914(ByteOrder.BIG_ENDIAN);
        int readInt = c0044b.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i8 = 0; i8 < readInt; i8++) {
            int readUnsignedShort = c0044b.readUnsignedShort();
            int readUnsignedShort2 = c0044b.readUnsignedShort();
            if (readUnsignedShort == f3301.f3381) {
                short readShort = c0044b.readShort();
                short readShort2 = c0044b.readShort();
                c m3921 = c.m3921(readShort, this.f3355);
                c m39212 = c.m3921(readShort2, this.f3355);
                this.f3353[0].put("ImageLength", m3921);
                this.f3353[0].put("ImageWidth", m39212);
                if (f3338) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0044b.m3915(readUnsignedShort2);
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m3889(int i5, int i6) throws IOException {
        if (this.f3353[i5].isEmpty() || this.f3353[i6].isEmpty()) {
            if (f3338) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = this.f3353[i5].get("ImageLength");
        c cVar2 = this.f3353[i5].get("ImageWidth");
        c cVar3 = this.f3353[i6].get("ImageLength");
        c cVar4 = this.f3353[i6].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f3338) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f3338) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m3924 = cVar.m3924(this.f3355);
        int m39242 = cVar2.m3924(this.f3355);
        int m39243 = cVar3.m3924(this.f3355);
        int m39244 = cVar4.m3924(this.f3355);
        if (m3924 >= m39243 || m39242 >= m39244) {
            return;
        }
        HashMap<String, c>[] hashMapArr = this.f3353;
        HashMap<String, c> hashMap = hashMapArr[i5];
        hashMapArr[i5] = hashMapArr[i6];
        hashMapArr[i6] = hashMap;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m3890(f fVar) throws IOException {
        c cVar;
        m3873(fVar);
        m3877(fVar, 0);
        m3887(fVar, 0);
        m3887(fVar, 5);
        m3887(fVar, 4);
        m3892();
        if (this.f3351 != 8 || (cVar = this.f3353[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f3380);
        fVar2.m3914(this.f3355);
        fVar2.m3915(6);
        m3877(fVar2, 9);
        c cVar2 = this.f3353[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f3353[1].put("ColorSpace", cVar2);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m3891(f fVar) throws IOException {
        if (f3338) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        m3890(fVar);
        c cVar = this.f3353[0].get("JpgFromRaw");
        if (cVar != null) {
            m3880(new C0044b(cVar.f3380), (int) cVar.f3379, 5);
        }
        c cVar2 = this.f3353[0].get("ISO");
        c cVar3 = this.f3353[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f3353[1].put("PhotographicSensitivity", cVar2);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m3892() throws IOException {
        m3889(0, 5);
        m3889(0, 4);
        m3889(5, 4);
        c cVar = this.f3353[1].get("PixelXDimension");
        c cVar2 = this.f3353[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f3353[0].put("ImageWidth", cVar);
            this.f3353[0].put("ImageLength", cVar2);
        }
        if (this.f3353[4].isEmpty() && m3909(this.f3353[5])) {
            HashMap<String, c>[] hashMapArr = this.f3353;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m3909(this.f3353[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m3896(0, "ThumbnailOrientation", "Orientation");
        m3896(0, "ThumbnailImageLength", "ImageLength");
        m3896(0, "ThumbnailImageWidth", "ImageWidth");
        m3896(5, "ThumbnailOrientation", "Orientation");
        m3896(5, "ThumbnailImageLength", "ImageLength");
        m3896(5, "ThumbnailImageWidth", "ImageWidth");
        m3896(4, "Orientation", "ThumbnailOrientation");
        m3896(4, "ImageLength", "ThumbnailImageLength");
        m3896(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m3893(f fVar) throws IOException {
        byte[] bArr = f3313;
        fVar.m3915(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f3363 = bArr.length;
        m3879(bArr2, 0);
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m3894(C0044b c0044b) throws IOException {
        if (f3338) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0044b);
        }
        c0044b.m3914(ByteOrder.LITTLE_ENDIAN);
        c0044b.m3915(f3324.length);
        int readInt = c0044b.readInt() + 8;
        byte[] bArr = f3327;
        c0044b.m3915(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0044b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c0044b.readInt();
                int i5 = length + 4 + 4;
                if (Arrays.equals(f3326, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (c0044b.read(bArr3) == readInt2) {
                        this.f3363 = i5;
                        m3879(bArr3, 0);
                        m3885(new C0044b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.f.m3933(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i5 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0044b.m3915(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m3895(C0044b c0044b, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int m3924 = cVar.m3924(this.f3355);
        int m39242 = cVar2.m3924(this.f3355);
        if (this.f3351 == 7) {
            m3924 += this.f3364;
        }
        if (m3924 > 0 && m39242 > 0) {
            this.f3356 = true;
            if (this.f3348 == null && this.f3350 == null && this.f3349 == null) {
                byte[] bArr = new byte[m39242];
                c0044b.skip(m3924);
                c0044b.read(bArr);
                this.f3361 = bArr;
            }
            this.f3359 = m3924;
            this.f3360 = m39242;
        }
        if (f3338) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m3924 + ", length: " + m39242);
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m3896(int i5, String str, String str2) {
        if (this.f3353[i5].isEmpty() || this.f3353[i5].get(str) == null) {
            return;
        }
        HashMap<String, c> hashMap = this.f3353[i5];
        hashMap.put(str2, hashMap.get(str));
        this.f3353[i5].remove(str);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m3897(C0044b c0044b, HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("StripOffsets");
        c cVar2 = (c) hashMap.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] m3934 = androidx.exifinterface.media.f.m3934(cVar.m3926(this.f3355));
        long[] m39342 = androidx.exifinterface.media.f.m3934(cVar2.m3926(this.f3355));
        if (m3934 == null || m3934.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (m39342 == null || m39342.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (m3934.length != m39342.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j5 = 0;
        for (long j6 : m39342) {
            j5 += j6;
        }
        int i5 = (int) j5;
        byte[] bArr = new byte[i5];
        int i6 = 1;
        this.f3358 = true;
        this.f3357 = true;
        this.f3356 = true;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < m3934.length) {
            int i10 = (int) m3934[i7];
            int i11 = (int) m39342[i7];
            if (i7 < m3934.length - i6 && i10 + i11 != m3934[i7 + 1]) {
                this.f3358 = false;
            }
            int i12 = i10 - i8;
            if (i12 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j7 = i12;
            if (c0044b.skip(j7) != j7) {
                Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                return;
            }
            int i13 = i8 + i12;
            byte[] bArr2 = new byte[i11];
            if (c0044b.read(bArr2) != i11) {
                Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                return;
            }
            i8 = i13 + i11;
            System.arraycopy(bArr2, 0, bArr, i9, i11);
            i9 += i11;
            i7++;
            i6 = 1;
        }
        this.f3361 = bArr;
        if (this.f3358) {
            this.f3359 = (int) m3934[0];
            this.f3360 = i5;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static boolean m3898(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f3313;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr3 = f3313;
            if (i5 >= bArr3.length) {
                return true;
            }
            if (bArr2[i5] != bArr3[i5]) {
                return false;
            }
            i5++;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private boolean m3899(byte[] bArr) throws IOException {
        int i5 = 0;
        while (true) {
            byte[] bArr2 = f3324;
            if (i5 >= bArr2.length) {
                int i6 = 0;
                while (true) {
                    byte[] bArr3 = f3327;
                    if (i6 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f3324.length + i6 + 4] != bArr3[i6]) {
                        return false;
                    }
                    i6++;
                }
            } else {
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean m3900(byte[] bArr) throws IOException {
        C0044b c0044b;
        long readInt;
        byte[] bArr2;
        long j5;
        C0044b c0044b2 = null;
        try {
            try {
                c0044b = new C0044b(bArr);
                try {
                    readInt = c0044b.readInt();
                    bArr2 = new byte[4];
                    c0044b.read(bArr2);
                } catch (Exception e5) {
                    e = e5;
                    c0044b2 = c0044b;
                    if (f3338) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (c0044b2 != null) {
                        c0044b2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    c0044b2 = c0044b;
                    if (c0044b2 != null) {
                        c0044b2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
        if (!Arrays.equals(bArr2, f3335)) {
            c0044b.close();
            return false;
        }
        if (readInt == 1) {
            readInt = c0044b.readLong();
            j5 = 16;
            if (readInt < 16) {
                c0044b.close();
                return false;
            }
        } else {
            j5 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j6 = readInt - j5;
        if (j6 < 8) {
            c0044b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z5 = false;
        boolean z6 = false;
        for (long j7 = 0; j7 < j6 / 4; j7++) {
            if (c0044b.read(bArr3) != 4) {
                c0044b.close();
                return false;
            }
            if (j7 != 1) {
                if (Arrays.equals(bArr3, f3295)) {
                    z5 = true;
                } else if (Arrays.equals(bArr3, f3320)) {
                    z6 = true;
                }
                if (z5 && z6) {
                    c0044b.close();
                    return true;
                }
            }
        }
        c0044b.close();
        return false;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m3901(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i5 = 0; i5 < f3306.length; i5++) {
            try {
                try {
                    this.f3353[i5] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e5) {
                    boolean z5 = f3338;
                    if (z5) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e5);
                    }
                    m3872();
                    if (!z5) {
                        return;
                    }
                }
            } finally {
                m3872();
                if (f3338) {
                    m3875();
                }
            }
        }
        if (!this.f3352) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3351 = m3882(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m3883(this.f3351)) {
            f fVar = new f(inputStream);
            if (this.f3352) {
                m3893(fVar);
            } else {
                int i6 = this.f3351;
                if (i6 == 12) {
                    m3878(fVar);
                } else if (i6 == 7) {
                    m3884(fVar);
                } else if (i6 == 10) {
                    m3891(fVar);
                } else {
                    m3890(fVar);
                }
            }
            fVar.m3929(this.f3363);
            m3885(fVar);
        } else {
            C0044b c0044b = new C0044b(inputStream);
            int i7 = this.f3351;
            if (i7 == 4) {
                m3880(c0044b, 0, 0);
            } else if (i7 == 13) {
                m3886(c0044b);
            } else if (i7 == 9) {
                m3888(c0044b);
            } else if (i7 == 14) {
                m3894(c0044b);
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static boolean m3902(byte[] bArr) throws IOException {
        int i5 = 0;
        while (true) {
            byte[] bArr2 = f3334;
            if (i5 >= bArr2.length) {
                return true;
            }
            if (bArr[i5] != bArr2[i5]) {
                return false;
            }
            i5++;
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m3903(byte[] bArr) throws IOException {
        C0044b c0044b;
        C0044b c0044b2 = null;
        try {
            c0044b = new C0044b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m3874 = m3874(c0044b);
            this.f3355 = m3874;
            c0044b.m3914(m3874);
            short readShort = c0044b.readShort();
            boolean z5 = readShort == 20306 || readShort == 21330;
            c0044b.close();
            return z5;
        } catch (Exception unused2) {
            c0044b2 = c0044b;
            if (c0044b2 != null) {
                c0044b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0044b2 = c0044b;
            if (c0044b2 != null) {
                c0044b2.close();
            }
            throw th;
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m3904(byte[] bArr) throws IOException {
        int i5 = 0;
        while (true) {
            byte[] bArr2 = f3321;
            if (i5 >= bArr2.length) {
                return true;
            }
            if (bArr[i5] != bArr2[i5]) {
                return false;
            }
            i5++;
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean m3905(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i5 = 0; i5 < bytes.length; i5++) {
            if (bArr[i5] != bytes[i5]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m3906(byte[] bArr) throws IOException {
        C0044b c0044b;
        C0044b c0044b2 = null;
        try {
            c0044b = new C0044b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m3874 = m3874(c0044b);
            this.f3355 = m3874;
            c0044b.m3914(m3874);
            boolean z5 = c0044b.readShort() == 85;
            c0044b.close();
            return z5;
        } catch (Exception unused2) {
            c0044b2 = c0044b;
            if (c0044b2 != null) {
                c0044b2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0044b2 = c0044b;
            if (c0044b2 != null) {
                c0044b2.close();
            }
            throw th;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static boolean m3907(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                f.a.m3938(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f3338) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean m3908(HashMap hashMap) throws IOException {
        c cVar;
        int m3924;
        c cVar2 = (c) hashMap.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.m3926(this.f3355);
            int[] iArr2 = f3344;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3351 == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((m3924 = cVar.m3924(this.f3355)) == 1 && Arrays.equals(iArr, f3347)) || (m3924 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f3338) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean m3909(HashMap hashMap) throws IOException {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.m3924(this.f3355) <= 512 && cVar2.m3924(this.f3355) <= 512;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public String m3910(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c m3876 = m3876(str);
        if (m3876 != null) {
            if (!f3310.contains(str)) {
                return m3876.m3925(this.f3355);
            }
            if (str.equals("GPSTimeStamp")) {
                int i5 = m3876.f3377;
                if (i5 != 5 && i5 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m3876.f3377);
                    return null;
                }
                e[] eVarArr = (e[]) m3876.m3926(this.f3355);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    e eVar2 = eVarArr[1];
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (eVar.f3385 / eVar.f3386)), Integer.valueOf((int) (eVar2.f3385 / eVar2.f3386)), Integer.valueOf((int) (eVar3.f3385 / eVar3.f3386)));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(m3876.m3923(this.f3355));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m3911(String str, int i5) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c m3876 = m3876(str);
        if (m3876 == null) {
            return i5;
        }
        try {
            return m3876.m3924(this.f3355);
        } catch (NumberFormatException unused) {
            return i5;
        }
    }

    /* compiled from: ExifInterface.java */
    private static class f extends C0044b {
        f(byte[] bArr) throws IOException {
            super(bArr);
            this.f3373.mark(Integer.MAX_VALUE);
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        public void m3929(long j5) throws IOException {
            int i5 = this.f3375;
            if (i5 > j5) {
                this.f3375 = 0;
                this.f3373.reset();
            } else {
                j5 -= i5;
            }
            m3915((int) j5);
        }

        f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f3373.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r3 = this;
            r3.<init>()
            androidx.exifinterface.media.b$d[][] r0 = androidx.exifinterface.media.b.f3306
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r3.f3353 = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r3.f3354 = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r3.f3355 = r0
            if (r4 == 0) goto L6f
            r0 = 0
            r3.f3348 = r0
            r1 = 1
            if (r5 != r1) goto L20
            r5 = 1
            goto L21
        L20:
            r5 = 0
        L21:
            if (r5 == 0) goto L41
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            byte[] r2 = androidx.exifinterface.media.b.f3313
            int r2 = r2.length
            r5.<init>(r4, r2)
            boolean r4 = m3898(r5)
            if (r4 != 0) goto L39
            java.lang.String r4 = "ExifInterface"
            java.lang.String r5 = "Given data does not follow the structure of an Exif-only data."
            android.util.Log.w(r4, r5)
            return
        L39:
            r3.f3352 = r1
            r3.f3350 = r0
            r3.f3349 = r0
            r4 = r5
            goto L6b
        L41:
            boolean r5 = r4 instanceof android.content.res.AssetManager.AssetInputStream
            if (r5 == 0) goto L4d
            r5 = r4
            android.content.res.AssetManager$AssetInputStream r5 = (android.content.res.AssetManager.AssetInputStream) r5
            r3.f3350 = r5
            r3.f3349 = r0
            goto L6b
        L4d:
            boolean r5 = r4 instanceof java.io.FileInputStream
            if (r5 == 0) goto L67
            r5 = r4
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            java.io.FileDescriptor r1 = r5.getFD()
            boolean r1 = m3907(r1)
            if (r1 == 0) goto L67
            r3.f3350 = r0
            java.io.FileDescriptor r5 = r5.getFD()
            r3.f3349 = r5
            goto L6b
        L67:
            r3.f3350 = r0
            r3.f3349 = r0
        L6b:
            r3.m3901(r4)
            return
        L6f:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "inputStream cannot be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.b.<init>(java.io.InputStream, int):void");
    }

    /* compiled from: ExifInterface.java */
    static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int f3381;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final String f3382;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final int f3383;

        /* renamed from: ʾ, reason: contains not printable characters */
        public final int f3384;

        d(String str, int i5, int i6) {
            this.f3382 = str;
            this.f3381 = i5;
            this.f3383 = i6;
            this.f3384 = -1;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m3927(int i5) {
            int i6;
            int i7 = this.f3383;
            if (i7 == 7 || i5 == 7 || i7 == i5 || (i6 = this.f3384) == i5) {
                return true;
            }
            if ((i7 == 4 || i6 == 4) && i5 == 3) {
                return true;
            }
            if ((i7 == 9 || i6 == 9) && i5 == 8) {
                return true;
            }
            return (i7 == 12 || i6 == 12) && i5 == 11;
        }

        d(String str, int i5, int i6, int i7) {
            this.f3382 = str;
            this.f3381 = i5;
            this.f3383 = i6;
            this.f3384 = i7;
        }
    }

    /* compiled from: ExifInterface.java */
    class a extends MediaDataSource {

        /* renamed from: ʾ, reason: contains not printable characters */
        long f3368;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ f f3369;

        a(f fVar) {
            this.f3369 = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j5, byte[] bArr, int i5, int i6) throws IOException {
            if (i6 == 0) {
                return 0;
            }
            if (j5 < 0) {
                return -1;
            }
            try {
                long j6 = this.f3368;
                if (j6 != j5) {
                    if (j6 >= 0 && j5 >= j6 + this.f3369.available()) {
                        return -1;
                    }
                    this.f3369.m3929(j5);
                    this.f3368 = j5;
                }
                if (i6 > this.f3369.available()) {
                    i6 = this.f3369.available();
                }
                int read = this.f3369.read(bArr, i5, i6);
                if (read >= 0) {
                    this.f3368 += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3368 = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
