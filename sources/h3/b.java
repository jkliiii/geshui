package h3;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.lt.app.App;
import i3.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n3.a2;
import n3.z1;

/* compiled from: BottomSheet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final List<b> f8145 = new ArrayList(1);

    /* renamed from: ʾ, reason: contains not printable characters */
    private n3.s0 f8146;

    /* renamed from: ʿ, reason: contains not printable characters */
    private j3.c f8147;

    /* renamed from: ˆ, reason: contains not printable characters */
    private m3.e f8148;

    /* renamed from: ˈ, reason: contains not printable characters */
    private BottomSheetDialog f8149;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f8150 = n3.a1.m10632();

    private b(i3.a aVar, n3.s0 s0Var) {
        this.f8146 = s0Var;
        Activity m7855 = App.m7835().m7855();
        a2.a aVar2 = new a2.a((n3.d) m7855);
        aVar2.f9706 = Boolean.TRUE;
        aVar2.f9703 = Boolean.FALSE;
        m3.e eVar = new m3.e(aVar2);
        this.f8148 = eVar;
        eVar.m9953(App.m7827(), false, null);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        a.b bVar = aVar.roundCorner;
        if (bVar != null) {
            if (bVar.topLeftX > 0.0f) {
                fArr[0] = n3.z1.m10946(m7855, r1);
            }
            if (aVar.roundCorner.topLeftY > 0.0f) {
                fArr[1] = n3.z1.m10946(m7855, r1);
            }
            if (aVar.roundCorner.topRightX > 0.0f) {
                fArr[2] = n3.z1.m10946(m7855, r1);
            }
            if (aVar.roundCorner.topRightY > 0.0f) {
                fArr[3] = n3.z1.m10946(m7855, r1);
            }
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(-1);
        j3.c m9330 = j3.c.m9330(LayoutInflater.from(m7855));
        this.f8147 = m9330;
        a.c cVar = aVar.titleBar;
        if (cVar != null && cVar.visible) {
            m9330.f8654.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f8147.f8654.getLayoutParams();
            float f5 = aVar.titleBar.height;
            layoutParams.height = n3.z1.m10946(m7855, f5 <= 0.0f ? 44.0f : f5);
            if (!TextUtils.isEmpty(aVar.titleBar.backgroundColor)) {
                shapeDrawable.getPaint().setColor(g3.a0.m8711(aVar.titleBar.backgroundColor, -1));
            }
            if (!TextUtils.isEmpty(aVar.titleBar.title)) {
                this.f8147.f8653.setVisibility(0);
                this.f8147.f8653.setText(androidx.core.text.e.m2536(aVar.titleBar.title, 63));
            }
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: h3.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8134.m8777(view);
                }
            };
            m8769(this.f8147.f8651, aVar.titleBar.leftButtons, onClickListener);
            m8769(this.f8147.f8652, aVar.titleBar.rightButtons, onClickListener);
        } else if (fArr[1] > 0.0f) {
            m9330.m9332().setPadding(0, (int) Math.ceil(fArr[1]), 0, 0);
        }
        this.f8147.m9332().setBackground(shapeDrawable);
        this.f8147.f8655.addView(this.f8148.m9956(), -1, -1);
        if (!TextUtils.isEmpty(aVar.url)) {
            this.f8148.m9957().loadUrl(aVar.url, null);
        }
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(m7855, 2131886405);
        this.f8149 = bottomSheetDialog;
        bottomSheetDialog.setContentView(this.f8147.m9332());
        this.f8149.setOnShowListener(this);
        this.f8149.setOnDismissListener(this);
        Boolean bool = aVar.cancelable;
        if (bool != null) {
            this.f8149.setCancelable(bool.booleanValue());
        }
        Boolean bool2 = aVar.canceledOnTouchOutside;
        if (bool2 != null) {
            this.f8149.setCanceledOnTouchOutside(bool2.booleanValue());
        }
        Float f6 = aVar.peekHeight;
        if (f6 != null && f6.floatValue() > 0.0f) {
            this.f8149.getBehavior().setPeekHeight(n3.z1.m10946(m7855, aVar.peekHeight.floatValue()));
        }
        Float f7 = aVar.maxHeight;
        if (f7 != null && f7.floatValue() > 0.0f) {
            this.f8149.getBehavior().setMaxHeight(n3.z1.m10946(m7855, aVar.maxHeight.floatValue()));
        }
        Float f8 = aVar.dim;
        if (f8 == null || f8.floatValue() < 0.0f || aVar.dim.floatValue() > 1.0f || this.f8149.getWindow() == null) {
            return;
        }
        this.f8149.getWindow().setDimAmount(aVar.dim.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View, android.widget.ImageButton, android.widget.ImageView] */
    /* renamed from: ʼ, reason: contains not printable characters */
    private void m8769(ViewGroup viewGroup, List<a.C0118a> list, View.OnClickListener onClickListener) {
        Button button;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (a.C0118a c0118a : list) {
            if (c0118a != null) {
                if (!TextUtils.isEmpty(c0118a.text)) {
                    Button button2 = new Button(viewGroup.getContext());
                    button2.setMinWidth(0);
                    button2.setText(androidx.core.text.e.m2536(c0118a.text, 63));
                    button = button2;
                } else if (!TextUtils.isEmpty(c0118a.icon)) {
                    ?? imageButton = new ImageButton(viewGroup.getContext());
                    imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    com.bumptech.glide.b.m6018(imageButton).m6102(c0118a.icon).m6085(imageButton);
                    button = imageButton;
                }
                button.setMinimumWidth(0);
                button.setBackground(null);
                button.setTag(c0118a.name);
                button.setOnClickListener(onClickListener);
                viewGroup.addView(button, -2, -1);
            }
        }
        if (viewGroup.getChildCount() > 0) {
            viewGroup.setVisibility(0);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m8770() {
        this.f8149.dismiss();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m8771(String str, int i5, Object obj, n3.s0 s0Var) {
        z1.d m10961 = n3.z1.m10949(3).m10961("event", str).m10961("index", Integer.valueOf(i5));
        if (obj == null) {
            obj = new Object();
        }
        n3.a1.m10745(0, m10961.m10961("data", obj).toString(), s0Var, true);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8772(String str, Object obj) {
        m8771(str, this.f8150, obj, this.f8146);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m8773(Integer num, String str, n3.s0 s0Var) {
        m8771("onError", num.intValue(), n3.z1.m10949(1).m10961("message", str).m10960(), s0Var);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean m8774(b bVar, Integer num, n3.s0 s0Var) {
        if (bVar != null) {
            return true;
        }
        m8773(-1, "对话框 index " + num + " 不存在", s0Var);
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m8775(String str) {
        this.f8148.m9957().mo7788(str);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static b m8776(Integer num) {
        List<b> list = f8145;
        if (list.isEmpty()) {
            return null;
        }
        if (num == null) {
            return list.get(list.size() - 1);
        }
        for (b bVar : list) {
            if (bVar.f8150 == num.intValue()) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public /* synthetic */ void m8777(View view) {
        m8772("onTitleBarButtonClick", n3.z1.m10949(2).m10961("name", view.getTag()).m10960());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m8778(Map<String, Object> map) {
        m8772("onNotify", map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m8779(i3.a r5, n3.s0 r6) {
        /*
            java.lang.String r0 = r5.action
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            java.lang.String r2 = "onSuccess"
            if (r0 != 0) goto Laf
            java.lang.String r0 = r5.action
            r0.hashCode()
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case -1039689911: goto L30;
                case 3125404: goto L25;
                case 94756344: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = -1
            goto L3a
        L1a:
            java.lang.String r3 = "close"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L23
            goto L18
        L23:
            r0 = 2
            goto L3a
        L25:
            java.lang.String r3 = "eval"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L2e
            goto L18
        L2e:
            r0 = 1
            goto L3a
        L30:
            java.lang.String r3 = "notify"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L39
            goto L18
        L39:
            r0 = 0
        L3a:
            switch(r0) {
                case 0: goto L96;
                case 1: goto L6f;
                case 2: goto L58;
                default: goto L3d;
            }
        L3d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "无效的 action: "
            r1.append(r2)
            java.lang.String r5 = r5.action
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            m8773(r0, r5, r6)
            goto Lbc
        L58:
            java.lang.Integer r0 = r5.index
            h3.b r0 = m8776(r0)
            java.lang.Integer r5 = r5.index
            boolean r5 = m8774(r0, r5, r6)
            if (r5 == 0) goto Lbc
            r0.m8770()
            int r5 = r0.f8150
            m8771(r2, r5, r1, r6)
            goto Lbc
        L6f:
            java.lang.Integer r0 = r5.index
            h3.b r0 = m8776(r0)
            java.lang.Integer r3 = r5.index
            boolean r3 = m8774(r0, r3, r6)
            if (r3 == 0) goto Lbc
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.data
            if (r5 == 0) goto L90
            java.lang.String r3 = "script"
            java.lang.Object r5 = r5.get(r3)
            if (r5 == 0) goto L90
            java.lang.String r5 = r5.toString()
            r0.m8775(r5)
        L90:
            int r5 = r0.f8150
            m8771(r2, r5, r1, r6)
            goto Lbc
        L96:
            java.lang.Integer r0 = r5.index
            h3.b r0 = m8776(r0)
            java.lang.Integer r3 = r5.index
            boolean r3 = m8774(r0, r3, r6)
            if (r3 == 0) goto Lbc
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.data
            r0.m8778(r5)
            int r5 = r0.f8150
            m8771(r2, r5, r1, r6)
            goto Lbc
        Laf:
            h3.b r0 = new h3.b
            r0.<init>(r5, r6)
            int r5 = r0.f8150
            m8771(r2, r5, r1, r6)
            r0.m8780()
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.b.m8779(i3.a, n3.s0):void");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m8780() {
        this.f8149.show();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        m8772("onClose", null);
        f8145.remove(this);
        ViewParent parent = this.f8147.m9332().getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8147.m9332());
        }
        this.f8148.m9955();
        this.f8146 = null;
        this.f8148 = null;
        this.f8147 = null;
        this.f8149 = null;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        f8145.add(this);
        m8772("onOpen", null);
    }
}
