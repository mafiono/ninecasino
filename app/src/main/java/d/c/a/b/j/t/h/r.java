/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.t.h.q
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  e.a.a
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package d.c.a.b.j.t.h;

import d.c.a.b.j.t.h.q;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;
import d.c.a.b.j.u.b;
import e.a.a;
import java.util.concurrent.Executor;

public final class r
implements Object<q> {
    public final a<Executor> a;
    public final a<c> b;
    public final a<s> c;
    public final a<b> d;

    public r(a<Executor> a2, a<c> a3, a<s> a4, a<b> a5) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
    }

    public Object get() {
        return new q((Executor)this.a.get(), (c)this.b.get(), (s)this.c.get(), (b)this.d.get());
    }
}

