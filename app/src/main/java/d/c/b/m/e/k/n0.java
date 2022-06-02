/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import d.c.b.m.e.s.i.b;

public final class n0
extends Enum<n0> {
    public static final /* enum */ n0 e;
    public static final /* enum */ n0 f;
    public static final /* enum */ n0 g;
    public static final /* synthetic */ n0[] h;

    public static {
        n0 n02;
        n0 n03;
        n0 n04;
        e = n03 = new n0();
        f = n04 = new n0();
        g = n02 = new n0();
        h = new n0[]{n03, n04, n02};
    }

    public static n0 g(b b2) {
        boolean bl = b2.g == 2;
        int n2 = b2.h;
        boolean bl2 = n2 == 2;
        if (!bl) {
            return e;
        }
        if (!bl2) {
            return f;
        }
        return g;
    }

    public static n0 valueOf(String string) {
        return Enum.valueOf(n0.class, string);
    }

    public static n0[] values() {
        return h.clone();
    }
}

