/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.w;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import d.c.b.r.q;
import d.c.b.w.b0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c0
implements Runnable {
    public static final Object j = new Object();
    public static Boolean k;
    public static Boolean l;
    public final Context e;
    public final q f;
    public final PowerManager.WakeLock g;
    public final b0 h;
    public final long i;

    public c0(b0 b02, Context context, q q2, long l2) {
        this.h = b02;
        this.e = context;
        this.i = l2;
        this.f = q2;
        this.g = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(Context context) {
        Object object;
        Object object2 = object = j;
        synchronized (object2) {
            Boolean bl;
            Boolean bl2 = l;
            boolean bl3 = bl2 == null ? c0.c(context, "android.permission.ACCESS_NETWORK_STATE", bl2) : bl2;
            l = bl = Boolean.valueOf(bl3);
            return bl;
        }
    }

    public static boolean c(Context context, String string, Boolean bl) {
        if (bl != null) {
            return bl;
        }
        boolean bl2 = context.checkCallingOrSelfPermission(string) == 0;
        if (!bl2 && Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder stringBuilder = new StringBuilder(142 + string.length());
            stringBuilder.append("Missing Permission: ");
            stringBuilder.append(string);
            stringBuilder.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            Log.d("FirebaseMessaging", stringBuilder.toString());
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(Context context) {
        Object object;
        Object object2 = object = j;
        synchronized (object2) {
            Boolean bl;
            Boolean bl2 = k;
            boolean bl3 = bl2 == null ? c0.c(context, "android.permission.WAKE_LOCK", bl2) : bl2;
            k = bl = Boolean.valueOf(bl3);
            return bl;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e() {
        c0 c02 = this;
        synchronized (c02) {
            ConnectivityManager connectivityManager = (ConnectivityManager)this.e.getSystemService("connectivity");
            if (connectivityManager == null) return false;
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null) return false;
            boolean bl = networkInfo.isConnected();
            return bl;
        }
    }

    /*
     * Exception decompiling
     */
    @SuppressLint(value={"Wakelock"})
    public void run() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl33 : RETURN : trying to set 0 previously set to 1
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

    public class a
    extends BroadcastReceiver {
        public c0 a;

        public a(c0 c03) {
            this.a = c03;
        }

        public void a() {
            if (c0.a()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            c0.this.e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            a a2 = this;
            synchronized (a2) {
                block7 : {
                    c0 c02;
                    block6 : {
                        c02 = this.a;
                        if (c02 != null) break block6;
                        return;
                    }
                    boolean bl = c02.e();
                    if (bl) break block7;
                    return;
                }
                if (c0.a()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                c0 c03 = this.a;
                c03.h.f.schedule(c03, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
                return;
            }
        }
    }

}

