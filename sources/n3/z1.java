package n3;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.lt.app.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.d;
import n3.k;
import w0.f;

/* compiled from: Tools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class z1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Map<String, String> f10033;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Gson f10034;

    /* compiled from: Tools.java */
    class a extends Handler {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ e f10035;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Looper looper, e eVar) {
            super(looper);
            this.f10035 = eVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.f10035.mo8748(Long.valueOf(message.getData().getLong("load")), Long.valueOf(message.getData().getLong("total")));
        }
    }

    /* compiled from: Tools.java */
    class b extends TypeToken<Map<String, String>> {
        b() {
        }
    }

    /* compiled from: Tools.java */
    static /* synthetic */ class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10036;

        static {
            int[] iArr = new int[k.b.values().length];
            f10036 = iArr;
            try {
                iArr[k.b.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10036[k.b.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10036[k.b.Audio.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Tools.java */
    public static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Map<String, Object> f10037;

        /* synthetic */ d(int i5, a aVar) {
            this(i5);
        }

        public String toString() {
            return z1.m10907(this.f10037);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public Map<String, Object> m10960() {
            return this.f10037;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public d m10961(String str, Object obj) {
            this.f10037.put(str, obj);
            return this;
        }

        private d(int i5) {
            this.f10037 = new HashMap(i5);
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static <T> T m10872(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) new Gson().fromJson(str, (Class) cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static /* synthetic */ void m10873(List list, w0.f fVar, int i5, Context context, List list2, d0 d0Var, f fVar2, int i6, File file, String str) {
        list.add(file);
        fVar.m12479(i5);
        m10956(context, list2, d0Var, fVar2, i6, i5 + 1, list, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static /* synthetic */ void m10874(Context context, Bitmap bitmap, Uri uri, f fVar, boolean z5) {
        if (z5) {
            m10892(context, bitmap, uri, fVar);
        } else if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʾ, reason: contains not printable characters */
    public static /* synthetic */ void m10875(Context context, byte[] bArr, Uri uri, f fVar, boolean z5) {
        if (z5) {
            m10894(context, bArr, uri, fVar);
        } else if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static /* synthetic */ void m10876(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻˆ, reason: contains not printable characters */
    public static /* synthetic */ void m10877(Context context, int i5) {
        Toast.makeText(context, i5, 1).show();
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public static String m10878(String str) {
        return m10879(str, "application/octet-stream");
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public static String m10879(String str, String str2) {
        String fileExtensionFromUrl;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        fileExtensionFromUrl.hashCode();
        switch (fileExtensionFromUrl) {
            case "js":
                str3 = "application/javascript";
                break;
            case "css":
                str3 = "text/css";
                break;
            case "gif":
                str3 = "image/gif";
                break;
            case "jpg":
            case "jpeg":
                str3 = "image/jpeg";
                break;
            case "mp3":
                str3 = "audio/mpeg";
                break;
            case "mp4":
                str3 = "video/mp4";
                break;
            case "png":
                str3 = "image/png";
                break;
            case "svg":
                str3 = "image/svg+xml";
                break;
            case "json":
                str3 = "application/json";
                break;
            case "woff":
            case "woff2":
                str3 = "application/x-font-woff";
                break;
            default:
                str3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                break;
        }
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private static OutputStream m10880(Context context, Uri uri) {
        if (context != null && uri != null) {
            try {
                return "file".equals(uri.getScheme()) ? new FileOutputStream(uri.getPath()) : context.getContentResolver().openOutputStream(uri);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    public static int m10881(String str, int i5) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i5;
        }
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public static String m10882(String str) {
        return Build.VERSION.SDK_INT < 33 ? str : "android.permission.READ_EXTERNAL_STORAGE".equals(str) ? "android.permission.READ_MEDIA_IMAGES" : str;
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public static Dialog m10883(Context context, String str) {
        final w0.f m12482 = new f.e(context).m12486(str).m12494(true, 0).m12482();
        Handler handler = new Handler(Looper.getMainLooper());
        Objects.requireNonNull(m12482);
        handler.post(new Runnable() { // from class: n3.s1
            @Override // java.lang.Runnable
            public final void run() {
                m12482.show();
            }
        });
        return m12482;
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public static void m10884(final Dialog dialog) {
        if (dialog != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: n3.w1
                @Override // java.lang.Runnable
                public final void run() {
                    dialog.dismiss();
                }
            });
        }
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    public static String m10885(Context context, String str) {
        if (context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(32768);
        try {
            InputStream open = context.getAssets().open(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, StandardCharsets.UTF_8));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                if (open != null) {
                    open.close();
                }
                return sb2;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public static void m10886(Context context, BroadcastReceiver broadcastReceiver, String str) {
        if (context == null || broadcastReceiver == null || TextUtils.isEmpty(str)) {
            return;
        }
        context.registerReceiver(broadcastReceiver, new IntentFilter(str), context.getPackageName() + ".permission.YM_APP", new Handler(Looper.getMainLooper()));
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public static Bitmap m10887(Bitmap bitmap, int i5, int i6) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float min = Math.min(i5 / width, i6 / height);
        if (min >= 1.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(min, min);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public static String m10888(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        if (str.startsWith("fs:")) {
            File m10915 = m10915(context, str);
            return m10915 == null ? BuildConfig.FLAVOR : Uri.fromFile(m10915).toString();
        }
        if (!str.startsWith("local:")) {
            return str;
        }
        return "file:///android_asset/" + str.substring(6);
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private static Uri m10889(Context context, String str, k.b bVar) {
        String str2;
        Uri uri;
        String str3;
        String str4;
        if (context != null && !TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT < 29) {
                int i5 = c.f10036[bVar.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    str4 = Environment.DIRECTORY_DCIM;
                } else {
                    if (i5 != 3) {
                        return null;
                    }
                    str4 = Environment.DIRECTORY_MUSIC;
                }
                return Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(str4), str));
            }
            int i6 = c.f10036[bVar.ordinal()];
            if (i6 == 1) {
                str2 = Environment.DIRECTORY_DCIM;
                uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                str3 = str.endsWith("gif") ? "image/gif" : "image/png";
            } else if (i6 == 2) {
                str2 = Environment.DIRECTORY_DCIM;
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                str3 = "video/mp4";
            } else {
                if (i6 != 3) {
                    return null;
                }
                str2 = Environment.DIRECTORY_MUSIC;
                uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                str3 = "audio/wav";
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str3);
            contentValues.put("relative_path", str2);
            try {
                return context.getContentResolver().insert(uri, contentValues);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public static Uri m10890(Context context) {
        return m10891(context, "png");
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    public static Uri m10891(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(".");
        if (TextUtils.isEmpty(str)) {
            str = "png";
        }
        sb.append(str);
        return m10889(context, sb.toString(), k.b.Image);
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    private static void m10892(Context context, Bitmap bitmap, Uri uri, f<Uri> fVar) {
        try {
            OutputStream m10880 = m10880(context, uri);
            if (m10880 != null) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, m10880);
                m10880.flush();
                m10880.close();
            }
            m10925(context, uri);
            if (fVar != null) {
                fVar.mo8742(uri);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            if (fVar != null) {
                fVar.mo8742(null);
            }
        }
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    public static void m10893(final Context context, final Bitmap bitmap, final f<Uri> fVar) {
        final Uri m10890 = m10890(context);
        if (m10890 == null || bitmap == null) {
            if (fVar != null) {
                fVar.mo8742(null);
            }
        } else if (!"file".equals(m10890.getScheme())) {
            m10892(context, bitmap, m10890, fVar);
        } else if (context instanceof n3.d) {
            ((n3.d) context).m10767(new d.b() { // from class: n3.v1
                @Override // n3.d.b
                /* renamed from: ʻ */
                public final void mo10771(boolean z5) {
                    z1.m10874(context, bitmap, m10890, fVar, z5);
                }
            }, h1.f9743, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    private static void m10894(Context context, byte[] bArr, Uri uri, f<Uri> fVar) {
        try {
            OutputStream m10880 = m10880(context, uri);
            if (m10880 != null) {
                m10880.write(bArr);
                m10880.flush();
                m10880.close();
            }
            m10925(context, uri);
            if (fVar != null) {
                fVar.mo8742(uri);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            if (fVar != null) {
                fVar.mo8742(null);
            }
        }
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public static void m10895(final Context context, final byte[] bArr, String str, final f<Uri> fVar) {
        final Uri m10891 = m10891(context, str);
        if (m10891 == null || bArr == null) {
            if (fVar != null) {
                fVar.mo8742(null);
            }
        } else if (!"file".equals(m10891.getScheme())) {
            m10894(context, bArr, m10891, fVar);
        } else if (context instanceof n3.d) {
            ((n3.d) context).m10767(new d.b() { // from class: n3.y1
                @Override // n3.d.b
                /* renamed from: ʻ */
                public final void mo10771(boolean z5) {
                    z1.m10875(context, bArr, m10891, fVar, z5);
                }
            }, h1.f9743, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    public static Uri m10896(Context context, String str) {
        return m10889(context, str, k.b.Video);
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    public static void m10898(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        context.sendBroadcast(intent, context.getPackageName() + ".permission.YM_APP");
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static String m10899(ContentResolver contentResolver, Uri uri) {
        String m10919 = m10919(contentResolver, uri);
        int lastIndexOf = TextUtils.isEmpty(m10919) ? -1 : m10919.lastIndexOf(".");
        if (lastIndexOf >= 0) {
            return m10919.substring(lastIndexOf + 1);
        }
        return null;
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static void m10900(Activity activity, boolean z5) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i5 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z5 ? i5 : 0);
            objArr[1] = Integer.valueOf(i5);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static void m10901(Activity activity, boolean z5) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i5 = declaredField.getInt(null);
            int i6 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z5 ? i6 | i5 : (i5 ^ (-1)) & i6);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    public static void m10902(View view, boolean z5, int i5) {
        if (view == null || !(view.getContext() instanceof Activity)) {
            return;
        }
        m10904((Activity) view.getContext(), !z5);
        m10903(view, i5);
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    public static void m10903(View view, int i5) {
        int i6;
        Window window;
        if (view instanceof DrawerLayout) {
            ((DrawerLayout) view).setStatusBarBackground(new ColorDrawable(i5));
            return;
        }
        if (view == null || !(view.getContext() instanceof Activity) || (i6 = Build.VERSION.SDK_INT) < 21 || (window = ((Activity) view.getContext()).getWindow()) == null) {
            return;
        }
        window.addFlags(RecyclerView.UNDEFINED_DURATION);
        window.clearFlags(67108864);
        if (i6 >= 23) {
            window.setStatusBarColor(i5);
        }
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public static void m10904(Activity activity, boolean z5) {
        m10900(activity, !z5);
        m10901(activity, !z5);
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    public static void m10905(Context context, Uri uri, Bundle bundle) {
        Intent m10942 = m10942(context, uri);
        if (m10942 == null) {
            return;
        }
        if (bundle != null) {
            m10942.putExtras(bundle);
        }
        context.startActivity(m10942);
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    public static File m10906(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        File file = new File(externalCacheDir, "_ym_tmp/" + str);
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    public static String m10907(Object obj) {
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (f10034 == null) {
            f10034 = new GsonBuilder().serializeNulls().serializeSpecialFloatingPointValues().create();
        }
        try {
            return f10034.toJson(obj);
        } catch (Exception unused) {
            return "{}";
        }
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    public static void m10908(final Context context, final int i5) {
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: n3.q1
                @Override // java.lang.Runnable
                public final void run() {
                    z1.m10877(context, i5);
                }
            });
        } else {
            Toast.makeText(context, i5, 1).show();
        }
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    public static void m10909(final Context context, final String str) {
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: n3.l1
                @Override // java.lang.Runnable
                public final void run() {
                    z1.m10876(context, str);
                }
            });
        } else {
            Toast.makeText(context, str, 1).show();
        }
    }

    /* renamed from: ʼˑ, reason: contains not printable characters */
    public static void m10910(Context context) {
        m10911(context, null, null);
    }

    /* renamed from: ʼי, reason: contains not printable characters */
    public static void m10911(Context context, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = BuildConfig.FLAVOR;
        String str4 = isEmpty ? BuildConfig.FLAVOR : m10934(context).get(str);
        int i5 = h1.f9744;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4 + ".";
        }
        sb.append(str3);
        sb.append(str2);
        objArr[0] = sb.toString();
        Toast.makeText(context, context.getString(i5, objArr), 1).show();
    }

    /* renamed from: ʼـ, reason: contains not printable characters */
    public static void m10912(Context context, String str, String str2) {
        m10911(context, str, str2);
    }

    /* renamed from: ʼٴ, reason: contains not printable characters */
    public static void m10913(Context context, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = BuildConfig.FLAVOR;
        String str4 = isEmpty ? BuildConfig.FLAVOR : m10934(context).get(str);
        int i5 = h1.f9745;
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str4)) {
            str3 = str4 + ".";
        }
        sb.append(str3);
        sb.append(str2);
        objArr[0] = sb.toString();
        Toast.makeText(context, context.getString(i5, objArr), 1).show();
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static File m10915(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (str.startsWith("fs://www/")) {
                return new File("/android_asset/" + str.substring(5));
            }
            boolean startsWith = str.startsWith("fs://file/");
            String str2 = BuildConfig.FLAVOR;
            if (startsWith) {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    externalFilesDir = context.getFilesDir();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("app_ym/");
                if (str.length() > 10) {
                    str2 = str.substring(10);
                }
                sb.append(str2);
                return new File(externalFilesDir, sb.toString());
            }
            if (str.startsWith("fs://cache/")) {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    externalCacheDir = context.getCacheDir();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("app_ym/");
                if (str.length() > 11) {
                    str2 = str.substring(11);
                }
                sb2.append(str2);
                return new File(externalCacheDir, sb2.toString());
            }
        }
        return null;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static long m10917(File file) {
        File[] listFiles;
        long j5 = 0;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j5 += file2.isDirectory() ? m10917(file2) : file2.length();
        }
        return j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x002b  */
    /* renamed from: ʿʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m10919(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            java.lang.String r0 = r9.getScheme()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            int r1 = r0.hashCode()
            r2 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r1 == r2) goto L21
            r2 = 951530617(0x38b73479, float:8.735894E-5)
            if (r1 == r2) goto L17
            goto L2b
        L17:
            java.lang.String r1 = "content"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            r0 = 0
            goto L2c
        L21:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = -1
        L2c:
            r1 = 0
            if (r0 == 0) goto L43
            java.lang.String r8 = r9.getPath()
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L63
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            java.lang.String r1 = r9.getName()
            goto L63
        L43:
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)
            if (r8 == 0) goto L63
            java.lang.String r9 = "_display_name"
            int r9 = r8.getColumnIndex(r9)
            boolean r0 = r8.moveToFirst()
            if (r0 == 0) goto L60
            java.lang.String r9 = r8.getString(r9)
            r1 = r9
        L60:
            r8.close()
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.z1.m10919(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static byte[] m10921(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            int i7 = i6 + 1;
            bArr[i5] = (byte) Integer.decode("0x" + str.substring(i6, i7) + str.substring(i7, i7 + 1)).intValue();
        }
        return bArr;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static boolean m10923(Context context) {
        return m10929(context, "360");
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static void m10925(Context context, Uri uri) {
        if (context == null || uri == null || !"file".equals(uri.getScheme())) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        context.sendBroadcast(intent);
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static boolean m10927() {
        return m10931("honor");
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static boolean m10929(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || !str.equals(context.getString(h1.f9740))) ? false : true;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static boolean m10931(String str) {
        String str2 = Build.MANUFACTURER;
        return str2 != null && str2.toLowerCase().contains(str);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static boolean m10933() {
        return m10931("huawei");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static synchronized Map<String, String> m10934(Context context) {
        synchronized (z1.class) {
            if (f10033 == null) {
                InputStream openRawResource = context.getResources().openRawResource(g1.f9736);
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[2048];
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                try {
                                    break;
                                } catch (IOException e5) {
                                    e = e5;
                                    e.printStackTrace();
                                    f10033 = (Map) new Gson().fromJson(stringWriter.toString(), new b().getType());
                                    return f10033;
                                }
                            }
                            stringWriter.write(cArr, 0, read);
                        }
                        openRawResource.close();
                    } finally {
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    try {
                        openRawResource.close();
                    } catch (IOException e7) {
                        e = e7;
                        e.printStackTrace();
                        f10033 = (Map) new Gson().fromJson(stringWriter.toString(), new b().getType());
                        return f10033;
                    }
                }
                f10033 = (Map) new Gson().fromJson(stringWriter.toString(), new b().getType());
            }
        }
        return f10033;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static boolean m10935() {
        return m10931("vivo");
    }

    /* renamed from: י, reason: contains not printable characters */
    public static Bitmap m10936(String str) {
        byte[] m10938 = m10938(str);
        if (m10938 == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(m10938, 0, m10938.length);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: יי, reason: contains not printable characters */
    public static /* synthetic */ void m10937(e eVar, Exception exc, File file) {
        if (eVar != null) {
            if (exc != null) {
                file = null;
            }
            eVar.mo8748(file, exc != null ? exc.getMessage() : null);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static byte[] m10938(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int indexOf = str.startsWith("data:") ? str.indexOf("base64,") : 0;
            if (indexOf > 0) {
                str = str.substring(indexOf + 7);
            }
            return Base64.decode(str, 0);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public static void m10939(Context context, Uri uri, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (Build.VERSION.SDK_INT >= 24 && (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536)) != null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                context.grantUriPermission(it.next().activityInfo.packageName, uri, 1);
            }
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static String m10940(int i5) {
        int alpha = Color.alpha(i5);
        return alpha == 255 ? String.format("#%06X", Integer.valueOf(i5 & 16777215)) : String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i5)), Integer.valueOf(Color.green(i5)), Integer.valueOf(Color.blue(i5)), Integer.valueOf(alpha));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴٴ, reason: contains not printable characters */
    public static /* synthetic */ void m10941(Handler handler, long j5, long j6) {
        Bundle bundle = new Bundle(2);
        bundle.putLong("load", j5);
        bundle.putLong("total", j6);
        Message obtainMessage = handler.obtainMessage(0);
        obtainMessage.setData(bundle);
        handler.sendMessage(obtainMessage);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static Intent m10942(Context context, Uri uri) {
        try {
            MainActivity mainActivity = MainActivity.f6674;
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.addFlags(268435456);
            if (uri != null) {
                if ("https".equals(uri.getScheme()) || "http".equals(uri.getScheme())) {
                    intent.setData(uri);
                } else {
                    String queryParameter = "app".equals(uri.getHost()) ? uri.getQueryParameter("url") : uri.toString();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            intent.setData(Uri.parse(queryParameter));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return intent;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static Uri m10943(Context context, File file) {
        if (Build.VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        return androidx.core.content.i.m2025(context, context.getPackageName() + ".xym_pf", file);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static void m10944(File file, boolean z5) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null) {
                            return;
                        }
                        for (File file2 : listFiles) {
                            m10944(file2, true);
                        }
                    }
                    if (z5) {
                        if (!file.isDirectory()) {
                            file.delete();
                            return;
                        }
                        File[] listFiles2 = file.listFiles();
                        if (listFiles2 == null || listFiles2.length != 0) {
                            return;
                        }
                        file.delete();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static <T> T m10945(String str, TypeToken<T> typeToken) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) new Gson().fromJson(str, typeToken.getType());
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static int m10946(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public static /* synthetic */ void m10947(Context context, File file, e eVar, String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("data:")) {
            m10950(context, str, file, eVar);
        } else if (eVar != null) {
            eVar.mo8748(null, null);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m10948(final Context context, final String str, final Uri uri, final e<Uri, String> eVar, final e<Long, Long> eVar2) {
        if (!"file".equals(uri.getScheme())) {
            m10952(context, str, uri, eVar, eVar2);
        } else if (context instanceof n3.d) {
            ((n3.d) context).m10767(new d.b() { // from class: n3.r1
                @Override // n3.d.b
                /* renamed from: ʻ */
                public final void mo10771(boolean z5) {
                    z1.m10955(context, str, uri, eVar, eVar2, z5);
                }
            }, h1.f9743, "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (eVar != null) {
            eVar.mo8748(null, null);
        }
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static d m10949(int i5) {
        return new d(i5, null);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static void m10950(final Context context, String str, final File file, final e<File, String> eVar) {
        if (URLUtil.isFileUrl(str)) {
            if (eVar != null) {
                eVar.mo8748(file, null);
                return;
            }
            return;
        }
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            x2.l.m12714(context).mo187(str).mo182(file).mo9865(new m2.g() { // from class: n3.t1
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    z1.m10937(eVar, exc, (File) obj);
                }
            });
            return;
        }
        if (str != null && str.startsWith("blob:") && (context instanceof n3.d)) {
            n3.d dVar = (n3.d) context;
            if (dVar.mo7924() instanceof j2.f) {
                final j2.f fVar = (j2.f) dVar.mo7924();
                fVar.evaluateJavascript("!function(e){delete window.__ym_cb_;var n=new XMLHttpRequest;n.open(\"GET\",\"" + str + "\",!0),n.responseType=\"blob\",n.onload=function(){if(200===n.status){var e=new FileReader;e.onload=function(){window.__ym_res_=e.result,setTimeout(function(){delete window.__ym_cb_},5e3)},e.readAsDataURL(n.response)}},n.send()}();", new ValueCallback() { // from class: n3.u1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        z1.m10953(fVar, context, file, eVar, (String) obj);
                    }
                });
                return;
            }
        }
        if (eVar != null) {
            byte[] m10938 = m10938(str);
            if (m10938 != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(m10938);
                    fileOutputStream.close();
                    eVar.mo8748(file, null);
                    return;
                } catch (Exception unused) {
                }
            }
            eVar.mo8748(null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static /* synthetic */ void m10951(j2.f fVar, final Context context, final File file, final e eVar) {
        fVar.evaluateJavascript("window.__ym_res_", new ValueCallback() { // from class: n3.p1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                z1.m10947(context, file, eVar, (String) obj);
            }
        });
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static void m10952(final Context context, String str, final Uri uri, final e<Uri, String> eVar, e<Long, Long> eVar2) {
        try {
            OutputStream m10880 = m10880(context, uri);
            a3.c mo187 = x2.l.m12714(context).mo187(str);
            if (eVar2 != null) {
                final a aVar = new a(Looper.getMainLooper(), eVar2);
                mo187.mo193(new x2.y() { // from class: n3.m1
                    @Override // x2.y
                    /* renamed from: ʻ */
                    public final void mo9030(long j5, long j6) {
                        z1.m10941(aVar, j5, j6);
                    }
                });
            }
            mo187.mo183(m10880).mo9865(new m2.g() { // from class: n3.n1
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    z1.m10957(context, uri, eVar, exc, (OutputStream) obj);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m10953(final j2.f fVar, final Context context, final File file, final e eVar, String str) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: n3.o1
            @Override // java.lang.Runnable
            public final void run() {
                z1.m10951(fVar, context, file, eVar);
            }
        }, 1200L);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static void m10954(Context context, List<String> list, d0<Integer, File> d0Var, f<List<File>> fVar) {
        int size = list != null ? list.size() : 0;
        m10956(context, list, d0Var, fVar, size, 0, new ArrayList(size), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static /* synthetic */ void m10955(Context context, String str, Uri uri, e eVar, e eVar2, boolean z5) {
        if (z5) {
            m10952(context, str, uri, eVar, eVar2);
        } else if (eVar != null) {
            eVar.mo8748(null, null);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static void m10956(final Context context, final List<String> list, final d0<Integer, File> d0Var, final f<List<File>> fVar, final int i5, final int i6, final List<File> list2, w0.f fVar2) {
        final w0.f fVar3;
        if (i6 >= i5) {
            if (fVar2 != null) {
                fVar2.dismiss();
            }
            fVar.mo8742(list2);
        } else {
            if (fVar2 == null) {
                w0.f m12496 = new f.e(context).m12498(null).m12484(h1.f9742).m12495(false, 0, true).m12483(false).m12496();
                m12496.m12478(i5);
                fVar3 = m12496;
            } else {
                fVar3 = fVar2;
            }
            m10950(context, list.get(i6), d0Var.mo8739(Integer.valueOf(i6)), new e() { // from class: n3.x1
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    z1.m10873(list2, fVar3, i6, context, list, d0Var, fVar, i5, (File) obj, (String) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public static /* synthetic */ void m10957(Context context, Uri uri, e eVar, Exception exc, OutputStream outputStream) {
        try {
            outputStream.flush();
            outputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        m10925(context, uri);
        if (eVar != null) {
            eVar.mo8748(uri, exc != null ? exc.getMessage() : null);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static void m10958(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4102);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static void m10959(Window window) {
        if (window == null) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(0);
    }
}
