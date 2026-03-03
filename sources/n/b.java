package n;

import java.util.ArrayList;
import n.d;
import n.i;

/* compiled from: ArrayRow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements d.a {

    /* renamed from: ʿ, reason: contains not printable characters */
    public a f9416;

    /* renamed from: ʻ, reason: contains not printable characters */
    i f9412 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    float f9413 = 0.0f;

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean f9414 = false;

    /* renamed from: ʾ, reason: contains not printable characters */
    ArrayList<i> f9415 = new ArrayList<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f9417 = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        void clear();

        /* renamed from: ʻ */
        float mo10301(int i5);

        /* renamed from: ʼ */
        void mo10302(i iVar, float f5, boolean z5);

        /* renamed from: ʽ */
        float mo10303(b bVar, boolean z5);

        /* renamed from: ʾ */
        void mo10304(i iVar, float f5);

        /* renamed from: ʿ */
        int mo10305();

        /* renamed from: ˆ */
        float mo10306(i iVar);

        /* renamed from: ˈ */
        boolean mo10307(i iVar);

        /* renamed from: ˉ */
        i mo10308(int i5);

        /* renamed from: ˊ */
        void mo10309(float f5);

        /* renamed from: ˋ */
        float mo10310(i iVar, boolean z5);

        /* renamed from: ˎ */
        void mo10311();
    }

    public b() {
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean m10312(i iVar, d dVar) {
        return iVar.f9473 <= 1;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private i m10313(boolean[] zArr, i iVar) {
        i.a aVar;
        int mo10305 = this.f9416.mo10305();
        i iVar2 = null;
        float f5 = 0.0f;
        for (int i5 = 0; i5 < mo10305; i5++) {
            float mo10301 = this.f9416.mo10301(i5);
            if (mo10301 < 0.0f) {
                i mo10308 = this.f9416.mo10308(i5);
                if ((zArr == null || !zArr[mo10308.f9463]) && mo10308 != iVar && (((aVar = mo10308.f9470) == i.a.SLACK || aVar == i.a.ERROR) && mo10301 < f5)) {
                    f5 = mo10301;
                    iVar2 = mo10308;
                }
            }
        }
        return iVar2;
    }

    @Override // n.d.a
    public void clear() {
        this.f9416.clear();
        this.f9412 = null;
        this.f9413 = 0.0f;
    }

    @Override // n.d.a
    public i getKey() {
        return this.f9412;
    }

    @Override // n.d.a
    public boolean isEmpty() {
        return this.f9412 == null && this.f9413 == 0.0f && this.f9416.mo10305() == 0;
    }

    public String toString() {
        return m10341();
    }

    @Override // n.d.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public i mo10314(d dVar, boolean[] zArr) {
        return m10313(zArr, null);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m10315(d dVar, i iVar, boolean z5) {
        if (iVar == null || !iVar.f9474) {
            return;
        }
        float mo10306 = this.f9416.mo10306(iVar);
        this.f9413 += iVar.f9476 * mo10306;
        this.f9416.mo10310(iVar, z5);
        if (z5) {
            iVar.m10387(this);
        }
        this.f9416.mo10302(dVar.f9443.f9421[iVar.f9475], mo10306, z5);
        if (d.f9424 && this.f9416.mo10305() == 0) {
            this.f9417 = true;
            dVar.f9430 = true;
        }
    }

    @Override // n.d.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo10316(i iVar) {
        int i5 = iVar.f9465;
        float f5 = 1.0f;
        if (i5 != 1) {
            if (i5 == 2) {
                f5 = 1000.0f;
            } else if (i5 == 3) {
                f5 = 1000000.0f;
            } else if (i5 == 4) {
                f5 = 1.0E9f;
            } else if (i5 == 5) {
                f5 = 1.0E12f;
            }
        }
        this.f9416.mo10304(iVar, f5);
    }

    @Override // n.d.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo10317(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f9412 = null;
            this.f9416.clear();
            for (int i5 = 0; i5 < bVar.f9416.mo10305(); i5++) {
                this.f9416.mo10302(bVar.f9416.mo10308(i5), bVar.f9416.mo10301(i5), true);
            }
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m10318(d dVar) {
        if (dVar.f9436.length == 0) {
            return;
        }
        boolean z5 = false;
        while (!z5) {
            int mo10305 = this.f9416.mo10305();
            for (int i5 = 0; i5 < mo10305; i5++) {
                i mo10308 = this.f9416.mo10308(i5);
                if (mo10308.f9464 != -1 || mo10308.f9467 || mo10308.f9474) {
                    this.f9415.add(mo10308);
                }
            }
            int size = this.f9415.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    i iVar = this.f9415.get(i6);
                    if (iVar.f9467) {
                        m10333(dVar, iVar, true);
                    } else if (iVar.f9474) {
                        m10315(dVar, iVar, true);
                    } else {
                        mo10335(dVar, dVar.f9436[iVar.f9464], true);
                    }
                }
                this.f9415.clear();
            } else {
                z5 = true;
            }
        }
        if (d.f9424 && this.f9412 != null && this.f9416.mo10305() == 0) {
            this.f9417 = true;
            dVar.f9430 = true;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public b m10319(d dVar, int i5) {
        this.f9416.mo10304(dVar.m10363(i5, "ep"), 1.0f);
        this.f9416.mo10304(dVar.m10363(i5, "em"), -1.0f);
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    b m10320(i iVar, int i5) {
        this.f9416.mo10304(iVar, i5);
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean m10321(d dVar) {
        boolean z5;
        i m10322 = m10322(dVar);
        if (m10322 == null) {
            z5 = true;
        } else {
            m10339(m10322);
            z5 = false;
        }
        if (this.f9416.mo10305() == 0) {
            this.f9417 = true;
        }
        return z5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    i m10322(d dVar) {
        boolean m10312;
        boolean m103122;
        int mo10305 = this.f9416.mo10305();
        i iVar = null;
        i iVar2 = null;
        boolean z5 = false;
        boolean z6 = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < mo10305; i5++) {
            float mo10301 = this.f9416.mo10301(i5);
            i mo10308 = this.f9416.mo10308(i5);
            if (mo10308.f9470 == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    m103122 = m10312(mo10308, dVar);
                } else if (f5 > mo10301) {
                    m103122 = m10312(mo10308, dVar);
                } else if (!z5 && m10312(mo10308, dVar)) {
                    f5 = mo10301;
                    iVar = mo10308;
                    z5 = true;
                }
                z5 = m103122;
                f5 = mo10301;
                iVar = mo10308;
            } else if (iVar == null && mo10301 < 0.0f) {
                if (iVar2 == null) {
                    m10312 = m10312(mo10308, dVar);
                } else if (f6 > mo10301) {
                    m10312 = m10312(mo10308, dVar);
                } else if (!z6 && m10312(mo10308, dVar)) {
                    f6 = mo10301;
                    iVar2 = mo10308;
                    z6 = true;
                }
                z6 = m10312;
                f6 = mo10301;
                iVar2 = mo10308;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    b m10323(i iVar, i iVar2, int i5, float f5, i iVar3, i iVar4, int i6) {
        if (iVar2 == iVar3) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar4, 1.0f);
            this.f9416.mo10304(iVar2, -2.0f);
            return this;
        }
        if (f5 == 0.5f) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9416.mo10304(iVar3, -1.0f);
            this.f9416.mo10304(iVar4, 1.0f);
            if (i5 > 0 || i6 > 0) {
                this.f9413 = (-i5) + i6;
            }
        } else if (f5 <= 0.0f) {
            this.f9416.mo10304(iVar, -1.0f);
            this.f9416.mo10304(iVar2, 1.0f);
            this.f9413 = i5;
        } else if (f5 >= 1.0f) {
            this.f9416.mo10304(iVar4, -1.0f);
            this.f9416.mo10304(iVar3, 1.0f);
            this.f9413 = -i6;
        } else {
            float f6 = 1.0f - f5;
            this.f9416.mo10304(iVar, f6 * 1.0f);
            this.f9416.mo10304(iVar2, f6 * (-1.0f));
            this.f9416.mo10304(iVar3, (-1.0f) * f5);
            this.f9416.mo10304(iVar4, 1.0f * f5);
            if (i5 > 0 || i6 > 0) {
                this.f9413 = ((-i5) * f6) + (i6 * f5);
            }
        }
        return this;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    b m10324(i iVar, int i5) {
        this.f9412 = iVar;
        float f5 = i5;
        iVar.f9466 = f5;
        this.f9413 = f5;
        this.f9417 = true;
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    b m10325(i iVar, i iVar2, float f5) {
        this.f9416.mo10304(iVar, -1.0f);
        this.f9416.mo10304(iVar2, f5);
        return this;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public b m10326(i iVar, i iVar2, i iVar3, i iVar4, float f5) {
        this.f9416.mo10304(iVar, -1.0f);
        this.f9416.mo10304(iVar2, 1.0f);
        this.f9416.mo10304(iVar3, f5);
        this.f9416.mo10304(iVar4, -f5);
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public b m10327(float f5, float f6, float f7, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f9413 = 0.0f;
        if (f6 == 0.0f || f5 == f7) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9416.mo10304(iVar4, 1.0f);
            this.f9416.mo10304(iVar3, -1.0f);
        } else if (f5 == 0.0f) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
        } else if (f7 == 0.0f) {
            this.f9416.mo10304(iVar3, 1.0f);
            this.f9416.mo10304(iVar4, -1.0f);
        } else {
            float f8 = (f5 / f6) / (f7 / f6);
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9416.mo10304(iVar4, f8);
            this.f9416.mo10304(iVar3, -f8);
        }
        return this;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public b m10328(i iVar, int i5) {
        if (i5 < 0) {
            this.f9413 = i5 * (-1);
            this.f9416.mo10304(iVar, 1.0f);
        } else {
            this.f9413 = i5;
            this.f9416.mo10304(iVar, -1.0f);
        }
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public b m10329(i iVar, i iVar2, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f9413 = i5;
        }
        if (z5) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
        } else {
            this.f9416.mo10304(iVar, -1.0f);
            this.f9416.mo10304(iVar2, 1.0f);
        }
        return this;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public b m10330(i iVar, i iVar2, i iVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f9413 = i5;
        }
        if (z5) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9416.mo10304(iVar3, -1.0f);
        } else {
            this.f9416.mo10304(iVar, -1.0f);
            this.f9416.mo10304(iVar2, 1.0f);
            this.f9416.mo10304(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public b m10331(i iVar, i iVar2, i iVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f9413 = i5;
        }
        if (z5) {
            this.f9416.mo10304(iVar, 1.0f);
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9416.mo10304(iVar3, 1.0f);
        } else {
            this.f9416.mo10304(iVar, -1.0f);
            this.f9416.mo10304(iVar2, 1.0f);
            this.f9416.mo10304(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public b m10332(i iVar, i iVar2, i iVar3, i iVar4, float f5) {
        this.f9416.mo10304(iVar3, 0.5f);
        this.f9416.mo10304(iVar4, 0.5f);
        this.f9416.mo10304(iVar, -0.5f);
        this.f9416.mo10304(iVar2, -0.5f);
        this.f9413 = -f5;
        return this;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m10333(d dVar, i iVar, boolean z5) {
        if (iVar == null || !iVar.f9467) {
            return;
        }
        this.f9413 += iVar.f9466 * this.f9416.mo10306(iVar);
        this.f9416.mo10310(iVar, z5);
        if (z5) {
            iVar.m10387(this);
        }
        if (d.f9424 && this.f9416.mo10305() == 0) {
            this.f9417 = true;
            dVar.f9430 = true;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m10334() {
        float f5 = this.f9413;
        if (f5 < 0.0f) {
            this.f9413 = f5 * (-1.0f);
            this.f9416.mo10311();
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void mo10335(d dVar, b bVar, boolean z5) {
        this.f9413 += bVar.f9413 * this.f9416.mo10303(bVar, z5);
        if (z5) {
            bVar.f9412.m10387(this);
        }
        if (d.f9424 && this.f9412 != null && this.f9416.mo10305() == 0) {
            this.f9417 = true;
            dVar.f9430 = true;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    boolean m10336() {
        i iVar = this.f9412;
        return iVar != null && (iVar.f9470 == i.a.UNRESTRICTED || this.f9413 >= 0.0f);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    boolean m10337(i iVar) {
        return this.f9416.mo10307(iVar);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public i m10338(i iVar) {
        return m10313(null, iVar);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m10339(i iVar) {
        i iVar2 = this.f9412;
        if (iVar2 != null) {
            this.f9416.mo10304(iVar2, -1.0f);
            this.f9412.f9464 = -1;
            this.f9412 = null;
        }
        float mo10310 = this.f9416.mo10310(iVar, true) * (-1.0f);
        this.f9412 = iVar;
        if (mo10310 == 1.0f) {
            return;
        }
        this.f9413 /= mo10310;
        this.f9416.mo10309(mo10310);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m10340() {
        this.f9412 = null;
        this.f9416.clear();
        this.f9413 = 0.0f;
        this.f9417 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String m10341() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.m10341():java.lang.String");
    }

    public b(c cVar) {
        this.f9416 = new n.a(this, cVar);
    }
}
