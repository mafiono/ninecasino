/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.Messenger
 *  android.util.Log
 *  android.util.SparseArray
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.o.a
 *  d.c.a.d.g.c.a
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.Iterator
 *  java.util.Objects
 *  java.util.Queue
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import d.c.a.d.c.g;
import d.c.a.d.c.i;
import d.c.a.d.c.j;
import d.c.a.d.c.k;
import d.c.a.d.c.l;
import d.c.a.d.c.m;
import d.c.a.d.c.o;
import d.c.a.d.c.q;
import d.c.a.d.c.r;
import d.c.a.d.c.s;
import d.c.a.d.g.c.a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class h
implements ServiceConnection {
    @GuardedBy(value="this")
    public int a = 0;
    public final Messenger b = new Messenger((Handler)new a(Looper.getMainLooper(), (Handler.Callback)new k(this)));
    public q c;
    @GuardedBy(value="this")
    public final Queue<s<?>> d = new ArrayDeque();
    @GuardedBy(value="this")
    public final SparseArray<s<?>> e = new SparseArray();
    public final /* synthetic */ g f;

    public h(g g2, i i2) {
        this.f = g2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n2, String string) {
        h h2 = this;
        synchronized (h2) {
            int n3;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String string2 = String.valueOf(string);
                String string3 = string2.length() != 0 ? "Disconnected: ".concat(string2) : "Disconnected: ";
                Log.d("MessengerIpcClient", string3);
            }
            if ((n3 = this.a) == 0) throw new IllegalStateException();
            if (n3 != 1 && n3 != 2) {
                if (n3 != 3) {
                    if (n3 == 4) {
                        return;
                    }
                    int n5 = this.a;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(n5);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            d.c.a.d.d.o.a a2 = d.c.a.d.d.o.a.b();
            Context context = this.f.a;
            Objects.requireNonNull(a2);
            context.unbindService(this);
            r r2 = new r(n2, string);
            Iterator iterator = this.d.iterator();
            while (iterator.hasNext()) {
                ((s)iterator.next()).b(r2);
            }
            this.d.clear();
            for (int i2 = 0; i2 < this.e.size(); ++i2) {
                this.e.valueAt(i2).b(r2);
            }
            this.e.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(s<?> s2) {
        h h2 = this;
        synchronized (h2) {
            int n2 = this.a;
            if (n2 != 0) {
                if (n2 == 1) {
                    this.d.add(s2);
                    return true;
                }
                if (n2 == 2) {
                    this.d.add(s2);
                    this.f.b.execute(new l(this));
                    return true;
                }
                if (n2 != 3 && n2 != 4) {
                    int n3 = this.a;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Unknown state: ");
                    stringBuilder.append(n3);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                return false;
            }
            this.d.add(s2);
            boolean bl = this.a == 0;
            d.c.a.d.d.m.m.j((boolean)bl);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            d.c.a.d.d.o.a a2 = d.c.a.d.d.o.a.b();
            Context context = this.f.a;
            Objects.requireNonNull(a2);
            context.getClass().getName();
            if (!a2.c(context, intent, (ServiceConnection)this, 1)) {
                this.a(0, "Unable to bind to service");
            } else {
                this.f.b.schedule(new j(this), 30L, TimeUnit.SECONDS);
            }
            return true;
        }
    }

    public final void c() {
        h h2 = this;
        synchronized (h2) {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                d.c.a.d.d.o.a a2 = d.c.a.d.d.o.a.b();
                Context context = this.f.a;
                Objects.requireNonNull(a2);
                context.unbindService(this);
            }
            return;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f.b.execute(new m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f.b.execute(new o(this));
    }
}

