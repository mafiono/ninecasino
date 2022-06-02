/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.System
 *  java.util.HashMap
 */
package d.c.b.m.e.t;

import d.c.b.m.e.t.d;
import java.util.HashMap;

public class c
implements d {
    public c(int n2) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public StackTraceElement[] a(StackTraceElement[] var1_1) {
        var2_2 = new HashMap();
        var3_3 = new StackTraceElement[var1_1.length];
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = 1;
        do {
            block6 : {
                if (var4_4 >= var1_1.length) {
                    var7_15 = new StackTraceElement[var5_5];
                    System.arraycopy((Object)var3_3, 0, (Object)var7_15, 0, (int)var5_5);
                    if (var5_5 >= var1_1.length) return var1_1;
                    return var7_15;
                }
                var8_7 = var1_1[var4_4];
                var9_8 = (Integer)var2_2.get((Object)var8_7);
                if (var9_8 == null) ** GOTO lbl-1000
                var12_10 = var9_8;
                var13_11 = var4_4 - var12_10;
                if (var4_4 + var13_11 > var1_1.length) ** GOTO lbl20
                for (var14_12 = 0; var14_12 < var13_11; ++var14_12) {
                    if (var1_1[var12_10 + var14_12].equals(var1_1[var4_4 + var14_12])) continue;
lbl20: // 2 sources:
                    var15_13 = false;
                    break block6;
                }
                var15_13 = true;
            }
            if (var15_13) {
                var16_14 = var4_4 - var9_8;
                if (var6_6 < 10) {
                    System.arraycopy(var1_1, (int)var4_4, (Object)var3_3, (int)var5_5, (int)var16_14);
                    var5_5 += var16_14;
                    ++var6_6;
                }
                var10_9 = var4_4 + (var16_14 - 1);
            } else lbl-1000: // 2 sources:
            {
                var3_3[var5_5] = var1_1[var4_4];
                ++var5_5;
                var10_9 = var4_4;
                var6_6 = 1;
            }
            var2_2.put((Object)var8_7, (Object)var4_4);
            var4_4 = var10_9 + 1;
        } while (true);
    }
}

