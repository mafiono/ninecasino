/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 */
package d.c.d.j.d;

import d.c.d.j.d.a;
import d.c.d.j.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c {
    public final a a;
    public final List<b> b;

    public c(a a2) {
        ArrayList arrayList;
        this.a = a2;
        this.b = arrayList = new ArrayList();
        arrayList.add(new b(a2, new int[]{1}));
    }

    public void a(int[] arrn, int n2) {
        IllegalArgumentException illegalArgumentException;
        if (n2 != 0) {
            int n3 = arrn.length - n2;
            if (n3 > 0) {
                int n4 = this.b.size();
                int n5 = 2;
                int n6 = 1;
                if (n2 >= n4) {
                    List<b> list = this.b;
                    b b2 = list.get(list.size() - n6);
                    for (int i2 = this.b.size(); i2 <= n2; ++i2) {
                        a a2 = this.a;
                        int[] arrn2 = new int[n5];
                        arrn2[0] = n6;
                        int n7 = i2 - 1 + a2.f;
                        arrn2[n6] = a2.a[n7];
                        b b3 = new b(a2, arrn2);
                        if (b2.a.equals(a2)) {
                            if (!b2.d() && !b3.d()) {
                                int[] arrn3 = b2.b;
                                int n8 = arrn3.length;
                                int[] arrn4 = b3.b;
                                int n9 = arrn4.length;
                                int[] arrn5 = new int[-1 + (n8 + n9)];
                                for (int i3 = 0; i3 < n8; ++i3) {
                                    int n10 = arrn3[i3];
                                    for (int i4 = 0; i4 < n9; ++i4) {
                                        int n11 = i3 + i4;
                                        int n12 = arrn5[n11];
                                        a a3 = b2.a;
                                        int[] arrn6 = arrn3;
                                        arrn5[n11] = n12 ^ a3.a(n10, arrn4[i4]);
                                        arrn3 = arrn6;
                                    }
                                }
                                b2 = new b(b2.a, arrn5);
                            } else {
                                b2 = b2.a.c;
                            }
                            this.b.add(b2);
                            n5 = 2;
                            n6 = 1;
                            continue;
                        }
                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                    }
                }
                b b4 = this.b.get(n2);
                int[] arrn7 = new int[n3];
                System.arraycopy(arrn, 0, arrn7, 0, n3);
                b b6 = new b(this.a, arrn7).e(n2, 1);
                if (b6.a.equals(b4.a)) {
                    if (!b4.d()) {
                        b b7 = b6.a.c;
                        int n13 = b4.b(b4.c());
                        a a4 = b6.a;
                        Objects.requireNonNull((Object)a4);
                        if (n13 != 0) {
                            int n14 = a4.a[-1 + (a4.d - a4.b[n13])];
                            b b8 = b6;
                            while (b8.c() >= b4.c() && !b8.d()) {
                                int n15 = b8.c() - b4.c();
                                int n16 = b6.a.a(b8.b(b8.c()), n14);
                                b b9 = b4.e(n15, n16);
                                a a5 = b6.a;
                                Objects.requireNonNull((Object)a5);
                                if (n15 >= 0) {
                                    b b10;
                                    if (n16 == 0) {
                                        b10 = a5.c;
                                    } else {
                                        int[] arrn8 = new int[n15 + 1];
                                        arrn8[0] = n16;
                                        b10 = new b(a5, arrn8);
                                    }
                                    b7 = b7.a(b10);
                                    b8 = b8.a(b9);
                                    continue;
                                }
                                throw new IllegalArgumentException();
                            }
                            int[] arrn9 = new b[]{b7, b8}[1].b;
                            int n17 = n2 - arrn9.length;
                            for (int i5 = 0; i5 < n17; ++i5) {
                                arrn[n3 + i5] = 0;
                            }
                            System.arraycopy(arrn9, 0, arrn, n3 + n17, arrn9.length);
                            return;
                        }
                        throw new ArithmeticException();
                    }
                    throw new IllegalArgumentException("Divide by 0");
                }
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        illegalArgumentException = new IllegalArgumentException("No error correction bytes");
        throw illegalArgumentException;
    }
}

