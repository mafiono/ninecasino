/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package d.c.b.y;

import android.content.SharedPreferences;
import d.c.b.y.g;
import d.c.b.y.l;
import d.c.b.y.q.n;
import java.util.concurrent.Callable;

public final class e
implements Callable {
    public final g a;
    public final l b;

    public e(g g2, l l2) {
        this.a = g2;
        this.b = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object call() {
        Object object;
        g g2 = this.a;
        l l2 = this.b;
        n n2 = g2.i;
        Object object2 = object = n2.b;
        synchronized (object2) {
            n2.a.edit().putLong("fetch_timeout_in_seconds", l2.a).putLong("minimum_fetch_interval_in_seconds", l2.b).commit();
            return null;
        }
    }
}

