package v0;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.a;
import v0.z;

/* compiled from: WebViewFeatureInternal.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a.b f11602 = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final a.b f11612 = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final a.e f11614 = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final a.c f11616 = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final a.f f11618 = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: ˆ, reason: contains not printable characters */
    @Deprecated
    public static final a.f f11620 = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: ˈ, reason: contains not printable characters */
    @Deprecated
    public static final a.f f11622 = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final a.f f11624 = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final a.f f11626 = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final a.f f11628 = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final a.c f11630 = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final a.c f11632 = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final a.c f11634 = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: י, reason: contains not printable characters */
    public static final a.c f11636 = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: ـ, reason: contains not printable characters */
    public static final a.c f11638 = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final a.c f11640 = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final a.b f11642 = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final a.b f11644 = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final a.c f11646 = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final a.f f11648 = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final a.c f11650 = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static final a.b f11652 = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final a.b f11654 = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final a.f f11656 = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final a.f f11658 = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final a.f f11659 = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static final a.b f11643 = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static final a.b f11645 = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static final a.d f11603 = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static final a.b f11615 = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static final a.b f11613 = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static final a.b f11619 = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static final a.b f11617 = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: ــ, reason: contains not printable characters */
    public static final a.e f11639 = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static final a.e f11621 = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static final a.h f11625 = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static final a.h f11623 = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static final a.g f11629 = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static final z.b f11627 = new z.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static final z.a f11633 = new z.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static final a.h f11631 = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static final a.i f11635 = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static final a.d f11649 = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: יי, reason: contains not printable characters */
    public static final a.d f11637 = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public static final a.h f11647 = new a.h("FORCE_DARK", "FORCE_DARK");

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final a.d f11651 = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static final a.d f11653 = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final a.d f11655 = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public static final a.d f11641 = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public static final a.d f11657 = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static final a.d f11604 = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static final a.d f11605 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public static final a.d f11606 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final a.d f11607 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public static final a.d f11608 = new b("MULTI_PROFILE", "MULTI_PROFILE");

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public static final a.d f11609 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public static final a.d f11610 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public static final a.d f11611 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* compiled from: WebViewFeatureInternal.java */
    class a extends a.i {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Pattern f11660;

        a(String str, String str2) {
            super(str, str2);
            this.f11660 = Pattern.compile("\\A\\d+");
        }

        @Override // v0.a
        /* renamed from: ʾ */
        public boolean mo12230() {
            boolean mo12230 = super.mo12230();
            if (!mo12230 || Build.VERSION.SDK_INT >= 29) {
                return mo12230;
            }
            PackageInfo m12091 = u0.d.m12091();
            if (m12091 == null) {
                return false;
            }
            Matcher matcher = this.f11660.matcher(m12091.versionName);
            return matcher.find() && Integer.parseInt(m12091.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    /* compiled from: WebViewFeatureInternal.java */
    class b extends a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // v0.a
        /* renamed from: ʾ */
        public boolean mo12230() {
            if (super.mo12230() && u0.e.m12096("MULTI_PROCESS")) {
                return u0.d.m12095();
            }
            return false;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static UnsupportedOperationException m12234() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m12235(String str) {
        return m12236(str, v0.a.m12226());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T extends w> boolean m12236(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t5 : collection) {
            if (t5.mo12228().equals(str)) {
                hashSet.add(t5);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((w) it.next()).mo12227()) {
                return true;
            }
        }
        return false;
    }
}
