/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.i.l.d
 *  c.f.b.i.l.f$a
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.j;
import c.f.b.i.l.m;
import java.util.List;

public class g
extends f {
    public int m;

    public g(m m2) {
        super(m2);
        f.a a2 = m2 instanceof j ? f.a.f : f.a.g;
        this.e = a2;
    }

    @Override
    public void c(int n2) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = n2;
        for (d d2 : this.k) {
            d2.a(d2);
        }
    }
}

