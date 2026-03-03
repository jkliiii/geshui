package i3;

import com.lt.plugin.IPluginModel;
import java.util.List;
import java.util.Map;

/* compiled from: RichDialogModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements IPluginModel {
    public String action;
    public List<a> areas;
    public String background;
    public Boolean cancelable;
    public Boolean canceledOnTouchOutside;
    public Map<String, Object> data;
    public Float dim;
    public Float height;
    public Integer index;
    public Float width;

    /* compiled from: RichDialogModel.java */
    public static class a implements IPluginModel {
        public int height;
        public int left;
        public String name;

        /* renamed from: top, reason: collision with root package name */
        public int f12855top;
        public String url;
        public int width;
    }
}
