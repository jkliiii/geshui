package l3;

import com.lt.plugin.IPluginModel;

/* compiled from: PresentModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l implements IPluginModel {
    public boolean multipleWindow;
    public m navigationBar;
    public n page;
    public o statusBar;
    public String url;

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9740() {
        if (this.statusBar == null) {
            this.statusBar = new o();
        }
        if (this.navigationBar == null) {
            this.navigationBar = new m();
        }
        if (this.page == null) {
            this.page = new n();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m9741() {
        m9740();
        o oVar = this.statusBar;
        return !oVar.hidden && oVar.translucent;
    }
}
