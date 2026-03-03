package l3;

import android.text.TextUtils;
import com.lt.plugin.IPluginModel;

/* compiled from: ScanModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t implements IPluginModel {
    public a embed;
    public String imageUrl;
    public boolean needResult;

    /* compiled from: ScanModel.java */
    public static class a implements IPluginModel {
        public String action;
        public int height;
        public String position;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m9743() {
        a aVar;
        return this.needResult && (aVar = this.embed) != null && TextUtils.isEmpty(aVar.action) && this.embed.height > 0;
    }
}
