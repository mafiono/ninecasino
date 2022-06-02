/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.t.e
 *  d.c.a.b.j.t.h.m
 *  d.c.a.b.j.t.h.q
 *  e.a.a
 *  java.lang.Object
 */
package d.c.a.b.j;

import d.c.a.b.j.n;
import d.c.a.b.j.t.e;
import d.c.a.b.j.t.h.m;
import d.c.a.b.j.t.h.q;
import d.c.a.b.j.v.a;

public final class p
implements Object<n> {
    public final e.a.a<a> a;
    public final e.a.a<a> b;
    public final e.a.a<e> c;
    public final e.a.a<m> d;
    public final e.a.a<q> e;

    public p(e.a.a<a> a2, e.a.a<a> a3, e.a.a<e> a4, e.a.a<m> a5, e.a.a<q> a6) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
        this.e = a6;
    }

    public Object get() {
        a a2 = (a)this.a.get();
        a a3 = (a)this.b.get();
        e e2 = (e)this.c.get();
        m m2 = (m)this.d.get();
        q q2 = (q)this.e.get();
        n n2 = new n(a2, a3, e2, m2, q2);
        return n2;
    }
}

