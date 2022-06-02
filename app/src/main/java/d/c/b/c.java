/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Application
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.UserManager
 *  android.util.Base64
 *  android.util.Log
 *  c.e.a
 *  d.c.a.d.d.l.c.a
 *  d.c.a.d.d.m.c0
 *  d.c.a.d.d.m.l
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.p.f
 *  d.c.b.c$c
 *  d.c.b.l.k
 *  d.c.b.l.s
 *  d.c.b.l.t
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Queue
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import d.c.a.d.d.m.c0;
import d.c.a.d.d.m.l;
import d.c.a.d.d.m.m;
import d.c.a.d.d.p.f;
import d.c.b.c;
import d.c.b.i;
import d.c.b.l.k;
import d.c.b.l.r;
import d.c.b.l.s;
import d.c.b.l.t;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/*
 * Exception performing whole class analysis.
 */
public class c {
    public static final Object i;
    public static final Executor j;
    @GuardedBy(value="LOCK")
    public static final Map<String, c> k;
    public final Context a;
    public final String b;
    public final i c;
    public final k d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final t<d.c.b.u.a> g;
    public final List<b> h;

    public static {
        i = new Object();
        j = new d(null);
        k = new e.a();
    }

    /*
     * Exception decompiling
     */
    public c(Context var1, String var2, i var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl90 : ACONST_NULL : trying to set 1 previously set to 0
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b() {
        Object object;
        Object object2 = object = i;
        synchronized (object2) {
            c c2 = k.get("[DEFAULT]");
            if (c2 != null) {
                return c2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Default FirebaseApp is not initialized in this process ");
            stringBuilder.append(f.a());
            stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c e(Context context, i i2) {
        c c2;
        Object object;
        if (context.getApplicationContext() instanceof Application) {
            c c3;
            Application application = (Application)context.getApplicationContext();
            if (c.a.get() == null && c.a.compareAndSet(null, (Object)(c3 = new /* Unavailable Anonymous Inner Class!! */))) {
                d.c.a.d.d.l.c.a.a((Application)application);
                d.c.a.d.d.l.c.a a2 = d.c.a.d.d.l.c.a.i;
                Objects.requireNonNull(a2);
                d.c.a.d.d.l.c.a a3 = a2;
                synchronized (a3) {
                    a2.g.add((Object)c3);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Object object2 = object = i;
        synchronized (object2) {
            Map<String, c> map = k;
            boolean bl = !map.containsKey("[DEFAULT]");
            m.k((boolean)bl, (Object)"FirebaseApp name [DEFAULT] already exists!");
            m.i((Object)context, (Object)"Application context cannot be null.");
            c2 = new c(context, "[DEFAULT]", i2);
            map.put((Object)"[DEFAULT]", (Object)c2);
        }
        c2.d();
        return c2;
    }

    public final void a() {
        m.k((boolean)(true ^ this.f.get()), (Object)"FirebaseApp was deleted");
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a();
        byte[] arrby = this.b.getBytes(Charset.defaultCharset());
        String string = arrby == null ? null : Base64.encodeToString(arrby, 11);
        stringBuilder.append(string);
        stringBuilder.append("+");
        this.a();
        byte[] arrby2 = this.c.b.getBytes(Charset.defaultCharset());
        String string2 = arrby2 == null ? null : Base64.encodeToString(arrby2, 11);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        block17 : {
            var1_1 = this.a;
            var2_2 = Build.VERSION.SDK_INT < 24 || ((UserManager) var1_1.getSystemService(UserManager.class)).isUserUnlocked();
            if (var2_2 ^ true) {
                var3_3 = new StringBuilder();
                var3_3.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
                this.a();
                var3_3.append(this.b);
                Log.i("FirebaseApp", (String)var3_3.toString());
                var7_4 = this.a;
                if (e.b.get() != null) return;
                var8_5 = new e(var7_4);
                if (e.b.compareAndSet(null, (Object)var8_5) == false) return;
                var7_4.registerReceiver((BroadcastReceiver)var8_5, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            var10_6 = new StringBuilder();
            var10_6.append("Device unlocked: initializing all Firebase APIs for app ");
            this.a();
            var10_6.append(this.b);
            Log.i("FirebaseApp", (String)var10_6.toString());
            var14_7 = this.d;
            var15_8 = this.g();
            for (Map.Entry var31_15 : var14_7.a.entrySet()) {
                var32_10 = (d.c.b.l.d)var31_15.getKey();
                var33_11 = (t)var31_15.getValue();
                var34_12 = var32_10.c;
                var35_13 = var34_12 == 1;
                if (!var35_13) {
                    var36_14 = false;
                    if (var34_12 == 2) {
                        var36_14 = true;
                    }
                    if (!var36_14 || !var15_8) continue;
                }
                var33_11.get();
            }
            var38_17 = var17_16 = var14_7.d;
            // MONITORENTER : var38_17
            var19_18 = var17_16.b;
            if (var19_18 != null) {
                var17_16.b = null;
                // MONITOREXIT : var38_17
                break block17;
            }
            var19_18 = null;
        }
        if (var19_18 == null) return;
        var20_19 = var19_18.iterator();
        block10 : do {
            if (var20_19.hasNext() == false) return;
            var21_20 = (d.c.b.p.a)var20_19.next();
            Objects.requireNonNull(var21_20);
            var38_17 = var17_16;
            // MONITORENTER : var38_17
            var24_21 = var17_16.b;
            if (var24_21 != null) {
                var24_21.add((Object)var21_20);
                // MONITOREXIT : var38_17
                continue;
            }
            // MONITOREXIT : var38_17
            var38_17 = var17_16;
            // MONITORENTER : var38_17
            var27_22 = (Map)var17_16.a.get(null);
            var28_23 = var27_22 == null ? Collections.emptySet() : var27_22.entrySet();
            // MONITOREXIT : var38_17
            var29_24 = var28_23.iterator();
            do {
                if (var29_24.hasNext()) ** break;
                continue block10;
                var30_25 = (Map.Entry)var29_24.next();
                ((Executor)var30_25.getValue()).execute(new r(var30_25, var21_20));
            } while (true);
            break;
        } while (true);
        {
            catch (Throwable var18_26) {}
            {
                // MONITOREXIT : var38_17
                throw var18_26;
            }
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof c)) {
            return false;
        }
        String string = this.b;
        c c2 = (c)object;
        c2.a();
        return string.equals(c2.b);
    }

    public boolean f() {
        d.c.b.u.a a2;
        this.a();
        d.c.b.u.a a3 = a2 = this.g.get();
        synchronized (a3) {
            boolean bl = a2.d;
            return bl;
        }
    }

    public boolean g() {
        this.a();
        return "[DEFAULT]".equals(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        l l2 = new l((Object)this, null);
        l2.a("name", (Object)this.b);
        l2.a("options", (Object)this.c);
        return l2.toString();
    }

    public interface b {
        void a(boolean var1);
    }

    public static class d
    implements Executor {
        public static final Handler e = new Handler(Looper.getMainLooper());

        public d(a a2) {
        }

        public void execute(Runnable runnable) {
            e.post(runnable);
        }
    }

    @TargetApi(value=24)
    public static class e
    extends BroadcastReceiver {
        public static AtomicReference<e> b = new AtomicReference();
        public final Context a;

        public e(Context context) {
            this.a = context;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onReceive(Context context, Intent intent) {
            Object object;
            Object object2 = object = c.i;
            // MONITORENTER : object2
            Iterator iterator = c.k.values().iterator();
            while (iterator.hasNext()) {
                ((c)iterator.next()).d();
            }
            // MONITOREXIT : object2
            {
                catch (Throwable throwable) {}
                {
                    // MONITOREXIT : object2
                    throw throwable;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

}

