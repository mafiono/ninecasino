/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.c
 *  d.c.a.b.d
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package d.c.a.b;

import d.c.a.b.c;
import d.c.a.b.d;
import java.util.Objects;

public final class a<T>
extends c<T> {
    public final T a;
    public final d b;

    public a(Integer n2, T t2, d d2) {
        Objects.requireNonNull(t2, "Null payload");
        this.a = t2;
        Objects.requireNonNull(d2, "Null priority");
        this.b = d2;
    }

    public Integer a() {
        return null;
    }

    public T b() {
        return this.a;
    }

    public d c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof c) {
            c c2 = (c)object;
            return c2.a() == null && this.a.equals(c2.b()) && this.b.equals((Object)c2.c());
        }
        return false;
    }

    public int hashCode() {
        return 1000003 * (-721379959 ^ this.a.hashCode()) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{code=");
        stringBuilder.append(null);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.a);
        stringBuilder.append(", priority=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

