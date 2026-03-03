package v2;

import java.io.File;

/* compiled from: FileUtility.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m12348(File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (int i5 = 0; i5 < listFiles.length; i5++) {
                if (listFiles[i5].isDirectory()) {
                    m12348(listFiles[i5]);
                } else {
                    listFiles[i5].delete();
                }
            }
        }
        return file.delete();
    }
}
