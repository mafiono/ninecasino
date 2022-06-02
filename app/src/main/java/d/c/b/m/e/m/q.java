/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.q;
import d.c.b.m.e.m.v;

public final class q
extends v.d$d$a$b$d$a {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public q(long l4, String string, String string2, long l5, int n2, a a2) {
        this.a = l4;
        this.b = string;
        this.c = string2;
        this.d = l5;
        this.e = n2;
    }

    @Override
    public String a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.e;
    }

    @Override
    public long c() {
        return this.d;
    }

    @Override
    public long d() {
        return this.a;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b$d$a) {
            String string;
            v.d$d$a$b$d$a d$d$a$b$d$a2 = (v.d$d$a$b$d$a)object;
            return this.a == d$d$a$b$d$a2.d() && this.b.equals((Object)d$d$a$b$d$a2.e()) && ((string = this.c) == null ? d$d$a$b$d$a2.a() == null : string.equals((Object)d$d$a$b$d$a2.a())) && this.d == d$d$a$b$d$a2.c() && this.e == d$d$a$b$d$a2.b();
        }
        return false;
    }

    public int hashCode() {
        long l4 = this.a;
        int n2 = 1000003 * (1000003 * (1000003 ^ (int)(l4 ^ l4 >>> 32)) ^ this.b.hashCode());
        String string = this.c;
        int n3 = string == null ? 0 : string.hashCode();
        int n4 = 1000003 * (n2 ^ n3);
        long l5 = this.d;
        return 1000003 * (n4 ^ (int)(l5 ^ l5 >>> 32)) ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Frame{pc=");
        stringBuilder.append(this.a);
        stringBuilder.append(", symbol=");
        stringBuilder.append(this.b);
        stringBuilder.append(", file=");
        stringBuilder.append(this.c);
        stringBuilder.append(", offset=");
        stringBuilder.append(this.d);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends v.d$d$a$b$d$a$a {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        public v.d$d$a$b$d$a a() {
            String string = this.a == null ? " pc" : "";
            if (this.b == null) {
                string = d.a.b.a.a.m((String)string, (String)" symbol");
            }
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" offset");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" importance");
            }
            if (string.isEmpty()) {
                q q4 = new q(this.a, this.b, this.c, this.d, this.e, null);
                return q4;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }
    }

}

