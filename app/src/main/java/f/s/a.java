/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.o.b.i
 *  f.s.b
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.concurrent.atomic.AtomicReference
 */
package f.s;

import f.o.b.i;
import f.s.b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a<T>
implements b<T> {
    public final AtomicReference<b<T>> a;

    public a(b<? extends T> b3) {
        i.e(b3, (String)"sequence");
        this.a = new AtomicReference(b3);
    }

    public Iterator<T> iterator() {
        b b3 = (b)this.a.getAndSet(null);
        if (b3 != null) {
            return b3.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

