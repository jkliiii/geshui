package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

/* compiled from: ColorResourcesLoaderCreator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {
    /* renamed from: ʻ, reason: contains not printable characters */
    static ResourcesLoader m6437(Context context, Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        try {
            byte[] m6447 = f.m6447(context, map);
            Log.i("ColorResLoaderCreator", "Table created, length: " + m6447.length);
            if (m6447.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                try {
                    if (fileDescriptor == null) {
                        Log.w("ColorResLoaderCreator", "Cannot create memory file descriptor.");
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        return null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    try {
                        fileOutputStream.write(m6447);
                        ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                        try {
                            ResourcesLoader resourcesLoader = new ResourcesLoader();
                            resourcesLoader.addProvider(ResourcesProvider.loadFromTable(dup, null));
                            if (dup != null) {
                                dup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptor);
                            return resourcesLoader;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileDescriptor = null;
            }
        } catch (Exception e5) {
            Log.e("ColorResLoaderCreator", "Failed to create the ColorResourcesTableCreator.", e5);
            return null;
        }
    }
}
