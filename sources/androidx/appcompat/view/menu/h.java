package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private g f879;

    /* renamed from: ʿ, reason: contains not printable characters */
    private androidx.appcompat.app.b f880;

    /* renamed from: ˆ, reason: contains not printable characters */
    e f881;

    /* renamed from: ˈ, reason: contains not printable characters */
    private m.a f882;

    public h(g gVar) {
        this.f879 = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i5) {
        this.f879.performItemAction((i) this.f881.m934().getItem(i5), 0);
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void onCloseMenu(g gVar, boolean z5) {
        if (z5 || gVar == this.f879) {
            m944();
        }
        m.a aVar = this.f882;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z5);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f881.onCloseMenu(this.f879, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f880.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f880.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f879.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f879.performShortcut(i5, keyEvent, 0);
    }

    @Override // androidx.appcompat.view.menu.m.a
    /* renamed from: ʻ */
    public boolean mo527(g gVar) {
        m.a aVar = this.f882;
        if (aVar != null) {
            return aVar.mo527(gVar);
        }
        return false;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m944() {
        androidx.appcompat.app.b bVar = this.f880;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m945(IBinder iBinder) {
        g gVar = this.f879;
        b.a aVar = new b.a(gVar.getContext());
        e eVar = new e(aVar.getContext(), e.g.f7048);
        this.f881 = eVar;
        eVar.setCallback(this);
        this.f879.addMenuPresenter(this.f881);
        aVar.setAdapter(this.f881.m934(), this);
        View headerView = gVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(gVar.getHeaderIcon()).setTitle(gVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(this);
        androidx.appcompat.app.b create = aVar.create();
        this.f880 = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f880.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f880.show();
    }
}
