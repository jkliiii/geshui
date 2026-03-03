package k3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.lt.app.App;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import java.util.ArrayList;
import java.util.List;
import x2.l;

/* compiled from: GuideFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends androidx.fragment.app.e {

    /* renamed from: ʾ, reason: contains not printable characters */
    View.OnClickListener f8867 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f8868 = false;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static b m9518(boolean z5) {
        b bVar = new b();
        bVar.f8868 = z5;
        return bVar;
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131427379, viewGroup, false);
        App.m7828(new a(inflate));
        return inflate;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m9519(View.OnClickListener onClickListener) {
        this.f8867 = onClickListener;
    }

    /* compiled from: GuideFragment.java */
    class a implements App.e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f8869;

        /* compiled from: GuideFragment.java */
        /* renamed from: k3.b$a$a, reason: collision with other inner class name */
        class C0127a extends androidx.viewpager.widget.a {

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ l3.a f8871;

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ List f8872;

            C0127a(l3.a aVar, List list) {
                this.f8871 = aVar;
                this.f8872 = list;
            }

            @Override // androidx.viewpager.widget.a
            /* renamed from: ʻ */
            public void mo5602(ViewGroup viewGroup, int i5, Object obj) {
                viewGroup.removeView((View) this.f8872.get(i5));
            }

            @Override // androidx.viewpager.widget.a
            /* renamed from: ʾ */
            public int mo5605() {
                return this.f8871.guide.imgs.size();
            }

            @Override // androidx.viewpager.widget.a
            /* renamed from: ˉ */
            public Object mo5609(ViewGroup viewGroup, int i5) {
                View view = (View) this.f8872.get(i5);
                viewGroup.addView(view);
                return view;
            }

            @Override // androidx.viewpager.widget.a
            /* renamed from: ˊ */
            public boolean mo5610(View view, Object obj) {
                return view == obj;
            }
        }

        a(View view) {
            this.f8869 = view;
        }

        @Override // com.lt.app.App.e
        /* renamed from: ʻ */
        public void mo7860(l3.a aVar) {
            l3.e eVar;
            List<String> list;
            if (aVar == null || (eVar = aVar.guide) == null || (list = eVar.imgs) == null || list.size() < 2) {
                View.OnClickListener onClickListener = b.this.f8867;
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(aVar.guide.imgs.size());
            LayoutInflater from = LayoutInflater.from(b.this.getActivity());
            for (String str : aVar.guide.imgs) {
                View inflate = from.inflate(2131427381, (ViewGroup) null, false);
                l.m12714(b.this.getActivity()).mo187(str).mo186((ImageView) inflate.findViewById(2131230973));
                arrayList.add(inflate);
            }
            if (b.this.f8868) {
                ImageView imageView = (ImageView) ((View) arrayList.get(arrayList.size() - 1)).findViewById(2131230839);
                imageView.setVisibility(0);
                View.OnClickListener onClickListener2 = b.this.f8867;
                if (onClickListener2 != null) {
                    imageView.setOnClickListener(onClickListener2);
                }
            }
            ViewPager viewPager = (ViewPager) this.f8869.findViewById(2131231293);
            viewPager.setAdapter(new C0127a(aVar, arrayList));
            SmartTabLayout smartTabLayout = (SmartTabLayout) this.f8869.findViewById(2131231294);
            smartTabLayout.setViewPager(viewPager);
            smartTabLayout.setOnPageChangeListener(new C0128b(arrayList));
            App.m7835().m7841().edit().putInt("k_guide_ver", aVar.guide.verCode).apply();
        }

        /* compiled from: GuideFragment.java */
        /* renamed from: k3.b$a$b, reason: collision with other inner class name */
        class C0128b implements ViewPager.j {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ List f8874;

            C0128b(List list) {
                this.f8874 = list;
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void onPageSelected(int i5) {
                if (b.this.f8868 && i5 == this.f8874.size() - 1) {
                    View findViewById = ((View) this.f8874.get(i5)).findViewById(2131230839);
                    findViewById.clearAnimation();
                    findViewById.startAnimation(AnimationUtils.loadAnimation(b.this.getContext(), 2130771980));
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void onPageScrollStateChanged(int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.j
            public void onPageScrolled(int i5, float f5, int i6) {
            }
        }
    }
}
