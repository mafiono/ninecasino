/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.i
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.t;

import d.c.a.d.j.i;
import d.c.b.t.n;
import d.c.b.t.p.c;
import d.c.b.t.p.d;

public class k
implements n {
    public final i<String> a;

    public k(i<String> i2) {
        this.a = i2;
    }

    @Override
    public boolean a(Exception exception) {
        return false;
    }

    @Override
    public boolean b(d d3) {
        boolean bl = d3.f() == c.a.g;
        if (!(bl || d3.j() || d3.h())) {
            return false;
        }
        this.a.b((Object)d3.c());
        return true;
    }
}

