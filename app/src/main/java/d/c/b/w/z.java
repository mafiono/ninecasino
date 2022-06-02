/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayDeque
 *  java.util.concurrent.Executor
 */
package d.c.b.w;

import android.content.SharedPreferences;
import android.text.TextUtils;
import d.c.b.w.x;
import d.c.b.w.y;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class z {
    public static WeakReference<z> d;
    public final SharedPreferences a;
    public x b;
    public final Executor c;

    public z(SharedPreferences sharedPreferences, Executor executor) {
        this.c = executor;
        this.a = sharedPreferences;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final y a() {
        ArrayDeque<String> arrayDeque;
        z z2 = this;
        // MONITORENTER : z2
        x x2 = this.b;
        ArrayDeque<String> arrayDeque2 = arrayDeque = x2.d;
        // MONITORENTER : arrayDeque2
        String string = x2.d.peek();
        // MONITOREXIT : arrayDeque2
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] arrstring = string.split("!", -1);
        if (arrstring.length != 2) {
            return null;
        }
        y y2 = new y(arrstring[0], arrstring[1]);
        // MONITOREXIT : z2
        return y2;
    }
}

