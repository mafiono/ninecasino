/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Set
 */
package d.c.b.x;

import d.c.b.l.f;
import d.c.b.x.c;
import d.c.b.x.d;
import d.c.b.x.e;
import java.util.Set;

public final class b
implements f {
    public static final b a = new b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public Object a(d.c.b.l.e e2) {
        Set<e> set = e2.c(e.class);
        d d3 = d.b;
        if (d3 != null) return new c(set, d3);
        Class<d> class_ = d.class;
        // MONITORENTER : d.c.b.x.d.class
        d3 = d.b;
        if (d3 == null) {
            d.b = d3 = new d();
        }
        // MONITOREXIT : class_
        return new c(set, d3);
    }
}

