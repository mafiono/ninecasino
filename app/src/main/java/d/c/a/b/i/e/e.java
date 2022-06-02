/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.a
 *  d.c.a.b.i.e.e$a
 *  d.c.a.b.i.e.k
 *  d.c.a.b.i.e.k$a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.i.e;

import d.c.a.b.i.e.e;
import d.c.a.b.i.e.k;

public final class e
extends k {
    public final k.a a;
    public final d.c.a.b.i.e.a b;

    public e(k.a a2, d.c.a.b.i.e.a a3, a a4) {
        this.a = a2;
        this.b = a3;
    }

    public d.c.a.b.i.e.a a() {
        return this.b;
    }

    public k.a b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof k) {
            k k2 = (k)object;
            k.a a2 = this.a;
            if (a2 == null ? k2.b() == null : a2.equals((Object)k2.b())) {
                d.c.a.b.i.e.a a3 = this.b;
                d.c.a.b.i.e.a a4 = k2.a();
                return a3 == null ? a4 == null : a3.equals((Object) a4);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.a a2 = this.a;
        int n2 = a2 == null ? 0 : a2.hashCode();
        int n3 = 1000003 * (n2 ^ 1000003);
        d.c.a.b.i.e.a a3 = this.b;
        int n4 = a3 == null ? 0 : a3.hashCode();
        return n3 ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"ClientInfo{clientType=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", androidClientInfo=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

