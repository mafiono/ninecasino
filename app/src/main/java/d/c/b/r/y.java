/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager$WakeLock
 *  d.c.a.d.i.a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b.r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import d.c.a.d.i.a;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class y {
    public static final long a = TimeUnit.MINUTES.toMillis(1L);
    public static final Object b = new Object();
    @GuardedBy(value="WakeLockHolder.syncObject")
    public static a c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ComponentName a(Context context, Intent intent) {
        Object object;
        Object object2 = object = b;
        synchronized (object2) {
            if (c == null) {
                a a2;
                c = a2 = new a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                a2.b.setReferenceCounted(true);
                a2.g = true;
            }
            boolean bl = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentName = context.startService(intent);
            if (componentName == null) {
                return null;
            }
            if (!bl) {
                c.a(a);
            }
            return componentName;
        }
    }
}

