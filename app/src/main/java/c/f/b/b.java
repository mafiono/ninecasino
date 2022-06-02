/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.b$a
 *  c.f.b.c
 *  c.f.b.d
 *  c.f.b.d$a
 *  c.f.b.g
 *  c.f.b.g$a
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package c.f.b;

import c.f.b.b;
import c.f.b.c;
import c.f.b.d;
import c.f.b.g;
import java.util.ArrayList;

public class b
implements d.a {
    public g a = null;
    public float b = 0.0f;
    public ArrayList<g> c = new ArrayList();
    public a d;
    public boolean e = false;

    public b() {
    }

    public b(c c2) {
        this.d = new a(this, c2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(g var1_1) {
        var2_2 = var1_1.d;
        if (var2_2 == 1) ** GOTO lbl-1000
        if (var2_2 == 2) {
            var3_3 = 1000.0f;
        } else if (var2_2 == 3) {
            var3_3 = 1000000.0f;
        } else if (var2_2 == 4) {
            var3_3 = 1.0E9f;
        } else if (var2_2 == 5) {
            var3_3 = 1.0E12f;
        } else lbl-1000: // 2 sources:
        {
            var3_3 = 1.0f;
        }
        this.d.c(var1_1, var3_3);
    }

    public g b(d d2, boolean[] arrbl) {
        return this.i(arrbl, null);
    }

    public b c(d d2, int n2) {
        this.d.c(d2.k(n2, "ep"), 1.0f);
        this.d.c(d2.k(n2, "em"), -1.0f);
        return this;
    }

    public void clear() {
        this.d.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public b d(g g2, g g3, g g4, g g5, float f2) {
        this.d.c(g2, -1.0f);
        this.d.c(g3, 1.0f);
        this.d.c(g4, f2);
        this.d.c(g5, -f2);
        return this;
    }

    public b e(g g2, g g3, g g4, int n2) {
        boolean bl = false;
        if (n2 != 0) {
            bl = false;
            if (n2 < 0) {
                n2 *= -1;
                bl = true;
            }
            this.b = n2;
        }
        if (!bl) {
            this.d.c(g2, -1.0f);
            this.d.c(g3, 1.0f);
            this.d.c(g4, 1.0f);
            return this;
        }
        this.d.c(g2, 1.0f);
        this.d.c(g3, -1.0f);
        this.d.c(g4, -1.0f);
        return this;
    }

    public b f(g g2, g g3, g g4, int n2) {
        boolean bl = false;
        if (n2 != 0) {
            bl = false;
            if (n2 < 0) {
                n2 *= -1;
                bl = true;
            }
            this.b = n2;
        }
        if (!bl) {
            this.d.c(g2, -1.0f);
            this.d.c(g3, 1.0f);
            this.d.c(g4, -1.0f);
            return this;
        }
        this.d.c(g2, 1.0f);
        this.d.c(g3, -1.0f);
        this.d.c(g4, 1.0f);
        return this;
    }

    public b g(g g2, g g3, g g4, g g5, float f2) {
        this.d.c(g4, 0.5f);
        this.d.c(g5, 0.5f);
        this.d.c(g2, -0.5f);
        this.d.c(g3, -0.5f);
        this.b = -f2;
        return this;
    }

    public final boolean h(g g2) {
        return g2.l <= 1;
    }

    public final g i(boolean[] arrbl, g g2) {
        int n2 = this.d.k();
        g g3 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < n2; ++i2) {
            g.a a2;
            float f3 = this.d.a(i2);
            if (!(f3 < 0.0f)) continue;
            g g4 = this.d.f(i2);
            if (arrbl != null && arrbl[g4.b] || g4 == g2 || (a2 = g4.i) != g.a.g && a2 != g.a.h || !(f3 < f2)) continue;
            f2 = f3;
            g3 = g4;
        }
        return g3;
    }

    public void j(g g2) {
        g g3 = this.a;
        if (g3 != null) {
            this.d.c(g3, -1.0f);
            this.a = null;
        }
        float f2 = -1.0f * this.d.d(g2, true);
        this.a = g2;
        if (f2 == 1.0f) {
            return;
        }
        this.b /= f2;
        this.d.i(f2);
    }

    public void k(g g2, boolean bl) {
        if (!g2.f) {
            return;
        }
        float f2 = this.d.g(g2);
        this.b += f2 * g2.e;
        this.d.d(g2, bl);
        if (bl) {
            g2.b(this);
        }
    }

    public void l(b b2, boolean bl) {
        float f2 = this.d.b(b2, bl);
        this.b += f2 * b2.b;
        if (bl) {
            b2.a.b(this);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        if (this.a == null) {
            var3_1 = "0";
        } else {
            var1_2 = d.a.b.a.a.d((String)"");
            var1_2.append((Object)this.a);
            var3_1 = var1_2.toString();
        }
        var4_3 = d.a.b.a.a.m((String)var3_1, (String)" = ");
        var5_4 = this.b;
        var6_5 = 0;
        if (var5_4 != 0.0f) {
            var18_6 = d.a.b.a.a.d((String)var4_3);
            var18_6.append(this.b);
            var4_3 = var18_6.toString();
            var7_7 = true;
        } else {
            var7_7 = false;
        }
        var8_8 = this.d.k();
        do {
            block10 : {
                block12 : {
                    block11 : {
                        if (var6_5 >= var8_8) {
                            if (var7_7 != false) return var4_3;
                            return d.a.b.a.a.m((String)var4_3, (String)"0.0");
                        }
                        var9_9 = this.d.f(var6_5);
                        if (var9_9 == null || (var10_10 = this.d.a(var6_5)) == 0.0f) break block10;
                        var11_11 = var9_9.toString();
                        if (var7_7) break block11;
                        if (!(var10_10 < 0.0f)) break block12;
                        var12_12 = d.a.b.a.a.d((String)var4_3);
                        var13_13 = "- ";
                        ** GOTO lbl36
                    }
                    if (var10_10 > 0.0f) {
                        var4_3 = d.a.b.a.a.m((String)var4_3, (String)" + ");
                    } else {
                        var12_12 = d.a.b.a.a.d((String)var4_3);
                        var13_13 = " - ";
lbl36: // 2 sources:
                        var12_12.append(var13_13);
                        var4_3 = var12_12.toString();
                        var10_10 *= -1.0f;
                    }
                }
                if (var10_10 == 1.0f) {
                    var15_14 = new StringBuilder();
                } else {
                    var15_14 = new StringBuilder();
                    var15_14.append(var4_3);
                    var15_14.append(var10_10);
                    var4_3 = " ";
                }
                var4_3 = d.a.b.a.a.o((StringBuilder)var15_14, (String)var4_3, (String)var11_11);
                var7_7 = true;
            }
            ++var6_5;
        } while (true);
    }
}

