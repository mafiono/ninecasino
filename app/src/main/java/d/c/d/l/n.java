/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package d.c.d.l;

import d.c.d.a;
import d.c.d.c;
import d.c.d.g;
import d.c.d.j.b;
import java.util.Map;

public abstract class n
implements g {
    public static int b(boolean[] arrbl, int n2, int[] arrn, boolean bl) {
        int n3 = arrn.length;
        int n4 = 0;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n5 = arrn[i2];
            for (int i3 = 0; i3 < n5; ++i3) {
                int n6 = n2 + 1;
                arrbl[n2] = bl;
                n2 = n6;
            }
            n4 += n5;
            bl ^= true;
        }
        return n4;
    }

    @Override
    public b a(String string, a a2, int n2, int n3, Map<c, ?> map) {
        IllegalArgumentException illegalArgumentException;
        if (!string.isEmpty()) {
            if (n2 >= 0 && n3 >= 0) {
                c c3;
                int n4 = this.d();
                if (map != null && map.containsKey(c3 = c.j)) {
                    n4 = Integer.parseInt(map.get(c3).toString());
                }
                boolean[] arrbl = this.c(string);
                int n5 = arrbl.length;
                int n6 = n4 + n5;
                int n7 = Math.max(n2, n6);
                int n8 = Math.max(1, n3);
                int n10 = n7 / n6;
                int n11 = (n7 - n5 * n10) / 2;
                b b3 = new b(n7, n8);
                int n12 = 0;
                while (n12 < n5) {
                    if (arrbl[n12]) {
                        b3.d(n11, 0, n10, n8);
                    }
                    ++n12;
                    n11 += n10;
                }
                return b3;
            }
            StringBuilder stringBuilder = new StringBuilder("Negative size is not allowed. Input: ");
            stringBuilder.append(n2);
            stringBuilder.append('x');
            stringBuilder.append(n3);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        illegalArgumentException = new IllegalArgumentException("Found empty contents");
        throw illegalArgumentException;
    }

    public abstract boolean[] c(String var1);

    public int d() {
        return 10;
    }
}

