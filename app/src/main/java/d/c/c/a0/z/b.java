/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.lang.reflect.WildcardType
 *  java.util.Collection
 */
package d.c.c.a0.z;

import d.c.c.a0.g;
import d.c.c.a0.t;
import d.c.c.a0.z.n;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;
import d.c.c.y;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class b
implements y {
    public final g e;

    public b(g g2) {
        this.e = g2;
    }

    @Override
    public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
        Type type = a2.b;
        Class class_ = a2.a;
        if (!Collection.class.isAssignableFrom(class_)) {
            return null;
        }
        Type type2 = d.c.c.a0.a.f(type, class_, Collection.class);
        if (type2 instanceof WildcardType) {
            type2 = ((WildcardType)type2).getUpperBounds()[0];
        }
        Type type3 = type2 instanceof ParameterizedType ? ((ParameterizedType)type2).getActualTypeArguments()[0] : Object.class;
        return new a(i2, type3, i2.c(new d.c.c.b0.a(type3)), this.e.a(a2));
    }

    public static final class a<E>
    extends x<Collection<E>> {
        public final x<E> a;
        public final t<? extends Collection<E>> b;

        public a(i i2, Type type, x<E> x3, t<? extends Collection<E>> t6) {
            this.a = new n<E>(i2, x3, type);
            this.b = t6;
        }

        @Override
        public Object a(d.c.c.c0.a a2) {
            if (a2.n0() == d.c.c.c0.b.m) {
                a2.j0();
                return null;
            }
            Collection<E> collection = this.b.a();
            a2.a();
            while (a2.F()) {
                collection.add(this.a.a(a2));
            }
            a2.s();
            return collection;
        }

        @Override
        public void b(c c3, Object object) {
            Collection collection = (Collection)object;
            if (collection == null) {
                c3.F();
                return;
            }
            c3.e();
            for (Object object2 : collection) {
                this.a.b(c3, object2);
            }
            c3.s();
        }
    }

}

