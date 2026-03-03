package r;

import java.util.ArrayList;
import java.util.Iterator;
import q.d;
import q.e;
import r.b;

/* compiled from: Direct.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static b.a f10718 = new b.a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f10719 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int f10720 = 0;

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m11588(int i5, q.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b m11311 = eVar.m11311();
        e.b m11318 = eVar.m11318();
        q.f fVar = eVar.m11294() != null ? (q.f) eVar.m11294() : null;
        if (fVar != null) {
            fVar.m11311();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.m11318();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z5 = m11311 == bVar5 || eVar.mo11174() || m11311 == e.b.WRAP_CONTENT || (m11311 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f10498 == 0 && eVar.f10423 == 0.0f && eVar.m11224(0)) || (m11311 == bVar2 && eVar.f10498 == 1 && eVar.m11227(0, eVar.m11309()));
        boolean z6 = m11318 == bVar5 || eVar.mo11175() || m11318 == e.b.WRAP_CONTENT || (m11318 == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f10500 == 0 && eVar.f10423 == 0.0f && eVar.m11224(1)) || (m11318 == bVar && eVar.f10500 == 1 && eVar.m11227(1, eVar.m11323()));
        if (eVar.f10423 <= 0.0f || !(z5 || z6)) {
            return z5 && z6;
        }
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m11589(int i5, q.e eVar, b.InterfaceC0152b interfaceC0152b, boolean z5) {
        q.d dVar;
        q.d dVar2;
        q.d dVar3;
        q.d dVar4;
        if (eVar.m11229()) {
            return;
        }
        f10719++;
        if (!(eVar instanceof q.f) && eVar.m11235()) {
            int i6 = i5 + 1;
            if (m11588(i6, eVar)) {
                q.f.m11331(i6, eVar, interfaceC0152b, new b.a(), b.a.f10672);
            }
        }
        q.d mo11306 = eVar.mo11306(d.b.LEFT);
        q.d mo113062 = eVar.mo11306(d.b.RIGHT);
        int m11196 = mo11306.m11196();
        int m111962 = mo113062.m11196();
        if (mo11306.m11195() != null && mo11306.m11205()) {
            Iterator<q.d> it = mo11306.m11195().iterator();
            while (it.hasNext()) {
                q.d next = it.next();
                q.e eVar2 = next.f10398;
                int i7 = i5 + 1;
                boolean m11588 = m11588(i7, eVar2);
                if (eVar2.m11235() && m11588) {
                    q.f.m11331(i7, eVar2, interfaceC0152b, new b.a(), b.a.f10672);
                }
                boolean z6 = (next == eVar2.f10475 && (dVar4 = eVar2.f10493.f10400) != null && dVar4.m11205()) || (next == eVar2.f10493 && (dVar3 = eVar2.f10475.f10400) != null && dVar3.m11205());
                e.b m11311 = eVar2.m11311();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (m11311 != bVar || m11588) {
                    if (!eVar2.m11235()) {
                        q.d dVar5 = eVar2.f10475;
                        if (next == dVar5 && eVar2.f10493.f10400 == null) {
                            int m11197 = dVar5.m11197() + m11196;
                            eVar2.m11250(m11197, eVar2.m11309() + m11197);
                            m11589(i7, eVar2, interfaceC0152b, z5);
                        } else {
                            q.d dVar6 = eVar2.f10493;
                            if (next == dVar6 && dVar5.f10400 == null) {
                                int m111972 = m11196 - dVar6.m11197();
                                eVar2.m11250(m111972 - eVar2.m11309(), m111972);
                                m11589(i7, eVar2, interfaceC0152b, z5);
                            } else if (z6 && !eVar2.m11231()) {
                                m11591(i7, interfaceC0152b, eVar2, z5);
                            }
                        }
                    }
                } else if (eVar2.m11311() == bVar && eVar2.f10487 >= 0 && eVar2.f10503 >= 0 && ((eVar2.m11322() == 8 || (eVar2.f10498 == 0 && eVar2.m11319() == 0.0f)) && !eVar2.m11231() && !eVar2.m11234() && z6 && !eVar2.m11231())) {
                    m11592(i7, eVar, interfaceC0152b, eVar2, z5);
                }
            }
        }
        if (eVar instanceof q.h) {
            return;
        }
        if (mo113062.m11195() != null && mo113062.m11205()) {
            Iterator<q.d> it2 = mo113062.m11195().iterator();
            while (it2.hasNext()) {
                q.d next2 = it2.next();
                q.e eVar3 = next2.f10398;
                int i8 = i5 + 1;
                boolean m115882 = m11588(i8, eVar3);
                if (eVar3.m11235() && m115882) {
                    q.f.m11331(i8, eVar3, interfaceC0152b, new b.a(), b.a.f10672);
                }
                boolean z7 = (next2 == eVar3.f10475 && (dVar2 = eVar3.f10493.f10400) != null && dVar2.m11205()) || (next2 == eVar3.f10493 && (dVar = eVar3.f10475.f10400) != null && dVar.m11205());
                e.b m113112 = eVar3.m11311();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (m113112 != bVar2 || m115882) {
                    if (!eVar3.m11235()) {
                        q.d dVar7 = eVar3.f10475;
                        if (next2 == dVar7 && eVar3.f10493.f10400 == null) {
                            int m111973 = dVar7.m11197() + m111962;
                            eVar3.m11250(m111973, eVar3.m11309() + m111973);
                            m11589(i8, eVar3, interfaceC0152b, z5);
                        } else {
                            q.d dVar8 = eVar3.f10493;
                            if (next2 == dVar8 && dVar7.f10400 == null) {
                                int m111974 = m111962 - dVar8.m11197();
                                eVar3.m11250(m111974 - eVar3.m11309(), m111974);
                                m11589(i8, eVar3, interfaceC0152b, z5);
                            } else if (z7 && !eVar3.m11231()) {
                                m11591(i8, interfaceC0152b, eVar3, z5);
                            }
                        }
                    }
                } else if (eVar3.m11311() == bVar2 && eVar3.f10487 >= 0 && eVar3.f10503 >= 0 && (eVar3.m11322() == 8 || (eVar3.f10498 == 0 && eVar3.m11319() == 0.0f))) {
                    if (!eVar3.m11231() && !eVar3.m11234() && z7 && !eVar3.m11231()) {
                        m11592(i8, eVar, interfaceC0152b, eVar3, z5);
                    }
                }
            }
        }
        eVar.m11237();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m11590(int i5, q.a aVar, b.InterfaceC0152b interfaceC0152b, int i6, boolean z5) {
        if (aVar.m11176()) {
            if (i6 == 0) {
                m11589(i5 + 1, aVar, interfaceC0152b, z5);
            } else {
                m11596(i5 + 1, aVar, interfaceC0152b);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m11591(int i5, b.InterfaceC0152b interfaceC0152b, q.e eVar, boolean z5) {
        float m11325 = eVar.m11325();
        int m11196 = eVar.f10475.f10400.m11196();
        int m111962 = eVar.f10493.f10400.m11196();
        int m11197 = eVar.f10475.m11197() + m11196;
        int m111972 = m111962 - eVar.f10493.m11197();
        if (m11196 == m111962) {
            m11325 = 0.5f;
        } else {
            m11196 = m11197;
            m111962 = m111972;
        }
        int m11309 = eVar.m11309();
        int i6 = (m111962 - m11196) - m11309;
        if (m11196 > m111962) {
            i6 = (m11196 - m111962) - m11309;
        }
        int i7 = ((int) (i6 > 0 ? (m11325 * i6) + 0.5f : m11325 * i6)) + m11196;
        int i8 = i7 + m11309;
        if (m11196 > m111962) {
            i8 = i7 - m11309;
        }
        eVar.m11250(i7, i8);
        m11589(i5 + 1, eVar, interfaceC0152b, z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static void m11592(int i5, q.e eVar, b.InterfaceC0152b interfaceC0152b, q.e eVar2, boolean z5) {
        float m11325 = eVar2.m11325();
        int m11196 = eVar2.f10475.f10400.m11196() + eVar2.f10475.m11197();
        int m111962 = eVar2.f10493.f10400.m11196() - eVar2.f10493.m11197();
        if (m111962 >= m11196) {
            int m11309 = eVar2.m11309();
            if (eVar2.m11322() != 8) {
                int i6 = eVar2.f10498;
                if (i6 == 2) {
                    m11309 = (int) (eVar2.m11325() * 0.5f * (eVar instanceof q.f ? eVar.m11309() : eVar.m11294().m11309()));
                } else if (i6 == 0) {
                    m11309 = m111962 - m11196;
                }
                m11309 = Math.max(eVar2.f10503, m11309);
                int i7 = eVar2.f10487;
                if (i7 > 0) {
                    m11309 = Math.min(i7, m11309);
                }
            }
            int i8 = m11196 + ((int) ((m11325 * ((m111962 - m11196) - m11309)) + 0.5f));
            eVar2.m11250(i8, m11309 + i8);
            m11589(i5 + 1, eVar2, interfaceC0152b, z5);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m11593(int i5, b.InterfaceC0152b interfaceC0152b, q.e eVar) {
        float m11305 = eVar.m11305();
        int m11196 = eVar.f10479.f10400.m11196();
        int m111962 = eVar.f10481.f10400.m11196();
        int m11197 = eVar.f10479.m11197() + m11196;
        int m111972 = m111962 - eVar.f10481.m11197();
        if (m11196 == m111962) {
            m11305 = 0.5f;
        } else {
            m11196 = m11197;
            m111962 = m111972;
        }
        int m11323 = eVar.m11323();
        int i6 = (m111962 - m11196) - m11323;
        if (m11196 > m111962) {
            i6 = (m11196 - m111962) - m11323;
        }
        int i7 = (int) (i6 > 0 ? (m11305 * i6) + 0.5f : m11305 * i6);
        int i8 = m11196 + i7;
        int i9 = i8 + m11323;
        if (m11196 > m111962) {
            i8 = m11196 - i7;
            i9 = i8 - m11323;
        }
        eVar.m11253(i8, i9);
        m11596(i5 + 1, eVar, interfaceC0152b);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static void m11594(int i5, q.e eVar, b.InterfaceC0152b interfaceC0152b, q.e eVar2) {
        float m11305 = eVar2.m11305();
        int m11196 = eVar2.f10479.f10400.m11196() + eVar2.f10479.m11197();
        int m111962 = eVar2.f10481.f10400.m11196() - eVar2.f10481.m11197();
        if (m111962 >= m11196) {
            int m11323 = eVar2.m11323();
            if (eVar2.m11322() != 8) {
                int i6 = eVar2.f10500;
                if (i6 == 2) {
                    m11323 = (int) (m11305 * 0.5f * (eVar instanceof q.f ? eVar.m11323() : eVar.m11294().m11323()));
                } else if (i6 == 0) {
                    m11323 = m111962 - m11196;
                }
                m11323 = Math.max(eVar2.f10417, m11323);
                int i7 = eVar2.f10459;
                if (i7 > 0) {
                    m11323 = Math.min(i7, m11323);
                }
            }
            int i8 = m11196 + ((int) ((m11305 * ((m111962 - m11196) - m11323)) + 0.5f));
            eVar2.m11253(i8, m11323 + i8);
            m11596(i5 + 1, eVar2, interfaceC0152b);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m11595(q.f fVar, b.InterfaceC0152b interfaceC0152b) {
        e.b m11311 = fVar.m11311();
        e.b m11318 = fVar.m11318();
        f10719 = 0;
        f10720 = 0;
        fVar.m11242();
        ArrayList<q.e> m11456 = fVar.m11456();
        int size = m11456.size();
        for (int i5 = 0; i5 < size; i5++) {
            m11456.get(i5).m11242();
        }
        boolean m11350 = fVar.m11350();
        if (m11311 == e.b.FIXED) {
            fVar.m11250(0, fVar.m11309());
        } else {
            fVar.m11251(0);
        }
        boolean z5 = false;
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            q.e eVar = m11456.get(i6);
            if (eVar instanceof q.h) {
                q.h hVar = (q.h) eVar;
                if (hVar.m11418() == 1) {
                    if (hVar.m11419() != -1) {
                        hVar.m11422(hVar.m11419());
                    } else if (hVar.m11420() != -1 && fVar.mo11174()) {
                        hVar.m11422(fVar.m11309() - hVar.m11420());
                    } else if (fVar.mo11174()) {
                        hVar.m11422((int) ((hVar.m11421() * fVar.m11309()) + 0.5f));
                    }
                    z5 = true;
                }
            } else if ((eVar instanceof q.a) && ((q.a) eVar).m11180() == 0) {
                z6 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                q.e eVar2 = m11456.get(i7);
                if (eVar2 instanceof q.h) {
                    q.h hVar2 = (q.h) eVar2;
                    if (hVar2.m11418() == 1) {
                        m11589(0, hVar2, interfaceC0152b, m11350);
                    }
                }
            }
        }
        m11589(0, fVar, interfaceC0152b, m11350);
        if (z6) {
            for (int i8 = 0; i8 < size; i8++) {
                q.e eVar3 = m11456.get(i8);
                if (eVar3 instanceof q.a) {
                    q.a aVar = (q.a) eVar3;
                    if (aVar.m11180() == 0) {
                        m11590(0, aVar, interfaceC0152b, 0, m11350);
                    }
                }
            }
        }
        if (m11318 == e.b.FIXED) {
            fVar.m11253(0, fVar.m11323());
        } else {
            fVar.m11252(0);
        }
        boolean z7 = false;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            q.e eVar4 = m11456.get(i9);
            if (eVar4 instanceof q.h) {
                q.h hVar3 = (q.h) eVar4;
                if (hVar3.m11418() == 0) {
                    if (hVar3.m11419() != -1) {
                        hVar3.m11422(hVar3.m11419());
                    } else if (hVar3.m11420() != -1 && fVar.mo11175()) {
                        hVar3.m11422(fVar.m11323() - hVar3.m11420());
                    } else if (fVar.mo11175()) {
                        hVar3.m11422((int) ((hVar3.m11421() * fVar.m11323()) + 0.5f));
                    }
                    z7 = true;
                }
            } else if ((eVar4 instanceof q.a) && ((q.a) eVar4).m11180() == 1) {
                z8 = true;
            }
        }
        if (z7) {
            for (int i10 = 0; i10 < size; i10++) {
                q.e eVar5 = m11456.get(i10);
                if (eVar5 instanceof q.h) {
                    q.h hVar4 = (q.h) eVar5;
                    if (hVar4.m11418() == 0) {
                        m11596(1, hVar4, interfaceC0152b);
                    }
                }
            }
        }
        m11596(0, fVar, interfaceC0152b);
        if (z8) {
            for (int i11 = 0; i11 < size; i11++) {
                q.e eVar6 = m11456.get(i11);
                if (eVar6 instanceof q.a) {
                    q.a aVar2 = (q.a) eVar6;
                    if (aVar2.m11180() == 1) {
                        m11590(0, aVar2, interfaceC0152b, 1, m11350);
                    }
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            q.e eVar7 = m11456.get(i12);
            if (eVar7.m11235() && m11588(0, eVar7)) {
                q.f.m11331(0, eVar7, interfaceC0152b, f10718, b.a.f10672);
                if (!(eVar7 instanceof q.h)) {
                    m11589(0, eVar7, interfaceC0152b, m11350);
                    m11596(0, eVar7, interfaceC0152b);
                } else if (((q.h) eVar7).m11418() == 0) {
                    m11596(0, eVar7, interfaceC0152b);
                } else {
                    m11589(0, eVar7, interfaceC0152b, m11350);
                }
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static void m11596(int i5, q.e eVar, b.InterfaceC0152b interfaceC0152b) {
        q.d dVar;
        q.d dVar2;
        q.d dVar3;
        q.d dVar4;
        if (eVar.m11236()) {
            return;
        }
        f10720++;
        if (!(eVar instanceof q.f) && eVar.m11235()) {
            int i6 = i5 + 1;
            if (m11588(i6, eVar)) {
                q.f.m11331(i6, eVar, interfaceC0152b, new b.a(), b.a.f10672);
            }
        }
        q.d mo11306 = eVar.mo11306(d.b.TOP);
        q.d mo113062 = eVar.mo11306(d.b.BOTTOM);
        int m11196 = mo11306.m11196();
        int m111962 = mo113062.m11196();
        if (mo11306.m11195() != null && mo11306.m11205()) {
            Iterator<q.d> it = mo11306.m11195().iterator();
            while (it.hasNext()) {
                q.d next = it.next();
                q.e eVar2 = next.f10398;
                int i7 = i5 + 1;
                boolean m11588 = m11588(i7, eVar2);
                if (eVar2.m11235() && m11588) {
                    q.f.m11331(i7, eVar2, interfaceC0152b, new b.a(), b.a.f10672);
                }
                boolean z5 = (next == eVar2.f10479 && (dVar4 = eVar2.f10481.f10400) != null && dVar4.m11205()) || (next == eVar2.f10481 && (dVar3 = eVar2.f10479.f10400) != null && dVar3.m11205());
                e.b m11318 = eVar2.m11318();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (m11318 != bVar || m11588) {
                    if (!eVar2.m11235()) {
                        q.d dVar5 = eVar2.f10479;
                        if (next == dVar5 && eVar2.f10481.f10400 == null) {
                            int m11197 = dVar5.m11197() + m11196;
                            eVar2.m11253(m11197, eVar2.m11323() + m11197);
                            m11596(i7, eVar2, interfaceC0152b);
                        } else {
                            q.d dVar6 = eVar2.f10481;
                            if (next == dVar6 && dVar5.f10400 == null) {
                                int m111972 = m11196 - dVar6.m11197();
                                eVar2.m11253(m111972 - eVar2.m11323(), m111972);
                                m11596(i7, eVar2, interfaceC0152b);
                            } else if (z5 && !eVar2.m11233()) {
                                m11593(i7, interfaceC0152b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.m11318() == bVar && eVar2.f10459 >= 0 && eVar2.f10417 >= 0 && (eVar2.m11322() == 8 || (eVar2.f10500 == 0 && eVar2.m11319() == 0.0f))) {
                    if (!eVar2.m11233() && !eVar2.m11234() && z5 && !eVar2.m11233()) {
                        m11594(i7, eVar, interfaceC0152b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof q.h) {
            return;
        }
        if (mo113062.m11195() != null && mo113062.m11205()) {
            Iterator<q.d> it2 = mo113062.m11195().iterator();
            while (it2.hasNext()) {
                q.d next2 = it2.next();
                q.e eVar3 = next2.f10398;
                int i8 = i5 + 1;
                boolean m115882 = m11588(i8, eVar3);
                if (eVar3.m11235() && m115882) {
                    q.f.m11331(i8, eVar3, interfaceC0152b, new b.a(), b.a.f10672);
                }
                boolean z6 = (next2 == eVar3.f10479 && (dVar2 = eVar3.f10481.f10400) != null && dVar2.m11205()) || (next2 == eVar3.f10481 && (dVar = eVar3.f10479.f10400) != null && dVar.m11205());
                e.b m113182 = eVar3.m11318();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (m113182 != bVar2 || m115882) {
                    if (!eVar3.m11235()) {
                        q.d dVar7 = eVar3.f10479;
                        if (next2 == dVar7 && eVar3.f10481.f10400 == null) {
                            int m111973 = dVar7.m11197() + m111962;
                            eVar3.m11253(m111973, eVar3.m11323() + m111973);
                            m11596(i8, eVar3, interfaceC0152b);
                        } else {
                            q.d dVar8 = eVar3.f10481;
                            if (next2 == dVar8 && dVar7.f10400 == null) {
                                int m111974 = m111962 - dVar8.m11197();
                                eVar3.m11253(m111974 - eVar3.m11323(), m111974);
                                m11596(i8, eVar3, interfaceC0152b);
                            } else if (z6 && !eVar3.m11233()) {
                                m11593(i8, interfaceC0152b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.m11318() == bVar2 && eVar3.f10459 >= 0 && eVar3.f10417 >= 0 && (eVar3.m11322() == 8 || (eVar3.f10500 == 0 && eVar3.m11319() == 0.0f))) {
                    if (!eVar3.m11233() && !eVar3.m11234() && z6 && !eVar3.m11233()) {
                        m11594(i8, eVar, interfaceC0152b, eVar3);
                    }
                }
            }
        }
        q.d mo113063 = eVar.mo11306(d.b.BASELINE);
        if (mo113063.m11195() != null && mo113063.m11205()) {
            int m111963 = mo113063.m11196();
            Iterator<q.d> it3 = mo113063.m11195().iterator();
            while (it3.hasNext()) {
                q.d next3 = it3.next();
                q.e eVar4 = next3.f10398;
                int i9 = i5 + 1;
                boolean m115883 = m11588(i9, eVar4);
                if (eVar4.m11235() && m115883) {
                    q.f.m11331(i9, eVar4, interfaceC0152b, new b.a(), b.a.f10672);
                }
                if (eVar4.m11318() != e.b.MATCH_CONSTRAINT || m115883) {
                    if (!eVar4.m11235() && next3 == eVar4.f10491) {
                        eVar4.m11249(next3.m11197() + m111963);
                        m11596(i9, eVar4, interfaceC0152b);
                    }
                }
            }
        }
        eVar.m11238();
    }
}
