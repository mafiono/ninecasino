/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Field
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package d.c.c.a0.z;

import d.c.c.a0.g;
import d.c.c.a0.o;
import d.c.c.a0.t;
import d.c.c.a0.z.d;
import d.c.c.a0.z.i;
import d.c.c.c0.c;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class j
implements y {
    public final g e;
    public final d.c.c.d f;
    public final o g;
    public final d h;
    public final d.c.c.a0.a0.b i = d.c.c.a0.a0.b.a;

    public j(g g2, d.c.c.d d3, o o2, d d4) {
        this.e = g2;
        this.f = d3;
        this.g = o2;
        this.h = d4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(Field field, boolean bl) {
        o o2 = this.g;
        Class class_ = field.getType();
        if (o2.d(class_)) return false;
        if (o2.c(class_, bl)) {
            return false;
        }
        boolean bl2 = false;
        if (bl2) return false;
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || o2.d(field.getType())) return false;
        List<d.c.c.a> list = bl ? o2.e : o2.f;
        if (list.isEmpty()) return true;
        d.c.c.b b3 = new d.c.c.b(field);
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return true;
        } while (!((d.c.c.a)iterator.next()).b(b3));
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public <T> x<T> b(d.c.c.i var1_1, d.c.c.b0.a<T> var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = Object.class;
        var6_6 = var2_2.a;
        if (!var5_5.isAssignableFrom(var6_6)) {
            return null;
        }
        var7_7 = var3_3.e.a(var2_2);
        var9_9 = new LinkedHashMap();
        if (var6_6.isInterface()) ** GOTO lbl15
        var10_13 = var2_2.b;
        var11_14 = var2_2;
        var12_15 = var6_6;
        block0 : do {
            block16 : {
                if (var12_15 != var5_5) break block16;
lbl15: // 2 sources:
                var84_10 = var9_9;
                var85_11 = var8_8;
                var86_12 = var7_7;
                var85_11(var86_12, (Map<String, b>)var84_10);
                return var85_11;
            }
            var13_16 = var12_15.getDeclaredFields();
            var14_17 = var13_16.length;
            var15_18 = 0;
            do {
                block19 : {
                    block21 : {
                        block17 : {
                            block20 : {
                                block18 : {
                                    if (var15_18 >= var14_17) break block17;
                                    var23_22 = var13_16[var15_18];
                                    var24_23 = var3_3.a(var23_22, true);
                                    var25_24 = var3_3.a(var23_22, false);
                                    if (var24_23 || var25_24) break block18;
                                    var30_29 = var15_18;
                                    var31_30 = var14_17;
                                    var41_39 = var13_16;
                                    var42_40 = var12_15;
                                    var43_41 = var11_14;
                                    var44_42 = var9_9;
                                    var45_43 = var8_8;
                                    var46_44 = var5_5;
                                    var47_45 = var7_7;
                                    var48_46 = var10_13;
                                    break block19;
                                }
                                var3_3.i.a((AccessibleObject)var23_22);
                                var26_25 = d.c.c.a0.a.g(var11_14.b, var12_15, var23_22.getGenericType());
                                var27_26 = (d.c.c.z.b)var23_22.getAnnotation(d.c.c.z.b.class);
                                if (var27_26 != null) break block20;
                                var83_80 = Collections.singletonList((Object)var3_3.f.g(var23_22));
                                var30_29 = var15_18;
                                ** GOTO lbl55
                            }
                            var28_27 = var27_26.value();
                            var29_28 = var27_26.alternate();
                            var30_29 = var15_18;
                            if (var29_28.length == 0) {
                                var83_80 = Collections.singletonList(var28_27);
lbl55: // 2 sources:
                                var31_30 = var14_17;
                                var36_34 = var83_80;
                            } else {
                                var31_30 = var14_17;
                                var32_31 = new ArrayList(1 + var29_28.length);
                                var32_31.add((Object)var28_27);
                                var34_32 = var29_28.length;
                                for (var35_33 = 0; var35_33 < var34_32; ++var35_33) {
                                    var81_79 = var34_32;
                                    var32_31.add((Object)var29_28[var35_33]);
                                    var34_32 = var81_79;
                                }
                                var36_34 = var32_31;
                            }
                            var37_35 = var36_34.size();
                            var38_36 = null;
                            var39_37 = 0;
                            break block21;
                        }
                        var16_19 = var12_15;
                        var17_20 = var11_14;
                        var21_21 = var7_7;
                        var11_14 = new d.c.c.b0.a<T>(d.c.c.a0.a.g(var17_20.b, var16_19, var16_19.getGenericSuperclass()));
                        var12_15 = var11_14.a;
                        var3_3 = this;
                        var4_4 = var1_1;
                        var7_7 = var21_21;
                        continue block0;
                    }
                    while (var39_37 < var37_35) {
                        var53_47 = var36_34.get(var39_37);
                        var54_48 = var5_5;
                        var55_49 = (String)var53_47;
                        var56_50 = var9_9;
                        if (var39_37 != 0) {
                            var24_23 = false;
                        }
                        var57_51 = new d.c.c.b0.a<T>(var26_25);
                        var58_52 = var38_36;
                        var59_53 = var57_51.a;
                        var60_54 = var39_37;
                        var61_55 = var59_53 instanceof Class != false && var59_53.isPrimitive() != false;
                        var62_56 = (d.c.c.z.a)var23_22.getAnnotation(d.c.c.z.a.class);
                        if (var62_56 != null) {
                            var80_78 = var3_3.h;
                            var63_57 = var23_22;
                            var64_59 = var80_78.a(var3_3.e, var4_4, var57_51, var62_56);
                        } else {
                            var63_57 = var23_22;
                            var64_60 = null;
                        }
                        var65_63 = var64_61 != null;
                        if (var64_61 == null) {
                            var64_62 = var4_4.c(var57_51);
                        }
                        var66_64 = var64_58;
                        var67_65 = var63_57;
                        var68_66 = var37_35;
                        var69_67 = var24_23;
                        var70_68 = var36_34;
                        var71_69 = var13_16;
                        var72_70 = var12_15;
                        var73_71 = var65_63;
                        var74_72 = var26_25;
                        var75_73 = var11_14;
                        var76_74 = var7_7;
                        var77_75 = var10_13;
                        var78_76 = var8_8;
                        var79_77 = new i(this, var55_49, var69_67, var25_24, var67_65, var73_71, (x)var66_64, var1_1, var57_51, var61_55);
                        var38_36 = var56_50.put((Object)var55_49, (Object)var79_77);
                        if (var58_52 != null) {
                            var38_36 = var58_52;
                        }
                        var39_37 = var60_54 + 1;
                        var3_3 = this;
                        var4_4 = var1_1;
                        var12_15 = var72_70;
                        var9_9 = var56_50;
                        var10_13 = var77_75;
                        var5_5 = var54_48;
                        var23_22 = var67_65;
                        var37_35 = var68_66;
                        var26_25 = var74_72;
                        var7_7 = var76_74;
                        var36_34 = var70_68;
                        var13_16 = var71_69;
                        var11_14 = var75_73;
                        var8_8 = var78_76;
                    }
                    var40_38 = var38_36;
                    var41_39 = var13_16;
                    var42_40 = var12_15;
                    var43_41 = var11_14;
                    var44_42 = var9_9;
                    var45_43 = var8_8;
                    var46_44 = var5_5;
                    var47_45 = var7_7;
                    var48_46 = var10_13;
                    if (var40_38 != null) {
                        var49_81 = new StringBuilder();
                        var49_81.append((Object)var48_46);
                        var49_81.append(" declares multiple JSON fields named ");
                        var49_81.append(var40_38.a);
                        throw new IllegalArgumentException(var49_81.toString());
                    }
                }
                var15_18 = var30_29 + 1;
                var3_3 = this;
                var4_4 = var1_1;
                var12_15 = var42_40;
                var9_9 = var44_42;
                var10_13 = var48_46;
                var14_17 = var31_30;
                var5_5 = var46_44;
                var7_7 = var47_45;
                var13_16 = var41_39;
                var11_14 = var43_41;
                var8_8 = var45_43;
            } while (true);
            break;
        } while (true);
    }

    public static final class a<T>
    extends x<T> {
        public final t<T> a;
        public final Map<String, b> b;

        public a(t<T> t6, Map<String, b> map) {
            this.a = t6;
            this.b = map;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public T a(d.c.c.c0.a a2) {
            if (a2.n0() == d.c.c.c0.b.m) {
                a2.j0();
                return null;
            }
            T t6 = this.a.a();
            try {
                a2.e();
                while (a2.F()) {
                    String string = a2.h0();
                    b b3 = this.b.get(string);
                    if (b3 != null && b3.c) {
                        b3.a(a2, t6);
                        continue;
                    }
                    a2.s0();
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError(illegalAccessException);
            }
            catch (IllegalStateException illegalStateException) {
                v v3 = new v(illegalStateException);
                throw v3;
            }
            a2.u();
            return t6;
        }

        @Override
        public void b(c c3, T t6) {
            if (t6 == null) {
                c3.F();
                return;
            }
            c3.i();
            try {
                for (b b3 : this.b.values()) {
                    if (!b3.c(t6)) continue;
                    c3.A(b3.a);
                    b3.b(c3, t6);
                }
            }
            catch (IllegalAccessException illegalAccessException) {
                AssertionError assertionError = new AssertionError(illegalAccessException);
                throw assertionError;
            }
            c3.u();
        }
    }

}

