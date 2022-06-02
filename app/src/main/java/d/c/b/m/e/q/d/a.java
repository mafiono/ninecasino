/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package d.c.b.m.e.q.d;

import d.c.b.m.e.q.c.c;
import d.c.b.m.e.q.d.b;
import d.c.b.m.e.q.d.c;
import d.c.b.m.e.q.d.d;

public class a
implements b {
    public final c a;
    public final d b;

    public a(c c3, d d3) {
        this.a = c3;
        this.b = d3;
    }

    @Override
    public boolean a(d.c.b.m.e.q.c.a a2, boolean bl) {
        int n2 = a2.c.e().ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                return false;
            }
            this.b.a(a2, bl);
            return true;
        }
        this.a.a(a2, bl);
        return true;
    }
}

