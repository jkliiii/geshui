package h3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.lt.app.App;
import i3.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n3.a2;
import n3.z1;

/* compiled from: RichDialog.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class y1 implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final List<y1> f8421 = new ArrayList(1);

    /* renamed from: ʾ, reason: contains not printable characters */
    private n3.s0 f8422;

    /* renamed from: ʿ, reason: contains not printable characters */
    private j3.e f8423;

    /* renamed from: ˆ, reason: contains not printable characters */
    private List<m3.e> f8424;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Dialog f8425;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f8426 = n3.a1.m10632();

    private y1(i3.d dVar, n3.s0 s0Var) {
        this.f8422 = s0Var;
        Activity m7855 = App.m7835().m7855();
        j3.e m9338 = j3.e.m9338(LayoutInflater.from(m7855));
        this.f8423 = m9338;
        ViewGroup.LayoutParams m9093 = m9093(m9338.m9340(), dVar);
        Dialog dialog = new Dialog(m7855, 2131886407);
        this.f8425 = dialog;
        dialog.setContentView(this.f8423.m9340(), m9093);
        this.f8425.setOnShowListener(this);
        this.f8425.setOnDismissListener(this);
        Boolean bool = dVar.cancelable;
        if (bool != null) {
            this.f8425.setCancelable(bool.booleanValue());
        }
        Boolean bool2 = dVar.canceledOnTouchOutside;
        if (bool2 != null) {
            this.f8425.setCanceledOnTouchOutside(bool2.booleanValue());
        }
        Float f5 = dVar.dim;
        if (f5 != null && f5.floatValue() >= 0.0f && dVar.dim.floatValue() <= 1.0f && this.f8425.getWindow() != null) {
            this.f8425.getWindow().setDimAmount(dVar.dim.floatValue());
        }
        m9092(this.f8423.m9340(), dVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m9085() {
        this.f8425.dismiss();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m9086(String str, int i5, Object obj, n3.s0 s0Var) {
        z1.d m10961 = n3.z1.m10949(3).m10961("event", str).m10961("index", Integer.valueOf(i5));
        if (obj == null) {
            obj = new Object();
        }
        n3.a1.m10745(0, m10961.m10961("data", obj).toString(), s0Var, true);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m9087(String str, Object obj) {
        m9086(str, this.f8426, obj, this.f8422);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m9088(Integer num, String str, n3.s0 s0Var) {
        m9086("onError", num.intValue(), n3.z1.m10949(1).m10961("message", str).m10960(), s0Var);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean m9089(y1 y1Var, Integer num, n3.s0 s0Var) {
        if (y1Var != null) {
            return true;
        }
        m9088(-1, "对话框 index " + num + " 不存在", s0Var);
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m9090(String str, String str2) {
        List<m3.e> list = this.f8424;
        if (list == null) {
            return;
        }
        for (m3.e eVar : list) {
            if (str.equals(eVar.m9956().getTag())) {
                eVar.m9957().mo7788(str2);
                return;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static y1 m9091(Integer num) {
        List<y1> list = f8421;
        if (list.isEmpty()) {
            return null;
        }
        if (num == null) {
            return list.get(list.size() - 1);
        }
        for (y1 y1Var : list) {
            if (y1Var.f8426 == num.intValue()) {
                return y1Var;
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m9092(ViewGroup viewGroup, final i3.d dVar) {
        List<d.a> list = dVar.areas;
        if (list == null || list.isEmpty()) {
            return;
        }
        Context context = viewGroup.getContext();
        for (d.a aVar : dVar.areas) {
            if (aVar != null) {
                aVar.f12855top = n3.z1.m10946(context, aVar.f12855top);
                aVar.left = n3.z1.m10946(context, aVar.left);
                aVar.width = n3.z1.m10946(context, aVar.width);
                aVar.height = n3.z1.m10946(context, aVar.height);
                if (!TextUtils.isEmpty(aVar.url) && (context instanceof n3.d)) {
                    a2.a aVar2 = new a2.a((n3.d) context);
                    aVar2.f9706 = Boolean.TRUE;
                    aVar2.f9703 = Boolean.FALSE;
                    m3.e eVar = new m3.e(aVar2);
                    eVar.m9953(App.m7827(), false, null);
                    if (this.f8424 == null) {
                        this.f8424 = new ArrayList(1);
                    }
                    this.f8424.add(eVar);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(aVar.width, aVar.height);
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = aVar.f12855top;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = aVar.left;
                    viewGroup.addView(eVar.m9956(), layoutParams);
                    eVar.m9956().setTag(aVar.name);
                    eVar.m9957().loadUrl(aVar.url, null);
                }
                aVar.width += aVar.left;
                aVar.height += aVar.f12855top;
            }
        }
        final int[] iArr = new int[2];
        viewGroup.setOnTouchListener(new View.OnTouchListener() { // from class: h3.w1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return y1.m9094(iArr, view, motionEvent);
            }
        });
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: h3.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8414.m9095(dVar, iArr, view);
            }
        });
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private ViewGroup.LayoutParams m9093(ViewGroup viewGroup, i3.d dVar) {
        Context context = viewGroup.getContext();
        if (TextUtils.isEmpty(dVar.background) || !(URLUtil.isHttpsUrl(dVar.background) || URLUtil.isHttpUrl(dVar.background) || URLUtil.isDataUrl(dVar.background))) {
            float m10946 = n3.z1.m10946(context, 6.0f);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{m10946, m10946, m10946, m10946, m10946, m10946, m10946, m10946}, null, null));
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.getPaint().setColor(g3.a0.m8711(dVar.background, -1));
            viewGroup.setBackground(shapeDrawable);
        } else {
            ImageView imageView = new ImageView(context);
            imageView.setBackground(null);
            imageView.setContentDescription(null);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            viewGroup.addView(imageView, 0, new ViewGroup.LayoutParams(-1, -1));
            com.bumptech.glide.b.m6018(imageView).m6102(dVar.background).m6085(imageView);
        }
        return new ViewGroup.LayoutParams(n3.z1.m10946(context, dVar.width.floatValue()), n3.z1.m10946(context, dVar.height.floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static /* synthetic */ boolean m9094(int[] iArr, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            iArr[0] = (int) motionEvent.getX();
            iArr[1] = (int) motionEvent.getY();
        } else if (action == 1) {
            view.performClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public /* synthetic */ void m9095(i3.d dVar, int[] iArr, View view) {
        int i5;
        int i6;
        for (d.a aVar : dVar.areas) {
            if (aVar != null && (i5 = iArr[0]) > aVar.left && i5 < aVar.width && (i6 = iArr[1]) > aVar.f12855top && i6 < aVar.height) {
                m9087("onAreaClick", n3.z1.m10949(1).m10961("name", aVar.name).m10960());
                return;
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m9096(Map<String, Object> map) {
        m9087("onNotify", map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0018  */
    /* renamed from: ـ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m9097(i3.d r5, n3.s0 r6) {
        /*
            java.lang.String r0 = r5.action
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            java.lang.String r2 = "onSuccess"
            if (r0 != 0) goto Lbe
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
                case 0: goto La5;
                case 1: goto L70;
                case 2: goto L59;
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
            m9088(r0, r5, r6)
            goto Lcb
        L59:
            java.lang.Integer r0 = r5.index
            h3.y1 r0 = m9091(r0)
            java.lang.Integer r5 = r5.index
            boolean r5 = m9089(r0, r5, r6)
            if (r5 == 0) goto Lcb
            r0.m9085()
            int r5 = r0.f8426
            m9086(r2, r5, r1, r6)
            goto Lcb
        L70:
            java.lang.Integer r0 = r5.index
            h3.y1 r0 = m9091(r0)
            java.lang.Integer r3 = r5.index
            boolean r3 = m9089(r0, r3, r6)
            if (r3 == 0) goto Lcb
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.data
            if (r3 == 0) goto L9f
            java.lang.String r4 = "name"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L9f
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.data
            java.lang.String r4 = "script"
            java.lang.Object r5 = r5.get(r4)
            if (r5 == 0) goto L9f
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = r5.toString()
            r0.m9090(r3, r5)
        L9f:
            int r5 = r0.f8426
            m9086(r2, r5, r1, r6)
            goto Lcb
        La5:
            java.lang.Integer r0 = r5.index
            h3.y1 r0 = m9091(r0)
            java.lang.Integer r3 = r5.index
            boolean r3 = m9089(r0, r3, r6)
            if (r3 == 0) goto Lcb
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.data
            r0.m9096(r5)
            int r5 = r0.f8426
            m9086(r2, r5, r1, r6)
            goto Lcb
        Lbe:
            h3.y1 r0 = new h3.y1
            r0.<init>(r5, r6)
            int r5 = r0.f8426
            m9086(r2, r5, r1, r6)
            r0.m9098()
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.y1.m9097(i3.d, n3.s0):void");
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m9098() {
        this.f8425.show();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        m9087("onClose", null);
        f8421.remove(this);
        ViewParent parent = this.f8423.m9340().getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f8423.m9340());
        }
        List<m3.e> list = this.f8424;
        if (list != null) {
            Iterator<m3.e> it = list.iterator();
            while (it.hasNext()) {
                it.next().m9957().destroy();
            }
            this.f8424.clear();
        }
        this.f8422 = null;
        this.f8424 = null;
        this.f8423 = null;
        this.f8425 = null;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        f8421.add(this);
        m9087("onOpen", null);
    }
}
