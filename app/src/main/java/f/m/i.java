/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  f.g
 *  f.g$a
 *  f.m.d
 *  f.m.f
 *  f.m.j.a
 *  f.m.k.a.d
 *  f.o.b.i
 *  java.lang.Deprecated
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package f.m;

import f.g;
import f.m.d;
import f.m.f;
import f.m.j.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class i<T>
implements d<T>,
f.m.k.a.d {
    @Deprecated
    public static final AtomicReferenceFieldUpdater<i<?>, Object> f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, (String)"result");
    public final d<T> e;
    private final Object result;

    public i(d<? super T> d3) {
        f.o.b.i.e(d3, (String)"delegate");
        a a2 = a.f;
        f.o.b.i.e(d3, (String)"delegate");
        this.e = d3;
        this.result = a2;
    }

    public f.m.k.a.d c() {
        d<T> d3 = this.e;
        if (!(d3 instanceof f.m.k.a.d)) {
            d3 = null;
        }
        return (f.m.k.a.d)d3;
    }

    public f d() {
        return this.e.d();
    }

    public final Object e() {
        a a2 = a.e;
        Object object = this.result;
        a a3 = a.f;
        if (object == a3) {
            if (f.compareAndSet(this, (Object)a3, (Object)a2)) {
                return a2;
            }
            object = this.result;
        }
        if (object == a.g) {
            return a2;
        }
        if (!(object instanceof g.a)) {
            return object;
        }
        throw ((g.a)object).e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void g(Object var1_1) {
        do lbl-1000: // 3 sources:
        {
            block1 : {
                if ((var2_2 = this.result) != (var3_3 = a.f)) break block1;
                if (!i.f.compareAndSet(this, (Object)var3_3, var1_1)) ** GOTO lbl-1000
                return;
            }
            var4_4 = a.e;
            if (var2_2 == var4_4) continue;
            var5_5 = new IllegalStateException("Already resumed");
            throw var5_5;
        } while (!i.f.compareAndSet(this, (Object)var4_4, (Object)a.g));
        this.e.g(var1_1);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"SafeContinuation for ");
        stringBuilder.append(this.e);
        return stringBuilder.toString();
    }
}

