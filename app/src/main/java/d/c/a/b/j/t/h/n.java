/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.a.b.j.q.e
 *  d.c.a.b.j.t.h.m
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  e.a.a
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package d.c.a.b.j.t.h;

import android.content.Context;
import d.c.a.b.j.q.e;
import d.c.a.b.j.t.h.m;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;
import d.c.a.b.j.u.b;
import d.c.a.b.j.v.a;
import java.util.concurrent.Executor;

public final class n
implements Object<m> {
    public final e.a.a<Context> a;
    public final e.a.a<e> b;
    public final e.a.a<c> c;
    public final e.a.a<s> d;
    public final e.a.a<Executor> e;
    public final e.a.a<b> f;
    public final e.a.a<a> g;

    public n(e.a.a<Context> a2, e.a.a<e> a3, e.a.a<c> a4, e.a.a<s> a5, e.a.a<Executor> a6, e.a.a<b> a7, e.a.a<a> a8) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
        this.e = a6;
        this.f = a7;
        this.g = a8;
    }

    public Object get() {
        Context context = (Context)this.a.get();
        e e2 = (e)this.b.get();
        c c2 = (c)this.c.get();
        s s2 = (s)this.d.get();
        Executor executor = (Executor)this.e.get();
        b b2 = (b)this.f.get();
        a a2 = (a)this.g.get();
        m m2 = new m(context, e2, c2, s2, executor, b2, a2);
        return m2;
    }
}

