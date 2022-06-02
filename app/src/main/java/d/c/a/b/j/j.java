/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.b
 *  d.c.a.b.e
 *  d.c.a.b.f
 *  d.c.a.b.g
 *  d.c.a.b.j.i
 *  d.c.a.b.j.m
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package d.c.a.b.j;

import d.c.a.b.b;
import d.c.a.b.e;
import d.c.a.b.f;
import d.c.a.b.g;
import d.c.a.b.j.i;
import d.c.a.b.j.l;
import d.c.a.b.j.m;
import java.util.Set;

public final class j
implements g {
    public final Set<b> a;
    public final i b;
    public final m c;

    public j(Set<b> set, i i2, m m2) {
        this.a = set;
        this.b = i2;
        this.c = m2;
    }

    public <T> f<T> a(String string, Class<T> class_, b b2, e<T, byte[]> e2) {
        if (this.a.contains(b2)) {
            l<T> l2 = new l<T>(this.b, string, b2, e2, this.c);
            return l2;
        }
        Object[] arrobject = new Object[]{b2, this.a};
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", arrobject));
    }
}

