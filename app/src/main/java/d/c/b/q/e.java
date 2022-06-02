/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.q;

import android.content.Context;
import android.content.SharedPreferences;

public class e {
    public static e b;
    public final SharedPreferences a;

    public e(Context context) {
        this.a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    public boolean a(String string, long l2) {
        e e2 = this;
        synchronized (e2) {
            if (this.a.contains(string)) {
                if (l2 - this.a.getLong(string, -1L) >= 86400000L) {
                    this.a.edit().putLong(string, l2).apply();
                    return true;
                }
                return false;
            }
            this.a.edit().putLong(string, l2).apply();
            return true;
        }
    }
}

