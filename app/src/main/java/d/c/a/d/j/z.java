/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.e
 *  d.c.a.d.j.h
 *  d.c.a.d.j.y
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.j;

import d.c.a.d.j.c0;
import d.c.a.d.j.e;
import d.c.a.d.j.h;
import d.c.a.d.j.y;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class z<TResult>
implements c0<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy(value="mLock")
    public e<? super TResult> c;

    public z(Executor executor, e<? super TResult> e2) {
        this.a = executor;
        this.c = e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(h<TResult> h2) {
        Object object;
        if (!h2.n()) {
            return;
        }
        Object object2 = object = this.b;
        synchronized (object2) {
            if (this.c == null) {
                return;
            }
        }
        this.a.execute((Runnable)new y(this, h2));
    }
}

