/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.Arrays
 */
package d.c.d.k.b;

import java.util.Arrays;

public class e {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte[] d;

    public e(CharSequence charSequence, int n2, int n3) {
        this.a = charSequence;
        this.c = n2;
        this.b = n3;
        byte[] arrby = new byte[n2 * n3];
        this.d = arrby;
        Arrays.fill(arrby, (byte)-1);
    }

    public final boolean a(int n2, int n3) {
        return this.d[n2 + n3 * this.c] >= 0;
    }

    public final void b(int n2, int n3, int n4, int n5) {
        char c2;
        boolean bl;
        int n6;
        if (n2 < 0) {
            int n7 = this.b;
            n2 += n7;
            n3 += 4 - (n7 + 4) % 8;
        }
        if (n3 < 0) {
            int n8 = this.c;
            n3 += n8;
            n2 += 4 - (n8 + 4) % 8;
        }
        if (((c2 = this.a.charAt(n4)) & (bl = true) << (n6 = 8 - n5)) == 0) {
            bl = false;
        }
        this.c(n3, n2, bl);
    }

    public final void c(int n2, int n3, boolean bl) {
        this.d[n2 + n3 * this.c] = (byte)(bl ? 1 : 0);
    }

    public final void d(int n2, int n3, int n4) {
        int n5 = n2 - 2;
        int n6 = n3 - 2;
        this.b(n5, n6, n4, 1);
        int n7 = n3 - 1;
        this.b(n5, n7, n4, 2);
        int n8 = n2 - 1;
        this.b(n8, n6, n4, 3);
        this.b(n8, n7, n4, 4);
        this.b(n8, n3, n4, 5);
        this.b(n2, n6, n4, 6);
        this.b(n2, n7, n4, 7);
        this.b(n2, n3, n4, 8);
    }
}

