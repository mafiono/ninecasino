/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.Iterator
 */
package d.c.b.w;

import android.content.SharedPreferences;
import d.c.b.w.x;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class w
implements Runnable {
    public final x e;

    public w(x x2) {
        this.e = x2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        ArrayDeque<String> arrayDeque;
        x x2 = this.e;
        ArrayDeque<String> arrayDeque2 = arrayDeque = x2.d;
        synchronized (arrayDeque2) {
            SharedPreferences.Editor editor = x2.a.edit();
            String string = x2.b;
            StringBuilder stringBuilder = new StringBuilder();
            Iterator iterator = x2.d.iterator();
            do {
                if (!iterator.hasNext()) {
                    editor.putString(string, stringBuilder.toString()).commit();
                    return;
                }
                stringBuilder.append((String)iterator.next());
                stringBuilder.append(x2.c);
            } while (true);
        }
    }
}

