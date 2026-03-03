package f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: EmojiTextViewHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final b f7653;

    /* compiled from: EmojiTextViewHelper.java */
    private static class a extends b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final TextView f7654;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final d f7655;

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f7656 = true;

        a(TextView textView) {
            this.f7654 = textView;
            this.f7655 = new d(textView);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private InputFilter[] m8496(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f7655) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f7655;
            return inputFilterArr2;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private SparseArray<InputFilter> m8497(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i5 = 0; i5 < inputFilterArr.length; i5++) {
                InputFilter inputFilter = inputFilterArr[i5];
                if (inputFilter instanceof d) {
                    sparseArray.put(i5, inputFilter);
                }
            }
            return sparseArray;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private InputFilter[] m8498(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m8497 = m8497(inputFilterArr);
            if (m8497.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m8497.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (m8497.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private TransformationMethod m8499(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).m8515() : transformationMethod;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private void m8500() {
            this.f7654.setFilters(mo8502(this.f7654.getFilters()));
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private TransformationMethod m8501(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }

        @Override // f0.f.b
        /* renamed from: ʻ, reason: contains not printable characters */
        InputFilter[] mo8502(InputFilter[] inputFilterArr) {
            return !this.f7656 ? m8498(inputFilterArr) : m8496(inputFilterArr);
        }

        @Override // f0.f.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean mo8503() {
            return this.f7656;
        }

        @Override // f0.f.b
        /* renamed from: ʽ, reason: contains not printable characters */
        void mo8504(boolean z5) {
            if (z5) {
                m8508();
            }
        }

        @Override // f0.f.b
        /* renamed from: ʾ, reason: contains not printable characters */
        void mo8505(boolean z5) {
            this.f7656 = z5;
            m8508();
            m8500();
        }

        @Override // f0.f.b
        /* renamed from: ʿ, reason: contains not printable characters */
        TransformationMethod mo8506(TransformationMethod transformationMethod) {
            return this.f7656 ? m8501(transformationMethod) : m8499(transformationMethod);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        void m8507(boolean z5) {
            this.f7656 = z5;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m8508() {
            this.f7654.setTransformationMethod(mo8506(this.f7654.getTransformationMethod()));
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    static class b {
        b() {
        }

        /* renamed from: ʻ */
        InputFilter[] mo8502(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: ʼ */
        public boolean mo8503() {
            throw null;
        }

        /* renamed from: ʽ */
        void mo8504(boolean z5) {
            throw null;
        }

        /* renamed from: ʾ */
        void mo8505(boolean z5) {
            throw null;
        }

        /* renamed from: ʿ */
        TransformationMethod mo8506(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* compiled from: EmojiTextViewHelper.java */
    private static class c extends b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final a f7657;

        c(TextView textView) {
            this.f7657 = new a(textView);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m8509() {
            return !androidx.emoji2.text.e.m3785();
        }

        @Override // f0.f.b
        /* renamed from: ʻ */
        InputFilter[] mo8502(InputFilter[] inputFilterArr) {
            return m8509() ? inputFilterArr : this.f7657.mo8502(inputFilterArr);
        }

        @Override // f0.f.b
        /* renamed from: ʼ */
        public boolean mo8503() {
            return this.f7657.mo8503();
        }

        @Override // f0.f.b
        /* renamed from: ʽ */
        void mo8504(boolean z5) {
            if (m8509()) {
                return;
            }
            this.f7657.mo8504(z5);
        }

        @Override // f0.f.b
        /* renamed from: ʾ */
        void mo8505(boolean z5) {
            if (m8509()) {
                this.f7657.m8507(z5);
            } else {
                this.f7657.mo8505(z5);
            }
        }

        @Override // f0.f.b
        /* renamed from: ʿ */
        TransformationMethod mo8506(TransformationMethod transformationMethod) {
            return m8509() ? transformationMethod : this.f7657.mo8506(transformationMethod);
        }
    }

    public f(TextView textView, boolean z5) {
        androidx.core.util.h.m2584(textView, "textView cannot be null");
        if (z5) {
            this.f7653 = new a(textView);
        } else {
            this.f7653 = new c(textView);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public InputFilter[] m8491(InputFilter[] inputFilterArr) {
        return this.f7653.mo8502(inputFilterArr);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m8492() {
        return this.f7653.mo8503();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m8493(boolean z5) {
        this.f7653.mo8504(z5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8494(boolean z5) {
        this.f7653.mo8505(z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public TransformationMethod m8495(TransformationMethod transformationMethod) {
        return this.f7653.mo8506(transformationMethod);
    }
}
