/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.b
 *  d.c.a.d.j.b0
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.d
 *  d.c.a.d.j.e
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.a.d.j;

import d.c.a.d.j.b;
import d.c.a.d.j.b0;
import d.c.a.d.j.c0;
import d.c.a.d.j.d;
import d.c.a.d.j.e;
import d.c.a.d.j.f0;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import java.util.concurrent.Executor;

public final class a0<TResult, TContinuationResult>
implements b,
d,
e<TContinuationResult>,
c0<TResult> {
    public final Executor a;
    public final g<TResult, TContinuationResult> b;
    public final f0<TContinuationResult> c;

    public a0(Executor executor, g<TResult, TContinuationResult> g2, f0<TContinuationResult> f02) {
        this.a = executor;
        this.b = g2;
        this.c = f02;
    }

    public final void a(h<TResult> h2) {
        this.a.execute((Runnable)new b0(this, h2));
    }

    public final void b() {
        this.c.s();
    }

    public final void c(Exception exception) {
        this.c.q(exception);
    }

    public final void d(TContinuationResult TContinuationResult) {
        this.c.r(TContinuationResult);
    }
}

