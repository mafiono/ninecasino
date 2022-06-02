/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.t.q;

import d.c.b.t.q.a;
import d.c.b.t.q.d;
import d.c.b.t.q.f;

public final class a
extends d {
    public final String a;
    public final String b;
    public final String c;
    public final f d;
    public final d.a e;

    public a(String string, String string2, String string3, f f2, d.a a2, a a3) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = f2;
        this.e = a2;
    }

    @Override
    public f a() {
        return this.d;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.c;
    }

    @Override
    public d.a d() {
        return this.e;
    }

    @Override
    public String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            String string;
            f f2;
            String string2;
            d d3 = (d)object;
            String string3 = this.a;
            if ((string3 == null ? d3.e() == null : string3.equals(d3.e())) && ((string = this.b) == null ? d3.b() == null : string.equals(d3.b())) && ((string2 = this.c) == null ? d3.c() == null : string2.equals(d3.c())) && ((f2 = this.d) == null ? d3.a() == null : f2.equals(d3.a()))) {
                d.a a2 = this.e;
                d.a a3 = d3.d();
                return a2 == null ? a3 == null : a2.equals(a3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n2 = string == null ? 0 : string.hashCode();
        int n3 = 1000003 * (n2 ^ 1000003);
        String string2 = this.b;
        int n4 = string2 == null ? 0 : string2.hashCode();
        int n5 = 1000003 * (n3 ^ n4);
        String string3 = this.c;
        int n6 = string3 == null ? 0 : string3.hashCode();
        int n7 = 1000003 * (n5 ^ n6);
        f f2 = this.d;
        int n8 = f2 == null ? 0 : f2.hashCode();
        int n10 = 1000003 * (n7 ^ n8);
        d.a a2 = this.e;
        int n11 = a2 == null ? 0 : a2.hashCode();
        return n10 ^ n11;
    }

    public String toString() {
        StringBuilder stringBuilder = f.a.b.a.a.d((String)"InstallationResponse{uri=");
        stringBuilder.append(this.a);
        stringBuilder.append(", fid=");
        stringBuilder.append(this.b);
        stringBuilder.append(", refreshToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.d);
        stringBuilder.append(", responseCode=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

