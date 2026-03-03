package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class v {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j f3704;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final ClassLoader f3705;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f3707;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f3708;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f3709;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f3710;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f3711;

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean f3712;

    /* renamed from: ˎ, reason: contains not printable characters */
    String f3714;

    /* renamed from: ˏ, reason: contains not printable characters */
    int f3715;

    /* renamed from: ˑ, reason: contains not printable characters */
    CharSequence f3716;

    /* renamed from: י, reason: contains not printable characters */
    int f3717;

    /* renamed from: ـ, reason: contains not printable characters */
    CharSequence f3718;

    /* renamed from: ٴ, reason: contains not printable characters */
    ArrayList<String> f3719;

    /* renamed from: ᐧ, reason: contains not printable characters */
    ArrayList<String> f3720;

    /* renamed from: ᵎ, reason: contains not printable characters */
    ArrayList<Runnable> f3722;

    /* renamed from: ʽ, reason: contains not printable characters */
    ArrayList<a> f3706 = new ArrayList<>();

    /* renamed from: ˋ, reason: contains not printable characters */
    boolean f3713 = true;

    /* renamed from: ᴵ, reason: contains not printable characters */
    boolean f3721 = false;

    /* compiled from: FragmentTransaction.java */
    static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f3723;

        /* renamed from: ʼ, reason: contains not printable characters */
        e f3724;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f3725;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f3726;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f3727;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f3728;

        /* renamed from: ˈ, reason: contains not printable characters */
        l.b f3729;

        /* renamed from: ˉ, reason: contains not printable characters */
        l.b f3730;

        a() {
        }

        a(int i5, e eVar) {
            this.f3723 = i5;
            this.f3724 = eVar;
            l.b bVar = l.b.RESUMED;
            this.f3729 = bVar;
            this.f3730 = bVar;
        }
    }

    v(j jVar, ClassLoader classLoader) {
        this.f3704 = jVar;
        this.f3705 = classLoader;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public v m4336(int i5, e eVar, String str) {
        mo3951(i5, eVar, str, 1);
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    v m4337(ViewGroup viewGroup, e eVar, String str) {
        eVar.mContainer = viewGroup;
        return m4336(viewGroup.getId(), eVar, str);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public v m4338(e eVar, String str) {
        mo3951(0, eVar, str, 1);
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m4339(a aVar) {
        this.f3706.add(aVar);
        aVar.f3725 = this.f3707;
        aVar.f3726 = this.f3708;
        aVar.f3727 = this.f3709;
        aVar.f3728 = this.f3710;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public v m4340(String str) {
        if (!this.f3713) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f3712 = true;
        this.f3714 = str;
        return this;
    }

    /* renamed from: ˈ */
    public abstract int mo3947();

    /* renamed from: ˉ */
    public abstract int mo3948();

    /* renamed from: ˊ */
    public abstract void mo3949();

    /* renamed from: ˋ */
    public abstract void mo3950();

    /* renamed from: ˎ, reason: contains not printable characters */
    public v m4341() {
        if (this.f3712) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f3713 = false;
        return this;
    }

    /* renamed from: ˏ */
    void mo3951(int i5, e eVar, String str, int i6) {
        Class<?> cls = eVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = eVar.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + eVar + ": was " + eVar.mTag + " now " + str);
            }
            eVar.mTag = str;
        }
        if (i5 != 0) {
            if (i5 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + eVar + " with tag " + str + " to container view with no id");
            }
            int i7 = eVar.mFragmentId;
            if (i7 != 0 && i7 != i5) {
                throw new IllegalStateException("Can't change container ID of fragment " + eVar + ": was " + eVar.mFragmentId + " now " + i5);
            }
            eVar.mFragmentId = i5;
            eVar.mContainerId = i5;
        }
        m4339(new a(i6, eVar));
    }

    /* renamed from: ˑ */
    public v mo3952(e eVar) {
        m4339(new a(3, eVar));
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public v m4342(int i5, e eVar) {
        return m4343(i5, eVar, null);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public v m4343(int i5, e eVar, String str) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo3951(i5, eVar, str, 2);
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public v m4344(boolean z5) {
        this.f3721 = z5;
        return this;
    }
}
