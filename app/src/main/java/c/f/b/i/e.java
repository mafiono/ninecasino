/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.d.a
 *  c.f.b.c
 *  c.f.b.d
 *  c.f.b.d$a
 *  c.f.b.g
 *  c.f.b.i.b
 *  c.f.b.i.c
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  c.f.b.i.i
 *  c.f.b.i.l.b
 *  c.f.b.i.l.b$b
 *  c.f.b.i.l.e
 *  java.io.PrintStream
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Objects
 */
package c.f.b.i;

import c.f.b.d;
import c.f.b.g;
import c.f.b.i.a;
import c.f.b.i.d;
import c.f.b.i.h;
import c.f.b.i.i;
import c.f.b.i.j;
import c.f.b.i.k;
import c.f.b.i.l.b;
import c.f.b.i.l.c;
import c.f.b.i.l.f;
import c.f.b.i.l.l;
import c.f.b.i.l.m;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class e
extends k {
    public b f0 = new b(this);
    public c.f.b.i.l.e g0 = new c.f.b.i.l.e(this);
    public b.b h0 = null;
    public boolean i0 = false;
    public d j0 = new d();
    public int k0;
    public int l0;
    public int m0 = 0;
    public int n0 = 0;
    public c.f.b.i.b[] o0 = new c.f.b.i.b[4];
    public c.f.b.i.b[] p0 = new c.f.b.i.b[4];
    public int q0 = 263;
    public boolean r0 = false;
    public boolean s0 = false;

    public void C(boolean bl, boolean bl2) {
        c.f.b.i.d.super.C(bl, bl2);
        int n2 = this.e0.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((c.f.b.i.d)this.e0.get(i2)).C(bl, bl2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void E() {
        var1_1 = i.a;
        var2_2 = d.a.f;
        var3_3 = d.a.e;
        this.P = 0;
        this.Q = 0;
        var4_4 = Math.max(0, (int)this.o());
        var5_5 = Math.max(0, (int)this.i());
        this.r0 = false;
        this.s0 = false;
        var6_6 = this.q0;
        var7_7 = (var6_6 & 64) == 64;
        var8_9 = var7_7 || (var58_8 = (var6_6 & 128) == 128);
        var9_10 = this.j0;
        Objects.requireNonNull(var9_10);
        var9_10.f = false;
        if (var6_6 != 0 && var8_9) {
            var9_10.f = true;
        }
        var11_11 = this.J;
        var12_12 = var11_11[1];
        var13_13 = var11_11[0];
        var14_14 = this.e0;
        var15_15 = this.j() == var2_2 || this.n() == var2_2;
        this.m0 = 0;
        this.n0 = 0;
        var16_16 = this.e0.size();
        for (var17_17 = 0; var17_17 < var16_16; ++var17_17) {
            var57_18 = (c.f.b.i.d)this.e0.get(var17_17);
            if (!(var57_18 instanceof k)) continue;
            ((k)var57_18).E();
        }
        var18_19 = 0;
        var19_20 = true;
        var20_21 = false;
        do {
            block38 : {
                block37 : {
                    block35 : {
                        block36 : {
                            block34 : {
                                block33 : {
                                    if (var19_20) {
                                        var23_22 = var18_19 + 1;
                                        try {
                                            this.j0.t();
                                            this.m0 = 0;
                                            this.n0 = 0;
                                            this.e(this.j0);
                                            break block33;
                                        }
                                        catch (Exception var24_26) {
                                            var25_27 = var19_20;
                                            break block34;
                                        }
                                    }
                                    var21_55 = var20_21;
                                    this.e0 = var14_14;
                                    if (var21_55) {
                                        var22_56 = this.J;
                                        var22_56[0] = var13_13;
                                        var22_56[1] = var12_12;
                                    }
                                    this.v(this.j0.k);
                                    return;
                                }
                                for (var50_50 = 0; var50_50 < var16_16; ++var50_50) {
                                    var51_51 = (c.f.b.i.d)this.e0.get(var50_50);
                                    var25_27 = var19_20;
                                    var51_51.e(this.j0);
                                    var19_20 = var25_27;
                                    continue;
                                }
                                var25_27 = var19_20;
                                try {
                                    this.G(this.j0);
                                }
                                catch (Exception var24_25) {}
                                try {
                                    var53_52 = this.j0;
                                    Objects.requireNonNull(var53_52);
                                    if (var53_52.f) {
                                        break block35;
                                    }
                                    ** GOTO lbl-1000
                                }
                                catch (Exception var24_24) {
                                    var26_28 = true;
                                    break block36;
                                }
                            }
                            var26_28 = var25_27;
                        }
                        var24_23.printStackTrace();
                        var27_29 = System.out;
                        var28_30 = var26_28;
                        var29_31 = new StringBuilder();
                        var30_32 = var20_21;
                        var29_31.append("EXCEPTION : ");
                        var29_31.append((Object)var24_23);
                        var27_29.println(var29_31.toString());
                        break block38;
                    }
                    for (var55_53 = 0; var55_53 < var53_52.i; ++var55_53) {
                        if (var53_52.e[var55_53].e) continue;
                        var56_54 = false;
                        break block37;
                    }
                    var56_54 = true;
                }
                if (var56_54) {
                    var53_52.j();
                } else lbl-1000: // 2 sources:
                {
                    var53_52.q(var53_52.b);
                }
                var30_32 = var20_21;
                var28_30 = true;
            }
            if (var28_30) {
                var47_47 = this.j0;
                var1_1[2] = false;
                this.D(var47_47);
                var48_48 = this.e0.size();
                for (var49_49 = 0; var49_49 < var48_48; ++var49_49) {
                    ((c.f.b.i.d)this.e0.get(var49_49)).D(var47_47);
                }
            } else {
                this.D(this.j0);
                for (var33_33 = 0; var33_33 < var16_16; ++var33_33) {
                    ((c.f.b.i.d)this.e0.get(var33_33)).D(this.j0);
                }
            }
            if (var15_15 && var23_22 < 8 && var1_1[2]) {
                var41_41 = 0;
                var42_42 = 0;
                for (var40_40 = 0; var40_40 < var16_16; ++var40_40) {
                    var45_45 = (c.f.b.i.d)this.e0.get(var40_40);
                    var46_46 = var1_1;
                    var41_41 = Math.max((int)var41_41, (int)(var45_45.P + var45_45.o()));
                    var42_42 = Math.max((int)var42_42, (int)(var45_45.Q + var45_45.i()));
                    var1_1 = var46_46;
                }
                var34_34 = var1_1;
                var43_43 = Math.max((int)this.S, (int)var41_41);
                var44_44 = Math.max((int)this.T, (int)var42_42);
                if (var13_13 == var2_2 && this.o() < var43_43) {
                    this.B(var43_43);
                    this.J[0] = var2_2;
                    var35_35 = true;
                    var20_21 = true;
                } else {
                    var20_21 = var30_32;
                    var35_35 = false;
                }
                if (var12_12 == var2_2 && this.i() < var44_44) {
                    this.w(var44_44);
                    this.J[1] = var2_2;
                    var35_35 = true;
                    var20_21 = true;
                }
            } else {
                var34_34 = var1_1;
                var20_21 = var30_32;
                var35_35 = false;
            }
            if ((var36_36 = Math.max((int)this.S, (int)this.o())) > this.o()) {
                this.B(var36_36);
                this.J[0] = var3_3;
                var35_35 = true;
                var20_21 = true;
            }
            if ((var37_37 = Math.max((int)this.T, (int)this.i())) > this.i()) {
                this.w(var37_37);
                var39_39 = this.J;
                var38_38 = 1;
                var39_39[var38_38] = var3_3;
                var35_35 = true;
                var20_21 = true;
            } else {
                var38_38 = 1;
            }
            if (var20_21) ** GOTO lbl-1000
            if (this.J[0] == var2_2 && var4_4 > 0 && this.o() > var4_4) {
                this.r0 = var38_38;
                this.J[0] = var3_3;
                this.B(var4_4);
                var35_35 = true;
                var20_21 = true;
            }
            if (this.J[var38_38] == var2_2 && var5_5 > 0 && this.i() > var5_5) {
                this.s0 = var38_38;
                this.J[var38_38] = var3_3;
                this.w(var5_5);
                var19_20 = true;
                var20_21 = true;
            } else lbl-1000: // 2 sources:
            {
                var19_20 = var35_35;
            }
            var18_19 = var23_22;
            var1_1 = var34_34;
        } while (true);
    }

    public void F(c.f.b.i.d d2, int n2) {
        if (n2 == 0) {
            int n3 = 1 + this.m0;
            Object[] arrobject = this.p0;
            if (n3 >= arrobject.length) {
                this.p0 = (c.f.b.i.b[])Arrays.copyOf(arrobject, 2 * arrobject.length);
            }
            c.f.b.i.b[] arrb = this.p0;
            int n4 = this.m0;
            arrb[n4] = new c.f.b.i.b(d2, 0, this.i0);
            this.m0 = n4 + 1;
            return;
        }
        if (n2 == 1) {
            int n5 = 1 + this.n0;
            Object[] arrobject = this.o0;
            if (n5 >= arrobject.length) {
                this.o0 = (c.f.b.i.b[])Arrays.copyOf(arrobject, 2 * arrobject.length);
            }
            c.f.b.i.b[] arrb = this.o0;
            int n6 = this.n0;
            arrb[n6] = new c.f.b.i.b(d2, 1, this.i0);
            this.n0 = n6 + 1;
        }
    }

    public boolean G(d d2) {
        d.a a2 = d.a.e;
        d.a a3 = d.a.f;
        this.b(d2);
        int n2 = this.e0.size();
        boolean bl = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            c.f.b.i.d d3 = this.e0.get(i2);
            boolean[] arrbl = d3.I;
            arrbl[0] = false;
            arrbl[1] = false;
            if (!(d3 instanceof a)) continue;
            bl = true;
        }
        if (bl) {
            for (int i3 = 0; i3 < n2; ++i3) {
                c.f.b.i.d d4 = this.e0.get(i3);
                if (!(d4 instanceof a)) continue;
                a a4 = (a)d4;
                for (int i4 = 0; i4 < a4.f0; ++i4) {
                    c.f.b.i.d d5 = a4.e0[i4];
                    int n3 = a4.g0;
                    if (n3 != 0 && n3 != 1) {
                        if (n3 != 2 && n3 != 3) continue;
                        d5.I[1] = true;
                        continue;
                    }
                    d5.I[0] = true;
                }
            }
        }
        for (int i5 = 0; i5 < n2; ++i5) {
            c.f.b.i.d d6 = this.e0.get(i5);
            Objects.requireNonNull(d6);
            boolean bl2 = d6 instanceof j || d6 instanceof c.f.b.i.f;
            if (!bl2) continue;
            d6.b(d2);
        }
        for (int i6 = 0; i6 < n2; ++i6) {
            c.f.b.i.d d7 = this.e0.get(i6);
            if (d7 instanceof e) {
                d.a[] arra = d7.J;
                d.a a5 = arra[0];
                d.a a6 = arra[1];
                if (a5 == a3) {
                    arra[0] = a2;
                }
                if (a6 == a3) {
                    arra[1] = a2;
                }
                d7.b(d2);
                if (a5 == a3) {
                    d7.x(a5);
                }
                if (a6 != a3) continue;
                d7.A(a6);
                continue;
            }
            d.a a7 = d.a.h;
            d7.h = -1;
            d7.i = -1;
            if (this.J[0] != a3 && d7.J[0] == a7) {
                int n4;
                int n5 = d7.y.e;
                int n6 = this.o() - d7.A.e;
                c.f.b.i.c c2 = d7.y;
                c2.g = d2.l((Object)c2);
                c.f.b.i.c c3 = d7.A;
                c3.g = d2.l((Object)c3);
                d2.e(d7.y.g, n5);
                d2.e(d7.A.g, n6);
                d7.h = 2;
                d7.P = n5;
                d7.L = n4 = n6 - n5;
                int n7 = d7.S;
                if (n4 < n7) {
                    d7.L = n7;
                }
            }
            if (this.J[1] != a3 && d7.J[1] == a7) {
                int n8;
                int n9 = d7.z.e;
                int n10 = this.i() - d7.B.e;
                c.f.b.i.c c4 = d7.z;
                c4.g = d2.l((Object)c4);
                c.f.b.i.c c5 = d7.B;
                c5.g = d2.l((Object)c5);
                d2.e(d7.z.g, n9);
                d2.e(d7.B.g, n10);
                if (d7.R > 0 || d7.X == 8) {
                    c.f.b.i.c c6 = d7.C;
                    c6.g = d2.l((Object)c6);
                    d2.e(d7.C.g, n9 + d7.R);
                }
                d7.i = 2;
                d7.Q = n9;
                d7.M = n8 = n10 - n9;
                int n11 = d7.T;
                if (n8 < n11) {
                    d7.M = n11;
                }
            }
            boolean bl3 = d7 instanceof j || d7 instanceof c.f.b.i.f;
            if (bl3) continue;
            d7.b(d2);
        }
        if (this.m0 > 0) {
            c.d.a.a((e)this, (d)d2, (int)0);
        }
        if (this.n0 > 0) {
            c.d.a.a((e)this, (d)d2, (int)1);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean H(boolean var1_1, int var2_2) {
        block11 : {
            block8 : {
                block10 : {
                    block9 : {
                        var3_3 = this.g0;
                        var4_4 = d.a.h;
                        var5_5 = d.a.f;
                        var6_6 = d.a.e;
                        var7_7 = true;
                        var8_8 = var1_1 & var7_7;
                        var9_9 = var3_3.a.h(0);
                        var10_10 = var3_3.a.h((int)var7_7);
                        var11_11 = var3_3.a.p();
                        var12_12 = var3_3.a.q();
                        if (!var8_8 || var9_9 != var5_5 && var10_10 != var5_5) break block8;
                        for (m var31_14 : var3_3.e) {
                            if (var31_14.f != var2_2 || var31_14.k()) continue;
                            var8_8 = false;
                            break;
                        }
                        if (var2_2 != 0) break block9;
                        if (!var8_8 || var9_9 != var5_5) break block8;
                        var29_15 = var3_3.a;
                        var29_15.J[0] = var6_6;
                        var29_15.B(var3_3.d(var29_15, 0));
                        var30_16 = var3_3.a;
                        var27_17 = var30_16.d.e;
                        var28_18 = var30_16.o();
                        break block10;
                    }
                    if (!var8_8 || var10_10 != var5_5) break block8;
                    var25_19 = var3_3.a;
                    var25_19.J[var7_7] = var6_6;
                    var25_19.w(var3_3.d(var25_19, (int)var7_7));
                    var26_20 = var3_3.a;
                    var27_17 = var26_20.e.e;
                    var28_18 = var26_20.i();
                }
                var27_17.c(var28_18);
            }
            var13_21 = var3_3.a;
            var14_22 = var13_21.J;
            if (var2_2 != 0) break block11;
            if (var14_22[0] != var6_6 && var14_22[0] != var4_4) ** GOTO lbl-1000
            var23_23 = var11_11 + var13_21.o();
            var3_3.a.d.i.c(var23_23);
            var16_24 = var3_3.a.d.e;
            var17_25 = var23_23 - var11_11;
            ** GOTO lbl53
        }
        if (var14_22[var7_7] != var6_6 && var14_22[var7_7] != var4_4) lbl-1000: // 2 sources:
        {
            var18_26 = false;
        } else {
            var15_27 = var12_12 + var13_21.i();
            var3_3.a.e.i.c(var15_27);
            var16_24 = var3_3.a.e.e;
            var17_25 = var15_27 - var12_12;
lbl53: // 2 sources:
            var16_24.c(var17_25);
            var18_26 = true;
        }
        var3_3.g();
        for (m var22_29 : var3_3.e) {
            if (var22_29.f != var2_2 || var22_29.b == var3_3.a && !var22_29.g) continue;
            var22_29.e();
        }
        for (m var21_31 : var3_3.e) {
            if (var21_31.f != var2_2 || !var18_26 && var21_31.b == var3_3.a || var21_31.h.j && var21_31.i.j && (var21_31 instanceof c || var21_31.e.j)) continue;
            var7_7 = false;
            break;
        }
        var3_3.a.x(var9_9);
        var3_3.a.A(var10_10);
        return var7_7;
    }

    public void I() {
        this.g0.b = true;
    }

    public void J(int n2) {
        this.q0 = n2;
        d.p = i.a((int)n2, (int)256);
    }

    @Override
    public void u() {
        this.j0.t();
        this.k0 = 0;
        this.l0 = 0;
        super.u();
    }
}

