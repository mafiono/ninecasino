/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.n
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.i.e;

import d.a.b.a.a;
import d.c.a.b.i.e.n;

public final class h
extends n {
    public final long a;

    public h(long l2) {
        this.a = l2;
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof n) {
            n n2 = (n)object;
            return this.a == n2.b();
        }
        return false;
    }

    public int hashCode() {
        long l2 = this.a;
        return 1000003 ^ (int)(l2 ^ l2 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"LogResponse{nextRequestWaitMillis=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

