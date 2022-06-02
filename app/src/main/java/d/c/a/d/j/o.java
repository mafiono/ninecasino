/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.h
 *  d.c.a.d.j.q
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
package d.c.a.d.j;

import d.c.a.d.j.a;
import d.c.a.d.j.c0;
import d.c.a.d.j.f0;
import d.c.a.d.j.h;
import d.c.a.d.j.q;
import java.util.concurrent.Executor;

public final class o<TResult, TContinuationResult>
implements c0<TResult> {
    public final Executor a;
    public final a<TResult, TContinuationResult> b;
    public final f0<TContinuationResult> c;

    public o(Executor executor, a<TResult, TContinuationResult> a2, f0<TContinuationResult> f02) {
        this.a = executor;
        this.b = a2;
        this.c = f02;
    }

    public final void a(h<TResult> h2) {
        this.a.execute((Runnable)new q(this, h2));
    }
}

