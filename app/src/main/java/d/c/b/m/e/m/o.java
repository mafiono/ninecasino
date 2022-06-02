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

import d.c.b.m.e.m.o;
import d.c.b.m.e.m.v;

public final class o
extends v.d$d$a$b$c {
    public final String a;
    public final String b;
    public final long c;

    public o(String string, String string2, long l4, a a2) {
        this.a = string;
        this.b = string2;
        this.c = l4;
    }

    @Override
    public long a() {
        return this.c;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b$c) {
            v.d$d$a$b$c d$d$a$b$c2 = (v.d$d$a$b$c)object;
            return this.a.equals((Object)d$d$a$b$c2.c()) && this.b.equals((Object)d$d$a$b$c2.b()) && this.c == d$d$a$b$c2.a();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode());
        long l4 = this.c;
        return n2 ^ (int)(l4 ^ l4 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Signal{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", address=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

