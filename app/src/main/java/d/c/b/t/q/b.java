/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.t.q;

import d.c.b.t.q.b;
import d.c.b.t.q.f;

public final class b
extends f {
    public final String a;
    public final long b;
    public final f.b c;

    public b(String string, long l4, f.b b3, a a2) {
        this.a = string;
        this.b = l4;
        this.c = b3;
    }

    @Override
    public f.b b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            f f2 = (f)object;
            String string = this.a;
            if ((string == null ? f2.c() == null : string.equals(f2.c())) && this.b == f2.d()) {
                f.b b3 = this.c;
                f.b b4 = f2.b();
                return b3 == null ? b4 == null : b3.equals(b4);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n2 = string == null ? 0 : string.hashCode();
        int n3 = 1000003 * (n2 ^ 1000003);
        long l4 = this.b;
        int n4 = 1000003 * (n3 ^ (int)(l4 ^ l4 >>> 32));
        f.b b3 = this.c;
        int n5 = b3 == null ? 0 : b3.hashCode();
        return n4 ^ n5;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"TokenResult{token=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tokenExpirationTimestamp=");
        stringBuilder.append(this.b);
        stringBuilder.append(", responseCode=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends f.a {
        public String a;
        public Long b;
        public f.b c;

        @Override
        public f a() {
            String string = this.b == null ? " tokenExpirationTimestamp" : "";
            if (string.isEmpty()) {
                b b3 = new b(this.a, this.b, this.c, null);
                return b3;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        @Override
        public f.a b(long l4) {
            this.b = l4;
            return this;
        }
    }

}

