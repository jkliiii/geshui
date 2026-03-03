package h3;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: x.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v2 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m9081(byte[] bArr, String str) {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(w2.m9082());
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(g3.a0.m8707(g3.a0.m8707(str)).getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArr));
        } catch (Exception e5) {
            e5.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }
}
