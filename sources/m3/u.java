package m3;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.b;
import com.lt.app.App;

/* compiled from: LTDialogsHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f9289;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Dialog f9290;

    /* compiled from: LTDialogsHelper.java */
    public interface a {
        /* renamed from: ʻ */
        void mo9913(boolean z5, String str, String str2);
    }

    /* compiled from: LTDialogsHelper.java */
    public interface b {
        /* renamed from: ʻ */
        void mo8745(boolean z5, String str);
    }

    public u(Context context) {
        this.f9289 = context;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private Context m10059() {
        Activity m7855 = App.m7835().m7855();
        return (!(m7855 instanceof androidx.appcompat.app.c) || ((androidx.appcompat.app.c) m7855).isFinishing()) ? this.f9289 : m7855;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10064(b bVar, DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        if (i5 == 4) {
            bVar.mo8745(false, null);
            return false;
        }
        if (i5 != 66 && i5 != 160) {
            return false;
        }
        dialogInterface.dismiss();
        bVar.mo8745(true, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public static /* synthetic */ void m10065(View view, a aVar, DialogInterface dialogInterface, int i5) {
        aVar.mo9913(true, ((EditText) view.findViewById(2131231284)).getText().toString(), ((EditText) view.findViewById(2131231285)).getText().toString());
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m10067(String str, final b bVar) {
        new b.a(m10059()).setTitle(2131820712).setMessage(str).setCancelable(true).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: m3.r
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                bVar.mo8745(true, null);
            }
        }).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).show();
        return true;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m10068(String str, String str2, String str3, boolean z5, final b bVar) {
        Context m10059 = m10059();
        b.a aVar = new b.a(m10059);
        aVar.setMessage(str);
        aVar.setTitle(2131820610);
        aVar.setCancelable(z5);
        if (TextUtils.isEmpty(str2)) {
            str2 = m10059.getString(R.string.ok);
        }
        aVar.setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: m3.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                bVar.mo8745(true, null);
            }
        });
        if (TextUtils.isEmpty(str3)) {
            str3 = m10059.getString(R.string.cancel);
        }
        aVar.setNegativeButton(str3, new DialogInterface.OnClickListener() { // from class: m3.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                bVar.mo8745(false, null);
            }
        });
        aVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: m3.p
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bVar.mo8745(false, null);
            }
        });
        aVar.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: m3.q
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
                return u.m10064(bVar, dialogInterface, i5, keyEvent);
            }
        });
        this.f9290 = aVar.show();
        return true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m10069(String str, b bVar) {
        return m10068(str, null, null, true, bVar);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m10070(final a aVar) {
        Context m10059 = m10059();
        b.a aVar2 = new b.a(m10059);
        aVar2.setMessage(2131820651);
        final View inflate = View.inflate(m10059, 2131427382, null);
        aVar2.setView(inflate);
        aVar2.setCancelable(false);
        aVar2.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: m3.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                u.m10065(inflate, aVar, dialogInterface, i5);
            }
        });
        aVar2.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: m3.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                aVar.mo9913(false, null, null);
            }
        });
        this.f9290 = aVar2.show();
    }
}
