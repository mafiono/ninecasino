/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.b.y.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Date
 *  java.util.Objects
 *  java.util.concurrent.Executor
 */
package d.c.b.y.q;

import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.b.t.l;
import d.c.b.y.i;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.j;
import d.c.b.y.q.k;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class h
implements d.c.a.d.j.a {
    public final k a;
    public final d.c.a.d.j.h b;
    public final d.c.a.d.j.h c;
    public final Date d;

    public h(k k4, d.c.a.d.j.h h2, d.c.a.d.j.h h3, Date date) {
        this.a = k4;
        this.b = h2;
        this.c = h3;
        this.d = date;
    }

    public Object a(d.c.a.d.j.h h2) {
        d.c.a.d.j.h h3;
        k k4;
        d.c.a.d.j.h h4;
        Date date;
        block8 : {
            d.c.b.y.h h5;
            block7 : {
                block6 : {
                    k4 = this.a;
                    h3 = this.b;
                    h4 = this.c;
                    date = this.d;
                    if (h3.n()) break block6;
                    h5 = new d.c.b.y.h("Firebase Installations failed to get installation ID for fetch.", (Throwable)h3.i());
                    break block7;
                }
                if (h4.n()) break block8;
                h5 = new d.c.b.y.h("Firebase Installations failed to get installation auth token for fetch.", (Throwable)h4.i());
            }
            return a.k((Exception)h5);
        }
        String string = (String)h3.j();
        String string2 = ((l)h4.j()).a();
        Objects.requireNonNull((Object)k4);
        try {
            k.a a2 = k4.a(string, string2, date);
            if (a2.a != 0) {
                return a.l(a2);
            }
            d.c.a.d.j.h h6 = k4.e.c(a2.b).p(k4.c, (g)new j(a2));
            return h6;
        }
        catch (i i2) {
            return a.k(i2);
        }
    }
}

