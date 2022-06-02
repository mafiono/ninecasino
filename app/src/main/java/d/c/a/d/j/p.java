/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.b
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.d
 *  d.c.a.d.j.e
 *  d.c.a.d.j.h
 *  d.c.a.d.j.s
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.a.d.j;

import d.c.a.d.j.a;
import d.c.a.d.j.b;
import d.c.a.d.j.c0;
import d.c.a.d.j.d;
import d.c.a.d.j.e;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.s;
import java.util.concurrent.Executor;

public final class p<TResult, TContinuationResult>
implements b,
d,
e<TContinuationResult>,
c0<TResult> {
    public final Executor a;
    public final a<TResult, h<TContinuationResult>> b;
    public final f0<TContinuationResult> c;

    public p(Executor executor, a<TResult, h<TContinuationResult>> a2, f0<TContinuationResult> f02) {
        this.a = executor;
        this.b = a2;
        this.c = f02;
    }

    public final void a(h<TResult> h2) {
        this.a.execute((Runnable)new s(this, h2));
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

