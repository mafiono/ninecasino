/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.i.c
 *  c.f.b.i.c$a
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  c.f.b.i.g
 *  c.f.b.i.l.d
 *  c.f.b.i.l.f$a
 *  c.f.b.i.l.k
 *  c.f.b.i.l.m$a
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.c;
import c.f.b.i.d;
import c.f.b.i.g;
import c.f.b.i.l.a;
import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.j;
import c.f.b.i.l.k;
import c.f.b.i.l.m;
import java.util.List;

public class l
extends m {
    public f k;
    public c.f.b.i.l.g l;

    public l(c.f.b.i.d d2) {
        f f2;
        super(d2);
        this.k = f2 = new f(this);
        this.l = null;
        this.h.e = f.a.j;
        this.i.e = f.a.k;
        f2.e = f.a.l;
        this.f = 1;
    }

    @Override
    public void a(d d2) {
        d.a a2;
        block16 : {
            c.f.b.i.l.g g2;
            int n2;
            block20 : {
                float f2;
                block22 : {
                    float f3;
                    float f4;
                    block21 : {
                        c.f.b.i.d d3;
                        block17 : {
                            c.f.b.i.l.g g3;
                            block18 : {
                                block19 : {
                                    a2 = d.a.g;
                                    int n3 = this.j.ordinal();
                                    if (n3 != 1 && n3 != 2 && n3 == 3) {
                                        c.f.b.i.d d4 = this.b;
                                        this.l(d4.z, d4.B, 1);
                                        return;
                                    }
                                    g2 = this.e;
                                    if (!g2.c || g2.j || this.d != a2) break block16;
                                    d3 = this.b;
                                    int n4 = d3.k;
                                    if (n4 == 2) break block17;
                                    if (n4 != 3) break block16;
                                    g3 = d3.d.e;
                                    if (!g3.j) break block16;
                                    int n5 = d3.O;
                                    if (n5 == -1) break block18;
                                    if (n5 == 0) break block19;
                                    if (n5 == 1) break block18;
                                    n2 = 0;
                                    break block20;
                                }
                                f4 = g3.g;
                                f3 = d3.N;
                                break block21;
                            }
                            f2 = (float)g3.g / d3.N;
                            break block22;
                        }
                        c.f.b.i.d d5 = d3.K;
                        if (d5 == null) break block16;
                        c.f.b.i.l.g g4 = d5.e.e;
                        if (!g4.j) break block16;
                        f3 = d3.r;
                        f4 = g4.g;
                    }
                    f2 = f4 * f3;
                }
                n2 = (int)(f2 + 0.5f);
            }
            g2.c(n2);
        }
        f f5 = this.h;
        if (f5.c) {
            f f6 = this.i;
            if (!f6.c) {
                return;
            }
            if (f5.j && f6.j && this.e.j) {
                return;
            }
            if (!this.e.j && this.d == a2) {
                c.f.b.i.d d6 = this.b;
                if (d6.j == 0 && !d6.t()) {
                    f f7 = this.h.l.get(0);
                    f f8 = this.i.l.get(0);
                    int n6 = f7.g;
                    f f9 = this.h;
                    int n7 = n6 + f9.f;
                    int n8 = f8.g + this.i.f;
                    int n9 = n8 - n7;
                    f9.c(n7);
                    this.i.c(n8);
                    this.e.c(n9);
                    return;
                }
            }
            if (!this.e.j && this.d == a2 && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                f f10 = this.h.l.get(0);
                f f11 = this.i.l.get(0);
                int n10 = f10.g + this.h.f;
                int n11 = f11.g + this.i.f - n10;
                c.f.b.i.l.g g5 = this.e;
                int n12 = g5.m;
                if (n11 < n12) {
                    g5.c(n11);
                } else {
                    g5.c(n12);
                }
            }
            if (!this.e.j) {
                return;
            }
            if (this.h.l.size() > 0 && this.i.l.size() > 0) {
                f f12 = this.h.l.get(0);
                f f13 = this.i.l.get(0);
                int n13 = f12.g;
                f f14 = this.h;
                int n14 = n13 + f14.f;
                int n15 = f13.g;
                int n16 = n15 + this.i.f;
                float f15 = this.b.V;
                if (f12 == f13) {
                    f15 = 0.5f;
                } else {
                    n13 = n14;
                    n15 = n16;
                }
                int n17 = n15 - n13 - this.e.g;
                f14.c((int)(0.5f + (float)n13 + f15 * (float)n17));
                this.i.c(this.h.g + this.e.g);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void d() {
        block47 : {
            j j2;
            block50 : {
                c.f.b.i.d d2;
                d.a a2;
                c.f.b.i.d d3;
                block53 : {
                    f f2;
                    f f3;
                    c.f.b.i.l.g g2;
                    block52 : {
                        c[] arrc;
                        block51 : {
                            block48 : {
                                block49 : {
                                    block46 : {
                                        block44 : {
                                            c.f.b.i.l.g g3;
                                            block42 : {
                                                List<d> list;
                                                block45 : {
                                                    c.f.b.i.d d4;
                                                    block43 : {
                                                        c.f.b.i.d d5;
                                                        d.a a3 = d.a.h;
                                                        d.a a4 = d.a.e;
                                                        a2 = d.a.g;
                                                        c.f.b.i.d d6 = this.b;
                                                        if (d6.a) {
                                                            this.e.c(d6.i());
                                                        }
                                                        if (!this.e.j) {
                                                            d.a a5;
                                                            this.d = this.b.n();
                                                            if (this.b.w) {
                                                                this.l = new a(this);
                                                            }
                                                            if ((a5 = this.d) != a2) {
                                                                c.f.b.i.d d7;
                                                                if (a5 == a3 && (d7 = this.b.K) != null && d7.n() == a4) {
                                                                    int n2 = d7.i() - this.b.z.b() - this.b.B.b();
                                                                    this.b(this.h, d7.e.h, this.b.z.b());
                                                                    this.b(this.i, d7.e.i, -this.b.B.b());
                                                                    this.e.c(n2);
                                                                    return;
                                                                }
                                                                if (this.d == a4) {
                                                                    this.e.c(this.b.i());
                                                                }
                                                            }
                                                        } else if (this.d == a3 && (d5 = this.b.K) != null && d5.n() == a4) {
                                                            this.b(this.h, d5.e.h, this.b.z.b());
                                                            this.b(this.i, d5.e.i, -this.b.B.b());
                                                            return;
                                                        }
                                                        g3 = this.e;
                                                        boolean bl = g3.j;
                                                        if (bl) {
                                                            c.f.b.i.d d8 = this.b;
                                                            if (d8.a) {
                                                                c.f.b.i.d d9;
                                                                f f4;
                                                                f f5;
                                                                c[] arrc2 = d8.G;
                                                                if (arrc2[2].d != null && arrc2[3].d != null) {
                                                                    if (d8.t()) {
                                                                        this.h.f = this.b.G[2].b();
                                                                        this.i.f = -this.b.G[3].b();
                                                                    } else {
                                                                        f f6;
                                                                        f f7 = this.h(this.b.G[2]);
                                                                        if (f7 != null) {
                                                                            f f8 = this.h;
                                                                            int n3 = this.b.G[2].b();
                                                                            f8.l.add(f7);
                                                                            f8.f = n3;
                                                                            f7.k.add((Object)f8);
                                                                        }
                                                                        if ((f6 = this.h(this.b.G[3])) != null) {
                                                                            f f9 = this.i;
                                                                            int n4 = -this.b.G[3].b();
                                                                            f9.l.add(f6);
                                                                            f9.f = n4;
                                                                            f6.k.add((Object)f9);
                                                                        }
                                                                        this.h.b = true;
                                                                        this.i.b = true;
                                                                    }
                                                                    d9 = this.b;
                                                                    if (!d9.w) return;
                                                                    f5 = this.k;
                                                                    f4 = this.h;
                                                                } else if (arrc2[2].d != null) {
                                                                    f f10 = this.h(arrc2[2]);
                                                                    if (f10 == null) return;
                                                                    f f11 = this.h;
                                                                    int n5 = this.b.G[2].b();
                                                                    f11.l.add(f10);
                                                                    f11.f = n5;
                                                                    f10.k.add((Object)f11);
                                                                    this.b(this.i, this.h, this.e.g);
                                                                    d9 = this.b;
                                                                    if (!d9.w) return;
                                                                    f5 = this.k;
                                                                    f4 = this.h;
                                                                } else if (arrc2[3].d != null) {
                                                                    f f12 = this.h(arrc2[3]);
                                                                    if (f12 != null) {
                                                                        f f13 = this.i;
                                                                        int n6 = -this.b.G[3].b();
                                                                        f13.l.add(f12);
                                                                        f13.f = n6;
                                                                        f12.k.add((Object)f13);
                                                                        this.b(this.h, this.i, -this.e.g);
                                                                    }
                                                                    d9 = this.b;
                                                                    if (!d9.w) return;
                                                                    f5 = this.k;
                                                                    f4 = this.h;
                                                                } else {
                                                                    if (arrc2[4].d != null) {
                                                                        f f14 = this.h(arrc2[4]);
                                                                        if (f14 == null) return;
                                                                        {
                                                                            f f15 = this.k;
                                                                            f15.l.add(f14);
                                                                            f15.f = 0;
                                                                            f14.k.add((Object)f15);
                                                                            this.b(this.h, this.k, -this.b.R);
                                                                            this.b(this.i, this.h, this.e.g);
                                                                            return;
                                                                        }
                                                                    }
                                                                    if (d8 instanceof g || d8.K == null || d8.f((c.a)c.a.k).d != null) return;
                                                                    c.f.b.i.d d10 = this.b;
                                                                    f f16 = d10.K.e.h;
                                                                    this.b(this.h, f16, d10.q());
                                                                    this.b(this.i, this.h, this.e.g);
                                                                    d9 = this.b;
                                                                    if (!d9.w) return;
                                                                    f5 = this.k;
                                                                    f4 = this.h;
                                                                }
                                                                this.b(f5, f4, d9.R);
                                                                return;
                                                            }
                                                        }
                                                        if (bl || this.d != a2) break block42;
                                                        d4 = this.b;
                                                        int n7 = d4.k;
                                                        if (n7 == 2) break block43;
                                                        if (n7 != 3 || d4.t()) break block44;
                                                        c.f.b.i.d d11 = this.b;
                                                        if (d11.j == 3) break block44;
                                                        c.f.b.i.l.g g4 = d11.d.e;
                                                        this.e.l.add(g4);
                                                        list = g4.k;
                                                        break block45;
                                                    }
                                                    c.f.b.i.d d12 = d4.K;
                                                    if (d12 == null) break block44;
                                                    c.f.b.i.l.g g5 = d12.e.e;
                                                    g3.l.add(g5);
                                                    list = g5.k;
                                                }
                                                list.add((Object)this.e);
                                                c.f.b.i.l.g g6 = this.e;
                                                g6.b = true;
                                                g6.k.add((Object)this.h);
                                                this.e.k.add((Object)this.i);
                                                break block44;
                                            }
                                            g3.k.add((Object)this);
                                            if (g3.j) {
                                                this.a(this);
                                            }
                                        }
                                        d2 = this.b;
                                        arrc = d2.G;
                                        if (arrc[2].d == null || arrc[3].d == null) break block46;
                                        if (d2.t()) {
                                            this.h.f = this.b.G[2].b();
                                            this.i.f = -this.b.G[3].b();
                                        } else {
                                            f f17 = this.h(this.b.G[2]);
                                            f f18 = this.h(this.b.G[3]);
                                            f17.k.add((Object)this);
                                            if (f17.j) {
                                                this.a(this);
                                            }
                                            f18.k.add((Object)this);
                                            if (f18.j) {
                                                this.a(this);
                                            }
                                            this.j = m.a.h;
                                        }
                                        if (!this.b.w) break block47;
                                        break block48;
                                    }
                                    if (arrc[2].d == null) break block49;
                                    f f19 = this.h(arrc[2]);
                                    if (f19 == null) break block47;
                                    f f20 = this.h;
                                    int n8 = this.b.G[2].b();
                                    f20.l.add(f19);
                                    f20.f = n8;
                                    f19.k.add((Object)f20);
                                    this.c(this.i, this.h, 1, this.e);
                                    if (this.b.w) {
                                        this.c(this.k, this.h, 1, this.l);
                                    }
                                    if (this.d != a2) break block47;
                                    c.f.b.i.d d13 = this.b;
                                    if (!(d13.N > 0.0f)) break block47;
                                    j2 = d13.d;
                                    if (j2.d != a2) break block47;
                                    break block50;
                                }
                                if (arrc[3].d == null) break block51;
                                f f21 = this.h(arrc[3]);
                                if (f21 == null) break block47;
                                f f22 = this.i;
                                int n9 = -this.b.G[3].b();
                                f22.l.add(f21);
                                f22.f = n9;
                                f21.k.add((Object)f22);
                                this.c(this.h, this.i, -1, this.e);
                                if (!this.b.w) break block47;
                            }
                            f3 = this.k;
                            f2 = this.h;
                            g2 = this.l;
                            break block52;
                        }
                        if (arrc[4].d == null) break block53;
                        f f23 = this.h(arrc[4]);
                        if (f23 == null) break block47;
                        f f24 = this.k;
                        f24.l.add(f23);
                        f24.f = 0;
                        f23.k.add((Object)f24);
                        this.c(this.h, this.k, -1, this.l);
                        f3 = this.i;
                        f2 = this.h;
                        g2 = this.e;
                    }
                    this.c(f3, f2, 1, g2);
                    break block47;
                }
                if (d2 instanceof g || (d3 = d2.K) == null) break block47;
                f f25 = d3.e.h;
                this.b(this.h, f25, d2.q());
                this.c(this.i, this.h, 1, this.e);
                if (this.b.w) {
                    this.c(this.k, this.h, 1, this.l);
                }
                if (this.d != a2) break block47;
                c.f.b.i.d d14 = this.b;
                if (!(d14.N > 0.0f)) break block47;
                j2 = d14.d;
                if (j2.d != a2) break block47;
            }
            j2.e.k.add((Object)this.e);
            this.e.l.add((Object)this.b.d.e);
            this.e.a = this;
        }
        if (this.e.l.size() != 0) return;
        {
            this.e.c = true;
        }
    }

    @Override
    public void e() {
        f f2 = this.h;
        if (f2.j) {
            this.b.Q = f2.g;
        }
    }

    @Override
    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.e.b();
        this.g = false;
    }

    @Override
    public boolean k() {
        if (this.d == d.a.g) {
            return this.b.k == 0;
        }
        return true;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"VerticalRun ");
        stringBuilder.append(this.b.Y);
        return stringBuilder.toString();
    }
}

