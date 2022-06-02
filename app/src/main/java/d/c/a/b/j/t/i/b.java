/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.b.j.f
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.i.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.b.j.t.i;

import d.a.b.a.a;
import d.c.a.b.j.f;
import d.c.a.b.j.i;
import d.c.a.b.j.t.i.h;
import java.util.Objects;

public final class b
extends h {
    public final long a;
    public final i b;
    public final f c;

    public b(long l2, i i2, f f2) {
        this.a = l2;
        Objects.requireNonNull((Object)i2, "Null transportContext");
        this.b = i2;
        Objects.requireNonNull((Object)f2, "Null event");
        this.c = f2;
    }

    public f a() {
        return this.c;
    }

    public long b() {
        return this.a;
    }

    public i c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            h h2 = (h)object;
            return this.a == h2.b() && this.b.equals((Object)h2.c()) && this.c.equals((Object)h2.a());
        }
        return false;
    }

    public int hashCode() {
        long l2 = this.a;
        return 1000003 * (1000003 * (1000003 ^ (int)(l2 ^ l2 >>> 32)) ^ this.b.hashCode()) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"PersistedEvent{id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", transportContext=");
        stringBuilder.append(this.b);
        stringBuilder.append(", event=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

