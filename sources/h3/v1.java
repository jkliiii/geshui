package h3;

import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.lt.app.App;
import java.util.List;

/* compiled from: RichAlert.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v1 implements DialogInterface.OnDismissListener, View.OnClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f8405 = -1;

    /* renamed from: ʿ, reason: contains not printable characters */
    private n3.s0 f8406;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Dialog f8407;

    private v1(i3.c cVar, n3.s0 s0Var) {
        this.f8406 = s0Var;
        Activity m7855 = App.m7835().m7855();
        j3.d m9334 = j3.d.m9334(LayoutInflater.from(m7855));
        if (!TextUtils.isEmpty(cVar.title)) {
            m9334.f8659.setText(androidx.core.text.e.m2536(cVar.title, 63));
            m9334.f8659.setVisibility(0);
        }
        if (!TextUtils.isEmpty(cVar.content)) {
            m9334.f8658.setText(androidx.core.text.e.m2536(cVar.content, 63));
        }
        m9078(m9334, cVar);
        Dialog dialog = new Dialog(m7855, 2131886407);
        this.f8407 = dialog;
        dialog.setContentView(m9334.m9336());
        this.f8407.setOnDismissListener(this);
        Boolean bool = cVar.cancelable;
        if (bool != null) {
            this.f8407.setCancelable(bool.booleanValue());
        }
        Boolean bool2 = cVar.canceledOnTouchOutside;
        if (bool2 != null) {
            this.f8407.setCanceledOnTouchOutside(bool2.booleanValue());
        }
        Float f5 = cVar.dim;
        if (f5 == null || f5.floatValue() < 0.0f || cVar.dim.floatValue() > 1.0f || this.f8407.getWindow() == null) {
            return;
        }
        this.f8407.getWindow().setDimAmount(cVar.dim.floatValue());
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m9078(j3.d dVar, i3.c cVar) {
        Button button;
        InsetDrawable insetDrawable;
        Context context = dVar.m9336().getContext();
        float m10946 = n3.z1.m10946(context, 12.0f);
        StateListAnimator stateListAnimator = null;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{m10946, m10946, m10946, m10946, m10946, m10946, m10946, m10946}, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(g3.a0.m8711(cVar.backgroundColor, -460552));
        dVar.m9336().setBackground(shapeDrawable);
        int m109462 = n3.z1.m10946(context, 1.0f);
        int i5 = (-m109462) * 2;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
        shapeDrawable2.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable2.getPaint().setStrokeWidth(m109462);
        shapeDrawable2.getPaint().setColor(g3.a0.m8711(cVar.lineColor, -1973791));
        List<String> list = cVar.buttons;
        int size = list != null ? list.size() : 0;
        boolean z5 = size >= 3;
        if (z5) {
            dVar.f8657.setOrientation(1);
        }
        InsetDrawable insetDrawable2 = null;
        int i6 = 0;
        while (i6 < size) {
            String str = cVar.buttons.get(i6);
            Button button2 = new Button(context);
            button2.setTag(Integer.valueOf(i6));
            button2.setOnClickListener(this);
            button2.setStateListAnimator(stateListAnimator);
            if (!TextUtils.isEmpty(str)) {
                button2.setText(androidx.core.text.e.m2536(str, 63));
            }
            if (z5 || i6 == 0) {
                button = button2;
                button.setBackground(new InsetDrawable((Drawable) shapeDrawable2, i5, 0, i5, i5));
            } else {
                if (insetDrawable2 == null) {
                    button = button2;
                    insetDrawable = new InsetDrawable((Drawable) shapeDrawable2, 0, 0, i5, i5);
                } else {
                    button = button2;
                    insetDrawable = insetDrawable2;
                }
                button.setBackground(insetDrawable);
                insetDrawable2 = insetDrawable;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z5 ? -1 : 0, -2);
            if (!z5) {
                layoutParams.weight = 1.0f;
            }
            dVar.f8657.addView(button, layoutParams);
            i6++;
            stateListAnimator = null;
        }
        if (size > 0) {
            dVar.f8657.setVisibility(0);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9079(i3.c cVar, n3.s0 s0Var) {
        new v1(cVar, s0Var).m9080();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f8405 = ((Integer) view.getTag()).intValue();
        this.f8407.dismiss();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        n3.a1.m10745(0, n3.z1.m10949(1).m10961("index", Integer.valueOf(this.f8405)).toString(), this.f8406, false);
        this.f8406 = null;
        this.f8407 = null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m9080() {
        this.f8407.show();
    }
}
