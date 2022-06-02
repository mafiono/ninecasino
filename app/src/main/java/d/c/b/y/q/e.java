/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.b
 *  d.c.a.d.j.d
 *  d.c.a.d.j.e
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.b.y.q.b
 *  d.c.b.y.q.e$b
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package d.c.b.y.q;

import d.c.a.d.j.g;
import d.c.a.d.j.h;
import d.c.b.y.q.c;
import d.c.b.y.q.d;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Exception performing whole class analysis.
 */
public class e {
    public static final Map<String, e> d;
    public static final Executor e;
    public final ExecutorService a;
    public final o b;
    public h<f> c;

    public static {
        d = new HashMap();
        e = d.e;
    }

    public e(ExecutorService executorService, o o2) {
        this.a = executorService;
        this.b = o2;
        this.c = null;
    }

    public static <TResult> TResult a(h<TResult> h2, long l2, TimeUnit timeUnit) {
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        Executor executor = e;
        h2.e(executor, (d.c.a.d.j.e)b2);
        h2.d(executor, (d.c.a.d.j.d)b2);
        h2.a(executor, (d.c.a.d.j.b)b2);
        if (b2.a.await(l2, timeUnit)) {
            if (h2.n()) {
                return (TResult)h2.j();
            }
            throw new ExecutionException((Throwable)h2.i());
        }
        throw new TimeoutException("Task await timed out.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h<f> b() {
        e e2 = this;
        synchronized (e2) {
            h<f> h2 = this.c;
            if (h2 != null) {
                if (!h2.m()) return this.c;
                if (this.c.n()) return this.c;
            }
            ExecutorService executorService = this.a;
            o o2 = this.b;
            o2.getClass();
            this.c = d.c.a.d.b.a.c(executorService, new c(o2));
            return this.c;
        }
    }

    public h<f> c(f f2) {
        return d.c.a.d.b.a.c(this.a, new a(this, f2)).p((Executor)this.a, (g)new b(this, true, f2));
    }

}

