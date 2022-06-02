/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.res.Resources
 *  android.hardware.Sensor
 *  android.hardware.SensorManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Debug
 *  android.os.StatFs
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.Closeable
 *  java.io.File
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Scanner
 */
package d.c.b.m.e.k;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import d.c.b.m.e.p.c;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class g {
    public static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static long b = -1L;
    public static final Comparator<File> c = new Comparator<File>(){

        public int compare(Object object, Object object2) {
            File file = (File)object;
            File file2 = (File)object2;
            return (int)(file.lastModified() - file2.lastModified());
        }
    };

    public static long a(String string) {
        StatFs statFs = new StatFs(string);
        long l2 = statFs.getBlockSize();
        return l2 * (long)statFs.getBlockCount() - l2 * (long)statFs.getAvailableBlocks();
    }

    @SuppressLint(value={"MissingPermission"})
    public static boolean b(Context context) {
        boolean bl = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        if (bl) {
            NetworkInfo networkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            boolean bl2 = false;
            if (networkInfo != null) {
                boolean bl3 = networkInfo.isConnectedOrConnecting();
                bl2 = bl3;
            }
            return bl2;
        }
        return true;
    }

    public static void c(Closeable closeable, String string) {
        block3 : {
            if (closeable != null) {
                try {
                    closeable.close();
                    return;
                }
                catch (IOException iOException) {
                    if (!d.c.b.m.e.b.a.a(6)) break block3;
                    Log.e("FirebaseCrashlytics", string, iOException);
                }
            }
        }
    }

    public static long d(String string, String string2, int n2) {
        return Long.parseLong(string.split(string2)[0].trim()) * (long)n2;
    }

    public static /* varargs */ String e(String ... arrstring) {
        if (arrstring.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String string : arrstring) {
                if (string == null) continue;
                arrayList.add(string.replace("-", "").toLowerCase(Locale.US));
            }
            Collections.sort(arrayList);
            StringBuilder stringBuilder = new StringBuilder();
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                stringBuilder.append((String)iterator.next());
            }
            String string = stringBuilder.toString();
            if (string.length() > 0) {
                return g.t(string);
            }
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static String f(File var0, String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[DOLOOP]], but top level block is 8[SIMPLE_IF_TAKEN]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public static void g(Flushable flushable, String string) {
        block3 : {
            if (flushable != null) {
                c c2 = (c)flushable;
                try {
                    c2.flush();
                    return;
                }
                catch (IOException iOException) {
                    if (!d.c.b.m.e.b.a.a(6)) break block3;
                    Log.e("FirebaseCrashlytics", string, iOException);
                }
            }
        }
    }

    public static ActivityManager.RunningAppProcessInfo h(String string, Context context) {
        List list = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (list != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (!runningAppProcessInfo.processName.equals(string)) continue;
                return runningAppProcessInfo;
            }
        }
        return null;
    }

    public static boolean i(Context context, String string, boolean bl) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int n2 = g.m(context, string, "bool");
            if (n2 > 0) {
                return resources.getBoolean(n2);
            }
            int n3 = g.m(context, string, "string");
            if (n3 > 0) {
                return Boolean.parseBoolean(context.getString(n3));
            }
        }
        return bl;
    }

    public static int j(Context context) {
        boolean bl = g.q(context);
        boolean bl2 = true;
        int n2 = bl ? 1 : 0;
        if (g.s(context)) {
            n2 |= 2;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            bl2 = false;
        }
        if (bl2) {
            n2 |= 4;
        }
        return n2;
    }

    public static String k(Context context) {
        int n2 = g.m(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (n2 == 0) {
            n2 = g.m(context, "com.crashlytics.android.build_id", "string");
        }
        if (n2 != 0) {
            return context.getResources().getString(n2);
        }
        return null;
    }

    public static boolean l(Context context) {
        if (g.q(context)) {
            return false;
        }
        Sensor sensor = ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8);
        boolean bl = sensor != null;
        return bl;
    }

    /*
     * Exception decompiling
     */
    public static int m(Context var0, String var1, String var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27 : ALOAD_3 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public static SharedPreferences n(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long o() {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (b != -1L) return b;
            long l2 = 0L;
            String string = g.f(new File("/proc/meminfo"), "MemTotal");
            if (!TextUtils.isEmpty(string)) {
                String string2 = string.toUpperCase(Locale.US);
                try {
                    if (string2.endsWith("KB")) {
                        l2 = g.d(string2, "KB", 1024);
                    } else if (string2.endsWith("MB")) {
                        l2 = g.d(string2, "MB", 1048576);
                    } else if (string2.endsWith("GB")) {
                        l2 = g.d(string2, "GB", 1073741824);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                        stringBuilder.append(string2);
                        b2.b(stringBuilder.toString());
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected meminfo format while computing RAM: ");
                    stringBuilder.append(string2);
                    b2.e(stringBuilder.toString(), numberFormatException);
                }
            }
            b = l2;
            return b;
        }
    }

    public static String p(byte[] arrby) {
        char[] arrc = new char[2 * arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n2 = 255 & arrby[i2];
            int n3 = i2 * 2;
            char[] arrc2 = a;
            arrc[n3] = arrc2[n2 >>> 4];
            arrc[n3 + 1] = arrc2[n2 & 15];
        }
        return new String(arrc);
    }

    public static boolean q(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String string2 = Build.PRODUCT;
        return "sdk".equals(string2) || "google_sdk".equals(string2) || string == null;
        {
        }
    }

    public static boolean r(String string) {
        return string == null || string.length() == 0;
        {
        }
    }

    public static boolean s(Context context) {
        boolean bl = g.q(context);
        String string = Build.TAGS;
        if (!bl && string != null && string.contains("test-keys")) {
            return true;
        }
        if (new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        return !bl && file.exists();
    }

    public static String t(String string) {
        MessageDigest messageDigest;
        byte[] arrby = string.getBytes();
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not create hashing algorithm: ");
            stringBuilder.append("SHA-1");
            stringBuilder.append(", returning empty string.");
            b2.e(stringBuilder.toString(), noSuchAlgorithmException);
            return "";
        }
        messageDigest.update(arrby);
        return g.p(messageDigest.digest());
    }

    public static String u(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return "";
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        public static final /* enum */ b h;
        public static final /* enum */ b i;
        public static final /* enum */ b j;
        public static final /* enum */ b k;
        public static final /* enum */ b l;
        public static final /* enum */ b m;
        public static final /* enum */ b n;
        public static final Map<String, b> o;
        public static final /* synthetic */ b[] p;

        public static {
            b b2;
            b b3;
            HashMap hashMap;
            b b4;
            b b6;
            b b7;
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            e = b11 = new b();
            f = b8 = new b();
            g = b2 = new b();
            h = b10 = new b();
            i = b7 = new b();
            j = b9 = new b();
            k = b3 = new b();
            l = b4 = new b();
            m = b12 = new b();
            n = b6 = new b();
            p = new b[]{b11, b8, b2, b10, b7, b9, b3, b4, b12, b6};
            o = hashMap = new HashMap(4);
            hashMap.put("armeabi-v7a", b3);
            hashMap.put("armeabi", b9);
            hashMap.put("arm64-v8a", b6);
            hashMap.put("x86", b11);
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return p.clone();
        }
    }

}

