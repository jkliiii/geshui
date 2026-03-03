package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: E:\78999\cookie_5123796.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: ˎ, reason: contains not printable characters */
    static final PorterDuff.Mode f2669 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ʼ, reason: contains not printable characters */
    Object f2671;

    /* renamed from: ˋ, reason: contains not printable characters */
    public String f2679;

    /* renamed from: ʻ, reason: contains not printable characters */
    public int f2670 = -1;

    /* renamed from: ʽ, reason: contains not printable characters */
    public byte[] f2672 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    public Parcelable f2673 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    public int f2674 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f2675 = 0;

    /* renamed from: ˈ, reason: contains not printable characters */
    public ColorStateList f2676 = null;

    /* renamed from: ˉ, reason: contains not printable characters */
    PorterDuff.Mode f2677 = f2669;

    /* renamed from: ˊ, reason: contains not printable characters */
    public String f2678 = null;

    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2184(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.m2191(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            } catch (InvocationTargetException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static String m2185(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.m2192(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            } catch (InvocationTargetException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static Uri m2186(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.m2194(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            } catch (NoSuchMethodException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            } catch (InvocationTargetException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static Drawable m2187(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static Icon m2188(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f2670) {
                case -1:
                    return (Icon) iconCompat.f2671;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2671);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m2179(), iconCompat.f2674);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2671, iconCompat.f2674, iconCompat.f2675);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2671);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.m2176((Bitmap) iconCompat.f2671, false));
                        break;
                    } else {
                        createWithBitmap = b.m2190((Bitmap) iconCompat.f2671);
                        break;
                    }
                case 6:
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30) {
                        createWithBitmap = d.m2195(iconCompat.m2180());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m2180());
                        }
                        InputStream m2181 = iconCompat.m2181(context);
                        if (m2181 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m2180());
                        }
                        if (i5 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.m2176(BitmapFactory.decodeStream(m2181), false));
                            break;
                        } else {
                            createWithBitmap = b.m2190(BitmapFactory.decodeStream(m2181));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f2676;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2677;
            if (mode != IconCompat.f2669) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable m2189(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static Icon m2190(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2191(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static String m2192(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m2193(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static Uri m2194(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Icon m2195(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static Bitmap m2176(Bitmap bitmap, boolean z5) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f5 = min;
        float f6 = 0.5f * f5;
        float f7 = 0.9166667f * f6;
        if (z5) {
            float f8 = 0.010416667f * f5;
            paint.setColor(0);
            paint.setShadowLayer(f8, 0.0f, f5 * 0.020833334f, 1023410176);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.setShadowLayer(f8, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f6, f6, f7, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f6, f6, f7, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static String m2177(int i5) {
        switch (i5) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public String toString() {
        if (this.f2670 == -1) {
            return String.valueOf(this.f2671);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m2177(this.f2670));
        switch (this.f2670) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2671).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2671).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2679);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m2178())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2674);
                if (this.f2675 != 0) {
                    sb.append(" off=");
                    sb.append(this.f2675);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2671);
                break;
        }
        if (this.f2676 != null) {
            sb.append(" tint=");
            sb.append(this.f2676);
        }
        if (this.f2677 != f2669) {
            sb.append(" mode=");
            sb.append(this.f2677);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m2178() {
        int i5 = this.f2670;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.m2184(this.f2671);
        }
        if (i5 == 2) {
            return this.f2674;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public String m2179() {
        int i5 = this.f2670;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.m2185(this.f2671);
        }
        if (i5 == 2) {
            String str = this.f2679;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2671).split(":", -1)[0] : this.f2679;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Uri m2180() {
        int i5 = this.f2670;
        if (i5 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.m2186(this.f2671);
        }
        if (i5 == 4 || i5 == 6) {
            return Uri.parse((String) this.f2671);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public InputStream m2181(Context context) {
        Uri m2180 = m2180();
        String scheme = m2180.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m2180);
            } catch (Exception e5) {
                Log.w("IconCompat", "Unable to load image from URI: " + m2180, e5);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2671));
        } catch (FileNotFoundException e6) {
            Log.w("IconCompat", "Unable to load image from path: " + m2180, e6);
            return null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m2182() {
        this.f2677 = PorterDuff.Mode.valueOf(this.f2678);
        switch (this.f2670) {
            case -1:
                Parcelable parcelable = this.f2673;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2671 = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2673;
                if (parcelable2 != null) {
                    this.f2671 = parcelable2;
                    return;
                }
                byte[] bArr = this.f2672;
                this.f2671 = bArr;
                this.f2670 = 3;
                this.f2674 = 0;
                this.f2675 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2672, Charset.forName("UTF-16"));
                this.f2671 = str;
                if (this.f2670 == 2 && this.f2679 == null) {
                    this.f2679 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2671 = this.f2672;
                return;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m2183(boolean z5) {
        this.f2678 = this.f2677.name();
        switch (this.f2670) {
            case -1:
                if (z5) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f2673 = (Parcelable) this.f2671;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z5) {
                    this.f2673 = (Parcelable) this.f2671;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2671;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2672 = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f2672 = ((String) this.f2671).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2672 = (byte[]) this.f2671;
                return;
            case 4:
            case 6:
                this.f2672 = this.f2671.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }
}
