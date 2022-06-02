/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.k.b.l
 *  d.c.d.k.b.m
 *  d.c.d.n.c.b
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package d.c.d.k;

import d.c.d.k.b.b;
import d.c.d.k.b.c;
import d.c.d.k.b.e;
import d.c.d.k.b.f;
import d.c.d.k.b.g;
import d.c.d.k.b.h;
import d.c.d.k.b.i;
import d.c.d.k.b.j;
import d.c.d.k.b.k;
import d.c.d.k.b.l;
import d.c.d.k.b.m;
import java.util.Map;

public final class a
implements d.c.d.g {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d.c.d.j.b a(String string, d.c.d.a a2, int n2, int n3, Map<d.c.d.c, ?> map) {
        StringBuilder stringBuilder;
        d.c.d.b b3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        h h2;
        int n10;
        d.c.d.b b4;
        int n11;
        int n12;
        d.c.d.j.b b6;
        int n13;
        k k4;
        block45 : {
            block41 : {
                g[] arrg;
                block44 : {
                    int n14;
                    block43 : {
                        block42 : {
                            if (string.isEmpty()) {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Found empty contents");
                                throw illegalArgumentException;
                            }
                            if (a2 != d.c.d.a.j) throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(a2)));
                            if (n2 < 0 || n3 < 0) break block41;
                            k4 = k.e;
                            b4 = null;
                            if (map != null) {
                                d.c.d.b b7;
                                k k5 = (k) map.get(d.c.d.c.g);
                                if (k5 != null) {
                                    k4 = k5;
                                }
                                if ((b7 = (d.c.d.b)map.get(d.c.d.c.h)) == null) {
                                    b7 = null;
                                }
                                b3 = (d.c.d.b)map.get(d.c.d.c.i);
                                if (b3 == null) {
                                    b3 = null;
                                }
                                b4 = b7;
                            } else {
                                b3 = null;
                            }
                            arrg = new g[]{new d.c.d.k.b.a(), new c(), new l(), new m(), new f(), new b()};
                            h2 = new h(string);
                            h2.b = k4;
                            h2.c = b4;
                            h2.d = b3;
                            if (!string.startsWith("[)>\u001e05\u001d") || !string.endsWith("\u001e\u0004")) break block42;
                            n14 = 236;
                            break block43;
                        }
                        if (!string.startsWith("[)>\u001e06\u001d") || !string.endsWith("\u001e\u0004")) break block44;
                        n14 = 237;
                    }
                    h2.e.append((char)n14);
                    h2.i = 2;
                    h2.f = 7 + h2.f;
                }
                int n15 = 0;
                while (h2.d()) {
                    arrg[n15].a(h2);
                    int n16 = h2.g;
                    if (n16 < 0) continue;
                    h2.g = -1;
                    n15 = n16;
                }
                int n17 = h2.a();
                h2.e();
                n6 = h2.h.b;
                if (n17 < n6 && n15 != 0 && n15 != 5 && n15 != 4) {
                    h2.e.append('\u00fe');
                }
                if ((stringBuilder = h2.e).length() < n6) {
                    stringBuilder.append('\u0081');
                }
                break block45;
            }
            StringBuilder stringBuilder2 = new StringBuilder("Requested dimensions can't be negative: ");
            stringBuilder2.append(n2);
            stringBuilder2.append('x');
            stringBuilder2.append(n3);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        while (stringBuilder.length() < n6) {
            int n18 = 129 + (1 + 149 * (1 + stringBuilder.length()) % 253);
            if (n18 > 254) {
                n18 -= 254;
            }
            stringBuilder.append((char)n18);
        }
        String string2 = h2.e.toString();
        j j2 = j.i(string2.length(), k4, b4, b3, true);
        int n19 = string2.length();
        if (n19 != (n12 = j2.b)) throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        StringBuilder stringBuilder3 = new StringBuilder(n12 + j2.c);
        stringBuilder3.append(string2);
        int n20 = j2.c();
        if (n20 == 1) {
            stringBuilder3.append(i.a(string2, j2.c));
        } else {
            stringBuilder3.setLength(stringBuilder3.capacity());
            int[] arrn = new int[n20];
            int[] arrn2 = new int[n20];
            int[] arrn3 = new int[n20];
            int n21 = 0;
            while (n21 < n20) {
                int n22 = n21 + 1;
                arrn[n21] = j2.a(n22);
                arrn2[n21] = j2.h;
                arrn3[n21] = 0;
                if (n21 > 0) {
                    arrn3[n21] = arrn3[n21 - 1] + arrn[n21];
                }
                n21 = n22;
            }
            for (int i2 = 0; i2 < n20; ++i2) {
                StringBuilder stringBuilder4 = new StringBuilder(arrn[i2]);
                for (int i3 = i2; i3 < j2.b; i3 += n20) {
                    stringBuilder4.append(string2.charAt(i3));
                }
                String string3 = i.a(stringBuilder4.toString(), arrn2[i2]);
                int n23 = 0;
                for (int i4 = i2; i4 < n20 * arrn2[i2]; i4 += n20) {
                    int n24 = i4 + j2.b;
                    int n25 = n23 + 1;
                    stringBuilder3.setCharAt(n24, string3.charAt(n23));
                    n23 = n25;
                }
            }
        }
        e e2 = new e(stringBuilder3.toString(), j2.e(), j2.d());
        int n26 = 4;
        int n27 = 0;
        int n28 = 0;
        do {
            int n29;
            int n30;
            int n31;
            int n32;
            if (n26 == (n30 = e2.b) && n27 == 0) {
                int n33 = n28 + 1;
                e2.b(n30 - 1, 0, n28, 1);
                e2.b(e2.b - 1, 1, n28, 2);
                e2.b(e2.b - 1, 2, n28, 3);
                e2.b(0, e2.c - 2, n28, 4);
                e2.b(0, e2.c - 1, n28, 5);
                e2.b(1, e2.c - 1, n28, 6);
                e2.b(2, e2.c - 1, n28, 7);
                e2.b(3, e2.c - 1, n28, 8);
                n28 = n33;
            }
            if (n26 == (n29 = e2.b) - 2 && n27 == 0 && e2.c % 4 != 0) {
                int n34 = n28 + 1;
                e2.b(n29 - 3, 0, n28, 1);
                e2.b(e2.b - 2, 0, n28, 2);
                e2.b(e2.b - 1, 0, n28, 3);
                e2.b(0, e2.c - 4, n28, 4);
                e2.b(0, e2.c - 3, n28, 5);
                e2.b(0, e2.c - 2, n28, 6);
                e2.b(0, e2.c - 1, n28, 7);
                e2.b(1, e2.c - 1, n28, 8);
                n28 = n34;
            }
            if (n26 == (n32 = e2.b) - 2 && n27 == 0 && e2.c % 8 == 4) {
                int n35 = n28 + 1;
                e2.b(n32 - 3, 0, n28, 1);
                e2.b(e2.b - 2, 0, n28, 2);
                e2.b(e2.b - 1, 0, n28, 3);
                e2.b(0, e2.c - 2, n28, 4);
                e2.b(0, e2.c - 1, n28, 5);
                e2.b(1, e2.c - 1, n28, 6);
                e2.b(2, e2.c - 1, n28, 7);
                e2.b(3, e2.c - 1, n28, 8);
                n28 = n35;
            }
            if (n26 == (n31 = e2.b) + 4 && n27 == 2 && e2.c % 8 == 0) {
                int n36 = n28 + 1;
                e2.b(n31 - 1, 0, n28, 1);
                e2.b(e2.b - 1, e2.c - 1, n28, 2);
                e2.b(0, e2.c - 3, n28, 3);
                e2.b(0, e2.c - 2, n28, 4);
                e2.b(0, e2.c - 1, n28, 5);
                e2.b(1, e2.c - 3, n28, 6);
                e2.b(1, e2.c - 2, n28, 7);
                e2.b(1, e2.c - 1, n28, 8);
                n28 = n36;
            }
            do {
                if (n26 >= e2.b || n27 < 0 || e2.a(n27, n26)) continue;
                int n37 = n28 + 1;
                e2.d(n26, n27, n28);
                n28 = n37;
            } while ((n26 -= 2) >= 0 && (n27 += 2) < e2.c);
            int n38 = n26 + 1;
            int n39 = n27 + 3;
            do {
                if (n38 < 0 || n39 >= e2.c || e2.a(n39, n38)) continue;
                int n40 = n28 + 1;
                e2.d(n38, n39, n28);
                n28 = n40;
            } while ((n38 += 2) < (n5 = e2.b) && (n39 -= 2) >= 0);
            n26 = n38 + 3;
            n27 = n39 + 1;
        } while (n26 < n5 || n27 < (n11 = e2.c));
        if (!e2.a(n11 - 1, n5 - 1)) {
            e2.c(e2.c - 1, e2.b - 1, true);
            e2.c(e2.c - 2, e2.b - 2, true);
        }
        int n41 = j2.e();
        int n42 = j2.d();
        d.c.d.n.c.b b8 = new d.c.d.n.c.b(j2.g(), j2.f());
        int n43 = 0;
        int n44 = 0;
        do {
            block47 : {
                int n45;
                block48 : {
                    block46 : {
                        if (n43 >= n42) break block46;
                        if (n43 % j2.e != 0) break block47;
                        n45 = 0;
                        break block48;
                    }
                    n4 = b8.b;
                    n8 = b8.c;
                    int n46 = Math.max(n2, n4);
                    int n47 = Math.max(n3, n8);
                    n10 = Math.min(n46 / n4, n47 / n8);
                    n7 = (n46 - n4 * n10) / 2;
                    n13 = (n47 - n8 * n10) / 2;
                    if (n3 >= n8 && n2 >= n4) {
                        b6 = new d.c.d.j.b(n2, n3);
                    } else {
                        b6 = new d.c.d.j.b(n4, n8);
                        n7 = 0;
                        n13 = 0;
                    }
                    int n48 = b6.h.length;
                    for (int i5 = 0; i5 < n48; ++i5) {
                        b6.h[i5] = 0;
                    }
                    break;
                }
                for (int i6 = 0; i6 < j2.g(); ++n45, ++i6) {
                    boolean bl = i6 % 2 == 0;
                    b8.c(n45, n44, bl);
                }
                ++n44;
            }
            int n49 = 0;
            for (int i7 = 0; i7 < n41; ++i7) {
                if (i7 % j2.d == 0) {
                    b8.c(n49, n44, true);
                    ++n49;
                }
                boolean bl = e2.d[i7 + n43 * e2.c] == 1;
                b8.c(n49, n44, bl);
                ++n49;
                int n50 = j2.d;
                if (i7 % n50 != n50 - 1) continue;
                boolean bl2 = n43 % 2 == 0;
                b8.c(n49, n44, bl2);
                ++n49;
            }
            ++n44;
            int n51 = j2.e;
            if (n43 % n51 == n51 - 1) {
                int n52 = 0;
                for (int i8 = 0; i8 < j2.g(); ++n52, ++i8) {
                    b8.c(n52, n44, true);
                }
                ++n44;
            }
            ++n43;
        } while (true);
        int n53 = 0;
        while (n53 < n8) {
            int n54 = n7;
            for (int i9 = 0; i9 < n4; ++i9, n54 += n10) {
                if (b8.a(i9, n53) != 1) continue;
                b6.d(n54, n13, n10, n10);
            }
            ++n53;
            n13 += n10;
        }
        return b6;
    }
}

