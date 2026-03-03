package f4;

import e4.u;
import e4.v;
import e4.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w3.d0;
import w3.e0;

/* compiled from: ClassReference.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e implements j4.b<Object>, d {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final a f7785 = new a(null);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Map<Class<? extends v3.c<?>>, Integer> f7786;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final HashMap<String, String> f7787;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final HashMap<String, String> f7788;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final HashMap<String, String> f7789;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final Map<String, String> f7790;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Class<?> f7791;

    /* compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i5 = 0;
        List m12564 = w3.n.m12564(e4.a.class, e4.l.class, e4.p.class, e4.q.class, e4.r.class, e4.s.class, e4.t.class, u.class, v.class, w.class, e4.b.class, e4.c.class, e4.d.class, e4.e.class, e4.f.class, e4.g.class, e4.h.class, e4.i.class, e4.j.class, e4.k.class, e4.m.class, e4.n.class, e4.o.class);
        ArrayList arrayList = new ArrayList(w3.o.m12567(m12564, 10));
        for (Object obj : m12564) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                w3.n.m12566();
            }
            arrayList.add(v3.m.m12385((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        f7786 = e0.m12528(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f7787 = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f7788 = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.m8622(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.m8622(str, "kotlinName");
            sb.append(l4.m.m9765(str, '.', null, 2, null));
            sb.append("CompanionObject");
            v3.i m12385 = v3.m.m12385(sb.toString(), str + ".Companion");
            hashMap3.put(m12385.m12378(), m12385.m12379());
        }
        for (Map.Entry<Class<? extends v3.c<?>>, Integer> entry : f7786.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f7789 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.m12513(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), l4.m.m9765((String) entry2.getValue(), '.', null, 2, null));
        }
        f7790 = linkedHashMap;
    }

    public e(Class<?> cls) {
        k.m8623(cls, "jClass");
        this.f7791 = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.m8619(d4.a.m8256(this), d4.a.m8256((j4.b) obj));
    }

    public int hashCode() {
        return d4.a.m8256(this).hashCode();
    }

    public String toString() {
        return mo8615().toString() + " (Kotlin reflection is not available)";
    }

    @Override // f4.d
    /* renamed from: ʻ */
    public Class<?> mo8615() {
        return this.f7791;
    }
}
