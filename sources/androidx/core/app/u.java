package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class u implements Iterable<Intent> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final ArrayList<Intent> f2570 = new ArrayList<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Context f2571;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        /* renamed from: ـ */
        Intent mo517();
    }

    private u(Context context) {
        this.f2571 = context;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static u m1984(Context context) {
        return new u(context);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f2570.iterator();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public u m1985(Intent intent) {
        this.f2570.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public u m1986(Activity activity) {
        Intent mo517 = activity instanceof a ? ((a) activity).mo517() : null;
        if (mo517 == null) {
            mo517 = p.m1972(activity);
        }
        if (mo517 != null) {
            ComponentName component = mo517.getComponent();
            if (component == null) {
                component = mo517.resolveActivity(this.f2571.getPackageManager());
            }
            m1987(component);
            m1985(mo517);
        }
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public u m1987(ComponentName componentName) {
        int size = this.f2570.size();
        try {
            Intent m1973 = p.m1973(this.f2571, componentName);
            while (m1973 != null) {
                this.f2570.add(size, m1973);
                m1973 = p.m1973(this.f2571, m1973.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e5);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m1988() {
        m1989(null);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m1989(Bundle bundle) {
        if (this.f2570.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f2570.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.m1999(this.f2571, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f2571.startActivity(intent);
    }
}
