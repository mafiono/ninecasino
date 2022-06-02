/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.StatFs
 *  android.text.TextUtils
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.b.b
 *  d.c.a.b.e
 *  d.c.a.b.f
 *  d.c.a.b.g
 *  d.c.a.b.i.a
 *  d.c.a.b.j.d
 *  d.c.a.b.j.j
 *  d.c.a.b.j.n
 *  d.c.a.d.j.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.k.a0
 *  d.c.b.m.e.k.c1
 *  d.c.b.m.e.k.d0
 *  d.c.b.m.e.k.q
 *  d.c.b.m.e.k.r
 *  d.c.b.m.e.k.r0
 *  d.c.b.m.e.k.s
 *  d.c.b.m.e.k.t$a
 *  d.c.b.m.e.k.t$e
 *  d.c.b.m.e.k.t$j
 *  d.c.b.m.e.k.t$k
 *  d.c.b.m.e.k.t$l
 *  d.c.b.m.e.k.u
 *  d.c.b.m.e.m.b
 *  d.c.b.m.e.m.b$b
 *  d.c.b.m.e.m.f
 *  d.c.b.m.e.m.f$b
 *  d.c.b.m.e.m.g
 *  d.c.b.m.e.m.i
 *  d.c.b.m.e.m.i$b
 *  d.c.b.m.e.m.t
 *  d.c.b.m.e.t.a
 *  d.c.b.m.e.t.c
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.TreeMap
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.b.m.e.k;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import d.c.a.d.j.f0;
import d.c.b.m.e.k.a0;
import d.c.b.m.e.k.c1;
import d.c.b.m.e.k.d0;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.i0;
import d.c.b.m.e.k.j0;
import d.c.b.m.e.k.l0;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.o0;
import d.c.b.m.e.k.q;
import d.c.b.m.e.k.r;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.k.s;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.u;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.k.z0;
import d.c.b.m.e.l.b;
import d.c.b.m.e.m.b;
import d.c.b.m.e.m.f;
import d.c.b.m.e.m.g;
import d.c.b.m.e.m.i;
import d.c.b.m.e.m.t;
import d.c.b.m.e.m.v;
import d.c.b.m.e.p.b;
import d.c.b.m.e.q.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis.
 */
public class t {
    public static final Comparator<File> A;
    public static final Pattern B;
    public static final Map<String, String> C;
    public static final String[] D;
    public static final FilenameFilter x;
    public static final FilenameFilter y;
    public static final Comparator<File> z;
    public final Context a;
    public final m0 b;
    public final i0 c;
    public final z0 d;
    public final d.c.b.m.e.k.h e;
    public final d.c.b.m.e.n.c f;
    public final r0 g;
    public final d.c.b.m.e.o.h h;
    public final d.c.b.m.e.k.b i;
    public final b.b j;
    public final j k;
    public final d.c.b.m.e.l.b l;
    public final d.c.b.m.e.q.a m;
    public final b.a n;
    public final d.c.b.m.e.a o;
    public final d.c.b.m.e.t.d p;
    public final String q;
    public final d.c.b.m.e.i.a r;
    public final x0 s;
    public l0 t;
    public d.c.a.d.j.i<Boolean> u;
    public d.c.a.d.j.i<Boolean> v;
    public d.c.a.d.j.i<Void> w;

    public static {
        x = new a("BeginSession");
        y = new FilenameFilter(){

            public boolean accept(File file, String string) {
                return string.length() == 39 && string.endsWith(".cls");
            }
        };
        z = new Comparator<File>(){

            public int compare(Object object, Object object2) {
                File file = (File)object;
                return ((File)object2).getName().compareTo(file.getName());
            }
        };
        A = new Comparator<File>(){

            public int compare(Object object, Object object2) {
                File file = (File)object;
                File file2 = (File)object2;
                return file.getName().compareTo(file2.getName());
            }
        };
        B = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
        C = Collections.singletonMap((Object)"X-CRASHLYTICS-SEND-FLAGS", (Object)"1");
        D = new String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    }

