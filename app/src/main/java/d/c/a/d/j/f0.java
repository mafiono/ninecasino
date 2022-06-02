/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.d.m.m
 *  d.c.a.d.j.a
 *  d.c.a.d.j.b
 *  d.c.a.d.j.c
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.d
 *  d.c.a.d.j.d0
 *  d.c.a.d.j.e
 *  d.c.a.d.j.f
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.j
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.j;

import d.c.a.d.d.m.m;
import d.c.a.d.j.a;
import d.c.a.d.j.a0;
import d.c.a.d.j.b;
import d.c.a.d.j.c;
import d.c.a.d.j.c0;
import d.c.a.d.j.d;
import d.c.a.d.j.d0;
import d.c.a.d.j.e;
import d.c.a.d.j.f;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import d.c.a.d.j.j;
import d.c.a.d.j.o;
import d.c.a.d.j.p;
import d.c.a.d.j.r;
import d.c.a.d.j.v;
import d.c.a.d.j.w;
import d.c.a.d.j.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class f0<TResult>
extends h<TResult> {
    public final Object a = new Object();
    public final d0<TResult> b = new d0();
    @GuardedBy(value="mLock")
    public boolean c;
    public volatile boolean d;
    @GuardedBy(value="mLock")
    public TResult e;
    @GuardedBy(value="mLock")
    public Exception f;

    public final h<TResult> a(Executor executor, b b3) {
        d0<TResult> d02 = this.b;
        d02.b(new r(executor, b3));
        this.t();
        return this;
    }

    public final h<TResult> b(c<TResult> c3) {
        this.c(j.a, c3);
        return this;
    }

    public final h<TResult> c(Executor executor, c<TResult> c3) {
        d0<TResult> d02 = this.b;
        d02.b(new v<TResult>(executor, c3));
        this.t();
        return this;
    }

    public final h<TResult> d(Executor executor, d d3) {
        d0<TResult> d02 = this.b;
        d02.b(new w(executor, d3));
        this.t();
        return this;
    }

    public final h<TResult> e(Executor executor, e<? super TResult> e2) {
        d0<TResult> d02 = this.b;
        d02.b(new z<TResult>(executor, e2));
        this.t();
        return this;
    }

    public final <TContinuationResult> h<TContinuationResult> f(a<TResult, TContinuationResult> a2) {
        return this.g(j.a, a2);
    }

    public final <TContinuationResult> h<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> a2) {
        f0<TResult> f02 = new f0<TResult>();
        d0<TResult> d02 = this.b;
        d02.b(new o<TResult, TContinuationResult>(executor, a2, f02));
        this.t();
        return f02;
    }

    public final <TContinuationResult> h<TContinuationResult> h(Executor executor, a<TResult, h<TContinuationResult>> a2) {
        f0<TResult> f02 = new f0<TResult>();
        d0<TResult> d02 = this.b;
        d02.b(new p<TResult, TContinuationResult>(executor, a2, f02));
        this.t();
        return f02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Exception i() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            return this.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final TResult j() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            m.k((boolean)this.c, (Object)"Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (this.f == null) {
                TResult TResult = this.e;
                return TResult;
            }
            throw new f((Throwable)this.f);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <X extends Throwable> TResult k(Class<X> class_) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            m.k((boolean)this.c, (Object)"Task is not yet complete");
            if (this.d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (class_.isInstance(this.f)) {
                throw (Throwable)class_.cast(this.f);
            }
            if (this.f == null) {
                TResult TResult = this.e;
                return TResult;
            }
            throw new f((Throwable)this.f);
        }
    }

    public final boolean l() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean m() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            return this.c;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean n() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (!this.c) return false;
            if (this.d) return false;
            return this.f == null;
        }
    }

    public final <TContinuationResult> h<TContinuationResult> o(g<TResult, TContinuationResult> g2) {
        return this.p(j.a, g2);
    }

    public final <TContinuationResult> h<TContinuationResult> p(Executor executor, g<TResult, TContinuationResult> g2) {
        f0<TResult> f02 = new f0<TResult>();
        d0<TResult> d02 = this.b;
        d02.b(new a0<TResult, TContinuationResult>(executor, g2, f02));
        this.t();
        return f02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Exception exception) {
        Object object;
        m.i((Object)exception, (Object)"Exception must not be null");
        Object object2 = object = this.a;
        synchronized (object2) {
            m.k((boolean)(true ^ this.c), (Object)"Task is already complete");
            this.c = true;
            this.f = exception;
        }
        this.b.a((h)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(TResult TResult) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            m.k((boolean)(true ^ this.c), (Object)"Task is already complete");
            this.c = true;
            this.e = TResult;
        }
        this.b.a((h)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean s() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
        }
        this.b.a((h)this);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (!this.c) {
                return;
            }
        }
        this.b.a((h)this);
    }
}

