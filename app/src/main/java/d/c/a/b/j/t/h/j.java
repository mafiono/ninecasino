/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.i
 *  d.c.a.b.j.q.g
 *  d.c.a.b.j.q.g$a
 *  d.c.a.b.j.t.h.m
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  java.lang.Iterable
 *  java.lang.Object
 */
package d.c.a.b.j.t.h;

import d.c.a.b.j.i;
import d.c.a.b.j.q.g;
import d.c.a.b.j.t.h.m;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;
import d.c.a.b.j.u.b;
import d.c.a.b.j.v.a;

public final class j
implements b.a {
    public final m a;
    public final g b;
    public final Iterable c;
    public final i d;
    public final int e;

    public j(m m2, g g2, Iterable iterable, i i2, int n2) {
        this.a = m2;
        this.b = g2;
        this.c = iterable;
        this.d = i2;
        this.e = n2;
    }

    public Object execute() {
        m m2 = this.a;
        g g2 = this.b;
        Iterable iterable = this.c;
        i i2 = this.d;
        int n2 = this.e;
        if (g2.c() == g.a.f) {
            m2.c.G(iterable);
            m2.d.a(i2, n2 + 1);
        } else {
            m2.c.k(iterable);
            if (g2.c() == g.a.e) {
                m2.c.O(i2, m2.g.a() + g2.b());
            }
            if (m2.c.z(i2)) {
                m2.d.a(i2, 1);
            }
        }
        return null;
    }
}

