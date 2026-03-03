package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x {

    /* renamed from: ʼ, reason: contains not printable characters */
    public View f4581;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Map<String, Object> f4580 = new HashMap();

    /* renamed from: ʽ, reason: contains not printable characters */
    final ArrayList<q> f4582 = new ArrayList<>();

    @Deprecated
    public x() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f4581 == xVar.f4581 && this.f4580.equals(xVar.f4580);
    }

    public int hashCode() {
        return (this.f4581.hashCode() * 31) + this.f4580.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4581 + "\n") + "    values:";
        for (String str2 : this.f4580.keySet()) {
            str = str + "    " + str2 + ": " + this.f4580.get(str2) + "\n";
        }
        return str;
    }

    public x(View view) {
        this.f4581 = view;
    }
}
