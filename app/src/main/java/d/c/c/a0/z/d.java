/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Type
 */
package d.c.c.a0.z;

import d.c.c.a0.g;
import d.c.c.a0.t;
import d.c.c.a0.z.m;
import d.c.c.i;
import d.c.c.u;
import d.c.c.w;
import d.c.c.x;
import d.c.c.y;
import d.c.c.z.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class d
implements y {
    public final g e;

    public d(g g2) {
        this.e = g2;
    }

    public x<?> a(g g2, i i2, d.c.c.b0.a<?> a2, a a3) {
        x x3;
        Object t6 = g2.a(new d.c.c.b0.a(a3.value())).a();
        if (t6 instanceof x) {
            x3 = (w)t6;
        } else if (t6 instanceof y) {
            x3 = ((y)t6).b(i2, a2);
        } else {
            boolean bl = t6 instanceof u;
            if (!bl && !(t6 instanceof d.c.c.m)) {
                StringBuilder stringBuilder = d.a.b.a.a.d((String)"Invalid attempt to bind an instance of ");
                stringBuilder.append(t6.getClass().getName());
                stringBuilder.append(" as a @JsonAdapter for ");
                stringBuilder.append(a2.toString());
                stringBuilder.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            u u4 = bl ? (u)t6 : null;
            boolean bl2 = t6 instanceof d.c.c.m;
            d.c.c.m m2 = null;
            if (bl2) {
                m2 = (d.c.c.m)t6;
            }
            d.c.c.m m4 = m2;
            x3 = new m(u4, m4, i2, a2, null);
        }
        if (x3 != null && a3.nullSafe()) {
            x3 = new w(x3);
        }
        return x3;
    }

    @Override
    public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
        a a3 = a2.a.getAnnotation(a.class);
        if (a3 == null) {
            return null;
        }
        return this.a(this.e, i2, a2, a3);
    }
}

