/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  d.c.a.d.d.p.i.a
 *  d.c.a.d.j.f0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ThreadFactory
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.c;

import android.content.Context;
import android.util.Log;
import d.c.a.d.c.h;
import d.c.a.d.c.i;
import d.c.a.d.c.s;
import d.c.a.d.d.p.i.a;
import d.c.a.d.j.f0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import javax.annotation.concurrent.GuardedBy;

public final class g {
    @GuardedBy(value="MessengerIpcClient.class")
    public static g e;
    public final Context a;
    public final ScheduledExecutorService b;
    @GuardedBy(value="this")
    public h c = new h(this, null);
    @GuardedBy(value="this")
    public int d = 1;

    public g(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static g a(Context context) {
        Class<g> class_ = g.class;
        synchronized (g.class) {
            if (e == null) {
                e = new g(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory)new a("MessengerIpcClient"))));
            }
            g g2 = e;
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return g2;
        }
    }

    public final <T> d.c.a.d.j.h<T> b(s<T> s2) {
        g g2 = this;
        synchronized (g2) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String string = String.valueOf(s2);
                StringBuilder stringBuilder = new StringBuilder(9 + string.length());
                stringBuilder.append("Queueing ");
                stringBuilder.append(string);
                Log.d("MessengerIpcClient", stringBuilder.toString());
            }
            if (!this.c.b(s2)) {
                h h2;
                this.c = h2 = new h(this, null);
                h2.b(s2);
            }
            f0 f02 = s2.b.a;
            return f02;
        }
    }
}

