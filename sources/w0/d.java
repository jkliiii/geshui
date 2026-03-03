package w0;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import me.zhanghai.android.materialprogressbar.HorizontalProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateCircularProgressDrawable;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import w0.f;

/* compiled from: DialogInit.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d {
    /* renamed from: ʼ, reason: contains not printable characters */
    static int m12457(f.e eVar) {
        return eVar.f11902 != null ? l.f11986 : (eVar.f11888 == null && eVar.f11903 == null) ? eVar.f11838 > -2 ? l.f11989 : eVar.f11836 ? eVar.f11854 ? l.f11991 : l.f11990 : eVar.f11849 != null ? l.f11985 : l.f11984 : eVar.f11849 != null ? l.f11988 : l.f11987;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static int m12458(f.e eVar) {
        Context context = eVar.f11829;
        int i5 = g.f11939;
        p pVar = eVar.f11875;
        p pVar2 = p.DARK;
        boolean m12848 = y0.a.m12848(context, i5, pVar == pVar2);
        if (!m12848) {
            pVar2 = p.LIGHT;
        }
        eVar.f11875 = pVar2;
        return m12848 ? m.f11995 : m.f11996;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m12459(f fVar) {
        f.e eVar = fVar.f11803;
        fVar.setCancelable(eVar.f11873);
        fVar.setCanceledOnTouchOutside(eVar.f11895);
        if (eVar.f11834 == 0) {
            eVar.f11834 = y0.a.m12850(eVar.f11829, g.f11928, y0.a.m12849(fVar.getContext(), g.f11922));
        }
        if (eVar.f11834 != 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(eVar.f11829.getResources().getDimension(i.f11954));
            gradientDrawable.setColor(eVar.f11834);
            fVar.getWindow().setBackgroundDrawable(gradientDrawable);
        }
        if (!eVar.f11860) {
            eVar.f11908 = y0.a.m12846(eVar.f11829, g.f11944, eVar.f11908);
        }
        if (!eVar.f11861) {
            eVar.f11912 = y0.a.m12846(eVar.f11829, g.f11942, eVar.f11912);
        }
        if (!eVar.f11862) {
            eVar.f11910 = y0.a.m12846(eVar.f11829, g.f11952, eVar.f11910);
        }
        if (!eVar.f11863) {
            eVar.f11904 = y0.a.m12850(eVar.f11829, g.f11929, eVar.f11904);
        }
        if (!eVar.f11856) {
            eVar.f11882 = y0.a.m12850(eVar.f11829, g.f11925, y0.a.m12849(fVar.getContext(), R.attr.textColorPrimary));
        }
        if (!eVar.f11858) {
            eVar.f11884 = y0.a.m12850(eVar.f11829, g.f11937, y0.a.m12849(fVar.getContext(), R.attr.textColorSecondary));
        }
        if (!eVar.f11859) {
            eVar.f11835 = y0.a.m12850(eVar.f11829, g.f11947, eVar.f11884);
        }
        fVar.f11806 = (TextView) fVar.f11795.findViewById(k.f11982);
        fVar.f11805 = (ImageView) fVar.f11795.findViewById(k.f11977);
        fVar.f11810 = fVar.f11795.findViewById(k.f11983);
        fVar.f11807 = (TextView) fVar.f11795.findViewById(k.f11973);
        fVar.f11809 = (RecyclerView) fVar.f11795.findViewById(k.f11974);
        fVar.f11816 = (CheckBox) fVar.f11795.findViewById(k.f11980);
        fVar.f11817 = (MDButton) fVar.f11795.findViewById(k.f11972);
        fVar.f11818 = (MDButton) fVar.f11795.findViewById(k.f11971);
        fVar.f11819 = (MDButton) fVar.f11795.findViewById(k.f11970);
        fVar.f11817.setVisibility(eVar.f11890 != null ? 0 : 8);
        fVar.f11818.setVisibility(eVar.f11892 != null ? 0 : 8);
        fVar.f11819.setVisibility(eVar.f11894 != null ? 0 : 8);
        fVar.f11817.setFocusable(true);
        fVar.f11818.setFocusable(true);
        fVar.f11819.setFocusable(true);
        if (eVar.f11896) {
            fVar.f11817.requestFocus();
        }
        if (eVar.f11898) {
            fVar.f11818.requestFocus();
        }
        if (eVar.f11900) {
            fVar.f11819.requestFocus();
        }
        if (eVar.f11891 != null) {
            fVar.f11805.setVisibility(0);
            fVar.f11805.setImageDrawable(eVar.f11891);
        } else {
            Drawable m12853 = y0.a.m12853(eVar.f11829, g.f11943);
            if (m12853 != null) {
                fVar.f11805.setVisibility(0);
                fVar.f11805.setImageDrawable(m12853);
            } else {
                fVar.f11805.setVisibility(8);
            }
        }
        int i5 = eVar.f11893;
        if (i5 == -1) {
            i5 = y0.a.m12851(eVar.f11829, g.f11946);
        }
        if (eVar.f11905 || y0.a.m12847(eVar.f11829, g.f11945)) {
            i5 = eVar.f11829.getResources().getDimensionPixelSize(i.f11965);
        }
        if (i5 > -1) {
            fVar.f11805.setAdjustViewBounds(true);
            fVar.f11805.setMaxHeight(i5);
            fVar.f11805.setMaxWidth(i5);
            fVar.f11805.requestLayout();
        }
        if (!eVar.f11864) {
            eVar.f11833 = y0.a.m12850(eVar.f11829, g.f11941, y0.a.m12849(fVar.getContext(), g.f11940));
        }
        fVar.f11795.setDividerColor(eVar.f11833);
        TextView textView = fVar.f11806;
        if (textView != null) {
            fVar.m12480(textView, eVar.f11887);
            fVar.f11806.setTextColor(eVar.f11882);
            fVar.f11806.setGravity(eVar.f11870.m12462());
            fVar.f11806.setTextAlignment(eVar.f11870.m12463());
            CharSequence charSequence = eVar.f11855;
            if (charSequence == null) {
                fVar.f11810.setVisibility(8);
            } else {
                fVar.f11806.setText(charSequence);
                fVar.f11810.setVisibility(0);
            }
        }
        TextView textView2 = fVar.f11807;
        if (textView2 != null) {
            textView2.setMovementMethod(new LinkMovementMethod());
            fVar.m12480(fVar.f11807, eVar.f11889);
            fVar.f11807.setLineSpacing(0.0f, eVar.f11877);
            ColorStateList colorStateList = eVar.f11914;
            if (colorStateList == null) {
                fVar.f11807.setLinkTextColor(y0.a.m12849(fVar.getContext(), R.attr.textColorPrimary));
            } else {
                fVar.f11807.setLinkTextColor(colorStateList);
            }
            fVar.f11807.setTextColor(eVar.f11884);
            fVar.f11807.setGravity(eVar.f11872.m12462());
            fVar.f11807.setTextAlignment(eVar.f11872.m12463());
            CharSequence charSequence2 = eVar.f11886;
            if (charSequence2 != null) {
                fVar.f11807.setText(charSequence2);
                fVar.f11807.setVisibility(0);
            } else {
                fVar.f11807.setVisibility(8);
            }
        }
        CheckBox checkBox = fVar.f11816;
        if (checkBox != null) {
            checkBox.setText(eVar.f11849);
            fVar.f11816.setChecked(eVar.f11850);
            fVar.f11816.setOnCheckedChangeListener(eVar.f11851);
            fVar.m12480(fVar.f11816, eVar.f11889);
            fVar.f11816.setTextColor(eVar.f11884);
            x0.e.m12666(fVar.f11816, eVar.f11904);
        }
        fVar.f11795.setButtonGravity(eVar.f11878);
        fVar.f11795.setButtonStackedGravity(eVar.f11874);
        fVar.f11795.setStackingBehavior(eVar.f11831);
        boolean m12848 = y0.a.m12848(eVar.f11829, R.attr.textAllCaps, true);
        if (m12848) {
            m12848 = y0.a.m12848(eVar.f11829, g.f11927, true);
        }
        MDButton mDButton = fVar.f11817;
        fVar.m12480(mDButton, eVar.f11887);
        mDButton.setAllCapsCompat(m12848);
        mDButton.setText(eVar.f11890);
        mDButton.setTextColor(eVar.f11908);
        MDButton mDButton2 = fVar.f11817;
        b bVar = b.POSITIVE;
        mDButton2.setStackedSelector(fVar.m12469(bVar, true));
        fVar.f11817.setDefaultSelector(fVar.m12469(bVar, false));
        fVar.f11817.setTag(bVar);
        fVar.f11817.setOnClickListener(fVar);
        MDButton mDButton3 = fVar.f11819;
        fVar.m12480(mDButton3, eVar.f11887);
        mDButton3.setAllCapsCompat(m12848);
        mDButton3.setText(eVar.f11894);
        mDButton3.setTextColor(eVar.f11910);
        MDButton mDButton4 = fVar.f11819;
        b bVar2 = b.NEGATIVE;
        mDButton4.setStackedSelector(fVar.m12469(bVar2, true));
        fVar.f11819.setDefaultSelector(fVar.m12469(bVar2, false));
        fVar.f11819.setTag(bVar2);
        fVar.f11819.setOnClickListener(fVar);
        MDButton mDButton5 = fVar.f11818;
        fVar.m12480(mDButton5, eVar.f11887);
        mDButton5.setAllCapsCompat(m12848);
        mDButton5.setText(eVar.f11892);
        mDButton5.setTextColor(eVar.f11912);
        MDButton mDButton6 = fVar.f11818;
        b bVar3 = b.NEUTRAL;
        mDButton6.setStackedSelector(fVar.m12469(bVar3, true));
        fVar.f11818.setDefaultSelector(fVar.m12469(bVar3, false));
        fVar.f11818.setTag(bVar3);
        fVar.f11818.setOnClickListener(fVar);
        if (fVar.f11809 != null) {
            Object obj = eVar.f11903;
            if (obj == null) {
                f.g gVar = f.g.REGULAR;
                fVar.f11820 = gVar;
                eVar.f11903 = new a(fVar, f.g.m12500(gVar));
            } else if (obj instanceof x0.a) {
                ((x0.a) obj).m12660(fVar);
            }
        }
        m12461(fVar);
        m12460(fVar);
        if (eVar.f11902 != null) {
            ((MDRootLayout) fVar.f11795.findViewById(k.f11981)).m6006();
            FrameLayout frameLayout = (FrameLayout) fVar.f11795.findViewById(k.f11976);
            fVar.f11811 = frameLayout;
            View view = eVar.f11902;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (eVar.f11832) {
                Resources resources = fVar.getContext().getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(i.f11960);
                ScrollView scrollView = new ScrollView(fVar.getContext());
                int dimensionPixelSize2 = resources.getDimensionPixelSize(i.f11959);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(i.f11958);
                scrollView.setClipToPadding(false);
                if (view instanceof EditText) {
                    scrollView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3);
                } else {
                    scrollView.setPadding(0, dimensionPixelSize2, 0, dimensionPixelSize3);
                    view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                scrollView.addView(view, new FrameLayout.LayoutParams(-1, -2));
                view = scrollView;
            }
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
        }
        DialogInterface.OnShowListener onShowListener = eVar.f11913;
        if (onShowListener != null) {
            fVar.setOnShowListener(onShowListener);
        }
        DialogInterface.OnCancelListener onCancelListener = eVar.f11911;
        if (onCancelListener != null) {
            fVar.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnDismissListener onDismissListener = eVar.f11909;
        if (onDismissListener != null) {
            fVar.setOnDismissListener(onDismissListener);
        }
        DialogInterface.OnKeyListener onKeyListener = eVar.f11897;
        if (onKeyListener != null) {
            fVar.setOnKeyListener(onKeyListener);
        }
        fVar.m12454();
        fVar.m12476();
        fVar.m12455(fVar.f11795);
        fVar.m12466();
        Display defaultDisplay = fVar.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i6 = point.x;
        int i7 = point.y;
        int dimensionPixelSize4 = eVar.f11829.getResources().getDimensionPixelSize(i.f11963);
        int dimensionPixelSize5 = eVar.f11829.getResources().getDimensionPixelSize(i.f11961);
        fVar.f11795.setMaxHeight(i7 - (dimensionPixelSize4 * 2));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(fVar.getWindow().getAttributes());
        layoutParams.width = Math.min(eVar.f11829.getResources().getDimensionPixelSize(i.f11962), i6 - (dimensionPixelSize5 * 2));
        fVar.getWindow().setAttributes(layoutParams);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static void m12460(f fVar) {
        f.e eVar = fVar.f11803;
        EditText editText = (EditText) fVar.f11795.findViewById(R.id.input);
        fVar.f11808 = editText;
        if (editText == null) {
            return;
        }
        fVar.m12480(editText, eVar.f11889);
        CharSequence charSequence = eVar.f11840;
        if (charSequence != null) {
            fVar.f11808.setText(charSequence);
        }
        fVar.m12477();
        fVar.f11808.setHint(eVar.f11841);
        fVar.f11808.setSingleLine();
        fVar.f11808.setTextColor(eVar.f11884);
        fVar.f11808.setHintTextColor(y0.a.m12838(eVar.f11884, 0.3f));
        x0.e.m12668(fVar.f11808, fVar.f11803.f11904);
        int i5 = eVar.f11843;
        if (i5 != -1) {
            fVar.f11808.setInputType(i5);
            int i6 = eVar.f11843;
            if (i6 != 144 && (i6 & 128) == 128) {
                fVar.f11808.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        TextView textView = (TextView) fVar.f11795.findViewById(k.f11979);
        fVar.f11815 = textView;
        if (eVar.f11845 > 0 || eVar.f11846 > -1) {
            fVar.m12475(fVar.f11808.getText().toString().length(), !eVar.f11842);
        } else {
            textView.setVisibility(8);
            fVar.f11815 = null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static void m12461(f fVar) {
        f.e eVar = fVar.f11803;
        if (eVar.f11836 || eVar.f11838 > -2) {
            ProgressBar progressBar = (ProgressBar) fVar.f11795.findViewById(R.id.progress);
            fVar.f11812 = progressBar;
            if (progressBar == null) {
                return;
            }
            if (!eVar.f11836) {
                HorizontalProgressDrawable horizontalProgressDrawable = new HorizontalProgressDrawable(eVar.m12487());
                horizontalProgressDrawable.setTint(eVar.f11904);
                fVar.f11812.setProgressDrawable(horizontalProgressDrawable);
                fVar.f11812.setIndeterminateDrawable(horizontalProgressDrawable);
            } else if (eVar.f11854) {
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = new IndeterminateHorizontalProgressDrawable(eVar.m12487());
                indeterminateHorizontalProgressDrawable.setTint(eVar.f11904);
                fVar.f11812.setProgressDrawable(indeterminateHorizontalProgressDrawable);
                fVar.f11812.setIndeterminateDrawable(indeterminateHorizontalProgressDrawable);
            } else {
                IndeterminateCircularProgressDrawable indeterminateCircularProgressDrawable = new IndeterminateCircularProgressDrawable(eVar.m12487());
                indeterminateCircularProgressDrawable.setTint(eVar.f11904);
                fVar.f11812.setProgressDrawable(indeterminateCircularProgressDrawable);
                fVar.f11812.setIndeterminateDrawable(indeterminateCircularProgressDrawable);
            }
            boolean z5 = eVar.f11836;
            if (!z5 || eVar.f11854) {
                fVar.f11812.setIndeterminate(z5 && eVar.f11854);
                fVar.f11812.setProgress(0);
                fVar.f11812.setMax(eVar.f11839);
                TextView textView = (TextView) fVar.f11795.findViewById(k.f11978);
                fVar.f11813 = textView;
                if (textView != null) {
                    textView.setTextColor(eVar.f11884);
                    fVar.m12480(fVar.f11813, eVar.f11887);
                    fVar.f11813.setText(eVar.f11853.format(0L));
                }
                TextView textView2 = (TextView) fVar.f11795.findViewById(k.f11979);
                fVar.f11814 = textView2;
                if (textView2 != null) {
                    textView2.setTextColor(eVar.f11884);
                    fVar.m12480(fVar.f11814, eVar.f11889);
                    if (eVar.f11837) {
                        fVar.f11814.setVisibility(0);
                        fVar.f11814.setText(String.format(eVar.f11852, 0, Integer.valueOf(eVar.f11839)));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fVar.f11812.getLayoutParams();
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = 0;
                    } else {
                        fVar.f11814.setVisibility(8);
                    }
                } else {
                    eVar.f11837 = false;
                }
            }
        }
        ProgressBar progressBar2 = fVar.f11812;
        if (progressBar2 != null) {
            m12456(progressBar2);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m12456(ProgressBar progressBar) {
    }
}
