package w0;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import w0.a;

/* compiled from: MaterialDialog.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends w0.c implements View.OnClickListener, a.c {

    /* renamed from: ˆ, reason: contains not printable characters */
    protected final e f11803;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Handler f11804;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected ImageView f11805;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected TextView f11806;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected TextView f11807;

    /* renamed from: ˎ, reason: contains not printable characters */
    EditText f11808;

    /* renamed from: ˏ, reason: contains not printable characters */
    RecyclerView f11809;

    /* renamed from: ˑ, reason: contains not printable characters */
    View f11810;

    /* renamed from: י, reason: contains not printable characters */
    FrameLayout f11811;

    /* renamed from: ـ, reason: contains not printable characters */
    ProgressBar f11812;

    /* renamed from: ٴ, reason: contains not printable characters */
    TextView f11813;

    /* renamed from: ᐧ, reason: contains not printable characters */
    TextView f11814;

    /* renamed from: ᴵ, reason: contains not printable characters */
    TextView f11815;

    /* renamed from: ᵎ, reason: contains not printable characters */
    CheckBox f11816;

    /* renamed from: ᵔ, reason: contains not printable characters */
    MDButton f11817;

    /* renamed from: ᵢ, reason: contains not printable characters */
    MDButton f11818;

    /* renamed from: ⁱ, reason: contains not printable characters */
    MDButton f11819;

    /* renamed from: ﹳ, reason: contains not printable characters */
    g f11820;

    /* renamed from: ﹶ, reason: contains not printable characters */
    List<Integer> f11821;

    /* compiled from: MaterialDialog.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* compiled from: MaterialDialog.java */
        /* renamed from: w0.f$a$a, reason: collision with other inner class name */
        class RunnableC0170a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ int f11823;

            RunnableC0170a(int i5) {
                this.f11823 = i5;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f11809.requestFocus();
                f.this.f11803.f11907.scrollToPosition(this.f11823);
            }
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int intValue;
            f.this.f11809.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            f fVar = f.this;
            g gVar = fVar.f11820;
            g gVar2 = g.SINGLE;
            if (gVar == gVar2 || gVar == g.MULTI) {
                if (gVar == gVar2) {
                    intValue = fVar.f11803.f11881;
                    if (intValue < 0) {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.f11821;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(f.this.f11821);
                    intValue = f.this.f11821.get(0).intValue();
                }
                f.this.f11809.post(new RunnableC0170a(intValue));
            }
        }
    }

    /* compiled from: MaterialDialog.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            TextView textView = fVar.f11813;
            if (textView != null) {
                textView.setText(fVar.f11803.f11853.format(fVar.m12470() / f.this.m12473()));
            }
            f fVar2 = f.this;
            TextView textView2 = fVar2.f11814;
            if (textView2 != null) {
                textView2.setText(String.format(fVar2.f11803.f11852, Integer.valueOf(fVar2.m12470()), Integer.valueOf(f.this.m12473())));
            }
        }
    }

    /* compiled from: MaterialDialog.java */
    static /* synthetic */ class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f11827;

        /* renamed from: ʼ, reason: contains not printable characters */
        static final /* synthetic */ int[] f11828;

        static {
            int[] iArr = new int[g.values().length];
            f11828 = iArr;
            try {
                iArr[g.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11828[g.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11828[g.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[w0.b.values().length];
            f11827 = iArr2;
            try {
                iArr2[w0.b.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11827[w0.b.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11827[w0.b.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: MaterialDialog.java */
    public static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        protected final Context f11829;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        protected h f11830;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        protected o f11831;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        protected boolean f11832;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        protected int f11833;

        /* renamed from: ʻʿ, reason: contains not printable characters */
        protected int f11834;

        /* renamed from: ʻˆ, reason: contains not printable characters */
        protected int f11835;

        /* renamed from: ʻˈ, reason: contains not printable characters */
        protected boolean f11836;

        /* renamed from: ʻˉ, reason: contains not printable characters */
        protected boolean f11837;

        /* renamed from: ʻˊ, reason: contains not printable characters */
        protected int f11838;

        /* renamed from: ʻˋ, reason: contains not printable characters */
        protected int f11839;

        /* renamed from: ʻˎ, reason: contains not printable characters */
        protected CharSequence f11840;

        /* renamed from: ʻˏ, reason: contains not printable characters */
        protected CharSequence f11841;

        /* renamed from: ʻˑ, reason: contains not printable characters */
        protected boolean f11842;

        /* renamed from: ʻי, reason: contains not printable characters */
        protected int f11843;

        /* renamed from: ʻـ, reason: contains not printable characters */
        protected boolean f11844;

        /* renamed from: ʻٴ, reason: contains not printable characters */
        protected int f11845;

        /* renamed from: ʻᐧ, reason: contains not printable characters */
        protected int f11846;

        /* renamed from: ʻᴵ, reason: contains not printable characters */
        protected int f11847;

        /* renamed from: ʻᵎ, reason: contains not printable characters */
        protected int[] f11848;

        /* renamed from: ʻᵔ, reason: contains not printable characters */
        protected CharSequence f11849;

        /* renamed from: ʻᵢ, reason: contains not printable characters */
        protected boolean f11850;

        /* renamed from: ʻⁱ, reason: contains not printable characters */
        protected CompoundButton.OnCheckedChangeListener f11851;

        /* renamed from: ʻﹳ, reason: contains not printable characters */
        protected String f11852;

        /* renamed from: ʻﹶ, reason: contains not printable characters */
        protected NumberFormat f11853;

        /* renamed from: ʻﾞ, reason: contains not printable characters */
        protected boolean f11854;

        /* renamed from: ʼ, reason: contains not printable characters */
        protected CharSequence f11855;

        /* renamed from: ʼʻ, reason: contains not printable characters */
        protected boolean f11856;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        protected boolean f11857;

        /* renamed from: ʼʽ, reason: contains not printable characters */
        protected boolean f11858;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        protected boolean f11859;

        /* renamed from: ʼʿ, reason: contains not printable characters */
        protected boolean f11860;

        /* renamed from: ʼˆ, reason: contains not printable characters */
        protected boolean f11861;

        /* renamed from: ʼˈ, reason: contains not printable characters */
        protected boolean f11862;

        /* renamed from: ʼˉ, reason: contains not printable characters */
        protected boolean f11863;

        /* renamed from: ʼˊ, reason: contains not printable characters */
        protected boolean f11864;

        /* renamed from: ʼˋ, reason: contains not printable characters */
        protected int f11865;

        /* renamed from: ʼˎ, reason: contains not printable characters */
        protected int f11866;

        /* renamed from: ʼˏ, reason: contains not printable characters */
        protected int f11867;

        /* renamed from: ʼˑ, reason: contains not printable characters */
        protected int f11868;

        /* renamed from: ʼי, reason: contains not printable characters */
        protected int f11869;

        /* renamed from: ʽ, reason: contains not printable characters */
        protected w0.e f11870;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        protected boolean f11871;

        /* renamed from: ʾ, reason: contains not printable characters */
        protected w0.e f11872;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        protected boolean f11873;

        /* renamed from: ʿ, reason: contains not printable characters */
        protected w0.e f11874;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        protected p f11875;

        /* renamed from: ˆ, reason: contains not printable characters */
        protected w0.e f11876;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        protected float f11877;

        /* renamed from: ˈ, reason: contains not printable characters */
        protected w0.e f11878;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        protected Integer[] f11879;

        /* renamed from: ˉ, reason: contains not printable characters */
        protected int f11880;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        protected int f11881;

        /* renamed from: ˊ, reason: contains not printable characters */
        protected int f11882;

        /* renamed from: ˊˊ, reason: contains not printable characters */
        protected boolean f11883;

        /* renamed from: ˋ, reason: contains not printable characters */
        protected int f11884;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        protected Integer[] f11885;

        /* renamed from: ˎ, reason: contains not printable characters */
        protected CharSequence f11886;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        protected Typeface f11887;

        /* renamed from: ˏ, reason: contains not printable characters */
        protected ArrayList<CharSequence> f11888;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        protected Typeface f11889;

        /* renamed from: ˑ, reason: contains not printable characters */
        protected CharSequence f11890;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        protected Drawable f11891;

        /* renamed from: י, reason: contains not printable characters */
        protected CharSequence f11892;

        /* renamed from: יי, reason: contains not printable characters */
        protected int f11893;

        /* renamed from: ـ, reason: contains not printable characters */
        protected CharSequence f11894;

        /* renamed from: ــ, reason: contains not printable characters */
        protected boolean f11895;

        /* renamed from: ٴ, reason: contains not printable characters */
        protected boolean f11896;

        /* renamed from: ٴٴ, reason: contains not printable characters */
        protected DialogInterface.OnKeyListener f11897;

        /* renamed from: ᐧ, reason: contains not printable characters */
        protected boolean f11898;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        protected h f11899;

        /* renamed from: ᴵ, reason: contains not printable characters */
        protected boolean f11900;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        protected h f11901;

        /* renamed from: ᵎ, reason: contains not printable characters */
        protected View f11902;

        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        protected RecyclerView.h<?> f11903;

        /* renamed from: ᵔ, reason: contains not printable characters */
        protected int f11904;

        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        protected boolean f11905;

        /* renamed from: ᵢ, reason: contains not printable characters */
        protected ColorStateList f11906;

        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        protected RecyclerView.p f11907;

        /* renamed from: ⁱ, reason: contains not printable characters */
        protected ColorStateList f11908;

        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        protected DialogInterface.OnDismissListener f11909;

        /* renamed from: ﹳ, reason: contains not printable characters */
        protected ColorStateList f11910;

        /* renamed from: ﹳﹳ, reason: contains not printable characters */
        protected DialogInterface.OnCancelListener f11911;

        /* renamed from: ﹶ, reason: contains not printable characters */
        protected ColorStateList f11912;

        /* renamed from: ﹶﹶ, reason: contains not printable characters */
        protected DialogInterface.OnShowListener f11913;

        /* renamed from: ﾞ, reason: contains not printable characters */
        protected ColorStateList f11914;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        protected h f11915;

        public e(Context context) {
            w0.e eVar = w0.e.START;
            this.f11870 = eVar;
            this.f11872 = eVar;
            this.f11874 = w0.e.END;
            this.f11876 = eVar;
            this.f11878 = eVar;
            this.f11880 = 0;
            this.f11882 = -1;
            this.f11884 = -1;
            this.f11871 = false;
            this.f11857 = false;
            p pVar = p.LIGHT;
            this.f11875 = pVar;
            this.f11873 = true;
            this.f11895 = true;
            this.f11877 = 1.2f;
            this.f11881 = -1;
            this.f11879 = null;
            this.f11885 = null;
            this.f11883 = true;
            this.f11893 = -1;
            this.f11838 = -2;
            this.f11839 = 0;
            this.f11843 = -1;
            this.f11845 = -1;
            this.f11846 = -1;
            this.f11847 = 0;
            this.f11856 = false;
            this.f11858 = false;
            this.f11859 = false;
            this.f11860 = false;
            this.f11861 = false;
            this.f11862 = false;
            this.f11863 = false;
            this.f11864 = false;
            this.f11829 = context;
            int m12850 = y0.a.m12850(context, w0.g.f11920, y0.a.m12840(context, w0.h.f11953));
            this.f11904 = m12850;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                this.f11904 = y0.a.m12850(context, R.attr.colorAccent, m12850);
            }
            this.f11908 = y0.a.m12839(context, this.f11904);
            this.f11910 = y0.a.m12839(context, this.f11904);
            this.f11912 = y0.a.m12839(context, this.f11904);
            this.f11914 = y0.a.m12839(context, y0.a.m12850(context, w0.g.f11949, this.f11904));
            this.f11880 = y0.a.m12850(context, w0.g.f11933, y0.a.m12850(context, w0.g.f11924, i5 >= 21 ? y0.a.m12849(context, R.attr.colorControlHighlight) : 0));
            this.f11853 = NumberFormat.getPercentInstance();
            this.f11852 = "%1d/%2d";
            this.f11875 = y0.a.m12844(y0.a.m12849(context, R.attr.textColorPrimary)) ? pVar : p.DARK;
            m12481();
            this.f11870 = y0.a.m12855(context, w0.g.f11923, this.f11870);
            this.f11872 = y0.a.m12855(context, w0.g.f11938, this.f11872);
            this.f11874 = y0.a.m12855(context, w0.g.f11935, this.f11874);
            this.f11876 = y0.a.m12855(context, w0.g.f11948, this.f11876);
            this.f11878 = y0.a.m12855(context, w0.g.f11936, this.f11878);
            try {
                m12499(y0.a.m12856(context, w0.g.f11951), y0.a.m12856(context, w0.g.f11921));
            } catch (Throwable unused) {
            }
            if (this.f11887 == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f11887 = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.f11887 = Typeface.create("sans-serif", 1);
                    }
                } catch (Throwable unused2) {
                    this.f11887 = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f11889 == null) {
                try {
                    this.f11889 = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f11889 = typeface;
                    if (typeface == null) {
                        this.f11889 = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m12481() {
            if (x0.f.m12672(false) == null) {
                return;
            }
            x0.f m12671 = x0.f.m12671();
            if (m12671.f12097) {
                this.f11875 = p.DARK;
            }
            int i5 = m12671.f12098;
            if (i5 != 0) {
                this.f11882 = i5;
            }
            int i6 = m12671.f12099;
            if (i6 != 0) {
                this.f11884 = i6;
            }
            ColorStateList colorStateList = m12671.f12100;
            if (colorStateList != null) {
                this.f11908 = colorStateList;
            }
            ColorStateList colorStateList2 = m12671.f12101;
            if (colorStateList2 != null) {
                this.f11912 = colorStateList2;
            }
            ColorStateList colorStateList3 = m12671.f12102;
            if (colorStateList3 != null) {
                this.f11910 = colorStateList3;
            }
            int i7 = m12671.f12104;
            if (i7 != 0) {
                this.f11835 = i7;
            }
            Drawable drawable = m12671.f12105;
            if (drawable != null) {
                this.f11891 = drawable;
            }
            int i8 = m12671.f12106;
            if (i8 != 0) {
                this.f11834 = i8;
            }
            int i9 = m12671.f12107;
            if (i9 != 0) {
                this.f11833 = i9;
            }
            int i10 = m12671.f12110;
            if (i10 != 0) {
                this.f11866 = i10;
            }
            int i11 = m12671.f12109;
            if (i11 != 0) {
                this.f11865 = i11;
            }
            int i12 = m12671.f12111;
            if (i12 != 0) {
                this.f11867 = i12;
            }
            int i13 = m12671.f12112;
            if (i13 != 0) {
                this.f11868 = i13;
            }
            int i14 = m12671.f12113;
            if (i14 != 0) {
                this.f11869 = i14;
            }
            int i15 = m12671.f12103;
            if (i15 != 0) {
                this.f11904 = i15;
            }
            ColorStateList colorStateList4 = m12671.f12108;
            if (colorStateList4 != null) {
                this.f11914 = colorStateList4;
            }
            this.f11870 = m12671.f12114;
            this.f11872 = m12671.f12115;
            this.f11874 = m12671.f12116;
            this.f11876 = m12671.f12117;
            this.f11878 = m12671.f12118;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public f m12482() {
            return new f(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public e m12483(boolean z5) {
            this.f11873 = z5;
            this.f11895 = z5;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public e m12484(int i5) {
            return m12485(i5, false);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public e m12485(int i5, boolean z5) {
            CharSequence text = this.f11829.getText(i5);
            if (z5) {
                text = Html.fromHtml(text.toString().replace("\n", "<br/>"));
            }
            return m12486(text);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public e m12486(CharSequence charSequence) {
            if (this.f11902 != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f11886 = charSequence;
            return this;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public final Context m12487() {
            return this.f11829;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public e m12488(int i5) {
            return i5 == 0 ? this : m12489(this.f11829.getText(i5));
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public e m12489(CharSequence charSequence) {
            this.f11894 = charSequence;
            return this;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public e m12490(h hVar) {
            this.f11899 = hVar;
            return this;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public e m12491(h hVar) {
            this.f11915 = hVar;
            return this;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public e m12492(int i5) {
            if (i5 == 0) {
                return this;
            }
            m12493(this.f11829.getText(i5));
            return this;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public e m12493(CharSequence charSequence) {
            this.f11890 = charSequence;
            return this;
        }

        /* renamed from: י, reason: contains not printable characters */
        public e m12494(boolean z5, int i5) {
            if (this.f11902 != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z5) {
                this.f11836 = true;
                this.f11838 = -2;
            } else {
                this.f11854 = false;
                this.f11836 = false;
                this.f11838 = -1;
                this.f11839 = i5;
            }
            return this;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public e m12495(boolean z5, int i5, boolean z6) {
            this.f11837 = z6;
            return m12494(z5, i5);
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        public f m12496() {
            f m12482 = m12482();
            m12482.show();
            return m12482;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        public e m12497(int i5) {
            m12498(this.f11829.getText(i5));
            return this;
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        public e m12498(CharSequence charSequence) {
            this.f11855 = charSequence;
            return this;
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        public e m12499(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface m12861 = y0.d.m12861(this.f11829, str);
                this.f11887 = m12861;
                if (m12861 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface m128612 = y0.d.m12861(this.f11829, str2);
                this.f11889 = m128612;
                if (m128612 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }
    }

    /* compiled from: MaterialDialog.java */
    /* renamed from: w0.f$f, reason: collision with other inner class name */
    private static class C0171f extends WindowManager.BadTokenException {
        C0171f(String str) {
            super(str);
        }
    }

    /* compiled from: MaterialDialog.java */
    enum g {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: ʻ, reason: contains not printable characters */
        public static int m12500(g gVar) {
            int i5 = d.f11828[gVar.ordinal()];
            if (i5 == 1) {
                return l.f11992;
            }
            if (i5 == 2) {
                return l.f11994;
            }
            if (i5 == 3) {
                return l.f11993;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* compiled from: MaterialDialog.java */
    public interface h {
        /* renamed from: ʻ */
        void mo8884(f fVar, w0.b bVar);
    }

    @SuppressLint({"InflateParams"})
    protected f(e eVar) {
        super(eVar.f11829, w0.d.m12458(eVar));
        this.f11804 = new Handler();
        this.f11803 = eVar;
        this.f11795 = (MDRootLayout) LayoutInflater.from(eVar.f11829).inflate(w0.d.m12457(eVar), (ViewGroup) null);
        w0.d.m12459(this);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m12464() {
        this.f11803.getClass();
        return false;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean m12465(View view) {
        this.f11803.getClass();
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f11808 != null) {
            y0.a.m12843(this, this.f11803);
        }
        super.dismiss();
    }

    @Override // w0.c, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i5) {
        return super.findViewById(i5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w0.b bVar = (w0.b) view.getTag();
        int i5 = d.f11827[bVar.ordinal()];
        if (i5 == 1) {
            this.f11803.getClass();
            h hVar = this.f11803.f11901;
            if (hVar != null) {
                hVar.mo8884(this, bVar);
            }
            if (this.f11803.f11883) {
                dismiss();
            }
        } else if (i5 == 2) {
            this.f11803.getClass();
            h hVar2 = this.f11803.f11899;
            if (hVar2 != null) {
                hVar2.mo8884(this, bVar);
            }
            if (this.f11803.f11883) {
                cancel();
            }
        } else if (i5 == 3) {
            this.f11803.getClass();
            h hVar3 = this.f11803.f11915;
            if (hVar3 != null) {
                hVar3.mo8884(this, bVar);
            }
            if (!this.f11803.f11857) {
                m12465(view);
            }
            if (!this.f11803.f11871) {
                m12464();
            }
            this.f11803.getClass();
            if (this.f11803.f11883) {
                dismiss();
            }
        }
        h hVar4 = this.f11803.f11830;
        if (hVar4 != null) {
            hVar4.mo8884(this, bVar);
        }
    }

    @Override // w0.c, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f11808 != null) {
            y0.a.m12858(this, this.f11803);
            if (this.f11808.getText().length() > 0) {
                EditText editText = this.f11808;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // w0.c, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(int i5) throws IllegalAccessError {
        super.setContentView(i5);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f11806.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new C0171f("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    @Override // w0.a.c
    /* renamed from: ʻ */
    public boolean mo12453(f fVar, View view, int i5, CharSequence charSequence, boolean z5) {
        boolean z6 = false;
        if (!view.isEnabled()) {
            return false;
        }
        g gVar = this.f11820;
        if (gVar == null || gVar == g.REGULAR) {
            if (this.f11803.f11883) {
                dismiss();
            }
            if (!z5) {
                this.f11803.getClass();
            }
            if (z5) {
                this.f11803.getClass();
            }
        } else if (gVar == g.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(k.f11975);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (!this.f11821.contains(Integer.valueOf(i5))) {
                this.f11821.add(Integer.valueOf(i5));
                if (!this.f11803.f11871) {
                    checkBox.setChecked(true);
                } else if (m12464()) {
                    checkBox.setChecked(true);
                } else {
                    this.f11821.remove(Integer.valueOf(i5));
                }
            } else {
                this.f11821.remove(Integer.valueOf(i5));
                if (!this.f11803.f11871) {
                    checkBox.setChecked(false);
                } else if (m12464()) {
                    checkBox.setChecked(false);
                } else {
                    this.f11821.add(Integer.valueOf(i5));
                }
            }
        } else if (gVar == g.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(k.f11975);
            if (!radioButton.isEnabled()) {
                return false;
            }
            e eVar = this.f11803;
            int i6 = eVar.f11881;
            if (eVar.f11883 && eVar.f11890 == null) {
                dismiss();
                this.f11803.f11881 = i5;
                m12465(view);
            } else if (eVar.f11857) {
                eVar.f11881 = i5;
                z6 = m12465(view);
                this.f11803.f11881 = i6;
            } else {
                z6 = true;
            }
            if (z6) {
                this.f11803.f11881 = i5;
                radioButton.setChecked(true);
                this.f11803.f11903.m4813(i6);
                this.f11803.f11903.m4813(i5);
            }
        }
        return true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    final void m12466() {
        RecyclerView recyclerView = this.f11809;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final MDButton m12467(w0.b bVar) {
        int i5 = d.f11827[bVar.ordinal()];
        return i5 != 1 ? i5 != 2 ? this.f11817 : this.f11819 : this.f11818;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final e m12468() {
        return this.f11803;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    Drawable m12469(w0.b bVar, boolean z5) {
        if (z5) {
            e eVar = this.f11803;
            if (eVar.f11866 != 0) {
                return androidx.core.content.res.i.m2110(eVar.f11829.getResources(), this.f11803.f11866, null);
            }
            Context context = eVar.f11829;
            int i5 = w0.g.f11934;
            Drawable m12853 = y0.a.m12853(context, i5);
            return m12853 != null ? m12853 : y0.a.m12853(getContext(), i5);
        }
        int i6 = d.f11827[bVar.ordinal()];
        if (i6 == 1) {
            e eVar2 = this.f11803;
            if (eVar2.f11868 != 0) {
                return androidx.core.content.res.i.m2110(eVar2.f11829.getResources(), this.f11803.f11868, null);
            }
            Context context2 = eVar2.f11829;
            int i7 = w0.g.f11931;
            Drawable m128532 = y0.a.m12853(context2, i7);
            if (m128532 != null) {
                return m128532;
            }
            Drawable m128533 = y0.a.m12853(getContext(), i7);
            if (Build.VERSION.SDK_INT >= 21) {
                y0.c.m12860(m128533, this.f11803.f11880);
            }
            return m128533;
        }
        if (i6 != 2) {
            e eVar3 = this.f11803;
            if (eVar3.f11867 != 0) {
                return androidx.core.content.res.i.m2110(eVar3.f11829.getResources(), this.f11803.f11867, null);
            }
            Context context3 = eVar3.f11829;
            int i8 = w0.g.f11932;
            Drawable m128534 = y0.a.m12853(context3, i8);
            if (m128534 != null) {
                return m128534;
            }
            Drawable m128535 = y0.a.m12853(getContext(), i8);
            if (Build.VERSION.SDK_INT >= 21) {
                y0.c.m12860(m128535, this.f11803.f11880);
            }
            return m128535;
        }
        e eVar4 = this.f11803;
        if (eVar4.f11869 != 0) {
            return androidx.core.content.res.i.m2110(eVar4.f11829.getResources(), this.f11803.f11869, null);
        }
        Context context4 = eVar4.f11829;
        int i9 = w0.g.f11930;
        Drawable m128536 = y0.a.m12853(context4, i9);
        if (m128536 != null) {
            return m128536;
        }
        Drawable m128537 = y0.a.m12853(getContext(), i9);
        if (Build.VERSION.SDK_INT >= 21) {
            y0.c.m12860(m128537, this.f11803.f11880);
        }
        return m128537;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final int m12470() {
        ProgressBar progressBar = this.f11812;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final EditText m12471() {
        return this.f11808;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final Drawable m12472() {
        e eVar = this.f11803;
        if (eVar.f11865 != 0) {
            return androidx.core.content.res.i.m2110(eVar.f11829.getResources(), this.f11803.f11865, null);
        }
        Context context = eVar.f11829;
        int i5 = w0.g.f11950;
        Drawable m12853 = y0.a.m12853(context, i5);
        return m12853 != null ? m12853 : y0.a.m12853(getContext(), i5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m12473() {
        ProgressBar progressBar = this.f11812;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final View m12474() {
        return this.f11795;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m12475(int i5, boolean z5) {
        e eVar;
        int i6;
        TextView textView = this.f11815;
        if (textView != null) {
            if (this.f11803.f11846 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i5), Integer.valueOf(this.f11803.f11846)));
                this.f11815.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z6 = (z5 && i5 == 0) || ((i6 = (eVar = this.f11803).f11846) > 0 && i5 > i6) || i5 < eVar.f11845;
            e eVar2 = this.f11803;
            int i7 = z6 ? eVar2.f11847 : eVar2.f11884;
            e eVar3 = this.f11803;
            int i8 = z6 ? eVar3.f11847 : eVar3.f11904;
            if (this.f11803.f11846 > 0) {
                this.f11815.setTextColor(i7);
            }
            x0.e.m12668(this.f11808, i8);
            m12467(w0.b.POSITIVE).setEnabled(!z6);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    final void m12476() {
        if (this.f11809 == null) {
            return;
        }
        ArrayList<CharSequence> arrayList = this.f11803.f11888;
        if ((arrayList == null || arrayList.size() == 0) && this.f11803.f11903 == null) {
            return;
        }
        e eVar = this.f11803;
        if (eVar.f11907 == null) {
            eVar.f11907 = new LinearLayoutManager(getContext());
        }
        if (this.f11809.getLayoutManager() == null) {
            this.f11809.setLayoutManager(this.f11803.f11907);
        }
        this.f11809.setAdapter(this.f11803.f11903);
        if (this.f11820 != null) {
            ((w0.a) this.f11803.f11903).m12450(this);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m12477() {
        EditText editText = this.f11808;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new c());
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public final void m12478(int i5) {
        if (this.f11803.f11838 <= -2) {
            throw new IllegalStateException("Cannot use setMaxProgress() on this dialog.");
        }
        this.f11812.setMax(i5);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public final void m12479(int i5) {
        if (this.f11803.f11838 <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.f11812.setProgress(i5);
            this.f11804.post(new b());
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public final void m12480(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    @Override // w0.c, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view) throws IllegalAccessError {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i5) {
        setTitle(this.f11803.f11829.getString(i5));
    }

    @Override // w0.c, android.app.Dialog
    @Deprecated
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        super.setContentView(view, layoutParams);
    }

    /* compiled from: MaterialDialog.java */
    class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            int length = charSequence.toString().length();
            f fVar = f.this;
            if (!fVar.f11803.f11842) {
                r4 = length == 0;
                fVar.m12467(w0.b.POSITIVE).setEnabled(!r4);
            }
            f.this.m12475(length, r4);
            e eVar = f.this.f11803;
            if (eVar.f11844) {
                eVar.getClass();
                throw null;
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }
}
