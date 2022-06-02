/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.a.a
 *  d.a.a.a$a
 *  d.a.a.a$b
 *  d.a.a.c$a$a
 *  d.c.a.e.a
 *  f.k
 *  f.m.d
 *  f.m.j.a
 *  f.o.b.i
 *  f.t.d
 *  g.a.y1.a
 *  g.a.y1.b
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package d.a.a;

import d.a.a.a;
import d.a.a.c;
import f.k;
import f.m.d;
import f.o.b.i;
import g.a.y1.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c
implements g.a.y1.a<a.a> {
    public final /* synthetic */ g.a.y1.a e;

    public c(g.a.y1.a a2) {
        this.e = a2;
    }

    public Object a(final b b2, d d2) {
        Object object = this.e.a((b)new b<a.a>(this){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public Object f(Object var1_1, d var2_2) {
                if (!(var2_2 instanceof a)) ** GOTO lbl-1000
                var3_3 = (a)var2_2;
                var32_4 = var3_3.i;
                if ((var32_4 & Integer.MIN_VALUE) != 0) {
                    var3_3.i = var32_4 + Integer.MIN_VALUE;
                } else lbl-1000: // 2 sources:
                {
                    var3_3 = new a(this, var2_2);
                }
                var4_5 = var3_3.h;
                var5_6 = f.m.j.a.e;
                var6_7 = var3_3.i;
                if (var6_7 != 0) {
                    if (var6_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    d.c.a.e.a.v0((Object)var4_5);
                    return k.a;
                }
                d.c.a.e.a.v0((Object)var4_5);
                var7_8 = b2;
                var8_9 = (a.a)var1_1;
                if (var8_9 != null) {
                    var10_10 = var8_9.a;
                    var11_11 = var10_10 == null || var10_10.isEmpty();
                    if (var11_11) {
                        var9_12 = new a.a(null, var8_9.b, 1);
                    } else {
                        var12_13 = (String)var10_10.get((Object)"af_status");
                        if (var12_13 == null) {
                            var12_13 = "Organic";
                        }
                        if (true ^ i.a((Object)var12_13, (Object)"Organic")) {
                            var13_14 = (String)var10_10.get((Object)"campaign_id");
                            var14_15 = (String)var10_10.get((Object)"adset");
                            var15_16 = (String)var10_10.get((Object)"af_adset");
                            var16_17 = (String)var10_10.get((Object)"campaign");
                            var17_18 = new LinkedHashMap();
                            if (var13_14 != null) {
                                var17_18.put((Object)"sub_id_4", (Object)var13_14);
                            }
                            if (var14_15 != null) {
                                var17_18.put((Object)"sub_id_3", (Object)var14_15);
                            }
                            if (var15_16 != null) {
                                var17_18.put((Object)"sub_id_3", (Object)var15_16);
                            }
                            if (var16_17 != null) {
                                var19_19 = f.t.d.n(f.t.d.m((String)var16_17, "%20", " ", false, 4), new String[]{" "}, false, 0, 6);
                                i.e((Object)var19_19, (String)"$this$firstOrNull");
                                var20_20 = var19_19.isEmpty() != false ? null : var19_19.get(0);
                                var21_21 = (String)var20_20;
                                var22_22 = var21_21 != null ? f.t.d.n((CharSequence)var21_21, new String[]{"_"}, false, 0, 6) : null;
                                if (var22_22 != null) {
                                    i.e(var22_22, (String)"$this$getOrNull");
                                    i.e(var22_22, (String)"$this$lastIndex");
                                    var28_23 = 1 <= -1 + var22_22.size() ? var22_22.get(1) : null;
                                    var23_24 = (String)var28_23;
                                } else {
                                    var23_24 = null;
                                }
                                var24_25 = null;
                                if (var22_22 != null) {
                                    i.e((Object)var22_22, (String)"$this$lastOrNull");
                                    var27_26 = var22_22.isEmpty() != false ? null : var22_22.get(-1 + var22_22.size());
                                    var24_25 = (String)var27_26;
                                }
                                if (var23_24 != null) {
                                    var17_18.put((Object)"sub_id_2", var23_24);
                                }
                                if (var24_25 != null) {
                                    var17_18.put((Object)"sub_id_1", var24_25);
                                }
                            }
                            var18_27 = var8_9.b;
                            i.e((Object)var17_18, (String)"$this$toMutableMap");
                            var9_12 = new a.a((Map)new LinkedHashMap((Map)var17_18), var18_27);
                        } else {
                            var9_12 = new a.a(null, var8_9.b, 1);
                        }
                    }
                } else {
                    var9_12 = new a.a(null, (a.b)a.b.b.a, 1);
                }
                var3_3.i = 1;
                if (var7_8.f((Object)var9_12, (d)var3_3) != var5_6) return k.a;
                return var5_6;
            }
        }, d2);
        if (object == f.m.j.a.e) {
            return object;
        }
        return k.a;
    }

}

