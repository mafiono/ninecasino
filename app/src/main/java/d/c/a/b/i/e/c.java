/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.a
 *  d.c.a.b.i.e.c$a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.i.e;

import d.c.a.b.i.e.c;

public final class c
extends d.c.a.b.i.e.a {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public c(Integer n2, String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, a a2) {
        this.a = n2;
        this.b = string;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = string6;
        this.h = string7;
        this.i = string8;
        this.j = string9;
        this.k = string10;
        this.l = string11;
    }

    public String a() {
        return this.l;
    }

    public String b() {
        return this.j;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.h;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d.c.a.b.i.e.a) {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            d.c.a.b.i.e.a a2 = (d.c.a.b.i.e.a)object;
            Integer n2 = this.a;
            if ((n2 == null ? a2.l() == null : n2.equals((Object)a2.l())) && ((string3 = this.b) == null ? a2.i() == null : string3.equals((Object)a2.i())) && ((string10 = this.c) == null ? a2.e() == null : string10.equals((Object)a2.e())) && ((string = this.d) == null ? a2.c() == null : string.equals((Object)a2.c())) && ((string5 = this.e) == null ? a2.k() == null : string5.equals((Object)a2.k())) && ((string9 = this.f) == null ? a2.j() == null : string9.equals((Object)a2.j())) && ((string2 = this.g) == null ? a2.g() == null : string2.equals((Object)a2.g())) && ((string8 = this.h) == null ? a2.d() == null : string8.equals((Object)a2.d())) && ((string6 = this.i) == null ? a2.f() == null : string6.equals((Object)a2.f())) && ((string4 = this.j) == null ? a2.b() == null : string4.equals((Object)a2.b())) && ((string7 = this.k) == null ? a2.h() == null : string7.equals((Object)a2.h()))) {
                String string11 = this.l;
                String string12 = a2.a();
                return string11 == null ? string12 == null : string11.equals(string12);
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.g;
    }

    public String h() {
        return this.k;
    }

    public int hashCode() {
        Integer n2 = this.a;
        int n3 = n2 == null ? 0 : n2.hashCode();
        int n4 = 1000003 * (n3 ^ 1000003);
        String string = this.b;
        int n5 = string == null ? 0 : string.hashCode();
        int n6 = 1000003 * (n4 ^ n5);
        String string2 = this.c;
        int n7 = string2 == null ? 0 : string2.hashCode();
        int n8 = 1000003 * (n6 ^ n7);
        String string3 = this.d;
        int n9 = string3 == null ? 0 : string3.hashCode();
        int n10 = 1000003 * (n8 ^ n9);
        String string4 = this.e;
        int n11 = string4 == null ? 0 : string4.hashCode();
        int n12 = 1000003 * (n10 ^ n11);
        String string5 = this.f;
        int n13 = string5 == null ? 0 : string5.hashCode();
        int n14 = 1000003 * (n12 ^ n13);
        String string6 = this.g;
        int n15 = string6 == null ? 0 : string6.hashCode();
        int n16 = 1000003 * (n14 ^ n15);
        String string7 = this.h;
        int n17 = string7 == null ? 0 : string7.hashCode();
        int n18 = 1000003 * (n16 ^ n17);
        String string8 = this.i;
        int n19 = string8 == null ? 0 : string8.hashCode();
        int n20 = 1000003 * (n18 ^ n19);
        String string9 = this.j;
        int n21 = string9 == null ? 0 : string9.hashCode();
        int n22 = 1000003 * (n20 ^ n21);
        String string10 = this.k;
        int n23 = string10 == null ? 0 : string10.hashCode();
        int n24 = 1000003 * (n22 ^ n23);
        String string11 = this.l;
        int n25 = string11 == null ? 0 : string11.hashCode();
        return n24 ^ n25;
    }

    public String i() {
        return this.b;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.e;
    }

    public Integer l() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"AndroidClientInfo{sdkVersion=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", hardware=");
        stringBuilder.append(this.c);
        stringBuilder.append(", device=");
        stringBuilder.append(this.d);
        stringBuilder.append(", product=");
        stringBuilder.append(this.e);
        stringBuilder.append(", osBuild=");
        stringBuilder.append(this.f);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.g);
        stringBuilder.append(", fingerprint=");
        stringBuilder.append(this.h);
        stringBuilder.append(", locale=");
        stringBuilder.append(this.i);
        stringBuilder.append(", country=");
        stringBuilder.append(this.j);
        stringBuilder.append(", mccMnc=");
        stringBuilder.append(this.k);
        stringBuilder.append(", applicationBuild=");
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)this.l, (String)"}");
    }
}

