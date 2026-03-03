package n3;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.lt.plugin.IAudioPlayer;
import com.lt.plugin.IAudioRecorder;
import com.lt.plugin.IBh;
import com.lt.plugin.IBle;
import com.lt.plugin.IGdtAction;
import com.lt.plugin.IPluginApplicationInit;
import com.lt.plugin.IPluginInit;
import com.lt.plugin.IPluginWebView;
import com.lt.plugin.IScan;
import com.lt.plugin.ITTStat;
import com.lt.plugin.IUApp;
import com.lt.plugin.IWx;
import com.lt.plugin.PluginApplicationInit;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONObject;

/* compiled from: Plugin.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f9692 = 11100;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static a2 f9696;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static List<Runnable> f9697;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final HashMap<String, Object> f9693 = new HashMap<>(8);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static d0<Integer, Boolean> f9694 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static d0<String, String> f9695 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean f9698 = false;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static IBle m10581() {
        return (IBle) m10607("Ble");
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static j0 m10582() {
        return (j0) m10607("Emulator");
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static j0 m10583() {
        return (j0) m10607("Ewg");
    }

    /* JADX WARN: Removed duplicated region for block: B:443:0x1731  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1735 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ʻʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10584(java.lang.String r26, final org.json.JSONObject r27, final n3.d r28, final n3.s0 r29, n3.d0<java.lang.Integer, java.lang.Boolean> r30) {
        /*
            Method dump skipped, instructions count: 6874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a1.m10584(java.lang.String, org.json.JSONObject, n3.d, n3.s0, n3.d0):void");
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private static IPluginApplicationInit m10585() {
        return (IPluginApplicationInit) m10607("FbEvent");
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private static j0 m10586() {
        return (j0) m10607("FbLogin");
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private static j0 m10587() {
        return (j0) m10607("FbShare");
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private static j0 m10588() {
        return (j0) m10607("FirebaseAuth");
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private static j0 m10589() {
        return (j0) m10607("Floater");
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private static IPluginApplicationInit m10590() {
        return (IPluginApplicationInit) m10607("Flyer");
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public static j0 m10591() {
        return (j0) m10607("Fm");
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private static IPluginApplicationInit m10592() {
        return (IPluginApplicationInit) m10607("Fn");
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public static void m10593() {
        f9694 = null;
        f9695 = null;
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    private static IPluginApplicationInit m10594() {
        return (IPluginApplicationInit) m10607("Freight");
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    private static IPluginApplicationInit m10595() {
        return (IPluginApplicationInit) m10607("FreightLocate");
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public static j0 m10596() {
        return (j0) m10607("Fs");
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    private static IPluginApplicationInit m10597() {
        return (IPluginApplicationInit) m10607("Fusion");
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    private static IPluginApplicationInit m10598() {
        return (IPluginApplicationInit) m10607("Gad");
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public static IPluginApplicationInit m10599() {
        return (IPluginApplicationInit) m10607("Game321");
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    private static IPluginApplicationInit m10600() {
        return (IPluginApplicationInit) m10607("Gdt");
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    public static IGdtAction m10601() {
        return (IGdtAction) m10607("GdtAction");
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    public static String m10602(Context context, String str) {
        String m10604 = m10604(context, str);
        TextUtils.isEmpty(m10604);
        return m10604;
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static String m10603(Context context, String str) {
        return m10727(context, true, "6148523063484D364C79396E4C6E6C7062575675633256764C6D4E754C773D3D", str);
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public static String m10604(Context context, String str) {
        return m10727(context, false, BuildConfig.FLAVOR, str);
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    private static synchronized <T> T m10605(String str) {
        T t5;
        synchronized (a1.class) {
            HashMap<String, Object> hashMap = f9693;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, m10642(str));
            }
            t5 = (T) hashMap.get(str);
        }
        return t5;
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    private static <T> T m10607(String str) {
        return (T) m10605("com.lt.plugin." + str.toLowerCase() + "." + str);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static IPluginApplicationInit m10608() {
        return (IPluginApplicationInit) m10607("BmGame");
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static j0 m10609() {
        return (j0) m10607("Gid");
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static IPluginApplicationInit m10610() {
        return (IPluginApplicationInit) m10607("GtPush");
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private static j0 m10611() {
        return (j0) m10607("Gtm");
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    private static IPluginApplicationInit m10612() {
        return (IPluginApplicationInit) m10607("Hj");
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    private static j0 m10613() {
        return (j0) m10607("Hkc");
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    public static IPluginApplicationInit m10614() {
        return (IPluginApplicationInit) m10607("Ht");
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    private static IPluginApplicationInit m10615() {
        return (IPluginApplicationInit) m10607("Hx");
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    private static IPluginApplicationInit m10616() {
        return (IPluginApplicationInit) m10607("Hy");
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    private static IPluginInit m10617() {
        return (IPluginInit) m10607("HyAd");
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    private static j0 m10618() {
        return (j0) m10605("com.lt.plugin.icbc.IcbcPay");
    }

    /* renamed from: ʼˑ, reason: contains not printable characters */
    public static void m10619(final Context context, boolean z5, final d0<Integer, Boolean> d0Var, final f<Boolean> fVar) {
        v m10710;
        if (m10620(context) || (m10710 = m10710()) == null) {
            if (fVar != null) {
                fVar.mo8742(Boolean.TRUE);
            }
            m10625(context, true, d0Var);
        } else if (z5) {
            m10710.m10852(context, new f() { // from class: n3.z0
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    a1.m10633(fVar, context, d0Var, (Boolean) obj);
                }
            });
        }
    }

    /* renamed from: ʼי, reason: contains not printable characters */
    public static boolean m10620(Context context) {
        if (m10710() == null) {
            return true;
        }
        return context.getSharedPreferences("LT-APP", 0).getBoolean("agree", false);
    }

    /* renamed from: ʼـ, reason: contains not printable characters */
    public static boolean m10621(d dVar, d0<Integer, Boolean> d0Var, c0<Integer, Integer, Boolean> c0Var) {
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        m0 m0Var4;
        m0 m0Var5;
        m0 m0Var6;
        m0 m0Var7;
        m0 m0Var8;
        m0 m0Var9;
        m0 m0Var10;
        m0 m0Var11;
        m0 m0Var12;
        IBh m10739;
        m0 m0Var13;
        m0 m0Var14;
        m0 m0Var15;
        m0 m0Var16;
        m0 m10674;
        if (d0Var.mo8739(171).booleanValue() && (m10674 = m10674()) != null && m10674.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(90).booleanValue() && c0Var != null && c0Var.mo8749(-1, 37).booleanValue() && (m0Var16 = (m0) m10680()) != null && m0Var16.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(176).booleanValue() && (m0Var15 = (m0) m10683()) != null && m0Var15.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(126).booleanValue() && c0Var != null && c0Var.mo8749(-1, 40).booleanValue() && (m0Var14 = (m0) m10600()) != null && m0Var14.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(95).booleanValue() && c0Var != null && c0Var.mo8749(-1, 38).booleanValue() && (m0Var13 = (m0) m10615()) != null && m0Var13.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(108).booleanValue() && (m10739 = m10739()) != null && m10739.m8022(dVar)) {
            return true;
        }
        if ((d0Var.mo8739(112).booleanValue() || d0Var.mo8739(146).booleanValue()) && (m0Var = (m0) m10635()) != null && m0Var.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(124).booleanValue() && c0Var != null && c0Var.mo8749(-1, 39).booleanValue() && (m0Var12 = (m0) m10597()) != null && m0Var12.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(127).booleanValue() && (m0Var11 = (m0) m10677()) != null && m0Var11.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(136).booleanValue() && (m0Var10 = (m0) m10713()) != null && m0Var10.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(161).booleanValue() && (m0Var9 = (m0) m10653()) != null && m0Var9.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(165).booleanValue() && (m0Var8 = (m0) m10630()) != null && m0Var8.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(173).booleanValue() && (m0Var7 = (m0) m10691()) != null && m0Var7.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(178).booleanValue() && (m0Var6 = (m0) m10592()) != null && m0Var6.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(190).booleanValue() && (m0Var5 = (m0) m10616()) != null && m0Var5.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(203).booleanValue() && (m0Var4 = (m0) m10676()) != null && m0Var4.m10806(dVar)) {
            return true;
        }
        if (d0Var.mo8739(204).booleanValue() && (m0Var3 = (m0) m10612()) != null && m0Var3.m10806(dVar)) {
            return true;
        }
        return d0Var.mo8739(225).booleanValue() && (m0Var2 = (m0) m10598()) != null && m0Var2.m10806(dVar);
    }

    /* renamed from: ʼٴ, reason: contains not printable characters */
    public static e0 m10622() {
        return (e0) m10605("com.lt.plugin.imei.Imei");
    }

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    private static j0 m10623() {
        return (j0) m10607("Imei2");
    }

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    public static boolean m10624(int i5) {
        d0<Integer, Boolean> d0Var = f9694;
        return d0Var != null && d0Var.mo8739(Integer.valueOf(i5)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x0528 A[Catch: all -> 0x052d, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:10:0x000b, B:12:0x000f, B:14:0x0015, B:15:0x001b, B:17:0x0021, B:19:0x002b, B:22:0x0037, B:24:0x003f, B:26:0x0057, B:28:0x005d, B:29:0x0060, B:31:0x0072, B:33:0x0078, B:34:0x007b, B:36:0x008d, B:38:0x0093, B:39:0x0096, B:41:0x00a8, B:43:0x00ae, B:44:0x00b1, B:46:0x00c3, B:48:0x00c9, B:49:0x00cc, B:237:0x00de, B:239:0x00f0, B:241:0x0100, B:243:0x0106, B:51:0x010e, B:53:0x0120, B:55:0x0128, B:56:0x012d, B:58:0x013f, B:60:0x0147, B:61:0x014c, B:63:0x015e, B:65:0x0166, B:66:0x016b, B:68:0x017d, B:70:0x0198, B:72:0x01aa, B:74:0x01b0, B:75:0x01b3, B:77:0x01c5, B:79:0x01cb, B:80:0x01ce, B:82:0x01e0, B:84:0x01e6, B:85:0x01e9, B:87:0x01fb, B:89:0x0216, B:91:0x0228, B:93:0x0243, B:95:0x0255, B:97:0x0270, B:99:0x0282, B:101:0x029d, B:103:0x02af, B:105:0x02b5, B:106:0x02b8, B:108:0x02ca, B:110:0x02d0, B:111:0x02d3, B:113:0x02e5, B:115:0x02eb, B:116:0x02ee, B:118:0x0300, B:120:0x0306, B:121:0x0309, B:123:0x031b, B:125:0x0321, B:126:0x0324, B:128:0x0336, B:130:0x033c, B:131:0x033f, B:133:0x0351, B:135:0x0357, B:136:0x035a, B:138:0x036c, B:140:0x0372, B:141:0x0375, B:143:0x0387, B:145:0x038d, B:146:0x0390, B:148:0x03a2, B:150:0x03a8, B:151:0x03ab, B:153:0x03bd, B:155:0x03c3, B:156:0x03c6, B:158:0x03d8, B:160:0x03de, B:161:0x03e1, B:163:0x03f3, B:165:0x03f9, B:166:0x03fc, B:168:0x040e, B:170:0x0429, B:172:0x043b, B:174:0x0441, B:175:0x0444, B:177:0x0454, B:179:0x045a, B:180:0x045d, B:182:0x046d, B:184:0x0473, B:185:0x0476, B:187:0x0486, B:189:0x048c, B:190:0x048f, B:192:0x049f, B:194:0x04a7, B:195:0x04aa, B:197:0x04bc, B:199:0x04c2, B:200:0x04c5, B:202:0x04d7, B:204:0x04dd, B:205:0x04e0, B:207:0x04f2, B:209:0x04f8, B:210:0x04fb, B:212:0x050d, B:214:0x0513, B:215:0x0516, B:217:0x051c, B:218:0x0420, B:220:0x0426, B:221:0x0294, B:223:0x029a, B:224:0x0267, B:226:0x026d, B:227:0x023a, B:229:0x0240, B:230:0x020d, B:232:0x0213, B:233:0x018f, B:235:0x0195, B:246:0x010b, B:247:0x051f, B:249:0x0528), top: B:3:0x0003, inners: #0 }] */
    /* renamed from: ʼᵎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void m10625(android.content.Context r8, boolean r9, n3.d0<java.lang.Integer, java.lang.Boolean> r10) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.a1.m10625(android.content.Context, boolean, n3.d0):void");
    }

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    public static void m10626(Application application, d0<Integer, Boolean> d0Var) {
        IPluginApplicationInit m10638;
        IPluginApplicationInit m10677;
        IPluginApplicationInit m10597;
        IPluginApplicationInit m10640;
        IGdtAction m10601;
        IBh m10739;
        IPluginApplicationInit m10649;
        IPluginApplicationInit m10705;
        IPluginApplicationInit m10735;
        IPluginApplicationInit m10636;
        IPluginApplicationInit m10709;
        IPluginApplicationInit m10644;
        IUApp m10692;
        if (d0Var.mo8739(61).booleanValue() && (m10692 = m10692()) != null) {
            m10692.mo8024(application);
        }
        if (d0Var.mo8739(96).booleanValue() && (m10644 = m10644()) != null) {
            m10644.mo8024(application);
        }
        if (d0Var.mo8739(97).booleanValue() && (m10709 = m10709()) != null) {
            m10709.mo8024(application);
        }
        if (d0Var.mo8739(99).booleanValue() && (m10636 = m10636()) != null) {
            m10636.mo8024(application);
        }
        if (d0Var.mo8739(102).booleanValue() && (m10735 = m10735()) != null) {
            m10735.mo8024(application);
        }
        if (d0Var.mo8739(104).booleanValue() && (m10705 = m10705()) != null) {
            m10705.mo8024(application);
        }
        if (d0Var.mo8739(107).booleanValue() && (m10649 = m10649()) != null) {
            m10649.mo8024(application);
        }
        if (d0Var.mo8739(108).booleanValue() && (m10739 = m10739()) != null) {
            m10739.mo8024(application);
        }
        if (d0Var.mo8739(120).booleanValue() && (m10601 = m10601()) != null) {
            m10601.mo8024(application);
        }
        if (d0Var.mo8739(123).booleanValue() && (m10640 = m10640()) != null) {
            m10640.mo8024(application);
        }
        if (d0Var.mo8739(124).booleanValue() && (m10597 = m10597()) != null) {
            m10597.mo8024(application);
        }
        if (d0Var.mo8739(127).booleanValue() && (m10677 = m10677()) != null) {
            m10677.mo8024(application);
        }
        if (!d0Var.mo8739(198).booleanValue() || (m10638 = m10638()) == null) {
            return;
        }
        m10638.mo8024(application);
    }

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    public static void m10627(j2.f fVar) {
        IPluginWebView m10629 = m10629();
        if (m10629 != null) {
            m10629.m8026(fVar);
        }
        IPluginApplicationInit m10590 = m10590();
        if (m10590 instanceof IPluginWebView) {
            ((IPluginWebView) m10590).m8026(fVar);
        }
    }

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    private static IPluginApplicationInit m10628() {
        return (IPluginApplicationInit) m10607("JPush");
    }

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    private static IPluginWebView m10629() {
        return (IPluginWebView) m10607("Jxw");
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    private static IPluginApplicationInit m10630() {
        return (IPluginApplicationInit) m10607("Kc");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼﾞ, reason: contains not printable characters */
    public static /* synthetic */ void m10631(Method method, Object obj, JSONObject jSONObject, d dVar, s0 s0Var) {
        Throwable targetException;
        try {
            method.invoke(obj, jSONObject, dVar, s0Var);
        } catch (Exception e5) {
            String localizedMessage = e5.getLocalizedMessage();
            if (TextUtils.isEmpty(localizedMessage) && (e5 instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) e5).getTargetException()) != null) {
                localizedMessage = targetException.toString();
            }
            m10741(99, "Invoke js method failed:" + localizedMessage, s0Var);
            e5.printStackTrace();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m10632() {
        int i5;
        synchronized (f9693) {
            i5 = f9692;
            f9692 = i5 + 1;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʻ, reason: contains not printable characters */
    public static /* synthetic */ void m10633(f fVar, Context context, d0 d0Var, Boolean bool) {
        if (fVar != null) {
            fVar.mo8742(bool);
        }
        m10625(context, bool.booleanValue(), d0Var);
    }

    /* renamed from: ʽʼ, reason: contains not printable characters */
    private static IPluginApplicationInit m10634() {
        return (IPluginApplicationInit) m10607("Lefu");
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static IPluginApplicationInit m10635() {
        return (IPluginApplicationInit) m10607("Bm");
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public static IPluginApplicationInit m10636() {
        return (IPluginApplicationInit) m10607("Leto");
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    public static j0 m10637() {
        return (j0) m10607("Mid");
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    private static IPluginApplicationInit m10638() {
        return (IPluginApplicationInit) m10607("Msa");
    }

    /* renamed from: ʽˈ, reason: contains not printable characters */
    private static f0 m10639() {
        return (f0) m10605("com.lt.plugin.mtastat.PMtaStat");
    }

    /* renamed from: ʽˉ, reason: contains not printable characters */
    private static IPluginApplicationInit m10640() {
        return (IPluginApplicationInit) m10607("Netum");
    }

    /* renamed from: ʽˊ, reason: contains not printable characters */
    public static j0 m10641() {
        return (j0) m10607("Network");
    }

    /* renamed from: ʽˋ, reason: contains not printable characters */
    private static <T> T m10642(String str) {
        Log.d("YM_PLG", str);
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ʽˎ, reason: contains not printable characters */
    public static j0 m10643() {
        return (j0) m10607("Nfc");
    }

    /* renamed from: ʽˏ, reason: contains not printable characters */
    public static IPluginApplicationInit m10644() {
        return (IPluginApplicationInit) m10607("Njo");
    }

    /* renamed from: ʽˑ, reason: contains not printable characters */
    private static boolean m10645(d dVar, d0<Integer, Boolean> d0Var, String str, String str2, int i5) {
        if (d0Var != null && d0Var.mo8739(Integer.valueOf(i5)).booleanValue()) {
            return false;
        }
        z1.m10913(dVar, str, str2);
        return true;
    }

    /* renamed from: ʽי, reason: contains not printable characters */
    public static g0 m10646() {
        return (g0) m10605("com.lt.plugin.notification.PNotification");
    }

    /* renamed from: ʽـ, reason: contains not printable characters */
    private static j0 m10647() {
        return (j0) m10607("Ob");
    }

    /* renamed from: ʽٴ, reason: contains not printable characters */
    private static j0 m10648() {
        return (j0) m10607("PayPal");
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    static IPluginApplicationInit m10649() {
        return (IPluginApplicationInit) m10607("Pcg");
    }

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    private static j0 m10650() {
        return (j0) m10607("PhoneState");
    }

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    public static i0 m10651() {
        return (i0) m10642("com.lt.plugin.photoview.PPhotoView");
    }

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    private static j0 m10652() {
        return (j0) m10607("Prt");
    }

    /* renamed from: ʽᵢ, reason: contains not printable characters */
    public static IPluginApplicationInit m10653() {
        return (IPluginApplicationInit) m10607("Qb");
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    private static j0 m10654() {
        return (j0) m10607("Qmf");
    }

    /* renamed from: ʽﹳ, reason: contains not printable characters */
    public static k0 m10655() {
        return (k0) m10605("com.lt.plugin.qq.QQ");
    }

    /* renamed from: ʽﹶ, reason: contains not printable characters */
    private static j0 m10656() {
        return (j0) m10607("QqLoc");
    }

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    private static j0 m10657() {
        return (j0) m10607("Qs");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static j0 m10658() {
        return (j0) m10607("AbcPay");
    }

    /* renamed from: ʾʻ, reason: contains not printable characters */
    private static j0 m10659() {
        return (j0) m10607("QxTube");
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    private static IPluginApplicationInit m10660() {
        return (IPluginApplicationInit) m10607("Qy");
    }

    /* renamed from: ʾʽ, reason: contains not printable characters */
    public static j0 m10661() {
        return (j0) m10605("com.lt.plugin.rc.Rc");
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static IPluginApplicationInit m10662() {
        return (IPluginApplicationInit) m10607("BmNovel");
    }

    /* renamed from: ʾʿ, reason: contains not printable characters */
    public static synchronized void m10663(Context context, Runnable runnable) {
        synchronized (a1.class) {
            if (context == null || runnable == null) {
                return;
            }
            if (m10620(context)) {
                runnable.run();
            } else {
                if (f9697 == null) {
                    f9697 = new ArrayList();
                }
                f9697.add(runnable);
            }
        }
    }

    /* renamed from: ʾˆ, reason: contains not printable characters */
    public static IScan m10664() {
        return (IScan) m10607("Scan");
    }

    /* renamed from: ʾˈ, reason: contains not printable characters */
    public static j0 m10665() {
        return (j0) m10607("Screen");
    }

    /* renamed from: ʾˉ, reason: contains not printable characters */
    private static j0 m10666() {
        return (j0) m10605("com.lt.plugin.sensor_accelerometer.SensorAccelerometer");
    }

    /* renamed from: ʾˊ, reason: contains not printable characters */
    private static j0 m10667() {
        return (j0) m10605("com.lt.plugin.sensor_gyroscope.SensorGyroscope");
    }

    /* renamed from: ʾˋ, reason: contains not printable characters */
    private static j0 m10668() {
        return (j0) m10607("SerialPort");
    }

    /* renamed from: ʾˎ, reason: contains not printable characters */
    public static void m10669(d0<Integer, Boolean> d0Var) {
        f9694 = d0Var;
    }

    /* renamed from: ʾˏ, reason: contains not printable characters */
    public static void m10670(d0<String, String> d0Var) {
        f9695 = d0Var;
    }

    /* renamed from: ʾˑ, reason: contains not printable characters */
    public static void m10671(a2 a2Var) {
        f9696 = a2Var;
    }

    /* renamed from: ʾי, reason: contains not printable characters */
    public static l0 m10672() {
        return (l0) m10642("com.lt.plugin.shareimages.PShareImages");
    }

    /* renamed from: ʾـ, reason: contains not printable characters */
    private static j0 m10673() {
        return (j0) m10607("Sms");
    }

    /* renamed from: ʾٴ, reason: contains not printable characters */
    private static m0 m10674() {
        return (m0) m10607("Splash2");
    }

    /* renamed from: ʾᐧ, reason: contains not printable characters */
    private static j0 m10675() {
        return (j0) m10607("Tel");
    }

    /* renamed from: ʾᴵ, reason: contains not printable characters */
    private static IPluginApplicationInit m10676() {
        return (IPluginApplicationInit) m10607("ToBid");
    }

    /* renamed from: ʾᵎ, reason: contains not printable characters */
    private static IPluginApplicationInit m10677() {
        return (IPluginApplicationInit) m10607("TopFlow");
    }

    /* renamed from: ʾᵔ, reason: contains not printable characters */
    private static j0 m10678() {
        return (j0) m10607("TopVpn");
    }

    /* renamed from: ʾᵢ, reason: contains not printable characters */
    private static j0 m10679() {
        return (j0) m10607("TscPrinter");
    }

    /* renamed from: ʾⁱ, reason: contains not printable characters */
    private static IPluginApplicationInit m10680() {
        return (IPluginApplicationInit) m10607("TTAd");
    }

    /* renamed from: ʾﹳ, reason: contains not printable characters */
    private static IPluginApplicationInit m10681() {
        return (IPluginApplicationInit) m10607("TtAnalysis");
    }

    /* renamed from: ʾﹶ, reason: contains not printable characters */
    private static j0 m10682() {
        return (j0) m10607("TTDp");
    }

    /* renamed from: ʾﾞ, reason: contains not printable characters */
    private static IPluginApplicationInit m10683() {
        return (IPluginApplicationInit) m10607("TTGm");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static IPluginApplicationInit m10684() {
        return (IPluginApplicationInit) m10607("Adjust");
    }

    /* renamed from: ʿʻ, reason: contains not printable characters */
    private static ITTStat m10685() {
        return (ITTStat) m10607("TTStat");
    }

    /* renamed from: ʿʼ, reason: contains not printable characters */
    private static j0 m10686() {
        return (j0) m10607("TxDoc");
    }

    /* renamed from: ʿʽ, reason: contains not printable characters */
    private static j0 m10687() {
        return (j0) m10607("TxIm");
    }

    /* renamed from: ʿʾ, reason: contains not printable characters */
    private static j0 m10688() {
        return (j0) m10607("TxTrtc");
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static IPluginApplicationInit m10689() {
        return (IPluginApplicationInit) m10607("BmNews");
    }

    /* renamed from: ʿˆ, reason: contains not printable characters */
    private static j0 m10690() {
        return (j0) m10605("com.lt.plugin.videotx.VideoTx");
    }

    /* renamed from: ʿˈ, reason: contains not printable characters */
    private static IPluginApplicationInit m10691() {
        return (IPluginApplicationInit) m10607("Tz");
    }

    /* renamed from: ʿˉ, reason: contains not printable characters */
    private static IUApp m10692() {
        return (IUApp) m10607("UApp");
    }

    /* renamed from: ʿˊ, reason: contains not printable characters */
    private static j0 m10693() {
        return (j0) m10607("Uhf");
    }

    /* renamed from: ʿˋ, reason: contains not printable characters */
    public static n0 m10694() {
        return (n0) m10605("com.lt.plugin.upay.UPay");
    }

    /* renamed from: ʿˎ, reason: contains not printable characters */
    private static j0 m10695() {
        return (j0) m10607("Usb");
    }

    /* renamed from: ʿˏ, reason: contains not printable characters */
    public static o0 m10696() {
        return (o0) m10605("com.lt.plugin.video.Video");
    }

    /* renamed from: ʿˑ, reason: contains not printable characters */
    private static j0 m10697() {
        return (j0) m10607("Vpn");
    }

    /* renamed from: ʿי, reason: contains not printable characters */
    private static j0 m10698() {
        return (j0) m10607("Walle");
    }

    /* renamed from: ʿـ, reason: contains not printable characters */
    private static j0 m10699() {
        return (j0) m10607("WallPaper");
    }

    /* renamed from: ʿٴ, reason: contains not printable characters */
    public static p0 m10700() {
        return (p0) m10605("com.lt.plugin.weibo.Weibo");
    }

    /* renamed from: ʿᐧ, reason: contains not printable characters */
    public static IWx m10701() {
        return (IWx) m10607("Wx");
    }

    /* renamed from: ʿᴵ, reason: contains not printable characters */
    public static q0 m10702() {
        return (q0) m10642("com.lt.plugin.x5.PX5");
    }

    /* renamed from: ʿᵎ, reason: contains not printable characters */
    public static j0 m10703() {
        return (j0) m10607("Xlx");
    }

    /* renamed from: ʿᵔ, reason: contains not printable characters */
    public static j0 m10704() {
        return (j0) m10607("XPrinter");
    }

    /* renamed from: ʿᵢ, reason: contains not printable characters */
    public static IPluginApplicationInit m10705() {
        return (IPluginApplicationInit) m10607("Xw");
    }

    /* renamed from: ʿⁱ, reason: contains not printable characters */
    private static j0 m10706() {
        return (j0) m10607("Yh");
    }

    /* renamed from: ʿﹳ, reason: contains not printable characters */
    public static j0 m10707() {
        return (j0) m10607("YiLan");
    }

    /* renamed from: ʿﹶ, reason: contains not printable characters */
    private static j0 m10708() {
        return (j0) m10607("Yk");
    }

    /* renamed from: ʿﾞ, reason: contains not printable characters */
    public static IPluginApplicationInit m10709() {
        return (IPluginApplicationInit) m10607("YueMeng");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static v m10710() {
        return (v) m10605("com.lt.plugin.agreement.Agreement");
    }

    /* renamed from: ˆʻ, reason: contains not printable characters */
    private static IPluginApplicationInit m10711() {
        return (IPluginApplicationInit) m10607("YxIm");
    }

    /* renamed from: ˆʼ, reason: contains not printable characters */
    private static IPluginApplicationInit m10712() {
        return (IPluginApplicationInit) m10607("YxRtc");
    }

    /* renamed from: ˆʽ, reason: contains not printable characters */
    private static IPluginApplicationInit m10713() {
        return (IPluginApplicationInit) m10607("Zj");
    }

    /* renamed from: ˆʾ, reason: contains not printable characters */
    private static j0 m10714() {
        return (j0) m10607("ZQPrinter");
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private static j0 m10715() {
        return (j0) m10607("Bp");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static j0 m10716() {
        return (j0) m10607("AliRpVerify");
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static j0 m10717() {
        return (j0) m10607("CallLog");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static j0 m10718() {
        return (j0) m10607("AliSmartVerify");
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static j0 m10719() {
        return (j0) m10607("Broadcast");
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static j0 m10720() {
        return (j0) m10607("AliZimVerify");
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static z m10721() {
        return (z) m10607("Contact");
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static w m10722() {
        return (w) m10605("com.lt.plugin.alibc.PAlibc");
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private static PluginApplicationInit m10723() {
        return (PluginApplicationInit) m10607("Cncb");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static x m10724() {
        return (x) m10607("Alipay");
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static j0 m10725() {
        return (j0) m10607("Db");
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static j0 m10726() {
        return (j0) m10607("AlipayLogin");
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private static String m10727(Context context, boolean z5, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        String str3 = new String(Base64.decode(new String(z1.m10921(str)), 0));
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(z5 ? str2 : BuildConfig.FLAVOR);
        Uri.Builder appendQueryParameter = Uri.parse(sb.toString()).buildUpon().appendQueryParameter("__v", "48").appendQueryParameter("__k", context.getPackageName()).appendQueryParameter("v", String.valueOf(780));
        if (TextUtils.isEmpty(str2)) {
            str2 = BuildConfig.FLAVOR;
        }
        return appendQueryParameter.appendQueryParameter("_a", str2).build().toString();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static j0 m10728() {
        return (j0) m10607("AliPns");
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static j0 m10729() {
        return (j0) m10607("DeviceOwnerAuth");
    }

    /* renamed from: י, reason: contains not printable characters */
    public static j0 m10730() {
        return (j0) m10607("AmapLoc");
    }

    /* renamed from: יי, reason: contains not printable characters */
    private static j0 m10731() {
        return (j0) m10607("Dlna");
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static j0 m10732() {
        return (j0) m10607("AmapNavi");
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public static IPluginApplicationInit m10733() {
        return (IPluginApplicationInit) m10607("BmVideo");
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static j0 m10734() {
        return (j0) m10607("AmapTrack");
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    static IPluginApplicationInit m10735() {
        return (IPluginApplicationInit) m10607("DyAd");
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static j0 m10736() {
        return (j0) m10607("AppList");
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static j0 m10737() {
        return (j0) m10607("BdOcr");
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static void m10738(Application application, Context context, d0<Integer, Boolean> d0Var) {
        IPluginApplicationInit iPluginApplicationInit;
        PluginApplicationInit m10723;
        if (d0Var.mo8739(117).booleanValue() && (m10723 = m10723()) != null) {
            m10723.m8040(application, context);
        }
        if (!d0Var.mo8739(167).booleanValue() || (iPluginApplicationInit = (IPluginApplicationInit) m10697()) == null) {
            return;
        }
        iPluginApplicationInit.mo8024(application);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static IBh m10739() {
        return (IBh) m10607("Bh");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static j0 m10740() {
        return (j0) m10607("Audio");
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public static void m10741(int i5, String str, s0 s0Var) {
        m10745(i5, str, s0Var, false);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    static IAudioPlayer m10742() {
        return (IAudioPlayer) m10607("AudioPlayer");
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static a0 m10743() {
        return (a0) m10605("com.lt.plugin.displays.Displays");
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static IAudioRecorder m10744() {
        return (IAudioRecorder) m10607("AudioRecorder");
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static void m10745(int i5, String str, s0 s0Var, boolean z5) {
        if (s0Var != null) {
            s0Var.mo8809(i5, str, z5);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static j0 m10746() {
        return (j0) m10607("Battery");
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static b0 m10747() {
        return (b0) m10605("com.lt.plugin.doc.Doc");
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static j0 m10748() {
        return (j0) m10607("BdLbsLoc");
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private static j0 m10749() {
        return (j0) m10607("Dy");
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static j0 m10750() {
        return (j0) m10607("BdLbsNavi");
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private static j0 m10751() {
        return (j0) m10607("EaseMob");
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static y m10752() {
        return (y) m10605("com.lt.plugin.bdmtj.PBdMtj");
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static j0 m10753() {
        return (j0) m10607("BdFace");
    }
}
