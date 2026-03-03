package m3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: E:\78999\cookie_5123796.dex */
public final /* synthetic */ class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static /* synthetic */ String m9914(CharSequence charSequence, CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new NullPointerException("delimiter");
        }
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i5 = 1; i5 < charSequenceArr.length; i5++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i5]);
            }
        }
        return sb.toString();
    }
}
