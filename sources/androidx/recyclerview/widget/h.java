package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* compiled from: OpReorderer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h {

    /* renamed from: ʻ, reason: contains not printable characters */
    final a f4316;

    /* compiled from: OpReorderer.java */
    interface a {
        /* renamed from: ʻ */
        void mo5053(a.b bVar);

        /* renamed from: ʼ */
        a.b mo5054(int i5, int i6, int i7, Object obj);
    }

    h(a aVar) {
        this.f4316 = aVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private int m5160(List<a.b> list) {
        boolean z5 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f4186 != 8) {
                z5 = true;
            } else if (z5) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5161(List<a.b> list, int i5, a.b bVar, int i6, a.b bVar2) {
        int i7 = bVar.f4189;
        int i8 = bVar2.f4187;
        int i9 = i7 < i8 ? -1 : 0;
        int i10 = bVar.f4187;
        if (i10 < i8) {
            i9++;
        }
        if (i8 <= i10) {
            bVar.f4187 = i10 + bVar2.f4189;
        }
        int i11 = bVar2.f4187;
        if (i11 <= i7) {
            bVar.f4189 = i7 + bVar2.f4189;
        }
        bVar2.f4187 = i11 + i9;
        list.set(i5, bVar2);
        list.set(i6, bVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m5162(List<a.b> list, int i5, int i6) {
        a.b bVar = list.get(i5);
        a.b bVar2 = list.get(i6);
        int i7 = bVar2.f4186;
        if (i7 == 1) {
            m5161(list, i5, bVar, i6, bVar2);
        } else if (i7 == 2) {
            m5164(list, i5, bVar, i6, bVar2);
        } else {
            if (i7 != 4) {
                return;
            }
            m5165(list, i5, bVar, i6, bVar2);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m5163(List<a.b> list) {
        while (true) {
            int m5160 = m5160(list);
            if (m5160 == -1) {
                return;
            } else {
                m5162(list, m5160, m5160 + 1);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m5164(List<a.b> list, int i5, a.b bVar, int i6, a.b bVar2) {
        boolean z5;
        int i7 = bVar.f4187;
        int i8 = bVar.f4189;
        boolean z6 = false;
        if (i7 < i8) {
            if (bVar2.f4187 == i7 && bVar2.f4189 == i8 - i7) {
                z5 = false;
                z6 = true;
            } else {
                z5 = false;
            }
        } else if (bVar2.f4187 == i8 + 1 && bVar2.f4189 == i7 - i8) {
            z5 = true;
            z6 = true;
        } else {
            z5 = true;
        }
        int i9 = bVar2.f4187;
        if (i8 < i9) {
            bVar2.f4187 = i9 - 1;
        } else {
            int i10 = bVar2.f4189;
            if (i8 < i9 + i10) {
                bVar2.f4189 = i10 - 1;
                bVar.f4186 = 2;
                bVar.f4189 = 1;
                if (bVar2.f4189 == 0) {
                    list.remove(i6);
                    this.f4316.mo5053(bVar2);
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f4187;
        int i12 = bVar2.f4187;
        a.b bVar3 = null;
        if (i11 <= i12) {
            bVar2.f4187 = i12 + 1;
        } else {
            int i13 = bVar2.f4189;
            if (i11 < i12 + i13) {
                bVar3 = this.f4316.mo5054(2, i11 + 1, (i12 + i13) - i11, null);
                bVar2.f4189 = bVar.f4187 - bVar2.f4187;
            }
        }
        if (z6) {
            list.set(i5, bVar2);
            list.remove(i6);
            this.f4316.mo5053(bVar);
            return;
        }
        if (z5) {
            if (bVar3 != null) {
                int i14 = bVar.f4187;
                if (i14 > bVar3.f4187) {
                    bVar.f4187 = i14 - bVar3.f4189;
                }
                int i15 = bVar.f4189;
                if (i15 > bVar3.f4187) {
                    bVar.f4189 = i15 - bVar3.f4189;
                }
            }
            int i16 = bVar.f4187;
            if (i16 > bVar2.f4187) {
                bVar.f4187 = i16 - bVar2.f4189;
            }
            int i17 = bVar.f4189;
            if (i17 > bVar2.f4187) {
                bVar.f4189 = i17 - bVar2.f4189;
            }
        } else {
            if (bVar3 != null) {
                int i18 = bVar.f4187;
                if (i18 >= bVar3.f4187) {
                    bVar.f4187 = i18 - bVar3.f4189;
                }
                int i19 = bVar.f4189;
                if (i19 >= bVar3.f4187) {
                    bVar.f4189 = i19 - bVar3.f4189;
                }
            }
            int i20 = bVar.f4187;
            if (i20 >= bVar2.f4187) {
                bVar.f4187 = i20 - bVar2.f4189;
            }
            int i21 = bVar.f4189;
            if (i21 >= bVar2.f4187) {
                bVar.f4189 = i21 - bVar2.f4189;
            }
        }
        list.set(i5, bVar2);
        if (bVar.f4187 != bVar.f4189) {
            list.set(i6, bVar);
        } else {
            list.remove(i6);
        }
        if (bVar3 != null) {
            list.add(i5, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: ˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m5165(java.util.List<androidx.recyclerview.widget.a.b> r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f4189
            int r1 = r13.f4187
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f4187 = r1
            goto L20
        Ld:
            int r5 = r13.f4189
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f4189 = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4316
            int r1 = r11.f4187
            java.lang.Object r5 = r13.f4188
            androidx.recyclerview.widget.a$b r0 = r0.mo5054(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f4187
            int r5 = r13.f4187
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f4187 = r5
            goto L41
        L2b:
            int r6 = r13.f4189
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f4316
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f4188
            androidx.recyclerview.widget.a$b r4 = r4.mo5054(r2, r1, r5, r3)
            int r1 = r13.f4189
            int r1 = r1 - r5
            r13.f4189 = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4189
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4316
            r11.mo5053(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.m5165(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
