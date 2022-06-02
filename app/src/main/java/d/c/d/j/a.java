/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package d.c.d.j;

import java.util.Arrays;

public final class a
implements Cloneable {
    public int[] e;
    public int f;

    public a() {
        this.f = 0;
        this.e = new int[1];
    }

    public a(int[] arrn, int n2) {
        this.e = arrn;
        this.f = n2;
    }

    public void b(boolean bl) {
        this.e(1 + this.f);
        if (bl) {
            int[] arrn = this.e;
            int n2 = this.f;
            int n3 = n2 / 32;
            arrn[n3] = arrn[n3] | 1 << (n2 & 31);
        }
        this.f = 1 + this.f;
    }

    public void c(a a2) {
        int n2 = a2.f;
        this.e(n2 + this.f);
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b(a2.f(i2));
        }
    }

    public Object clone() {
        return new a(this.e.clone(), this.f);
    }

    public void d(int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        if (n3 >= 0 && n3 <= 32) {
            this.e(n3 + this.f);
            while (n3 > 0) {
                int n4 = n2 >> n3 - 1;
                int n5 = 1;
                if ((n4 & n5) != n5) {
                    n5 = 0;
                }
                this.b((boolean)n5);
                --n3;
            }
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Num bits must be between 0 and 32");
        throw illegalArgumentException;
    }

    public final void e(int n2) {
        int[] arrn = this.e;
        if (n2 > arrn.length << 5) {
            int[] arrn2 = new int[(n2 + 31) / 32];
            System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
            this.e = arrn2;
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        a a2 = (a)object;
        return this.f == a2.f && Arrays.equals(this.e, a2.e);
    }

    public boolean f(int n2) {
        return (this.e[n2 / 32] & 1 << (n2 & 31)) != 0;
    }

    public int g() {
        return (7 + this.f) / 8;
    }

    public int hashCode() {
        return 31 * this.f + Arrays.hashCode(this.e);
    }

    public String toString() {
        int n2 = this.f;
        StringBuilder stringBuilder = new StringBuilder(1 + (n2 + n2 / 8));
        for (int i2 = 0; i2 < this.f; ++i2) {
            if ((i2 & 7) == 0) {
                stringBuilder.append(' ');
            }
            char c2 = this.f(i2) ? 'X' : '.';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

