/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayDeque
 *  java.util.concurrent.Executor
 */
package d.c.b.w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class x {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final ArrayDeque<String> d = new ArrayDeque();
    public final Executor e;

    public x(SharedPreferences sharedPreferences, String string, String string2, Executor executor) {
        this.a = sharedPreferences;
        this.b = string;
        this.c = string2;
        this.e = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static x a(SharedPreferences sharedPreferences, String string, String string2, Executor executor) {
        ArrayDeque<String> arrayDeque;
        x x2 = new x(sharedPreferences, string, string2, executor);
        ArrayDeque<String> arrayDeque2 = arrayDeque = x2.d;
        synchronized (arrayDeque2) {
            x2.d.clear();
            String string3 = x2.a.getString(x2.b, "");
            if (TextUtils.isEmpty(string3)) return x2;
            if (!string3.contains(x2.c)) {
                return x2;
            }
            String[] arrstring = string3.split(x2.c, -1);
            if (arrstring.length == 0) {
                Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
            }
            int n2 = arrstring.length;
            int n3 = 0;
            while (n3 < n2) {
                String string4 = arrstring[n3];
                if (!TextUtils.isEmpty(string4)) {
                    x2.d.add(string4);
                }
                ++n3;
            }
            return x2;
        }
    }
}

