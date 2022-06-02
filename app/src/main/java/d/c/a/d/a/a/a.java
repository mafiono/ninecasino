/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.SharedPreferences
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.util.Log
 *  d.c.a.d.d.f
 *  d.c.a.d.d.g
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.o.a
 *  d.c.a.d.g.a.b
 *  d.c.a.d.g.a.d
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.ParametersAreNonnullByDefault
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import d.c.a.d.a.a.c;
import d.c.a.d.d.f;
import d.c.a.d.d.g;
import d.c.a.d.d.m.m;
import d.c.a.d.g.a.d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class a {
    @GuardedBy(value="this")
    public d.c.a.d.d.a a;
    @GuardedBy(value="this")
    public d.c.a.d.g.a.b b;
    @GuardedBy(value="this")
    public boolean c;
    public final Object d = new Object();
    @GuardedBy(value="mAutoDisconnectTaskLock")
    public b e;
    @GuardedBy(value="this")
    public final Context f;
    public final boolean g;
    public final long h;

    public a(Context context, long l2, boolean bl, boolean bl2) {
        Context context2;
        Objects.requireNonNull((Object)context, "null reference");
        if (bl && (context2 = context.getApplicationContext()) != null) {
            context = context2;
        }
        this.f = context;
        this.c = false;
        this.h = l2;
        this.g = bl2;
    }

    public static a b(Context context) {
        boolean bl;
        a a2;
        c c2;
        String string;
        float f2;
        block13 : {
            block12 : {
                block11 : {
                    block10 : {
                        c2 = new c(context);
                        bl = c2.a("gads:ad_id_app_context:enabled");
                        SharedPreferences sharedPreferences = c2.a;
                        if (sharedPreferences == null) break block10;
                        try {
                            float f3;
                            f2 = f3 = sharedPreferences.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
                            break block11;
                        }
                        catch (Throwable throwable) {
                            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", throwable);
                        }
                    }
                    f2 = 0.0f;
                }
                SharedPreferences sharedPreferences = c2.a;
                if (sharedPreferences == null) break block12;
                try {
                    string = sharedPreferences.getString("gads:ad_id_use_shared_preference:experiment_id", "");
                    break block13;
                }
                catch (Throwable throwable) {
                    Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", throwable);
                }
            }
            string = "";
        }
        boolean bl2 = c2.a("gads:ad_id_use_persistent_service:enabled");
        a a3 = new a(context, -1L, bl, bl2);
        try {
            long l2 = SystemClock.elapsedRealtime();
            a3.g(false);
            a2 = a3.c();
            long l3 = SystemClock.elapsedRealtime() - l2;
            a3.h(a2, bl, f2, l3, string, null);
        }
        catch (Throwable throwable) {
            float f4 = f2;
            String string2 = string;
            try {
                a3.h(null, bl, f4, -1L, string2, throwable);
                throw throwable;
            }
            catch (Throwable throwable2) {
                a3.a();
                throw throwable2;
            }
        }
        a3.a();
        return a2;
    }

    public static d.c.a.d.d.a d(Context context, boolean bl) {
        block5 : {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                throw new g(9);
            }
            int n2 = f.b.b(context, 12451000);
            if (n2 != 0 && n2 != 2) {
                throw new IOException("Google Play services not available");
            }
            String string = bl ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            d.c.a.d.d.a a2 = new d.c.a.d.d.a();
            Intent intent = new Intent(string);
            intent.setPackage("com.google.android.gms");
            try {
                d.c.a.d.d.o.a a3 = d.c.a.d.d.o.a.b();
                Objects.requireNonNull(a3);
                context.getClass().getName();
                boolean bl2 = a3.c(context, intent, (ServiceConnection)a2, 1);
                if (!bl2) break block5;
                return a2;
            }
            catch (Throwable throwable) {
                throw new IOException(throwable);
            }
        }
        throw new IOException("Connection failure");
    }

    public static d.c.a.d.g.a.b e(d.c.a.d.d.a a2) {
        try {
            IBinder iBinder = a2.a(10000L, TimeUnit.MILLISECONDS);
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (iInterface instanceof d.c.a.d.g.a.b) {
                return (d.c.a.d.g.a.b)iInterface;
            }
            d d2 = new d(iBinder);
            return d2;
        }
        catch (Throwable throwable) {
            throw new IOException(throwable);
        }
        catch (InterruptedException interruptedException) {
            throw new IOException("Interrupted exception");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        m.g((String)"Calling this from your main thread can lead to deadlock");
        a a2 = this;
        synchronized (a2) {
            d.c.a.d.d.a a3;
            if (this.f != null && (a3 = this.a) != null) {
                try {
                    if (this.c) {
                        d.c.a.d.d.o.a a4 = d.c.a.d.d.o.a.b();
                        Context context = this.f;
                        d.c.a.d.d.a a5 = this.a;
                        Objects.requireNonNull(a4);
                        context.unbindService(a5);
                    }
                }
                catch (Throwable throwable) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", throwable);
                }
                this.c = false;
                this.b = null;
                this.a = null;
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public a c() {
        a a2;
        m.g((String)"Calling this from your main thread can lead to deadlock");
        a a3 = this;
        // MONITORENTER : a3
        if (!this.c) {
            Object object;
            Object object2 = object = this.d;
            // MONITORENTER : object2
            b b2 = this.e;
            if (b2 == null) throw new IOException("AdvertisingIdClient is not connected.");
            if (!b2.h) throw new IOException("AdvertisingIdClient is not connected.");
            // MONITOREXIT : object2
            try {
                this.g(false);
                if (!this.c) throw new IOException("AdvertisingIdClient cannot reconnect.");
            }
            catch (Exception exception) {
                throw new IOException("AdvertisingIdClient cannot reconnect.", exception);
            }
        }
        Objects.requireNonNull((Object)this.a, "null reference");
        Objects.requireNonNull(this.b, "null reference");
        try {
            a2 = new a(this.b.d(), this.b.q(true));
            // MONITOREXIT : a3
        }
        catch (RemoteException remoteException) {
            Log.i("AdvertisingIdClient", "GMS remote exception ", remoteException);
            throw new IOException("Remote exception");
        }
        this.f();
        return a2;
    }

    /*
     * Exception decompiling
     */
    public final void f() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public void finalize() {
        this.a();
        super.finalize();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(boolean bl) {
        m.g((String)"Calling this from your main thread can lead to deadlock");
        a a2 = this;
        synchronized (a2) {
            d.c.a.d.d.a a3;
            if (this.c) {
                this.a();
            }
            this.a = a3 = a.d(this.f, this.g);
            this.b = a.e(a3);
            this.c = true;
            if (bl) {
                this.f();
            }
            return;
        }
    }

    public final boolean h(a a2, boolean bl, float f2, long l2, String string, Throwable throwable) {
        String string2;
        if (Math.random() > (double)f2) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String string3 = "1";
        String string4 = bl ? string3 : "0";
        hashMap.put("app_context", string4);
        if (a2 != null) {
            if (!a2.b) {
                string3 = "0";
            }
            hashMap.put("limit_ad_tracking", string3);
        }
        if (a2 != null && (string2 = a2.a) != null) {
            hashMap.put("ad_id_size", Integer.toString(string2.length()));
        }
        if (throwable != null) {
            hashMap.put("error", throwable.getClass().getName());
        }
        if (string != null && !string.isEmpty()) {
            hashMap.put("experiment_id", string);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(l2));
        new d.c.a.d.a.a.b(hashMap).start();
        return true;
    }

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String string, boolean bl) {
            this.a = string;
            this.b = bl;
        }

        public final String toString() {
            String string = this.a;
            boolean bl = this.b;
            StringBuilder stringBuilder = new StringBuilder(7 + String.valueOf(string).length());
            stringBuilder.append("{");
            stringBuilder.append(string);
            stringBuilder.append("}");
            stringBuilder.append(bl);
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends Thread {
        public WeakReference<a> e;
        public long f;
        public CountDownLatch g;
        public boolean h;

        public b(a a2, long l2) {
            this.e = new WeakReference(a2);
            this.f = l2;
            this.g = new CountDownLatch(1);
            this.h = false;
            this.start();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final void run() {
            a a2;
            try {
                if (this.g.await(this.f, TimeUnit.MILLISECONDS) || (a2 = this.e.get()) == null) return;
            }
            catch (InterruptedException interruptedException) {
                a a3 = this.e.get();
                if (a3 == null) return;
                a3.a();
                this.h = true;
                return;
            }
            a2.a();
            this.h = true;
        }
    }

}

