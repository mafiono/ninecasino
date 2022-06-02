/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.r;
import d.c.b.m.e.m.v;

public final class r
extends v.d$d$b {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public r(Double d3, int n2, boolean bl, int n3, long l4, long l5, a a2) {
        this.a = d3;
        this.b = n2;
        this.c = bl;
        this.d = n3;
        this.e = l4;
        this.f = l5;
    }

    @Override
    public Double a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public int d() {
        return this.d;
    }

    @Override
    public long e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$b) {
            v.d$d$b d$d$b2 = (v.d$d$b)object;
            Double d3 = this.a;
            return (d3 == null ? d$d$b2.a() == null : d3.equals((Object)d$d$b2.a())) && this.b == d$d$b2.b() && this.c == d$d$b2.f() && this.d == d$d$b2.d() && this.e == d$d$b2.e() && this.f == d$d$b2.c();
        }
        return false;
    }

    @Override
    public boolean f() {
        return this.c;
    }

    public int hashCode() {
        Double d3 = this.a;
        int n2 = d3 == null ? 0 : d3.hashCode();
        int n3 = 1000003 * (1000003 * (n2 ^ 1000003) ^ this.b);
        int n4 = this.c ? 1231 : 1237;
        int n5 = 1000003 * (1000003 * (n3 ^ n4) ^ this.d);
        long l4 = this.e;
        int n6 = 1000003 * (n5 ^ (int)(l4 ^ l4 >>> 32));
        long l5 = this.f;
        return n6 ^ (int)(l5 ^ l5 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Device{batteryLevel=");
        stringBuilder.append(this.a);
        stringBuilder.append(", batteryVelocity=");
        stringBuilder.append(this.b);
        stringBuilder.append(", proximityOn=");
        stringBuilder.append(this.c);
        stringBuilder.append(", orientation=");
        stringBuilder.append(this.d);
        stringBuilder.append(", ramUsed=");
        stringBuilder.append(this.e);
        stringBuilder.append(", diskUsed=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends v.d$d$b$a {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        public v.d$d$b a() {
            String string = this.b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" proximityOn");
            }
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" orientation");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" ramUsed");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" diskUsed");
            }
            if (string.isEmpty()) {
                r r3 = new r(this.a, this.b, this.c, this.d, this.e, this.f, null);
                return r3;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }
    }

}

