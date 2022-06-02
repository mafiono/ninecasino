/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.t.h.d$a
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.g$a
 *  d.c.a.b.j.t.h.g$a$a
 *  d.c.a.b.j.t.h.g$b
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Set
 */
package d.c.a.b.j.t.h;

import d.c.a.b.j.t.h.d;
import d.c.a.b.j.t.h.g;
import java.util.Set;

public final class d
extends g.a {
    public final long a;
    public final long b;
    public final Set<g.b> c;

    public d(long l2, long l3, Set set, a a2) {
        this.a = l2;
        this.b = l3;
        this.c = set;
    }

    public long b() {
        return this.a;
    }

    public Set<g.b> c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g.a) {
            g.a a2 = (g.a)object;
            return this.a == a2.b() && this.b == a2.d() && this.c.equals((Object)a2.c());
        }
        return false;
    }

    public int hashCode() {
        long l2 = this.a;
        int n2 = 1000003 * (1000003 ^ (int)(l2 ^ l2 >>> 32));
        long l3 = this.b;
        return 1000003 * (n2 ^ (int)(l3 ^ l3 >>> 32)) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"ConfigValue{delta=");
        stringBuilder.append(this.a);
        stringBuilder.append(", maxAllowedDelay=");
        stringBuilder.append(this.b);
        stringBuilder.append(", flags=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends g.a.a {
        public Long a;
        public Long b;
        public Set<g.b> c;

        public g.a a() {
            String string = this.a == null ? " delta" : "";
            if (this.b == null) {
                string = d.a.b.a.a.m((String)string, (String)" maxAllowedDelay");
            }
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" flags");
            }
            if (string.isEmpty()) {
                d d2 = new d(this.a, this.b, this.c, null);
                return d2;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        public g.a.a b(long l2) {
            this.a = l2;
            return this;
        }

        public g.a.a c(long l2) {
            this.b = l2;
            return this;
        }
    }

}

