package androidx.core.os;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* compiled from: Bundle.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Bundle m2410(v3.i<String, ? extends Object>... iVarArr) {
        f4.k.m8623(iVarArr, "pairs");
        Bundle bundle = new Bundle(iVarArr.length);
        for (v3.i<String, ? extends Object> iVar : iVarArr) {
            String m12376 = iVar.m12376();
            Object m12377 = iVar.m12377();
            if (m12377 == null) {
                bundle.putString(m12376, null);
            } else if (m12377 instanceof Boolean) {
                bundle.putBoolean(m12376, ((Boolean) m12377).booleanValue());
            } else if (m12377 instanceof Byte) {
                bundle.putByte(m12376, ((Number) m12377).byteValue());
            } else if (m12377 instanceof Character) {
                bundle.putChar(m12376, ((Character) m12377).charValue());
            } else if (m12377 instanceof Double) {
                bundle.putDouble(m12376, ((Number) m12377).doubleValue());
            } else if (m12377 instanceof Float) {
                bundle.putFloat(m12376, ((Number) m12377).floatValue());
            } else if (m12377 instanceof Integer) {
                bundle.putInt(m12376, ((Number) m12377).intValue());
            } else if (m12377 instanceof Long) {
                bundle.putLong(m12376, ((Number) m12377).longValue());
            } else if (m12377 instanceof Short) {
                bundle.putShort(m12376, ((Number) m12377).shortValue());
            } else if (m12377 instanceof Bundle) {
                bundle.putBundle(m12376, (Bundle) m12377);
            } else if (m12377 instanceof CharSequence) {
                bundle.putCharSequence(m12376, (CharSequence) m12377);
            } else if (m12377 instanceof Parcelable) {
                bundle.putParcelable(m12376, (Parcelable) m12377);
            } else if (m12377 instanceof boolean[]) {
                bundle.putBooleanArray(m12376, (boolean[]) m12377);
            } else if (m12377 instanceof byte[]) {
                bundle.putByteArray(m12376, (byte[]) m12377);
            } else if (m12377 instanceof char[]) {
                bundle.putCharArray(m12376, (char[]) m12377);
            } else if (m12377 instanceof double[]) {
                bundle.putDoubleArray(m12376, (double[]) m12377);
            } else if (m12377 instanceof float[]) {
                bundle.putFloatArray(m12376, (float[]) m12377);
            } else if (m12377 instanceof int[]) {
                bundle.putIntArray(m12376, (int[]) m12377);
            } else if (m12377 instanceof long[]) {
                bundle.putLongArray(m12376, (long[]) m12377);
            } else if (m12377 instanceof short[]) {
                bundle.putShortArray(m12376, (short[]) m12377);
            } else if (m12377 instanceof Object[]) {
                Class<?> componentType = m12377.getClass().getComponentType();
                f4.k.m8620(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    f4.k.m8621(m12377, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(m12376, (Parcelable[]) m12377);
                } else if (String.class.isAssignableFrom(componentType)) {
                    f4.k.m8621(m12377, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(m12376, (String[]) m12377);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    f4.k.m8621(m12377, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(m12376, (CharSequence[]) m12377);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + m12376 + '\"');
                    }
                    bundle.putSerializable(m12376, (Serializable) m12377);
                }
            } else if (m12377 instanceof Serializable) {
                bundle.putSerializable(m12376, (Serializable) m12377);
            } else {
                int i5 = Build.VERSION.SDK_INT;
                if (m12377 instanceof IBinder) {
                    b.m2405(bundle, m12376, (IBinder) m12377);
                } else if (i5 >= 21 && (m12377 instanceof Size)) {
                    e.m2408(bundle, m12376, (Size) m12377);
                } else {
                    if (i5 < 21 || !(m12377 instanceof SizeF)) {
                        throw new IllegalArgumentException("Illegal value type " + m12377.getClass().getCanonicalName() + " for key \"" + m12376 + '\"');
                    }
                    e.m2409(bundle, m12376, (SizeF) m12377);
                }
            }
        }
        return bundle;
    }
}
