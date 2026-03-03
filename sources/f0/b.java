package f0;

import android.annotation.SuppressLint;
import android.text.Editable;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b extends Editable.Factory {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Object f7642 = new Object();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static volatile Editable.Factory f7643;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Class<?> f7644;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f7644 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f7643 == null) {
            synchronized (f7642) {
                if (f7643 == null) {
                    f7643 = new b();
                }
            }
        }
        return f7643;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f7644;
        return cls != null ? d0.b.m8158(cls, charSequence) : super.newEditable(charSequence);
    }
}
