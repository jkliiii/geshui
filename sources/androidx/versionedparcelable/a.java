package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: VersionedParcel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final m.a<String, Method> f4692;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final m.a<String, Method> f4693;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final m.a<String, Class> f4694;

    public a(m.a<String, Method> aVar, m.a<String, Method> aVar2, m.a<String, Class> aVar3) {
        this.f4692 = aVar;
        this.f4693 = aVar2;
        this.f4694 = aVar3;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Class m5512(Class<? extends r0.a> cls) throws ClassNotFoundException {
        Class cls2 = this.f4694.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f4694.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Method m5513(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f4692.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f4692.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿ, reason: contains not printable characters */
    private Method m5514(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f4693.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m5512 = m5512(cls);
        System.currentTimeMillis();
        Method declaredMethod = m5512.getDeclaredMethod("write", cls, a.class);
        this.f4693.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m5515(r0.a aVar) {
        try {
            mo5524(m5512(aVar.getClass()).getName());
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected abstract void mo5516();

    /* renamed from: ʻʻ, reason: contains not printable characters */
    protected abstract void mo5517(CharSequence charSequence);

    /* renamed from: ʼ, reason: contains not printable characters */
    protected abstract a mo5518();

    /* renamed from: ʼʼ, reason: contains not printable characters */
    protected abstract void mo5519(int i5);

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m5520(CharSequence charSequence, int i5) {
        mo5548(i5);
        mo5517(charSequence);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    protected abstract void mo5521(Parcelable parcelable);

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m5522(int i5, int i6) {
        mo5548(i6);
        mo5519(i5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m5523() {
        return false;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    protected abstract void mo5524(String str);

    /* renamed from: ˈ, reason: contains not printable characters */
    protected abstract boolean mo5525();

    /* renamed from: ˈˈ, reason: contains not printable characters */
    protected <T extends r0.a> void m5526(T t5, a aVar) {
        try {
            m5514(t5.getClass()).invoke(null, t5, aVar);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (!(e8.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
            }
            throw ((RuntimeException) e8.getCause());
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m5527(boolean z5, int i5) {
        return !mo5535(i5) ? z5 : mo5525();
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void m5528(String str, int i5) {
        mo5548(i5);
        mo5524(str);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected abstract byte[] mo5529();

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m5530(r0.a aVar, int i5) {
        mo5548(i5);
        m5532(aVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m5531(byte[] bArr, int i5) {
        return !mo5535(i5) ? bArr : mo5529();
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    protected void m5532(r0.a aVar) {
        if (aVar == null) {
            mo5524(null);
            return;
        }
        m5515(aVar);
        a mo5518 = mo5518();
        m5526(aVar, mo5518);
        mo5518.mo5516();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected abstract CharSequence mo5533();

    /* renamed from: ˏ, reason: contains not printable characters */
    public CharSequence m5534(CharSequence charSequence, int i5) {
        return !mo5535(i5) ? charSequence : mo5533();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    protected abstract boolean mo5535(int i5);

    /* renamed from: י, reason: contains not printable characters */
    protected <T extends r0.a> T m5536(String str, a aVar) {
        try {
            return (T) m5513(str).invoke(null, aVar);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e7);
        } catch (InvocationTargetException e8) {
            if (e8.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e8.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e8);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    protected abstract int mo5537();

    /* renamed from: ــ, reason: contains not printable characters */
    public void m5538(Parcelable parcelable, int i5) {
        mo5548(i5);
        mo5521(parcelable);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public int m5539(int i5, int i6) {
        return !mo5535(i6) ? i5 : mo5537();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    protected abstract <T extends Parcelable> T mo5540();

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected abstract void mo5541(byte[] bArr);

    /* renamed from: ᴵ, reason: contains not printable characters */
    public <T extends Parcelable> T m5542(T t5, int i5) {
        return !mo5535(i5) ? t5 : (T) mo5540();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m5543(byte[] bArr, int i5) {
        mo5548(i5);
        mo5541(bArr);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected abstract String mo5544();

    /* renamed from: ᵔ, reason: contains not printable characters */
    public String m5545(String str, int i5) {
        return !mo5535(i5) ? str : mo5544();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    protected <T extends r0.a> T m5546() {
        String mo5544 = mo5544();
        if (mo5544 == null) {
            return null;
        }
        return (T) m5536(mo5544, mo5518());
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public <T extends r0.a> T m5547(T t5, int i5) {
        return !mo5535(i5) ? t5 : (T) m5546();
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    protected abstract void mo5548(int i5);

    /* renamed from: ﾞ, reason: contains not printable characters */
    protected abstract void mo5550(boolean z5);

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m5551(boolean z5, int i5) {
        mo5548(i5);
        mo5550(z5);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m5549(boolean z5, boolean z6) {
    }
}
