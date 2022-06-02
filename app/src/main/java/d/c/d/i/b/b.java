/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.d.i.b;

import d.c.d.j.d.a;
import d.c.d.j.d.c;

public final class b {
    public static final int[] a = new int[]{4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(d.c.d.j.b b2, int n2, int n3) {
        for (int i2 = 0; i2 < n3; i2 += 2) {
            int n4;
            int n5;
            for (int i3 = n4 = n2 - i2; i3 <= (n5 = n2 + i2); ++i3) {
                b2.c(i3, n4);
                b2.c(i3, n5);
                b2.c(n4, i3);
                b2.c(n5, i3);
            }
        }
        int n6 = n2 - n3;
        b2.c(n6, n6);
        int n7 = n6 + 1;
        b2.c(n7, n6);
        b2.c(n6, n7);
        int n8 = n2 + n3;
        b2.c(n8, n6);
        b2.c(n8, n7);
        b2.c(n8, n8 - 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static d.c.d.j.a b(d.c.d.j.a a2, int n2, int n3) {
        a a3;
        int n4 = a2.f / n3;
        if (n3 != 4) {
            if (n3 != 6) {
                if (n3 != 8) {
                    if (n3 != 10) {
                        if (n3 != 12) throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(n3)));
                        a3 = a.g;
                    } else {
                        a3 = a.h;
                    }
                } else {
                    a3 = a.l;
                }
            } else {
                a3 = a.i;
            }
        } else {
            a3 = a.j;
        }
        c c2 = new c(a3);
        int n5 = n2 / n3;
        int[] arrn = new int[n5];
        int n6 = a2.f / n3;
        int n7 = 0;
        for (int i2 = 0; i2 < n6; ++i2) {
            int n8 = 0;
            for (int i3 = 0; i3 < n3; ++i3) {
                int n9 = a2.f(i3 + i2 * n3) ? 1 << n3 - i3 - 1 : 0;
                n8 |= n9;
            }
            arrn[i2] = n8;
        }
        c2.a(arrn, n5 - n4);
        int n10 = n2 % n3;
        d.c.d.j.a a4 = new d.c.d.j.a();
        a4.d(0, n10);
        while (n7 < n5) {
            a4.d(arrn[n7], n3);
            ++n7;
        }
        return a4;
    }

    public static d.c.d.j.a c(d.c.d.j.a a2, int n2) {
        d.c.d.j.a a3 = new d.c.d.j.a();
        int n3 = a2.f;
        int n4 = -2 + (1 << n2);
        for (int i2 = 0; i2 < n3; i2 += n2) {
            int n5;
            block5 : {
                int n6;
                block4 : {
                    n5 = 0;
                    for (int i3 = 0; i3 < n2; ++i3) {
                        int n7 = i2 + i3;
                        if (n7 < n3 && !a2.f(n7)) continue;
                        n5 |= 1 << n2 - 1 - i3;
                    }
                    n6 = n5 & n4;
                    if (n6 == n4) break block4;
                    if (n6 != 0) break block5;
                    n6 = n5 | 1;
                }
                a3.d(n6, n2);
                --i2;
                continue;
            }
            a3.d(n5, n2);
        }
        return a3;
    }
}

