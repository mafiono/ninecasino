/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.l.j
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package d.c.d.l;

import d.c.d.a;
import d.c.d.c;
import d.c.d.g;
import d.c.d.j.b;
import d.c.d.l.j;
import java.util.Map;

public final class o
implements g {
    public final j a = new j();

    @Override
    public b a(String string, a a2, int n2, int n3, Map<c, ?> map) {
        if (a2 == a.s) {
            return this.a.a("0".concat(String.valueOf(string)), a.l, n2, n3, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(a2)));
    }
}

