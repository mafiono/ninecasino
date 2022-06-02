/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.k;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class k
extends v.d$d$a {
    public final v.d$d$a$b a;
    public final w<v.b> b;
    public final Boolean c;
    public final int d;

    public k(v.d$d$a$b d$d$a$b2, w w3, Boolean bl, int n2, a a2) {
        this.a = d$d$a$b2;
        this.b = w3;
        this.c = bl;
        this.d = n2;
    }

    @Override
    public Boolean a() {
        return this.c;
    }

    @Override
    public w<v.b> b() {
        return this.b;
    }

    @Override
    public v.d$d$a$b c() {
        return this.a;
    }

    @Override
    public int d() {
        return this.d;
    }

    public v.d$d$a$a e() {
        return new b(this, null);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a) {
            Boolean bl;
            w<v.b> w3;
            v.d$d$a d$d$a2 = (v.d$d$a)object;
            return this.a.equals((Object)d$d$a2.c()) && ((w3 = this.b) == null ? d$d$a2.b() == null : w3.equals(d$d$a2.b())) && ((bl = this.c) == null ? d$d$a2.a() == null : bl.equals((Object)d$d$a2.a())) && this.d == d$d$a2.d();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        w<v.b> w3 = this.b;
        int n3 = w3 == null ? 0 : w3.hashCode();
        int n4 = 1000003 * (n2 ^ n3);
        Boolean bl = this.c;
        int n5 = bl == null ? 0 : bl.hashCode();
        return 1000003 * (n4 ^ n5) ^ this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Application{execution=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", customAttributes=");
        stringBuilder.append(this.b);
        stringBuilder.append(", background=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uiOrientation=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends v.d$d$a$a {
        public v.d$d$a$b a;
        public w<v.b> b;
        public Boolean c;
        public Integer d;

        public b() {
        }

        public b(v.d$d$a d$d$a2, a a2) {
            k k4 = (k)d$d$a2;
            this.a = k4.a;
            this.b = k4.b;
            this.c = k4.c;
            this.d = k4.d;
        }

        public v.d$d$a a() {
            String string = this.a == null ? " execution" : "";
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" uiOrientation");
            }
            if (string.isEmpty()) {
                k k4 = new k(this.a, this.b, this.c, this.d, null);
                return k4;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }
    }

}

