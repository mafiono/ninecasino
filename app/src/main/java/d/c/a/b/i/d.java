/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.util.SparseArray
 *  d.a.b.a.a
 *  d.b.g0.a
 *  d.c.a.b.i.e.o
 *  d.c.a.b.i.e.o$a
 *  d.c.a.b.j.f
 *  d.c.a.b.j.f$a
 *  d.c.a.b.j.q.f
 *  d.c.a.b.j.q.g
 *  d.c.a.b.j.q.m
 *  d.c.b.o.i.d
 *  d.c.b.o.i.e
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.util.Calendar
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 */
package d.c.a.b.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import d.c.a.b.i.a;
import d.c.a.b.i.e.b;
import d.c.a.b.i.e.o;
import d.c.a.b.j.f;
import d.c.a.b.j.q.f;
import d.c.a.b.j.q.g;
import d.c.a.b.j.q.m;
import d.c.b.o.i.e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class d
implements m {
    public final d.c.b.o.a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final d.c.a.b.j.v.a e;
    public final d.c.a.b.j.v.a f;
    public final int g;

    public d(Context context, d.c.a.b.j.v.a a2, d.c.a.b.j.v.a a3) {
        e e2 = new e();
        ((b)b.a).a(e2);
        e2.d = true;
        this.a = new d.c.b.o.i.d(e2);
        this.c = context;
        this.b = (ConnectivityManager)context.getSystemService("connectivity");
        this.d = d.c(a.c);
        this.e = a3;
        this.f = a2;
        this.g = 40000;
    }

    public static URL c(String string) {
        try {
            URL uRL = new URL(string);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalArgumentException(d.a.b.a.a.m((String)"Invalid url: ", (String)string), (Throwable)malformedURLException);
        }
    }

    public d.c.a.b.j.f a(d.c.a.b.j.f f2) {
        f.a a2;
        int n2;
        int n3;
        block6 : {
            block4 : {
                block5 : {
                    NetworkInfo networkInfo = this.b.getActiveNetworkInfo();
                    a2 = f2.i();
                    int n4 = Build.VERSION.SDK_INT;
                    a2.c().put((Object)"sdk-version", (Object)String.valueOf(n4));
                    String string = Build.MODEL;
                    a2.c().put((Object)"model", (Object)string);
                    String string2 = Build.HARDWARE;
                    a2.c().put((Object)"hardware", (Object)string2);
                    String string3 = Build.DEVICE;
                    a2.c().put((Object)"device", (Object)string3);
                    String string4 = Build.PRODUCT;
                    a2.c().put((Object)"product", (Object)string4);
                    String string5 = Build.ID;
                    a2.c().put((Object)"os-uild", (Object)string5);
                    String string6 = Build.MANUFACTURER;
                    a2.c().put((Object)"manufacturer", (Object)string6);
                    String string7 = Build.FINGERPRINT;
                    a2.c().put((Object)"fingerprint", (Object)string7);
                    Calendar.getInstance();
                    long l2 = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
                    a2.c().put((Object)"tz-offset", (Object)String.valueOf(l2));
                    n2 = -1;
                    int n5 = networkInfo == null ? -1 : networkInfo.getType();
                    a2.c().put((Object)"net-type", (Object)String.valueOf(n5));
                    if (networkInfo == null) break block4;
                    n3 = networkInfo.getSubtype();
                    if (n3 != n2) break block5;
                    n3 = 100;
                    break block6;
                }
                if (o.a.A.get(n3) != null) break block6;
            }
            n3 = 0;
        }
        a2.c().put((Object)"mobile-subtype", (Object)String.valueOf(n3));
        String string = Locale.getDefault().getCountry();
        a2.c().put((Object)"country", (Object)string);
        String string8 = Locale.getDefault().getLanguage();
        a2.c().put((Object)"locale", (Object)string8);
        String string9 = ((TelephonyManager)this.c.getSystemService("phone")).getSimOperator();
        a2.c().put((Object)"mcc_mnc", (Object)string9);
        Context context = this.c;
        try {
            n2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            d.b.g0.a.d((String)"CctTransportBackend", (String)"Unable to find version code for package", (Throwable)nameNotFoundException);
        }
        String string10 = Integer.toString(n2);
        a2.c().put((Object)"application_build", (Object)string10);
        return a2.b();
    }

    /*
     * Exception decompiling
     */
    public g b(f var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl178 : NEW : trying to set 1 previously set to 0
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
}

