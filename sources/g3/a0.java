package g3;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.PopupWindow;
import androidx.appcompat.app.b;
import com.lt.app.App;
import com.lt.plugin.IScan;
import h3.q1;
import j2.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import l3.t;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a1;
import n3.d;
import n3.k;
import n3.z1;

/* compiled from: Tools.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Dictionary<String, Pattern> f7875 = new Hashtable(3);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static /* synthetic */ void m8697(Activity activity, PopupWindow popupWindow, n3.f fVar, String str) {
        Objects.requireNonNull(popupWindow);
        activity.runOnUiThread(new p(popupWindow));
        if (fVar != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            fVar.mo8742(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static /* synthetic */ void m8699(Context context, final File file, DialogInterface dialogInterface, int i5) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.fromParts("package", context.getPackageName(), null));
        if (!(context instanceof n3.d)) {
            context.startActivity(intent);
            return;
        }
        final n3.d dVar = (n3.d) context;
        dVar.m10768(new d.a() { // from class: g3.q
            @Override // n3.d.a
            /* renamed from: ʻ */
            public final void mo7987(int i6, int i7, Intent intent2) {
                a0.m8705(dVar, file, i6, i7, intent2);
            }
        });
        dVar.startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static /* synthetic */ void m8701(final Activity activity, final PopupWindow popupWindow, final n3.f fVar, Exception exc, Bitmap bitmap) {
        if (exc == null && bitmap != null) {
            m8728(bitmap, new n3.f() { // from class: g3.o
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    a0.m8697(activity, popupWindow, fVar, (String) obj);
                }
            });
            return;
        }
        Objects.requireNonNull(popupWindow);
        activity.runOnUiThread(new p(popupWindow));
        if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static /* synthetic */ void m8703(n3.d dVar, boolean z5, Object obj) {
        if (z5) {
            return;
        }
        m8713(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static /* synthetic */ void m8705(n3.d dVar, File file, int i5, int i6, Intent intent) {
        if (i5 == 1) {
            dVar.m10768(null);
            if (i6 == -1) {
                m8733(dVar, file);
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static String m8707(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        try {
            return m8722(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e5) {
            e5.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static boolean m8709(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Dictionary<String, Pattern> dictionary = f7875;
        Pattern pattern = dictionary.get(str);
        if (pattern == null) {
            pattern = Pattern.compile(str);
            dictionary.put(str, pattern);
        }
        return pattern.matcher(str2).find();
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static int m8711(String str, int i5) {
        if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
            try {
                if (str.length() == 9) {
                    str = "#" + str.substring(7) + str.substring(1, 6);
                }
                return Color.parseColor(str);
            } catch (Exception unused) {
            }
        }
        return i5;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static void m8713(n3.d dVar) {
        m8721(dVar, null);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static Bitmap m8715(Bitmap bitmap, int i5, int i6) {
        return z1.m10887(bitmap, i5, i6);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static void m8717(final n3.d dVar, l3.t tVar, final n3.f<String> fVar) {
        s3.a aVar;
        IScan m10664 = a1.m10664();
        if (m10664 == null) {
            z1.m10912(dVar, BuildConfig.FLAVOR, "scan");
            return;
        }
        if (tVar == null || tVar.embed == null) {
            aVar = null;
        } else {
            aVar = new s3.a();
            t.a aVar2 = tVar.embed;
            aVar.f10867 = aVar2.action;
            aVar.f10868 = aVar2.position;
            aVar.f10869 = aVar2.height;
        }
        m10664.m8027(dVar, aVar, new n3.f() { // from class: g3.u
            @Override // n3.f
            /* renamed from: ʻ */
            public final void mo8742(Object obj) {
                a0.m8724(fVar, dVar, (String) obj);
            }
        }, new n3.e() { // from class: g3.v
            @Override // n3.e
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo8748(Object obj, Object obj2) {
                a0.m8730((n3.d) obj, (n3.f) obj2);
            }
        });
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static Bitmap m8718(String str) {
        return z1.m10936(str);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static void m8719(final n3.d dVar, j2.f fVar) {
        if (fVar != null) {
            fVar.mo9241("onMenuScan", null, new f.b() { // from class: g3.r
                @Override // j2.f.b
                /* renamed from: ʻ */
                public final void mo8747(boolean z5, Object obj) {
                    a0.m8703(dVar, z5, obj);
                }
            });
        } else {
            m8713(dVar);
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0038: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:57), block:B:43:0x0038 */
    /* renamed from: ˑ, reason: contains not printable characters */
    public static String m8720(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        String encodeToString;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            if (bitmap != null) {
                try {
                    byteArrayOutputStream2 = new ByteArrayOutputStream();
                } catch (IOException e5) {
                    e = e5;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.flush();
                            byteArrayOutputStream3.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    throw th;
                }
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                    encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                } catch (IOException e7) {
                    e = e7;
                    e.printStackTrace();
                    if (byteArrayOutputStream2 == null) {
                        return null;
                    }
                    try {
                        byteArrayOutputStream2.flush();
                        byteArrayOutputStream2.close();
                        return null;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        return null;
                    }
                }
            } else {
                encodeToString = null;
            }
            if (byteArrayOutputStream3 != null) {
                try {
                    byteArrayOutputStream3.flush();
                    byteArrayOutputStream3.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream3 = byteArrayOutputStream;
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static void m8721(n3.d dVar, n3.f<String> fVar) {
        m8717(dVar, null, fVar);
    }

    /* renamed from: י, reason: contains not printable characters */
    public static String m8722(byte[] bArr) {
        if (bArr == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder(32);
        for (byte b6 : bArr) {
            String hexString = Integer.toHexString(b6 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString().toLowerCase();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static int m8723(BitmapFactory.Options options, int i5, int i6) {
        int i7 = options.outHeight;
        int i8 = options.outWidth;
        if (i7 <= i6 && i8 <= i5) {
            return 1;
        }
        int round = Math.round(i7 / i6);
        int round2 = Math.round(i8 / i5);
        return round < round2 ? round2 : round;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ــ, reason: contains not printable characters */
    public static /* synthetic */ void m8724(n3.f fVar, n3.d dVar, String str) {
        if (fVar != null) {
            fVar.mo8742(str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String m7848 = App.m7835().m7848(str);
            q1 q1Var = new q1();
            q1Var.showTitle = 11;
            com.lt.app.c.m7976(dVar, m7848, q1Var);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static Map<String, Object> m8725(Context context) {
        return z1.m10949(2).m10961("os", "android").m10961("android", z1.m10949(11).m10961("brand", Build.BRAND).m10961("manufacturer", Build.MANUFACTURER).m10961("product", Build.PRODUCT).m10961("board", Build.BOARD).m10961("device", Build.DEVICE).m10961("display", Build.DISPLAY).m10961("fingerprint", Build.FINGERPRINT).m10961("hardware", Build.HARDWARE).m10961("id", Build.ID).m10961("api_level", Integer.valueOf(Build.VERSION.SDK_INT)).m10961(BuildConfig.BUILD_TYPE, Build.VERSION.RELEASE).m10960()).m10960();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static void m8726(final j2.f fVar, final String str, final n3.d0<Bitmap, Void> d0Var) {
        fVar.evaluateJavascript(String.format("(await async function(u){\ntry {\n var i = new Image();\n i.src = u;\n await new Promise(function(r) { setTimeout(r, 500) }); var c = document.createElement('canvas');\n c.width = i.width;\n c.height = i.height;\n c.getContext('2d').drawImage(i,0,0,i.width,i.height);\n return c.toDataURL('image/jpeg').substr(23);\n} catch(e) {\n return ''\n}\n}('%s'))", str), new ValueCallback() { // from class: g3.t
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a0.m8736(d0Var, fVar, str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static /* synthetic */ void m8727(n3.f fVar, String str) {
        if (fVar != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            fVar.mo8742(str);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static void m8728(final Bitmap bitmap, final n3.f<String> fVar) {
        if (bitmap == null) {
            if (fVar != null) {
                fVar.mo8742(null);
                return;
            }
            return;
        }
        final IScan m10664 = a1.m10664();
        if (m10664 != null) {
            new Thread(new Runnable() { // from class: g3.z
                @Override // java.lang.Runnable
                public final void run() {
                    a0.m8737(bitmap, m10664, fVar);
                }
            }).start();
            return;
        }
        z1.m10912(App.m7835(), BuildConfig.FLAVOR, "scan");
        if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static /* synthetic */ void m8729(final n3.f fVar, n3.d dVar, Uri[] uriArr) {
        if (uriArr == null || uriArr.length == 0) {
            if (fVar != null) {
                fVar.mo8742(null);
                return;
            }
            return;
        }
        try {
            Uri uri = uriArr[0];
            InputStream openInputStream = dVar.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, null, options);
            if (openInputStream != null) {
                openInputStream.close();
            }
            options.inSampleSize = m8723(options, 700, 900);
            options.inJustDecodeBounds = false;
            InputStream openInputStream2 = dVar.getContentResolver().openInputStream(uri);
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream2, null, options);
            if (openInputStream2 != null) {
                openInputStream2.close();
            }
            m8728(decodeStream, new n3.f() { // from class: g3.y
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    a0.m8727(fVar, (String) obj);
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static void m8730(final n3.d dVar, final n3.f<String> fVar) {
        if (a1.m10664() == null) {
            z1.m10912(dVar, BuildConfig.FLAVOR, "scan");
            if (fVar != null) {
                fVar.mo8742(null);
                return;
            }
            return;
        }
        if (App.m7815(8, true)) {
            new n3.k(new n3.f() { // from class: g3.w
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    a0.m8729(fVar, dVar, (Uri[]) obj);
                }
            }).m10792(dVar, k.b.Image);
            return;
        }
        com.lt.app.c.m7959(dVar, 2131820688);
        if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m8731(String str, View view, final n3.f<String> fVar) {
        if (a1.m10664() == null) {
            z1.m10912(view.getContext(), BuildConfig.FLAVOR, "scan");
            if (fVar != null) {
                fVar.mo8742(null);
                return;
            }
            return;
        }
        final Activity activity = (Activity) view.getContext();
        if (!App.m7815(8, true)) {
            com.lt.app.c.m7959(activity, 2131820688);
            if (fVar != null) {
                fVar.mo8742(null);
                return;
            }
            return;
        }
        if (com.lt.app.c.m7967(str)) {
            final PopupWindow m7980 = com.lt.app.c.m7980(view);
            x2.l.m12714(activity).mo187(str).mo181().mo9865(new m2.g() { // from class: g3.s
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    a0.m8701(activity, m7980, fVar, exc, (Bitmap) obj);
                }
            });
        } else if (fVar != null) {
            fVar.mo8742(null);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static byte[] m8732(String str) {
        return z1.m10921(str);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static boolean m8733(Context context, File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        Uri m7964 = com.lt.app.c.m7964(file);
        intent.setDataAndType(m7964, "application/vnd.android.package-archive");
        z1.m10939(context, m7964, intent);
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static void m8734(final Context context, final File file) {
        if (context.getApplicationInfo().targetSdkVersion > 26 && Build.VERSION.SDK_INT >= 26) {
            if (m8733(context, file)) {
                return;
            }
            if (!context.getPackageManager().canRequestPackageInstalls()) {
                new b.a(context).setMessage(2131820800).setPositiveButton(2131820649, new DialogInterface.OnClickListener() { // from class: g3.x
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        a0.m8699(context, file, dialogInterface, i5);
                    }
                }).setNegativeButton(2131820604, (DialogInterface.OnClickListener) null).create().show();
                return;
            }
        }
        m8733(context, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹶ, reason: contains not printable characters */
    public static /* synthetic */ void m8735(n3.d0 d0Var, Exception exc, Bitmap bitmap) {
        if (exc != null) {
            exc.printStackTrace();
        }
        if (d0Var != null) {
            d0Var.mo8739(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞ, reason: contains not printable characters */
    public static /* synthetic */ void m8736(final n3.d0 d0Var, j2.f fVar, String str, String str2) {
        if (TextUtils.isEmpty(str2) || str2.length() <= 10) {
            x2.l.m12714(fVar.getContext()).mo187(str).mo197("Referer", fVar.getUrl()).mo197("Cookie", fVar.mo7793(str)).mo181().mo9865(new m2.g() { // from class: g3.n
                @Override // m2.g
                /* renamed from: ʻ */
                public final void mo8740(Exception exc, Object obj) {
                    a0.m8735(d0Var, exc, (Bitmap) obj);
                }
            });
        } else if (d0Var != null) {
            d0Var.mo8739(m8718(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static /* synthetic */ void m8737(Bitmap bitmap, IScan iScan, n3.f fVar) {
        String str = null;
        try {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            canvas.drawColor(-1);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(524288);
            copy.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            copy.recycle();
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            str = iScan.m8028(App.m7835(), decodeByteArray);
            decodeByteArray.recycle();
        } catch (Exception unused) {
            Log.e("LT-APP", "extractQrCode err");
        }
        if (fVar != null) {
            fVar.mo8742(str);
        }
    }
}
