package m3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Timer;
import java.util.TimerTask;
import n3.z1;

/* compiled from: LTTickDown.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final l3.g f9203;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Timer f9204;

    /* renamed from: ʽ, reason: contains not printable characters */
    private b f9205;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f9206;

    /* renamed from: ʿ, reason: contains not printable characters */
    private AppCompatTextView f9207;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f9208 = 200;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f9209 = 0;

    /* compiled from: LTTickDown.java */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AppCompatTextView appCompatTextView = f0.this.f9207;
            final f0 f0Var = f0.this;
            appCompatTextView.post(new Runnable() { // from class: m3.e0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.m9983(f0Var);
                }
            });
        }
    }

    /* compiled from: LTTickDown.java */
    public interface b {
        /* renamed from: ʻ */
        boolean mo9520(boolean z5);
    }

    public f0(Context context, l3.g gVar) {
        this.f9203 = gVar == null ? m9984(context) : gVar;
        m9985(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static /* synthetic */ void m9983(f0 f0Var) {
        f0Var.m9987();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private l3.g m9984(Context context) {
        l3.g gVar = new l3.g();
        gVar.style = 0;
        gVar.text = context.getString(2131820852);
        gVar.position = 0;
        gVar.color = "#FFFFFF";
        gVar.bg_color = "#888888";
        gVar.bg_opacity = 153;
        gVar.bd_color = "#FF0000";
        return gVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m9985(Context context) {
        RelativeLayout.LayoutParams layoutParams;
        int m8711 = g3.a0.m8711(this.f9203.bg_color, -1719105400);
        int argb = Color.argb(this.f9203.bg_opacity, Color.red(m8711), Color.green(m8711), Color.blue(m8711));
        int i5 = this.f9203.style;
        if (i5 == 0) {
            int m10946 = z1.m10946(context, 36.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m10946, m10946);
            g0 m10014 = new g0(context).m10012(argb).m10013(g3.a0.m8711(this.f9203.bd_color, -65536)).m10014(g3.a0.m8711(this.f9203.color, 16777215));
            m10014.setProgress(0.0f);
            this.f9207 = m10014;
            layoutParams = layoutParams2;
        } else {
            if (i5 != 1) {
                return;
            }
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int m109462 = z1.m10946(context, 6.0f);
            h0 h0Var = new h0(context);
            this.f9207 = h0Var;
            h0Var.setTextColor(g3.a0.m8711(this.f9203.color, 15658734));
            this.f9207.setTextSize(2, 16.0f);
            int i6 = m109462 * 2;
            this.f9207.setPadding(i6, m109462, i6, m109462);
            Drawable m1993 = androidx.core.content.a.m1993(context, 2131165474);
            if (m1993 instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) m1993;
                gradientDrawable.setColor(argb);
                gradientDrawable.setStroke(z1.m10946(context, 1.0f), g3.a0.m8711(this.f9203.bd_color, 6710886));
            }
            this.f9207.setBackground(m1993);
        }
        int m109463 = z1.m10946(context, 16.0f);
        int i7 = this.f9203.position;
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            if (i7 == 1) {
                layoutParams.setMarginEnd(m109463);
                layoutParams.addRule(21);
            } else if (i7 == 2) {
                layoutParams.setMarginStart(m109463);
            } else if (i7 == 3) {
                layoutParams.addRule(14);
            }
            layoutParams.bottomMargin = m109463 * 3;
            layoutParams.addRule(12);
        } else {
            layoutParams.setMarginEnd(m109463);
            layoutParams.topMargin = m109463 * 2;
            layoutParams.addRule(21);
        }
        this.f9207.setLayoutParams(layoutParams);
        this.f9207.setOnClickListener(new View.OnClickListener() { // from class: m3.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9177.m9986(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m9986(View view) {
        Timer timer;
        b bVar = this.f9205;
        if (bVar == null || !bVar.mo9520(true) || (timer = this.f9204) == null) {
            return;
        }
        timer.cancel();
        this.f9204 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public synchronized void m9987() {
        this.f9209 += 200;
        m9988();
        if (this.f9209 >= this.f9206) {
            b bVar = this.f9205;
            if (bVar != null) {
                bVar.mo9520(false);
            }
            Timer timer = this.f9204;
            if (timer != null) {
                timer.cancel();
                this.f9204 = null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m9988() {
        String replaceAll = this.f9203.text.replaceAll("\\{\\S\\}", String.valueOf(((this.f9206 - this.f9209) / 1000) + 1));
        AppCompatTextView appCompatTextView = this.f9207;
        if (appCompatTextView instanceof g0) {
            ((g0) appCompatTextView).m10015(replaceAll).setProgress(this.f9209 / this.f9206);
        } else {
            appCompatTextView.setText(replaceAll);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public View m9989() {
        return this.f9207;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public f0 m9990(int i5) {
        this.f9206 = i5 * 1000;
        m9988();
        return this;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public f0 m9991(b bVar) {
        this.f9205 = bVar;
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m9992() {
        this.f9209 = 0;
        Timer timer = this.f9204;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f9204 = timer2;
        timer2.schedule(new a(), 200L, 200L);
    }
}
