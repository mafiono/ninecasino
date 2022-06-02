/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.k.b.d
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.k.b;

import d.c.d.b;
import d.c.d.k.b.d;
import d.c.d.k.b.k;

public class j {
    public static j[] i;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public static {
        j j2 = new j(false, 3, 5, 8, 8, 1);
        j j3 = new j(false, 5, 7, 10, 10, 1);
        j j4 = new j(true, 5, 7, 16, 6, 1);
        j j5 = new j(false, 8, 10, 12, 12, 1);
        j j6 = new j(true, 10, 11, 14, 6, 2);
        j j7 = new j(false, 12, 12, 14, 14, 1);
        j j8 = new j(true, 16, 14, 24, 10, 1);
        j j9 = new j(false, 18, 14, 16, 16, 1);
        j j10 = new j(false, 22, 18, 18, 18, 1);
        j j11 = new j(true, 22, 18, 16, 10, 2);
        j j12 = new j(false, 30, 20, 20, 20, 1);
        j j13 = new j(true, 32, 24, 16, 14, 2);
        j j14 = new j(false, 36, 24, 22, 22, 1);
        j j15 = new j(false, 44, 28, 24, 24, 1);
        j j16 = new j(true, 49, 28, 22, 14, 2);
        j j17 = new j(false, 62, 36, 14, 14, 4);
        j j18 = new j(false, 86, 42, 16, 16, 4);
        j j19 = new j(false, 114, 48, 18, 18, 4);
        j j20 = new j(false, 144, 56, 20, 20, 4);
        j j21 = new j(false, 174, 68, 22, 22, 4);
        j j22 = new j(false, 204, 84, 24, 24, 4, 102, 42);
        j j23 = new j(false, 280, 112, 14, 14, 16, 140, 56);
        j j24 = new j(false, 368, 144, 16, 16, 16, 92, 36);
        j j25 = new j(false, 456, 192, 18, 18, 16, 114, 48);
        j j26 = new j(false, 576, 224, 20, 20, 16, 144, 56);
        j j27 = new j(false, 696, 272, 22, 22, 16, 174, 68);
        j j28 = new j(false, 816, 336, 24, 24, 16, 136, 56);
        j j29 = new j(false, 1050, 408, 18, 18, 36, 175, 68);
        j j30 = new j(false, 1304, 496, 20, 20, 36, 163, 62);
        j[] arrj = new j[]{j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, new d()};
        i = arrj;
    }

    public j(boolean bl, int n2, int n3, int n4, int n5, int n6) {
        this(bl, n2, n3, n4, n5, n6, n2, n3);
    }

    public j(boolean bl, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.a = bl;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
        this.h = n8;
    }

    public static j i(int n2, k k2, b b2, b b3, boolean bl) {
        IllegalArgumentException illegalArgumentException;
        for (j j2 : i) {
            if (k2 == k.f && j2.a || k2 == k.g && !j2.a || b2 != null && (j2.g() < 0 || j2.f() < 0) || b3 != null && (j2.g() > 0 || j2.f() > 0) || n2 > j2.b) continue;
            return j2;
        }
        if (!bl) {
            return null;
        }
        illegalArgumentException = new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(n2)));
        throw illegalArgumentException;
    }

    public int a(int n2) {
        return this.g;
    }

    public final int b() {
        int n2 = this.f;
        int n3 = 1;
        if (n2 != n3 && n2 != (n3 = 2) && n2 != 4) {
            if (n2 != 16) {
                if (n2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
            return 4;
        }
        return n3;
    }

    public int c() {
        return this.b / this.g;
    }

    public final int d() {
        return this.h() * this.e;
    }

    public final int e() {
        return this.b() * this.d;
    }

    public final int f() {
        return this.d() + (this.h() << 1);
    }

    public final int g() {
        return this.e() + (this.b() << 1);
    }

    public final int h() {
        int n2 = this.f;
        if (n2 != 1 && n2 != 2) {
            if (n2 != 4) {
                if (n2 != 16) {
                    if (n2 == 36) {
                        return 6;
                    }
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.a ? "Rectangular Symbol:" : "Square Symbol:";
        stringBuilder.append(string);
        stringBuilder.append(" data region ");
        stringBuilder.append(this.d);
        stringBuilder.append('x');
        stringBuilder.append(this.e);
        stringBuilder.append(", symbol size ");
        stringBuilder.append(this.g());
        stringBuilder.append('x');
        stringBuilder.append(this.f());
        stringBuilder.append(", symbol data size ");
        stringBuilder.append(this.e());
        stringBuilder.append('x');
        stringBuilder.append(this.d());
        stringBuilder.append(", codewords ");
        stringBuilder.append(this.b);
        stringBuilder.append('+');
        stringBuilder.append(this.c);
        return stringBuilder.toString();
    }
}

