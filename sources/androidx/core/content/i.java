package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FileProvider.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends ContentProvider {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final String[] f2575 = {"_display_name", "_size"};

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final File f2576 = new File("/");

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final HashMap<String, b> f2577 = new HashMap<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private b f2578;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f2579 = 0;

    /* compiled from: FileProvider.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static File[] m2028(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* compiled from: FileProvider.java */
    interface b {
        /* renamed from: ʻ, reason: contains not printable characters */
        File mo2029(Uri uri);

        /* renamed from: ʼ, reason: contains not printable characters */
        Uri mo2030(File file);
    }

    /* compiled from: FileProvider.java */
    static class c implements b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f2580;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final HashMap<String, File> f2581 = new HashMap<>();

        c(String str) {
            this.f2580 = str;
        }

        @Override // androidx.core.content.i.b
        /* renamed from: ʻ */
        public File mo2029(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2581.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.i.b
        /* renamed from: ʼ */
        public Uri mo2030(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.f2581.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f2580).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m2031(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f2581.put(str, file.getCanonicalFile());
            } catch (IOException e5) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e5);
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static File m2020(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Object[] m2021(Object[] objArr, int i5) {
        Object[] objArr2 = new Object[i5];
        System.arraycopy(objArr, 0, objArr2, 0, i5);
        return objArr2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String[] m2022(String[] strArr, int i5) {
        String[] strArr2 = new String[i5];
        System.arraycopy(strArr, 0, strArr2, 0, i5);
        return strArr2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static XmlResourceParser m2023(Context context, String str, ProviderInfo providerInfo, int i5) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i5 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i5);
        }
        XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData != null) {
            return loadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static b m2024(Context context, String str, int i5) {
        b bVar;
        HashMap<String, b> hashMap = f2577;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    try {
                        bVar = m2027(context, str, i5);
                        hashMap.put(str, bVar);
                    } catch (IOException e5) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                    }
                } catch (XmlPullParserException e6) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e6);
                }
            }
        }
        return bVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Uri m2025(Context context, String str, File file) {
        return m2024(context, str, 0).mo2030(file);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static int m2026(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static b m2027(Context context, String str, int i5) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser m2023 = m2023(context, str, context.getPackageManager().resolveContentProvider(str, 128), i5);
        while (true) {
            int next = m2023.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = m2023.getName();
                File file = null;
                String attributeValue = m2023.getAttributeValue(null, "name");
                String attributeValue2 = m2023.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    file = f2576;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] m1995 = androidx.core.content.a.m1995(context, null);
                    if (m1995.length > 0) {
                        file = m1995[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] m1994 = androidx.core.content.a.m1994(context);
                    if (m1994.length > 0) {
                        file = m1994[0];
                    }
                } else if (Build.VERSION.SDK_INT >= 21 && "external-media-path".equals(name)) {
                    File[] m2028 = a.m2028(context);
                    if (m2028.length > 0) {
                        file = m2028[0];
                    }
                }
                if (file != null) {
                    cVar.m2031(attributeValue, m2020(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, b> hashMap = f2577;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
        this.f2578 = m2024(context, str, this.f2579);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f2578.mo2029(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo2029 = this.f2578.mo2029(uri);
        int lastIndexOf = mo2029.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo2029.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.f2578.mo2029(uri), m2026(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i5;
        File mo2029 = this.f2578.mo2029(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f2575;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i6 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i6] = "_display_name";
                i5 = i6 + 1;
                objArr[i6] = queryParameter == null ? mo2029.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i6] = "_size";
                i5 = i6 + 1;
                objArr[i6] = Long.valueOf(mo2029.length());
            }
            i6 = i5;
        }
        String[] m2022 = m2022(strArr3, i6);
        Object[] m2021 = m2021(objArr, i6);
        MatrixCursor matrixCursor = new MatrixCursor(m2022, 1);
        matrixCursor.addRow(m2021);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
