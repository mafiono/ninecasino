/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.a$a
 *  d.c.a.b.j.e
 *  d.c.a.b.j.f
 *  d.c.a.b.j.f$a
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.a.b.j;

import d.c.a.b.j.a;
import d.c.a.b.j.e;
import d.c.a.b.j.f;
import java.util.Map;
import java.util.Objects;

public final class a
extends f {
    public final String a;
    public final Integer b;
    public final e c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    public a(String string, Integer n2, e e2, long l2, long l3, Map map, a a2) {
        this.a = string;
        this.b = n2;
        this.c = e2;
        this.d = l2;
        this.e = l3;
        this.f = map;
    }

    public Map<String, String> b() {
        return this.f;
    }

    public Integer c() {
        return this.b;
    }

    public e d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            Integer n2;
            f f2 = (f)object;
            return this.a.equals((Object)f2.g()) && ((n2 = this.b) == null ? f2.c() == null : n2.equals((Object)f2.c())) && this.c.equals((Object)f2.d()) && this.d == f2.e() && this.e == f2.h() && this.f.equals((Object)f2.b());
        }
        return false;
    }

    public String g() {
        return this.a;
    }

    public long h() {
        return this.e;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        Integer n3 = this.b;
        int n4 = n3 == null ? 0 : n3.hashCode();
        int n5 = 1000003 * (1000003 * (n2 ^ n4) ^ this.c.hashCode());
        long l2 = this.d;
        int n6 = 1000003 * (n5 ^ (int)(l2 ^ l2 >>> 32));
        long l3 = this.e;
        return 1000003 * (n6 ^ (int)(l3 ^ l3 >>> 32)) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"EventInternal{transportName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", encodedPayload=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", eventMillis=");
        stringBuilder.append(this.d);
        stringBuilder.append(", uptimeMillis=");
        stringBuilder.append(this.e);
        stringBuilder.append(", autoMetadata=");
        stringBuilder.append(this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends f.a {
        public String a;
        public Integer b;
        public e c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        public f b() {
            String string = this.a == null ? " transportName" : "";
            if (this.c == null) {
                string = d.a.b.a.a.m((String)string, (String)" encodedPayload");
            }
            if (this.d == null) {
                string = d.a.b.a.a.m((String)string, (String)" eventMillis");
            }
            if (this.e == null) {
                string = d.a.b.a.a.m((String)string, (String)" uptimeMillis");
            }
            if (this.f == null) {
                string = d.a.b.a.a.m((String)string, (String)" autoMetadata");
            }
            if (string.isEmpty()) {
                a a2 = new a(this.a, this.b, this.c, this.d, this.e, this.f, null);
                return a2;
            }
            throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
        }

        public Map<String, String> c() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public f.a d(e e2) {
            Objects.requireNonNull(e2, "Null encodedPayload");
            this.c = e2;
            return this;
        }

        public f.a e(long l2) {
            this.d = l2;
            return this;
        }

        public f.a f(String string) {
            Objects.requireNonNull((Object)string, "Null transportName");
            this.a = string;
            return this;
        }

        public f.a g(long l2) {
            this.e = l2;
            return this;
        }
    }

}

