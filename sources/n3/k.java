package n3;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import com.lt.plugin.IAudioRecorder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.d;

/* compiled from: FilePicker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    private f<Uri[]> f9930;

    /* compiled from: FilePicker.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f9931;

        static {
            int[] iArr = new int[b.values().length];
            f9931 = iArr;
            try {
                iArr[b.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9931[b.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9931[b.Audio.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: FilePicker.java */
    public enum b {
        Image,
        Video,
        Audio,
        Unknown
    }

    public k(f<Uri[]> fVar) {
        this.f9930 = fVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m10783(Uri[] uriArr) {
        f<Uri[]> fVar = this.f9930;
        if (fVar != null) {
            fVar.mo8742(uriArr);
            this.f9930 = null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private Uri m10784(d dVar, boolean z5) {
        File m10906 = z1.m10906(dVar, "_capture.jpg");
        if (z5) {
            if (m10906.exists()) {
                m10906.delete();
            }
        } else if (!m10906.exists()) {
            return null;
        }
        return z1.m10943(dVar, m10906);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static Intent m10785(String str) {
        Intent intent;
        if (TextUtils.isEmpty(str)) {
            str = "image/*";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
        }
        intent.setType(str);
        return intent;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static Intent m10786(b bVar) {
        int i5 = a.f9931[bVar.ordinal()];
        return m10785(i5 != 1 ? i5 != 2 ? "audio/*" : "video/*" : "image/*");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public /* synthetic */ void m10787(b bVar, d dVar, Boolean bool, Boolean bool2) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new Intent();
            intent.addCategory("android.intent.category.DEFAULT");
            int i5 = a.f9931[bVar.ordinal()];
            if (i5 == 1) {
                intent.putExtra("output", m10784(dVar, true));
                intent.setAction("android.media.action.IMAGE_CAPTURE");
            } else if (i5 == 2) {
                intent.setAction("android.media.action.VIDEO_CAPTURE");
            }
        } else {
            intent = null;
        }
        m10793(dVar, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public /* synthetic */ void m10788(d dVar, File file) {
        if (file != null) {
            m10783(new Uri[]{z1.m10943(dVar, file)});
        } else {
            m10783(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public /* synthetic */ void m10789(d dVar, Intent intent, int i5, int i6, Intent intent2) {
        Uri m10784;
        Uri[] parseResult;
        if (i5 != 5173) {
            return;
        }
        Uri[] uriArr = null;
        dVar.m10768(null);
        if (i6 != -1) {
            m10783(null);
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        if (intent2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                ClipData clipData = intent2.getClipData();
                if (clipData != null && clipData.getItemCount() > 0) {
                    for (int i7 = 0; i7 < clipData.getItemCount(); i7++) {
                        ClipData.Item itemAt = clipData.getItemAt(i7);
                        if (itemAt != null && itemAt.getUri() != null) {
                            arrayList.add(itemAt.getUri());
                        }
                    }
                }
                if (arrayList.isEmpty() && (parseResult = WebChromeClient.FileChooserParams.parseResult(i6, intent2)) != null) {
                    for (Uri uri : parseResult) {
                        if (uri != null) {
                            arrayList.add(uri);
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && intent2.getData() != null) {
                arrayList.add(intent2.getData());
            }
        }
        if (arrayList.isEmpty() && "android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) && (m10784 = m10784(dVar, false)) != null) {
            arrayList.add(m10784);
        }
        if (arrayList.isEmpty()) {
            z1.m10909(dVar, "获取媒体失败");
        } else {
            uriArr = new Uri[arrayList.size()];
            arrayList.toArray(uriArr);
        }
        m10783(uriArr);
    }

    /* renamed from: י, reason: contains not printable characters */
    public static List<b> m10790(String str) {
        ArrayList arrayList = new ArrayList();
        String lowerCase = str == null ? BuildConfig.FLAVOR : str.toLowerCase();
        if (lowerCase.matches(".*(jpg|jpeg|png|gif|bmp|image).*")) {
            arrayList.add(b.Image);
        }
        if (lowerCase.matches(".*(mpeg|mp4|mov|video).*")) {
            arrayList.add(b.Video);
        }
        if (lowerCase.matches(".*(mp3|m4a|wav|amr|aac|3gp|audio).*")) {
            arrayList.add(b.Audio);
        }
        return arrayList;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m10791(final d dVar, final b bVar) {
        int i5 = a.f9931[bVar.ordinal()];
        if (i5 == 1 || i5 == 2) {
            dVar.m10766(new e() { // from class: n3.h
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    this.f9737.m10787(bVar, dVar, (Boolean) obj, (Boolean) obj2);
                }
            }, new String[]{"android.permission.CAMERA"});
            return;
        }
        IAudioRecorder m10744 = a1.m10744();
        if (m10744 != null) {
            m10744.m8021(dVar, new f() { // from class: n3.i
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f9757.m10788(dVar, (File) obj);
                }
            });
        } else {
            m10783(null);
            z1.m10909(dVar, "没用打包录音插件");
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m10792(d dVar, b bVar) {
        m10793(dVar, m10786(bVar));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m10793(final d dVar, final Intent intent) {
        if (intent == null) {
            m10783(null);
            return;
        }
        dVar.m10768(new d.a() { // from class: n3.j
            @Override // n3.d.a
            /* renamed from: ʻ */
            public final void mo7987(int i5, int i6, Intent intent2) {
                this.f9769.m10789(dVar, intent, i5, i6, intent2);
            }
        });
        try {
            if (intent.resolveActivity(dVar.getPackageManager()) == null && !"android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) && !"android.media.action.VIDEO_CAPTURE".equals(intent.getAction())) {
                List<b> m10790 = m10790(intent.getType());
                StringBuilder sb = new StringBuilder(32);
                if (m10790.contains(b.Image)) {
                    sb.append("image/*;");
                }
                if (m10790.contains(b.Video)) {
                    sb.append("video/*;");
                }
                if (m10790.contains(b.Audio)) {
                    sb.append("audio/*;");
                }
                intent.setType(sb.length() == 0 ? "*/*" : sb.substring(0, sb.length() - 1));
            }
            dVar.startActivityForResult(intent, 5173);
        } catch (Exception e5) {
            dVar.m10768(null);
            m10783(null);
            e5.printStackTrace();
        }
    }
}
