package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ProfileTranscoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class o {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final byte[] f3953 = {112, 114, 111, 0};

    /* renamed from: ʼ, reason: contains not printable characters */
    static final byte[] f3954 = {112, 114, 109, 0};

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m4603(e eVar) {
        Iterator<Map.Entry<Integer, Integer>> it = eVar.f3935.entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 |= it.next().getValue().intValue();
        }
        return i5;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static void m4604(OutputStream outputStream, e eVar) throws IOException {
        int i5 = 0;
        for (int i6 : eVar.f3934) {
            Integer valueOf = Integer.valueOf(i6);
            f.m4586(outputStream, valueOf.intValue() - i5);
            i5 = valueOf.intValue();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static byte[] m4605(e[] eVarArr, byte[] bArr) throws IOException {
        int i5 = 0;
        int i6 = 0;
        for (e eVar : eVarArr) {
            i6 += f.m4581(m4621(eVar.f3927, eVar.f3928, bArr)) + 16 + (eVar.f3931 * 2) + eVar.f3932 + m4623(eVar.f3933);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i6);
        if (Arrays.equals(bArr, q.f3967)) {
            int length = eVarArr.length;
            while (i5 < length) {
                e eVar2 = eVarArr[i5];
                m4610(byteArrayOutputStream, eVar2, m4621(eVar2.f3927, eVar2.f3928, bArr));
                m4612(byteArrayOutputStream, eVar2);
                i5++;
            }
        } else {
            for (e eVar3 : eVarArr) {
                m4610(byteArrayOutputStream, eVar3, m4621(eVar3.f3927, eVar3.f3928, bArr));
            }
            int length2 = eVarArr.length;
            while (i5 < length2) {
                m4612(byteArrayOutputStream, eVarArr[i5]);
                i5++;
            }
        }
        if (byteArrayOutputStream.size() == i6) {
            return byteArrayOutputStream.toByteArray();
        }
        throw f.m4573("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i6);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    static void m4606(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f3953);
        outputStream.write(bArr);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static r m4607(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            try {
                e eVar = eVarArr[i6];
                f.m4586(byteArrayOutputStream, i6);
                f.m4586(byteArrayOutputStream, eVar.f3931);
                i5 = i5 + 2 + 2 + (eVar.f3931 * 2);
                m4604(byteArrayOutputStream, eVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            r rVar = new r(g.CLASSES, i5, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw f.m4573("Expected size " + i5 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static r m4608(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f.m4586(byteArrayOutputStream, eVarArr.length);
            int i5 = 2;
            for (e eVar : eVarArr) {
                f.m4587(byteArrayOutputStream, eVar.f3929);
                f.m4587(byteArrayOutputStream, eVar.f3930);
                f.m4587(byteArrayOutputStream, eVar.f3933);
                String m4621 = m4621(eVar.f3927, eVar.f3928, q.f3965);
                int m4581 = f.m4581(m4621);
                f.m4586(byteArrayOutputStream, m4581);
                i5 = i5 + 4 + 4 + 4 + 2 + (m4581 * 1);
                f.m4584(byteArrayOutputStream, m4621);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i5 == byteArray.length) {
                r rVar = new r(g.DEX_FILES, i5, byteArray, false);
                byteArrayOutputStream.close();
                return rVar;
            }
            throw f.m4573("Expected size " + i5 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static r m4609(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 0;
        for (int i6 = 0; i6 < eVarArr.length; i6++) {
            try {
                e eVar = eVarArr[i6];
                int m4603 = m4603(eVar);
                byte[] m4611 = m4611(eVar);
                byte[] m4613 = m4613(eVar);
                f.m4586(byteArrayOutputStream, i6);
                int length = m4611.length + 2 + m4613.length;
                f.m4587(byteArrayOutputStream, length);
                f.m4586(byteArrayOutputStream, m4603);
                byteArrayOutputStream.write(m4611);
                byteArrayOutputStream.write(m4613);
                i5 = i5 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i5 == byteArray.length) {
            r rVar = new r(g.METHODS, i5, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw f.m4573("Expected size " + i5 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static void m4610(OutputStream outputStream, e eVar, String str) throws IOException {
        f.m4586(outputStream, f.m4581(str));
        f.m4586(outputStream, eVar.f3931);
        f.m4587(outputStream, eVar.f3932);
        f.m4587(outputStream, eVar.f3929);
        f.m4587(outputStream, eVar.f3933);
        f.m4584(outputStream, str);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static byte[] m4611(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m4630(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static void m4612(OutputStream outputStream, e eVar) throws IOException {
        m4614(outputStream, eVar);
        m4604(outputStream, eVar);
        m4630(outputStream, eVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static byte[] m4613(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m4614(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private static void m4614(OutputStream outputStream, e eVar) throws IOException {
        int i5 = 0;
        for (Map.Entry<Integer, Integer> entry : eVar.f3935.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                f.m4586(outputStream, intValue - i5);
                f.m4586(outputStream, 0);
                i5 = intValue;
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static String m4615(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static void m4616(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.m4588(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            int size = eVar.f3935.size() * 4;
            String m4621 = m4621(eVar.f3927, eVar.f3928, q.f3968);
            f.m4586(outputStream, f.m4581(m4621));
            f.m4586(outputStream, eVar.f3934.length);
            f.m4587(outputStream, size);
            f.m4587(outputStream, eVar.f3929);
            f.m4584(outputStream, m4621);
            Iterator<Integer> it = eVar.f3935.keySet().iterator();
            while (it.hasNext()) {
                f.m4586(outputStream, it.next().intValue());
                f.m4586(outputStream, 0);
            }
            for (int i5 : eVar.f3934) {
                f.m4586(outputStream, i5);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static String m4617(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static void m4618(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.m4586(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String m4621 = m4621(eVar.f3927, eVar.f3928, q.f3969);
            f.m4586(outputStream, f.m4581(m4621));
            f.m4586(outputStream, eVar.f3935.size());
            f.m4586(outputStream, eVar.f3934.length);
            f.m4587(outputStream, eVar.f3929);
            f.m4584(outputStream, m4621);
            Iterator<Integer> it = eVar.f3935.keySet().iterator();
            while (it.hasNext()) {
                f.m4586(outputStream, it.next().intValue());
            }
            for (int i5 : eVar.f3934) {
                f.m4586(outputStream, i5);
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static e m4619(e[] eVarArr, String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        String m4617 = m4617(str);
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            if (eVarArr[i5].f3928.equals(m4617)) {
                return eVarArr[i5];
            }
        }
        return null;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private static void m4620(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] m4605 = m4605(eVarArr, q.f3966);
        f.m4588(outputStream, eVarArr.length);
        f.m4583(outputStream, m4605);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static String m4621(String str, String str2, byte[] bArr) {
        String m4650 = q.m4650(bArr);
        if (str.length() <= 0) {
            return m4615(str2, m4650);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m4615(str2, m4650);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + q.m4650(bArr) + str2;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private static void m4622(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] m4605 = m4605(eVarArr, q.f3967);
        f.m4588(outputStream, eVarArr.length);
        f.m4583(outputStream, m4605);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int m4623(int i5) {
        return m4642(i5 * 2) / 8;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private static void m4624(OutputStream outputStream, e[] eVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m4608(eVarArr));
        arrayList.add(m4607(eVarArr));
        arrayList.add(m4609(eVarArr));
        long length2 = q.f3965.length + f3953.length + 4 + (arrayList.size() * 16);
        f.m4587(outputStream, arrayList.size());
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            r rVar = (r) arrayList.get(i5);
            f.m4587(outputStream, rVar.f3972.m4590());
            f.m4587(outputStream, length2);
            if (rVar.f3975) {
                byte[] bArr = rVar.f3974;
                long length3 = bArr.length;
                byte[] m4572 = f.m4572(bArr);
                arrayList2.add(m4572);
                f.m4587(outputStream, m4572.length);
                f.m4587(outputStream, length3);
                length = m4572.length;
            } else {
                arrayList2.add(rVar.f3974);
                f.m4587(outputStream, rVar.f3974.length);
                f.m4587(outputStream, 0L);
                length = rVar.f3974.length;
            }
            length2 += length;
        }
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            outputStream.write((byte[]) arrayList2.get(i6));
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static int m4625(int i5, int i6, int i7) {
        if (i5 == 1) {
            throw f.m4573("HOT methods are not stored in the bitmap");
        }
        if (i5 == 2) {
            return i6;
        }
        if (i5 == 4) {
            return i6 + i7;
        }
        throw f.m4573("Unexpected flag: " + i5);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private static void m4626(OutputStream outputStream, e[] eVarArr) throws IOException {
        m4624(outputStream, eVarArr);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static int[] m4627(InputStream inputStream, int i5) throws IOException {
        int[] iArr = new int[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += f.m4578(inputStream);
            iArr[i7] = i6;
        }
        return iArr;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static int m4628(BitSet bitSet, int i5, int i6) {
        int i7 = bitSet.get(m4625(2, i5, i6)) ? 2 : 0;
        return bitSet.get(m4625(4, i5, i6)) ? i7 | 4 : i7;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static byte[] m4629(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, f.m4574(inputStream, bArr.length))) {
            return f.m4574(inputStream, q.f3966.length);
        }
        throw f.m4573("Invalid magic");
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private static void m4630(OutputStream outputStream, e eVar) throws IOException {
        byte[] bArr = new byte[m4623(eVar.f3933)];
        for (Map.Entry<Integer, Integer> entry : eVar.f3935.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                m4643(bArr, 2, intValue, eVar);
            }
            if ((intValue2 & 4) != 0) {
                m4643(bArr, 4, intValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static void m4631(InputStream inputStream, e eVar) throws IOException {
        int available = inputStream.available() - eVar.f3932;
        int i5 = 0;
        while (inputStream.available() > available) {
            i5 += f.m4578(inputStream);
            eVar.f3935.put(Integer.valueOf(i5), 1);
            for (int m4578 = f.m4578(inputStream); m4578 > 0; m4578--) {
                m4633(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw f.m4573("Read too much data during profile line parse");
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static e[] m4632(InputStream inputStream, byte[] bArr, byte[] bArr2, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, q.f3970)) {
            if (Arrays.equals(q.f3965, bArr2)) {
                throw f.m4573("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m4634(inputStream, bArr, eVarArr);
        }
        if (Arrays.equals(bArr, q.f3971)) {
            return m4637(inputStream, bArr2, eVarArr);
        }
        throw f.m4573("Unsupported meta version");
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static void m4633(InputStream inputStream) throws IOException {
        f.m4578(inputStream);
        int m4580 = f.m4580(inputStream);
        if (m4580 == 6 || m4580 == 7) {
            return;
        }
        while (m4580 > 0) {
            f.m4580(inputStream);
            for (int m45802 = f.m4580(inputStream); m45802 > 0; m45802--) {
                f.m4578(inputStream);
            }
            m4580--;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    static e[] m4634(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (!Arrays.equals(bArr, q.f3970)) {
            throw f.m4573("Unsupported meta version");
        }
        int m4580 = f.m4580(inputStream);
        byte[] m4575 = f.m4575(inputStream, (int) f.m4579(inputStream), (int) f.m4579(inputStream));
        if (inputStream.read() > 0) {
            throw f.m4573("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m4575);
        try {
            e[] m4636 = m4636(byteArrayInputStream, m4580, eVarArr);
            byteArrayInputStream.close();
            return m4636;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    static boolean m4635(OutputStream outputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, q.f3965)) {
            m4626(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f3966)) {
            m4620(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f3968)) {
            m4616(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, q.f3967)) {
            m4622(outputStream, eVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, q.f3969)) {
            return false;
        }
        m4618(outputStream, eVarArr);
        return true;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static e[] m4636(InputStream inputStream, int i5, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i5 != eVarArr.length) {
            throw f.m4573("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m4578 = f.m4578(inputStream);
            iArr[i6] = f.m4578(inputStream);
            strArr[i6] = f.m4576(inputStream, m4578);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            e eVar = eVarArr[i7];
            if (!eVar.f3928.equals(strArr[i7])) {
                throw f.m4573("Order of dexfiles in metadata did not match baseline");
            }
            int i8 = iArr[i7];
            eVar.f3931 = i8;
            eVar.f3934 = m4627(inputStream, i8);
        }
        return eVarArr;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    static e[] m4637(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        int m4578 = f.m4578(inputStream);
        byte[] m4575 = f.m4575(inputStream, (int) f.m4579(inputStream), (int) f.m4579(inputStream));
        if (inputStream.read() > 0) {
            throw f.m4573("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m4575);
        try {
            e[] m4638 = m4638(byteArrayInputStream, bArr, m4578, eVarArr);
            byteArrayInputStream.close();
            return m4638;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static e[] m4638(InputStream inputStream, byte[] bArr, int i5, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i5 != eVarArr.length) {
            throw f.m4573("Mismatched number of dex files found in metadata");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            f.m4578(inputStream);
            String m4576 = f.m4576(inputStream, f.m4578(inputStream));
            long m4579 = f.m4579(inputStream);
            int m4578 = f.m4578(inputStream);
            e m4619 = m4619(eVarArr, m4576);
            if (m4619 == null) {
                throw f.m4573("Missing profile key: " + m4576);
            }
            m4619.f3930 = m4579;
            int[] m4627 = m4627(inputStream, m4578);
            if (Arrays.equals(bArr, q.f3969)) {
                m4619.f3931 = m4578;
                m4619.f3934 = m4627;
            }
        }
        return eVarArr;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static void m4639(InputStream inputStream, e eVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(f.m4574(inputStream, f.m4571(eVar.f3933 * 2)));
        int i5 = 0;
        while (true) {
            int i6 = eVar.f3933;
            if (i5 >= i6) {
                return;
            }
            int m4628 = m4628(valueOf, i5, i6);
            if (m4628 != 0) {
                Integer num = eVar.f3935.get(Integer.valueOf(i5));
                if (num == null) {
                    num = 0;
                }
                eVar.f3935.put(Integer.valueOf(i5), Integer.valueOf(m4628 | num.intValue()));
            }
            i5++;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static e[] m4640(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, q.f3966)) {
            throw f.m4573("Unsupported version");
        }
        int m4580 = f.m4580(inputStream);
        byte[] m4575 = f.m4575(inputStream, (int) f.m4579(inputStream), (int) f.m4579(inputStream));
        if (inputStream.read() > 0) {
            throw f.m4573("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m4575);
        try {
            e[] m4641 = m4641(byteArrayInputStream, str, m4580);
            byteArrayInputStream.close();
            return m4641;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static e[] m4641(InputStream inputStream, String str, int i5) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        e[] eVarArr = new e[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int m4578 = f.m4578(inputStream);
            int m45782 = f.m4578(inputStream);
            long m4579 = f.m4579(inputStream);
            eVarArr[i6] = new e(str, f.m4576(inputStream, m4578), f.m4579(inputStream), 0L, m45782, (int) m4579, (int) f.m4579(inputStream), new int[m45782], new TreeMap());
        }
        for (int i7 = 0; i7 < i5; i7++) {
            e eVar = eVarArr[i7];
            m4631(inputStream, eVar);
            eVar.f3934 = m4627(inputStream, eVar.f3931);
            m4639(inputStream, eVar);
        }
        return eVarArr;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static int m4642(int i5) {
        return ((i5 + 8) - 1) & (-8);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static void m4643(byte[] bArr, int i5, int i6, e eVar) {
        int m4625 = m4625(i5, i6, eVar.f3933);
        int i7 = m4625 / 8;
        bArr[i7] = (byte) ((1 << (m4625 % 8)) | bArr[i7]);
    }
}
