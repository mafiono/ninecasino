/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.f
 *  d.c.a.b.j.q.a$a
 *  d.c.a.b.j.q.f
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d.c.a.b.j.q;

import d.c.a.b.j.q.a;
import d.c.a.b.j.q.f;
import java.util.Arrays;

public final class a
extends f {
    public final Iterable<d.c.a.b.j.f> a;
    public final byte[] b;

    public a(Iterable iterable, byte[] arrby, a a2) {
        this.a = iterable;
        this.b = arrby;
    }

    public Iterable<d.c.a.b.j.f> a() {
        return this.a;
    }

    public byte[] b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            byte[] arrby;
            byte[] arrby2;
            f f2 = (f)object;
            return this.a.equals((Object)f2.a()) && Arrays.equals(arrby = this.b, arrby2 = f2 instanceof a ? ((a)f2).b : f2.b());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"BackendRequest{events=");
        stringBuilder.append(this.a);
        stringBuilder.append(", extras=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

