package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: FontProvider.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Comparator<byte[]> f2759 = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.m2457((byte[]) obj, (byte[]) obj2);
        }
    };

    /* compiled from: FontProvider.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Cursor m2459(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static List<byte[]> m2452(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m2453(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals(list.get(i5), list2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static List<List<byte[]>> m2454(e eVar, Resources resources) {
        return eVar.m2461() != null ? eVar.m2461() : androidx.core.content.res.f.m2081(resources, eVar.m2462());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static g.a m2455(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo m2456 = m2456(context.getPackageManager(), eVar, context.getResources());
        return m2456 == null ? g.a.m2480(1, null) : g.a.m2480(0, m2458(context, eVar, m2456.authority, cancellationSignal));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static ProviderInfo m2456(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String m2464 = eVar.m2464();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m2464, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + m2464);
        }
        if (!resolveContentProvider.packageName.equals(eVar.m2465())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + m2464 + ", but package was not " + eVar.m2465());
        }
        List<byte[]> m2452 = m2452(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(m2452, f2759);
        List<List<byte[]>> m2454 = m2454(eVar, resources);
        for (int i5 = 0; i5 < m2454.size(); i5++) {
            ArrayList arrayList = new ArrayList(m2454.get(i5));
            Collections.sort(arrayList, f2759);
            if (m2453(m2452, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static /* synthetic */ int m2457(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b6 = bArr[i5];
            byte b7 = bArr2[i5];
            if (b6 != b7) {
                return b6 - b7;
            }
        }
        return 0;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static g.b[] m2458(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        int i5;
        Uri withAppendedId;
        int i6;
        boolean z5;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = a.m2459(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.m2466()}, null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i7 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i8 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i5 = i7;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i5 = i7;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i9 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i6 = i5;
                        z5 = false;
                    } else {
                        i6 = i5;
                        z5 = true;
                    }
                    arrayList2.add(g.b.m2483(withAppendedId, i8, i9, z5, i6));
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
