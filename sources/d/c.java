package d;

import android.content.Context;
import android.content.Intent;
import f4.g;
import f4.k;

/* compiled from: ActivityResultContracts.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends d.a<Intent, c.a> {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a f6825 = new a(null);

    /* compiled from: ActivityResultContracts.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // d.a
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Intent mo4263(Context context, Intent intent) {
        k.m8623(context, "context");
        k.m8623(intent, "input");
        return intent;
    }

    @Override // d.a
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c.a mo4264(int i5, Intent intent) {
        return new c.a(i5, intent);
    }
}
