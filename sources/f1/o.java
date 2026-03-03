package f1;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: SizeConfigStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o implements l {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final Bitmap.Config[] f7693;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Bitmap.Config[] f7694;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Bitmap.Config[] f7695;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Bitmap.Config[] f7696;

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Bitmap.Config[] f7697;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c f7698 = new c();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final g<b, Bitmap> f7699 = new g<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f7700 = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f7701;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f7701 = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7701[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7701[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7701[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static final class b implements m {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final c f7702;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f7703;

        /* renamed from: ʽ, reason: contains not printable characters */
        private Bitmap.Config f7704;

        public b(c cVar) {
            this.f7702 = cVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7703 == bVar.f7703 && y1.l.m12898(this.f7704, bVar.f7704);
        }

        public int hashCode() {
            int i5 = this.f7703 * 31;
            Bitmap.Config config = this.f7704;
            return i5 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.m8583(this.f7703, this.f7704);
        }

        @Override // f1.m
        /* renamed from: ʻ */
        public void mo8556() {
            this.f7702.m8525(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m8586(int i5, Bitmap.Config config) {
            this.f7703 = i5;
            this.f7704 = config;
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    static class c extends f1.c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // f1.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b mo8523() {
            return new b(this);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public b m8588(int i5, Bitmap.Config config) {
            b m8524 = m8524();
            m8524.m8586(i5, config);
            return m8524;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f7693 = configArr;
        f7694 = configArr;
        f7695 = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f7696 = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f7697 = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8581(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> m8585 = m8585(bitmap.getConfig());
        Integer num2 = m8585.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                m8585.remove(num);
                return;
            } else {
                m8585.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo8579(bitmap) + ", this: " + this);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private b m8582(int i5, Bitmap.Config config) {
        b m8588 = this.f7698.m8588(i5, config);
        for (Bitmap.Config config2 : m8584(config)) {
            Integer ceilingKey = m8585(config2).ceilingKey(Integer.valueOf(i5));
            if (ceilingKey != null && ceilingKey.intValue() <= i5 * 8) {
                if (ceilingKey.intValue() == i5) {
                    if (config2 == null) {
                        if (config == null) {
                            return m8588;
                        }
                    } else if (config2.equals(config)) {
                        return m8588;
                    }
                }
                this.f7698.m8525(m8588);
                return this.f7698.m8588(ceilingKey.intValue(), config2);
            }
        }
        return m8588;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static String m8583(int i5, Bitmap.Config config) {
        return "[" + i5 + "](" + config + ")";
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static Bitmap.Config[] m8584(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f7694;
        }
        int i5 = a.f7701[config.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? new Bitmap.Config[]{config} : f7697 : f7696 : f7695 : f7693;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private NavigableMap<Integer, Integer> m8585(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f7700.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f7700.put(config, treeMap);
        return treeMap;
    }

    @Override // f1.l
    public Bitmap removeLast() {
        Bitmap m8539 = this.f7699.m8539();
        if (m8539 != null) {
            m8581(Integer.valueOf(y1.l.m12902(m8539)), m8539);
        }
        return m8539;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f7699);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f7700.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f7700.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), BuildConfig.FLAVOR);
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // f1.l
    /* renamed from: ʻ */
    public String mo8575(int i5, int i6, Bitmap.Config config) {
        return m8583(y1.l.m12901(i5, i6, config), config);
    }

    @Override // f1.l
    /* renamed from: ʼ */
    public int mo8576(Bitmap bitmap) {
        return y1.l.m12902(bitmap);
    }

    @Override // f1.l
    /* renamed from: ʽ */
    public Bitmap mo8577(int i5, int i6, Bitmap.Config config) {
        b m8582 = m8582(y1.l.m12901(i5, i6, config), config);
        Bitmap m8537 = this.f7699.m8537(m8582);
        if (m8537 != null) {
            m8581(Integer.valueOf(m8582.f7703), m8537);
            m8537.reconfigure(i5, i6, config);
        }
        return m8537;
    }

    @Override // f1.l
    /* renamed from: ʾ */
    public void mo8578(Bitmap bitmap) {
        b m8588 = this.f7698.m8588(y1.l.m12902(bitmap), bitmap.getConfig());
        this.f7699.m8538(m8588, bitmap);
        NavigableMap<Integer, Integer> m8585 = m8585(bitmap.getConfig());
        Integer num = m8585.get(Integer.valueOf(m8588.f7703));
        m8585.put(Integer.valueOf(m8588.f7703), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // f1.l
    /* renamed from: ʿ */
    public String mo8579(Bitmap bitmap) {
        return m8583(y1.l.m12902(bitmap), bitmap.getConfig());
    }
}
