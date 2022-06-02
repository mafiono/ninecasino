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
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.c;
import c.f.b.i.d;
import c.f.b.i.g;
import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.k;
import c.f.b.i.l.l;
import c.f.b.i.l.m;
import d.a.b.a.a;
import java.util.List;

public class j
extends m {
    public static int[] k = new int[2];

    public j(c.f.b.i.d d2) {
        super(d2);
        this.h.e = f.a.h;
        this.i.e = f.a.i;
        this.f = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(d var1_1) {
        block27 : {
            block32 : {
                block33 : {
                    block34 : {
                        block28 : {
                            block42 : {
                                block43 : {
                                    block40 : {
                                        block41 : {
                                            block36 : {
                                                block38 : {
                                                    block39 : {
                                                        block37 : {
                                                            block35 : {
                                                                block29 : {
                                                                    block30 : {
                                                                        block31 : {
                                                                            var2_2 = d.a.g;
                                                                            var3_3 = j.k;
                                                                            var4_4 = this.j.ordinal();
                                                                            if (var4_4 != 1 && var4_4 != 2 && var4_4 == 3) {
                                                                                var77_5 = this.b;
                                                                                this.l(var77_5.y, var77_5.A, 0);
                                                                                return;
                                                                            }
                                                                            var5_6 = this.e;
                                                                            if (var5_6.j || this.d != var2_2) break block27;
                                                                            var32_7 = this.b;
                                                                            var33_8 = var32_7.j;
                                                                            if (var33_8 == 2) break block28;
                                                                            if (var33_8 != 3) break block27;
                                                                            var40_9 = var32_7.k;
                                                                            if (var40_9 == 0 || var40_9 == 3) break block29;
                                                                            var76_10 = var32_7.O;
                                                                            if (var76_10 == -1) break block30;
                                                                            if (var76_10 == 0) break block31;
                                                                            if (var76_10 == 1) break block30;
                                                                            var39_11 = 0;
                                                                            break block32;
                                                                        }
                                                                        var38_12 = (float)var32_7.e.e.g / var32_7.N;
                                                                        break block33;
                                                                    }
                                                                    var37_13 = var32_7.e.e.g;
                                                                    var36_14 = var32_7.N;
                                                                    break block34;
                                                                }
                                                                var41_15 = var32_7.e;
                                                                var42_16 = var41_15.h;
                                                                var43_17 = var41_15.i;
                                                                var44_18 = var32_7.y.d != null;
                                                                var45_19 = var32_7.z.d != null;
                                                                var46_20 = var32_7.A.d != null;
                                                                var47_21 = var32_7.B.d != null;
                                                                var48_22 = var32_7.O;
                                                                if (!var44_18 || !var45_19 || !var46_20 || !var47_21) break block35;
                                                                var65_23 = var32_7.N;
                                                                if (var42_16.j && var43_17.j) {
                                                                    var75_24 = this.h;
                                                                    if (var75_24.c == false) return;
                                                                    if (!this.i.c) {
                                                                        return;
                                                                    }
                                                                    this.m(var3_3, ((f)var75_24.l.get((int)0)).g + this.h.f, this.i.l.get(0).g - this.i.f, var42_16.g + var42_16.f, var43_17.g - var43_17.f, var65_23, var48_22);
                                                                    this.e.c(var3_3[0]);
                                                                    this.b.e.e.c(var3_3[1]);
                                                                    return;
                                                                }
                                                                var66_25 = this.h;
                                                                if (!var66_25.j) ** GOTO lbl-1000
                                                                var70_26 = this.i;
                                                                if (var70_26.j) {
                                                                    if (var42_16.c == false) return;
                                                                    if (!var43_17.c) {
                                                                        return;
                                                                    }
                                                                    var71_27 = var66_25.g + var66_25.f;
                                                                    var72_28 = var70_26.g - var70_26.f;
                                                                    var73_29 = ((f)var42_16.l.get((int)0)).g + var42_16.f;
                                                                    var74_30 = ((f)var43_17.l.get((int)0)).g - var43_17.f;
                                                                    var67_31 = var65_23;
                                                                    var68_32 = var48_22;
                                                                    this.m(var3_3, var71_27, var72_28, var73_29, var74_30, var65_23, var48_22);
                                                                    this.e.c(var3_3[0]);
                                                                    this.b.e.e.c(var3_3[1]);
                                                                } else lbl-1000: // 2 sources:
                                                                {
                                                                    var67_31 = var65_23;
                                                                    var68_32 = var48_22;
                                                                }
                                                                var69_33 = this.h;
                                                                if (var69_33.c == false) return;
                                                                if (this.i.c == false) return;
                                                                if (var42_16.c == false) return;
                                                                if (!var43_17.c) {
                                                                    return;
                                                                }
                                                                this.m(var3_3, ((f)var69_33.l.get((int)0)).g + this.h.f, this.i.l.get(0).g - this.i.f, ((f)var42_16.l.get((int)0)).g + var42_16.f, ((f)var43_17.l.get((int)0)).g - var43_17.f, var67_31, var68_32);
                                                                this.e.c(var3_3[0]);
                                                                var5_6 = this.b.e.e;
                                                                var39_11 = var3_3[1];
                                                                break block32;
                                                            }
                                                            if (!var44_18 || !var46_20) break block36;
                                                            var56_34 = this.h;
                                                            if (var56_34.c == false) return;
                                                            if (!this.i.c) {
                                                                return;
                                                            }
                                                            var57_35 = var32_7.N;
                                                            var58_36 = ((f)var56_34.l.get((int)0)).g + this.h.f;
                                                            var59_37 = this.i.l.get(0).g - this.i.f;
                                                            if (var48_22 == -1 || var48_22 == 0) break block37;
                                                            if (var48_22 != 1) break block27;
                                                            var60_38 = this.g(var59_37 - var58_36, 0);
                                                            var64_39 = (int)(0.5f + (float)var60_38 / var57_35);
                                                            if (var64_39 == (var62_40 = this.g(var64_39, 1))) break block38;
                                                            var63_41 = var57_35 * (float)var62_40;
                                                            break block39;
                                                        }
                                                        var60_38 = this.g(var59_37 - var58_36, 0);
                                                        var61_42 = (int)(0.5f + var57_35 * (float)var60_38);
                                                        if (var61_42 == (var62_40 = this.g(var61_42, 1))) break block38;
                                                        var63_41 = (float)var62_40 / var57_35;
                                                    }
                                                    var60_38 = (int)(var63_41 + 0.5f);
                                                }
                                                this.e.c(var60_38);
                                                this.b.e.e.c(var62_40);
                                                break block27;
                                            }
                                            if (!var45_19 || !var47_21) break block27;
                                            if (var42_16.c == false) return;
                                            if (!var43_17.c) {
                                                return;
                                            }
                                            var49_43 = var32_7.N;
                                            var50_44 = ((f)var42_16.l.get((int)0)).g + var42_16.f;
                                            var51_45 = ((f)var43_17.l.get((int)0)).g - var43_17.f;
                                            if (var48_22 == -1) break block40;
                                            if (var48_22 == 0) break block41;
                                            if (var48_22 == 1) break block40;
                                            break block27;
                                        }
                                        var39_11 = this.g(var51_45 - var50_44, 1);
                                        var55_46 = (int)(0.5f + var49_43 * (float)var39_11);
                                        if (var55_46 == (var53_47 = this.g(var55_46, 0))) break block42;
                                        var54_48 = (float)var53_47 / var49_43;
                                        break block43;
                                    }
                                    if ((var52_49 = (int)(0.5f + (float)(var39_11 = this.g(var51_45 - var50_44, 1)) / var49_43)) == (var53_47 = this.g(var52_49, 0))) break block42;
                                    var54_48 = var49_43 * (float)var53_47;
                                }
                                var39_11 = (int)(var54_48 + 0.5f);
                            }
                            this.e.c(var53_47);
                            var5_6 = this.b.e.e;
                            break block32;
                        }
                        var34_50 = var32_7.K;
                        if (var34_50 == null) break block27;
                        var35_51 = var34_50.d.e;
                        if (!var35_51.j) break block27;
                        var36_14 = var32_7.o;
                        var37_13 = var35_51.g;
                    }
                    var38_12 = var37_13 * var36_14;
                }
                var39_11 = (int)(var38_12 + 0.5f);
            }
            var5_6.c(var39_11);
        }
        var6_52 = this.h;
        if (var6_52.c == false) return;
        var7_53 = this.i;
        if (!var7_53.c) {
            return;
        }
        if (var6_52.j && var7_53.j && this.e.j) {
            return;
        }
        if (!this.e.j && this.d == var2_2) {
            var24_54 = this.b;
            if (var24_54.j == 0 && !var24_54.s()) {
                var25_55 = (f)this.h.l.get(0);
                var26_56 = (f)this.i.l.get(0);
                var27_57 = var25_55.g;
                var28_58 = this.h;
                var29_59 = var27_57 + var28_58.f;
                var30_60 = var26_56.g + this.i.f;
                var31_61 = var30_60 - var29_59;
                var28_58.c(var29_59);
                this.i.c(var30_60);
                this.e.c(var31_61);
                return;
            }
        }
        if (!this.e.j && this.d == var2_2 && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            var17_62 = (f)this.h.l.get(0);
            var18_63 = (f)this.i.l.get(0);
            var19_64 = var17_62.g + this.h.f;
            var20_65 = Math.min((int)(var18_63.g + this.i.f - var19_64), this.e.m);
            var21_66 = this.b;
            var22_67 = var21_66.n;
            var23_68 = Math.max((int)var21_66.m, (int)var20_65);
            if (var22_67 > 0) {
                var23_68 = Math.min((int)var22_67, (int)var23_68);
            }
            this.e.c(var23_68);
        }
        if (!this.e.j) {
            return;
        }
        var8_69 = (f)this.h.l.get(0);
        var9_70 = (f)this.i.l.get(0);
        var10_71 = var8_69.g;
        var11_72 = this.h;
        var12_73 = var10_71 + var11_72.f;
        var13_74 = var9_70.g;
        var14_75 = var13_74 + this.i.f;
        var15_76 = this.b.U;
        if (var8_69 == var9_70) {
            var15_76 = 0.5f;
        } else {
            var10_71 = var12_73;
            var13_74 = var14_75;
        }
        var16_77 = var13_74 - var10_71 - this.e.g;
        var11_72.c((int)(0.5f + var10_71 + var15_76 * (float)var16_77));
        this.i.c(this.h.g + this.e.g);
    }

    @Override
    public void d() {
        block35 : {
            block50 : {
                c.f.b.i.d d2;
                c.f.b.i.d d3;
                block51 : {
                    c[] arrc;
                    block49 : {
                        block47 : {
                            block48 : {
                                c c2;
                                block33 : {
                                    f f2;
                                    block39 : {
                                        f f3;
                                        List<d> list;
                                        block45 : {
                                            c.f.b.i.l.g g2;
                                            c.f.b.i.d d4;
                                            block40 : {
                                                block43 : {
                                                    f f4;
                                                    block46 : {
                                                        block41 : {
                                                            block44 : {
                                                                block42 : {
                                                                    d.a a2;
                                                                    block30 : {
                                                                        f f5;
                                                                        int n2;
                                                                        f f6;
                                                                        block38 : {
                                                                            block36 : {
                                                                                c.f.b.i.d d5;
                                                                                block37 : {
                                                                                    c[] arrc2;
                                                                                    block34 : {
                                                                                        block31 : {
                                                                                            f f7;
                                                                                            block32 : {
                                                                                                c.f.b.i.d d6;
                                                                                                a2 = d.a.g;
                                                                                                d.a a3 = d.a.h;
                                                                                                d.a a4 = d.a.e;
                                                                                                c.f.b.i.d d7 = this.b;
                                                                                                if (d7.a) {
                                                                                                    this.e.c(d7.o());
                                                                                                }
                                                                                                if (!this.e.j) {
                                                                                                    d.a a5;
                                                                                                    this.d = a5 = this.b.j();
                                                                                                    if (a5 != a2) {
                                                                                                        c.f.b.i.d d8;
                                                                                                        if (a5 == a3 && ((d8 = this.b.K) != null && d8.j() == a4 || d8.j() == a3)) {
                                                                                                            int n3 = d8.o() - this.b.y.b() - this.b.A.b();
                                                                                                            this.b(this.h, d8.d.h, this.b.y.b());
                                                                                                            this.b(this.i, d8.d.i, -this.b.A.b());
                                                                                                            this.e.c(n3);
                                                                                                            return;
                                                                                                        }
                                                                                                        if (this.d == a4) {
                                                                                                            this.e.c(this.b.o());
                                                                                                        }
                                                                                                    }
                                                                                                } else if (this.d == a3 && ((d6 = this.b.K) != null && d6.j() == a4 || d6.j() == a3)) {
                                                                                                    this.b(this.h, d6.d.h, this.b.y.b());
                                                                                                    this.b(this.i, d6.d.i, -this.b.A.b());
                                                                                                    return;
                                                                                                }
                                                                                                g2 = this.e;
                                                                                                if (!g2.j) break block30;
                                                                                                d5 = this.b;
                                                                                                if (!d5.a) break block30;
                                                                                                arrc2 = d5.G;
                                                                                                if (arrc2[0].d == null || arrc2[1].d == null) break block31;
                                                                                                if (!d5.s()) break block32;
                                                                                                this.h.f = this.b.G[0].b();
                                                                                                f2 = this.i;
                                                                                                c2 = this.b.G[1];
                                                                                                break block33;
                                                                                            }
                                                                                            f f8 = this.h(this.b.G[0]);
                                                                                            if (f8 != null) {
                                                                                                f f9 = this.h;
                                                                                                int n4 = this.b.G[0].b();
                                                                                                f9.l.add(f8);
                                                                                                f9.f = n4;
                                                                                                f8.k.add((Object)f9);
                                                                                            }
                                                                                            if ((f7 = this.h(this.b.G[1])) != null) {
                                                                                                f f10 = this.i;
                                                                                                int n5 = -this.b.G[1].b();
                                                                                                f10.l.add(f7);
                                                                                                f10.f = n5;
                                                                                                f7.k.add((Object)f10);
                                                                                            }
                                                                                            this.h.b = true;
                                                                                            this.i.b = true;
                                                                                            return;
                                                                                        }
                                                                                        if (arrc2[0].d == null) break block34;
                                                                                        f f11 = this.h(arrc2[0]);
                                                                                        if (f11 == null) break block35;
                                                                                        f f12 = this.h;
                                                                                        int n6 = this.b.G[0].b();
                                                                                        f12.l.add(f11);
                                                                                        f12.f = n6;
                                                                                        f11.k.add((Object)f12);
                                                                                        break block36;
                                                                                    }
                                                                                    if (arrc2[1].d == null) break block37;
                                                                                    f f13 = this.h(arrc2[1]);
                                                                                    if (f13 == null) break block35;
                                                                                    f f14 = this.i;
                                                                                    int n7 = -this.b.G[1].b();
                                                                                    f14.l.add(f13);
                                                                                    f14.f = n7;
                                                                                    f13.k.add((Object)f14);
                                                                                    f6 = this.h;
                                                                                    f5 = this.i;
                                                                                    n2 = -this.e.g;
                                                                                    break block38;
                                                                                }
                                                                                if (d5 instanceof g || d5.K == null || d5.f((c.a)c.a.k).d != null) break block35;
                                                                                c.f.b.i.d d9 = this.b;
                                                                                f f15 = d9.K.d.h;
                                                                                this.b(this.h, f15, d9.p());
                                                                            }
                                                                            f6 = this.i;
                                                                            f5 = this.h;
                                                                            n2 = this.e.g;
                                                                        }
                                                                        this.b(f6, f5, n2);
                                                                        return;
                                                                    }
                                                                    if (this.d != a2) break block39;
                                                                    d4 = this.b;
                                                                    int n8 = d4.j;
                                                                    if (n8 == 2) break block40;
                                                                    if (n8 != 3) break block39;
                                                                    if (d4.k != 3) break block41;
                                                                    this.h.a = this;
                                                                    this.i.a = this;
                                                                    l l2 = d4.e;
                                                                    l2.h.a = this;
                                                                    l2.i.a = this;
                                                                    g2.a = this;
                                                                    if (!d4.t()) break block42;
                                                                    this.e.l.add((Object)this.b.e.e);
                                                                    this.b.e.e.k.add((Object)this.e);
                                                                    l l3 = this.b.e;
                                                                    l3.e.a = this;
                                                                    this.e.l.add(l3.h);
                                                                    this.e.l.add((Object)this.b.e.i);
                                                                    this.b.e.h.k.add((Object)this.e);
                                                                    list = this.b.e.i.k;
                                                                    break block43;
                                                                }
                                                                if (!this.b.s()) break block44;
                                                                this.b.e.e.l.add((Object)this.e);
                                                                list = this.e.k;
                                                                f3 = this.b.e.e;
                                                                break block45;
                                                            }
                                                            f4 = this.b.e.e;
                                                            break block46;
                                                        }
                                                        c.f.b.i.l.g g3 = d4.e.e;
                                                        g2.l.add(g3);
                                                        g3.k.add((Object)this.e);
                                                        this.b.e.h.k.add((Object)this.e);
                                                        this.b.e.i.k.add((Object)this.e);
                                                        c.f.b.i.l.g g4 = this.e;
                                                        g4.b = true;
                                                        g4.k.add((Object)this.h);
                                                        this.e.k.add((Object)this.i);
                                                        this.h.l.add(this.e);
                                                        f4 = this.i;
                                                    }
                                                    list = f4.l;
                                                }
                                                f3 = this.e;
                                                break block45;
                                            }
                                            c.f.b.i.d d10 = d4.K;
                                            if (d10 == null) break block39;
                                            c.f.b.i.l.g g5 = d10.e.e;
                                            g2.l.add(g5);
                                            g5.k.add((Object)this.e);
                                            c.f.b.i.l.g g6 = this.e;
                                            g6.b = true;
                                            g6.k.add((Object)this.h);
                                            list = this.e.k;
                                            f3 = this.i;
                                        }
                                        list.add((Object)f3);
                                    }
                                    d2 = this.b;
                                    arrc = d2.G;
                                    if (arrc[0].d == null || arrc[1].d == null) break block47;
                                    if (!d2.s()) break block48;
                                    this.h.f = this.b.G[0].b();
                                    f2 = this.i;
                                    c2 = this.b.G[1];
                                }
                                f2.f = -c2.b();
                                return;
                            }
                            f f16 = this.h(this.b.G[0]);
                            f f17 = this.h(this.b.G[1]);
                            f16.k.add((Object)this);
                            if (f16.j) {
                                this.a(this);
                            }
                            f17.k.add((Object)this);
                            if (f17.j) {
                                this.a(this);
                            }
                            this.j = m.a.h;
                            return;
                        }
                        if (arrc[0].d == null) break block49;
                        f f18 = this.h(arrc[0]);
                        if (f18 == null) break block35;
                        f f19 = this.h;
                        int n9 = this.b.G[0].b();
                        f19.l.add(f18);
                        f19.f = n9;
                        f18.k.add((Object)f19);
                        break block50;
                    }
                    if (arrc[1].d == null) break block51;
                    f f20 = this.h(arrc[1]);
                    if (f20 != null) {
                        f f21 = this.i;
                        int n10 = -this.b.G[1].b();
                        f21.l.add(f20);
                        f21.f = n10;
                        f20.k.add((Object)f21);
                        this.c(this.h, this.i, -1, this.e);
                        return;
                    }
                    break block35;
                }
                if (d2 instanceof g || (d3 = d2.K) == null) break block35;
                f f22 = d3.d.h;
                this.b(this.h, f22, d2.p());
            }
            this.c(this.i, this.h, 1, this.e);
        }
    }

    @Override
    public void e() {
        f f2 = this.h;
        if (f2.j) {
            this.b.P = f2.g;
        }
    }

    @Override
    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.e.b();
        this.g = false;
    }

    @Override
    public boolean k() {
        if (this.d == d.a.g) {
            return this.b.j == 0;
        }
        return true;
    }

    public final void m(int[] arrn, int n2, int n3, int n4, int n5, float f2, int n6) {
        int n7 = n3 - n2;
        int n8 = n5 - n4;
        if (n6 != -1) {
            if (n6 != 0) {
                if (n6 != 1) {
                    return;
                }
                int n9 = (int)(0.5f + f2 * (float)n7);
                arrn[0] = n7;
                arrn[1] = n9;
                return;
            }
            arrn[0] = (int)(0.5f + f2 * (float)n8);
            arrn[1] = n8;
            return;
        }
        int n10 = (int)(0.5f + f2 * (float)n8);
        int n11 = (int)(0.5f + (float)n7 / f2);
        if (n10 <= n7 && n8 <= n8) {
            arrn[0] = n10;
            arrn[1] = n8;
            return;
        }
        if (n7 <= n7 && n11 <= n8) {
            arrn[0] = n7;
            arrn[1] = n11;
        }
    }

    public void n() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"HorizontalRun ");
        stringBuilder.append(this.b.Y);
        return stringBuilder.toString();
    }
}

