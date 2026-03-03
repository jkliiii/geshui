package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AssetManager f3916;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Executor f3917;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final j.c f3918;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final File f3920;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final String f3921;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final String f3922;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final String f3923;

    /* renamed from: ˋ, reason: contains not printable characters */
    private e[] f3925;

    /* renamed from: ˎ, reason: contains not printable characters */
    private byte[] f3926;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f3924 = false;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final byte[] f3919 = m4560();

    public d(AssetManager assetManager, Executor executor, j.c cVar, String str, String str2, String str3, File file) {
        this.f3916 = assetManager;
        this.f3917 = executor;
        this.f3918 = cVar;
        this.f3921 = str;
        this.f3922 = str2;
        this.f3923 = str3;
        this.f3920 = file;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private d m4558(e[] eVarArr, byte[] bArr) {
        InputStream m4563;
        try {
            m4563 = m4563(this.f3916, this.f3923);
        } catch (FileNotFoundException e5) {
            this.f3918.mo4537(9, e5);
        } catch (IOException e6) {
            this.f3918.mo4537(7, e6);
        } catch (IllegalStateException e7) {
            this.f3925 = null;
            this.f3918.mo4537(8, e7);
        }
        if (m4563 == null) {
            if (m4563 != null) {
                m4563.close();
            }
            return null;
        }
        try {
            this.f3925 = o.m4632(m4563, o.m4629(m4563, o.f3954), bArr, eVarArr);
            m4563.close();
            return this;
        } catch (Throwable th) {
            try {
                m4563.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m4559() {
        if (!this.f3924) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static byte[] m4560() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24 || i5 > 33) {
            return null;
        }
        switch (i5) {
            case 24:
            case 25:
                return q.f3969;
            case 26:
                return q.f3968;
            case 27:
                return q.f3967;
            case 28:
            case 29:
            case 30:
                return q.f3966;
            case 31:
            case 32:
            case 33:
                return q.f3965;
            default:
                return null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private InputStream m4561(AssetManager assetManager) {
        try {
            return m4563(assetManager, this.f3922);
        } catch (FileNotFoundException e5) {
            this.f3918.mo4537(6, e5);
            return null;
        } catch (IOException e6) {
            this.f3918.mo4537(7, e6);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m4562(int i5, Object obj) {
        this.f3918.mo4537(i5, obj);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private InputStream m4563(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3918.mo4536(5, null);
            }
            return null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private e[] m4564(InputStream inputStream) {
        try {
            try {
                try {
                    e[] m4640 = o.m4640(inputStream, o.m4629(inputStream, o.f3953), this.f3921);
                    try {
                        inputStream.close();
                        return m4640;
                    } catch (IOException e5) {
                        this.f3918.mo4537(7, e5);
                        return m4640;
                    }
                } catch (IOException e6) {
                    this.f3918.mo4537(7, e6);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e7) {
                    this.f3918.mo4537(8, e7);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    this.f3918.mo4537(7, e8);
                }
                throw th;
            }
        } catch (IOException e9) {
            this.f3918.mo4537(7, e9);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m4565() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24 || i5 > 33) {
            return false;
        }
        if (i5 != 24 && i5 != 25) {
            switch (i5) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m4566(final int i5, final Object obj) {
        this.f3917.execute(new Runnable() { // from class: androidx.profileinstaller.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f3913.m4562(i5, obj);
            }
        });
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m4567() {
        if (this.f3919 == null) {
            m4566(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f3920.canWrite()) {
            this.f3924 = true;
            return true;
        }
        m4566(4, null);
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public d m4568() {
        d m4558;
        m4559();
        if (this.f3919 == null) {
            return this;
        }
        InputStream m4561 = m4561(this.f3916);
        if (m4561 != null) {
            this.f3925 = m4564(m4561);
        }
        e[] eVarArr = this.f3925;
        return (eVarArr == null || !m4565() || (m4558 = m4558(eVarArr, this.f3919)) == null) ? this : m4558;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public d m4569() {
        ByteArrayOutputStream byteArrayOutputStream;
        e[] eVarArr = this.f3925;
        byte[] bArr = this.f3919;
        if (eVarArr != null && bArr != null) {
            m4559();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e5) {
                this.f3918.mo4537(7, e5);
            } catch (IllegalStateException e6) {
                this.f3918.mo4537(8, e6);
            }
            try {
                o.m4606(byteArrayOutputStream, bArr);
                if (!o.m4635(byteArrayOutputStream, bArr, eVarArr)) {
                    this.f3918.mo4537(5, null);
                    this.f3925 = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f3926 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f3925 = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m4570() {
        byte[] bArr = this.f3926;
        if (bArr == null) {
            return false;
        }
        m4559();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3920);
                    try {
                        f.m4582(byteArrayInputStream, fileOutputStream);
                        m4566(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                m4566(6, e5);
                return false;
            } catch (IOException e6) {
                m4566(7, e6);
                return false;
            }
        } finally {
            this.f3926 = null;
            this.f3925 = null;
        }
    }
}
