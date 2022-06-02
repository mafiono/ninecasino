/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.j.t.i.d
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.a.b.j.t.i;

import d.c.a.b.j.t.i.d;
import java.util.Objects;

public final class g
implements Object<d> {
    public Object get() {
        d d2 = d.a;
        Objects.requireNonNull(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }
}

