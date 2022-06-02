/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.c.a0.a0.a
 *  d.c.c.a0.a0.c
 *  java.lang.Object
 *  java.lang.reflect.AccessibleObject
 */
package d.c.c.a0.a0;

import d.c.c.a0.a0.a;
import d.c.c.a0.a0.c;
import d.c.c.a0.p;
import java.lang.reflect.AccessibleObject;

public abstract class b {
    public static final b a;

    public static {
        Object object = p.a < 9 ? new a() : new c();
        a = object;
    }

    public abstract void a(AccessibleObject var1);
}

