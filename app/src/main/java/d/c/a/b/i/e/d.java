/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.i.e.j
 *  d.c.a.b.i.e.m
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 */
package d.c.a.b.i.e;

import d.a.b.a.a;
import d.c.a.b.i.e.j;
import d.c.a.b.i.e.m;
import java.util.List;
import java.util.Objects;

public final class d
extends j {
    public final List<m> a;

    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.a = list;
    }

    public List<m> a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof j) {
            j j2 = (j)object;
            return this.a.equals((Object)j2.a());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 ^ this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"BatchedLogRequest{logRequests=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

