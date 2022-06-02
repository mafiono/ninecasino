/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package d.c.b.y.q;

import android.content.SharedPreferences;
import java.util.Date;

public class n {
    public static final Date d = new Date(-1L);
    public static final Date e = new Date(-1L);
    public final SharedPreferences a;
    public final Object b;
    public final Object c;

    public n(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = new Object();
        this.c = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public a a() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            return new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n2, Date date) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            this.a.edit().putInt("num_failed_fetches", n2).putLong("backoff_end_time_in_millis", date.getTime()).apply();
            return;
        }
    }

    public static class a {
        public int a;
        public Date b;

        public a(int n2, Date date) {
            this.a = n2;
            this.b = date;
        }
    }

}

