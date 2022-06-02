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

import d.c.b.m.e.m.n;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class n
extends v.d$d$a$b$b {
    public final String a;
    public final String b;
    public final w<v.d$d$a$b$d$a> c;
    public final v.d$d$a$b$b d;
    public final int e;

    public n(String string, String string2, w w3, v.d$d$a$b$b d$d$a$b$b2, int n2, a a2) {
        this.a = string;
        this.b = string2;
        this.c = w3;
        this.d = d$d$a$b$b2;
        this.e = n2;
    }

    @Override
    public v.d$d$a$b$b a() {
        return this.d;
    }

    @Override
    public w<v.d$d$a$b$d$a> b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public String d() {
        return this.b;
    }

    @Override
    public String e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b$b) {
            v.d$d$a$b$b d$d$a$b$b2;
            String string;
            v.d$d$a$b$b d$d$a$b$b3 = (v.d$d$a$b$b)object;
            return this.a.equals((Object)d$d$a$b$b3.e()) && ((string = this.b) == null ? d$d$a$b$b3.d() == null : string.equals((Object)d$d$a$b$b3.d())) && this.c.equals(d$d$a$b$b3.b()) && ((d$d$a$b$b2 = this.d) == null ? d$d$a$b$b3.a() == null : d$d$a$b$b2.equals((Object)d$d$a$b$b3.a())) && this.e == d$d$a$b$b3.c();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        String string = this.b;
        int n3 = string == null ? 0 : string.hashCode();
        int n4 = 1000003 * (1000003 * (n2 ^ n3) ^ this.c.hashCode());
        v.d$d$a$b$b d$d$a$b$b2 = this.d;
        int n5 = d$d$a$b$b2 == null ? 0 : d$d$a$b$b2.hashCode();
        return 1000003 * (n4 ^ n5) ^ this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Exception{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", reason=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append(this.c);
        stringBuilder.append(", causedBy=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", overflowCount=");
        stringBuilder.append(this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

