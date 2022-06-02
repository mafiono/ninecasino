/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d.c.d.j;

import java.util.Arrays;

public final class b
implements Cloneable {
    public final int e;
    public final int f;
    public final int g;
    public final int[] h;

    public b(int n2, int n3) {
        if (n2 > 0 && n3 > 0) {
            int n4;
            this.e = n2;
            this.f = n3;
            this.g = n4 = (n2 + 31) / 32;
            this.h = new int[n4 * n3];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public b(int n2, int n3, int n4, int[] arrn) {
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.h = arrn;
    }

    public boolean b(int n2, int n3) {
        int n4 = n3 * this.g + n2 / 32;
        return (1 & this.h[n4] >>> (n2 & 31)) != 0;
    }

    public void c(int n2, int n3) {
        int n4 = n3 * this.g + n2 / 32;
        int[] arrn = this.h;
        arrn[n4] = arrn[n4] | 1 << (n2 & 31);
    }

    public Object clone() {
        return new b(this.e, this.f, this.g, this.h.clone());
    }

    public void d(int n2, int n3, int n4, int n5) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n2 >= 0) {
            if (n5 > 0 && n4 > 0) {
                int n6 = n4 + n2;
                int n7 = n5 + n3;
                if (n7 <= this.f && n6 <= this.e) {
                    while (n3 < n7) {
                        int n8 = n3 * this.g;
                        for (int i2 = n2; i2 < n6; ++i2) {
                            int[] arrn = this.h;
                            int n9 = n8 + i2 / 32;
                            arrn[n9] = arrn[n9] | 1 << (i2 & 31);
                        }
                        ++n3;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        illegalArgumentException = new IllegalArgumentException("Left and top must be nonnegative");
        throw illegalArgumentException;
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        return this.e == b2.e && this.f == b2.f && this.g == b2.g && Arrays.equals(this.h, b2.h);
    }

    public int hashCode() {
        int n2 = this.e;
        return 31 * (31 * (31 * (n2 + n2 * 31) + this.f) + this.g) + Arrays.hashCode(this.h);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.f * (1 + this.e));
        for (int i2 = 0; i2 < this.f; ++i2) {
            for (int i3 = 0; i3 < this.e; ++i3) {
                String string = this.b(i3, i2) ? "X " : "  ";
                stringBuilder.append(string);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

