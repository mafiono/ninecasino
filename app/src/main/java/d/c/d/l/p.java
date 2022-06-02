/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.l.m
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.System
 */
package d.c.d.l;

import d.c.d.d;
import d.c.d.f;
import d.c.d.l.m;

public abstract class p
extends m {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[][] d;
    public static final int[][] e;

    public static {
        int n2;
        a = new int[]{1, 1, 1};
        b = new int[]{1, 1, 1, 1, 1};
        c = new int[]{1, 1, 1, 1, 1, 1};
        int[][] arrarrn = new int[n2][];
        arrarrn[0] = new int[]{3, 2, 1, 1};
        arrarrn[1] = new int[]{2, 2, 2, 1};
        arrarrn[2] = new int[]{2, 1, 2, 2};
        arrarrn[3] = new int[]{1, 4, 1, 1};
        arrarrn[4] = new int[]{1, 1, 3, 2};
        arrarrn[5] = new int[]{1, 2, 3, 1};
        arrarrn[6] = new int[]{1, 1, 1, 4};
        arrarrn[7] = new int[]{1, 3, 1, 2};
        arrarrn[8] = new int[]{1, 2, 1, 3};
        arrarrn[9] = new int[]{3, 1, 1, 2};
        d = arrarrn;
        int[][] arrarrn2 = new int[20][];
        e = arrarrn2;
        System.arraycopy(arrarrn, 0, arrarrn2, 0, n2);
        for (n2 = 10; n2 < 20; ++n2) {
            int[] arrn = d[n2 - 10];
            int[] arrn2 = new int[arrn.length];
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                arrn2[i2] = arrn[arrn.length - i2 - 1];
            }
            p.e[n2] = arrn2;
        }
    }

    public static boolean a(CharSequence charSequence) {
        int n2 = charSequence.length();
        if (n2 == 0) {
            return false;
        }
        int n3 = n2 - 1;
        int n4 = Character.digit(charSequence.charAt(n3), 10);
        return p.b(charSequence.subSequence(0, n3)) == n4;
    }

    public static int b(CharSequence charSequence) {
        int n2 = charSequence.length();
        int n3 = 0;
        for (int i2 = n2 - 1; i2 >= 0; i2 -= 2) {
            int n4 = -48 + charSequence.charAt(i2);
            if (n4 >= 0 && n4 <= 9) {
                n3 += n4;
                continue;
            }
            d d3 = f.e ? new d() : d.g;
            throw d3;
        }
        int n5 = n3 * 3;
        while ((n2 -= 2) >= 0) {
            int n6 = -48 + charSequence.charAt(n2);
            if (n6 >= 0 && n6 <= 9) {
                n5 += n6;
                continue;
            }
            d d4 = f.e ? new d() : d.g;
            throw d4;
        }
        return (1000 - n5) % 10;
    }
}