    public t(Context context, d.c.b.m.e.k.h h2, d.c.b.m.e.n.c c2, r0 r02, m0 m02, d.c.b.m.e.o.h h3, i0 i02, d.c.b.m.e.k.b b2, d.c.b.m.e.q.a a2, b.b b3, d.c.b.m.e.a a3, d.c.b.m.e.i.a a4, d.c.b.m.e.s.e e2) {
        d.c.b.m.e.l.b b4;
        j j2;
        x0 x02;
        z0 z02;
        new AtomicInteger(0);
        this.u = new d.c.a.d.j.i();
        this.v = new d.c.a.d.j.i();
        this.w = new d.c.a.d.j.i();
        new AtomicBoolean(false);
        this.a = context;
        this.e = h2;
        this.f = c2;
        this.g = r02;
        this.b = m02;
        this.h = h3;
        this.c = i02;
        this.i = b2;
        this.j = new d0(this);
        this.o = a3;
        this.q = b2.g.a();
        this.r = a4;
        this.d = z02 = new z0();
        this.k = j2 = new /* Unavailable Anonymous Inner Class!! */;
        this.l = b4 = new b(context, (b.b)j2);
        this.m = new d.c.b.m.e.q.a((b.c)new /* Unavailable Anonymous Inner Class!! */);
        this.n = new /* Unavailable Anonymous Inner Class!! */;
        d.c.b.m.e.t.d[] arrd = new d.c.b.m.e.t.d[]{new d.c.b.m.e.t.c(10)};
        d.c.b.m.e.t.a a5 = new d.c.b.m.e.t.a(1024, arrd);
        this.p = a5;
        File file = new File(new File(h3.a.getFilesDir(), ".com.google.firebase.crashlytics").getPath());
        j0 j02 = new j0(context, r02, b2, a5);
        d.c.b.m.e.o.g g2 = new d.c.b.m.e.o.g(file, e2);
        d.c.a.b.j.n.b(context);
        d.c.a.b.g g3 = d.c.a.b.j.n.a().c((d.c.a.b.j.d)new d.c.a.b.i.a(d.c.b.m.e.r.c.c, d.c.b.m.e.r.c.d));
        d.c.a.b.b b6 = new d.c.a.b.b("json");
        d.c.a.b.e<v, byte[]> e3 = d.c.b.m.e.r.c.e;
        d.c.b.m.e.r.c c3 = new d.c.b.m.e.r.c((d.c.a.b.f<v>)((d.c.a.b.j.j)g3).a("FIREBASE_CRASHLYTICS_REPORT", v.class, b6, e3), e3);
        this.s = x02 = new x0(j02, g2, c3, b4, z02);
    }

