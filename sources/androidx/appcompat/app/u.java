package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u extends androidx.fragment.app.d {
    public u() {
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        return new t(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.d
    public void setupDialog(Dialog dialog, int i5) {
        if (!(dialog instanceof t)) {
            super.setupDialog(dialog, i5);
            return;
        }
        t tVar = (t) dialog;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        tVar.supportRequestWindowFeature(1);
    }

    public u(int i5) {
        super(i5);
    }
}
