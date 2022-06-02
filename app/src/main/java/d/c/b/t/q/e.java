/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Objects
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.t.q;

import d.c.b.t.o;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class e {
    public static final long d = TimeUnit.HOURS.toMillis(24L);
    public static final long e = TimeUnit.MINUTES.toMillis(30L);
    public final o a = o.c();
    public long b;
    public int c;

    public boolean a() {
        e e2 = this;
        synchronized (e2) {
            boolean bl;
            block4 : {
                long l2;
                long l3;
                if (this.c != 0 && (l2 = this.a.a()) <= (l3 = this.b)) {
                    bl = false;
                    break block4;
                }
                bl = true;
            }
            return bl;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b(int var1_1) {
        block15 : {
            block17 : {
                block16 : {
                    var22_2 = this;
                    // MONITORENTER : var22_2
                    var2_3 = var1_1 >= 200 && var1_1 < 300 || var1_1 == 401 || var1_1 == 404;
                    if (var2_3) {
                        var22_2 = this;
                        // MONITORENTER : var22_2
                        this.c = 0;
                        // MONITOREXIT : var22_2
                        // MONITOREXIT : var22_2
                        return;
                    }
                    this.c = 1 + this.c;
                    var22_2 = this;
                    // MONITORENTER : var22_2
                    if (var1_1 == 429) break block16;
                    var4_4 = false;
                    if (var1_1 < 500) break block17;
                    var4_4 = false;
                    if (var1_1 >= 600) break block17;
                }
                var4_4 = true;
            }
            if (var4_4) ** GOTO lbl27
            var18_5 = e.d;
            // MONITOREXIT : var22_2
            break block15;
lbl27: // 1 sources:
            var5_7 = Math.pow(2.0, this.c);
            Objects.requireNonNull((Object)this.a);
            var8_8 = Math.random();
            var10_9 = (long)(var8_8 * 1000.0);
            Double.isNaN((double)var10_9);
            Double.isNaN((double)var10_9);
            var14_10 = var5_7 + var10_9;
            var16_11 = Math.min((double)var14_10, (double)e.e);
            var18_5 = (long)var16_11;
            // MONITOREXIT : var22_2
        }
        this.b = var18_5 + this.a.a();
        // MONITOREXIT : var22_2
    }
}

