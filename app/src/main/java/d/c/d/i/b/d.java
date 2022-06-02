/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  I
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedList
 */
package d.c.d.i.b;

import d.c.d.i.b.f;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public final class d {
    public static final String[] b = new String[]{"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] c = new int[][]{{0, 327708, 327710, 327709, 656318}, {590318, 0, 327710, 327709, 656318}, {262158, 590300, 0, 590301, 932798}, {327709, 327708, 656318, 0, 327710}, {327711, 656380, 656382, 656381, 0}};
    public static final int[][] d;
    public static final int[][] e;
    public final byte[] a;

    public static {
        int[][] arrn = (int[][])Array.newInstance(I.class, new int[]{5, 256});
        d = arrn;
        arrn[0][32] = 1;
        for (int i2 = 65; i2 <= 90; ++i2) {
            d.d[0][i2] = 2 + (i2 - 65);
        }
        d.d[1][32] = 1;
        for (int i3 = 97; i3 <= 122; ++i3) {
            d.d[1][i3] = 2 + (i3 - 97);
        }
        d.d[2][32] = 1;
        for (int i4 = 48; i4 <= 57; ++i4) {
            d.d[2][i4] = 2 + (i4 - 48);
        }
        int[][] arrn2 = d;
        arrn2[2][44] = 12;
        arrn2[2][46] = 13;
        int[] arrn3 = new int[]{0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        int n2 = 0;
        while (n2 < 28) {
            d.d[3][arrn3[n2]] = n2++;
        }
        int[] arrn4 = new int[]{0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; ++i5) {
            if (arrn4[i5] <= 0) continue;
            d.d[4][arrn4[i5]] = i5;
        }
        int[][] arrn5 = (int[][])Array.newInstance(I.class, new int[]{6, 6});
        e = arrn5;
        int n3 = arrn5.length;
        for (int i6 = 0; i6 < n3; ++i6) {
            Arrays.fill(arrn5[i6], -1);
        }
        int[][] arrn6 = e;
        arrn6[0][4] = 0;
        arrn6[1][4] = 0;
        arrn6[1][0] = 28;
        arrn6[3][4] = 0;
        arrn6[2][4] = 0;
        arrn6[2][0] = 15;
    }

    public d(byte[] arrby) {
        this.a = arrby;
    }

    public static Collection<f> a(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f f2 : iterable) {
            boolean bl = true;
            Iterator iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                f f3 = (f)iterator.next();
                if (f3.c(f2)) {
                    bl = false;
                    break;
                }
                if (!f2.c(f3)) continue;
                iterator.remove();
            }
            if (!bl) continue;
            linkedList.add(f2);
        }
        return linkedList;
    }
}

