package h3;

import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import com.lt.app.App;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Field;

/* compiled from: CrashHandler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements Thread.UncaughtExceptionHandler {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static f f8216 = new f();

    /* renamed from: ʻ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f8217 = null;

    /* compiled from: CrashHandler.java */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            n3.z1.m10908(App.m7835(), 2131820857);
            Looper.loop();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m8879(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        try {
            App m7835 = App.m7835();
            if (m7835 != null) {
                stringWriter.write(m7835.m7845().toString() + "\n\n");
            }
            Field[] fields = Build.class.getFields();
            if (fields.length > 0) {
                try {
                    for (Field field : fields) {
                        field.setAccessible(true);
                        stringWriter.write(field.getName() + ":" + String.valueOf(field.get(null)) + "\n");
                    }
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                }
            }
            stringWriter.write("BuildDate:20509\n");
            stringWriter.write(Log.getStackTraceString(th));
            stringWriter.flush();
            s1.m9039(stringWriter.toString());
            stringWriter.close();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static f m8880() {
        return f8216;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m8881(Throwable th) {
        if (th == null) {
            return false;
        }
        m8879(th);
        new a().start();
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!m8881(th)) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f8217;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
                return;
            }
            return;
        }
        try {
            Thread.sleep(2500L);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8882() {
        this.f8217 = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(f8216);
    }
}
