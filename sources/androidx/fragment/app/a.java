package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a extends v implements n.InterfaceC0048n {

    /* renamed from: ᵔ, reason: contains not printable characters */
    final n f3391;

    /* renamed from: ᵢ, reason: contains not printable characters */
    boolean f3392;

    /* renamed from: ⁱ, reason: contains not printable characters */
    int f3393;

    a(n nVar) {
        super(nVar.m4180(), nVar.m4183() != null ? nVar.m4183().m4119().getClassLoader() : null);
        this.f3393 = -1;
        this.f3391 = nVar;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static boolean m3942(v.a aVar) {
        e eVar = aVar.f3724;
        return (eVar == null || !eVar.mAdded || eVar.mView == null || eVar.mDetached || eVar.mHidden || !eVar.isPostponed()) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3393 >= 0) {
            sb.append(" #");
            sb.append(this.f3393);
        }
        if (this.f3714 != null) {
            sb.append(" ");
            sb.append(this.f3714);
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.n.InterfaceC0048n
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo3943(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.m4148(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3712) {
            return true;
        }
        this.f3391.m4210(this);
        return true;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m3944() {
        if (this.f3722 != null) {
            for (int i5 = 0; i5 < this.f3722.size(); i5++) {
                this.f3722.get(i5).run();
            }
            this.f3722 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.e m3945(java.util.ArrayList<androidx.fragment.app.e> r6, androidx.fragment.app.e r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.v$a> r0 = r5.f3706
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.v$a> r2 = r5.f3706
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.v$a r2 = (androidx.fragment.app.v.a) r2
            int r3 = r2.f3723
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.l$b r3 = r2.f3729
            r2.f3730 = r3
            goto L32
        L22:
            androidx.fragment.app.e r7 = r2.f3724
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.e r2 = r2.f3724
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.e r2 = r2.f3724
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.m3945(java.util.ArrayList, androidx.fragment.app.e):androidx.fragment.app.e");
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    void m3946(e.m mVar) {
        for (int i5 = 0; i5 < this.f3706.size(); i5++) {
            v.a aVar = this.f3706.get(i5);
            if (m3942(aVar)) {
                aVar.f3724.setOnStartEnterTransitionListener(mVar);
            }
        }
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˈ, reason: contains not printable characters */
    public int mo3947() {
        return m3954(false);
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˉ, reason: contains not printable characters */
    public int mo3948() {
        return m3954(true);
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo3949() {
        m4341();
        this.f3391.m4173(this, false);
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo3950() {
        m4341();
        this.f3391.m4173(this, true);
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˏ, reason: contains not printable characters */
    void mo3951(int i5, e eVar, String str, int i6) {
        super.mo3951(i5, eVar, str, i6);
        eVar.mFragmentManager = this.f3391;
    }

    @Override // androidx.fragment.app.v
    /* renamed from: ˑ, reason: contains not printable characters */
    public v mo3952(e eVar) {
        n nVar = eVar.mFragmentManager;
        if (nVar == null || nVar == this.f3391) {
            return super.mo3952(eVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + eVar.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m3953(int i5) {
        if (this.f3712) {
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i5);
            }
            int size = this.f3706.size();
            for (int i6 = 0; i6 < size; i6++) {
                v.a aVar = this.f3706.get(i6);
                e eVar = aVar.f3724;
                if (eVar != null) {
                    eVar.mBackStackNesting += i5;
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3724 + " to " + aVar.f3724.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    int m3954(boolean z5) {
        if (this.f3392) {
            throw new IllegalStateException("commit already called");
        }
        if (n.m4148(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
            m3956("  ", printWriter);
            printWriter.close();
        }
        this.f3392 = true;
        if (this.f3712) {
            this.f3393 = this.f3391.m4233();
        } else {
            this.f3393 = -1;
        }
        this.f3391.m4245(this, z5);
        return this.f3393;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    boolean m3955() {
        for (int i5 = 0; i5 < this.f3706.size(); i5++) {
            if (m3942(this.f3706.get(i5))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m3956(String str, PrintWriter printWriter) {
        m3957(str, printWriter, true);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m3957(String str, PrintWriter printWriter, boolean z5) {
        String str2;
        if (z5) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3714);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3393);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3392);
            if (this.f3711 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3711));
            }
            if (this.f3707 != 0 || this.f3708 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3707));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3708));
            }
            if (this.f3709 != 0 || this.f3710 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3709));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3710));
            }
            if (this.f3715 != 0 || this.f3716 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3715));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3716);
            }
            if (this.f3717 != 0 || this.f3718 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3717));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3718);
            }
        }
        if (this.f3706.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3706.size();
        for (int i5 = 0; i5 < size; i5++) {
            v.a aVar = this.f3706.get(i5);
            switch (aVar.f3723) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3723;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i5);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3724);
            if (z5) {
                if (aVar.f3725 != 0 || aVar.f3726 != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3725));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3726));
                }
                if (aVar.f3727 != 0 || aVar.f3728 != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3727));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3728));
                }
            }
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m3958() {
        int size = this.f3706.size();
        for (int i5 = 0; i5 < size; i5++) {
            v.a aVar = this.f3706.get(i5);
            e eVar = aVar.f3724;
            if (eVar != null) {
                eVar.setPopDirection(false);
                eVar.setNextTransition(this.f3711);
                eVar.setSharedElementNames(this.f3719, this.f3720);
            }
            switch (aVar.f3723) {
                case 1:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, false);
                    this.f3391.m4227(eVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3723);
                case 3:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4216(eVar);
                    break;
                case 4:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4192(eVar);
                    break;
                case 5:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, false);
                    this.f3391.m4224(eVar);
                    break;
                case 6:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4251(eVar);
                    break;
                case 7:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, false);
                    this.f3391.m4236(eVar);
                    break;
                case 8:
                    this.f3391.m4223(eVar);
                    break;
                case 9:
                    this.f3391.m4223(null);
                    break;
                case 10:
                    this.f3391.m4222(eVar, aVar.f3730);
                    break;
            }
            if (!this.f3721 && aVar.f3723 != 1 && eVar != null && !n.f3600) {
                this.f3391.m4202(eVar);
            }
        }
        if (this.f3721 || n.f3600) {
            return;
        }
        n nVar = this.f3391;
        nVar.m4203(nVar.f3629, true);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m3959(boolean z5) {
        for (int size = this.f3706.size() - 1; size >= 0; size--) {
            v.a aVar = this.f3706.get(size);
            e eVar = aVar.f3724;
            if (eVar != null) {
                eVar.setPopDirection(true);
                eVar.setNextTransition(n.m4155(this.f3711));
                eVar.setSharedElementNames(this.f3720, this.f3719);
            }
            switch (aVar.f3723) {
                case 1:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, true);
                    this.f3391.m4216(eVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3723);
                case 3:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4227(eVar);
                    break;
                case 4:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4224(eVar);
                    break;
                case 5:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, true);
                    this.f3391.m4192(eVar);
                    break;
                case 6:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4236(eVar);
                    break;
                case 7:
                    eVar.setAnimations(aVar.f3725, aVar.f3726, aVar.f3727, aVar.f3728);
                    this.f3391.m4221(eVar, true);
                    this.f3391.m4251(eVar);
                    break;
                case 8:
                    this.f3391.m4223(null);
                    break;
                case 9:
                    this.f3391.m4223(eVar);
                    break;
                case 10:
                    this.f3391.m4222(eVar, aVar.f3729);
                    break;
            }
            if (!this.f3721 && aVar.f3723 != 3 && eVar != null && !n.f3600) {
                this.f3391.m4202(eVar);
            }
        }
        if (this.f3721 || !z5 || n.f3600) {
            return;
        }
        n nVar = this.f3391;
        nVar.m4203(nVar.f3629, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* renamed from: ﹳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.e m3960(java.util.ArrayList<androidx.fragment.app.e> r17, androidx.fragment.app.e r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.v$a> r5 = r0.f3706
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.v$a> r5 = r0.f3706
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.v$a r5 = (androidx.fragment.app.v.a) r5
            int r6 = r5.f3723
            r7 = 1
            if (r6 == r7) goto Lb2
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L58
            if (r6 == r10) goto L41
            r8 = 6
            if (r6 == r8) goto L41
            r8 = 7
            if (r6 == r8) goto Lb2
            r8 = 8
            if (r6 == r8) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.v$a> r6 = r0.f3706
            androidx.fragment.app.v$a r8 = new androidx.fragment.app.v$a
            r8.<init>(r11, r3)
            r6.add(r4, r8)
            int r4 = r4 + 1
            androidx.fragment.app.e r3 = r5.f3724
            goto Lb7
        L41:
            androidx.fragment.app.e r6 = r5.f3724
            r1.remove(r6)
            androidx.fragment.app.e r5 = r5.f3724
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.v$a> r3 = r0.f3706
            androidx.fragment.app.v$a r6 = new androidx.fragment.app.v$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lb7
        L58:
            androidx.fragment.app.e r6 = r5.f3724
            int r8 = r6.mContainerId
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.e r14 = (androidx.fragment.app.e) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.v$a> r3 = r0.f3706
            androidx.fragment.app.v$a r15 = new androidx.fragment.app.v$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L81:
            androidx.fragment.app.v$a r15 = new androidx.fragment.app.v$a
            r15.<init>(r10, r14)
            int r2 = r5.f3725
            r15.f3725 = r2
            int r2 = r5.f3727
            r15.f3727 = r2
            int r2 = r5.f3726
            r15.f3726 = r2
            int r2 = r5.f3728
            r15.f3728 = r2
            java.util.ArrayList<androidx.fragment.app.v$a> r2 = r0.f3706
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.v$a> r2 = r0.f3706
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f3723 = r7
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.e r2 = r5.f3724
            r1.add(r2)
        Lb7:
            int r4 = r4 + r7
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.m3960(java.util.ArrayList, androidx.fragment.app.e):androidx.fragment.app.e");
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public String m3961() {
        return this.f3714;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    boolean m3962(int i5) {
        int size = this.f3706.size();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar = this.f3706.get(i6).f3724;
            int i7 = eVar != null ? eVar.mContainerId : 0;
            if (i7 != 0 && i7 == i5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean m3963(ArrayList<a> arrayList, int i5, int i6) {
        if (i6 == i5) {
            return false;
        }
        int size = this.f3706.size();
        int i7 = -1;
        for (int i8 = 0; i8 < size; i8++) {
            e eVar = this.f3706.get(i8).f3724;
            int i9 = eVar != null ? eVar.mContainerId : 0;
            if (i9 != 0 && i9 != i7) {
                for (int i10 = i5; i10 < i6; i10++) {
                    a aVar = arrayList.get(i10);
                    int size2 = aVar.f3706.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        e eVar2 = aVar.f3706.get(i11).f3724;
                        if ((eVar2 != null ? eVar2.mContainerId : 0) == i9) {
                            return true;
                        }
                    }
                }
                i7 = i9;
            }
        }
        return false;
    }
}
