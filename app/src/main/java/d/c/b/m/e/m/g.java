/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.m;

import d.c.b.m.e.m.g;
import d.c.b.m.e.m.v;

public final class g
extends v.d$a {
    public final String a;
    public final String b;
    public final String c;
    public final v.d$a$a d;
    public final String e;
    public final String f;
    public final String g;

    public g(String string, String string2, String string3, v.d$a$a d$a$a2, String string4, String string5, String string6, a a2) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = null;
        this.e = string4;
        this.f = string5;
        this.g = string6;
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
        return this.a;
    }

    @Override
    public String e() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$a) {
            String string;
            String string2;
            v.d$a$a d$a$a2;
            String string3;
            v.d$a d$a2 = (v.d$a)object;
            if (this.a.equals((Object)d$a2.d()) && this.b.equals((Object)d$a2.g()) && ((string2 = this.c) == null ? d$a2.c() == null : string2.equals((Object)d$a2.c())) && ((d$a$a2 = this.d) == null ? d$a2.f() == null : d$a$a2.equals((Object)d$a2.f())) && ((string3 = this.e) == null ? d$a2.e() == null : string3.equals((Object)d$a2.e())) && ((string = this.f) == null ? d$a2.a() == null : string.equals((Object)d$a2.a()))) {
                String string4 = this.g;
                String string5 = d$a2.b();
                return string4 == null ? string5 == null : string4.equals(string5);
            }
            return false;
        }
        return false;
    }

    @Override
    public v.d$a$a f() {
        return this.d;
    }

    @Override
    public String g() {
        return this.b;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode());
        String string = this.c;
        int n3 = string == null ? 0 : string.hashCode();
        int n4 = 1000003 * (n2 ^ n3);
        v.d$a$a d$a$a2 = this.d;
        int n5 = d$a$a2 == null ? 0 : d$a$a2.hashCode();
        int n6 = 1000003 * (n4 ^ n5);
        String string2 = this.e;
        int n7 = string2 == null ? 0 : string2.hashCode();
        int n8 = 1000003 * (n6 ^ n7);
        String string3 = this.f;
        int n10 = string3 == null ? 0 : string3.hashCode();
        int n11 = 1000003 * (n8 ^ n10);
        String string4 = this.g;
        int n12 = string4 == null ? 0 : string4.hashCode();
        return n11 ^ n12;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Application{identifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", version=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayVersion=");
        stringBuilder.append(this.c);
        stringBuilder.append(", organization=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", installationUuid=");
        stringBuilder.append(this.e);
        stringBuilder.append(", developmentPlatform=");
        stringBuilder.append(this.f);
        stringBuilder.append(", developmentPlatformVersion=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.g, (String)"}");
    }
}

