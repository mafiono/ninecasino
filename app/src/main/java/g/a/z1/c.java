/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  g.a.z1.b
 *  g.a.z1.l
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package g.a.z1;

import g.a.z1.b;
import g.a.z1.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class c<T>
extends l {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private final /* synthetic */ Object _consensus;

    public static {
        a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    }

    public c() {
        this._consensus = b.a;
    }

    public final Object a(Object object) {
        Object object2 = this._consensus;
        Object object3 = b.a;
        if (object2 == object3) {
            object2 = this.c(object);
            Object object4 = this._consensus;
            if (object4 != object3) {
                object2 = object4;
            } else if (!a.compareAndSet(this, object3, object2)) {
                object2 = this._consensus;
            }
        }
        this.b(object, object2);
        return object2;
    }

    public abstract void b(T var1, Object var2);

    public abstract Object c(T var1);
}

