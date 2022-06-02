/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  com.google.firebase.iid.FirebaseInstanceId
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 */
package d.c.b.w;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import d.c.b.r.n;
import d.c.b.r.q;
import d.c.b.w.b0;
import d.c.b.w.x;
import d.c.b.w.z;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class a0
implements Callable {
    public final Context a;
    public final ScheduledExecutorService b;
    public final FirebaseInstanceId c;
    public final q d;
    public final n e;

    public a0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, q q2, n n2) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseInstanceId;
        this.d = q2;
        this.e = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Context context = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        FirebaseInstanceId firebaseInstanceId = this.c;
        q q2 = this.d;
        n n2 = this.e;
        Class<z> class_ = z.class;
        synchronized (z.class) {
            z z2;
            WeakReference<z> weakReference = z.d;
            z z3 = null;
            if (weakReference != null) {
                z3 = weakReference.get();
            }
            if (z3 != null) return new b0(firebaseInstanceId, q2, z3, n2, context, scheduledExecutorService);
            z z4 = z2 = new z(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
            synchronized (z4) {
                z2.b = x.a(z2.a, "topic_operation_queue", ",", z2.c);
            }
            z.d = new WeakReference(z2);
            z3 = z2;
            // ** MonitorExit[var12_6] (shouldn't be in output)
            return new b0(firebaseInstanceId, q2, z3, n2, context, scheduledExecutorService);
        }
    }
}

