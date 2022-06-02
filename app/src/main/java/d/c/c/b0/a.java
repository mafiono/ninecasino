/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.Objects
 */
package d.c.c.b0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

public class a<T> {
    public final Class<? super T> a;
    public final Type b;
    public final int c;

    public a() {
        Type type = a.class.getGenericSuperclass();
        if (!(type instanceof Class)) {
            Type type2;
            this.b = type2 = d.c.c.a0.a.a(((ParameterizedType)type).getActualTypeArguments()[0]);
            this.a = d.c.c.a0.a.e(type2);
            this.c = type2.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public a(Type type) {
        Type type2;
        Objects.requireNonNull((Object)type);
        this.b = type2 = d.c.c.a0.a.a(type);
        this.a = d.c.c.a0.a.e(type2);
        this.c = type2.hashCode();
    }

    public final boolean equals(Object object) {
        return object instanceof a && d.c.c.a0.a.c(this.b, ((a)object).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return d.c.c.a0.a.i(this.b);
    }
}

