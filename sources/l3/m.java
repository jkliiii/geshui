package l3;

import android.text.TextUtils;
import com.lt.plugin.IPluginModel;
import g3.a0;

/* compiled from: PresentNavigationBarModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m implements IPluginModel {
    public String backgroundColor;
    public boolean hidden;
    public boolean hiddenHomeButton;
    public boolean hiddenTitle;
    public boolean lightFontColor;
    public String title;

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m9742() {
        if (TextUtils.isEmpty(this.backgroundColor)) {
            return -1;
        }
        return a0.m8711(this.backgroundColor, -1);
    }
}
