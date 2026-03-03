package f4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: CollectionToArray.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Object[] f7792 = new Object[0];

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final Object[] m8616(Collection<?> collection) {
        k.m8623(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    objArr[i5] = it.next();
                    if (i6 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i7 = ((i6 * 3) + 1) >>> 1;
                        if (i7 <= i6) {
                            i7 = 2147483645;
                            if (i6 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i7);
                        k.m8622(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i6);
                        k.m8622(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i5 = i6;
                }
            }
        }
        return f7792;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final Object[] m8617(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        k.m8623(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i5 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            k.m8621(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i6 = i5 + 1;
            objArr2[i5] = it.next();
            if (i6 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i7 = ((i6 * 3) + 1) >>> 1;
                if (i7 <= i6) {
                    i7 = 2147483645;
                    if (i6 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i7);
                k.m8622(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i6] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i6);
                k.m8622(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i5 = i6;
        }
    }
}
