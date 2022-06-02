/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.t.i.d
 *  e.a.a
 *  java.lang.Object
 */
package d.c.a.b.j.t.i;

import d.c.a.b.j.t.i.d;
import d.c.a.b.j.t.i.t;
import d.c.a.b.j.t.i.z;
import d.c.a.b.j.v.a;

public final class u
implements Object<t> {
    public final e.a.a<a> a;
    public final e.a.a<a> b;
    public final e.a.a<d> c;
    public final e.a.a<z> d;

    public u(e.a.a<a> a2, e.a.a<a> a3, e.a.a<d> a4, e.a.a<z> a5) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
    }

    public Object get() {
        a a2 = (a)this.a.get();
        a a3 = (a)this.b.get();
        Object object = this.c.get();
        Object object2 = this.d.get();
        return new t(a2, a3, (d)object, (z) object2);
    }
}

