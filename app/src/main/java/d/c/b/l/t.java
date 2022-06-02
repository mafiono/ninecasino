/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package d.c.b.l;

import d.c.b.s.a;

public class t<T>
implements a<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile a<T> b;

    public t(a<T> a2) {
        this.b = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T get() {
        Object object = this.a;
        Object object2 = c;
        if (object != object2) {
            return (T)object;
        }
        t t6 = this;
        synchronized (t6) {
            Object object3 = this.a;
            if (object3 == object2) {
                this.a = object3 = this.b.get();
                this.b = null;
            }
            return (T)object3;
        }
    }
}

