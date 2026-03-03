package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.j;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements j.c {
        a() {
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4536(int i5, Object obj) {
            j.f3947.mo4536(i5, obj);
        }

        @Override // androidx.profileinstaller.j.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4537(int i5, Object obj) {
            j.f3947.mo4537(i5, obj);
            ProfileInstallReceiver.this.setResultCode(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m4535(j.c cVar) {
        if (Build.VERSION.SDK_INT < 24) {
            cVar.mo4537(13, null);
        } else {
            Process.sendSignal(Process.myPid(), 10);
            cVar.mo4537(12, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            j.m4601(context, new h(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    j.m4602(context, new h(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        j.m4593(context, new h(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m4535(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.m4553(context, aVar);
        } else {
            aVar.mo4537(16, null);
        }
    }
}
