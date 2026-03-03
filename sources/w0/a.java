package w0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import w0.f;

/* compiled from: DefaultRvAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a extends RecyclerView.h<b> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final f f11783;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f11784;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final e f11785;

    /* renamed from: ˈ, reason: contains not printable characters */
    private c f11786;

    /* compiled from: DefaultRvAdapter.java */
    /* renamed from: w0.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0169a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f11787;

        static {
            int[] iArr = new int[f.g.values().length];
            f11787 = iArr;
            try {
                iArr[f.g.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11787[f.g.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: DefaultRvAdapter.java */
    static class b extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final CompoundButton f11788;

        /* renamed from: ʿ, reason: contains not printable characters */
        final TextView f11789;

        /* renamed from: ˆ, reason: contains not printable characters */
        final a f11790;

        b(View view, a aVar) {
            super(view);
            this.f11788 = (CompoundButton) view.findViewById(k.f11975);
            this.f11789 = (TextView) view.findViewById(k.f11982);
            this.f11790 = aVar;
            view.setOnClickListener(this);
            aVar.f11783.f11803.getClass();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f11790.f11786 == null || getAdapterPosition() == -1) {
                return;
            }
            this.f11790.f11786.mo12453(this.f11790.f11783, view, getAdapterPosition(), (this.f11790.f11783.f11803.f11888 == null || getAdapterPosition() >= this.f11790.f11783.f11803.f11888.size()) ? null : this.f11790.f11783.f11803.f11888.get(getAdapterPosition()), false);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.f11790.f11786 == null || getAdapterPosition() == -1) {
                return false;
            }
            return this.f11790.f11786.mo12453(this.f11790.f11783, view, getAdapterPosition(), (this.f11790.f11783.f11803.f11888 == null || getAdapterPosition() >= this.f11790.f11783.f11803.f11888.size()) ? null : this.f11790.f11783.f11803.f11888.get(getAdapterPosition()), true);
        }
    }

    /* compiled from: DefaultRvAdapter.java */
    interface c {
        /* renamed from: ʻ, reason: contains not printable characters */
        boolean mo12453(f fVar, View view, int i5, CharSequence charSequence, boolean z5);
    }

    a(f fVar, int i5) {
        this.f11783 = fVar;
        this.f11784 = i5;
        this.f11785 = fVar.f11803.f11876;
    }

    @TargetApi(17)
    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m12446(ViewGroup viewGroup) {
        ((LinearLayout) viewGroup).setGravity(this.f11785.m12462() | 16);
        if (viewGroup.getChildCount() == 2) {
            if (this.f11785 == e.END && !m12449() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
                View view = (CompoundButton) viewGroup.getChildAt(0);
                viewGroup.removeView(view);
                TextView textView = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView);
                textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
                viewGroup.addView(textView);
                viewGroup.addView(view);
                return;
            }
            if (this.f11785 == e.START && m12449() && (viewGroup.getChildAt(1) instanceof CompoundButton)) {
                View view2 = (CompoundButton) viewGroup.getChildAt(1);
                viewGroup.removeView(view2);
                TextView textView2 = (TextView) viewGroup.getChildAt(0);
                viewGroup.removeView(textView2);
                textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                viewGroup.addView(view2);
                viewGroup.addView(textView2);
            }
        }
    }

    @TargetApi(17)
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean m12449() {
        return this.f11783.m12468().m12487().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m12450(c cVar) {
        this.f11786 = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ʿ */
    public int mo4807() {
        ArrayList<CharSequence> arrayList = this.f11783.f11803.f11888;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ᐧᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo4815(b bVar, int i5) {
        View view = bVar.itemView;
        boolean m12845 = y0.a.m12845(Integer.valueOf(i5), this.f11783.f11803.f11885);
        int m12838 = m12845 ? y0.a.m12838(this.f11783.f11803.f11835, 0.4f) : this.f11783.f11803.f11835;
        bVar.itemView.setEnabled(!m12845);
        int i6 = C0169a.f11787[this.f11783.f11820.ordinal()];
        if (i6 == 1) {
            RadioButton radioButton = (RadioButton) bVar.f11788;
            f.e eVar = this.f11783.f11803;
            boolean z5 = eVar.f11881 == i5;
            ColorStateList colorStateList = eVar.f11906;
            if (colorStateList != null) {
                x0.e.m12670(radioButton, colorStateList);
            } else {
                x0.e.m12669(radioButton, eVar.f11904);
            }
            radioButton.setChecked(z5);
            radioButton.setEnabled(!m12845);
        } else if (i6 == 2) {
            CheckBox checkBox = (CheckBox) bVar.f11788;
            boolean contains = this.f11783.f11821.contains(Integer.valueOf(i5));
            f.e eVar2 = this.f11783.f11803;
            ColorStateList colorStateList2 = eVar2.f11906;
            if (colorStateList2 != null) {
                x0.e.m12667(checkBox, colorStateList2);
            } else {
                x0.e.m12666(checkBox, eVar2.f11904);
            }
            checkBox.setChecked(contains);
            checkBox.setEnabled(!m12845);
        }
        bVar.f11789.setText(this.f11783.f11803.f11888.get(i5));
        bVar.f11789.setTextColor(m12838);
        f fVar = this.f11783;
        fVar.m12480(bVar.f11789, fVar.f11803.f11889);
        ViewGroup viewGroup = (ViewGroup) view;
        m12446(viewGroup);
        int[] iArr = this.f11783.f11803.f11848;
        if (iArr != null) {
            if (i5 < iArr.length) {
                view.setId(iArr[i5]);
            } else {
                view.setId(-1);
            }
        }
        if (Build.VERSION.SDK_INT < 21 || viewGroup.getChildCount() != 2) {
            return;
        }
        if (viewGroup.getChildAt(0) instanceof CompoundButton) {
            viewGroup.getChildAt(0).setBackground(null);
        } else if (viewGroup.getChildAt(1) instanceof CompoundButton) {
            viewGroup.getChildAt(1).setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ᴵᴵ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public b mo4817(ViewGroup viewGroup, int i5) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f11784, viewGroup, false);
        y0.a.m12857(inflate, this.f11783.m12472());
        return new b(inflate, this);
    }
}
