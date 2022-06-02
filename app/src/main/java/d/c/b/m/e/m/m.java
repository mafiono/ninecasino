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

import d.c.b.m.e.m.m;
import d.c.b.m.e.m.v;

public final class m
extends v.d$d$a$b$a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public m(long l4, long l5, String string, String string2, a a2) {
        this.a = l4;
        this.b = l5;
        this.c = string;
        this.d = string2;
    }

    @Override
    public long a() {
        return this.a;
    }

    @Override
    public String b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b$a) {
            v.d$d$a$b$a d$d$a$b$a2 = (v.d$d$a$b$a)object;
            if (this.a == d$d$a$b$a2.a() && this.b == d$d$a$b$a2.c() && this.c.equals((Object)d$d$a$b$a2.b())) {
                String string = this.d;
                String string2 = d$d$a$b$a2.d();
                return string == null ? string2 == null : string.equals(string2);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l4 = this.a;
        int n2 = 1000003 * (1000003 ^ (int)(l4 ^ l4 >>> 32));
        long l5 = this.b;
        int n3 = 1000003 * (1000003 * (n2 ^ (int)(l5 ^ l5 >>> 32)) ^ this.c.hashCode());
        String string = this.d;
        int n4 = string == null ? 0 : string.hashCode();
        return n4 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"BinaryImage{baseAddress=");
        stringBuilder.append(this.a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.b);
        stringBuilder.append(", name=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uuid=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.d, (String)"}");
    }
}

