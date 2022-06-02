/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Type
 *  java.lang.reflect.TypeVariable
 */
package d.c.c.a0.z;

import d.c.c.a0.z.j;
import d.c.c.b0.a;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class n<T>
extends x<T> {
    public final i a;
    public final x<T> b;
    public final Type c;

    public n(i i2, x<T> x3, Type type) {
        this.a = i2;
        this.b = x3;
        this.c = type;
    }

    @Override
    public T a(d.c.c.c0.a a2) {
        return this.b.a(a2);
    }

    @Override
    public void b(c c3, T t6) {
        x<T> x3;
        x<T> x4 = this.b;
        Type type = this.c;
        if (t6 != null && (type == Object.class || type instanceof TypeVariable || type instanceof Class)) {
            type = t6.getClass();
        }
        if (type != this.c && (x4 = this.a.c(new a(type))) instanceof j.a && !((x3 = this.b) instanceof j.a)) {
            x4 = x3;
        }
        x4.b(c3, t6);
    }
}

