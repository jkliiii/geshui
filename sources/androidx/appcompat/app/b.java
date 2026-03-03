package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertDialog.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends t implements DialogInterface {

    /* renamed from: ʾ, reason: contains not printable characters */
    final AlertController f403;

    /* compiled from: AlertDialog.java */
    public static class a {
        private final AlertController.f P;
        private final int mTheme;

        public a(Context context) {
            this(context, b.m500(context, 0));
        }

        public b create() {
            b bVar = new b(this.P.f347, this.mTheme);
            this.P.m474(bVar.f403);
            bVar.setCancelable(this.P.f379);
            if (this.P.f379) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.P.f381);
            bVar.setOnDismissListener(this.P.f382);
            DialogInterface.OnKeyListener onKeyListener = this.P.f383;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context getContext() {
            return this.P.f347;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f385 = listAdapter;
            fVar.f386 = onClickListener;
            return this;
        }

        public a setCancelable(boolean z5) {
            this.P.f379 = z5;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.P;
            fVar.f360 = cursor;
            fVar.f366 = str;
            fVar.f386 = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.P.f359 = view;
            return this;
        }

        public a setIcon(int i5) {
            this.P.f351 = i5;
            return this;
        }

        public a setIconAttribute(int i5) {
            TypedValue typedValue = new TypedValue();
            this.P.f347.getTheme().resolveAttribute(i5, typedValue, true);
            this.P.f351 = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z5) {
            this.P.f370 = z5;
            return this;
        }

        public a setItems(int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = fVar.f347.getResources().getTextArray(i5);
            this.P.f386 = onClickListener;
            return this;
        }

        public a setMessage(int i5) {
            AlertController.f fVar = this.P;
            fVar.f361 = fVar.f347.getText(i5);
            return this;
        }

        public a setMultiChoiceItems(int i5, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = fVar.f347.getResources().getTextArray(i5);
            AlertController.f fVar2 = this.P;
            fVar2.f362 = onMultiChoiceClickListener;
            fVar2.f356 = zArr;
            fVar2.f354 = true;
            return this;
        }

        public a setNegativeButton(int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f369 = fVar.f347.getText(i5);
            this.P.f373 = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.f371 = drawable;
            return this;
        }

        public a setNeutralButton(int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f374 = fVar.f347.getText(i5);
            this.P.f377 = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.f376 = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.f381 = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.f382 = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.f368 = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.f383 = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f363 = fVar.f347.getText(i5);
            this.P.f367 = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.f365 = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z5) {
            this.P.f372 = z5;
            return this;
        }

        public a setSingleChoiceItems(int i5, int i6, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = fVar.f347.getResources().getTextArray(i5);
            AlertController.f fVar2 = this.P;
            fVar2.f386 = onClickListener;
            fVar2.f358 = i6;
            fVar2.f375 = true;
            return this;
        }

        public a setTitle(int i5) {
            AlertController.f fVar = this.P;
            fVar.f357 = fVar.f347.getText(i5);
            return this;
        }

        public a setView(int i5) {
            AlertController.f fVar = this.P;
            fVar.f388 = null;
            fVar.f387 = i5;
            fVar.f350 = false;
            return this;
        }

        public b show() {
            b create = create();
            create.show();
            return create;
        }

        public a(Context context, int i5) {
            this.P = new AlertController.f(new ContextThemeWrapper(context, b.m500(context, i5)));
            this.mTheme = i5;
        }

        public a setIcon(Drawable drawable) {
            this.P.f353 = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.f361 = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.f357 = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = charSequenceArr;
            fVar.f386 = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f369 = charSequence;
            fVar.f373 = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f374 = charSequence;
            fVar.f377 = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f363 = charSequence;
            fVar.f367 = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.f fVar = this.P;
            fVar.f388 = view;
            fVar.f387 = 0;
            fVar.f350 = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = charSequenceArr;
            fVar.f362 = onMultiChoiceClickListener;
            fVar.f356 = zArr;
            fVar.f354 = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i5, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f360 = cursor;
            fVar.f386 = onClickListener;
            fVar.f358 = i5;
            fVar.f366 = str;
            fVar.f375 = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i5, int i6, int i7, int i8) {
            AlertController.f fVar = this.P;
            fVar.f388 = view;
            fVar.f387 = 0;
            fVar.f350 = true;
            fVar.f378 = i5;
            fVar.f380 = i6;
            fVar.f348 = i7;
            fVar.f352 = i8;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.P;
            fVar.f360 = cursor;
            fVar.f362 = onMultiChoiceClickListener;
            fVar.f364 = str;
            fVar.f366 = str2;
            fVar.f354 = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f384 = charSequenceArr;
            fVar.f386 = onClickListener;
            fVar.f358 = i5;
            fVar.f375 = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.P;
            fVar.f385 = listAdapter;
            fVar.f386 = onClickListener;
            fVar.f358 = i5;
            fVar.f375 = true;
            return this;
        }
    }

    protected b(Context context, int i5) {
        super(context, m500(context, i5));
        this.f403 = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static int m500(Context context, int i5) {
        if (((i5 >>> 24) & 255) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f6912, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f403.m459();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (this.f403.m460(i5, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i5, KeyEvent keyEvent) {
        if (this.f403.m461(i5, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i5, keyEvent);
    }

    @Override // androidx.appcompat.app.t, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f403.m467(charSequence);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ListView m501() {
        return this.f403.m458();
    }
}
