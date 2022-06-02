/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.d
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.g$a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.a.b.j.t.h;

import d.a.b.a.a;
import d.c.a.b.d;
import d.c.a.b.j.t.h.g;
import java.util.Map;
import java.util.Objects;

public final class c
extends g {
    public final d.c.a.b.j.v.a a;
    public final Map<d, g.a> b;

    public c(d.c.a.b.j.v.a a2, Map<d, g.a> map) {
        Objects.requireNonNull((Object)a2, "Null clock");
        this.a = a2;
        Objects.requireNonNull(map, "Null values");
        this.b = map;
    }

    public d.c.a.b.j.v.a a() {
        return this.a;
    }

    public Map<d, g.a> c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            return this.a.equals((Object)g2.a()) && this.b.equals((Object)g2.c());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"SchedulerConfig{clock=");
        stringBuilder.append(this.a);
        stringBuilder.append(", values=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

