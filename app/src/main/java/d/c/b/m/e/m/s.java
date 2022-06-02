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

import d.c.b.m.e.m.s;
import d.c.b.m.e.m.v;

public final class s
extends v.d$d$c {
    public final String a;

    public s(String string, a a2) {
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
        if (object instanceof v.d$d$c) {
            v.d$d$c d$d$c2 = (v.d$d$c)object;
            return this.a.equals((Object)d$d$c2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public String toString() {
        return d.a.b.a.a.o((StringBuilder)d.a.b.a.a.d((String)"Log{content="), (String)this.a, (String)"}");
    }
}