    public static void a(t t2) {
        String string;
        String string2;
        Objects.requireNonNull((Object)t2);
        long l2 = t.j();
        new d.c.b.m.e.k.f(t2.g);
        String string3 = d.c.b.m.e.k.f.b;
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Opening a new session with ID ");
        stringBuilder.append(string3);
        b2.b(stringBuilder.toString());
        t2.o.a(string3);
        Locale locale = Locale.US;
        String string4 = String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"17.3.0"});
        q q2 = new q(t2, string3, string4, l2);
        t2.y(string3, "BeginSession", q2);
        t2.o.g(string3, string4, l2);
        r0 r02 = t2.g;
        String string5 = r02.c;
        d.c.b.m.e.k.b b3 = t2.i;
        String string6 = b3.e;
        String string7 = b3.f;
        String string8 = r02.b();
        int n2 = o0.g(t2.i.c).e;
        r r2 = new r(t2, string5, string6, string7, string8, n2);
        t2.y(string3, "SessionApp", r2);
        t2.o.f(string3, string5, string6, string7, string8, n2, t2.q);
        String string9 = Build.VERSION.RELEASE;
        String string10 = Build.VERSION.CODENAME;
        boolean bl = d.c.b.m.e.k.g.s(t2.a);
        t2.y(string3, "SessionOS", new s(t2, string9, string10, bl));
        t2.o.h(string3, string9, string10, bl);
        Context context = t2.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        g.b b4 = g.b.l;
        String string11 = Build.CPU_ABI;
        if (TextUtils.isEmpty(string11)) {
            b2.b("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            String string12 = string11.toLowerCase(locale);
            g.b b6 = (g.b)((Object)g.b.o.get((Object)string12));
            if (b6 != null) {
                b4 = b6;
            }
        }
        int n3 = b4.ordinal();
        String string13 = Build.MODEL;
        int n4 = Runtime.getRuntime().availableProcessors();
        long l3 = d.c.b.m.e.k.g.o();
        long l4 = (long)statFs.getBlockCount() * (long)statFs.getBlockSize();
        boolean bl2 = d.c.b.m.e.k.g.q(context);
        int n5 = d.c.b.m.e.k.g.j(context);
        String string14 = Build.MANUFACTURER;
        String string15 = Build.PRODUCT;
        u u2 = new u(t2, n3, string13, n4, l3, l4, bl2, n5, string14, string15);
        t2.y(string3, "SessionDevice", u2);
        t2.o.d(string3, n3, string13, n4, l3, l4, bl2, n5, string14, string15);
        t2.l.a(string3);
        x0 x02 = t2.s;
        String string16 = t.t(string3);
        j0 j02 = x02.a;
        Objects.requireNonNull((Object)j02);
        b.b b7 = new b.b();
        b7.a = "17.3.0";
        String string17 = j02.c.a;
        Objects.requireNonNull((Object)string17, "Null gmpAppId");
        b7.b = string17;
        String string18 = j02.b.b();
        Objects.requireNonNull((Object)string18, "Null installationUuid");
        b7.d = string18;
        String string19 = j02.c.e;
        Objects.requireNonNull((Object)string19, "Null buildVersion");
        b7.e = string19;
        String string20 = j02.c.f;
        Objects.requireNonNull((Object)string20, "Null displayVersion");
        b7.f = string20;
        b7.c = 4;
        f.b b8 = new f.b();
        b8.b(false);
        b8.c = l2;
        Objects.requireNonNull((Object)string16, "Null identifier");
        b8.b = string16;
        String string21 = j0.e;
        Objects.requireNonNull((Object)string21, "Null generator");
        b8.a = string21;
        String string22 = j02.b.c;
        Objects.requireNonNull((Object)string22, "Null identifier");
        String string23 = j02.c.e;
        Objects.requireNonNull((Object)string23, "Null version");
        String string24 = j02.c.f;
        String string25 = j02.b.b();
        String string26 = j02.c.g.a();
        if (string26 != null) {
            string = string26;
            string2 = "Unity";
        } else {
            string2 = null;
            string = null;
        }
        d.c.b.m.e.m.g g2 = new d.c.b.m.e.m.g(string22, string23, string24, null, string25, string2, string, null);
        b8.f = g2;
        Integer n6 = 3;
        Objects.requireNonNull((Object)string9, "Null version");
        Objects.requireNonNull((Object)string10, "Null buildVersion");
        Boolean bl3 = d.c.b.m.e.k.g.s(j02.a);
        String string27 = n6 == null ? " platform" : "";
        if (bl3 == null) {
            string27 = d.a.b.a.a.m((String)string27, (String)" jailbroken");
        }
        if (string27.isEmpty()) {
            Integer n7;
            d.c.b.m.e.m.t t4 = new d.c.b.m.e.m.t(n6.intValue(), string9, string10, bl3.booleanValue(), null);
            b8.h = t4;
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            boolean bl4 = TextUtils.isEmpty(string11);
            int n8 = 7;
            if (!bl4 && (n7 = j0.f.get(string11.toLowerCase(locale))) != null) {
                n8 = n7;
            }
            int n9 = Runtime.getRuntime().availableProcessors();
            long l5 = d.c.b.m.e.k.g.o();
            long l6 = (long)statFs2.getBlockCount() * (long)statFs2.getBlockSize();
            boolean bl5 = d.c.b.m.e.k.g.q(j02.a);
            int n10 = d.c.b.m.e.k.g.j(j02.a);
            i.b b9 = new i.b();
            b9.a = n8;
            Objects.requireNonNull((Object)string13, "Null model");
            b9.b = string13;
            b9.c = n9;
            b9.d = l5;
            b9.e = l6;
            b9.f = bl5;
            b9.g = n10;
            Objects.requireNonNull((Object)string14, "Null manufacturer");
            b9.h = string14;
            Objects.requireNonNull((Object)string15, "Null modelClass");
            b9.i = string15;
            b8.i = b9.a();
            b8.k = 3;
            b7.g = b8.a();
            v v2 = b7.a();
            d.c.b.m.e.o.g g3 = x02.b;
            Objects.requireNonNull((Object)g3);
            v.d d3 = v2.h();
            if (d3 == null) {
                b2.b("Could not get session for report");
                return;
            }
            String string28 = d3.g();
            try {
                File file = g3.h(string28);
                d.c.b.m.e.o.g.i(file);
                String string29 = d.c.b.m.e.o.g.i.g(v2);
                d.c.b.m.e.o.g.l(new File(file, "report"), string29);
                return;
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Could not persist report for session ");
                stringBuilder2.append(string28);
                b2.c(stringBuilder2.toString(), iOException);
                return;
            }
        }
        throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string27));
    }

    /*
     * Exception decompiling
     */
    public static d.c.a.d.j.h b(t var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl43 : ILOAD : trying to set 1 previously set to 0
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void c(String string, File file) {
        void var4_10;
        FileOutputStream fileOutputStream;
        d.c.b.m.e.p.c c2;
        block5 : {
            if (string == null) {
                return;
            }
            c2 = null;
            fileOutputStream = new FileOutputStream(file, true);
            try {
                c2 = d.c.b.m.e.p.c.n(fileOutputStream);
                d.c.b.m.e.p.a a2 = d.c.b.m.e.p.a.a(string);
                c2.z(7, 2);
                int n2 = d.c.b.m.e.p.c.e(2, a2);
                c2.w(n2 + (d.c.b.m.e.p.c.j(5) + d.c.b.m.e.p.c.i(n2)));
                c2.z(5, 2);
                c2.w(n2);
                c2.t(2, a2);
            }
            catch (Throwable throwable) {}
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Failed to flush to append to ");
            stringBuilder.append(file.getPath());
            d.c.b.m.e.k.g.g(c2, stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to close ");
            stringBuilder2.append(file.getPath());
            d.c.b.m.e.k.g.c(fileOutputStream, stringBuilder2.toString());
            return;
            break block5;
            catch (Throwable throwable) {
                fileOutputStream = null;
            }
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Failed to flush to append to ");
        stringBuilder.append(file.getPath());
        d.c.b.m.e.k.g.g(c2, stringBuilder.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Failed to close ");
        stringBuilder3.append(file.getPath());
        d.c.b.m.e.k.g.c(fileOutputStream, stringBuilder3.toString());
        throw var4_10;
    }

    public static void e(InputStream inputStream, d.c.b.m.e.p.c c2, int n2) {
        int n3;
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2 && (n3 = inputStream.read(arrby, i2, n2 - i2)) >= 0; i2 += n3) {
        }
        Objects.requireNonNull((Object)c2);
        int n4 = c2.f;
        int n5 = c2.g;
        int n6 = n4 - n5;
        if (n6 >= n2) {
            System.arraycopy(arrby, 0, c2.e, n5, n2);
            c2.g = n2 + c2.g;
            return;
        }
        System.arraycopy(arrby, 0, c2.e, n5, n6);
        int n7 = n6 + 0;
        int n8 = n2 - n6;
        c2.g = c2.f;
        c2.r();
        if (n8 <= c2.f) {
            System.arraycopy(arrby, n7, c2.e, 0, n8);
            c2.g = n8;
            return;
        }
        c2.h.write(arrby, n7, n8);
    }

    public static long j() {
        return new Date().getTime() / 1000L;
    }

    public static String o(File file) {
        return file.getName().substring(0, 35);
    }

    public static File[] r(File file, FilenameFilter filenameFilter) {
        File[] arrfile = file.listFiles(filenameFilter);
        if (arrfile == null) {
            arrfile = new File[]{};
        }
        return arrfile;
    }

    public static String t(String string) {
        return string.replaceAll("-", "");
    }

    public static void w(d.c.b.m.e.p.c c2, File[] arrfile, String string) {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        Arrays.sort((Object[])arrfile, d.c.b.m.e.k.g.c);
        for (File file : arrfile) {
            try {
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{string, file.getName()};
                b2.b(String.format(locale, "Found Non Fatal for session ID %s in %s ", arrobject));
                t.z(c2, file);
            }
            catch (Exception exception) {
                if (!b2.a(6)) continue;
                Log.e("FirebaseCrashlytics", "Error writting non-fatal to session.", exception);
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void z(d.c.b.m.e.p.c c2, File file) {
        void var4_8;
        FileInputStream fileInputStream;
        block5 : {
            if (!file.exists()) {
                d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
                StringBuilder stringBuilder = d.a.b.a.a.d((String)"Tried to include a file that doesn't exist: ");
                stringBuilder.append(file.getName());
                b2.d(stringBuilder.toString());
                return;
            }
            fileInputStream = null;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                t.e((InputStream)fileInputStream2, c2, (int)file.length());
            }
            catch (Throwable throwable) {
                fileInputStream = fileInputStream2;
                break block5;
            }
            d.c.b.m.e.k.g.c(fileInputStream2, "Failed to close file input stream.");
            return;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        d.c.b.m.e.k.g.c(fileInputStream, "Failed to close file input stream.");
        throw var4_8;
    }

    public final void d(d.c.b.m.e.p.b b2) {
        if (b2 == null) {
            return;
        }
        try {
            b2.a();
            return;
        }
        catch (IOException iOException) {
            if (d.c.b.m.e.b.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Error closing session file stream in the presence of an exception", iOException);
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void f(int var1_1, boolean var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 4 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
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

    public final void g(long l2) {
        try {
            File file = this.l();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".ae");
            stringBuilder.append(l2);
            new File(file, stringBuilder.toString()).createNewFile();
            return;
        }
        catch (IOException iOException) {
            d.c.b.m.e.b.a.b("Could not write app exception marker.");
            return;
        }
    }

    public boolean h(int n2) {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        this.e.a();
        if (this.p()) {
            b2.b("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        b2.b("Finalizing previously open sessions.");
        try {
            this.f(n2, true);
        }
        catch (Exception exception) {
            if (b2.a(6)) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", exception);
            }
            return false;
        }
        b2.b("Closed all previously open sessions");
        return true;
    }

    public final String i() {
        File[] arrfile = this.s();
        if (arrfile.length > 0) {
            return t.o(arrfile[0]);
        }
        return null;
    }

    public File k() {
        return new File(this.l(), "fatal-sessions");
    }

    public File l() {
        return this.h.a();
    }

    public File m() {
        return new File(this.l(), "native-sessions");
    }

    public File n() {
        return new File(this.l(), "nonfatal-sessions");
    }

    public boolean p() {
        l0 l02 = this.t;
        return l02 != null && l02.d.get();
    }

    public File[] q() {
        FilenameFilter filenameFilter;
        LinkedList linkedList = new LinkedList();
        File file = this.k();
        Object[] arrobject = file.listFiles(filenameFilter = y);
        if (arrobject == null) {
            arrobject = new File[]{};
        }
        Collections.addAll(linkedList, arrobject);
        Object[] arrobject2 = this.n().listFiles(filenameFilter);
        if (arrobject2 == null) {
            arrobject2 = new File[]{};
        }
        Collections.addAll(linkedList, arrobject2);
        Collections.addAll(linkedList, (Object[])t.r(this.l(), filenameFilter));
        return (File[])linkedList.toArray(new File[linkedList.size()]);
    }

    public final File[] s() {
        FilenameFilter filenameFilter = x;
        Object[] arrobject = t.r(this.l(), filenameFilter);
        Arrays.sort((Object[])arrobject, z);
        return arrobject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d.c.a.d.j.h<Void> u(float f2, d.c.a.d.j.h<d.c.b.m.e.s.i.b> h2) {
        Boolean bl;
        Object object;
        f0 f02;
        boolean bl2;
        f0 f03;
        d.c.b.m.e.b b2;
        block10 : {
            block9 : {
                bl = Boolean.FALSE;
                b2 = d.c.b.m.e.b.a;
                d.c.b.m.e.q.a a2 = this.m;
                File[] arrfile = (a2.a).a.q();
                File[] arrfile2 = (a2.a).a.m().listFiles();
                if (arrfile2 == null) {
                    arrfile2 = new File[]{};
                }
                if (arrfile != null && arrfile.length > 0) break block9;
                int n2 = arrfile2.length;
                bl2 = false;
                if (n2 <= 0) break block10;
            }
            bl2 = true;
        }
        if (!bl2) {
            b2.b("No reports are available.");
            this.u.b((Object)bl);
            return d.c.a.d.b.a.l(null);
        }
        b2.b("Unsent reports are available.");
        Boolean bl3 = Boolean.TRUE;
        if (this.b.a()) {
            b2.b("Automatic data collection is enabled. Allowing upload.");
            this.u.b((Object)bl);
            f02 = d.c.a.d.b.a.l(bl3);
            return f02.o((d.c.a.d.j.g)new e(this, h2, f2));
        }
        b2.b("Automatic data collection is disabled.");
        b2.b("Notifying that unsent reports are available.");
        this.u.b((Object)bl3);
        m0 m02 = this.b;
        Object object2 = object = m02.c;
        synchronized (object2) {
            f03 = m02.d.a;
        }
        d.c.a.d.j.h h3 = f03.o((d.c.a.d.j.g)new a0(this));
        b2.b("Waiting for send/deleteUnsentReports to be called.");
        f0 f04 = this.v.a;
        d.c.a.d.j.i i2 = new d.c.a.d.j.i();
        c1 c12 = new c1(i2);
        h3.f((d.c.a.d.j.a)c12);
        f04.f((d.c.a.d.j.a)c12);
        f02 = i2.a;
        return f02.o((d.c.a.d.j.g)new e(this, h2, f2));
    }

    public final void v(d.c.b.m.e.p.c c2, String string) {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        for (String string2 : D) {
            h h2 = new h(d.a.b.a.a.n((String)string, (String)string2, (String)".cls"));
            File[] arrfile = t.r(this.l(), h2);
            if (arrfile.length == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't find ");
                stringBuilder.append(string2);
                stringBuilder.append(" data for session ID ");
                stringBuilder.append(string);
                b2.b(stringBuilder.toString());
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Collecting ");
            stringBuilder.append(string2);
            stringBuilder.append(" data for session ID ");
            stringBuilder.append(string);
            b2.b(stringBuilder.toString());
            t.z(c2, arrfile[0]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void x(d.c.b.m.e.p.c var1_1, Thread var2_2, Throwable var3_3, long var4_4, String var6_5, boolean var7_6) {
        block16 : {
            var8_7 = new d.c.b.m.e.t.e(var3_3, this.p);
            var9_8 = this.a;
            var10_9 = d.c.b.m.e.k.e.a(var9_8);
            var11_10 = var10_9.a;
            var12_11 = var10_9.b();
            var13_12 = d.c.b.m.e.k.g.l(var9_8);
            var14_13 = var9_8.getResources().getConfiguration().orientation;
            var15_14 = d.c.b.m.e.k.g.o();
            var17_15 = new ActivityManager.MemoryInfo();
            ((ActivityManager)var9_8.getSystemService("activity")).getMemoryInfo(var17_15);
            var18_16 = var15_14 - var17_15.availMem;
            var20_17 = d.c.b.m.e.k.g.a(Environment.getDataDirectory().getPath());
            var22_18 = d.c.b.m.e.k.g.h(var9_8.getPackageName(), var9_8);
            var23_19 = new LinkedList();
            var24_20 = var8_7.c;
            var25_21 = this.i.b;
            var26_22 = this.g.c;
            if (var7_6) {
                var60_23 = Thread.getAllStackTraces();
                var27_24 = new Thread[var60_23.size()];
                var61_25 = var60_23.entrySet().iterator();
                var62_26 = 0;
                while (var61_25.hasNext()) {
                    var64_27 = (Map.Entry)var61_25.next();
                    var27_24[var62_26] = (Thread)var64_27.getKey();
                    var65_28 = this.p;
                    var66_29 = var64_27.getValue();
                    var67_30 = var27_24;
                    var23_19.add((Object)var65_28.a((StackTraceElement[])var66_29));
                    ++var62_26;
                    var27_24 = var67_30;
                }
            } else {
                var27_24 = new Thread[]{};
            }
            if (d.c.b.m.e.k.g.i(var9_8, "com.crashlytics.CollectCustomKeys", true)) break block16;
            var28_31 = new TreeMap();
            ** GOTO lbl-1000
        }
        var28_31 = Collections.unmodifiableMap(this.d.b);
        if (var28_31 != null && var28_31.size() > 1) {
            var29_32 = new TreeMap((Map)var28_31);
        } else lbl-1000: // 2 sources:
        {
            var29_32 = var28_31;
        }
        var30_33 = this.l.c.e();
        var32_34 = d.c.b.m.e.p.a.a(var26_22);
        var33_35 = var25_21 == null ? null : d.c.b.m.e.p.a.a(var25_21.replace((CharSequence)"-", (CharSequence)""));
        if (var30_33 != null) {
            var58_36 = var30_33.length;
            var34_37 = var33_35;
            var59_38 = new byte[var58_36];
            var35_39 = "";
            System.arraycopy((Object)var30_33, 0, (Object)var59_38, 0, (int)var58_36);
            var36_40 = new d.c.b.m.e.p.a(var59_38);
        } else {
            var34_37 = var33_35;
            var35_39 = "";
            d.c.b.m.e.b.a.b("No log data to include with this event.");
            var36_40 = null;
        }
        var1_1.z(10, 2);
        var37_41 = 0 + d.c.b.m.e.p.c.m(1, var4_4) + d.c.b.m.e.p.c.e(2, d.c.b.m.e.p.a.a(var6_5));
        var38_42 = var36_40;
        var39_43 = var35_39;
        var40_44 = var27_24;
        var41_45 = var27_24;
        var42_46 = d.c.b.m.e.p.d.f(var8_7, var2_2, var24_20, var40_44, (List<StackTraceElement[]>)var23_19, 8, var32_34, var34_37, (Map<String, String>)var29_32, var22_18, var14_13);
        var43_47 = var37_41 + (var42_46 + (d.c.b.m.e.p.c.j(3) + d.c.b.m.e.p.c.i(var42_46)));
        var44_48 = d.c.b.m.e.p.d.g(var11_10, var12_11, var13_12, var14_13, var18_16, var20_17);
        var45_49 = var43_47 + (var44_48 + (d.c.b.m.e.p.c.j(5) + d.c.b.m.e.p.c.i(var44_48)));
        if (var38_42 != null) {
            var57_50 = d.c.b.m.e.p.c.e(1, var38_42);
            var45_49 += var57_50 + (d.c.b.m.e.p.c.j(6) + d.c.b.m.e.p.c.i(var57_50));
        }
        var1_1.w(var45_49);
        var1_1.C(1, var4_4);
        var1_1.t(2, d.c.b.m.e.p.a.a(var6_5));
        var1_1.z(3, 2);
        var46_51 = var34_37;
        var1_1.w(d.c.b.m.e.p.d.f(var8_7, var2_2, var24_20, var41_45, (List<StackTraceElement[]>)var23_19, 8, var32_34, var46_51, (Map<String, String>)var29_32, var22_18, var14_13));
        var1_1.z(1, 2);
        var1_1.w(d.c.b.m.e.p.d.e(var8_7, var2_2, var24_20, var41_45, (List<StackTraceElement[]>)var23_19, 8, var32_34, var46_51));
        d.c.b.m.e.p.d.m(var1_1, var2_2, var24_20, 4, true);
        var47_52 = var41_45.length;
        for (var48_53 = 0; var48_53 < var47_52; ++var48_53) {
            d.c.b.m.e.p.d.m(var1_1, var41_45[var48_53], (StackTraceElement[])var23_19.get(var48_53), 0, false);
        }
        d.c.b.m.e.p.d.l(var1_1, var8_7, 1, 8, 2);
        var1_1.z(3, 2);
        var1_1.w(d.c.b.m.e.p.d.d());
        var49_54 = d.c.b.m.e.p.d.a;
        var1_1.t(1, var49_54);
        var1_1.t(2, var49_54);
        var1_1.C(3, 0L);
        var1_1.z(4, 2);
        var50_55 = var34_37;
        var1_1.w(d.c.b.m.e.p.d.a(var32_34, var50_55));
        var1_1.C(1, 0L);
        var1_1.C(2, 0L);
        var1_1.t(3, var32_34);
        if (var50_55 != null) {
            var1_1.t(4, var50_55);
        }
        if (var29_32 != null && !var29_32.isEmpty()) {
            for (Map.Entry var55_57 : var29_32.entrySet()) {
                var1_1.z(2, 2);
                var1_1.w(d.c.b.m.e.p.d.b((String)var55_57.getKey(), (String)var55_57.getValue()));
                var1_1.t(1, d.c.b.m.e.p.a.a((String)var55_57.getKey()));
                var56_58 = (String)var55_57.getValue();
                if (var56_58 == null) {
                    var56_58 = var39_43;
                }
                var1_1.t(2, d.c.b.m.e.p.a.a(var56_58));
            }
        }
        if (var22_18 != null) {
            var53_59 = var22_18.importance != 100;
            var1_1.s(3, var53_59);
        }
        var1_1.A(4, var14_13);
        var1_1.z(5, 2);
        var1_1.w(d.c.b.m.e.p.d.g(var11_10, var12_11, var13_12, var14_13, var18_16, var20_17));
        if (var11_10 != null) {
            var51_60 = var11_10.floatValue();
            var1_1.w(13);
            var52_61 = Float.floatToRawIntBits((float)var51_60);
            var1_1.v(var52_61 & 255);
            var1_1.v(255 & var52_61 >> 8);
            var1_1.v(255 & var52_61 >> 16);
            var1_1.v(255 & var52_61 >> 24);
        }
        var1_1.w(16);
        var1_1.w(var12_11 << 1 ^ var12_11 >> 31);
        var1_1.s(3, var13_12);
        var1_1.A(4, var14_13);
        var1_1.C(5, var18_16);
        var1_1.C(6, var20_17);
        if (var38_42 != null) {
            var1_1.z(6, 2);
            var1_1.w(d.c.b.m.e.p.c.e(1, var38_42));
            var1_1.t(1, var38_42);
        }
        this.l.c.b();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void y(String string, String string2, g g2) {
        Throwable throwable;
        d.c.b.m.e.p.c c2;
        d.c.b.m.e.p.b b2;
        block6 : {
            d.c.b.m.e.p.c c3;
            c2 = null;
            File file = this.l();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(string2);
            b2 = new d.c.b.m.e.p.b(file, stringBuilder.toString());
            try {
                c3 = d.c.b.m.e.p.c.n(b2);
            }
            catch (Throwable throwable2) {
                c2 = null;
                break block6;
            }
            try {
                g2.a(c3);
            }
            catch (Throwable throwable3) {
                c2 = c3;
                break block6;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Failed to flush to session ");
            stringBuilder2.append(string2);
            stringBuilder2.append(" file.");
            d.c.b.m.e.k.g.g(c3, stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Failed to close session ");
            stringBuilder3.append(string2);
            stringBuilder3.append(" file.");
            d.c.b.m.e.k.g.c(b2, stringBuilder3.toString());
            return;
            catch (Throwable throwable4) {
                throwable = throwable4;
                b2 = null;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to flush to session ");
        stringBuilder.append(string2);
        stringBuilder.append(" file.");
        d.c.b.m.e.k.g.g(c2, stringBuilder.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("Failed to close session ");
        stringBuilder4.append(string2);
        stringBuilder4.append(" file.");
        d.c.b.m.e.k.g.c(b2, stringBuilder4.toString());
        throw throwable;
    }

    public static class f
    implements FilenameFilter {
        public f(a a2) {
        }

        public boolean accept(File file, String string) {
            return !(t.y).accept(file, string) && t.B.matcher((CharSequence)string).matches();
        }
    }

    public interface g {
        void a(d.c.b.m.e.p.c var1);
    }

    public static class h
    implements FilenameFilter {
        public final String a;

        public h(String string) {
            this.a = string;
        }

        public boolean accept(File file, String string) {
            return string.contains(this.a) && !string.endsWith(".cls_temp");
        }
    }

    public static class i
    implements FilenameFilter {
        public boolean accept(File file, String string) {
            return (d.c.b.m.e.p.b.h).accept(file, string) || string.contains("SessionMissingBinaryImages");
            {
            }
        }
    }

    public static final class m
    implements Runnable {
        public final Context e;
        public final d.c.b.m.e.q.c.c f;
        public final d.c.b.m.e.q.b g;
        public final boolean h;

        public m(Context context, d.c.b.m.e.q.c.c c2, d.c.b.m.e.q.b b2, boolean bl) {
            this.e = context;
            this.f = c2;
            this.g = b2;
            this.h = bl;
        }

        public void run() {
            if (!d.c.b.m.e.k.g.b(this.e)) {
                return;
            }
            d.c.b.m.e.b.a.b("Attempting to send crash report at time of crash...");
            this.g.a(this.f, this.h);
        }
    }

    public static class n
    implements FilenameFilter {
        public final String a;

        public n(String string) {
            this.a = string;
        }

        public boolean accept(File file, String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(".cls");
            if (string.equals(stringBuilder.toString())) {
                return false;
            }
            boolean bl = string.contains(this.a);
            boolean bl2 = false;
            if (bl) {
                boolean bl3 = string.endsWith(".cls_temp");
                bl2 = !bl3;
            }
            return bl2;
        }
    }

}

