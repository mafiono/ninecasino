/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.c0
 *  d.c.a.d.j.d
 *  d.c.a.d.j.h
 *  d.c.a.d.j.x
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.j;

import d.c.a.d.j.c0;
import d.c.a.d.j.d;
import d.c.a.d.j.h;
import d.c.a.d.j.x;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class w<TResult>
implements c0<TResult> {
    public final Executor a;
    public final Object b = new Object();
    @GuardedBy(value="mLock")
    public d c;

    public w(Executor executor, d d3) {
        this.a = executor;
        this.c = d3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(h<TResult> h2) {
        if (!h2.n() && !h2.l()) {
            Object object;
            Object object2 = object = this.b;
            synchronized (object2) {
                if (this.c == null) {
                    return;
                }
            }
            this.a.execute((Runnable)new x(this, h2));
            return;
        }
    }
}

