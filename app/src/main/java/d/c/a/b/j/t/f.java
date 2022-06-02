/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.d
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.g$a
 *  d.c.a.b.j.t.h.g$a$a
 *  d.c.a.b.j.t.h.g$b
 *  e.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 */
package d.c.a.b.j.t;

import d.c.a.b.j.t.h.c;
import d.c.a.b.j.t.h.d;
import d.c.a.b.j.t.h.g;
import e.a.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class f
implements Object<g> {
    public final a<d.c.a.b.j.v.a> a;

    public f(a<d.c.a.b.j.v.a> a2) {
        this.a = a2;
    }

    public Object get() {
        d.c.a.b.j.v.a a2 = (d.c.a.b.j.v.a)this.a.get();
        HashMap hashMap = new HashMap();
        d.c.a.b.d d2 = d.c.a.b.d.e;
        g.a.a a3 = g.a.a();
        a3.b(30000L);
        a3.c(86400000L);
        hashMap.put((Object)d2, (Object)a3.a());
        d.c.a.b.d d3 = d.c.a.b.d.g;
        g.a.a a4 = g.a.a();
        a4.b(1000L);
        a4.c(86400000L);
        hashMap.put((Object)d3, (Object)a4.a());
        d.c.a.b.d d4 = d.c.a.b.d.f;
        g.a.a a5 = g.a.a();
        a5.b(86400000L);
        a5.c(86400000L);
        Object[] arrobject = new g.b[]{g.b.e, g.b.f};
        Set set = Collections.unmodifiableSet(new HashSet(Arrays.asList(arrobject)));
        d.b b2 = (d.b)a5;
        Objects.requireNonNull((Object)set, "Null flags");
        b2.c = set;
        hashMap.put((Object)d4, (Object)b2.a());
        Objects.requireNonNull((Object)a2, "missing required property: clock");
        int n2 = hashMap.keySet().size();
        d.c.a.b.d.values();
        if (n2 >= 3) {
            new HashMap();
            return new c(a2, (Map<d.c.a.b.d, g.a>)hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}

