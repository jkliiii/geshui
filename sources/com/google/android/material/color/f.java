package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ColorResourcesTableCreator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static byte f5475;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final d f5476 = new d(1, "android");

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Comparator<b> f5477 = new a();

    /* compiled from: ColorResourcesTableCreator.java */
    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f5480 - bVar2.f5480;
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final byte f5478;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final byte f5479;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final short f5480;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final String f5481;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f5482;

        b(int i5, String str, int i6) {
            this.f5481 = str;
            this.f5482 = i6;
            this.f5480 = (short) (65535 & i5);
            this.f5479 = (byte) ((i5 >> 16) & 255);
            this.f5478 = (byte) ((i5 >> 24) & 255);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final e f5483;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final d f5484;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final h f5485 = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: ʾ, reason: contains not printable characters */
        private final h f5486;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final k f5487;

        c(d dVar, List<b> list) {
            this.f5484 = dVar;
            String[] strArr = new String[list.size()];
            for (int i5 = 0; i5 < list.size(); i5++) {
                strArr[i5] = list.get(i5).f5481;
            }
            this.f5486 = new h(true, strArr);
            this.f5487 = new k(list);
            this.f5483 = new e((short) 512, (short) 288, m6458());
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        int m6458() {
            return this.f5485.m6467() + 288 + this.f5486.m6467() + this.f5487.m6476();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m6459(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f5483.m6462(byteArrayOutputStream);
            byteArrayOutputStream.write(f.m6448(this.f5484.f5488));
            char[] charArray = this.f5484.f5489.toCharArray();
            for (int i5 = 0; i5 < 128; i5++) {
                if (i5 < charArray.length) {
                    byteArrayOutputStream.write(f.m6446(charArray[i5]));
                } else {
                    byteArrayOutputStream.write(f.m6446((char) 0));
                }
            }
            byteArrayOutputStream.write(f.m6448(288));
            byteArrayOutputStream.write(f.m6448(0));
            byteArrayOutputStream.write(f.m6448(this.f5485.m6467() + 288));
            byteArrayOutputStream.write(f.m6448(0));
            byteArrayOutputStream.write(f.m6448(0));
            this.f5485.m6468(byteArrayOutputStream);
            this.f5486.m6468(byteArrayOutputStream);
            this.f5487.m6477(byteArrayOutputStream);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f5488;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final String f5489;

        d(int i5, String str) {
            this.f5488 = i5;
            this.f5489 = str;
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final short f5490;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final short f5491;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f5492;

        e(short s5, short s6, int i5) {
            this.f5490 = s5;
            this.f5491 = s6;
            this.f5492 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m6462(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(f.m6449(this.f5490));
            byteArrayOutputStream.write(f.m6449(this.f5491));
            byteArrayOutputStream.write(f.m6448(this.f5492));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    /* renamed from: com.google.android.material.color.f$f, reason: collision with other inner class name */
    private static class C0081f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f5493;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5494;

        C0081f(int i5, int i6) {
            this.f5493 = i5;
            this.f5494 = i6;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m6463(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(f.m6449((short) 8));
            byteArrayOutputStream.write(f.m6449((short) 2));
            byteArrayOutputStream.write(f.m6448(this.f5493));
            byteArrayOutputStream.write(f.m6449((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(f.m6448(this.f5494));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final e f5495;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5496;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<c> f5498 = new ArrayList();

        /* renamed from: ʽ, reason: contains not printable characters */
        private final h f5497 = new h(new String[0]);

        g(Map<d, List<b>> map) {
            this.f5496 = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, f.f5477);
                this.f5498.add(new c(entry.getKey(), value));
            }
            this.f5495 = new e((short) 2, (short) 12, m6464());
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private int m6464() {
            Iterator<c> it = this.f5498.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                i5 += it.next().m6458();
            }
            return this.f5497.m6467() + 12 + i5;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m6465(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f5495.m6462(byteArrayOutputStream);
            byteArrayOutputStream.write(f.m6448(this.f5496));
            this.f5497.m6468(byteArrayOutputStream);
            Iterator<c> it = this.f5498.iterator();
            while (it.hasNext()) {
                it.next().m6459(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class h {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final e f5499;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5500;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f5501;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int f5502;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final int f5503;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final List<Integer> f5504;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final List<Integer> f5505;

        /* renamed from: ˉ, reason: contains not printable characters */
        private final List<byte[]> f5506;

        /* renamed from: ˊ, reason: contains not printable characters */
        private final List<List<i>> f5507;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final boolean f5508;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final int f5509;

        /* renamed from: ˏ, reason: contains not printable characters */
        private final int f5510;

        h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private Pair<byte[], List<i>> m6466(String str) {
            return new Pair<>(this.f5508 ? f.m6451(str) : f.m6450(str), Collections.emptyList());
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        int m6467() {
            return this.f5510;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m6468(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f5499.m6462(byteArrayOutputStream);
            byteArrayOutputStream.write(f.m6448(this.f5500));
            byteArrayOutputStream.write(f.m6448(this.f5501));
            byteArrayOutputStream.write(f.m6448(this.f5508 ? 256 : 0));
            byteArrayOutputStream.write(f.m6448(this.f5502));
            byteArrayOutputStream.write(f.m6448(this.f5503));
            Iterator<Integer> it = this.f5504.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(f.m6448(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f5505.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(f.m6448(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f5506.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i5 = this.f5509;
            if (i5 > 0) {
                byteArrayOutputStream.write(new byte[i5]);
            }
            Iterator<List<i>> it4 = this.f5507.iterator();
            while (it4.hasNext()) {
                Iterator<i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().m6470(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(f.m6448(-1));
            }
        }

        h(boolean z5, String... strArr) {
            this.f5504 = new ArrayList();
            this.f5505 = new ArrayList();
            this.f5506 = new ArrayList();
            this.f5507 = new ArrayList();
            this.f5508 = z5;
            int i5 = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> m6466 = m6466(str);
                this.f5504.add(Integer.valueOf(i5));
                Object obj = m6466.first;
                i5 += ((byte[]) obj).length;
                this.f5506.add((byte[]) obj);
                this.f5507.add((List) m6466.second);
            }
            int i6 = 0;
            for (List<i> list : this.f5507) {
                for (i iVar : list) {
                    this.f5504.add(Integer.valueOf(i5));
                    i5 += iVar.f5511.length;
                    this.f5506.add(iVar.f5511);
                }
                this.f5505.add(Integer.valueOf(i6));
                i6 += (list.size() * 12) + 4;
            }
            int i7 = i5 % 4;
            int i8 = i7 == 0 ? 0 : 4 - i7;
            this.f5509 = i8;
            int size = this.f5506.size();
            this.f5500 = size;
            this.f5501 = this.f5506.size() - strArr.length;
            boolean z6 = this.f5506.size() - strArr.length > 0;
            if (!z6) {
                this.f5505.clear();
                this.f5507.clear();
            }
            int size2 = (size * 4) + 28 + (this.f5505.size() * 4);
            this.f5502 = size2;
            int i9 = i5 + i8;
            this.f5503 = z6 ? size2 + i9 : 0;
            int i10 = size2 + i9 + (z6 ? i6 : 0);
            this.f5510 = i10;
            this.f5499 = new e((short) 1, (short) 28, i10);
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class i {

        /* renamed from: ʻ, reason: contains not printable characters */
        private byte[] f5511;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f5512;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f5513;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f5514;

        private i() {
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m6470(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(f.m6448(this.f5512));
            byteArrayOutputStream.write(f.m6448(this.f5513));
            byteArrayOutputStream.write(f.m6448(this.f5514));
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class j {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final e f5515;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5516;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final byte[] f5517;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int[] f5518;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final C0081f[] f5519;

        j(List<b> list, Set<Short> set, int i5) {
            byte[] bArr = new byte[64];
            this.f5517 = bArr;
            this.f5516 = i5;
            bArr[0] = 64;
            this.f5519 = new C0081f[list.size()];
            for (int i6 = 0; i6 < list.size(); i6++) {
                this.f5519[i6] = new C0081f(i6, list.get(i6).f5482);
            }
            this.f5518 = new int[i5];
            int i7 = 0;
            for (short s5 = 0; s5 < i5; s5 = (short) (s5 + 1)) {
                if (set.contains(Short.valueOf(s5))) {
                    this.f5518[s5] = i7;
                    i7 += 16;
                } else {
                    this.f5518[s5] = -1;
                }
            }
            this.f5515 = new e((short) 513, (short) 84, m6473());
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private int m6471() {
            return m6472() + 84;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private int m6472() {
            return this.f5518.length * 4;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        int m6473() {
            return m6471() + (this.f5519.length * 16);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m6474(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f5515.m6462(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{f.f5475, 0, 0, 0});
            byteArrayOutputStream.write(f.m6448(this.f5516));
            byteArrayOutputStream.write(f.m6448(m6471()));
            byteArrayOutputStream.write(this.f5517);
            for (int i5 : this.f5518) {
                byteArrayOutputStream.write(f.m6448(i5));
            }
            for (C0081f c0081f : this.f5519) {
                c0081f.m6463(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: ColorResourcesTableCreator.java */
    private static class k {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final e f5520;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5521;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int[] f5522;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final j f5523;

        k(List<b> list) {
            this.f5521 = list.get(list.size() - 1).f5480 + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f5480));
            }
            this.f5522 = new int[this.f5521];
            for (short s5 = 0; s5 < this.f5521; s5 = (short) (s5 + 1)) {
                if (hashSet.contains(Short.valueOf(s5))) {
                    this.f5522[s5] = 1073741824;
                }
            }
            this.f5520 = new e((short) 514, (short) 16, m6475());
            this.f5523 = new j(list, hashSet, this.f5521);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private int m6475() {
            return (this.f5521 * 4) + 16;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        int m6476() {
            return m6475() + this.f5523.m6473();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m6477(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f5520.m6462(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{f.f5475, 0, 0, 0});
            byteArrayOutputStream.write(f.m6448(this.f5521));
            for (int i5 : this.f5522) {
                byteArrayOutputStream.write(f.m6448(i5));
            }
            this.f5523.m6474(byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static byte[] m6446(char c6) {
        return new byte[]{(byte) (c6 & 255), (byte) ((c6 >> '\b') & 255)};
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static byte[] m6447(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap hashMap = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f5481 + ", typeId=" + Integer.toHexString(bVar2.f5479 & 255));
            }
            if (bVar2.f5478 == 1) {
                dVar = f5476;
            } else {
                if (bVar2.f5478 != Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f5478));
                }
                dVar = dVar2;
            }
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new ArrayList());
            }
            ((List) hashMap.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b6 = bVar.f5479;
        f5475 = b6;
        if (b6 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new g(hashMap).m6465(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m6448(int i5) {
        return new byte[]{(byte) (i5 & 255), (byte) ((i5 >> 8) & 255), (byte) ((i5 >> 16) & 255), (byte) ((i5 >> 24) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m6449(short s5) {
        return new byte[]{(byte) (s5 & 255), (byte) ((s5 >> 8) & 255)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m6450(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] m6449 = m6449((short) charArray.length);
        bArr[0] = m6449[0];
        bArr[1] = m6449[1];
        for (int i5 = 0; i5 < charArray.length; i5++) {
            byte[] m6446 = m6446(charArray[i5]);
            int i6 = i5 * 2;
            bArr[i6 + 2] = m6446[0];
            bArr[i6 + 3] = m6446[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public static byte[] m6451(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}
