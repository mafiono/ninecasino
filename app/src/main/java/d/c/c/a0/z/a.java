/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 *  java.lang.reflect.GenericArrayType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 */
package d.c.c.a0.z;

import d.c.c.a0.z.n;
import d.c.c.c0.b;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;
import d.c.c.y;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class a<E>
extends x<Object> {
    public static final y c = new y(){

        @Override
        public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
            Type type = a2.b;
            boolean bl = type instanceof GenericArrayType;
            if (!(bl || type instanceof Class && ((Class)type).isArray())) {
                return null;
            }
            Object object = bl ? ((GenericArrayType)type).getGenericComponentType() : ((Class)type).getComponentType();
            return new a(i2, i2.c(new d.c.c.b0.a((Type)object)), d.c.c.a0.a.e(object));
        }
    };
    public final Class<E> a;
    public final x<E> b;

    public a(i i2, x<E> x3, Class<E> class_) {
        this.b = new n<E>(i2, x3, class_);
        this.a = class_;
    }

    @Override
    public Object a(d.c.c.c0.a a2) {
        if (a2.n0() == b.m) {
            a2.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.F()) {
            arrayList.add(this.b.a(a2));
        }
        a2.s();
        int n2 = arrayList.size();
        Object object = Array.newInstance(this.a, n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Array.set(object, i2, arrayList.get(i2));
        }
        return object;
    }

    @Override
    public void b(c c3, Object object) {
        if (object == null) {
            c3.F();
            return;
        }
        c3.e();
        int n2 = Array.getLength(object);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2 = Array.get(object, i2);
            this.b.b(c3, object2);
        }
        c3.s();
    }

}

