package l0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: MultiDex.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Set<File> f8921 = new HashSet();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final boolean f8922 = m9566(System.getProperty("java.vm.version"));

    /* compiled from: MultiDex.java */
    /* renamed from: l0.a$a, reason: collision with other inner class name */
    private static final class C0129a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m9568(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = a.m9559(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            a.m9558(obj, "dexElements", m9569(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field m9559 = a.m9559(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) m9559.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                m9559.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static Object[] m9569(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) a.m9560(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m9556(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
                return;
            }
            Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static void m9557(Context context, File file, File file2, String str, String str2, boolean z5) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        Set<File> set = f8921;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 > 20) {
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + i5 + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            }
            ClassLoader m9562 = m9562(context);
            if (m9562 == null) {
                return;
            }
            try {
                m9556(context);
            } catch (Throwable th) {
                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
            }
            File m9563 = m9563(context, file2, str);
            c cVar = new c(file, m9563);
            try {
                try {
                    m9565(m9562, m9563, cVar.m9580(context, str2, false));
                } catch (IOException e5) {
                    if (!z5) {
                        throw e5;
                    }
                    Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e5);
                    m9565(m9562, m9563, cVar.m9580(context, str2, true));
                }
                try {
                    e = null;
                } catch (IOException e6) {
                    e = e6;
                }
                if (e != null) {
                    throw e;
                }
            } finally {
                try {
                    cVar.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m9558(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field m9559 = m9559(obj, str);
        Object[] objArr2 = (Object[]) m9559.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m9559.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public static Field m9559(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static Method m9560(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static ApplicationInfo m9561(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e5) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e5);
            return null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static ClassLoader m9562(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
            return null;
        } catch (RuntimeException e5) {
            Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e5);
            return null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static File m9563(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m9567(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m9567(file2);
        }
        File file3 = new File(file2, str);
        m9567(file3);
        return file3;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m9564(Context context) {
        Log.i("MultiDex", "Installing application");
        if (f8922) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        try {
            ApplicationInfo m9561 = m9561(context);
            if (m9561 == null) {
                Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            } else {
                m9557(context, new File(m9561.sourceDir), new File(m9561.dataDir), "secondary-dexes", BuildConfig.FLAVOR, true);
                Log.i("MultiDex", "install done");
            }
        } catch (Exception e5) {
            Log.e("MultiDex", "MultiDex installation failure", e5);
            throw new RuntimeException("MultiDex installation failed (" + e5.getMessage() + ").");
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static void m9565(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        C0129a.m9568(classLoader, list, file);
    }

    /* renamed from: י, reason: contains not printable characters */
    static boolean m9566(String str) {
        boolean z5 = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z5 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z5 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", sb.toString());
        return z5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static void m9567(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
        } else {
            Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
