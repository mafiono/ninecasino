/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package d.c.b.q;

import android.content.Context;
import d.c.b.l.t;
import d.c.b.q.a;
import d.c.b.q.d;
import d.c.b.q.e;

public class c
implements d {
    public d.c.b.s.a<e> a;

    public c(Context context) {
        t<e> t6 = new t<e>(new a(context));
        this.a = t6;
    }

    @Override
    public d.a a(String string) {
        e e2;
        long l4 = System.currentTimeMillis();
        boolean bl = this.a.get().a(string, l4);
        e e3 = e2 = this.a.get();
        synchronized (e3) {
            boolean bl2 = e2.a("fire-global", l4);
            // MONITOREXIT [0, 1] lbl7 : w: MONITOREXIT : var8_5
            if (bl && bl2) {
                return d.a.i;
            }
            if (bl2) {
                return d.a.h;
            }
            if (bl) {
                return d.a.g;
            }
            return d.a.f;
        }
    }
}

