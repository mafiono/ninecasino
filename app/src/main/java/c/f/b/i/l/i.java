/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.i.d
 *  c.f.b.i.l.d
 *  c.f.b.i.l.f$a
 *  c.f.b.i.l.k
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.a;
import c.f.b.i.h;
import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.j;
import c.f.b.i.l.k;
import c.f.b.i.l.l;
import c.f.b.i.l.m;
import java.util.Iterator;
import java.util.List;

public class i
extends m {
    public i(c.f.b.i.d d2) {
        super(d2);
    }

    @Override
    public void a(d d2) {
        a a2 = (a)this.b;
        int n2 = a2.g0;
        int n3 = 0;
        Iterator iterator = this.h.l.iterator();
        int n4 = -1;
        while (iterator.hasNext()) {
            int n5 = ((f)iterator.next()).g;
            if (n4 == -1 || n5 < n4) {
                n4 = n5;
            }
            if (n3 >= n5) continue;
            n3 = n5;
        }
        if (n2 != 0 && n2 != 2) {
            this.h.c(n3 + a2.i0);
            return;
        }
        this.h.c(n4 + a2.i0);
    }

    @Override
    public void d() {
        block10 : {
            m m2;
            block13 : {
                block14 : {
                    int n2;
                    boolean bl;
                    a a2;
                    block11 : {
                        block12 : {
                            c.f.b.i.d d2 = this.b;
                            if (!(d2 instanceof a)) break block10;
                            f f2 = this.h;
                            f2.b = true;
                            a2 = (a)d2;
                            int n3 = a2.g0;
                            bl = a2.h0;
                            if (n3 == 0) break block11;
                            if (n3 == 1) break block12;
                            if (n3 != 2) {
                                if (n3 != 3) {
                                    return;
                                }
                                f2.e = f.a.k;
                                for (n2 = 0; n2 < a2.f0; ++n2) {
                                    c.f.b.i.d d3 = a2.e0[n2];
                                    if (!bl && d3.X == 8) continue;
                                    f f3 = d3.e.i;
                                    f3.k.add((Object)this.h);
                                    this.h.l.add(f3);
                                }
                            } else {
                                f2.e = f.a.j;
                                while (n2 < a2.f0) {
                                    c.f.b.i.d d4 = a2.e0[n2];
                                    if (bl || d4.X != 8) {
                                        f f4 = d4.e.h;
                                        f4.k.add((Object)this.h);
                                        this.h.l.add(f4);
                                    }
                                    ++n2;
                                }
                            }
                            this.m(this.b.e.h);
                            m2 = this.b.e;
                            break block13;
                        }
                        f2.e = f.a.i;
                        while (n2 < a2.f0) {
                            c.f.b.i.d d5 = a2.e0[n2];
                            if (bl || d5.X != 8) {
                                f f5 = d5.d.i;
                                f5.k.add((Object)this.h);
                                this.h.l.add(f5);
                            }
                            ++n2;
                        }
                        break block14;
                    }
                    f2.e = f.a.h;
                    while (n2 < a2.f0) {
                        c.f.b.i.d d6 = a2.e0[n2];
                        if (bl || d6.X != 8) {
                            f f6 = d6.d.h;
                            f6.k.add((Object)this.h);
                            this.h.l.add(f6);
                        }
                        ++n2;
                    }
                }
                this.m(this.b.d.h);
                m2 = this.b.d;
            }
            this.m(m2.i);
        }
    }

    @Override
    public void e() {
        c.f.b.i.d d2 = this.b;
        if (d2 instanceof a) {
            int n2 = ((a)d2).g0;
            if (n2 != 0 && n2 != 1) {
                d2.Q = this.h.g;
                return;
            }
            d2.P = this.h.g;
        }
    }

    @Override
    public void f() {
        this.c = null;
        this.h.b();
    }

    @Override
    public boolean k() {
        return false;
    }

    public final void m(f f2) {
        this.h.k.add((Object)f2);
        f2.l.add(this.h);
    }
}

