/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.i.b;

import d.c.d.i.b.g;

public final class a
extends g {
    public final short c;
    public final short d;

    public a(g g2, int n2, int n3) {
        super(g2);
        this.c = (short)n2;
        this.d = (short)n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(d.c.d.j.a var1_1, byte[] var2_2) {
        var3_3 = 0;
        while (var3_3 < (var4_4 = this.d)) {
            block3 : {
                block4 : {
                    if (var3_3 != 0 && (var3_3 != 31 || var4_4 > 62)) break block3;
                    var5_5 = 5;
                    var1_1.d(31, var5_5);
                    var6_6 = this.d;
                    if (var6_6 <= 62) break block4;
                    var7_7 = var6_6 - 31;
                    var5_5 = 16;
                    ** GOTO lbl16
                }
                if (var3_3 == 0) {
                    var1_1.d(Math.min((int)var6_6, 31), var5_5);
                } else {
                    var7_7 = var6_6 - 31;
lbl16: // 2 sources:
                    var1_1.d(var7_7, var5_5);
                }
            }
            var1_1.d(var2_2[var3_3 + this.c], 8);
            ++var3_3;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(this.c);
        stringBuilder.append("::");
        stringBuilder.append(-1 + (this.c + this.d));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

