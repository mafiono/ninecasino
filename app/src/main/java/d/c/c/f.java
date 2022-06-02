/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Number
 *  java.lang.Object
 */
package d.c.c;

import d.c.c.c0.a;
import d.c.c.c0.b;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;

public class f
extends x<Number> {
    public f(i i2) {
    }

    @Override
    public Object a(a a2) {
        if (a2.n0() == b.m) {
            a2.j0();
            return null;
        }
        return Float.valueOf((float)a2.V());
    }

    @Override
    public void b(c c3, Object object) {
        Number number = (Number)object;
        if (number == null) {
            c3.F();
            return;
        }
        i.a(number.floatValue());
        c3.h0(number);
    }
}

