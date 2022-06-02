/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.d.c;

import android.util.Log;
import android.util.SparseArray;
import d.c.a.d.c.h;
import d.c.a.d.c.r;
import d.c.a.d.c.s;

public final class n
implements Runnable {
    public final h e;
    public final s f;

    public n(h h2, s s2) {
        this.e = h2;
        this.f = s2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        h h2 = this.e;
        int n2 = this.f.a;
        h h3 = h2;
        synchronized (h3) {
            s s2 = h2.e.get(n2);
            if (s2 != null) {
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Timing out request: ");
                stringBuilder.append(n2);
                Log.w("MessengerIpcClient", stringBuilder.toString());
                h2.e.remove(n2);
                s2.b(new r(3, "Timed out waiting for response"));
                h2.c();
            }
            return;
        }
    }
}

