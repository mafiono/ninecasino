/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.h.i.c
 *  java.lang.Object
 */
package c.h.i;

import c.h.i.c;

public class d<T>
extends c<T> {
    public final Object c = new Object();

    public d(int n2) {
        super(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T a() {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            Object object3 = super.a();
            return (T)object3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(T t2) {
        Object object;
        Object object2 = object = this.c;
        synchronized (object2) {
            return super.b(t2);
        }
    }
}

