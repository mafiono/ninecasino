/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Date
 *  java.util.concurrent.Executor
 */
package d.c.b.y;

import d.c.a.d.j.h;
import d.c.b.y.a;
import d.c.b.y.g;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import java.util.Date;
import java.util.concurrent.Executor;

public final class c
implements d.c.a.d.j.a {
    public final g a;
    public final h b;
    public final h c;

    public c(g g2, h h2, h h3) {
        this.a = g2;
        this.b = h2;
        this.c = h3;
    }

    public Object a(h h2) {
        Boolean bl;
        block3 : {
            g g2;
            f f2;
            block4 : {
                g2 = this.a;
                h h3 = this.b;
                h h4 = this.c;
                bl = Boolean.FALSE;
                if (!h3.n() || h3.j() == null) break block3;
                f2 = (f)h3.j();
                if (!h4.n()) break block4;
                f f3 = (f)h4.j();
                boolean bl2 = f3 == null || !f2.c.equals(f3.c);
                if (!bl2) break block3;
            }
            return g2.e.c(f2).g(g2.c, (d.c.a.d.j.a)new a(g2));
        }
        return d.c.a.d.b.a.l(bl);
    }
}

