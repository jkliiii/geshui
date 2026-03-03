package o2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import n2.p;
import n2.x;

/* compiled from: FilePart.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends e {

    /* renamed from: ʾ, reason: contains not printable characters */
    File f10065;

    /* compiled from: FilePart.java */
    class a extends ArrayList<x> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ File f10066;

        a(File file) {
            this.f10066 = file;
            add(new p("filename", file.getName()));
        }
    }

    public b(String str, File file) {
        super(str, (int) file.length(), new a(file));
        this.f10065 = file;
    }

    public String toString() {
        return m10983();
    }

    @Override // o2.e
    /* renamed from: ˆ, reason: contains not printable characters */
    protected InputStream mo10976() throws IOException {
        return new FileInputStream(this.f10065);
    }
}
