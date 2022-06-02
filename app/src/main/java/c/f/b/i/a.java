/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.d
 *  c.f.b.g
 *  c.f.b.i.c
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.f.b.i;

import c.f.b.b;
import c.f.b.g;
import c.f.b.i.c;
import c.f.b.i.d;
import c.f.b.i.h;

public class a
extends h {
    public int g0 = 0;
    public boolean h0 = true;
    public int i0 = 0;

    public void b(c.f.b.d d2) {
        block10 : {
            g g2;
            c c2;
            block12 : {
                int n2;
                block14 : {
                    block13 : {
                        block11 : {
                            boolean bl;
                            c c3;
                            int n3;
                            block9 : {
                                c[] arrc;
                                d.a a2 = d.a.g;
                                c[] arrc2 = this.G;
                                arrc2[0] = this.y;
                                arrc2[2] = this.z;
                                arrc2[1] = this.A;
                                arrc2[3] = this.B;
                                for (int i2 = 0; i2 < (arrc = this.G).length; ++i2) {
                                    arrc[i2].g = d2.l((Object)arrc[i2]);
                                }
                                int n4 = this.g0;
                                if (n4 < 0 || n4 >= 4) break block10;
                                c3 = arrc[n4];
                                for (int i3 = 0; i3 < this.f0; ++i3) {
                                    int n5;
                                    int n6;
                                    d d3 = this.e0[i3];
                                    if (!this.h0 && !d3.c() || ((n5 = this.g0) != 0 && n5 != 1 || d3.j() != a2 || d3.y.d == null || d3.A.d == null) && ((n6 = this.g0) != 2 && n6 != 3 || d3.n() != a2 || d3.z.d == null || d3.B.d == null)) continue;
                                    bl = true;
                                    break block9;
                                }
                                bl = false;
                            }
                            boolean bl2 = this.y.c() || this.A.c();
                            boolean bl3 = this.z.c() || this.B.c();
                            boolean bl4 = !bl && ((n3 = this.g0) == 0 && bl2 || n3 == 2 && bl3 || n3 == 1 && bl2 || n3 == 3 && bl3);
                            int n7 = 5;
                            if (!bl4) {
                                n7 = 4;
                            }
                            for (int i4 = 0; i4 < this.f0; ++i4) {
                                d d4 = this.e0[i4];
                                if (!this.h0 && !d4.c()) continue;
                                g g3 = d2.l((Object)d4.G[this.g0]);
                                c[] arrc = d4.G;
                                int n8 = this.g0;
                                arrc[n8].g = g3;
                                int n9 = arrc[n8].d != null && arrc[n8].d.b == this ? 0 + arrc[n8].e : 0;
                                if (n8 != 0 && n8 != 2) {
                                    g g4 = c3.g;
                                    int n10 = n9 + this.i0;
                                    b b2 = d2.m();
                                    g g5 = d2.n();
                                    g5.d = 0;
                                    b2.e(g4, g3, g5, n10);
                                    d2.c(b2);
                                } else {
                                    g g6 = c3.g;
                                    int n11 = this.i0 - n9;
                                    b b3 = d2.m();
                                    g g7 = d2.n();
                                    g7.d = 0;
                                    b3.f(g6, g3, g7, n11);
                                    d2.c(b3);
                                }
                                d2.d(c3.g, g3, n9 + this.i0, n7);
                            }
                            n2 = this.g0;
                            if (n2 != 0) break block11;
                            d2.d(this.A.g, this.y.g, 0, 8);
                            d2.d(this.y.g, this.K.A.g, 0, 4);
                            g2 = this.y.g;
                            c2 = this.K.y;
                            break block12;
                        }
                        if (n2 != 1) break block13;
                        d2.d(this.y.g, this.A.g, 0, 8);
                        d2.d(this.y.g, this.K.y.g, 0, 4);
                        g2 = this.y.g;
                        c2 = this.K.A;
                        break block12;
                    }
                    if (n2 != 2) break block14;
                    d2.d(this.B.g, this.z.g, 0, 8);
                    d2.d(this.z.g, this.K.B.g, 0, 4);
                    g2 = this.z.g;
                    c2 = this.K.z;
                    break block12;
                }
                if (n2 != 3) break block10;
                d2.d(this.z.g, this.B.g, 0, 8);
                d2.d(this.z.g, this.K.z.g, 0, 4);
                g2 = this.z.g;
                c2 = this.K.B;
            }
            d2.d(g2, c2.g, 0, 0);
        }
    }

    public boolean c() {
        return true;
    }

    public String toString() {
        String string = d.a.b.a.a.o((StringBuilder)d.a.b.a.a.d((String)"[Barrier] "), (String)this.Y, (String)" {");
        for (int i2 = 0; i2 < this.f0; ++i2) {
            d d2 = this.e0[i2];
            if (i2 > 0) {
                string = d.a.b.a.a.m((String)string, (String)", ");
            }
            StringBuilder stringBuilder = d.a.b.a.a.d((String)string);
            stringBuilder.append(d2.Y);
            string = stringBuilder.toString();
        }
        return d.a.b.a.a.m((String)string, (String)"}");
    }
}

