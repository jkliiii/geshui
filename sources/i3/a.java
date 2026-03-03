package i3;

import com.lt.plugin.IPluginModel;
import java.util.List;
import java.util.Map;

/* compiled from: BottomSheetModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements IPluginModel {
    public String action;
    public Boolean cancelable;
    public Boolean canceledOnTouchOutside;
    public Map<String, Object> data;
    public Float dim;
    public Integer index;
    public Float maxHeight;
    public Float peekHeight;
    public b roundCorner;
    public c titleBar;
    public String url;

    /* compiled from: BottomSheetModel.java */
    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public static class C0118a implements IPluginModel {
        public String icon;
        public String name;
        public String text;
    }

    /* compiled from: BottomSheetModel.java */
    public static class b implements IPluginModel {
        public float topLeftX;
        public float topLeftY;
        public float topRightX;
        public float topRightY;
    }

    /* compiled from: BottomSheetModel.java */
    public static class c implements IPluginModel {
        public String backgroundColor;
        public float height;
        public List<C0118a> leftButtons;
        public List<C0118a> rightButtons;
        public String title;
        public boolean visible;
    }
}
