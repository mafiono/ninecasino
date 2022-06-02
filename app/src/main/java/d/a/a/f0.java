/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.c
 *  d.c.a.d.j.h
 *  d.c.a.e.a
 *  f.o.b.i
 *  g.a.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.a.a;

import d.c.a.d.j.c;
import d.c.a.e.a;
import f.o.b.i;
import g.a.h;

public final class f0<TResult>
implements c<T> {
    public final /* synthetic */ h a;
    public final /* synthetic */ d.c.a.d.j.h b;

    public f0(h h2, d.c.a.d.j.h h3) {
        this.a = h2;
        this.b = h3;
    }

    public final void a(d.c.a.d.j.h<T> h2) {
        i.e(h2, (String)"it");
        Exception exception = this.b.i();
        if (exception == null) {
            if (this.b.l()) {
                this.a.k(null);
                return;
            }
            this.a.g(this.b.j());
            return;
        }
        this.a.g(a.q((Throwable)exception));
    }
}

