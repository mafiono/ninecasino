/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.j.d;

import d.c.d.j.d.b;

public final class a {
    public static final a g = new a(4201, 4096, 1);
    public static final a h = new a(1033, 1024, 1);
    public static final a i = new a(67, 64, 1);
    public static final a j = new a(19, 16, 1);
    public static final a k = new a(285, 256, 0);
    public static final a l = new a(301, 256, 1);
    public final int[] a;
    public final int[] b;
    public final b c;
    public final int d;
    public final int e;
    public final int f;

    public a(int n2, int n3, int n4) {
        this.e = n2;
        this.d = n3;
        this.f = n4;
        this.a = new int[n3];
        this.b = new int[n3];
        int n5 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a[i2] = n5;
            if ((n5 <<= 1) < n3) continue;
            n5 = (n5 ^ n2) & n3 - 1;
        }
        int n6 = 0;
        while (n6 < n3 - 1) {
            this.b[this.a[n6]] = n6++;
        }
        this.c = new b(this, new int[]{0});
        new b(this, new int[]{1});
    }

    public int a(int n2, int n3) {
        if (n2 != 0 && n3 != 0) {
            int[] arrn = this.a;
            int[] arrn2 = this.b;
            return arrn[(arrn2[n2] + arrn2[n3]) % (-1 + this.d)];
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        stringBuilder.append(Integer.toHexString(this.e));
        stringBuilder.append(',');
        stringBuilder.append(this.d);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

