/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.b.m.e.k.j
 *  d.c.b.m.e.k.k
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Void
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e.k;

import d.c.b.m.e.k.j;
import d.c.b.m.e.k.k;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class h {
    public final Executor a;
    public d.c.a.d.j.h<Void> b = d.c.a.d.b.a.l(null);
    public final Object c = new Object();
    public ThreadLocal<Boolean> d = new ThreadLocal();

    public h(Executor executor) {
        this.a = executor;
        executor.execute(new Runnable(){

            public void run() {
                h.this.d.set(Boolean.TRUE);
            }
        });
    }

    public void a() {
        if (Boolean.TRUE.equals(this.d.get())) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> d.c.a.d.j.h<T> b(Callable<T> callable) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            d.c.a.d.j.h h2 = this.b.g(this.a, (d.c.a.d.j.a)new j(this, callable));
            this.b = h2.g(this.a, (d.c.a.d.j.a)new k(this));
            return h2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public <T> d.c.a.d.j.h<T> c(Callable<d.c.a.d.j.h<T>> callable) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            d.c.a.d.j.h h2 = this.b.h(this.a, (d.c.a.d.j.a)new j(this, callable));
            this.b = h2.g(this.a, (d.c.a.d.j.a)new k(this));
            return h2;
        }
    }

}

