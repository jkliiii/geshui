package j2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import java.util.Map;

/* compiled from: IWebView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface f extends i2.a {

    /* compiled from: IWebView.java */
    public interface a<TResult> {
        /* renamed from: ʻ */
        void mo8781(TResult tresult);
    }

    /* compiled from: IWebView.java */
    public interface b {
        /* renamed from: ʻ */
        void mo8747(boolean z5, Object obj);
    }

    /* compiled from: IWebView.java */
    public static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f8637;

        /* renamed from: ʼ, reason: contains not printable characters */
        private String f8638;

        /* renamed from: ʻ, reason: contains not printable characters */
        public String m9308() {
            return this.f8638;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m9309() {
            return this.f8637;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m9310(String str) {
            this.f8638 = str;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m9311(int i5) {
            this.f8637 = i5;
        }
    }

    /* compiled from: IWebView.java */
    public interface d {
        /* renamed from: ʻ */
        void mo7988(f fVar);
    }

    boolean canGoBack();

    boolean canGoForward();

    void destroy();

    void evaluateJavascript(String str, ValueCallback<String> valueCallback);

    Context getContext();

    boolean getJsBridgeInjected();

    c getLTHitTestResult();

    String getTitle();

    String getUrl();

    View getViewEx();

    void goBack();

    void goForward();

    void loadData(String str, String str2, String str3);

    void loadUrl(String str, Map<String, String> map);

    void reload();

    void removeView(View view);

    void requestFocusNodeHref(Message message);

    void setDownloadListener(j2.a aVar);

    void setErrorUrl(String str);

    void setForceDark(Boolean bool);

    void setGeolocationEnabled(boolean z5);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setLongClickable(boolean z5);

    void setLtHandler(i2.b bVar);

    void setOnDoubleClickListener(d dVar);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setTransportWebView(Message message);

    void setTransportWebView(Object obj);

    void setWebChromeClient(e eVar);

    void setWebViewClient(g gVar);

    void stopLoading();

    /* renamed from: ʻ */
    void mo7787();

    /* renamed from: ʼ */
    void mo7788(String str);

    /* renamed from: ʽ */
    String mo7789(String str, String str2);

    /* renamed from: ʾ */
    void mo7790(boolean z5, a<Bitmap> aVar);

    /* renamed from: ʿ */
    boolean mo7791(String str);

    /* renamed from: ˆ */
    void mo7792();

    /* renamed from: ˈ */
    void mo9241(String str, Object obj, b bVar);

    /* renamed from: ˉ */
    String mo7793(String str);

    /* renamed from: ˋ */
    void mo7794(String str, String str2, String str3);
}
