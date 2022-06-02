/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.util.Base64
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.c
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.d0
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.a.d.j.v
 *  d.c.b.r.c
 *  d.c.b.r.c0
 *  d.c.b.r.d
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.Queue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b.r;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.a.d.j.v;
import d.c.b.r.a;
import d.c.b.r.b;
import d.c.b.r.b0;
import d.c.b.r.c;
import d.c.b.r.c0;
import d.c.b.r.d;
import d.c.b.r.d0;
import d.c.b.r.g;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class f {
    public static final Object c = new Object();
    @GuardedBy(value="lock")
    public static d0 d;
    public final Context a;
    public final Executor b;

    public f(Context context) {
        this.a = context;
        this.b = a.e;
    }

    public f(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h<Integer> a(Context context, Intent intent) {
        Object object;
        d0 d02;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        Object object2 = object = c;
        synchronized (object2) {
            if (d == null) {
                d = new d0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            d02 = d;
        }
        d0 d03 = d02;
        synchronized (d03) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            d0.a a2 = new d0.a(intent);
            ScheduledExecutorService scheduledExecutorService = d02.c;
            ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(new b0(a2), 9000L, TimeUnit.MILLISECONDS);
            f0 f02 = a2.b.a;
            c0 c02 = new c0(scheduledFuture);
            d.c.a.d.j.d0 d04 = f02.b;
            d04.b((d.c.a.d.j.c0)new v(scheduledExecutorService, (d.c.a.d.j.c)c02));
            f02.t();
            d02.d.add(a2);
            d02.b();
            f0 f03 = a2.b.a;
            return f03.g(g.e, d.a);
        }
    }

    public h<Integer> b(Intent intent) {
        String string = intent.getStringExtra("gcm.rawData64");
        if (string != null) {
            intent.putExtra("rawData", Base64.decode(string, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.a;
        boolean bl = d.c.a.d.b.a.p() && context.getApplicationInfo().targetSdkVersion >= 26;
        int n2 = 268435456 & intent.getFlags();
        boolean bl2 = n2 != 0;
        if (bl && !bl2) {
            return f.a(context, intent);
        }
        return d.c.a.d.b.a.c(this.b, new b(context, intent)).h(this.b, (d.c.a.d.j.a)new c(context, intent));
    }
}

