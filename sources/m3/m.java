package m3;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lt.app.App;
import com.lt.app.WebActivity;
import h3.j2;
import h3.z;
import j2.f;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.z1;

/* compiled from: LTActionView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m extends BottomSheetDialogFragment implements View.OnClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private List<String> f9250;

    /* renamed from: ʿ, reason: contains not printable characters */
    private j2.f f9251;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f9252;

    /* compiled from: LTActionView.java */
    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f9253 = -1;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ n3.d f9254;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ ImageView f9255;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ FrameLayout.LayoutParams f9256;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f9257;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ float f9258;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ l3.a f9259;

        a(n3.d dVar, ImageView imageView, FrameLayout.LayoutParams layoutParams, ViewGroup viewGroup, float f5, l3.a aVar) {
            this.f9254 = dVar;
            this.f9255 = imageView;
            this.f9256 = layoutParams;
            this.f9257 = viewGroup;
            this.f9258 = f5;
            this.f9259 = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f9254.getResources().getConfiguration().orientation != this.f9253) {
                this.f9253 = this.f9254.getResources().getConfiguration().orientation;
                this.f9255.setTag(BuildConfig.FLAVOR);
            }
            if (this.f9255.getTag() == null && this.f9256.leftMargin < this.f9257.getWidth() && this.f9256.topMargin < this.f9257.getHeight()) {
                return true;
            }
            int measuredWidth = this.f9257.getMeasuredWidth();
            int measuredHeight = this.f9257.getMeasuredHeight();
            int i5 = (int) (this.f9258 * 8.0f);
            if (this.f9259.m9728(45)) {
                FrameLayout.LayoutParams layoutParams = this.f9256;
                layoutParams.topMargin = ((measuredHeight - layoutParams.height) - i5) - ((int) (this.f9258 * 20.0f));
                layoutParams.leftMargin = (measuredWidth - layoutParams.width) - i5;
            } else if (this.f9259.m9728(46)) {
                FrameLayout.LayoutParams layoutParams2 = this.f9256;
                layoutParams2.topMargin = (measuredHeight - layoutParams2.height) / 2;
                layoutParams2.leftMargin = (measuredWidth - layoutParams2.width) - i5;
            } else if (this.f9259.m9728(47)) {
                FrameLayout.LayoutParams layoutParams3 = this.f9256;
                layoutParams3.topMargin = i5;
                layoutParams3.leftMargin = (measuredWidth - layoutParams3.width) - i5;
            } else if (this.f9259.m9728(48)) {
                FrameLayout.LayoutParams layoutParams4 = this.f9256;
                layoutParams4.topMargin = ((measuredHeight - layoutParams4.height) - i5) - ((int) (this.f9258 * 20.0f));
                layoutParams4.leftMargin = i5;
            } else if (this.f9259.m9728(49)) {
                FrameLayout.LayoutParams layoutParams5 = this.f9256;
                layoutParams5.topMargin = (measuredHeight - layoutParams5.height) / 2;
                layoutParams5.leftMargin = i5;
            } else if (this.f9259.m9728(50)) {
                FrameLayout.LayoutParams layoutParams6 = this.f9256;
                layoutParams6.topMargin = i5;
                layoutParams6.leftMargin = i5;
            } else if (this.f9259.m9728(51)) {
                FrameLayout.LayoutParams layoutParams7 = this.f9256;
                layoutParams7.topMargin = ((measuredHeight - layoutParams7.height) - i5) - ((int) (this.f9258 * 20.0f));
                layoutParams7.leftMargin = (measuredWidth - layoutParams7.width) / 2;
            } else if (this.f9259.m9728(52)) {
                FrameLayout.LayoutParams layoutParams8 = this.f9256;
                layoutParams8.topMargin = (measuredHeight - layoutParams8.height) / 2;
                layoutParams8.leftMargin = (measuredWidth - layoutParams8.width) / 2;
            } else {
                FrameLayout.LayoutParams layoutParams9 = this.f9256;
                layoutParams9.topMargin = i5;
                layoutParams9.leftMargin = (measuredWidth - layoutParams9.width) / 2;
            }
            this.f9255.setLayoutParams(this.f9256);
            this.f9255.setTag(null);
            return true;
        }
    }

    /* compiled from: LTActionView.java */
    class b implements View.OnTouchListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f9260;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f9261;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f9262;

        /* renamed from: ˈ, reason: contains not printable characters */
        private int f9263;

        /* renamed from: ˉ, reason: contains not printable characters */
        private int f9264;

        /* renamed from: ˊ, reason: contains not printable characters */
        private int f9265;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ FrameLayout.LayoutParams f9266;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f9267;

        /* renamed from: ˏ, reason: contains not printable characters */
        final /* synthetic */ ImageView f9268;

        b(FrameLayout.LayoutParams layoutParams, ViewGroup viewGroup, ImageView imageView) {
            this.f9266 = layoutParams;
            this.f9267 = viewGroup;
            this.f9268 = imageView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.f9264 = rawX;
                this.f9265 = rawY;
                FrameLayout.LayoutParams layoutParams = this.f9266;
                this.f9260 = rawX - layoutParams.leftMargin;
                this.f9261 = rawY - layoutParams.topMargin;
                this.f9262 = this.f9267.getWidth() - this.f9266.width;
                this.f9263 = this.f9267.getHeight() - this.f9266.height;
                return false;
            }
            if (action == 1) {
                return Math.abs(this.f9264 - rawX) > 20 || Math.abs(this.f9265 - rawY) > 20;
            }
            if (action == 2) {
                int min = Math.min(Math.max(rawX - this.f9260, 0), this.f9262);
                int min2 = Math.min(Math.max(rawY - this.f9261, 0), this.f9263);
                FrameLayout.LayoutParams layoutParams2 = this.f9266;
                if (layoutParams2.leftMargin == min && layoutParams2.topMargin == min2) {
                    return true;
                }
                layoutParams2.leftMargin = min;
                layoutParams2.topMargin = min2;
                this.f9268.setLayoutParams(layoutParams2);
            }
            return true;
        }
    }

    /* compiled from: LTActionView.java */
    private class c extends RecyclerView.h<d> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<Integer> f9269;

        c() {
            ArrayList arrayList = new ArrayList();
            this.f9269 = arrayList;
            boolean z5 = m.this.f9250 == null || m.this.f9250.size() == 0;
            l3.a m7827 = App.m7827();
            if ((z5 && m7827.m9728(35)) || (m.this.f9250 != null && m.this.f9250.contains("ShareWxFriend"))) {
                arrayList.add(0);
            }
            if ((z5 && m7827.m9728(36)) || (m.this.f9250 != null && m.this.f9250.contains("ShareWxTimeline"))) {
                arrayList.add(1);
            }
            if ((z5 && m7827.m9728(37)) || (m.this.f9250 != null && m.this.f9250.contains("ShareQQFriend"))) {
                arrayList.add(2);
            }
            if ((z5 && m7827.m9728(38)) || (m.this.f9250 != null && m.this.f9250.contains("ShareQQZone"))) {
                arrayList.add(3);
            }
            if ((z5 && m7827.m9729(8)) || (m.this.f9250 != null && m.this.f9250.contains("ShareWeibo"))) {
                arrayList.add(4);
            }
            if ((z5 && m7827.m9729(15)) || (m.this.f9250 != null && m.this.f9250.contains("ShareMenu"))) {
                arrayList.add(16);
            }
            if ((z5 && m7827.m9728(39)) || (m.this.f9250 != null && m.this.f9250.contains("CopyLink"))) {
                arrayList.add(5);
            }
            if ((z5 && m7827.m9729(13)) || (m.this.f9250 != null && m.this.f9250.contains("Back"))) {
                if (m.this.f9251.canGoBack()) {
                    arrayList.add(13);
                } else if ((m.this.f9251.getContext() instanceof WebActivity) && !((WebActivity) m.this.f9251.getContext()).m7938()) {
                    arrayList.add(13);
                }
            }
            if (((z5 && m7827.m9729(14)) || (m.this.f9250 != null && m.this.f9250.contains("Forward"))) && m.this.f9251.canGoForward()) {
                arrayList.add(14);
            }
            if ((z5 && m7827.m9728(40)) || (m.this.f9250 != null && m.this.f9250.contains("Refresh"))) {
                arrayList.add(6);
            }
            if (((z5 && m7827.m9729(11)) || (m.this.f9250 != null && m.this.f9250.contains("FullScreen"))) && (m.this.f9251.getContext() instanceof WebActivity)) {
                arrayList.add(12);
            }
            if (((z5 && m7827.m9729(16)) || (m.this.f9250 != null && m.this.f9250.contains("Orientation"))) && (m.this.f9251.getContext() instanceof WebActivity)) {
                arrayList.add(17);
            }
            if ((z5 && m7827.m9729(9)) || (m.this.f9250 != null && m.this.f9250.contains("ClearCache"))) {
                arrayList.add(10);
            }
            if ((z5 && m7827.m9729(10)) || (m.this.f9250 != null && m.this.f9250.contains("Scan"))) {
                arrayList.add(11);
            }
            if ((z5 && m7827.m9728(42)) || (m.this.f9250 != null && m.this.f9250.contains("ShowImages"))) {
                arrayList.add(7);
            }
            if ((z5 && m7827.m9728(41)) || (m.this.f9250 != null && m.this.f9250.contains("OpenInBrowser"))) {
                arrayList.add(8);
            }
            if ((z5 && m7827.m9728(54)) || (m.this.f9250 != null && m.this.f9250.contains("BackToHome"))) {
                arrayList.add(9);
            }
            if (!(z5 && m7827.m9729(12)) && (m.this.f9250 == null || !m.this.f9250.contains("Exit"))) {
                return;
            }
            arrayList.add(15);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ʿ */
        public int mo4807() {
            return this.f9269.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ﹶ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4815(d dVar, int i5) {
            int i6;
            int i7;
            int intValue = this.f9269.get(i5).intValue();
            dVar.itemView.setTag(Integer.valueOf(intValue));
            switch (intValue) {
                case 0:
                    i6 = 2131165380;
                    i7 = 2131820589;
                    break;
                case 1:
                    i6 = 2131165381;
                    i7 = 2131820590;
                    break;
                case 2:
                    i6 = 2131165371;
                    i7 = 2131820586;
                    break;
                case 3:
                    i6 = 2131165372;
                    i7 = 2131820587;
                    break;
                case 4:
                    i6 = 2131165378;
                    i7 = 2131820588;
                    break;
                case 5:
                    i6 = 2131165330;
                    i7 = 2131820575;
                    break;
                case 6:
                    i6 = 2131165373;
                    i7 = 2131820583;
                    break;
                case 7:
                    i6 = 2131165377;
                    i7 = 2131820591;
                    break;
                case 8:
                    i6 = 2131165368;
                    i7 = 2131820580;
                    break;
                case 9:
                    i6 = 2131165325;
                    i7 = 2131820572;
                    break;
                case 10:
                    i6 = 2131165327;
                    i7 = 2131820573;
                    break;
                case 11:
                    i6 = 2131165374;
                    i7 = 2131820584;
                    break;
                case 12:
                    if (!((WebActivity) m.this.f9251.getContext()).m7936()) {
                        i6 = 2131165333;
                        i7 = 2131820578;
                        break;
                    } else {
                        i6 = 2131165334;
                        i7 = 2131820579;
                        break;
                    }
                case 13:
                    i6 = 2131165326;
                    i7 = 2131820571;
                    break;
                case 14:
                    i6 = 2131165332;
                    i7 = 2131820577;
                    break;
                case 15:
                    i6 = 2131165331;
                    i7 = 2131820576;
                    break;
                case 16:
                    i6 = 2131165376;
                    i7 = 2131820585;
                    break;
                case 17:
                    if (!((WebActivity) m.this.f9251.getContext()).m7937()) {
                        i6 = 2131165370;
                        i7 = 2131820582;
                        break;
                    } else {
                        i6 = 2131165336;
                        i7 = 2131820581;
                        break;
                    }
                default:
                    return;
            }
            dVar.f9271.setImageResource(i6);
            dVar.f9272.setText(i7);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ﾞ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public d mo4817(ViewGroup viewGroup, int i5) {
            return m.this.new d(j3.b.m9327(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* compiled from: LTActionView.java */
    private class d extends RecyclerView.f0 {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ImageView f9271;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final TextView f9272;

        d(j3.b bVar) {
            super(bVar.m9328());
            this.itemView.setOnClickListener(m.this);
            this.f9271 = bVar.f8648;
            this.f9272 = bVar.f8649;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m10039(final j2.f fVar, int i5) {
        final n3.d dVar;
        ViewGroup mo7926;
        final l3.a m7827 = App.m7827();
        if (m7827 == null || fVar == null || !(fVar.getContext() instanceof n3.d) || (mo7926 = (dVar = (n3.d) fVar.getContext()).mo7926()) == null) {
            return;
        }
        int i6 = i5;
        i6 = i5;
        if (i5 != 0 && i5 != 1) {
            i6 = m7827.m9728(43);
        }
        ImageView imageView = (ImageView) mo7926.findViewById(1125);
        if (i6 == 0) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (i6 == 1) {
            if (imageView != null) {
                if (imageView.getVisibility() != 0) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            } else {
                imageView = new ImageView(dVar);
                imageView.setTag(BuildConfig.FLAVOR);
                imageView.setId(1125);
                mo7926.addView(imageView);
            }
        }
        final ImageView imageView2 = imageView;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        dVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f5 = displayMetrics.density;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
        layoutParams.width = (int) (m7827.m27w * f5);
        layoutParams.height = (int) (m7827.m27h * f5);
        mo7926.getViewTreeObserver().addOnPreDrawListener(new a(dVar, imageView2, layoutParams, mo7926, f5, m7827));
        com.bumptech.glide.b.m6018(imageView2).m6102(m7827.m27i).m6085(imageView2);
        imageView2.setClickable(true);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: m3.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.m10041(fVar, m7827, imageView2, dVar, view);
            }
        });
        if (m7827.m9728(44)) {
            imageView2.setOnTouchListener(new b(layoutParams, mo7926, imageView2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static /* synthetic */ void m10040(l3.a aVar, j2.f fVar, ImageView imageView, n3.d dVar, boolean z5, Object obj) {
        if (z5) {
            return;
        }
        if (TextUtils.isEmpty(aVar.m27c)) {
            new m().m10044(null, fVar, imageView).show(dVar.m4043(), "action");
        } else if (URLUtil.isHttpsUrl(aVar.m27c) || URLUtil.isHttpUrl(aVar.m27c)) {
            fVar.loadUrl(aVar.m27c, null);
        } else {
            fVar.mo7788(aVar.m27c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static /* synthetic */ void m10041(final j2.f fVar, final l3.a aVar, final ImageView imageView, final n3.d dVar, View view) {
        fVar.mo9241("onMenuAction", null, new f.b() { // from class: m3.l
            @Override // j2.f.b
            /* renamed from: ʻ */
            public final void mo8747(boolean z5, Object obj) {
                m.m10040(aVar, fVar, imageView, dVar, z5, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public /* synthetic */ void m10042() {
        com.lt.app.c.m7959(this.f9251.getContext(), 2131820574);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
        switch (((Integer) view.getTag()).intValue()) {
            case 0:
                j2.m8909(1, this.f9251, null, null, true);
                break;
            case 1:
                j2.m8909(0, this.f9251, null, null, true);
                break;
            case 2:
                j2.m8909(2, this.f9251, null, null, true);
                break;
            case 3:
                j2.m8909(3, this.f9251, null, null, true);
                break;
            case 4:
                j2.m8909(4, this.f9251, null, null, true);
                break;
            case 5:
                ClipboardManager clipboardManager = (ClipboardManager) this.f9251.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(null, this.f9251.getUrl()));
                    com.lt.app.c.m7959(this.f9251.getContext(), 2131820662);
                    break;
                }
                break;
            case 6:
                this.f9251.reload();
                break;
            case 7:
                com.lt.app.c.m7982(this.f9251);
                break;
            case 8:
                com.lt.app.c.m7986(this.f9251.getContext(), this.f9251.getUrl(), true);
                break;
            case 9:
                com.lt.app.c.m7960(this.f9251, App.m7827().m9728(56));
                break;
            case 10:
                if (!App.m7815(6, true)) {
                    com.lt.app.c.m7959(this.f9251.getContext(), 2131820688);
                    break;
                } else {
                    h3.z.m9099(new z.c() { // from class: m3.k
                        @Override // h3.z.c
                        /* renamed from: ʻ */
                        public final void mo8744() {
                            this.f9244.m10042();
                        }
                    }, this.f9251);
                    break;
                }
            case 11:
                if (!App.m7815(8, true)) {
                    com.lt.app.c.m7959(this.f9251.getContext(), 2131820688);
                    break;
                } else {
                    g3.a0.m8719((com.lt.app.b) this.f9251.getContext(), this.f9251);
                    break;
                }
            case 12:
                ((WebActivity) this.f9251.getContext()).m7943();
                View view2 = this.f9252;
                if (view2 != null) {
                    view2.setTag(BuildConfig.FLAVOR);
                    break;
                }
                break;
            case 13:
                if (!this.f9251.canGoBack()) {
                    if (this.f9251.getContext() instanceof Activity) {
                        ((Activity) this.f9251.getContext()).finish();
                        break;
                    }
                } else {
                    this.f9251.goBack();
                    break;
                }
                break;
            case 14:
                if (this.f9251.canGoForward()) {
                    this.f9251.goForward();
                    break;
                }
                break;
            case 15:
                com.lt.app.c.m7963(this.f9251.getContext());
                break;
            case 16:
                j2.m8909(9, this.f9251, null, null, true);
                break;
            case 17:
                ((WebActivity) this.f9251.getContext()).m7944();
                View view3 = this.f9252;
                if (view3 != null) {
                    view3.setTag(BuildConfig.FLAVOR);
                    break;
                }
                break;
        }
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f9251 == null) {
            return null;
        }
        j3.a m9323 = j3.a.m9323(layoutInflater);
        int i5 = (!(this.f9251.getContext() instanceof WebActivity) || ((WebActivity) this.f9251.getContext()).m7937()) ? 4 : 8;
        m9323.f8646.setHasFixedSize(true);
        m9323.f8646.setLayoutManager(new StaggeredGridLayoutManager(i5, 1));
        m9323.f8646.setAdapter(new c());
        float m10946 = z1.m10946(this.f9251.getContext(), 10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{m10946, m10946, m10946, m10946, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setColor(-1);
        m9323.m9325().setBackground(shapeDrawable);
        return m9323.m9325();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.e
    public void onStart() {
        super.onStart();
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).getBehavior().setState(3);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public m m10043(List<String> list, j2.f fVar) {
        return m10044(list, fVar, null);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public m m10044(List<String> list, j2.f fVar, View view) {
        this.f9250 = list;
        this.f9251 = fVar;
        this.f9252 = view;
        return this;
    }
}
