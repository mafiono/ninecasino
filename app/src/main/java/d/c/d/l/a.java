/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.l.m
 */
package d.c.d.l;

import d.c.d.l.m;

public final class a
extends m {
    public static final char[] a = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] b = new int[]{3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean a(char[] arrc, char c3) {
        int n2 = arrc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrc[i2] != c3) continue;
            return true;
        }
        return false;
    }
}

