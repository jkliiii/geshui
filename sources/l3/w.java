package l3;

import android.webkit.URLUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: UrlReplaceRuleItem.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class w {

    /* renamed from: r, reason: collision with root package name */
    private Pattern f12871r;

    /* renamed from: s, reason: collision with root package name */
    public String f12872s;

    /* renamed from: t, reason: collision with root package name */
    public String f12873t;

    /* renamed from: ʻ, reason: contains not printable characters */
    public String m9744(String str) {
        String substring;
        if (URLUtil.isHttpsUrl(str)) {
            substring = str.substring(8);
        } else {
            if (!URLUtil.isHttpUrl(str)) {
                return null;
            }
            substring = str.substring(7);
        }
        if (this.f12871r == null) {
            this.f12871r = Pattern.compile(this.f12872s);
        }
        Matcher matcher = this.f12871r.matcher(substring);
        if (!matcher.find()) {
            return null;
        }
        String str2 = this.f12873t;
        int groupCount = matcher.groupCount() + 1;
        for (int i5 = 0; i5 < groupCount; i5++) {
            String group = matcher.group(i5);
            String str3 = "{R:" + i5 + "}";
            if (group == null) {
                group = BuildConfig.FLAVOR;
            }
            str2 = str2.replace(str3, group);
        }
        return "fs://www/" + str2;
    }
}
