package h3;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.lang.reflect.Field;

/* compiled from: LTOptions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q1 {
    public String url = null;
    public int showTitle = -1;
    public String titleColor = null;
    public String titleText = null;
    public String titleTextColor = null;
    public int fullScreen = -1;
    public String statusBarColor = null;
    public int statusBarBlackText = -1;
    public int screenOrientation = -1;
    public int refresh = -1;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static q1 m9031(String str) {
        return (q1) new Gson().fromJson(str, q1.class);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static q1 m9032(String str) {
        q1 q1Var = null;
        if (!TextUtils.isEmpty(str) && str.contains("xapp-")) {
            Uri parse = Uri.parse(str);
            for (Field field : q1.class.getFields()) {
                String queryParameter = parse.getQueryParameter("xapp-" + field.getName());
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (q1Var == null) {
                        q1Var = new q1();
                    }
                    try {
                        if (field.getType() == String.class) {
                            field.set(q1Var, queryParameter);
                        } else if (field.getType() == Integer.TYPE) {
                            field.setInt(q1Var, "true".equals(queryParameter) ? 1 : "false".equals(queryParameter) ? 0 : Integer.parseInt(queryParameter));
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        return q1Var;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public String m9033() {
        return new Gson().toJson(this);
    }
}
