package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import f4.g;
import f4.k;
import i4.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import v3.i;
import v3.m;
import w3.d0;
import w3.e0;
import w3.j;
import w3.v;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends d.a<String[], Map<String, Boolean>> {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a f6824 = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Intent m8152(String[] strArr) {
            k.m8623(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            k.m8622(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // d.a
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Intent mo4263(Context context, String[] strArr) {
        k.m8623(context, "context");
        k.m8623(strArr, "input");
        return f6824.m8152(strArr);
    }

    @Override // d.a
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public a.C0098a<Map<String, Boolean>> mo8147(Context context, String[] strArr) {
        k.m8623(context, "context");
        k.m8623(strArr, "input");
        boolean z5 = true;
        if (strArr.length == 0) {
            return new a.C0098a<>(e0.m12525());
        }
        int length = strArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            if (!(androidx.core.content.a.m1990(context, strArr[i5]) == 0)) {
                z5 = false;
                break;
            }
            i5++;
        }
        if (!z5) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.m9256(d0.m12513(strArr.length), 16));
        for (String str : strArr) {
            i m12385 = m.m12385(str, Boolean.TRUE);
            linkedHashMap.put(m12385.m12378(), m12385.m12379());
        }
        return new a.C0098a<>(linkedHashMap);
    }

    @Override // d.a
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo4264(int i5, Intent intent) {
        if (i5 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return e0.m12525();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i6 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i6 == 0));
            }
            return e0.m12528(v.m12568(j.m12542(stringArrayExtra), arrayList));
        }
        return e0.m12525();
    }
}
