/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.b.y.j
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  java.util.Objects
 */
package d.c.b.y.q;

import android.content.SharedPreferences;
import d.c.a.d.j.a;
import d.c.a.d.j.h;
import d.c.b.y.j;
import d.c.b.y.q.k;
import d.c.b.y.q.n;
import java.util.Date;
import java.util.Objects;

public final class i
implements a {
    public final k a;
    public final Date b;

    public i(k k4, Date date) {
        this.a = k4;
        this.b = date;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object a(h h2) {
        Object object;
        k k4 = this.a;
        Date date = this.b;
        Objects.requireNonNull((Object)k4);
        if (h2.n()) {
            Object object2;
            n n2 = k4.g;
            Object object3 = object2 = n2.b;
            synchronized (object3) {
                n2.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                return h2;
            }
        }
        Exception exception = h2.i();
        if (exception == null) {
            return h2;
        }
        boolean bl = exception instanceof j;
        n n3 = k4.g;
        if (bl) {
            Object object4;
            Object object5 = object4 = n3.b;
            synchronized (object5) {
                n3.a.edit().putInt("last_fetch_status", 2).apply();
                return h2;
            }
        }
        Object object6 = object = n3.b;
        synchronized (object6) {
            n3.a.edit().putInt("last_fetch_status", 1).apply();
            return h2;
        }
    }
}

