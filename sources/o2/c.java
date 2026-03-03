package o2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k2.a0;
import k2.f0;
import k2.q;
import k2.u;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n2.s;
import n2.w;

/* compiled from: MultipartFormDataBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends s2.b implements o2.a<w> {

    /* renamed from: ˋ, reason: contains not printable characters */
    a0 f10067;

    /* renamed from: ˎ, reason: contains not printable characters */
    s f10068;

    /* renamed from: ˏ, reason: contains not printable characters */
    q f10069;

    /* renamed from: ˑ, reason: contains not printable characters */
    o2.d f10070;

    /* renamed from: י, reason: contains not printable characters */
    String f10071 = "multipart/form-data";

    /* renamed from: ـ, reason: contains not printable characters */
    int f10072;

    /* renamed from: ٴ, reason: contains not printable characters */
    int f10073;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ArrayList<o2.d> f10074;

    /* compiled from: MultipartFormDataBody.java */
    class a implements a0.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ s f10075;

        /* compiled from: MultipartFormDataBody.java */
        /* renamed from: o2.c$a$a, reason: collision with other inner class name */
        class C0141a implements l2.d {
            C0141a() {
            }

            @Override // l2.d
            /* renamed from: ᵢ */
            public void mo9377(k2.s sVar, q qVar) {
                qVar.m9489(c.this.f10069);
            }
        }

        a(s sVar) {
            this.f10075 = sVar;
        }

        @Override // k2.a0.a
        /* renamed from: ʻ */
        public void mo9378(String str) {
            if (!"\r".equals(str)) {
                this.f10075.m10553(str);
                return;
            }
            c.this.m10982();
            c cVar = c.this;
            cVar.f10067 = null;
            cVar.mo9362(null);
            o2.d dVar = new o2.d(this.f10075);
            c.this.getClass();
            if (c.this.mo9375() == null) {
                c cVar2 = c.this;
                cVar2.f10070 = dVar;
                cVar2.f10069 = new q();
                c.this.mo9362(new C0141a());
            }
        }
    }

    /* compiled from: MultipartFormDataBody.java */
    class b implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l2.a f10078;

        b(l2.a aVar) {
            this.f10078 = aVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            this.f10078.mo9412(exc);
        }
    }

    /* compiled from: MultipartFormDataBody.java */
    /* renamed from: o2.c$c, reason: collision with other inner class name */
    class C0142c implements l2.c {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ u f10080;

        C0142c(u uVar) {
            this.f10080 = uVar;
        }

        @Override // l2.c
        /* renamed from: ʼ */
        public void mo9725(m2.b bVar, l2.a aVar) throws Exception {
            byte[] bytes = "\r\n".getBytes();
            f0.m9429(this.f10080, bytes, aVar);
            c.this.f10072 += bytes.length;
        }
    }

    /* compiled from: MultipartFormDataBody.java */
    class d implements l2.c {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ o2.d f10082;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ u f10083;

        d(o2.d dVar, u uVar) {
            this.f10082 = dVar;
            this.f10083 = uVar;
        }

        @Override // l2.c
        /* renamed from: ʼ */
        public void mo9725(m2.b bVar, l2.a aVar) throws Exception {
            long m10985 = this.f10082.m10985();
            if (m10985 >= 0) {
                c.this.f10072 = (int) (r5.f10072 + m10985);
            }
            this.f10082.mo10987(this.f10083, aVar);
        }
    }

    /* compiled from: MultipartFormDataBody.java */
    class e implements l2.c {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ o2.d f10085;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ u f10086;

        e(o2.d dVar, u uVar) {
            this.f10085 = dVar;
            this.f10086 = uVar;
        }

        @Override // l2.c
        /* renamed from: ʼ */
        public void mo9725(m2.b bVar, l2.a aVar) throws Exception {
            byte[] bytes = this.f10085.m10984().m10558(c.this.m11714()).getBytes();
            f0.m9429(this.f10086, bytes, aVar);
            c.this.f10072 += bytes.length;
        }
    }

    /* compiled from: MultipartFormDataBody.java */
    class f implements l2.c {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ u f10088;

        f(u uVar) {
            this.f10088 = uVar;
        }

        @Override // l2.c
        /* renamed from: ʼ */
        public void mo9725(m2.b bVar, l2.a aVar) throws Exception {
            byte[] bytes = c.this.m11716().getBytes();
            f0.m9429(this.f10088, bytes, aVar);
            c.this.f10072 += bytes.length;
        }
    }

    @Override // o2.a
    public int length() {
        if (m11713() == null) {
            m11715("----------------------------" + UUID.randomUUID().toString().replace("-", BuildConfig.FLAVOR));
        }
        Iterator<o2.d> it = this.f10074.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            o2.d next = it.next();
            String m10558 = next.m10984().m10558(m11714());
            if (next.m10985() == -1) {
                return -1;
            }
            i5 = (int) (i5 + next.m10985() + m10558.getBytes().length + 2);
        }
        int length = i5 + m11716().getBytes().length;
        this.f10073 = length;
        return length;
    }

    public String toString() {
        Iterator<o2.d> it = m10980().iterator();
        return it.hasNext() ? it.next().toString() : "multipart content is empty";
    }

    @Override // o2.a
    /* renamed from: ʻʻ */
    public void mo10974(n2.e eVar, u uVar, l2.a aVar) {
        if (this.f10074 == null) {
            return;
        }
        m2.b bVar = new m2.b(new b(aVar));
        Iterator<o2.d> it = this.f10074.iterator();
        while (it.hasNext()) {
            o2.d next = it.next();
            bVar.m9854(new e(next, uVar)).m9854(new d(next, uVar)).m9854(new C0142c(uVar));
        }
        bVar.m9854(new f(uVar));
        bVar.m9857();
    }

    @Override // s2.b
    /* renamed from: ˈˈ, reason: contains not printable characters */
    protected void mo10977() {
        s sVar = new s();
        a0 a0Var = new a0();
        this.f10067 = a0Var;
        a0Var.m9376(new a(sVar));
        mo9362(this.f10067);
    }

    @Override // s2.b
    /* renamed from: ˉˉ, reason: contains not printable characters */
    protected void mo10978() {
        super.mo10978();
        m10982();
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m10979(o2.d dVar) {
        if (this.f10074 == null) {
            this.f10074 = new ArrayList<>();
        }
        this.f10074.add(dVar);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public List<o2.d> m10980() {
        if (this.f10074 == null) {
            return null;
        }
        return new ArrayList(this.f10074);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void m10981(String str, String str2) {
        m10979(new g(str, str2));
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m10982() {
        if (this.f10069 == null) {
            return;
        }
        if (this.f10068 == null) {
            this.f10068 = new s();
        }
        String m9504 = this.f10069.m9504();
        String m10983 = TextUtils.isEmpty(this.f10070.m10983()) ? "unnamed" : this.f10070.m10983();
        g gVar = new g(m10983, m9504);
        gVar.f10090 = this.f10070.f10090;
        m10979(gVar);
        this.f10068.m10551(m10983, m9504);
        this.f10070 = null;
        this.f10069 = null;
    }

    @Override // o2.a
    /* renamed from: ﹶ */
    public String mo10975() {
        if (m11713() == null) {
            m11715("----------------------------" + UUID.randomUUID().toString().replace("-", BuildConfig.FLAVOR));
        }
        return this.f10071 + "; boundary=" + m11713();
    }
}
