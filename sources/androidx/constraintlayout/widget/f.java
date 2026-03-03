package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.g;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final int[] f1877 = {0, 4, 8};

    /* renamed from: ˈ, reason: contains not printable characters */
    private static SparseIntArray f1878 = new SparseIntArray();

    /* renamed from: ˉ, reason: contains not printable characters */
    private static SparseIntArray f1879 = new SparseIntArray();

    /* renamed from: ʻ, reason: contains not printable characters */
    public String f1880 = BuildConfig.FLAVOR;

    /* renamed from: ʼ, reason: contains not printable characters */
    public int f1881 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private HashMap<String, androidx.constraintlayout.widget.a> f1882 = new HashMap<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f1883 = true;

    /* renamed from: ʿ, reason: contains not printable characters */
    private HashMap<Integer, a> f1884 = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f1885;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f1886;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final d f1887 = new d();

        /* renamed from: ʾ, reason: contains not printable characters */
        public final c f1888 = new c();

        /* renamed from: ʿ, reason: contains not printable characters */
        public final b f1889 = new b();

        /* renamed from: ˆ, reason: contains not printable characters */
        public final e f1890 = new e();

        /* renamed from: ˈ, reason: contains not printable characters */
        public HashMap<String, androidx.constraintlayout.widget.a> f1891 = new HashMap<>();

        /* renamed from: ˉ, reason: contains not printable characters */
        C0023a f1892;

        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.f$a$a, reason: collision with other inner class name */
        static class C0023a {

            /* renamed from: ʻ, reason: contains not printable characters */
            int[] f1893 = new int[10];

            /* renamed from: ʼ, reason: contains not printable characters */
            int[] f1894 = new int[10];

            /* renamed from: ʽ, reason: contains not printable characters */
            int f1895 = 0;

            /* renamed from: ʾ, reason: contains not printable characters */
            int[] f1896 = new int[10];

            /* renamed from: ʿ, reason: contains not printable characters */
            float[] f1897 = new float[10];

            /* renamed from: ˆ, reason: contains not printable characters */
            int f1898 = 0;

            /* renamed from: ˈ, reason: contains not printable characters */
            int[] f1899 = new int[5];

            /* renamed from: ˉ, reason: contains not printable characters */
            String[] f1900 = new String[5];

            /* renamed from: ˊ, reason: contains not printable characters */
            int f1901 = 0;

            /* renamed from: ˋ, reason: contains not printable characters */
            int[] f1902 = new int[4];

            /* renamed from: ˎ, reason: contains not printable characters */
            boolean[] f1903 = new boolean[4];

            /* renamed from: ˏ, reason: contains not printable characters */
            int f1904 = 0;

            C0023a() {
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            void m1872(int i5, float f5) {
                int i6 = this.f1898;
                int[] iArr = this.f1896;
                if (i6 >= iArr.length) {
                    this.f1896 = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1897;
                    this.f1897 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1896;
                int i7 = this.f1898;
                iArr2[i7] = i5;
                float[] fArr2 = this.f1897;
                this.f1898 = i7 + 1;
                fArr2[i7] = f5;
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            void m1873(int i5, int i6) {
                int i7 = this.f1895;
                int[] iArr = this.f1893;
                if (i7 >= iArr.length) {
                    this.f1893 = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1894;
                    this.f1894 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1893;
                int i8 = this.f1895;
                iArr3[i8] = i5;
                int[] iArr4 = this.f1894;
                this.f1895 = i8 + 1;
                iArr4[i8] = i6;
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            void m1874(int i5, String str) {
                int i6 = this.f1901;
                int[] iArr = this.f1899;
                if (i6 >= iArr.length) {
                    this.f1899 = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1900;
                    this.f1900 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1899;
                int i7 = this.f1901;
                iArr2[i7] = i5;
                String[] strArr2 = this.f1900;
                this.f1901 = i7 + 1;
                strArr2[i7] = str;
            }

            /* renamed from: ʾ, reason: contains not printable characters */
            void m1875(int i5, boolean z5) {
                int i6 = this.f1904;
                int[] iArr = this.f1902;
                if (i6 >= iArr.length) {
                    this.f1902 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1903;
                    this.f1903 = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1902;
                int i7 = this.f1904;
                iArr2[i7] = i5;
                boolean[] zArr2 = this.f1903;
                this.f1904 = i7 + 1;
                zArr2[i7] = z5;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˆ, reason: contains not printable characters */
        public void m1867(int i5, ConstraintLayout.b bVar) {
            this.f1885 = i5;
            b bVar2 = this.f1889;
            bVar2.f1943 = bVar.f1783;
            bVar2.f1945 = bVar.f1785;
            bVar2.f1947 = bVar.f1787;
            bVar2.f1949 = bVar.f1789;
            bVar2.f1951 = bVar.f1791;
            bVar2.f1953 = bVar.f1793;
            bVar2.f1955 = bVar.f1795;
            bVar2.f1957 = bVar.f1797;
            bVar2.f1959 = bVar.f1799;
            bVar2.f1961 = bVar.f1801;
            bVar2.f1963 = bVar.f1803;
            bVar2.f1965 = bVar.f1811;
            bVar2.f1967 = bVar.f1813;
            bVar2.f1969 = bVar.f1815;
            bVar2.f1971 = bVar.f1817;
            bVar2.f1973 = bVar.f1782;
            bVar2.f1974 = bVar.f1804;
            bVar2.f1958 = bVar.f1786;
            bVar2.f1960 = bVar.f1805;
            bVar2.f1907 = bVar.f1807;
            bVar2.f1930 = bVar.f1809;
            bVar2.f1928 = bVar.f1822;
            bVar2.f1934 = bVar.f1752;
            bVar2.f1932 = bVar.f1753;
            bVar2.f1939 = bVar.f1779;
            bVar2.f1935 = bVar.f1750;
            bVar2.f1937 = bVar.f1776;
            bVar2.f1931 = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1933 = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f1954 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f1936 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f1940 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f1938 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f1948 = bVar.f1780;
            bVar2.f1970 = bVar.f1792;
            bVar2.f1956 = bVar.f1794;
            bVar2.f1908 = bVar.f1796;
            bVar2.f1972 = bVar.f1798;
            bVar2.f1923 = bVar.f1754;
            bVar2.f1924 = bVar.f1755;
            bVar2.f1909 = bVar.f1800;
            bVar2.f1910 = bVar.f1814;
            bVar2.f1911 = bVar.f1816;
            bVar2.f1912 = bVar.f1818;
            bVar2.f1913 = bVar.f1802;
            bVar2.f1914 = bVar.f1812;
            bVar2.f1915 = bVar.f1820;
            bVar2.f1916 = bVar.f1806;
            bVar2.f1922 = bVar.f1756;
            bVar2.f1950 = bVar.f1821;
            bVar2.f1952 = bVar.f1824;
            bVar2.f1946 = bVar.f1819;
            bVar2.f1964 = bVar.f1823;
            bVar2.f1966 = bVar.f1808;
            bVar2.f1962 = bVar.f1810;
            bVar2.f1968 = bVar.f1751;
            bVar2.f1926 = bVar.f1757;
            bVar2.f1944 = bVar.getMarginEnd();
            this.f1889.f1942 = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˈ, reason: contains not printable characters */
        public void m1868(int i5, g.a aVar) {
            m1867(i5, aVar);
            this.f1887.f1993 = aVar.f2011;
            e eVar = this.f1890;
            eVar.f1997 = aVar.f2014;
            eVar.f1998 = aVar.f2015;
            eVar.f1999 = aVar.f2016;
            eVar.f2000 = aVar.f2017;
            eVar.f2001 = aVar.f2018;
            eVar.f2002 = aVar.f2019;
            eVar.f2003 = aVar.f2020;
            eVar.f2005 = aVar.f2021;
            eVar.f2006 = aVar.f2022;
            eVar.f2007 = aVar.f2023;
            eVar.f2009 = aVar.f2013;
            eVar.f2008 = aVar.f2012;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˉ, reason: contains not printable characters */
        public void m1869(androidx.constraintlayout.widget.d dVar, int i5, g.a aVar) {
            m1868(i5, aVar);
            if (dVar instanceof Barrier) {
                b bVar = this.f1889;
                bVar.f1919 = 1;
                Barrier barrier = (Barrier) dVar;
                bVar.f1917 = barrier.getType();
                this.f1889.f1920 = barrier.getReferencedIds();
                this.f1889.f1918 = barrier.getMargin();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m1870(ConstraintLayout.b bVar) {
            b bVar2 = this.f1889;
            bVar.f1783 = bVar2.f1943;
            bVar.f1785 = bVar2.f1945;
            bVar.f1787 = bVar2.f1947;
            bVar.f1789 = bVar2.f1949;
            bVar.f1791 = bVar2.f1951;
            bVar.f1793 = bVar2.f1953;
            bVar.f1795 = bVar2.f1955;
            bVar.f1797 = bVar2.f1957;
            bVar.f1799 = bVar2.f1959;
            bVar.f1801 = bVar2.f1961;
            bVar.f1803 = bVar2.f1963;
            bVar.f1811 = bVar2.f1965;
            bVar.f1813 = bVar2.f1967;
            bVar.f1815 = bVar2.f1969;
            bVar.f1817 = bVar2.f1971;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f1954;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f1936;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f1940;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f1938;
            bVar.f1808 = bVar2.f1966;
            bVar.f1810 = bVar2.f1962;
            bVar.f1821 = bVar2.f1950;
            bVar.f1824 = bVar2.f1952;
            bVar.f1782 = bVar2.f1973;
            bVar.f1804 = bVar2.f1974;
            bVar.f1805 = bVar2.f1960;
            bVar.f1807 = bVar2.f1907;
            bVar.f1809 = bVar2.f1930;
            bVar.f1786 = bVar2.f1958;
            bVar.f1822 = bVar2.f1928;
            bVar.f1752 = bVar2.f1934;
            bVar.f1792 = bVar2.f1970;
            bVar.f1794 = bVar2.f1956;
            bVar.f1796 = bVar2.f1908;
            bVar.f1798 = bVar2.f1972;
            bVar.f1754 = bVar2.f1923;
            bVar.f1755 = bVar2.f1924;
            bVar.f1800 = bVar2.f1909;
            bVar.f1814 = bVar2.f1910;
            bVar.f1816 = bVar2.f1911;
            bVar.f1818 = bVar2.f1912;
            bVar.f1802 = bVar2.f1913;
            bVar.f1812 = bVar2.f1914;
            bVar.f1820 = bVar2.f1915;
            bVar.f1806 = bVar2.f1916;
            bVar.f1753 = bVar2.f1932;
            bVar.f1779 = bVar2.f1939;
            bVar.f1750 = bVar2.f1935;
            bVar.f1776 = bVar2.f1937;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1931;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1933;
            String str = bVar2.f1922;
            if (str != null) {
                bVar.f1756 = str;
            }
            bVar.f1757 = bVar2.f1926;
            bVar.setMarginStart(bVar2.f1942);
            bVar.setMarginEnd(this.f1889.f1944);
            bVar.m1810();
        }

        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1889.m1876(this.f1889);
            aVar.f1888.m1878(this.f1888);
            aVar.f1887.m1880(this.f1887);
            aVar.f1890.m1882(this.f1890);
            aVar.f1885 = this.f1885;
            aVar.f1892 = this.f1892;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class b {

        /* renamed from: ʻᵢ, reason: contains not printable characters */
        private static SparseIntArray f1905;

        /* renamed from: ʻי, reason: contains not printable characters */
        public int[] f1920;

        /* renamed from: ʻـ, reason: contains not printable characters */
        public String f1921;

        /* renamed from: ʻٴ, reason: contains not printable characters */
        public String f1922;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f1931;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f1933;

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f1906 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean f1927 = false;

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean f1929 = false;

        /* renamed from: ˆ, reason: contains not printable characters */
        public int f1935 = -1;

        /* renamed from: ˈ, reason: contains not printable characters */
        public int f1937 = -1;

        /* renamed from: ˉ, reason: contains not printable characters */
        public float f1939 = -1.0f;

        /* renamed from: ˊ, reason: contains not printable characters */
        public boolean f1941 = true;

        /* renamed from: ˋ, reason: contains not printable characters */
        public int f1943 = -1;

        /* renamed from: ˎ, reason: contains not printable characters */
        public int f1945 = -1;

        /* renamed from: ˏ, reason: contains not printable characters */
        public int f1947 = -1;

        /* renamed from: ˑ, reason: contains not printable characters */
        public int f1949 = -1;

        /* renamed from: י, reason: contains not printable characters */
        public int f1951 = -1;

        /* renamed from: ـ, reason: contains not printable characters */
        public int f1953 = -1;

        /* renamed from: ٴ, reason: contains not printable characters */
        public int f1955 = -1;

        /* renamed from: ᐧ, reason: contains not printable characters */
        public int f1957 = -1;

        /* renamed from: ᴵ, reason: contains not printable characters */
        public int f1959 = -1;

        /* renamed from: ᵎ, reason: contains not printable characters */
        public int f1961 = -1;

        /* renamed from: ᵔ, reason: contains not printable characters */
        public int f1963 = -1;

        /* renamed from: ᵢ, reason: contains not printable characters */
        public int f1965 = -1;

        /* renamed from: ⁱ, reason: contains not printable characters */
        public int f1967 = -1;

        /* renamed from: ﹳ, reason: contains not printable characters */
        public int f1969 = -1;

        /* renamed from: ﹶ, reason: contains not printable characters */
        public int f1971 = -1;

        /* renamed from: ﾞ, reason: contains not printable characters */
        public float f1973 = 0.5f;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        public float f1974 = 0.5f;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        public String f1958 = null;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        public int f1960 = -1;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        public int f1907 = 0;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        public float f1930 = 0.0f;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        public int f1928 = -1;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        public int f1934 = -1;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public int f1932 = -1;

        /* renamed from: ــ, reason: contains not printable characters */
        public int f1954 = 0;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        public int f1936 = 0;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        public int f1940 = 0;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        public int f1938 = 0;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public int f1944 = 0;

        /* renamed from: ˊˊ, reason: contains not printable characters */
        public int f1942 = 0;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        public int f1948 = 0;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        public int f1946 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        public int f1950 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        public int f1964 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: יי, reason: contains not printable characters */
        public int f1952 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        public int f1962 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        public int f1966 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        public int f1968 = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: ﹳﹳ, reason: contains not printable characters */
        public float f1970 = -1.0f;

        /* renamed from: ٴٴ, reason: contains not printable characters */
        public float f1956 = -1.0f;

        /* renamed from: ﹶﹶ, reason: contains not printable characters */
        public int f1972 = 0;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public int f1908 = 0;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public int f1909 = 0;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        public int f1910 = 0;

        /* renamed from: ʻʿ, reason: contains not printable characters */
        public int f1911 = 0;

        /* renamed from: ʻˆ, reason: contains not printable characters */
        public int f1912 = 0;

        /* renamed from: ʻˈ, reason: contains not printable characters */
        public int f1913 = 0;

        /* renamed from: ʻˉ, reason: contains not printable characters */
        public int f1914 = 0;

        /* renamed from: ʻˊ, reason: contains not printable characters */
        public float f1915 = 1.0f;

        /* renamed from: ʻˋ, reason: contains not printable characters */
        public float f1916 = 1.0f;

        /* renamed from: ʻˎ, reason: contains not printable characters */
        public int f1917 = -1;

        /* renamed from: ʻˏ, reason: contains not printable characters */
        public int f1918 = 0;

        /* renamed from: ʻˑ, reason: contains not printable characters */
        public int f1919 = -1;

        /* renamed from: ʻᐧ, reason: contains not printable characters */
        public boolean f1923 = false;

        /* renamed from: ʻᴵ, reason: contains not printable characters */
        public boolean f1924 = false;

        /* renamed from: ʻᵎ, reason: contains not printable characters */
        public boolean f1925 = true;

        /* renamed from: ʻᵔ, reason: contains not printable characters */
        public int f1926 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1905 = sparseIntArray;
            sparseIntArray.append(l.f2378, 24);
            f1905.append(l.f2379, 25);
            f1905.append(l.f2382, 28);
            f1905.append(l.f2383, 29);
            f1905.append(l.f2388, 35);
            f1905.append(l.f2387, 34);
            f1905.append(l.f2361, 4);
            f1905.append(l.f2360, 3);
            f1905.append(l.f2358, 1);
            f1905.append(l.f2395, 6);
            f1905.append(l.f2396, 7);
            f1905.append(l.f2369, 17);
            f1905.append(l.f2370, 18);
            f1905.append(l.f2371, 19);
            f1905.append(l.f2354, 90);
            f1905.append(l.f2338, 26);
            f1905.append(l.f2384, 31);
            f1905.append(l.f2385, 32);
            f1905.append(l.f2368, 10);
            f1905.append(l.f2367, 9);
            f1905.append(l.f2399, 13);
            f1905.append(l.f2402, 16);
            f1905.append(l.f2400, 14);
            f1905.append(l.f2397, 11);
            f1905.append(l.f2401, 15);
            f1905.append(l.f2398, 12);
            f1905.append(l.f2391, 38);
            f1905.append(l.f2376, 37);
            f1905.append(l.f2375, 39);
            f1905.append(l.f2390, 40);
            f1905.append(l.f2374, 20);
            f1905.append(l.f2389, 36);
            f1905.append(l.f2365, 5);
            f1905.append(l.f2377, 91);
            f1905.append(l.f2386, 91);
            f1905.append(l.f2381, 91);
            f1905.append(l.f2359, 91);
            f1905.append(l.f2357, 91);
            f1905.append(l.f2342, 23);
            f1905.append(l.f2344, 27);
            f1905.append(l.f2346, 30);
            f1905.append(l.f2347, 8);
            f1905.append(l.f2343, 33);
            f1905.append(l.f2345, 2);
            f1905.append(l.f2339, 22);
            f1905.append(l.f2341, 21);
            f1905.append(l.f2393, 41);
            f1905.append(l.f2372, 42);
            f1905.append(l.f2356, 41);
            f1905.append(l.f2355, 42);
            f1905.append(l.f2403, 76);
            f1905.append(l.f2362, 61);
            f1905.append(l.f2364, 62);
            f1905.append(l.f2363, 63);
            f1905.append(l.f2394, 69);
            f1905.append(l.f2373, 70);
            f1905.append(l.f2351, 71);
            f1905.append(l.f2349, 72);
            f1905.append(l.f2350, 73);
            f1905.append(l.f2352, 74);
            f1905.append(l.f2348, 75);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1876(b bVar) {
            this.f1906 = bVar.f1906;
            this.f1931 = bVar.f1931;
            this.f1927 = bVar.f1927;
            this.f1933 = bVar.f1933;
            this.f1935 = bVar.f1935;
            this.f1937 = bVar.f1937;
            this.f1939 = bVar.f1939;
            this.f1941 = bVar.f1941;
            this.f1943 = bVar.f1943;
            this.f1945 = bVar.f1945;
            this.f1947 = bVar.f1947;
            this.f1949 = bVar.f1949;
            this.f1951 = bVar.f1951;
            this.f1953 = bVar.f1953;
            this.f1955 = bVar.f1955;
            this.f1957 = bVar.f1957;
            this.f1959 = bVar.f1959;
            this.f1961 = bVar.f1961;
            this.f1963 = bVar.f1963;
            this.f1965 = bVar.f1965;
            this.f1967 = bVar.f1967;
            this.f1969 = bVar.f1969;
            this.f1971 = bVar.f1971;
            this.f1973 = bVar.f1973;
            this.f1974 = bVar.f1974;
            this.f1958 = bVar.f1958;
            this.f1960 = bVar.f1960;
            this.f1907 = bVar.f1907;
            this.f1930 = bVar.f1930;
            this.f1928 = bVar.f1928;
            this.f1934 = bVar.f1934;
            this.f1932 = bVar.f1932;
            this.f1954 = bVar.f1954;
            this.f1936 = bVar.f1936;
            this.f1940 = bVar.f1940;
            this.f1938 = bVar.f1938;
            this.f1944 = bVar.f1944;
            this.f1942 = bVar.f1942;
            this.f1948 = bVar.f1948;
            this.f1946 = bVar.f1946;
            this.f1950 = bVar.f1950;
            this.f1964 = bVar.f1964;
            this.f1952 = bVar.f1952;
            this.f1962 = bVar.f1962;
            this.f1966 = bVar.f1966;
            this.f1968 = bVar.f1968;
            this.f1970 = bVar.f1970;
            this.f1956 = bVar.f1956;
            this.f1972 = bVar.f1972;
            this.f1908 = bVar.f1908;
            this.f1909 = bVar.f1909;
            this.f1910 = bVar.f1910;
            this.f1911 = bVar.f1911;
            this.f1912 = bVar.f1912;
            this.f1913 = bVar.f1913;
            this.f1914 = bVar.f1914;
            this.f1915 = bVar.f1915;
            this.f1916 = bVar.f1916;
            this.f1917 = bVar.f1917;
            this.f1918 = bVar.f1918;
            this.f1919 = bVar.f1919;
            this.f1922 = bVar.f1922;
            int[] iArr = bVar.f1920;
            if (iArr == null || bVar.f1921 != null) {
                this.f1920 = null;
            } else {
                this.f1920 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1921 = bVar.f1921;
            this.f1923 = bVar.f1923;
            this.f1924 = bVar.f1924;
            this.f1925 = bVar.f1925;
            this.f1926 = bVar.f1926;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1877(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2337);
            this.f1927 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = f1905.get(index);
                switch (i6) {
                    case 1:
                        this.f1959 = f.m1850(obtainStyledAttributes, index, this.f1959);
                        break;
                    case 2:
                        this.f1938 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1938);
                        break;
                    case 3:
                        this.f1957 = f.m1850(obtainStyledAttributes, index, this.f1957);
                        break;
                    case 4:
                        this.f1955 = f.m1850(obtainStyledAttributes, index, this.f1955);
                        break;
                    case 5:
                        this.f1958 = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f1928 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1928);
                        break;
                    case 7:
                        this.f1934 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1934);
                        break;
                    case 8:
                        this.f1944 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1944);
                        break;
                    case 9:
                        this.f1971 = f.m1850(obtainStyledAttributes, index, this.f1971);
                        break;
                    case 10:
                        this.f1969 = f.m1850(obtainStyledAttributes, index, this.f1969);
                        break;
                    case 11:
                        this.f1952 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1952);
                        break;
                    case 12:
                        this.f1962 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1962);
                        break;
                    case 13:
                        this.f1946 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1946);
                        break;
                    case 14:
                        this.f1964 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1964);
                        break;
                    case 15:
                        this.f1966 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1966);
                        break;
                    case 16:
                        this.f1950 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1950);
                        break;
                    case 17:
                        this.f1935 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1935);
                        break;
                    case 18:
                        this.f1937 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1937);
                        break;
                    case 19:
                        this.f1939 = obtainStyledAttributes.getFloat(index, this.f1939);
                        break;
                    case 20:
                        this.f1973 = obtainStyledAttributes.getFloat(index, this.f1973);
                        break;
                    case 21:
                        this.f1933 = obtainStyledAttributes.getLayoutDimension(index, this.f1933);
                        break;
                    case 22:
                        this.f1931 = obtainStyledAttributes.getLayoutDimension(index, this.f1931);
                        break;
                    case 23:
                        this.f1954 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1954);
                        break;
                    case 24:
                        this.f1943 = f.m1850(obtainStyledAttributes, index, this.f1943);
                        break;
                    case 25:
                        this.f1945 = f.m1850(obtainStyledAttributes, index, this.f1945);
                        break;
                    case 26:
                        this.f1932 = obtainStyledAttributes.getInt(index, this.f1932);
                        break;
                    case 27:
                        this.f1936 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1936);
                        break;
                    case 28:
                        this.f1947 = f.m1850(obtainStyledAttributes, index, this.f1947);
                        break;
                    case 29:
                        this.f1949 = f.m1850(obtainStyledAttributes, index, this.f1949);
                        break;
                    case 30:
                        this.f1942 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1942);
                        break;
                    case 31:
                        this.f1965 = f.m1850(obtainStyledAttributes, index, this.f1965);
                        break;
                    case 32:
                        this.f1967 = f.m1850(obtainStyledAttributes, index, this.f1967);
                        break;
                    case 33:
                        this.f1940 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1940);
                        break;
                    case 34:
                        this.f1953 = f.m1850(obtainStyledAttributes, index, this.f1953);
                        break;
                    case 35:
                        this.f1951 = f.m1850(obtainStyledAttributes, index, this.f1951);
                        break;
                    case 36:
                        this.f1974 = obtainStyledAttributes.getFloat(index, this.f1974);
                        break;
                    case 37:
                        this.f1956 = obtainStyledAttributes.getFloat(index, this.f1956);
                        break;
                    case 38:
                        this.f1970 = obtainStyledAttributes.getFloat(index, this.f1970);
                        break;
                    case 39:
                        this.f1972 = obtainStyledAttributes.getInt(index, this.f1972);
                        break;
                    case 40:
                        this.f1908 = obtainStyledAttributes.getInt(index, this.f1908);
                        break;
                    case 41:
                        f.m1851(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        f.m1851(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i6) {
                            case 61:
                                this.f1960 = f.m1850(obtainStyledAttributes, index, this.f1960);
                                break;
                            case 62:
                                this.f1907 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1907);
                                break;
                            case 63:
                                this.f1930 = obtainStyledAttributes.getFloat(index, this.f1930);
                                break;
                            default:
                                switch (i6) {
                                    case 69:
                                        this.f1915 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1916 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1917 = obtainStyledAttributes.getInt(index, this.f1917);
                                        break;
                                    case 73:
                                        this.f1918 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1918);
                                        break;
                                    case 74:
                                        this.f1921 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1925 = obtainStyledAttributes.getBoolean(index, this.f1925);
                                        break;
                                    case 76:
                                        this.f1926 = obtainStyledAttributes.getInt(index, this.f1926);
                                        break;
                                    case 77:
                                        this.f1961 = f.m1850(obtainStyledAttributes, index, this.f1961);
                                        break;
                                    case 78:
                                        this.f1963 = f.m1850(obtainStyledAttributes, index, this.f1963);
                                        break;
                                    case 79:
                                        this.f1968 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1968);
                                        break;
                                    case 80:
                                        this.f1948 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1948);
                                        break;
                                    case 81:
                                        this.f1909 = obtainStyledAttributes.getInt(index, this.f1909);
                                        break;
                                    case 82:
                                        this.f1910 = obtainStyledAttributes.getInt(index, this.f1910);
                                        break;
                                    case 83:
                                        this.f1912 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1912);
                                        break;
                                    case 84:
                                        this.f1911 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1911);
                                        break;
                                    case 85:
                                        this.f1914 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1914);
                                        break;
                                    case 86:
                                        this.f1913 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1913);
                                        break;
                                    case 87:
                                        this.f1923 = obtainStyledAttributes.getBoolean(index, this.f1923);
                                        break;
                                    case 88:
                                        this.f1924 = obtainStyledAttributes.getBoolean(index, this.f1924);
                                        break;
                                    case 89:
                                        this.f1922 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1941 = obtainStyledAttributes.getBoolean(index, this.f1941);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1905.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1905.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class c {

        /* renamed from: ـ, reason: contains not printable characters */
        private static SparseIntArray f1975;

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f1976 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f1977 = -1;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f1978 = 0;

        /* renamed from: ʾ, reason: contains not printable characters */
        public String f1979 = null;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f1980 = -1;

        /* renamed from: ˆ, reason: contains not printable characters */
        public int f1981 = 0;

        /* renamed from: ˈ, reason: contains not printable characters */
        public float f1982 = Float.NaN;

        /* renamed from: ˉ, reason: contains not printable characters */
        public int f1983 = -1;

        /* renamed from: ˊ, reason: contains not printable characters */
        public float f1984 = Float.NaN;

        /* renamed from: ˋ, reason: contains not printable characters */
        public float f1985 = Float.NaN;

        /* renamed from: ˎ, reason: contains not printable characters */
        public int f1986 = -1;

        /* renamed from: ˏ, reason: contains not printable characters */
        public String f1987 = null;

        /* renamed from: ˑ, reason: contains not printable characters */
        public int f1988 = -3;

        /* renamed from: י, reason: contains not printable characters */
        public int f1989 = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1975 = sparseIntArray;
            sparseIntArray.append(l.f2416, 1);
            f1975.append(l.f2419, 2);
            f1975.append(l.f2423, 3);
            f1975.append(l.f2415, 4);
            f1975.append(l.f2414, 5);
            f1975.append(l.f2413, 6);
            f1975.append(l.f2417, 7);
            f1975.append(l.f2422, 8);
            f1975.append(l.f2421, 9);
            f1975.append(l.f2420, 10);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1878(c cVar) {
            this.f1976 = cVar.f1976;
            this.f1977 = cVar.f1977;
            this.f1979 = cVar.f1979;
            this.f1980 = cVar.f1980;
            this.f1981 = cVar.f1981;
            this.f1984 = cVar.f1984;
            this.f1982 = cVar.f1982;
            this.f1983 = cVar.f1983;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1879(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2412);
            this.f1976 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f1975.get(index)) {
                    case 1:
                        this.f1984 = obtainStyledAttributes.getFloat(index, this.f1984);
                        break;
                    case 2:
                        this.f1980 = obtainStyledAttributes.getInt(index, this.f1980);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1979 = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f1979 = o.b.f10039[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f1981 = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1977 = f.m1850(obtainStyledAttributes, index, this.f1977);
                        break;
                    case 6:
                        this.f1978 = obtainStyledAttributes.getInteger(index, this.f1978);
                        break;
                    case 7:
                        this.f1982 = obtainStyledAttributes.getFloat(index, this.f1982);
                        break;
                    case 8:
                        this.f1986 = obtainStyledAttributes.getInteger(index, this.f1986);
                        break;
                    case 9:
                        this.f1985 = obtainStyledAttributes.getFloat(index, this.f1985);
                        break;
                    case 10:
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f1989 = resourceId;
                            if (resourceId != -1) {
                                this.f1988 = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i6 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f1987 = string;
                            if (string.indexOf("/") > 0) {
                                this.f1989 = obtainStyledAttributes.getResourceId(index, -1);
                                this.f1988 = -2;
                                break;
                            } else {
                                this.f1988 = -1;
                                break;
                            }
                        } else {
                            this.f1988 = obtainStyledAttributes.getInteger(index, this.f1989);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f1990 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f1991 = 0;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f1992 = 0;

        /* renamed from: ʾ, reason: contains not printable characters */
        public float f1993 = 1.0f;

        /* renamed from: ʿ, reason: contains not printable characters */
        public float f1994 = Float.NaN;

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1880(d dVar) {
            this.f1990 = dVar.f1990;
            this.f1991 = dVar.f1991;
            this.f1993 = dVar.f1993;
            this.f1994 = dVar.f1994;
            this.f1992 = dVar.f1992;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1881(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2437);
            this.f1990 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2439) {
                    this.f1993 = obtainStyledAttributes.getFloat(index, this.f1993);
                } else if (index == l.f2438) {
                    this.f1991 = obtainStyledAttributes.getInt(index, this.f1991);
                    this.f1991 = f.f1877[this.f1991];
                } else if (index == l.f2441) {
                    this.f1992 = obtainStyledAttributes.getInt(index, this.f1992);
                } else if (index == l.f2440) {
                    this.f1994 = obtainStyledAttributes.getFloat(index, this.f1994);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    public static class e {

        /* renamed from: ـ, reason: contains not printable characters */
        private static SparseIntArray f1995;

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f1996 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        public float f1997 = 0.0f;

        /* renamed from: ʽ, reason: contains not printable characters */
        public float f1998 = 0.0f;

        /* renamed from: ʾ, reason: contains not printable characters */
        public float f1999 = 0.0f;

        /* renamed from: ʿ, reason: contains not printable characters */
        public float f2000 = 1.0f;

        /* renamed from: ˆ, reason: contains not printable characters */
        public float f2001 = 1.0f;

        /* renamed from: ˈ, reason: contains not printable characters */
        public float f2002 = Float.NaN;

        /* renamed from: ˉ, reason: contains not printable characters */
        public float f2003 = Float.NaN;

        /* renamed from: ˊ, reason: contains not printable characters */
        public int f2004 = -1;

        /* renamed from: ˋ, reason: contains not printable characters */
        public float f2005 = 0.0f;

        /* renamed from: ˎ, reason: contains not printable characters */
        public float f2006 = 0.0f;

        /* renamed from: ˏ, reason: contains not printable characters */
        public float f2007 = 0.0f;

        /* renamed from: ˑ, reason: contains not printable characters */
        public boolean f2008 = false;

        /* renamed from: י, reason: contains not printable characters */
        public float f2009 = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1995 = sparseIntArray;
            sparseIntArray.append(l.f2464, 1);
            f1995.append(l.f2465, 2);
            f1995.append(l.f2466, 3);
            f1995.append(l.f2462, 4);
            f1995.append(l.f2463, 5);
            f1995.append(l.f2457, 6);
            f1995.append(l.f2458, 7);
            f1995.append(l.f2459, 8);
            f1995.append(l.f2460, 9);
            f1995.append(l.f2467, 10);
            f1995.append(l.f2468, 11);
            f1995.append(l.f2469, 12);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1882(e eVar) {
            this.f1996 = eVar.f1996;
            this.f1997 = eVar.f1997;
            this.f1998 = eVar.f1998;
            this.f1999 = eVar.f1999;
            this.f2000 = eVar.f2000;
            this.f2001 = eVar.f2001;
            this.f2002 = eVar.f2002;
            this.f2003 = eVar.f2003;
            this.f2004 = eVar.f2004;
            this.f2005 = eVar.f2005;
            this.f2006 = eVar.f2006;
            this.f2007 = eVar.f2007;
            this.f2008 = eVar.f2008;
            this.f2009 = eVar.f2009;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m1883(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2456);
            this.f1996 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (f1995.get(index)) {
                    case 1:
                        this.f1997 = obtainStyledAttributes.getFloat(index, this.f1997);
                        break;
                    case 2:
                        this.f1998 = obtainStyledAttributes.getFloat(index, this.f1998);
                        break;
                    case 3:
                        this.f1999 = obtainStyledAttributes.getFloat(index, this.f1999);
                        break;
                    case 4:
                        this.f2000 = obtainStyledAttributes.getFloat(index, this.f2000);
                        break;
                    case 5:
                        this.f2001 = obtainStyledAttributes.getFloat(index, this.f2001);
                        break;
                    case 6:
                        this.f2002 = obtainStyledAttributes.getDimension(index, this.f2002);
                        break;
                    case 7:
                        this.f2003 = obtainStyledAttributes.getDimension(index, this.f2003);
                        break;
                    case 8:
                        this.f2005 = obtainStyledAttributes.getDimension(index, this.f2005);
                        break;
                    case 9:
                        this.f2006 = obtainStyledAttributes.getDimension(index, this.f2006);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2007 = obtainStyledAttributes.getDimension(index, this.f2007);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f2008 = true;
                            this.f2009 = obtainStyledAttributes.getDimension(index, this.f2009);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        this.f2004 = f.m1850(obtainStyledAttributes, index, this.f2004);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f1878.append(l.f2060, 25);
        f1878.append(l.f2061, 26);
        f1878.append(l.f2063, 29);
        f1878.append(l.f2064, 30);
        f1878.append(l.f2070, 36);
        f1878.append(l.f2069, 35);
        f1878.append(l.f2039, 4);
        f1878.append(l.f2038, 3);
        f1878.append(l.f2034, 1);
        f1878.append(l.f2036, 91);
        f1878.append(l.f2035, 92);
        f1878.append(l.f2079, 6);
        f1878.append(l.f2081, 7);
        f1878.append(l.f2046, 17);
        f1878.append(l.f2047, 18);
        f1878.append(l.f2048, 19);
        f1878.append(l.f2030, 99);
        f1878.append(l.f2488, 27);
        f1878.append(l.f2065, 32);
        f1878.append(l.f2066, 33);
        f1878.append(l.f2045, 10);
        f1878.append(l.f2044, 9);
        f1878.append(l.f2085, 13);
        f1878.append(l.f2088, 16);
        f1878.append(l.f2086, 14);
        f1878.append(l.f2082, 11);
        f1878.append(l.f2087, 15);
        f1878.append(l.f2084, 12);
        f1878.append(l.f2073, 40);
        f1878.append(l.f2058, 39);
        f1878.append(l.f2057, 41);
        f1878.append(l.f2072, 42);
        f1878.append(l.f2055, 20);
        f1878.append(l.f2071, 37);
        f1878.append(l.f2043, 5);
        f1878.append(l.f2059, 87);
        f1878.append(l.f2068, 87);
        f1878.append(l.f2062, 87);
        f1878.append(l.f2037, 87);
        f1878.append(l.f2033, 87);
        f1878.append(l.f2497, 24);
        f1878.append(l.f2483, 28);
        f1878.append(l.f2326, 31);
        f1878.append(l.f2299, 8);
        f1878.append(l.f2461, 34);
        f1878.append(l.f2029, 2);
        f1878.append(l.f2494, 23);
        f1878.append(l.f2496, 21);
        f1878.append(l.f2074, 95);
        f1878.append(l.f2049, 96);
        f1878.append(l.f2492, 22);
        f1878.append(l.f2083, 43);
        f1878.append(l.f2487, 44);
        f1878.append(l.f2272, 45);
        f1878.append(l.f2245, 46);
        f1878.append(l.f2191, 60);
        f1878.append(l.f2164, 47);
        f1878.append(l.f2218, 48);
        f1878.append(l.f2056, 49);
        f1878.append(l.f2137, 50);
        f1878.append(l.f2110, 51);
        f1878.append(l.f2407, 52);
        f1878.append(l.f2353, 53);
        f1878.append(l.f2075, 54);
        f1878.append(l.f2050, 55);
        f1878.append(l.f2076, 56);
        f1878.append(l.f2051, 57);
        f1878.append(l.f2077, 58);
        f1878.append(l.f2052, 59);
        f1878.append(l.f2040, 61);
        f1878.append(l.f2042, 62);
        f1878.append(l.f2041, 63);
        f1878.append(l.f2380, 64);
        f1878.append(l.f2098, 65);
        f1878.append(l.f2495, 66);
        f1878.append(l.f2099, 67);
        f1878.append(l.f2091, 79);
        f1878.append(l.f2490, 38);
        f1878.append(l.f2090, 68);
        f1878.append(l.f2078, 69);
        f1878.append(l.f2053, 70);
        f1878.append(l.f2089, 97);
        f1878.append(l.f2493, 71);
        f1878.append(l.f2489, 72);
        f1878.append(l.f2491, 73);
        f1878.append(l.f2434, 74);
        f1878.append(l.f2485, 75);
        f1878.append(l.f2092, 76);
        f1878.append(l.f2067, 77);
        f1878.append(l.f2100, 78);
        f1878.append(l.f2032, 80);
        f1878.append(l.f2031, 81);
        f1878.append(l.f2093, 82);
        f1878.append(l.f2097, 83);
        f1878.append(l.f2096, 84);
        f1878.append(l.f2095, 85);
        f1878.append(l.f2094, 86);
        SparseIntArray sparseIntArray = f1879;
        int i5 = l.f2274;
        sparseIntArray.append(i5, 6);
        f1879.append(i5, 7);
        f1879.append(l.f2212, 27);
        f1879.append(l.f2277, 13);
        f1879.append(l.f2280, 16);
        f1879.append(l.f2278, 14);
        f1879.append(l.f2275, 11);
        f1879.append(l.f2279, 15);
        f1879.append(l.f2276, 12);
        f1879.append(l.f2267, 40);
        f1879.append(l.f2259, 39);
        f1879.append(l.f2258, 41);
        f1879.append(l.f2266, 42);
        f1879.append(l.f2257, 20);
        f1879.append(l.f2265, 37);
        f1879.append(l.f2251, 5);
        f1879.append(l.f2260, 87);
        f1879.append(l.f2264, 87);
        f1879.append(l.f2261, 87);
        f1879.append(l.f2248, 87);
        f1879.append(l.f2247, 87);
        f1879.append(l.f2217, 24);
        f1879.append(l.f2220, 28);
        f1879.append(l.f2232, 31);
        f1879.append(l.f2233, 8);
        f1879.append(l.f2219, 34);
        f1879.append(l.f2221, 2);
        f1879.append(l.f2215, 23);
        f1879.append(l.f2216, 21);
        f1879.append(l.f2268, 95);
        f1879.append(l.f2252, 96);
        f1879.append(l.f2214, 22);
        f1879.append(l.f2222, 43);
        f1879.append(l.f2235, 44);
        f1879.append(l.f2230, 45);
        f1879.append(l.f2231, 46);
        f1879.append(l.f2229, 60);
        f1879.append(l.f2227, 47);
        f1879.append(l.f2228, 48);
        f1879.append(l.f2223, 49);
        f1879.append(l.f2224, 50);
        f1879.append(l.f2225, 51);
        f1879.append(l.f2226, 52);
        f1879.append(l.f2234, 53);
        f1879.append(l.f2269, 54);
        f1879.append(l.f2253, 55);
        f1879.append(l.f2270, 56);
        f1879.append(l.f2254, 57);
        f1879.append(l.f2271, 58);
        f1879.append(l.f2255, 59);
        f1879.append(l.f2250, 62);
        f1879.append(l.f2249, 63);
        f1879.append(l.f2237, 64);
        f1879.append(l.f2292, 65);
        f1879.append(l.f2243, 66);
        f1879.append(l.f2293, 67);
        f1879.append(l.f2283, 79);
        f1879.append(l.f2213, 38);
        f1879.append(l.f2284, 98);
        f1879.append(l.f2282, 68);
        f1879.append(l.f2273, 69);
        f1879.append(l.f2256, 70);
        f1879.append(l.f2241, 71);
        f1879.append(l.f2239, 72);
        f1879.append(l.f2240, 73);
        f1879.append(l.f2242, 74);
        f1879.append(l.f2238, 75);
        f1879.append(l.f2285, 76);
        f1879.append(l.f2263, 77);
        f1879.append(l.f2294, 78);
        f1879.append(l.f2246, 80);
        f1879.append(l.f2244, 81);
        f1879.append(l.f2286, 82);
        f1879.append(l.f2291, 83);
        f1879.append(l.f2290, 84);
        f1879.append(l.f2289, 85);
        f1879.append(l.f2287, 86);
        f1879.append(l.f2281, 97);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int[] m1847(View view, String str) {
        int i5;
        Object m1802;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < split.length) {
            String trim = split[i6].trim();
            try {
                i5 = k.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i5 = 0;
            }
            if (i5 == 0) {
                i5 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i5 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m1802 = ((ConstraintLayout) view.getParent()).m1802(0, trim)) != null && (m1802 instanceof Integer)) {
                i5 = ((Integer) m1802).intValue();
            }
            iArr[i7] = i5;
            i6++;
            i7++;
        }
        return i7 != split.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private a m1848(Context context, AttributeSet attributeSet, boolean z5) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? l.f2211 : l.f2486);
        m1854(context, aVar, obtainStyledAttributes, z5);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private a m1849(int i5) {
        if (!this.f1884.containsKey(Integer.valueOf(i5))) {
            this.f1884.put(Integer.valueOf(i5), new a());
        }
        return this.f1884.get(Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public static int m1850(TypedArray typedArray, int i5, int i6) {
        int resourceId = typedArray.getResourceId(i5, i6);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* renamed from: ـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m1851(java.lang.Object r3, android.content.res.TypedArray r4, int r5, int r6) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r4.peekValue(r5)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6d
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L25
            int r4 = r4.getInt(r5, r2)
            r5 = -4
            r0 = -2
            if (r4 == r5) goto L21
            r5 = -3
            if (r4 == r5) goto L2a
            if (r4 == r0) goto L29
            r5 = -1
            if (r4 == r5) goto L29
            goto L2a
        L21:
            r2 = 1
            r4 = 1
            r2 = -2
            goto L2b
        L25:
            int r4 = r4.getDimensionPixelSize(r5, r2)
        L29:
            r2 = r4
        L2a:
            r4 = 0
        L2b:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r5 == 0) goto L3d
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            if (r6 != 0) goto L38
            r3.width = r2
            r3.f1754 = r4
            goto L6c
        L38:
            r3.height = r2
            r3.f1755 = r4
            goto L6c
        L3d:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.f.b
            if (r5 == 0) goto L4f
            androidx.constraintlayout.widget.f$b r3 = (androidx.constraintlayout.widget.f.b) r3
            if (r6 != 0) goto L4a
            r3.f1931 = r2
            r3.f1923 = r4
            goto L6c
        L4a:
            r3.f1933 = r2
            r3.f1924 = r4
            goto L6c
        L4f:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.f.a.C0023a
            if (r5 == 0) goto L6c
            androidx.constraintlayout.widget.f$a$a r3 = (androidx.constraintlayout.widget.f.a.C0023a) r3
            if (r6 != 0) goto L62
            r5 = 23
            r3.m1873(r5, r2)
            r5 = 80
            r3.m1875(r5, r4)
            goto L6c
        L62:
            r5 = 21
            r3.m1873(r5, r2)
            r5 = 81
            r3.m1875(r5, r4)
        L6c:
            return
        L6d:
            java.lang.String r4 = r4.getString(r5)
            m1852(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.f.m1851(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static void m1852(Object obj, String str, int i5) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    m1853(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f1958 = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0023a) {
                        ((a.C0023a) obj).m1874(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f1794 = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f1792 = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i5 == 0) {
                            bVar3.f1931 = 0;
                            bVar3.f1956 = parseFloat;
                        } else {
                            bVar3.f1933 = 0;
                            bVar3.f1970 = parseFloat;
                        }
                    } else if (obj instanceof a.C0023a) {
                        a.C0023a c0023a = (a.C0023a) obj;
                        if (i5 == 0) {
                            c0023a.m1873(23, 0);
                            c0023a.m1872(39, parseFloat);
                        } else {
                            c0023a.m1873(21, 0);
                            c0023a.m1872(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f1820 = max;
                            bVar4.f1800 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f1806 = max;
                            bVar4.f1814 = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i5 == 0) {
                            bVar5.f1931 = 0;
                            bVar5.f1915 = max;
                            bVar5.f1909 = 2;
                        } else {
                            bVar5.f1933 = 0;
                            bVar5.f1916 = max;
                            bVar5.f1910 = 2;
                        }
                    } else if (obj instanceof a.C0023a) {
                        a.C0023a c0023a2 = (a.C0023a) obj;
                        if (i5 == 0) {
                            c0023a2.m1873(23, 0);
                            c0023a2.m1873(54, 2);
                        } else {
                            c0023a2.m1873(21, 0);
                            c0023a2.m1873(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static void m1853(ConstraintLayout.b bVar, String str) {
        float f5 = Float.NaN;
        int i5 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i6 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i5 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i5 = 1;
                }
                i6 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i6);
                    if (substring2.length() > 0) {
                        f5 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i6, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f5 = i5 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f1786 = str;
        bVar.f1790 = f5;
        bVar.f1788 = i5;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m1854(Context context, a aVar, TypedArray typedArray, boolean z5) {
        if (z5) {
            m1855(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            if (index != l.f2490 && l.f2326 != index && l.f2299 != index) {
                aVar.f1888.f1976 = true;
                aVar.f1889.f1927 = true;
                aVar.f1887.f1990 = true;
                aVar.f1890.f1996 = true;
            }
            switch (f1878.get(index)) {
                case 1:
                    b bVar = aVar.f1889;
                    bVar.f1959 = m1850(typedArray, index, bVar.f1959);
                    break;
                case 2:
                    b bVar2 = aVar.f1889;
                    bVar2.f1938 = typedArray.getDimensionPixelSize(index, bVar2.f1938);
                    break;
                case 3:
                    b bVar3 = aVar.f1889;
                    bVar3.f1957 = m1850(typedArray, index, bVar3.f1957);
                    break;
                case 4:
                    b bVar4 = aVar.f1889;
                    bVar4.f1955 = m1850(typedArray, index, bVar4.f1955);
                    break;
                case 5:
                    aVar.f1889.f1958 = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1889;
                    bVar5.f1928 = typedArray.getDimensionPixelOffset(index, bVar5.f1928);
                    break;
                case 7:
                    b bVar6 = aVar.f1889;
                    bVar6.f1934 = typedArray.getDimensionPixelOffset(index, bVar6.f1934);
                    break;
                case 8:
                    b bVar7 = aVar.f1889;
                    bVar7.f1944 = typedArray.getDimensionPixelSize(index, bVar7.f1944);
                    break;
                case 9:
                    b bVar8 = aVar.f1889;
                    bVar8.f1971 = m1850(typedArray, index, bVar8.f1971);
                    break;
                case 10:
                    b bVar9 = aVar.f1889;
                    bVar9.f1969 = m1850(typedArray, index, bVar9.f1969);
                    break;
                case 11:
                    b bVar10 = aVar.f1889;
                    bVar10.f1952 = typedArray.getDimensionPixelSize(index, bVar10.f1952);
                    break;
                case 12:
                    b bVar11 = aVar.f1889;
                    bVar11.f1962 = typedArray.getDimensionPixelSize(index, bVar11.f1962);
                    break;
                case 13:
                    b bVar12 = aVar.f1889;
                    bVar12.f1946 = typedArray.getDimensionPixelSize(index, bVar12.f1946);
                    break;
                case 14:
                    b bVar13 = aVar.f1889;
                    bVar13.f1964 = typedArray.getDimensionPixelSize(index, bVar13.f1964);
                    break;
                case 15:
                    b bVar14 = aVar.f1889;
                    bVar14.f1966 = typedArray.getDimensionPixelSize(index, bVar14.f1966);
                    break;
                case 16:
                    b bVar15 = aVar.f1889;
                    bVar15.f1950 = typedArray.getDimensionPixelSize(index, bVar15.f1950);
                    break;
                case 17:
                    b bVar16 = aVar.f1889;
                    bVar16.f1935 = typedArray.getDimensionPixelOffset(index, bVar16.f1935);
                    break;
                case 18:
                    b bVar17 = aVar.f1889;
                    bVar17.f1937 = typedArray.getDimensionPixelOffset(index, bVar17.f1937);
                    break;
                case 19:
                    b bVar18 = aVar.f1889;
                    bVar18.f1939 = typedArray.getFloat(index, bVar18.f1939);
                    break;
                case 20:
                    b bVar19 = aVar.f1889;
                    bVar19.f1973 = typedArray.getFloat(index, bVar19.f1973);
                    break;
                case 21:
                    b bVar20 = aVar.f1889;
                    bVar20.f1933 = typedArray.getLayoutDimension(index, bVar20.f1933);
                    break;
                case 22:
                    d dVar = aVar.f1887;
                    dVar.f1991 = typedArray.getInt(index, dVar.f1991);
                    d dVar2 = aVar.f1887;
                    dVar2.f1991 = f1877[dVar2.f1991];
                    break;
                case 23:
                    b bVar21 = aVar.f1889;
                    bVar21.f1931 = typedArray.getLayoutDimension(index, bVar21.f1931);
                    break;
                case 24:
                    b bVar22 = aVar.f1889;
                    bVar22.f1954 = typedArray.getDimensionPixelSize(index, bVar22.f1954);
                    break;
                case 25:
                    b bVar23 = aVar.f1889;
                    bVar23.f1943 = m1850(typedArray, index, bVar23.f1943);
                    break;
                case 26:
                    b bVar24 = aVar.f1889;
                    bVar24.f1945 = m1850(typedArray, index, bVar24.f1945);
                    break;
                case 27:
                    b bVar25 = aVar.f1889;
                    bVar25.f1932 = typedArray.getInt(index, bVar25.f1932);
                    break;
                case 28:
                    b bVar26 = aVar.f1889;
                    bVar26.f1936 = typedArray.getDimensionPixelSize(index, bVar26.f1936);
                    break;
                case 29:
                    b bVar27 = aVar.f1889;
                    bVar27.f1947 = m1850(typedArray, index, bVar27.f1947);
                    break;
                case 30:
                    b bVar28 = aVar.f1889;
                    bVar28.f1949 = m1850(typedArray, index, bVar28.f1949);
                    break;
                case 31:
                    b bVar29 = aVar.f1889;
                    bVar29.f1942 = typedArray.getDimensionPixelSize(index, bVar29.f1942);
                    break;
                case 32:
                    b bVar30 = aVar.f1889;
                    bVar30.f1965 = m1850(typedArray, index, bVar30.f1965);
                    break;
                case 33:
                    b bVar31 = aVar.f1889;
                    bVar31.f1967 = m1850(typedArray, index, bVar31.f1967);
                    break;
                case 34:
                    b bVar32 = aVar.f1889;
                    bVar32.f1940 = typedArray.getDimensionPixelSize(index, bVar32.f1940);
                    break;
                case 35:
                    b bVar33 = aVar.f1889;
                    bVar33.f1953 = m1850(typedArray, index, bVar33.f1953);
                    break;
                case 36:
                    b bVar34 = aVar.f1889;
                    bVar34.f1951 = m1850(typedArray, index, bVar34.f1951);
                    break;
                case 37:
                    b bVar35 = aVar.f1889;
                    bVar35.f1974 = typedArray.getFloat(index, bVar35.f1974);
                    break;
                case 38:
                    aVar.f1885 = typedArray.getResourceId(index, aVar.f1885);
                    break;
                case 39:
                    b bVar36 = aVar.f1889;
                    bVar36.f1956 = typedArray.getFloat(index, bVar36.f1956);
                    break;
                case 40:
                    b bVar37 = aVar.f1889;
                    bVar37.f1970 = typedArray.getFloat(index, bVar37.f1970);
                    break;
                case 41:
                    b bVar38 = aVar.f1889;
                    bVar38.f1972 = typedArray.getInt(index, bVar38.f1972);
                    break;
                case 42:
                    b bVar39 = aVar.f1889;
                    bVar39.f1908 = typedArray.getInt(index, bVar39.f1908);
                    break;
                case 43:
                    d dVar3 = aVar.f1887;
                    dVar3.f1993 = typedArray.getFloat(index, dVar3.f1993);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f1890;
                        eVar.f2008 = true;
                        eVar.f2009 = typedArray.getDimension(index, eVar.f2009);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f1890;
                    eVar2.f1998 = typedArray.getFloat(index, eVar2.f1998);
                    break;
                case 46:
                    e eVar3 = aVar.f1890;
                    eVar3.f1999 = typedArray.getFloat(index, eVar3.f1999);
                    break;
                case 47:
                    e eVar4 = aVar.f1890;
                    eVar4.f2000 = typedArray.getFloat(index, eVar4.f2000);
                    break;
                case 48:
                    e eVar5 = aVar.f1890;
                    eVar5.f2001 = typedArray.getFloat(index, eVar5.f2001);
                    break;
                case 49:
                    e eVar6 = aVar.f1890;
                    eVar6.f2002 = typedArray.getDimension(index, eVar6.f2002);
                    break;
                case 50:
                    e eVar7 = aVar.f1890;
                    eVar7.f2003 = typedArray.getDimension(index, eVar7.f2003);
                    break;
                case 51:
                    e eVar8 = aVar.f1890;
                    eVar8.f2005 = typedArray.getDimension(index, eVar8.f2005);
                    break;
                case 52:
                    e eVar9 = aVar.f1890;
                    eVar9.f2006 = typedArray.getDimension(index, eVar9.f2006);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f1890;
                        eVar10.f2007 = typedArray.getDimension(index, eVar10.f2007);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f1889;
                    bVar40.f1909 = typedArray.getInt(index, bVar40.f1909);
                    break;
                case 55:
                    b bVar41 = aVar.f1889;
                    bVar41.f1910 = typedArray.getInt(index, bVar41.f1910);
                    break;
                case 56:
                    b bVar42 = aVar.f1889;
                    bVar42.f1911 = typedArray.getDimensionPixelSize(index, bVar42.f1911);
                    break;
                case 57:
                    b bVar43 = aVar.f1889;
                    bVar43.f1912 = typedArray.getDimensionPixelSize(index, bVar43.f1912);
                    break;
                case 58:
                    b bVar44 = aVar.f1889;
                    bVar44.f1913 = typedArray.getDimensionPixelSize(index, bVar44.f1913);
                    break;
                case 59:
                    b bVar45 = aVar.f1889;
                    bVar45.f1914 = typedArray.getDimensionPixelSize(index, bVar45.f1914);
                    break;
                case 60:
                    e eVar11 = aVar.f1890;
                    eVar11.f1997 = typedArray.getFloat(index, eVar11.f1997);
                    break;
                case 61:
                    b bVar46 = aVar.f1889;
                    bVar46.f1960 = m1850(typedArray, index, bVar46.f1960);
                    break;
                case 62:
                    b bVar47 = aVar.f1889;
                    bVar47.f1907 = typedArray.getDimensionPixelSize(index, bVar47.f1907);
                    break;
                case 63:
                    b bVar48 = aVar.f1889;
                    bVar48.f1930 = typedArray.getFloat(index, bVar48.f1930);
                    break;
                case 64:
                    c cVar = aVar.f1888;
                    cVar.f1977 = m1850(typedArray, index, cVar.f1977);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1888.f1979 = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1888.f1979 = o.b.f10039[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f1888.f1981 = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1888;
                    cVar2.f1984 = typedArray.getFloat(index, cVar2.f1984);
                    break;
                case 68:
                    d dVar4 = aVar.f1887;
                    dVar4.f1994 = typedArray.getFloat(index, dVar4.f1994);
                    break;
                case 69:
                    aVar.f1889.f1915 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1889.f1916 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1889;
                    bVar49.f1917 = typedArray.getInt(index, bVar49.f1917);
                    break;
                case 73:
                    b bVar50 = aVar.f1889;
                    bVar50.f1918 = typedArray.getDimensionPixelSize(index, bVar50.f1918);
                    break;
                case 74:
                    aVar.f1889.f1921 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1889;
                    bVar51.f1925 = typedArray.getBoolean(index, bVar51.f1925);
                    break;
                case 76:
                    c cVar3 = aVar.f1888;
                    cVar3.f1980 = typedArray.getInt(index, cVar3.f1980);
                    break;
                case 77:
                    aVar.f1889.f1922 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f1887;
                    dVar5.f1992 = typedArray.getInt(index, dVar5.f1992);
                    break;
                case 79:
                    c cVar4 = aVar.f1888;
                    cVar4.f1982 = typedArray.getFloat(index, cVar4.f1982);
                    break;
                case 80:
                    b bVar52 = aVar.f1889;
                    bVar52.f1923 = typedArray.getBoolean(index, bVar52.f1923);
                    break;
                case 81:
                    b bVar53 = aVar.f1889;
                    bVar53.f1924 = typedArray.getBoolean(index, bVar53.f1924);
                    break;
                case 82:
                    c cVar5 = aVar.f1888;
                    cVar5.f1978 = typedArray.getInteger(index, cVar5.f1978);
                    break;
                case 83:
                    e eVar12 = aVar.f1890;
                    eVar12.f2004 = m1850(typedArray, index, eVar12.f2004);
                    break;
                case 84:
                    c cVar6 = aVar.f1888;
                    cVar6.f1986 = typedArray.getInteger(index, cVar6.f1986);
                    break;
                case 85:
                    c cVar7 = aVar.f1888;
                    cVar7.f1985 = typedArray.getFloat(index, cVar7.f1985);
                    break;
                case 86:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        aVar.f1888.f1989 = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f1888;
                        if (cVar8.f1989 != -1) {
                            cVar8.f1988 = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i6 == 3) {
                        aVar.f1888.f1987 = typedArray.getString(index);
                        if (aVar.f1888.f1987.indexOf("/") > 0) {
                            aVar.f1888.f1989 = typedArray.getResourceId(index, -1);
                            aVar.f1888.f1988 = -2;
                            break;
                        } else {
                            aVar.f1888.f1988 = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f1888;
                        cVar9.f1988 = typedArray.getInteger(index, cVar9.f1989);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1878.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1878.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1889;
                    bVar54.f1961 = m1850(typedArray, index, bVar54.f1961);
                    break;
                case 92:
                    b bVar55 = aVar.f1889;
                    bVar55.f1963 = m1850(typedArray, index, bVar55.f1963);
                    break;
                case 93:
                    b bVar56 = aVar.f1889;
                    bVar56.f1948 = typedArray.getDimensionPixelSize(index, bVar56.f1948);
                    break;
                case 94:
                    b bVar57 = aVar.f1889;
                    bVar57.f1968 = typedArray.getDimensionPixelSize(index, bVar57.f1968);
                    break;
                case 95:
                    m1851(aVar.f1889, typedArray, index, 0);
                    break;
                case 96:
                    m1851(aVar.f1889, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1889;
                    bVar58.f1926 = typedArray.getInt(index, bVar58.f1926);
                    break;
            }
        }
        b bVar59 = aVar.f1889;
        if (bVar59.f1921 != null) {
            bVar59.f1920 = null;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static void m1855(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0023a c0023a = new a.C0023a();
        aVar.f1892 = c0023a;
        aVar.f1888.f1976 = false;
        aVar.f1889.f1927 = false;
        aVar.f1887.f1990 = false;
        aVar.f1890.f1996 = false;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            switch (f1879.get(index)) {
                case 2:
                    c0023a.m1873(2, typedArray.getDimensionPixelSize(index, aVar.f1889.f1938));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1878.get(index));
                    break;
                case 5:
                    c0023a.m1874(5, typedArray.getString(index));
                    break;
                case 6:
                    c0023a.m1873(6, typedArray.getDimensionPixelOffset(index, aVar.f1889.f1928));
                    break;
                case 7:
                    c0023a.m1873(7, typedArray.getDimensionPixelOffset(index, aVar.f1889.f1934));
                    break;
                case 8:
                    c0023a.m1873(8, typedArray.getDimensionPixelSize(index, aVar.f1889.f1944));
                    break;
                case 11:
                    c0023a.m1873(11, typedArray.getDimensionPixelSize(index, aVar.f1889.f1952));
                    break;
                case 12:
                    c0023a.m1873(12, typedArray.getDimensionPixelSize(index, aVar.f1889.f1962));
                    break;
                case 13:
                    c0023a.m1873(13, typedArray.getDimensionPixelSize(index, aVar.f1889.f1946));
                    break;
                case 14:
                    c0023a.m1873(14, typedArray.getDimensionPixelSize(index, aVar.f1889.f1964));
                    break;
                case 15:
                    c0023a.m1873(15, typedArray.getDimensionPixelSize(index, aVar.f1889.f1966));
                    break;
                case 16:
                    c0023a.m1873(16, typedArray.getDimensionPixelSize(index, aVar.f1889.f1950));
                    break;
                case 17:
                    c0023a.m1873(17, typedArray.getDimensionPixelOffset(index, aVar.f1889.f1935));
                    break;
                case 18:
                    c0023a.m1873(18, typedArray.getDimensionPixelOffset(index, aVar.f1889.f1937));
                    break;
                case 19:
                    c0023a.m1872(19, typedArray.getFloat(index, aVar.f1889.f1939));
                    break;
                case 20:
                    c0023a.m1872(20, typedArray.getFloat(index, aVar.f1889.f1973));
                    break;
                case 21:
                    c0023a.m1873(21, typedArray.getLayoutDimension(index, aVar.f1889.f1933));
                    break;
                case 22:
                    c0023a.m1873(22, f1877[typedArray.getInt(index, aVar.f1887.f1991)]);
                    break;
                case 23:
                    c0023a.m1873(23, typedArray.getLayoutDimension(index, aVar.f1889.f1931));
                    break;
                case 24:
                    c0023a.m1873(24, typedArray.getDimensionPixelSize(index, aVar.f1889.f1954));
                    break;
                case 27:
                    c0023a.m1873(27, typedArray.getInt(index, aVar.f1889.f1932));
                    break;
                case 28:
                    c0023a.m1873(28, typedArray.getDimensionPixelSize(index, aVar.f1889.f1936));
                    break;
                case 31:
                    c0023a.m1873(31, typedArray.getDimensionPixelSize(index, aVar.f1889.f1942));
                    break;
                case 34:
                    c0023a.m1873(34, typedArray.getDimensionPixelSize(index, aVar.f1889.f1940));
                    break;
                case 37:
                    c0023a.m1872(37, typedArray.getFloat(index, aVar.f1889.f1974));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1885);
                    aVar.f1885 = resourceId;
                    c0023a.m1873(38, resourceId);
                    break;
                case 39:
                    c0023a.m1872(39, typedArray.getFloat(index, aVar.f1889.f1956));
                    break;
                case 40:
                    c0023a.m1872(40, typedArray.getFloat(index, aVar.f1889.f1970));
                    break;
                case 41:
                    c0023a.m1873(41, typedArray.getInt(index, aVar.f1889.f1972));
                    break;
                case 42:
                    c0023a.m1873(42, typedArray.getInt(index, aVar.f1889.f1908));
                    break;
                case 43:
                    c0023a.m1872(43, typedArray.getFloat(index, aVar.f1887.f1993));
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0023a.m1875(44, true);
                        c0023a.m1872(44, typedArray.getDimension(index, aVar.f1890.f2009));
                        break;
                    } else {
                        break;
                    }
                case 45:
                    c0023a.m1872(45, typedArray.getFloat(index, aVar.f1890.f1998));
                    break;
                case 46:
                    c0023a.m1872(46, typedArray.getFloat(index, aVar.f1890.f1999));
                    break;
                case 47:
                    c0023a.m1872(47, typedArray.getFloat(index, aVar.f1890.f2000));
                    break;
                case 48:
                    c0023a.m1872(48, typedArray.getFloat(index, aVar.f1890.f2001));
                    break;
                case 49:
                    c0023a.m1872(49, typedArray.getDimension(index, aVar.f1890.f2002));
                    break;
                case 50:
                    c0023a.m1872(50, typedArray.getDimension(index, aVar.f1890.f2003));
                    break;
                case 51:
                    c0023a.m1872(51, typedArray.getDimension(index, aVar.f1890.f2005));
                    break;
                case 52:
                    c0023a.m1872(52, typedArray.getDimension(index, aVar.f1890.f2006));
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        c0023a.m1872(53, typedArray.getDimension(index, aVar.f1890.f2007));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    c0023a.m1873(54, typedArray.getInt(index, aVar.f1889.f1909));
                    break;
                case 55:
                    c0023a.m1873(55, typedArray.getInt(index, aVar.f1889.f1910));
                    break;
                case 56:
                    c0023a.m1873(56, typedArray.getDimensionPixelSize(index, aVar.f1889.f1911));
                    break;
                case 57:
                    c0023a.m1873(57, typedArray.getDimensionPixelSize(index, aVar.f1889.f1912));
                    break;
                case 58:
                    c0023a.m1873(58, typedArray.getDimensionPixelSize(index, aVar.f1889.f1913));
                    break;
                case 59:
                    c0023a.m1873(59, typedArray.getDimensionPixelSize(index, aVar.f1889.f1914));
                    break;
                case 60:
                    c0023a.m1872(60, typedArray.getFloat(index, aVar.f1890.f1997));
                    break;
                case 62:
                    c0023a.m1873(62, typedArray.getDimensionPixelSize(index, aVar.f1889.f1907));
                    break;
                case 63:
                    c0023a.m1872(63, typedArray.getFloat(index, aVar.f1889.f1930));
                    break;
                case 64:
                    c0023a.m1873(64, m1850(typedArray, index, aVar.f1888.f1977));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0023a.m1874(65, typedArray.getString(index));
                        break;
                    } else {
                        c0023a.m1874(65, o.b.f10039[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0023a.m1873(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0023a.m1872(67, typedArray.getFloat(index, aVar.f1888.f1984));
                    break;
                case 68:
                    c0023a.m1872(68, typedArray.getFloat(index, aVar.f1887.f1994));
                    break;
                case 69:
                    c0023a.m1872(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0023a.m1872(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0023a.m1873(72, typedArray.getInt(index, aVar.f1889.f1917));
                    break;
                case 73:
                    c0023a.m1873(73, typedArray.getDimensionPixelSize(index, aVar.f1889.f1918));
                    break;
                case 74:
                    c0023a.m1874(74, typedArray.getString(index));
                    break;
                case 75:
                    c0023a.m1875(75, typedArray.getBoolean(index, aVar.f1889.f1925));
                    break;
                case 76:
                    c0023a.m1873(76, typedArray.getInt(index, aVar.f1888.f1980));
                    break;
                case 77:
                    c0023a.m1874(77, typedArray.getString(index));
                    break;
                case 78:
                    c0023a.m1873(78, typedArray.getInt(index, aVar.f1887.f1992));
                    break;
                case 79:
                    c0023a.m1872(79, typedArray.getFloat(index, aVar.f1888.f1982));
                    break;
                case 80:
                    c0023a.m1875(80, typedArray.getBoolean(index, aVar.f1889.f1923));
                    break;
                case 81:
                    c0023a.m1875(81, typedArray.getBoolean(index, aVar.f1889.f1924));
                    break;
                case 82:
                    c0023a.m1873(82, typedArray.getInteger(index, aVar.f1888.f1978));
                    break;
                case 83:
                    c0023a.m1873(83, m1850(typedArray, index, aVar.f1890.f2004));
                    break;
                case 84:
                    c0023a.m1873(84, typedArray.getInteger(index, aVar.f1888.f1986));
                    break;
                case 85:
                    c0023a.m1872(85, typedArray.getFloat(index, aVar.f1888.f1985));
                    break;
                case 86:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        aVar.f1888.f1989 = typedArray.getResourceId(index, -1);
                        c0023a.m1873(89, aVar.f1888.f1989);
                        c cVar = aVar.f1888;
                        if (cVar.f1989 != -1) {
                            cVar.f1988 = -2;
                            c0023a.m1873(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i6 == 3) {
                        aVar.f1888.f1987 = typedArray.getString(index);
                        c0023a.m1874(90, aVar.f1888.f1987);
                        if (aVar.f1888.f1987.indexOf("/") > 0) {
                            aVar.f1888.f1989 = typedArray.getResourceId(index, -1);
                            c0023a.m1873(89, aVar.f1888.f1989);
                            aVar.f1888.f1988 = -2;
                            c0023a.m1873(88, -2);
                            break;
                        } else {
                            aVar.f1888.f1988 = -1;
                            c0023a.m1873(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f1888;
                        cVar2.f1988 = typedArray.getInteger(index, cVar2.f1989);
                        c0023a.m1873(88, aVar.f1888.f1988);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1878.get(index));
                    break;
                case 93:
                    c0023a.m1873(93, typedArray.getDimensionPixelSize(index, aVar.f1889.f1948));
                    break;
                case 94:
                    c0023a.m1873(94, typedArray.getDimensionPixelSize(index, aVar.f1889.f1968));
                    break;
                case 95:
                    m1851(c0023a, typedArray, index, 0);
                    break;
                case 96:
                    m1851(c0023a, typedArray, index, 1);
                    break;
                case 97:
                    c0023a.m1873(97, typedArray.getInt(index, aVar.f1889.f1926));
                    break;
                case 98:
                    if (androidx.constraintlayout.motion.widget.j.f1641) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1885);
                        aVar.f1885 = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f1886 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1886 = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f1885 = typedArray.getResourceId(index, aVar.f1885);
                        break;
                    }
                case 99:
                    c0023a.m1875(99, typedArray.getBoolean(index, aVar.f1889.f1941));
                    break;
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m1856(ConstraintLayout constraintLayout) {
        m1857(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m1857(ConstraintLayout constraintLayout, boolean z5) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1884.keySet());
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!this.f1884.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + androidx.constraintlayout.motion.widget.a.m1746(childAt));
            } else {
                if (this.f1883 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1884.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f1884.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1889.f1919 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f1889.f1917);
                                barrier.setMargin(aVar.f1889.f1918);
                                barrier.setAllowsGoneWidget(aVar.f1889.f1925);
                                b bVar = aVar.f1889;
                                int[] iArr = bVar.f1920;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1921;
                                    if (str != null) {
                                        bVar.f1920 = m1847(barrier, str);
                                        barrier.setReferencedIds(aVar.f1889.f1920);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.m1810();
                            aVar.m1870(bVar2);
                            if (z5) {
                                androidx.constraintlayout.widget.a.m1817(childAt, aVar.f1891);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f1887;
                            if (dVar.f1992 == 0) {
                                childAt.setVisibility(dVar.f1991);
                            }
                            int i6 = Build.VERSION.SDK_INT;
                            childAt.setAlpha(aVar.f1887.f1993);
                            childAt.setRotation(aVar.f1890.f1997);
                            childAt.setRotationX(aVar.f1890.f1998);
                            childAt.setRotationY(aVar.f1890.f1999);
                            childAt.setScaleX(aVar.f1890.f2000);
                            childAt.setScaleY(aVar.f1890.f2001);
                            e eVar = aVar.f1890;
                            if (eVar.f2004 != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1890.f2004) != null) {
                                    float top2 = (r6.getTop() + r6.getBottom()) / 2.0f;
                                    float left = (r6.getLeft() + r6.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top2 - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f2002)) {
                                    childAt.setPivotX(aVar.f1890.f2002);
                                }
                                if (!Float.isNaN(aVar.f1890.f2003)) {
                                    childAt.setPivotY(aVar.f1890.f2003);
                                }
                            }
                            childAt.setTranslationX(aVar.f1890.f2005);
                            childAt.setTranslationY(aVar.f1890.f2006);
                            if (i6 >= 21) {
                                childAt.setTranslationZ(aVar.f1890.f2007);
                                e eVar2 = aVar.f1890;
                                if (eVar2.f2008) {
                                    childAt.setElevation(eVar2.f2009);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f1884.get(num);
            if (aVar2 != null) {
                if (aVar2.f1889.f1919 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1889;
                    int[] iArr2 = bVar3.f1920;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1921;
                        if (str2 != null) {
                            bVar3.f1920 = m1847(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1889.f1920);
                        }
                    }
                    barrier2.setType(aVar2.f1889.f1917);
                    barrier2.setMargin(aVar2.f1889.f1918);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m1837();
                    aVar2.m1870(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f1889.f1906) {
                    View iVar = new i(constraintLayout.getContext());
                    iVar.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m1870(generateDefaultLayoutParams2);
                    constraintLayout.addView(iVar, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof androidx.constraintlayout.widget.d) {
                ((androidx.constraintlayout.widget.d) childAt2).mo1831(constraintLayout);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m1858(Context context, int i5) {
        m1859((ConstraintLayout) LayoutInflater.from(context).inflate(i5, (ViewGroup) null));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m1859(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1884.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1883 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1884.containsKey(Integer.valueOf(id))) {
                this.f1884.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f1884.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f1891 = androidx.constraintlayout.widget.a.m1815(this.f1882, childAt);
                aVar.m1867(id, bVar);
                aVar.f1887.f1991 = childAt.getVisibility();
                int i6 = Build.VERSION.SDK_INT;
                aVar.f1887.f1993 = childAt.getAlpha();
                aVar.f1890.f1997 = childAt.getRotation();
                aVar.f1890.f1998 = childAt.getRotationX();
                aVar.f1890.f1999 = childAt.getRotationY();
                aVar.f1890.f2000 = childAt.getScaleX();
                aVar.f1890.f2001 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1890;
                    eVar.f2002 = pivotX;
                    eVar.f2003 = pivotY;
                }
                aVar.f1890.f2005 = childAt.getTranslationX();
                aVar.f1890.f2006 = childAt.getTranslationY();
                if (i6 >= 21) {
                    aVar.f1890.f2007 = childAt.getTranslationZ();
                    e eVar2 = aVar.f1890;
                    if (eVar2.f2008) {
                        eVar2.f2009 = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1889.f1925 = barrier.getAllowsGoneWidget();
                    aVar.f1889.f1920 = barrier.getReferencedIds();
                    aVar.f1889.f1917 = barrier.getType();
                    aVar.f1889.f1918 = barrier.getMargin();
                }
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m1860(g gVar) {
        int childCount = gVar.getChildCount();
        this.f1884.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = gVar.getChildAt(i5);
            g.a aVar = (g.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1883 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1884.containsKey(Integer.valueOf(id))) {
                this.f1884.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f1884.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.d) {
                    aVar2.m1869((androidx.constraintlayout.widget.d) childAt, id, aVar);
                }
                aVar2.m1868(id, aVar);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m1861(int i5, int i6, int i7, float f5) {
        b bVar = m1849(i5).f1889;
        bVar.f1960 = i6;
        bVar.f1907 = i7;
        bVar.f1930 = f5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m1862(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a m1848 = m1848(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m1848.f1889.f1906 = true;
                    }
                    this.f1884.put(Integer.valueOf(m1848.f1885), m1848);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: ˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1863(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.f.m1863(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
