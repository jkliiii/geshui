package androidx.lifecycle;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n0.d;

/* compiled from: SavedStateHandle.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e0 {

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final a f3799 = new a(null);

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Class<? extends Object>[] f3800;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<String, Object> f3801;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<String, d.c> f3802;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<String, Object> f3803;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Map<String, o4.a<Object>> f3804;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final d.c f3805;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final e0 m4421(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new e0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    f4.k.m8622(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new e0(hashMap);
            }
            ClassLoader classLoader = e0.class.getClassLoader();
            f4.k.m8620(classLoader);
            bundle.setClassLoader(classLoader);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = parcelableArrayList.get(i5);
                f4.k.m8621(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i5));
            }
            return new e0(linkedHashMap);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final boolean m4422(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : e0.f3800) {
                f4.k.m8620(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        Class<? extends Object>[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i5 = Build.VERSION.SDK_INT;
        clsArr[27] = i5 >= 21 ? Size.class : cls;
        if (i5 >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f3800 = clsArr;
    }

    public e0(Map<String, ? extends Object> map) {
        f4.k.m8623(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3801 = linkedHashMap;
        this.f3802 = new LinkedHashMap();
        this.f3803 = new LinkedHashMap();
        this.f3804 = new LinkedHashMap();
        this.f3805 = new d.c() { // from class: androidx.lifecycle.d0
            @Override // n0.d.c
            /* renamed from: ʻ */
            public final Bundle mo369() {
                return e0.m4418(this.f3798);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static final Bundle m4418(e0 e0Var) {
        f4.k.m8623(e0Var, "this$0");
        for (Map.Entry entry : w3.e0.m12530(e0Var.f3802).entrySet()) {
            e0Var.m4420((String) entry.getKey(), ((d.c) entry.getValue()).mo369());
        }
        Set<String> keySet = e0Var.f3801.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(e0Var.f3801.get(str));
        }
        return androidx.core.os.f.m2410(v3.m.m12385("keys", arrayList), v3.m.m12385("values", arrayList2));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final d.c m4419() {
        return this.f3805;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final <T> void m4420(String str, T t5) {
        f4.k.m8623(str, "key");
        if (!f3799.m4422(t5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            f4.k.m8620(t5);
            sb.append(t5.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        Object obj = this.f3803.get(str);
        v vVar = obj instanceof v ? (v) obj : null;
        if (vVar != null) {
            vVar.mo4511(t5);
        } else {
            this.f3801.put(str, t5);
        }
        o4.a<Object> aVar = this.f3804.get(str);
        if (aVar == null) {
            return;
        }
        aVar.setValue(t5);
    }

    public e0() {
        this.f3801 = new LinkedHashMap();
        this.f3802 = new LinkedHashMap();
        this.f3803 = new LinkedHashMap();
        this.f3804 = new LinkedHashMap();
        this.f3805 = new d.c() { // from class: androidx.lifecycle.d0
            @Override // n0.d.c
            /* renamed from: ʻ */
            public final Bundle mo369() {
                return e0.m4418(this.f3798);
            }
        };
    }
}
