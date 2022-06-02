/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.i$a
 *  d.c.a.b.i.e.o
 *  d.c.a.b.i.e.o$a
 *  d.c.a.b.i.e.o$b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.i.e;

import d.c.a.b.i.e.i;
import d.c.a.b.i.e.o;

public final class i
extends o {
    public final o.b a;
    public final o.a b;

    public i(o.b b2, o.a a2, a a3) {
        this.a = b2;
        this.b = a2;
    }

    public o.a a() {
        return this.b;
    }

    public o.b b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof o) {
            o o2 = (o)object;
            o.b b2 = this.a;
            if (b2 == null ? o2.b() == null : b2.equals((Object)o2.b())) {
                o.a a2 = this.b;
                o.a a3 = o2.a();
                return a2 == null ? a3 == null : a2.equals((Object) a3);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.b b2 = this.a;
        int n2 = b2 == null ? 0 : b2.hashCode();
        int n3 = 1000003 * (n2 ^ 1000003);
        o.a a2 = this.b;
        int n4 = a2 == null ? 0 : a2.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"NetworkConnectionInfo{networkType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", mobileSubtype=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

