package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: KeylineStateList.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f5448;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<e> f5449;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final List<e> f5450;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final float[] f5451;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final float[] f5452;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final float f5453;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final float f5454;

    private f(e eVar, List<e> list, List<e> list2) {
        this.f5448 = eVar;
        this.f5449 = Collections.unmodifiableList(list);
        this.f5450 = Collections.unmodifiableList(list2);
        float f5 = list.get(list.size() - 1).m6387().f5444 - eVar.m6387().f5444;
        this.f5453 = f5;
        float f6 = eVar.m6392().f5444 - list2.get(list2.size() - 1).m6392().f5444;
        this.f5454 = f6;
        this.f5451 = m6406(f5, list, true);
        this.f5452 = m6406(f6, list2, false);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private e m6400(List<e> list, float f5, float[] fArr) {
        float[] m6408 = m6408(list, f5, fArr);
        return m6408[0] > 0.5f ? list.get((int) m6408[2]) : list.get((int) m6408[1]);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m6401(e eVar) {
        for (int i5 = 0; i5 < eVar.m6389().size(); i5++) {
            if (eVar.m6389().get(i5).f5445 >= 0.0f) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int m6402(e eVar, float f5) {
        for (int m6391 = eVar.m6391(); m6391 < eVar.m6389().size(); m6391++) {
            if (f5 == eVar.m6389().get(m6391).f5446) {
                return m6391;
            }
        }
        return eVar.m6389().size() - 1;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m6403(b bVar, e eVar) {
        int containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        for (int size = eVar.m6389().size() - 1; size >= 0; size--) {
            if (eVar.m6389().get(size).f5445 <= containerHeight) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m6404(e eVar, float f5) {
        for (int m6386 = eVar.m6386() - 1; m6386 >= 0; m6386--) {
            if (f5 == eVar.m6389().get(m6386).f5446) {
                return m6386;
            }
        }
        return 0;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static f m6405(b bVar, e eVar) {
        return new f(eVar, m6409(eVar), m6407(bVar, eVar));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static float[] m6406(float f5, List<e> list, boolean z5) {
        int size = list.size();
        float[] fArr = new float[size];
        int i5 = 1;
        while (i5 < size) {
            int i6 = i5 - 1;
            e eVar = list.get(i6);
            e eVar2 = list.get(i5);
            fArr[i5] = i5 == size + (-1) ? 1.0f : fArr[i6] + ((z5 ? eVar2.m6387().f5444 - eVar.m6387().f5444 : eVar.m6392().f5444 - eVar2.m6392().f5444) / f5);
            i5++;
        }
        return fArr;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static List<e> m6407(b bVar, e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int m6403 = m6403(bVar, eVar);
        if (!m6411(bVar, eVar) && m6403 != -1) {
            int m6391 = m6403 - eVar.m6391();
            float f5 = eVar.m6387().f5445 - (eVar.m6387().f5447 / 2.0f);
            for (int i5 = 0; i5 < m6391; i5++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int i6 = (m6403 - i5) + 1;
                arrayList.add(m6413(eVar2, m6403, i6 < eVar.m6389().size() ? m6404(eVar2, eVar.m6389().get(i6).f5446) + 1 : 0, f5, eVar.m6386() + i5 + 1, eVar.m6391() + i5 + 1));
            }
        }
        return arrayList;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static float[] m6408(List<e> list, float f5, float[] fArr) {
        int size = list.size();
        float f6 = fArr[0];
        int i5 = 1;
        while (i5 < size) {
            float f7 = fArr[i5];
            if (f5 <= f7) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f6, f7, f5), i5 - 1, i5};
            }
            i5++;
            f6 = f7;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static List<e> m6409(e eVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        int m6401 = m6401(eVar);
        if (!m6410(eVar) && m6401 != -1) {
            int m6386 = (eVar.m6386() - 1) - m6401;
            float f5 = eVar.m6387().f5445 - (eVar.m6387().f5447 / 2.0f);
            for (int i5 = 0; i5 <= m6386; i5++) {
                e eVar2 = (e) arrayList.get(arrayList.size() - 1);
                int size = eVar.m6389().size() - 1;
                int i6 = (m6401 + i5) - 1;
                if (i6 >= 0) {
                    size = m6402(eVar2, eVar.m6389().get(i6).f5446) - 1;
                }
                arrayList.add(m6413(eVar2, m6401, size, f5, (eVar.m6386() - i5) - 1, (eVar.m6391() - i5) - 1));
            }
        }
        return arrayList;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static boolean m6410(e eVar) {
        return eVar.m6385().f5445 - (eVar.m6385().f5447 / 2.0f) <= 0.0f || eVar.m6385() == eVar.m6387();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static boolean m6411(b bVar, e eVar) {
        int containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        return eVar.m6390().f5445 + (eVar.m6390().f5447 / 2.0f) >= ((float) containerHeight) || eVar.m6390() == eVar.m6392();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static e m6412(List<e> list, float f5, float[] fArr) {
        float[] m6408 = m6408(list, f5, fArr);
        return e.m6383(list.get((int) m6408[1]), list.get((int) m6408[2]), m6408[0]);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static e m6413(e eVar, int i5, int i6, float f5, int i7, int i8) {
        ArrayList arrayList = new ArrayList(eVar.m6389());
        arrayList.add(i6, (e.c) arrayList.remove(i5));
        e.b bVar = new e.b(eVar.m6388());
        int i9 = 0;
        while (i9 < arrayList.size()) {
            e.c cVar = (e.c) arrayList.get(i9);
            float f6 = cVar.f5447;
            bVar.m6395((f6 / 2.0f) + f5, cVar.f5446, f6, i9 >= i7 && i9 <= i8);
            f5 += cVar.f5447;
            i9++;
        }
        return bVar.m6398();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    e m6414() {
        return this.f5448;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    e m6415() {
        return this.f5450.get(r0.size() - 1);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    Map<Integer, e> m6416(int i5, int i6, int i7, boolean z5) {
        float m6388 = this.f5448.m6388();
        HashMap hashMap = new HashMap();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= i5) {
                break;
            }
            int i10 = z5 ? (i5 - i8) - 1 : i8;
            if (i10 * m6388 * (z5 ? -1 : 1) > i7 - this.f5454 || i8 >= i5 - this.f5450.size()) {
                Integer valueOf = Integer.valueOf(i10);
                List<e> list = this.f5450;
                hashMap.put(valueOf, list.get(w.a.m12444(i9, 0, list.size() - 1)));
                i9++;
            }
            i8++;
        }
        int i11 = 0;
        for (int i12 = i5 - 1; i12 >= 0; i12--) {
            int i13 = z5 ? (i5 - i12) - 1 : i12;
            if (i13 * m6388 * (z5 ? -1 : 1) < i6 + this.f5453 || i12 < this.f5449.size()) {
                Integer valueOf2 = Integer.valueOf(i13);
                List<e> list2 = this.f5449;
                hashMap.put(valueOf2, list2.get(w.a.m12444(i11, 0, list2.size() - 1)));
                i11++;
            }
        }
        return hashMap;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public e m6417(float f5, float f6, float f7) {
        return m6418(f5, f6, f7, false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    e m6418(float f5, float f6, float f7, boolean z5) {
        float lerp;
        List<e> list;
        float[] fArr;
        float f8 = this.f5453 + f6;
        float f9 = f7 - this.f5454;
        if (f5 < f8) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f6, f8, f5);
            list = this.f5449;
            fArr = this.f5451;
        } else {
            if (f5 <= f9) {
                return this.f5448;
            }
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f9, f7, f5);
            list = this.f5450;
            fArr = this.f5452;
        }
        return z5 ? m6400(list, lerp, fArr) : m6412(list, lerp, fArr);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    e m6419() {
        return this.f5449.get(r0.size() - 1);
    }
}
