package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j implements d<InputStream> {

    /* renamed from: ˋ, reason: contains not printable characters */
    static final b f5229 = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final i1.h f5230;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f5231;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final b f5232;

    /* renamed from: ˈ, reason: contains not printable characters */
    private HttpURLConnection f5233;

    /* renamed from: ˉ, reason: contains not printable characters */
    private InputStream f5234;

    /* renamed from: ˊ, reason: contains not printable characters */
    private volatile boolean f5235;

    /* compiled from: HttpUrlFetcher.java */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public HttpURLConnection mo6159(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    interface b {
        /* renamed from: ʻ */
        HttpURLConnection mo6159(URL url) throws IOException;
    }

    public j(i1.h hVar, int i5) {
        this(hVar, i5, f5229);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private HttpURLConnection m6153(URL url, Map<String, String> map) throws c1.e {
        try {
            HttpURLConnection mo6159 = this.f5232.mo6159(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                mo6159.addRequestProperty(entry.getKey(), entry.getValue());
            }
            mo6159.setConnectTimeout(this.f5231);
            mo6159.setReadTimeout(this.f5231);
            mo6159.setUseCaches(false);
            mo6159.setDoInput(true);
            mo6159.setInstanceFollowRedirects(false);
            return mo6159;
        } catch (IOException e5) {
            throw new c1.e("URL.openConnection threw", 0, e5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m6154(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e5) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e5);
            return -1;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private InputStream m6155(HttpURLConnection httpURLConnection) throws c1.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f5234 = y1.c.m12870(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f5234 = httpURLConnection.getInputStream();
            }
            return this.f5234;
        } catch (IOException e5) {
            throw new c1.e("Failed to obtain InputStream", m6154(httpURLConnection), e5);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m6156(int i5) {
        return i5 / 100 == 2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m6157(int i5) {
        return i5 / 100 == 3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private InputStream m6158(URL url, int i5, URL url2, Map<String, String> map) throws c1.e {
        if (i5 >= 5) {
            throw new c1.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new c1.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection m6153 = m6153(url, map);
        this.f5233 = m6153;
        try {
            m6153.connect();
            this.f5234 = this.f5233.getInputStream();
            if (this.f5235) {
                return null;
            }
            int m6154 = m6154(this.f5233);
            if (m6156(m6154)) {
                return m6155(this.f5233);
            }
            if (!m6157(m6154)) {
                if (m6154 == -1) {
                    throw new c1.e(m6154);
                }
                try {
                    throw new c1.e(this.f5233.getResponseMessage(), m6154);
                } catch (IOException e5) {
                    throw new c1.e("Failed to get a response message", m6154, e5);
                }
            }
            String headerField = this.f5233.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new c1.e("Received empty or null redirect url", m6154);
            }
            try {
                URL url3 = new URL(url, headerField);
                mo6137();
                return m6158(url3, i5 + 1, url, map);
            } catch (MalformedURLException e6) {
                throw new c1.e("Bad redirect url: " + headerField, m6154, e6);
            }
        } catch (IOException e7) {
            throw new c1.e("Failed to connect or obtain data", m6154(this.f5233), e7);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f5235 = true;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʻ */
    public Class<InputStream> mo6132() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʼ */
    public void mo6137() {
        InputStream inputStream = this.f5234;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5233;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5233 = null;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʿ */
    public c1.a mo6140() {
        return c1.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ˆ */
    public void mo6141(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long m12879 = y1.g.m12879();
        try {
            try {
                aVar.mo6146(m6158(this.f5230.m9161(), 0, null, this.f5230.m9160()));
            } catch (IOException e5) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e5);
                }
                aVar.mo6145(e5);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(y1.g.m12878(m12879));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + y1.g.m12878(m12879));
            }
            throw th;
        }
    }

    j(i1.h hVar, int i5, b bVar) {
        this.f5230 = hVar;
        this.f5231 = i5;
        this.f5232 = bVar;
    }
}
