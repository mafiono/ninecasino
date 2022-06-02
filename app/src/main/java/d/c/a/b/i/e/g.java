/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.g$a
 *  d.c.a.b.i.e.k
 *  d.c.a.b.i.e.l
 *  d.c.a.b.i.e.m
 *  d.c.a.b.i.e.p
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package d.c.a.b.i.e;

import d.c.a.b.i.e.g;
import d.c.a.b.i.e.k;
import d.c.a.b.i.e.l;
import d.c.a.b.i.e.m;
import d.c.a.b.i.e.p;
import java.util.List;

public final class g
extends m {
    public final long a;
    public final long b;
    public final k c;
    public final Integer d;
    public final String e;
    public final List<l> f;
    public final p g;

    public g(long l2, long l3, k k2, Integer n2, String string, List list, p p2, a a2) {
        this.a = l2;
        this.b = l3;
        this.c = k2;
        this.d = n2;
        this.e = string;
        this.f = list;
        this.g = p2;
    }

    public k a() {
        return this.c;
    }

    public List<l> b() {
        return this.f;
    }

    public Integer c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    public p e() {
        return this.g;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof m) {
            k k2;
            List<l> list;
            Integer n2;
            String string;
            m m2 = (m)object;
            if (this.a == m2.f() && this.b == m2.g() && ((k2 = this.c) == null ? m2.a() == null : k2.equals((Object)m2.a())) && ((n2 = this.d) == null ? m2.c() == null : n2.equals((Object)m2.c())) && ((string = this.e) == null ? m2.d() == null : string.equals((Object)m2.d())) && ((list = this.f) == null ? m2.b() == null : list.equals((Object)m2.b()))) {
                p p2 = this.g;
                p p3 = m2.e();
                return p2 == null ? p3 == null : p2.equals((Object) p3);
            }
            return false;
        }
        return false;
    }

    public long f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public int hashCode() {
        long l2 = this.a;
        int n2 = 1000003 * (1000003 ^ (int)(l2 ^ l2 >>> 32));
        long l3 = this.b;
        int n3 = 1000003 * (n2 ^ (int)(l3 ^ l3 >>> 32));
        k k2 = this.c;
        int n4 = k2 == null ? 0 : k2.hashCode();
        int n5 = 1000003 * (n3 ^ n4);
        Integer n6 = this.d;
        int n7 = n6 == null ? 0 : n6.hashCode();
        int n8 = 1000003 * (n5 ^ n7);
        String string = this.e;
        int n9 = string == null ? 0 : string.hashCode();
        int n10 = 1000003 * (n8 ^ n9);
        List<l> list = this.f;
        int n11 = list == null ? 0 : list.hashCode();
        int n12 = 1000003 * (n10 ^ n11);
        p p2 = this.g;
        int n13 = p2 == null ? 0 : p2.hashCode();
        return n12 ^ n13;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"LogRequest{requestTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", requestUptimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", clientInfo=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", logSource=");
        stringBuilder.append(this.d);
        stringBuilder.append(", logSourceName=");
        stringBuilder.append(this.e);
        stringBuilder.append(", logEvents=");
        stringBuilder.append(this.f);
        stringBuilder.append(", qosTier=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

