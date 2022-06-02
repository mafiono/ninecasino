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
 *  java.util.Objects
 */
package d.c.b.t.p;

import d.c.b.t.p.a;
import d.c.b.t.p.c;
import d.c.b.t.p.d;
import java.util.Objects;

public final class a
extends d {
    public final String b;
    public final c.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public a(String string, c.a a2, String string2, String string3, long l4, long l5, String string4, a a3) {
        this.b = string;
        this.c = a2;
        this.d = string2;
        this.e = string3;
        this.f = l4;
        this.g = l5;
        this.h = string4;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public long b() {
        return this.f;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.h;
    }

    @Override
    public String e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            String string;
            String string2;
            d d3 = (d)object;
            String string3 = this.b;
            if ((string3 == null ? d3.c() == null : string3.equals(d3.c())) && this.c.equals(d3.f()) && ((string = this.d) == null ? d3.a() == null : string.equals(d3.a())) && ((string2 = this.e) == null ? d3.e() == null : string2.equals(d3.e())) && this.f == d3.b() && this.g == d3.g()) {
                String string4 = this.h;
                String string5 = d3.d();
                return string4 == null ? string5 == null : string4.equals(string5);
            }
            return false;
        }
        return false;
    }

    @Override
    public c.a f() {
        return this.c;
    }

    @Override
    public long g() {
        return this.g;
    }

    public int hashCode() {
        String string = this.b;
        int n2 = string == null ? 0 : string.hashCode();
        int n3 = 1000003 * (1000003 * (n2 ^ 1000003) ^ this.c.hashCode());
        String string2 = this.d;
        int n4 = string2 == null ? 0 : string2.hashCode();
        int n5 = 1000003 * (n3 ^ n4);
        String string3 = this.e;
        int n6 = string3 == null ? 0 : string3.hashCode();
        int n7 = 1000003 * (n5 ^ n6);
        long l4 = this.f;
        int n8 = 1000003 * (n7 ^ (int)(l4 ^ l4 >>> 32));
        long l5 = this.g;
        int n10 = 1000003 * (n8 ^ (int)(l5 ^ l5 >>> 32));
        String string4 = this.h;
        int n11 = string4 == null ? 0 : string4.hashCode();
        return n10 ^ n11;
    }

    @Override
    public d.a k() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"PersistedInstallationEntry{firebaseInstallationId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", registrationStatus=");
        stringBuilder.append(this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.e);
        stringBuilder.append(", expiresInSecs=");
        stringBuilder.append(this.f);
        stringBuilder.append(", tokenCreationEpochInSecs=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fisError=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.h, (String)"}");
    }

    public static final class b
    extends d.a {
        public String a;
        public c.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public b() {
        }

        public b(d d3, a a2) {
            a a3 = (a)d3;
            this.a = a3.b;
            this.b = a3.c;
            this.c = a3.d;
            this.d = a3.e;
            this.e = a3.f;
            this.f = a3.g;
            this.g = a3.h;
        }

        @Override
        public d a() {
            String string = this.b == null ? " registrationStatus" : "";
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" expiresInSecs");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" tokenCreationEpochInSecs");
            }
            if (string.isEmpty()) {
                a a2 = new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
                return a2;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        @Override
        public d.a b(c.a a2) {
            Objects.requireNonNull(a2, "Null registrationStatus");
            this.b = a2;
            return this;
        }

        public d.a c(long l4) {
            this.e = l4;
            return this;
        }

        public d.a d(long l4) {
            this.f = l4;
            return this;
        }
    }

}

