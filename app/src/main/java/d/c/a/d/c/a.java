/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.c.p
 *  d.c.a.d.d.p.i.a
 *  d.c.a.d.j.h
 *  d.c.b.r.f
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.a.d.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import d.c.a.d.c.f;
import d.c.a.d.c.g;
import d.c.a.d.c.p;
import d.c.a.d.c.s;
import d.c.a.d.j.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class a
extends BroadcastReceiver {
    public final ExecutorService a;

    public a() {
        d.c.a.d.d.p.i.a a2 = new d.c.a.d.d.p.i.a("firebase-iid-executor");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory)a2);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /*
     * Exception decompiling
     */
    public final int a(Context var1, Intent var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl15 : ALOAD_2 : trying to set 1 previously set to 0
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
    public final int b(Context context, Intent intent) {
        Object object;
        void var13_17;
        int n2;
        block12 : {
            void var11_13;
            Bundle bundle = intent.getExtras();
            n2 = 500;
            if (bundle == null) {
                return n2;
            }
            String string = intent.getStringExtra("google.message_id");
            if (TextUtils.isEmpty(string)) {
                object = d.c.a.d.b.a.l(null);
            } else {
                int n3;
                g g2;
                Bundle bundle2 = new Bundle();
                bundle2.putString("google.message_id", string);
                g g3 = g2 = g.a(context);
                synchronized (g3) {
                    n3 = g2.d;
                    g2.d = n3 + 1;
                }
                object = g2.b(new p(n3, bundle2));
            }
            try {
                n2 = (Integer)d.c.a.d.b.a.a(new d.c.b.r.f(context).b(intent));
                break block12;
            }
            catch (InterruptedException interruptedException) {
            }
            catch (ExecutionException executionException) {
                // empty catch block
            }
            Log.e("FirebaseInstanceId", "Failed to send message to service.", (Throwable)var11_13);
        }
        try {
            d.c.a.d.b.a.b(object, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
            return n2;
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        String string = String.valueOf((Object)var13_17);
        d.a.b.a.a.g((int)(20 + string.length()), (String)"Message ack failed: ", (String)string, (String)"CloudMessagingReceiver");
        return n2;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean bl = this.isOrderedBroadcast();
        PendingResult pendingResult = this.goAsync();
        ExecutorService executorService = this.a;
        f f2 = new f(this, intent, context, bl, pendingResult);
        executorService.execute(f2);
    }
}

