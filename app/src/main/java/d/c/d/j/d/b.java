/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Objects
 */
package d.c.d.j.d;

import d.c.d.j.d.a;
import java.util.Objects;

public final class b {
    public final a a;
    public final int[] b;

    public b(a a2, int[] arrn) {
        IllegalArgumentException illegalArgumentException;
        if (arrn.length != 0) {
            this.a = a2;
            int n2 = arrn.length;
            if (n2 > 1 && arrn[0] == 0) {
                int n3;
                for (n3 = 1; n3 < n2 && arrn[n3] == 0; ++n3) {
                }
                if (n3 == n2) {
                    this.b = new int[]{0};
                    return;
                }
                int n4 = n2 - n3;
                int[] arrn2 = new int[n4];
                this.b = arrn2;
                System.arraycopy(arrn, n3, arrn2, 0, n4);
                return;
            }
            this.b = arrn;
            return;
        }
        illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public b a(b b2) {
        IllegalArgumentException illegalArgumentException;
        if (this.a.equals(b2.a)) {
            if (this.d()) {
                return b2;
            }
            if (b2.d()) {
                return this;
            }
            int[] arrn = this.b;
            int[] arrn2 = b2.b;
            if (arrn.length <= arrn2.length) {
                int[] arrn3 = arrn;
                arrn = arrn2;
                arrn2 = arrn3;
            }
            int[] arrn4 = new int[arrn.length];
            int n2 = arrn.length - arrn2.length;
            System.arraycopy(arrn, 0, arrn4, 0, n2);
            for (int i2 = n2; i2 < arrn.length; ++i2) {
                arrn4[i2] = arrn2[i2 - n2] ^ arrn[i2];
            }
            return new b(this.a, arrn4);
        }
        illegalArgumentException = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw illegalArgumentException;
    }

    public int b(int n2) {
        int[] arrn = this.b;
        return arrn[-1 + arrn.length - n2];
    }

    public int c() {
        return -1 + this.b.length;
    }

    public boolean d() {
        return this.b[0] == 0;
    }

    public b e(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n2 >= 0) {
            if (n3 == 0) {
                return this.a.c;
            }
            int n4 = this.b.length;
            int[] arrn = new int[n2 + n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                arrn[i2] = this.a.a(this.b[i2], n3);
            }
            return new b(this.a, arrn);
        }
        illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        var1_1 = new StringBuilder(8 * this.c());
        var2_2 = this.c();
        while (var2_2 >= 0) {
            block9 : {
                block10 : {
                    block11 : {
                        var3_3 = this.b(var2_2);
                        if (var3_3 == 0) break block9;
                        if (var3_3 < 0) {
                            var1_1.append(" - ");
                            var3_3 = -var3_3;
                        } else if (var1_1.length() > 0) {
                            var1_1.append(" + ");
                        }
                        if (var2_2 != 0 && var3_3 == 1) break block10;
                        var4_4 = this.a;
                        Objects.requireNonNull(var4_4);
                        if (var3_3 == 0) throw new IllegalArgumentException();
                        var6_5 = var4_4.b[var3_3];
                        if (var6_5 != 0) break block11;
                        var12_6 = 49;
                        ** GOTO lbl23
                    }
                    if (var6_5 == 1) {
                        var12_6 = 97;
lbl23: // 2 sources:
                        var1_1.append((char)var12_6);
                    } else {
                        var1_1.append("a^");
                        var1_1.append(var6_5);
                    }
                }
                if (var2_2 != 0) {
                    if (var2_2 == 1) {
                        var1_1.append('x');
                    } else {
                        var1_1.append("x^");
                        var1_1.append(var2_2);
                    }
                }
            }
            --var2_2;
        }
        return var1_1.toString();
    }
}

