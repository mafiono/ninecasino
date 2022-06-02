/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Objects
 */
package d.c.c.a0.z;

import d.c.c.a0.s;
import d.c.c.c0.b;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;
import d.c.c.y;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;

public final class h
extends x<Object> {
    public static final y b = new y(){

        @Override
        public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
            if (a2.a == Object.class) {
                return new h(i2);
            }
            return null;
        }
    };
    public final i a;

    public h(i i2) {
        this.a = i2;
    }

    @Override
    public Object a(d.c.c.c0.a a2) {
        int n2 = a2.n0().ordinal();
        if (n2 != 0) {
            if (n2 != 2) {
                if (n2 != 5) {
                    if (n2 != 6) {
                        if (n2 != 7) {
                            if (n2 == 8) {
                                a2.j0();
                                return null;
                            }
                            throw new IllegalStateException();
                        }
                        return a2.S();
                    }
                    return a2.V();
                }
                return a2.l0();
            }
            s<String, Object> s4 = new s<String, Object>();
            a2.e();
            while (a2.F()) {
                s4.put(a2.h0(), this.a(a2));
            }
            a2.u();
            return s4;
        }
        ArrayList arrayList = new ArrayList();
        a2.a();
        while (a2.F()) {
            arrayList.add(this.a(a2));
        }
        a2.s();
        return arrayList;
    }

    @Override
    public void b(c c3, Object object) {
        if (object == null) {
            c3.F();
            return;
        }
        i i2 = this.a;
        Class class_ = object.getClass();
        Objects.requireNonNull((Object)i2);
        x<Object> x3 = i2.c(new d.c.c.b0.a(class_));
        if (x3 instanceof h) {
            c3.i();
            c3.u();
            return;
        }
        x3.b(c3, object);
    }

}

