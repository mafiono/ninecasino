/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.util.Log
 *  d.c.a.d.d.o.a
 *  d.c.a.d.d.p.i.a
 *  d.c.a.d.j.i
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayDeque
 *  java.util.Queue
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.ThreadFactory
 */
package d.c.b.r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import d.c.a.d.j.i;
import d.c.b.r.a0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class d0
implements ServiceConnection {
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final Queue<a> d;
    public a0 e;
    public boolean f;

    public d0(Context context, String string) {
        Context context2;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, (ThreadFactory)new d.c.a.d.d.p.i.a("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context2 = context.getApplicationContext();
        this.b = new Intent(string).setPackage(context2.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final void a() {
        while (!this.d.isEmpty()) {
            this.d.poll().a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        d0 d02 = this;
        synchronized (d02) {
            block8 : {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "flush queue called");
                }
                while (!this.d.isEmpty()) {
                    a0 a02;
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "found intent to be delivered");
                    }
                    if ((a02 = this.e) != null && a02.isBinderAlive()) {
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                        }
                        a a2 = this.d.poll();
                        this.e.a(a2);
                        continue;
                    }
                    break block8;
                }
                return;
            }
            this.c();
            return;
        }
    }

    public final void c() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            boolean bl = true ^ this.f;
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("binder is dead. start connection? ");
            stringBuilder.append(bl);
            Log.d("FirebaseInstanceId", stringBuilder.toString());
        }
        if (this.f) {
            return;
        }
        this.f = true;
        try {
            if (d.c.a.d.d.o.a.b().a(this.a, this.b, (ServiceConnection)this, 65)) {
                return;
            }
            Log.e("FirebaseInstanceId", "binding to the service failed");
        }
        catch (SecurityException securityException) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", securityException);
        }
        this.f = false;
        this.a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d0 d02 = this;
        synchronized (d02) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String string = String.valueOf(componentName);
                StringBuilder stringBuilder = new StringBuilder(20 + string.length());
                stringBuilder.append("onServiceConnected: ");
                stringBuilder.append(string);
                Log.d("FirebaseInstanceId", stringBuilder.toString());
            }
            this.f = false;
            if (!(iBinder instanceof a0)) {
                String string = String.valueOf(iBinder);
                StringBuilder stringBuilder = new StringBuilder(28 + string.length());
                stringBuilder.append("Invalid service connection: ");
                stringBuilder.append(string);
                Log.e("FirebaseInstanceId", stringBuilder.toString());
                this.a();
                return;
            }
            this.e = (a0)iBinder;
            this.b();
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String string = String.valueOf(componentName);
            StringBuilder stringBuilder = new StringBuilder(23 + string.length());
            stringBuilder.append("onServiceDisconnected: ");
            stringBuilder.append(string);
            Log.d("FirebaseInstanceId", stringBuilder.toString());
        }
        this.b();
    }

    public static class a {
        public final Intent a;
        public final i<Void> b = new i();

        public a(Intent intent) {
            this.a = intent;
        }

        public void a() {
            this.b.b(null);
        }
    }

}

