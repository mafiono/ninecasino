/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d
 *  f.i
 *  f.o.a.a
 *  f.o.b.i
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package f;

import f.d;
import f.i;
import f.o.a.a;
import java.io.Serializable;

public final class h<T>
implements d<T>,
Serializable {
    public a<? extends T> e;
    public volatile Object f;
    public final Object g;

    public h(a a2, Object object, int n2) {
        n2 & 2;
        f.o.b.i.e((Object)a2, (String)"initializer");
        this.e = a2;
        this.f = i.a;
        this.g = this;
    }

    private final Object writeReplace() {
        return new a<T>(this.getValue());
    }

    public T getValue() {
        Object object;
        Object object2 = this.f;
        i i2 = i.a;
        if (object2 != i2) {
            return (T)object2;
        }
        Object object3 = object = this.g;
        synchronized (object3) {
            Object object4;
            block5 : {
                object4 = this.f;
                if (object4 != i2) break block5;
                a<? extends T> a2 = this.e;
                f.o.b.i.c(a2);
                this.f = object4 = a2.a();
                this.e = null;
            }
            return (T)object4;
        }
    }

    public String toString() {
        boolean bl = this.f != i.a;
        if (bl) {
            return String.valueOf(this.getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

