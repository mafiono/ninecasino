/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.d.i.b;

import d.c.d.i.b.g;
import d.c.d.j.a;

public final class e
extends g {
    public final short c;
    public final short d;

    public e(g g2, int n2, int n3) {
        super(g2);
        this.c = (short)n2;
        this.d = (short)n3;
    }

    @Override
    public void a(a a2, byte[] arrby) {
        a2.d(this.c, this.d);
    }

    public String toString() {
        short s4 = this.c;
        short s5 = this.d;
        int n2 = s4 & (1 << s5) - 1 | 1 << s5;
        StringBuilder stringBuilder = new StringBuilder("<");
        stringBuilder.append(Integer.toBinaryString(n2 | 1 << this.d).substring(1));
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

