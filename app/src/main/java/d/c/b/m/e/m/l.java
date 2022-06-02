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

import d.c.b.m.e.m.l;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;

public final class l
extends v.d$d$a$b {
    public final w<v.d$d$a$b$d> a;
    public final v.d$d$a$b$b b;
    public final v.d$d$a$b$c c;
    public final w<v.d$d$a$b$a> d;

    public l(w w3, v.d$d$a$b$b d$d$a$b$b2, v.d$d$a$b$c d$d$a$b$c2, w w5, a a2) {
        this.a = w3;
        this.b = d$d$a$b$b2;
        this.c = d$d$a$b$c2;
        this.d = w5;
    }

    @Override
    public w<v.d$d$a$b$a> a() {
        return this.d;
    }

    @Override
    public v.d$d$a$b$b b() {
        return this.b;
    }

    @Override
    public v.d$d$a$b$c c() {
        return this.c;
    }

    @Override
    public w<v.d$d$a$b$d> d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d$a$b) {
            v.d$d$a$b d$d$a$b2 = (v.d$d$a$b)object;
            return this.a.equals(d$d$a$b2.d()) && this.b.equals((Object)d$d$a$b2.b()) && this.c.equals((Object)d$d$a$b2.c()) && this.d.equals(d$d$a$b2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 * (1000003 * (1000003 ^ this.a.hashCode()) ^ this.b.hashCode()) ^ this.c.hashCode()) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Execution{threads=");
        stringBuilder.append(this.a);
        stringBuilder.append(", exception=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", signal=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", binaries=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

