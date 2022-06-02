/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.f.b.i.c
 *  c.f.b.i.d
 *  c.f.b.i.d$a
 *  c.f.b.i.l.d
 *  c.f.b.i.l.k
 *  d.a.b.a.a
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package c.f.b.i.l;

import c.f.b.i.d;
import c.f.b.i.e;
import c.f.b.i.l.d;
import c.f.b.i.l.f;
import c.f.b.i.l.g;
import c.f.b.i.l.j;
import c.f.b.i.l.k;
import c.f.b.i.l.l;
import c.f.b.i.l.m;
import d.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
extends m {
    public ArrayList<m> k;
    public int l;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public c(c.f.b.i.d var1_1, int var2_2) {
        block10 : {
            block9 : {
                super(var1_1);
                this.k = new ArrayList();
                this.f = var2_2;
                var3_3 = this.b;
                while ((var4_4 = var3_3.l(this.f)) != null) {
                    var3_3 = var4_4;
                }
                this.b = var3_3;
                var5_5 = this.k;
                var6_6 = this.f;
                if (var6_6 != 0) break block9;
                var7_7 = this;
                ** GOTO lbl29
            }
            if (var6_6 != 1) break block10;
            var7_7 = this;
            ** GOTO lbl33
        }
        var7_7 = this;
        block1 : do {
            var8_9 /* !! */  = null;
            do {
                block11 : {
                    var5_5.add((Object)var8_9 /* !! */ );
                    var3_3 = var3_3.k(var7_7.f);
                    if (var3_3 == null) break block1;
                    var5_5 = var7_7.k;
                    var16_8 = var7_7.f;
                    if (var16_8 != 0) break block11;
lbl29: // 2 sources:
                    var8_9 /* !! */  = var3_3.d;
                    continue;
                }
                if (var16_8 != 1) continue block1;
lbl33: // 2 sources:
                var8_9 /* !! */  = var3_3.e;
            } while (true);
            break;
        } while (true);
        for (m var14_11 : var7_7.k) {
            var15_12 = var7_7.f;
            if (var15_12 == 0) {
                var14_11.b.b = var7_7;
                continue;
            }
            if (var15_12 != 1) continue;
            var14_11.b.c = var7_7;
        }
        var11_13 = var7_7.f == 0 && ((e)var7_7.b.K).i0 != false;
        if (var11_13 && var7_7.k.size() > 1) {
            var13_14 = var7_7.k;
            var7_7.b = ((m)var13_14.get((int)(var13_14.size() - 1))).b;
        }
        var12_15 = var7_7.f == 0 ? var7_7.b.Z : var7_7.b.a0;
        var7_7.l = var12_15;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(d var1_1) {
        block71 : {
            block70 : {
                block68 : {
                    block69 : {
                        block67 : {
                            block66 : {
                                block65 : {
                                    block61 : {
                                        block60 : {
                                            var2_2 = d.a.g;
                                            var3_3 = this.h;
                                            if (var3_3.j == false) return;
                                            var4_4 = this.i;
                                            if (!var4_4.j) {
                                                return;
                                            }
                                            var5_5 = this.b.K;
                                            var6_6 = var5_5 != null && var5_5 instanceof e != false && ((e) var5_5).i0;
                                            var7_7 = var4_4.g - var3_3.g;
                                            var8_8 = this.k.size();
                                            var9_9 = 0;
                                            do {
                                                var10_10 = -1;
                                                var11_11 = 8;
                                                if (var9_9 >= var8_8) break;
                                                if (this.k.get((int)var9_9).b.X == var11_11) {
                                                    ++var9_9;
                                                    continue;
                                                }
                                                break block60;
                                                break;
                                            } while (true);
                                            var9_9 = -1;
                                        }
                                        for (var13_13 = var12_12 = var8_8 - 1; var13_13 >= 0; --var13_13) {
                                            if (this.k.get((int)var13_13).b.X == var11_11) {
                                                continue;
                                            }
                                            var10_10 = var13_13;
                                            break;
                                        }
                                        var14_14 = 0;
                                        do {
                                            if (var14_14 >= 2) {
                                                var15_30 = 0;
                                                var16_31 = 0;
                                                var17_15 = 0;
                                                var18_16 = 0.0f;
                                                break block61;
                                            }
                                            var17_15 = 0;
                                            var96_18 = 0;
                                            var97_19 = 0;
                                            var18_16 = 0.0f;
                                            for (var95_17 = 0; var95_17 < var8_8; ++var95_17) {
                                                block62 : {
                                                    block64 : {
                                                        block63 : {
                                                            var98_20 = (m)this.k.get(var95_17);
                                                            var99_21 = var98_20.b;
                                                            if (var99_21.X == var11_11) break block62;
                                                            ++var97_19;
                                                            if (var95_17 > 0 && var95_17 >= var9_9) {
                                                                var17_15 += var98_20.h.f;
                                                            }
                                                            var100_22 = var98_20.e;
                                                            var101_23 = var100_22.g;
                                                            var102_24 = var98_20.d != var2_2;
                                                            if (!var102_24) break block63;
                                                            var107_29 = this.f;
                                                            var103_25 = var101_23;
                                                            if (var107_29 == 0 && !var99_21.d.e.j) {
                                                                return;
                                                            }
                                                            if (var107_29 == 1 && !var99_21.e.e.j) {
                                                                return;
                                                            }
                                                            var104_26 = var102_24;
                                                            ** GOTO lbl-1000
                                                        }
                                                        var103_25 = var101_23;
                                                        var104_26 = var102_24;
                                                        if (var98_20.a != 1 || var14_14 != 0) break block64;
                                                        var105_27 = var100_22.m;
                                                        ++var96_18;
                                                        ** GOTO lbl68
                                                    }
                                                    if (var100_22.j) {
                                                        var105_27 = var103_25;
lbl68: // 2 sources:
                                                        var104_26 = true;
                                                    } else lbl-1000: // 2 sources:
                                                    {
                                                        var105_27 = var103_25;
                                                    }
                                                    if (!var104_26) {
                                                        ++var96_18;
                                                        var106_28 = var99_21.b0[this.f];
                                                        if (var106_28 >= 0.0f) {
                                                            var18_16 += var106_28;
                                                        }
                                                    } else {
                                                        var17_15 += var105_27;
                                                    }
                                                    if (var95_17 < var12_12 && var95_17 < var10_10) {
                                                        var17_15 += -var98_20.i.f;
                                                    }
                                                }
                                                var11_11 = 8;
                                            }
                                            if (var17_15 < var7_7 || var96_18 == 0) break;
                                            ++var14_14;
                                            var11_11 = 8;
                                        } while (true);
                                        var15_30 = var96_18;
                                        var16_31 = var97_19;
                                    }
                                    var19_32 = this.h.g;
                                    if (var6_6) {
                                        var19_32 = this.i.g;
                                    }
                                    if (var17_15 > var7_7) {
                                        var94_33 = (int)(0.5f + (float)(var17_15 - var7_7) / 2.0f);
                                        var19_32 = var6_6 ? (var19_32 += var94_33) : (var19_32 -= var94_33);
                                    }
                                    if (var15_30 > 0) break block65;
                                    var20_59 = var2_2;
                                    var21_60 = var6_6;
                                    var22_61 = var19_32;
                                    var24_67 = 2;
                                    break block66;
                                }
                                var64_34 = var7_7 - var17_15;
                                var65_35 = (int)(0.5f + var64_34 / (float)var15_30);
                                var67_37 = 0;
                                for (var66_36 = 0; var66_36 < var8_8; ++var66_36) {
                                    var73_38 = (m)this.k.get(var66_36);
                                    var74_39 = var65_35;
                                    var75_40 = var73_38.b;
                                    var76_41 = var17_15;
                                    var77_42 = var75_40.X;
                                    var78_43 = var19_32;
                                    if (var77_42 == 8 || var73_38.d != var2_2) ** GOTO lbl-1000
                                    var82_47 = var73_38.e;
                                    if (!var82_47.j) {
                                        if (var18_16 > 0.0f) {
                                            var93_58 = var75_40.b0;
                                            var79_44 = var2_2;
                                            var83_48 = (int)(0.5f + var64_34 * var93_58[this.f] / var18_16);
                                        } else {
                                            var79_44 = var2_2;
                                            var83_48 = var74_39;
                                        }
                                        if (this.f == 0) {
                                            var88_53 = var75_40.n;
                                            var89_54 = var75_40.m;
                                            var81_46 = var64_34;
                                            var90_55 = var73_38.a;
                                            var80_45 = var6_6;
                                            var91_56 = var90_55 == 1 ? Math.min((int)var83_48, (int)var82_47.m) : var83_48;
                                            var92_57 = Math.max((int)var89_54, (int)var91_56);
                                            if (var88_53 > 0) {
                                                var92_57 = Math.min((int)var88_53, (int)var92_57);
                                            }
                                            if (var92_57 != var83_48) {
                                                ++var67_37;
                                                var83_48 = var92_57;
                                            }
                                        } else {
                                            var80_45 = var6_6;
                                            var81_46 = var64_34;
                                            var84_49 = var75_40.q;
                                            var85_50 = var75_40.p;
                                            var86_51 = var73_38.a == 1 ? Math.min((int)var83_48, (int)var82_47.m) : var83_48;
                                            var87_52 = Math.max((int)var85_50, (int)var86_51);
                                            if (var84_49 > 0) {
                                                var87_52 = Math.min((int)var84_49, (int)var87_52);
                                            }
                                            if (var87_52 != var83_48) {
                                                ++var67_37;
                                                var83_48 = var87_52;
                                            }
                                        }
                                        var73_38.e.c(var83_48);
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var79_44 = var2_2;
                                        var80_45 = var6_6;
                                        var81_46 = var64_34;
                                    }
                                    var65_35 = var74_39;
                                    var17_15 = var76_41;
                                    var19_32 = var78_43;
                                    var2_2 = var79_44;
                                    var64_34 = var81_46;
                                    var6_6 = var80_45;
                                }
                                var20_59 = var2_2;
                                var21_60 = var6_6;
                                var22_61 = var19_32;
                                var68_62 = var17_15;
                                if (var67_37 <= 0) {
                                    var17_15 = var68_62;
                                } else {
                                    var15_30 -= var67_37;
                                    var71_64 = 0;
                                    for (var70_63 = 0; var70_63 < var8_8; ++var70_63) {
                                        var72_65 = (m)this.k.get(var70_63);
                                        if (var72_65.b.X == 8) continue;
                                        if (var70_63 > 0 && var70_63 >= var9_9) {
                                            var71_64 += var72_65.h.f;
                                        }
                                        var71_64 += var72_65.e.g;
                                        if (var70_63 >= var12_12 || var70_63 >= var10_10) continue;
                                        var71_64 += -var72_65.i.f;
                                    }
                                    var17_15 = var71_64;
                                }
                                var69_66 = this.l;
                                var24_67 = 2;
                                if (var69_66 == var24_67 && var67_37 == 0) {
                                    this.l = 0;
                                }
                            }
                            if (var17_15 > var7_7) {
                                this.l = var24_67;
                            }
                            if (var16_31 > 0 && var15_30 == 0 && var9_9 == var10_10) {
                                this.l = var24_67;
                            }
                            if ((var25_68 = this.l) != 1) break block67;
                            var51_69 = var16_31 > 1 ? (var7_7 - var17_15) / (var16_31 - 1) : (var16_31 == 1 ? (var7_7 - var17_15) / 2 : 0);
                            if (var15_30 > 0) {
                                var51_69 = 0;
                            }
                            break block68;
                        }
                        var26_82 = var20_59;
                        if (var25_68 != 0) break block69;
                        var39_83 = (var7_7 - var17_15) / (var16_31 + 1);
                        if (var15_30 > 0) {
                            var39_83 = 0;
                        }
                        break block70;
                    }
                    if (var25_68 != 2) return;
                    var27_95 = this.f == 0 ? this.b.U : this.b.V;
                    if (var21_60) {
                        var27_95 = 1.0f - var27_95;
                    }
                    if ((var28_96 = (int)(0.5f + var27_95 * (float)(var7_7 - var17_15))) < 0 || var15_30 > 0) {
                        var28_96 = 0;
                    }
                    break block71;
                }
                var52_70 = var22_61;
                var53_71 = 0;
                while (var53_71 < var8_8) {
                    var54_72 = var21_60 != false ? var8_8 - (var53_71 + 1) : var53_71;
                    var55_73 = (m)this.k.get(var54_72);
                    if (var55_73.b.X == 8) {
                        var55_73.h.c(var52_70);
                        var55_73.i.c(var52_70);
                        var60_78 = var20_59;
                    } else {
                        if (var53_71 > 0) {
                            var52_70 = var21_60 ? (var52_70 -= var51_69) : (var52_70 += var51_69);
                        }
                        if (var53_71 > 0 && var53_71 >= var9_9) {
                            var63_81 = var55_73.h.f;
                            var52_70 = var21_60 ? (var52_70 -= var63_81) : (var52_70 += var63_81);
                        }
                        var56_74 = var21_60 != false ? var55_73.i : var55_73.h;
                        var56_74.c(var52_70);
                        var57_75 = var55_73.e;
                        var58_76 = var57_75.g;
                        var59_77 = var55_73.d;
                        var60_78 = var20_59;
                        if (var59_77 == var60_78 && var55_73.a == 1) {
                            var58_76 = var57_75.m;
                        }
                        var52_70 = var21_60 ? (var52_70 -= var58_76) : (var52_70 += var58_76);
                        var61_79 = var21_60 != false ? var55_73.h : var55_73.i;
                        var61_79.c(var52_70);
                        var55_73.g = true;
                        if (var53_71 < var12_12 && var53_71 < var10_10) {
                            var62_80 = -var55_73.i.f;
                            var52_70 = var21_60 ? (var52_70 -= var62_80) : (var52_70 += var62_80);
                        }
                    }
                    ++var53_71;
                    var20_59 = var60_78;
                }
                return;
            }
            var40_84 = var22_61;
            var41_85 = 0;
            while (var41_85 < var8_8) {
                var42_86 = var21_60 != false ? var8_8 - (var41_85 + 1) : var41_85;
                var43_87 = (m)this.k.get(var42_86);
                if (var43_87.b.X == 8) {
                    var43_87.h.c(var40_84);
                    var43_87.i.c(var40_84);
                } else {
                    var44_88 = var21_60 != false ? var40_84 - var39_83 : var40_84 + var39_83;
                    if (var41_85 > 0 && var41_85 >= var9_9) {
                        var50_94 = var43_87.h.f;
                        var44_88 = var21_60 ? (var44_88 -= var50_94) : (var44_88 += var50_94);
                    }
                    var45_89 = var21_60 != false ? var43_87.i : var43_87.h;
                    var45_89.c(var44_88);
                    var46_90 = var43_87.e;
                    var47_91 = var46_90.g;
                    if (var43_87.d == var26_82 && var43_87.a == 1) {
                        var47_91 = Math.min((int)var47_91, (int)var46_90.m);
                    }
                    var40_84 = var21_60 != false ? var44_88 - var47_91 : var44_88 + var47_91;
                    var48_92 = var21_60 != false ? var43_87.h : var43_87.i;
                    var48_92.c(var40_84);
                    if (var41_85 < var12_12 && var41_85 < var10_10) {
                        var49_93 = -var43_87.i.f;
                        var40_84 = var21_60 ? (var40_84 -= var49_93) : (var40_84 += var49_93);
                    }
                }
                ++var41_85;
            }
            return;
        }
        var29_97 = var21_60 != false ? var22_61 - var28_96 : var22_61 + var28_96;
        var30_98 = 0;
        while (var30_98 < var8_8) {
            var31_99 = var21_60 != false ? var8_8 - (var30_98 + 1) : var30_98;
            var32_100 = (m)this.k.get(var31_99);
            if (var32_100.b.X == 8) {
                var32_100.h.c(var29_97);
                var32_100.i.c(var29_97);
            } else {
                if (var30_98 > 0 && var30_98 >= var9_9) {
                    var38_106 = var32_100.h.f;
                    var29_97 = var21_60 ? (var29_97 -= var38_106) : (var29_97 += var38_106);
                }
                var33_101 = var21_60 != false ? var32_100.i : var32_100.h;
                var33_101.c(var29_97);
                var34_102 = var32_100.e;
                var35_103 = var34_102.g;
                if (var32_100.d == var26_82 && var32_100.a == 1) {
                    var35_103 = var34_102.m;
                }
                var29_97 = var21_60 ? (var29_97 -= var35_103) : (var29_97 += var35_103);
                var36_104 = var21_60 != false ? var32_100.h : var32_100.i;
                var36_104.c(var29_97);
                if (var30_98 < var12_12 && var30_98 < var10_10) {
                    var37_105 = -var32_100.i.f;
                    var29_97 = var21_60 ? (var29_97 -= var37_105) : (var29_97 += var37_105);
                }
            }
            ++var30_98;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void d() {
        block12 : {
            int n2;
            f f2;
            block13 : {
                c.f.b.i.d d2;
                c.f.b.i.d d3;
                block11 : {
                    Iterator iterator = this.k.iterator();
                    while (iterator.hasNext()) {
                        ((m)iterator.next()).d();
                    }
                    int n3 = this.k.size();
                    if (n3 < 1) {
                        return;
                    }
                    d2 = this.k.get(0).b;
                    d3 = this.k.get(n3 - 1).b;
                    if (this.f != 0) break block11;
                    c.f.b.i.c c2 = d2.y;
                    c.f.b.i.c c3 = d3.A;
                    f f3 = this.i(c2, 0);
                    int n4 = c2.b();
                    c.f.b.i.d d4 = this.m();
                    if (d4 != null) {
                        n4 = d4.y.b();
                    }
                    if (f3 != null) {
                        f f4 = this.h;
                        f4.l.add(f3);
                        f4.f = n4;
                        f3.k.add((Object)f4);
                    }
                    f2 = this.i(c3, 0);
                    n2 = c3.b();
                    c.f.b.i.d d5 = this.n();
                    if (d5 != null) {
                        n2 = d5.A.b();
                    }
                    if (f2 == null) break block12;
                    break block13;
                }
                c.f.b.i.c c4 = d2.z;
                c.f.b.i.c c5 = d3.B;
                f f5 = this.i(c4, 1);
                int n5 = c4.b();
                c.f.b.i.d d6 = this.m();
                if (d6 != null) {
                    n5 = d6.z.b();
                }
                if (f5 != null) {
                    f f6 = this.h;
                    f6.l.add(f5);
                    f6.f = n5;
                    f5.k.add((Object)f6);
                }
                f2 = this.i(c5, 1);
                n2 = c5.b();
                c.f.b.i.d d7 = this.n();
                if (d7 != null) {
                    n2 = d7.B.b();
                }
                if (f2 == null) break block12;
            }
            f f7 = this.i;
            int n6 = -n2;
            f7.l.add(f2);
            f7.f = n6;
            f2.k.add((Object)f7);
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override
    public void e() {
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            this.k.get(i2).e();
        }
    }

    @Override
    public void f() {
        this.c = null;
        Iterator iterator = this.k.iterator();
        while (iterator.hasNext()) {
            ((m)iterator.next()).f();
        }
    }

    @Override
    public long j() {
        int n2 = this.k.size();
        long l2 = 0L;
        for (int i2 = 0; i2 < n2; ++i2) {
            m m2 = this.k.get(i2);
            l2 = l2 + (long)m2.h.f + m2.j() + (long)m2.i.f;
        }
        return l2;
    }

    @Override
    public boolean k() {
        int n2 = this.k.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.k.get(i2).k()) continue;
            return false;
        }
        return true;
    }

    public final c.f.b.i.d m() {
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            c.f.b.i.d d2 = this.k.get(i2).b;
            if (d2.X == 8) continue;
            return d2;
        }
        return null;
    }

    public final c.f.b.i.d n() {
        for (int i2 = -1 + this.k.size(); i2 >= 0; --i2) {
            c.f.b.i.d d2 = this.k.get(i2).b;
            if (d2.X == 8) continue;
            return d2;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"ChainRun ");
        String string = this.f == 0 ? "horizontal : " : "vertical : ";
        stringBuilder.append(string);
        String string2 = stringBuilder.toString();
        for (m m2 : this.k) {
            String string3 = a.m((String)string2, (String)"<");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string3);
            stringBuilder2.append(m2);
            string2 = a.m((String)stringBuilder2.toString(), (String)"> ");
        }
        return string2;
    }
}

