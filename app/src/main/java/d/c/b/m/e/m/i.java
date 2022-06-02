/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.i;
import d.c.b.m.e.m.v;

public final class i
extends v.d$c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public i(int n2, String string, int n3, long l4, long l5, boolean bl, int n4, String string2, String string3, a a2) {
        this.a = n2;
        this.b = string;
        this.c = n3;
        this.d = l4;
        this.e = l5;
        this.f = bl;
        this.g = n4;
        this.h = string2;
        this.i = string3;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public long c() {
        return this.e;
    }

    @Override
    public String d() {
        return this.h;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$c) {
            v.d$c d$c2 = (v.d$c)object;
            return this.a == d$c2.a() && this.b.equals((Object)d$c2.e()) && this.c == d$c2.b() && this.d == d$c2.g() && this.e == d$c2.c() && this.f == d$c2.i() && this.g == d$c2.h() && this.h.equals((Object)d$c2.d()) && this.i.equals((Object)d$c2.f());
        }
        return false;
    }

    @Override
    public String f() {
        return this.i;
    }

    @Override
    public long g() {
        return this.d;
    }

    @Override
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 * (1000003 ^ this.a) ^ this.b.hashCode()) ^ this.c);
        long l4 = this.d;
        int n3 = 1000003 * (n2 ^ (int)(l4 ^ l4 >>> 32));
        long l5 = this.e;
        int n4 = 1000003 * (n3 ^ (int)(l5 ^ l5 >>> 32));
        int n5 = this.f ? 1231 : 1237;
        return 1000003 * (1000003 * (1000003 * (n4 ^ n5) ^ this.g) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    @Override
    public boolean i() {
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Device{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", cores=");
        stringBuilder.append(this.c);
        stringBuilder.append(", ram=");
        stringBuilder.append(this.d);
        stringBuilder.append(", diskSpace=");
        stringBuilder.append(this.e);
        stringBuilder.append(", simulator=");
        stringBuilder.append(this.f);
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.h);
        stringBuilder.append(", modelClass=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.i, (String)"}");
    }

    public static final class b
    extends v.d$c$a {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        public v.d$c a() {
            String string = this.a == null ? " arch" : "";
            if (this.b == null) {
                string = d.a.b.a.a.m((String)string, (String)" model");
            }
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" cores");
            }
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" ram");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" diskSpace");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" simulator");
            }
            if (this.g == null) {
                string = d.a.b.a.a.m((String)string, (String)" state");
            }
            if (this.h == null) {
                string = d.a.b.a.a.m((String)string, (String)" manufacturer");
            }
            if (this.i == null) {
                string = d.a.b.a.a.m((String)string, (String)" modelClass");
            }
            if (string.isEmpty()) {
                i i2 = new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
                return i2;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }
    }

}

