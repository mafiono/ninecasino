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

import d.c.b.m.e.m.f;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class f
extends v.d {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final v.d$a f;
    public final v.d$f g;
    public final v.d$e h;
    public final v.d$c i;
    public final w<v.d$d> j;
    public final int k;

    public f(String string, String string2, long l4, Long l5, boolean bl, v.d$a d$a2, v.d$f d$f2, v.d$e d$e2, v.d$c d$c2, w w3, int n2, a a2) {
        this.a = string;
        this.b = string2;
        this.c = l4;
        this.d = l5;
        this.e = bl;
        this.f = d$a2;
        this.g = d$f2;
        this.h = d$e2;
        this.i = d$c2;
        this.j = w3;
        this.k = n2;
    }

    @Override
    public v.d$a a() {
        return this.f;
    }

    @Override
    public v.d$c b() {
        return this.i;
    }

    @Override
    public Long c() {
        return this.d;
    }

    @Override
    public w<v.d$d> d() {
        return this.j;
    }

    @Override
    public String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d) {
            w<v.d$d> w3;
            v.d$c d$c2;
            v.d$f d$f2;
            v.d$e d$e2;
            Long l4;
            v.d d3 = (v.d)object;
            return this.a.equals((Object)d3.e()) && this.b.equals((Object)d3.g()) && this.c == d3.i() && ((l4 = this.d) == null ? d3.c() == null : l4.equals((Object)d3.c())) && this.e == d3.k() && this.f.equals((Object)d3.a()) && ((d$f2 = this.g) == null ? d3.j() == null : d$f2.equals((Object)d3.j())) && ((d$e2 = this.h) == null ? d3.h() == null : d$e2.equals((Object)d3.h())) && ((d$c2 = this.i) == null ? d3.b() == null : d$c2.equals((Object)d3.b())) && ((w3 = this.j) == null ? d3.d() == null : w3.equals(d3.d())) && this.k == d3.f();
        }
        return false;
    }

    @Override
    public int f() {
        return this.k;
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public v.d$e h() {
        return this.h;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode());
        long l4 = this.c;
        int n3 = 1000003 * (n2 ^ (int)(l4 ^ l4 >>> 32));
        Long l5 = this.d;
        int n4 = l5 == null ? 0 : l5.hashCode();
        int n5 = 1000003 * (n3 ^ n4);
        int n6 = this.e ? 1231 : 1237;
        int n7 = 1000003 * (1000003 * (n5 ^ n6) ^ this.f.hashCode());
        v.d$f d$f2 = this.g;
        int n8 = d$f2 == null ? 0 : d$f2.hashCode();
        int n10 = 1000003 * (n7 ^ n8);
        v.d$e d$e2 = this.h;
        int n11 = d$e2 == null ? 0 : d$e2.hashCode();
        int n12 = 1000003 * (n10 ^ n11);
        v.d$c d$c2 = this.i;
        int n13 = d$c2 == null ? 0 : d$c2.hashCode();
        int n14 = 1000003 * (n12 ^ n13);
        w<v.d$d> w3 = this.j;
        int n15 = w3 == null ? 0 : w3.hashCode();
        return 1000003 * (n14 ^ n15) ^ this.k;
    }

    @Override
    public long i() {
        return this.c;
    }

    @Override
    public v.d$f j() {
        return this.g;
    }

    @Override
    public boolean k() {
        return this.e;
    }

    @Override
    public v.d$b l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Session{generator=");
        stringBuilder.append(this.a);
        stringBuilder.append(", identifier=");
        stringBuilder.append(this.b);
        stringBuilder.append(", startedAt=");
        stringBuilder.append(this.c);
        stringBuilder.append(", endedAt=");
        stringBuilder.append(this.d);
        stringBuilder.append(", crashed=");
        stringBuilder.append(this.e);
        stringBuilder.append(", app=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", user=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append(", os=");
        stringBuilder.append((Object)this.h);
        stringBuilder.append(", device=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append(", events=");
        stringBuilder.append(this.j);
        stringBuilder.append(", generatorType=");
        stringBuilder.append(this.k);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends v.d$b {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public v.d$a f;
        public v.d$f g;
        public v.d$e h;
        public v.d$c i;
        public w<v.d$d> j;
        public Integer k;

        public b() {
        }

        public b(v.d d3, a a2) {
            f f2 = (f)d3;
            this.a = f2.a;
            this.b = f2.b;
            this.c = f2.c;
            this.d = f2.d;
            this.e = f2.e;
            this.f = f2.f;
            this.g = f2.g;
            this.h = f2.h;
            this.i = f2.i;
            this.j = f2.j;
            this.k = f2.k;
        }

        @Override
        public v.d a() {
            String string = this.a == null ? " generator" : "";
            if (this.b == null) {
                string = d.a.b.a.a.m((String)string, (String)" identifier");
            }
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" startedAt");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" crashed");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" app");
            }
            if (this.k == null) {
                string = d.a.b.a.a.m((String)string, (String)" generatorType");
            }
            if (string.isEmpty()) {
                f f2 = new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
                return f2;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        public v.d$b b(boolean bl) {
            this.e = bl;
            return this;
        }
    }

}

