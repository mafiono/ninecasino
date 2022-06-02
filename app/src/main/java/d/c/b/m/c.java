/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  d.c.b.m.e.e
 *  d.c.b.m.e.f
 *  d.c.b.m.e.s.d
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package d.c.b.m;

import d.c.a.d.j.g;
import d.c.b.i;
import d.c.b.m.e.f;
import d.c.b.m.e.h;
import d.c.b.m.e.k.d1;
import d.c.b.m.e.k.f0;
import d.c.b.m.e.k.g0;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.s.d;
import d.c.b.m.e.s.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class c
implements Callable<Void> {
    public final /* synthetic */ h a;
    public final /* synthetic */ ExecutorService b;
    public final /* synthetic */ d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ g0 e;

    public c(h h2, ExecutorService executorService, d d3, boolean bl, g0 g02) {
        this.a = h2;
        this.b = executorService;
        this.c = d3;
        this.d = bl;
        this.e = g02;
    }

    public Object call() {
        h h2 = this.a;
        ExecutorService executorService = this.b;
        d d3 = this.c;
        d.c.b.c c2 = h2.b;
        c2.a();
        String string = c2.c.b;
        h2.m.b().p((Executor)executorService, (g)new f(h2, d3)).p((Executor)executorService, (g)new d.c.b.m.e.e(h2, string, d3, executorService));
        if (this.d) {
            g0 g02 = this.e;
            d d4 = this.c;
            ExecutorService executorService2 = g02.k;
            f0 f02 = new f0(g02, d4);
            executorService2.execute(new d1(f02, new d.c.a.d.j.i()));
        }
        return null;
    }
}

