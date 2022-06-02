/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.i.c
 *  c.f.b.i.c$a
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  c.f.b.i.l.d
 *  c.f.b.i.l.g
 *  c.f.b.i.l.j
 *  c.f.b.i.l.k
 *  c.f.b.i.l.l
 *  c.f.b.i.l.m$a
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.c;
import c.f.b.i.d;
import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.g;
import c.f.b.i.l.j;
import c.f.b.i.l.k;
import c.f.b.i.l.l;
import c.f.b.i.l.m;
import java.util.List;

public abstract class m
implements d {
    public int a;
    public c.f.b.i.d b;
    public k c;
    public d.a d;
    public g e = new g(this);
    public int f = 0;
    public boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    public a j = a.e;

    public m(c.f.b.i.d d2) {
        this.b = d2;
    }

    public void a(d d2) {
    }

    public final void b(f f2, f f3, int n2) {
        f2.l.add(f3);
        f2.f = n2;
        f3.k.add((Object)f2);
    }

    public final void c(f f2, f f3, int n2, g g2) {
        f2.l.add(f3);
        f2.l.add(this.e);
        f2.h = n2;
        f2.i = g2;
        f3.k.add((Object)f2);
        g2.k.add((Object)f2);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int n2, int n3) {
        block6 : {
            int n4;
            block7 : {
                block5 : {
                    if (n3 != 0) break block5;
                    c.f.b.i.d d2 = this.b;
                    int n5 = d2.n;
                    n4 = Math.max((int)d2.m, n2);
                    if (n5 > 0) {
                        n4 = Math.min(n5, n2);
                    }
                    if (n4 == n2) break block6;
                    break block7;
                }
                c.f.b.i.d d3 = this.b;
                int n6 = d3.q;
                n4 = Math.max((int)d3.p, n2);
                if (n6 > 0) {
                    n4 = Math.min(n6, n2);
                }
                if (n4 == n2) break block6;
            }
            n2 = n4;
        }
        return n2;
    }

    public final f h(c c2) {
        j j2;
        c c3 = c2.d;
        if (c3 == null) {
            return null;
        }
        c.f.b.i.d d2 = c3.b;
        int n2 = c3.c.ordinal();
        if (n2 != 1) {
            if (n2 != 2) {
                j j3;
                if (n2 != 3) {
                    if (n2 != 4) {
                        if (n2 != 5) {
                            return null;
                        }
                        return d2.e.k;
                    }
                    j3 = d2.e;
                } else {
                    j3 = d2.d;
                }
                return j3.i;
            }
            j2 = d2.e;
        } else {
            j2 = d2.d;
        }
        return j2.h;
    }

    public final f i(c c2, int n2) {
        c c3 = c2.d;
        if (c3 == null) {
            return null;
        }
        c.f.b.i.d d2 = c3.b;
        Object object = n2 == 0 ? d2.d : d2.e;
        int n3 = c3.c.ordinal();
        if (n3 != 1 && n3 != 2) {
            if (n3 != 3 && n3 != 4) {
                return null;
            }
            return object.i;
        }
        return object.h;
    }

    public long j() {
        g g2 = this.e;
        if (g2.j) {
            return g2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public void l(c c2, c c3, int n2) {
        block5 : {
            int n3;
            f f2;
            int n4;
            f f3;
            int n5;
            block6 : {
                int n6;
                g g2;
                block11 : {
                    int n7;
                    block12 : {
                        block7 : {
                            block8 : {
                                block9 : {
                                    c.f.b.i.d d2;
                                    j j2;
                                    block10 : {
                                        d.a a2;
                                        d.a a3;
                                        f3 = this.h(c2);
                                        f2 = this.h(c3);
                                        if (!f3.j) break block5;
                                        if (!f2.j) {
                                            return;
                                        }
                                        n3 = f3.g + c2.b();
                                        n4 = f2.g - c3.b();
                                        n5 = n4 - n3;
                                        g2 = this.e;
                                        if (g2.j || (a2 = this.d) != (a3 = d.a.g)) break block6;
                                        int n8 = this.a;
                                        if (n8 == 0) break block7;
                                        if (n8 == 1) break block8;
                                        if (n8 == 2) break block9;
                                        if (n8 != 3) break block6;
                                        d2 = this.b;
                                        j2 = d2.d;
                                        if (j2.d != a3 || j2.a != 3) break block10;
                                        l l2 = d2.e;
                                        if (l2.d == a3 && l2.a == 3) break block6;
                                    }
                                    if (n2 == 0) {
                                        j2 = d2.e;
                                    }
                                    g g3 = j2.e;
                                    if (!g3.j) break block6;
                                    float f4 = d2.N;
                                    n6 = n2 == 1 ? (int)(0.5f + (float)g3.g / f4) : (int)(0.5f + f4 * (float)g3.g);
                                    break block11;
                                }
                                c.f.b.i.d d3 = this.b;
                                c.f.b.i.d d4 = d3.K;
                                if (d4 == null) break block6;
                                Object object = n2 == 0 ? d4.d : d4.e;
                                g g4 = object.e;
                                if (!g4.j) break block6;
                                float f5 = n2 == 0 ? d3.o : d3.r;
                                n7 = (int)(0.5f + f5 * (float)g4.g);
                                break block12;
                            }
                            int n9 = this.g(g2.m, n2);
                            g g5 = this.e;
                            n6 = Math.min(n9, n5);
                            g2 = g5;
                            break block11;
                        }
                        n7 = n5;
                    }
                    n6 = this.g(n7, n2);
                }
                g2.c(n6);
            }
            g g6 = this.e;
            if (!g6.j) {
                return;
            }
            int n10 = g6.g;
            if (n10 == n5) {
                this.h.c(n3);
                this.i.c(n4);
                return;
            }
            float f6 = n2 == 0 ? this.b.U : this.b.V;
            if (f3 == f2) {
                n3 = f3.g;
                n4 = f2.g;
                f6 = 0.5f;
            }
            int n11 = n4 - n3 - n10;
            this.h.c((int)(0.5f + (float)n3 + f6 * (float)n11));
            this.i.c(this.h.g + this.e.g);
        }
    }
}

