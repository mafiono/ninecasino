/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.d.i;

import d.c.d.g;
import d.c.d.i.b.b;
import d.c.d.i.b.c;
import d.c.d.i.b.d;
import d.c.d.i.b.f;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;

public final class a
implements g {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d.c.d.j.b a(String var1_1, d.c.d.a var2_2, int var3_3, int var4_4, Map<d.c.d.c, ?> var5_5) {
        block63 : {
            block62 : {
                var6_6 = StandardCharsets.ISO_8859_1;
                var7_7 = 33;
                if (var5_5 == null) ** GOTO lbl-1000
                var123_8 = d.c.d.c.f;
                if (var5_5.containsKey((Object)var123_8)) {
                    var6_6 = Charset.forName(var5_5.get((Object)var123_8).toString());
                }
                if (var5_5.containsKey(var124_9 = d.c.d.c.e)) {
                    var7_7 = Integer.parseInt(var5_5.get((Object)var124_9).toString());
                }
                if (var5_5.containsKey(var125_10 = d.c.d.c.n)) {
                    var8_11 = Integer.parseInt(var5_5.get((Object)var125_10).toString());
                } else lbl-1000: // 2 sources:
                {
                    var8_11 = 0;
                }
                if (var2_2 != d.c.d.a.e) {
                    var9_117 = new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(var2_2)));
                    throw var9_117;
                }
                var10_12 = var1_1.getBytes(var6_6);
                var11_13 = b.a;
                var12_14 = new d(var10_12);
                var13_15 = Collections.singletonList((Object)f.e);
                var14_16 = 0;
                do {
                    block70 : {
                        block71 : {
                            block64 : {
                                block69 : {
                                    block68 : {
                                        block65 : {
                                            block66 : {
                                                block67 : {
                                                    var15_17 = var12_14.a;
                                                    var16_18 = var15_17.length;
                                                    var17_19 = 32;
                                                    var18_20 = 4;
                                                    var19_21 = 2;
                                                    var20_22 = 1;
                                                    if (var14_16 >= var16_18) break block64;
                                                    var100_23 = var14_16 + 1;
                                                    var101_24 = var100_23 < var15_17.length ? var15_17[var100_23] : 0;
                                                    var102_25 = var15_17[var14_16];
                                                    if (var102_25 == 13) break block65;
                                                    if (var102_25 == 44) break block66;
                                                    if (var102_25 == 46) break block67;
                                                    if (var102_25 != 58 || var101_24 != var17_19) ** GOTO lbl-1000
                                                    var103_26 = 5;
                                                    break block68;
                                                }
                                                if (var101_24 != var17_19) ** GOTO lbl-1000
                                                var103_26 = 3;
                                                break block68;
                                            }
                                            if (var101_24 != var17_19) ** GOTO lbl-1000
                                            var103_26 = 4;
                                            break block68;
                                        }
                                        if (var101_24 == 10) {
                                            var103_26 = 2;
                                        } else lbl-1000: // 4 sources:
                                        {
                                            var103_26 = 0;
                                        }
                                    }
                                    if (var103_26 <= 0) break block69;
                                    var104_27 = new LinkedList();
                                    for (f var106_29 : var13_15) {
                                        var107_30 = var106_29.b(var14_16);
                                        var104_27.add((Object)var107_30.d(var18_20, var103_26));
                                        if (var106_29.a != var18_20) {
                                            var104_27.add((Object)var107_30.e(var18_20, var103_26));
                                        }
                                        if (var103_26 == 3 || var103_26 == var18_20) {
                                            var104_27.add((Object)var107_30.d(var19_21, 16 - var103_26).d(var19_21, var20_22));
                                        }
                                        if (var106_29.c <= 0) continue;
                                        var104_27.add((Object)var106_29.a(var14_16).a(var100_23));
                                    }
                                    var13_15 = d.a((Iterable<f>)var104_27);
                                    var14_16 = var100_23;
                                    break block70;
                                }
                                var112_31 = new LinkedList();
                                var113_32 = var13_15.iterator();
                                break block71;
                            }
                            var21_39 = (f)Collections.min(var13_15, (Comparator)new c(var12_14));
                            var22_40 = var12_14.a;
                            Objects.requireNonNull(var21_39);
                            var24_41 = new LinkedList();
                            var25_42 = var21_39.b((int)var22_40.length).b;
                            while (var25_42 != null) {
                                var24_41.addFirst((Object)var25_42);
                                var25_42 = var25_42.a;
                            }
                            var26_43 = new d.c.d.j.a();
                            var27_44 = var24_41.iterator();
                            while (var27_44.hasNext()) {
                                ((d.c.d.i.b.g)var27_44.next()).a(var26_43, var22_40);
                            }
                            var28_45 = var26_43.f;
                            var29_46 = var7_7 * var28_45 / 100;
                            var30_47 = 11;
                            var31_48 = var29_46 + var30_47;
                            var32_49 = var28_45 + var31_48;
                            if (var8_11 == 0) break;
                            var44_50 = var8_11 < 0;
                            var45_51 = Math.abs((int)var8_11);
                            if (var44_50) {
                                var17_19 = 4;
                            }
                            if (var45_51 > var17_19) {
                                var96_58 = new Object[var20_22];
                                var96_58[0] = var8_11;
                                throw new IllegalArgumentException(String.format("Illegal value %s for layers", (Object[])var96_58));
                            }
                            var97_52 = var44_50 != false ? 88 : 112;
                            var39_53 = var45_51 * (var97_52 + (var45_51 << 4));
                            var40_54 = var11_13[var45_51];
                            var98_55 = var39_53 - var39_53 % var40_54;
                            var43_56 = b.c(var26_43, var40_54);
                            var99_57 = var43_56.f;
                            if (var31_48 + var99_57 > var98_55) throw new IllegalArgumentException("Data to large for user specified layer");
                            if (var44_50) {
                                if (var99_57 > var40_54 << 6) throw new IllegalArgumentException("Data to large for user specified layer");
                            }
                            ** GOTO lbl160
                        }
                        while (var113_32.hasNext()) {
                            var114_33 = (f)var113_32.next();
                            var115_34 = (char)(255 & var12_14.a[var14_16]);
                            var116_35 = d.d[var114_33.a][var115_34] > 0;
                            var118_37 = null;
                            for (var117_36 = 0; var117_36 <= var18_20; ++var117_36) {
                                var120_38 = d.d[var117_36][var115_34];
                                if (var120_38 > 0) {
                                    if (var118_37 == null) {
                                        var118_37 = var114_33.b(var14_16);
                                    }
                                    if (!var116_35 || var117_36 == var114_33.a || var117_36 == var19_21) {
                                        var112_31.add((Object)var118_37.d(var117_36, var120_38));
                                    }
                                    if (!var116_35 && d.e[var114_33.a][var117_36] >= 0) {
                                        var112_31.add((Object)var118_37.e(var117_36, var120_38));
                                    }
                                }
                                var18_20 = 4;
                                var19_21 = 2;
                            }
                            if (var114_33.c > 0 || d.d[var114_33.a][var115_34] == 0) {
                                var112_31.add((Object)var114_33.a(var14_16));
                            }
                            var18_20 = 4;
                            var19_21 = 2;
                        }
                        var13_15 = d.a((Iterable<f>)var112_31);
                    }
                    var14_16 += var20_22;
                } while (true);
                var33_59 = null;
                var34_60 = 0;
                var35_61 = 0;
                while (var34_60 <= var17_19) {
                    block72 : {
                        var36_62 = var34_60 <= 3;
                        var37_63 = var36_62 != false ? var34_60 + 1 : var34_60;
                        var38_64 = var36_62 != false ? 88 : 112;
                        var39_53 = var37_63 * (var38_64 + (var37_63 << 4));
                        if (var32_49 > var39_53) break block72;
                        if (var33_59 != null && var35_61 == var11_13[var37_63]) {
                            var41_65 = var33_59;
                            var40_54 = var35_61;
                        } else {
                            var40_54 = var11_13[var37_63];
                            var41_65 = b.c(var26_43, var40_54);
                        }
                        var42_66 = var39_53 - var39_53 % var40_54;
                        if (var36_62 && var41_65.f > var40_54 << 6 || var31_48 + var41_65.f > var42_66) {
                            var35_61 = var40_54;
                            var33_59 = var41_65;
                        } else {
                            var43_56 = var41_65;
                            var44_50 = var36_62;
                            var45_51 = var37_63;
lbl160: // 2 sources:
                            var46_67 = b.b(var43_56, var39_53, var40_54);
                            var47_68 = var43_56.f / var40_54;
                            var48_69 = new d.c.d.j.a();
                            var49_70 = var45_51 - 1;
                            if (var44_50) {
                                var48_69.d(var49_70, 2);
                                var48_69.d(var47_68 - 1, 6);
                                var50_71 = 28;
                            } else {
                                var48_69.d(var49_70, 5);
                                var48_69.d(var47_68 - 1, var30_47);
                                var50_71 = 40;
                            }
                            var51_72 = b.b(var48_69, var50_71, 4);
                            if (!var44_50) {
                                var30_47 = 14;
                            }
                            var52_73 = var30_47 + (var45_51 << 2);
                            var53_74 = new int[var52_73];
                            if (var44_50) {
                                var95_75 = 0;
                                while (var95_75 < var52_73) {
                                    var53_74[var95_75] = var95_75++;
                                }
                                var56_76 = var52_73;
                            } else {
                                var54_77 = var52_73 + 1;
                                var55_78 = var52_73 / 2;
                                var56_76 = var54_77 + 2 * ((var55_78 - 1) / 15);
                                var57_79 = var56_76 / 2;
                                for (var58_80 = 0; var58_80 < var55_78; ++var58_80) {
                                    var94_81 = var58_80 + var58_80 / 15;
                                    var53_74[var55_78 - var58_80 - var20_22] = -1 + (var57_79 - var94_81);
                                    var53_74[var55_78 + var58_80] = var20_22 + (var94_81 + var57_79);
                                }
                            }
                            break block62;
                        }
                    }
                    ++var34_60;
                    var20_22 = 1;
                    var17_19 = 32;
                }
                throw new IllegalArgumentException("Data too large for an Aztec code");
            }
            var59_82 = new d.c.d.j.b(var56_76, var56_76);
            var60_83 = 0;
            var61_84 = 0;
            do {
                if (var60_83 < var45_51) {
                    var82_85 = var45_51 - var60_83 << 2;
                    var83_86 = var44_50 != false ? 9 : 12;
                    var84_87 = var82_85 + var83_86;
                } else {
                    var62_97 = var56_76 / 2;
                    if (var44_50) {
                        for (var63_98 = 0; var63_98 < 7; ++var63_98) {
                            var81_99 = var63_98 + (var62_97 - 3);
                            if (var51_72.f(var63_98)) {
                                var59_82.c(var81_99, var62_97 - 5);
                            }
                            if (var51_72.f(var63_98 + 7)) {
                                var59_82.c(var62_97 + 5, var81_99);
                            }
                            if (var51_72.f(20 - var63_98)) {
                                var59_82.c(var81_99, var62_97 + 5);
                            }
                            if (!var51_72.f(27 - var63_98)) continue;
                            var59_82.c(var62_97 - 5, var81_99);
                        }
                    } else {
                        while (var63_98 < 10) {
                            var80_100 = var63_98 + (var62_97 - 5) + var63_98 / 5;
                            if (var51_72.f(var63_98)) {
                                var59_82.c(var80_100, var62_97 - 7);
                            }
                            if (var51_72.f(var63_98 + 10)) {
                                var59_82.c(var62_97 + 7, var80_100);
                            }
                            if (var51_72.f(29 - var63_98)) {
                                var59_82.c(var80_100, var62_97 + 7);
                            }
                            if (var51_72.f(39 - var63_98)) {
                                var59_82.c(var62_97 - 7, var80_100);
                            }
                            ++var63_98;
                        }
                    }
                    if (var44_50) {
                        b.a(var59_82, var62_97, 5);
                        break block63;
                    }
                    b.a(var59_82, var62_97, 7);
                    var65_102 = 0;
                    break;
                }
                for (var85_88 = 0; var85_88 < var84_87; ++var85_88) {
                    var86_89 = var85_88 << 1;
                    var87_90 = 2;
                    for (var88_91 = 0; var88_91 < var87_90; ++var88_91) {
                        if (var46_67.f(var88_91 + (var61_84 + var86_89))) {
                            var93_96 = var60_83 << 1;
                            var59_82.c(var53_74[var93_96 + var88_91], var53_74[var93_96 + var85_88]);
                        }
                        if (var46_67.f(var88_91 + (var86_89 + (var61_84 + (var84_87 << 1))))) {
                            var92_95 = var60_83 << 1;
                            var59_82.c(var53_74[var92_95 + var85_88], var53_74[var52_73 - 1 - var92_95 - var88_91]);
                        }
                        if (var46_67.f(var88_91 + (var86_89 + (var61_84 + (var84_87 << 2))))) {
                            var91_94 = var52_73 - 1 - (var60_83 << 1);
                            var59_82.c(var53_74[var91_94 - var88_91], var53_74[var91_94 - var85_88]);
                        }
                        if (var46_67.f(var88_91 + (var86_89 + (var61_84 + var84_87 * 6)))) {
                            var89_92 = var52_73 - 1;
                            var90_93 = var60_83 << 1;
                            var59_82.c(var53_74[var89_92 - var90_93 - var85_88], var53_74[var90_93 + var88_91]);
                        }
                        var87_90 = 2;
                    }
                }
                var61_84 += var84_87 << 3;
                ++var60_83;
            } while (true);
            for (var64_101 = 0; var64_101 < var52_73 / 2 - 1; var64_101 += 15, var65_102 += 16) {
                for (var77_103 = var62_97 & 1; var77_103 < var56_76; var77_103 += 2) {
                    var78_104 = var62_97 - var65_102;
                    var59_82.c(var78_104, var77_103);
                    var79_105 = var62_97 + var65_102;
                    var59_82.c(var79_105, var77_103);
                    var59_82.c(var77_103, var78_104);
                    var59_82.c(var77_103, var79_105);
                }
            }
        }
        var66_106 = var59_82.e;
        var67_107 = var59_82.f;
        var68_108 = Math.max(var3_3, (int)var66_106);
        var69_109 = Math.max(var4_4, (int)var67_107);
        var70_110 = Math.min((int)(var68_108 / var66_106), (int)(var69_109 / var67_107));
        var71_111 = (var68_108 - var66_106 * var70_110) / 2;
        var72_112 = (var69_109 - var67_107 * var70_110) / 2;
        var73_113 = new d.c.d.j.b(var68_108, var69_109);
        var74_114 = 0;
        while (var74_114 < var67_107) {
            var75_115 = var71_111;
            for (var76_116 = 0; var76_116 < var66_106; ++var76_116, var75_115 += var70_110) {
                if (!var59_82.b(var76_116, var74_114)) continue;
                var73_113.d(var75_115, var72_112, var70_110, var70_110);
            }
            ++var74_114;
            var72_112 += var70_110;
        }
        return var73_113;
    }
}

