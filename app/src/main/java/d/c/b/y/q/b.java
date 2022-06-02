/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.Void
 */
package d.c.b.y.q;

import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import d.c.b.y.q.e;
import d.c.b.y.q.f;

public final class b
implements g {
    public final e a;
    public final boolean b;
    public final f c;

    public b(e e2, boolean bl, f f2) {
        this.a = e2;
        this.b = bl;
        this.c = f2;
    }

    public h a(Object object) {
        e e2 = this.a;
        boolean bl = this.b;
        f f2 = this.c;
        (Void)object;
        if (bl) {
            e e3 = e2;
            synchronized (e3) {
                e2.c = a.l(f2);
            }
        }
        return a.l(f2);
    }
}

