/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 *  android.util.Log
 *  d.c.a.d.d.p.i.a
 *  d.c.a.d.i.a
 *  d.c.a.d.j.c
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.w.f
 *  d.c.b.w.g$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.w;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import d.c.a.d.j.c;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.b.r.a0;
import d.c.b.r.y;
import d.c.b.w.d;
import d.c.b.w.e;
import d.c.b.w.f;
import d.c.b.w.g;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint(value={"UnwrappedWakefulBroadcastReceiver"})
public abstract class g
extends Service {
    private Binder binder;
    public final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public g() {
        d.c.a.d.d.p.i.a a2 = new d.c.a.d.d.p.i.a("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory)a2);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.lock = new Object();
        this.runningTasks = 0;
    }

    public static /* synthetic */ h access$000(g g2, Intent intent) {
        return g2.processIntent(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void finishTask(Intent intent) {
        Object object;
        if (intent != null) {
            Object object2;
            Object object3 = object2 = y.b;
            synchronized (object3) {
                if (y.c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    y.c.b();
                }
            }
        }
        Object object4 = object = this.lock;
        synchronized (object4) {
            int n2;
            this.runningTasks = n2 = -1 + this.runningTasks;
            if (n2 == 0) {
                this.stopSelfResultHook(this.lastStartId);
            }
            return;
        }
    }

    private h<Void> processIntent(Intent intent) {
        if (this.handleIntentOnMainThread(intent)) {
            return d.c.a.d.b.a.l(null);
        }
        i i2 = new i();
        this.executor.execute(new d(this, intent, i2));
        return i2.a;
    }

    public abstract Intent getStartCommandIntent(Intent var1);

    public abstract void handleIntent(Intent var1);

    public abstract boolean handleIntentOnMainThread(Intent var1);

    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, h h2) {
        this.finishTask(intent);
    }

    public final void lambda$processIntent$0$EnhancedIntentService(Intent intent, i i2) {
        try {
            this.handleIntent(intent);
            return;
        }
        finally {
            i2.a.r(null);
        }
    }

    public final IBinder onBind(Intent intent) {
        g g2 = this;
        synchronized (g2) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new a0((a0.a)new a(this));
            }
            Binder binder = this.binder;
            return binder;
        }
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent intent, int n2, int n3) {
        Object object;
        Object object2 = object = this.lock;
        synchronized (object2) {
            this.lastStartId = n3;
            this.runningTasks = 1 + this.runningTasks;
        }
        Intent intent2 = this.getStartCommandIntent(intent);
        if (intent2 == null) {
            this.finishTask(intent);
            return 2;
        }
        h<Void> h2 = this.processIntent(intent2);
        if (h2.m()) {
            this.finishTask(intent);
            return 2;
        }
        h2.c(e.e, (c)new f(this, intent));
        return 3;
    }

    public boolean stopSelfResultHook(int n2) {
        return this.stopSelfResult(n2);
    }
}

