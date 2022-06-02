/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.i.b.a
 *  d.c.d.i.b.e
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.d.i.b;

import d.c.d.i.b.a;
import d.c.d.i.b.d;
import d.c.d.i.b.e;
import d.c.d.i.b.g;
import java.util.Objects;

public final class f {
    public static final f e = new f(g.b, 0, 0, 0);
    public final int a;
    public final g b;
    public final int c;
    public final int d;

    public f(g g2, int n2, int n3, int n4) {
        this.b = g2;
        this.a = n2;
        this.c = n3;
        this.d = n4;
    }

    public f a(int n2) {
        int n3;
        g g2 = this.b;
        int n4 = this.a;
        int n5 = this.d;
        if (n4 == 4 || n4 == 2) {
            int n6 = d.c[n4][0];
            int n7 = 65535 & n6;
            int n8 = n6 >> 16;
            Objects.requireNonNull((Object)g2);
            e e2 = new e(g2, n7, n8);
            n5 += n8;
            g2 = e2;
            n4 = 0;
        }
        int n9 = (n3 = this.c) != 0 && n3 != 31 ? (n3 == 62 ? 9 : 8) : 18;
        int n10 = n3 + 1;
        f f2 = new f(g2, n4, n10, n5 + n9);
        if (n10 == 2078) {
            f2 = f2.b(n2 + 1);
        }
        return f2;
    }

    public f b(int n2) {
        int n3 = this.c;
        if (n3 == 0) {
            return this;
        }
        g g2 = this.b;
        int n4 = n2 - n3;
        Objects.requireNonNull((Object)g2);
        return new f(new a(g2, n4, n3), this.a, 0, this.d);
    }

    public boolean c(f f2) {
        int n2;
        int n3 = this.d + (d.c[this.a][f2.a] >> 16);
        int n4 = f2.c;
        if (n4 > 0 && ((n2 = this.c) == 0 || n2 > n4)) {
            n3 += 10;
        }
        return n3 <= f2.d;
    }

    public f d(int n2, int n3) {
        int n4 = this.d;
        g g2 = this.b;
        int n5 = this.a;
        if (n2 != n5) {
            int n6 = d.c[n5][n2];
            int n7 = 65535 & n6;
            int n8 = n6 >> 16;
            Objects.requireNonNull((Object)g2);
            e e2 = new e(g2, n7, n8);
            n4 += n8;
            g2 = e2;
        }
        int n9 = n2 == 2 ? 4 : 5;
        Objects.requireNonNull((Object)g2);
        return new f(new e(g2, n3, n9), n2, 0, n4 + n9);
    }

    public f e(int n2, int n3) {
        g g2 = this.b;
        int n4 = this.a;
        int n5 = n4 == 2 ? 4 : 5;
        int n6 = d.e[n4][n2];
        Objects.requireNonNull((Object)g2);
        return new f(new e(new e(g2, n6, n5), n3, 5), this.a, 0, 5 + (n5 + this.d));
    }

    public String toString() {
        Object[] arrobject = new Object[]{d.b[this.a], this.d, this.c};
        return String.format("%s bits=%d bytes=%d", arrobject);
    }
}

