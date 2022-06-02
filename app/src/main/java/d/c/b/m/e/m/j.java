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

import d.c.b.m.e.m.j;
import d.c.b.m.e.m.v;

public final class j
extends v.d$d {
    public final long a;
    public final String b;
    public final v.d$d$a c;
    public final v.d$d$b d;
    public final v.d$d$c e;

    public j(long l4, String string, v.d$d$a d$d$a2, v.d$d$b d$d$b2, v.d$d$c d$d$c2, a a2) {
        this.a = l4;
        this.b = string;
        this.c = d$d$a2;
        this.d = d$d$b2;
        this.e = d$d$c2;
    }

    @Override
    public v.d$d$a a() {
        return this.c;
    }

    @Override
    public v.d$d$b b() {
        return this.d;
    }

    @Override
    public v.d$d$c c() {
        return this.e;
    }

    @Override
    public long d() {
        return this.a;
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v.d$d) {
            v.d$d d$d2 = (v.d$d)object;
            if (this.a == d$d2.d() && this.b.equals((Object)d$d2.e()) && this.c.equals((Object)d$d2.a()) && this.d.equals((Object)d$d2.b())) {
                v.d$d$c d$d$c2 = this.e;
                v.d$d$c d$d$c3 = d$d2.c();
                return d$d$c2 == null ? d$d$c3 == null : d$d$c2.equals((Object) d$d$c3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long l4 = this.a;
        int n2 = 1000003 * (1000003 * (1000003 * (1000003 * (1000003 ^ (int)(l4 ^ l4 >>> 32)) ^ this.b.hashCode()) ^ this.c.hashCode()) ^ this.d.hashCode());
        v.d$d$c d$d$c2 = this.e;
        int n3 = d$d$c2 == null ? 0 : d$d$c2.hashCode();
        return n3 ^ n2;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Event{timestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", app=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", device=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", log=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

