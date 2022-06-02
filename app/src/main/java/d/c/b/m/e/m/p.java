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

import d.c.b.m.e.m.p;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class p
extends v.d$d$a$b$d {
    public final String a;
    public final int b;
    public final w<v.d$d$a$b$d$a> c;

    public p(String string, int n2, w w3, a a2) {
        this.a = string;
        this.b = n2;
        this.c = w3;
    }

    @Override
    public w<v.d$d$a$b$d$a> a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public String c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b$d) {
            v.d$d$a$b$d d$d$a$b$d2 = (v.d$d$a$b$d)object;
            return this.a.equals((Object)d$d$a$b$d2.c()) && this.b == d$d$a$b$d2.b() && this.c.equals(d$d$a$b$d2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Thread{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", importance=");
        stringBuilder.append(this.b);
        stringBuilder.append(", frames=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

