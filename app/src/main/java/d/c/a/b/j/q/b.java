/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.q.g
 *  d.c.a.b.j.q.g$a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.b.j.q;

import d.a.b.a.a;
import d.c.a.b.j.q.g;
import java.util.Objects;

public final class b
extends g {
    public final g.a a;
    public final long b;

    public b(g.a a2, long l2) {
        Objects.requireNonNull(a2, "Null status");
        this.a = a2;
        this.b = l2;
    }

    public long b() {
        return this.b;
    }

    public g.a c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            return this.a.equals((Object)g2.c()) && this.b == g2.b();
        }
        return false;
    }

    public int hashCode() {
        int n2 = 1000003 * (1000003 ^ this.a.hashCode());
        long l2 = this.b;
        return n2 ^ (int)(l2 ^ l2 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"BackendResponse{status=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", nextRequestWaitMillis=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

