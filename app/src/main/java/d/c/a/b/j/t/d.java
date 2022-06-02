/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.q.e
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  e.a.a
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package d.c.a.b.j.t;

import d.c.a.b.j.q.e;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;
import d.c.a.b.j.u.b;
import e.a.a;
import java.util.concurrent.Executor;

public final class d
implements Object<d.c.a.b.j.t.c> {
    public final a<Executor> a;
    public final a<e> b;
    public final a<s> c;
    public final a<c> d;
    public final a<b> e;

    public d(a<Executor> a2, a<e> a3, a<s> a4, a<c> a5, a<b> a6) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
        this.e = a6;
    }

    public Object get() {
        Executor executor = (Executor)this.a.get();
        e e2 = (e)this.b.get();
        s s2 = (s)this.c.get();
        c c2 = (c)this.d.get();
        b b2 = (b)this.e.get();
        d.c.a.b.j.t.c c3 = new c(executor, e2, s2, c2, b2);
        return c3;
    }
}

