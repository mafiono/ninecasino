/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Messenger
 *  android.util.Log
 *  c.e.h
 *  d.c.a.d.c.a0
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.c;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import c.e.h;
import d.c.a.d.c.a0;
import d.c.a.d.c.d;
import d.c.a.d.c.t;
import d.c.a.d.j.f0;
import d.c.a.d.j.i;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class c {
    public static int h;
    public static PendingIntent i;
    @GuardedBy(value="responseCallbacks")
    public final h<String, i<Bundle>> a = new h();
    public final Context b;
    public final t c;
    public final ScheduledExecutorService d;
    public Messenger e;
    public Messenger f;
    public d g;

    public c(Context context) {
        this.b = context;
        this.c = new t(context);
        this.e = new Messenger((Handler)new a0(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, Bundle bundle) {
        h<String, i<Bundle>> h2;
        h<String, i<Bundle>> h3 = h2 = this.a;
        synchronized (h3) {
            i i2 = (i)this.a.remove((Object)string);
            if (i2 != null) {
                i2.a.r((Object)bundle);
                return;
            }
            String string2 = String.valueOf(string);
            String string3 = string2.length() != 0 ? "Missing callback for ".concat(string2) : "Missing callback for ";
            Log.w("Rpc", string3);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final d.c.a.d.j.h<Bundle> b(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl185 : ALOAD_0 : trying to set 1 previously set to 0
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

