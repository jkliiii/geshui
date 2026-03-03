package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.f;
import androidx.core.provider.g;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n1 extends o1 {
    /* renamed from: ˏ, reason: contains not printable characters */
    private Font m2331(FontFamily fontFamily, int i5) {
        FontStyle fontStyle = new FontStyle((i5 & 1) != 0 ? 700 : 400, (i5 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m2332 = m2332(fontStyle, font.getStyle());
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            int m23322 = m2332(fontStyle, font2.getStyle());
            if (m23322 < m2332) {
                font = font2;
                m2332 = m23322;
            }
        }
        return font;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static int m2332(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʼ, reason: contains not printable characters */
    public Typeface mo2333(Context context, f.c cVar, Resources resources, int i5) {
        try {
            FontFamily.Builder builder = null;
            for (f.d dVar : cVar.m2088()) {
                try {
                    Font build = new Font.Builder(resources, dVar.m2090()).setWeight(dVar.m2093()).setSlant(dVar.m2094() ? 1 : 0).setTtcIndex(dVar.m2091()).setFontVariationSettings(dVar.m2092()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m2331(build2, i5).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʽ, reason: contains not printable characters */
    public Typeface mo2334(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (g.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m2486(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.m2487()).setSlant(bVar.m2488() ? 1 : 0).setTtcIndex(bVar.m2485()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m2331(build2, i5).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʾ, reason: contains not printable characters */
    protected Typeface mo2335(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ʿ, reason: contains not printable characters */
    public Typeface mo2336(Context context, Resources resources, int i5, String str, int i6) {
        try {
            Font build = new Font.Builder(resources, i5).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.o1
    /* renamed from: ˊ, reason: contains not printable characters */
    protected g.b mo2337(g.b[] bVarArr, int i5) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
