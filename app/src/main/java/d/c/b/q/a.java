/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 */
package d.c.b.q;

import android.content.Context;
import d.c.b.q.e;

public final class a
implements d.c.b.s.a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public Object get() {
        Context context = this.a;
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (e.b == null) {
                e.b = new e(context);
            }
            e e2 = e.b;
            // ** MonitorExit[var4_2] (shouldn't be in output)
            return e2;
        }
    }
}

