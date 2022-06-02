/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayDeque
 *  java.util.Queue
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b.r;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

public class v {
    public static v e;
    @GuardedBy(value="this")
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final Queue<Intent> d = new ArrayDeque();

    public static v a() {
        Class<v> class_ = v.class;
        synchronized (v.class) {
            if (e == null) {
                e = new v();
            }
            v v2 = e;
            // ** MonitorExit[var2] (shouldn't be in output)
            return v2;
        }
    }

    public boolean b(Context context) {
        if (this.c == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
            this.c = bl;
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c;
    }

    public boolean c(Context context) {
        if (this.b == null) {
            boolean bl = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
            this.b = bl;
        }
        if (!this.b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b;
    }
}

