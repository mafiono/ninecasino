/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.b;
import d.c.b.m.e.m.v;

public final class b
extends v {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final v.d h;
    public final v.c i;

    public b(String string, String string2, int n2, String string3, String string4, String string5, v.d d3, v.c c3, a a2) {
        this.b = string;
        this.c = string2;
        this.d = n2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = d3;
        this.i = c3;
    }

    @Override
    public String a() {
        return this.f;
    }

    @Override
    public String b() {
        return this.g;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.e;
    }

    @Override
    public v.c e() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v) {
            v.d d3;
            v v3 = (v)object;
            if (this.b.equals(v3.g()) && this.c.equals(v3.c()) && this.d == v3.f() && this.e.equals(v3.d()) && this.f.equals(v3.a()) && this.g.equals(v3.b()) && ((d3 = this.h) == null ? v3.h() == null : d3.equals(v3.h()))) {
                v.c c3 = this.i;
                v.c c4 = v3.e();
                return c3 == null ? c4 == null : c3.equals(c4);
            }
            return false;
        }
        return false;
    }

    @Override
    public int f() {
        return this.d;
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public v.d h() {
        return this.h;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 * (1000003 * (1000003 * (1000003 * (1000003 ^ this.b.hashCode()) ^ this.c.hashCode()) ^ this.d) ^ this.e.hashCode()) ^ this.f.hashCode()) ^ this.g.hashCode());
        v.d d3 = this.h;
        int n3 = d3 == null ? 0 : d3.hashCode();
        int n4 = 1000003 * (n2 ^ n3);
        v.c c3 = this.i;
        int n5 = c3 == null ? 0 : c3.hashCode();
        return n4 ^ n5;
    }

    @Override
    public v.a i() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"CrashlyticsReport{sdkVersion=");
        stringBuilder.append(this.b);
        stringBuilder.append(", gmpAppId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", platform=");
        stringBuilder.append(this.d);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", buildVersion=");
        stringBuilder.append(this.f);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.g);
        stringBuilder.append(", session=");
        stringBuilder.append(this.h);
        stringBuilder.append(", ndkPayload=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends v.a {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public v.d g;
        public v.c h;

        public b() {
        }

        public b(v v3, a a2) {
            b b3 = (b)v3;
            this.a = b3.b;
            this.b = b3.c;
            this.c = b3.d;
            this.d = b3.e;
            this.e = b3.f;
            this.f = b3.g;
            this.g = b3.h;
            this.h = b3.i;
        }

        @Override
        public v a() {
            String string = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                string = d.a.b.a.a.m((String)string, (String)" gmpAppId");
            }
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" platform");
            }
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" installationUuid");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" buildVersion");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" displayVersion");
            }
            if (string.isEmpty()) {
                b b3 = new b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
                return b3;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }
    }

}

