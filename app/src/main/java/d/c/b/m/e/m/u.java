/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.u;
import d.c.b.m.e.m.v;

public final class u
extends v.d$f {
    public final String a;

    public u(String string, a a2) {
        this.a = string;
    }

    @Override
    public String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$f) {
            v.d$f d$f2 = (v.d$f)object;
            return this.a.equals((Object)d$f2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public String toString() {
        return d.a.b.a.a.o((StringBuilder)d.a.b.a.a.d((String)"User{identifier="), (String)this.a, (String)"}");
    }
}

