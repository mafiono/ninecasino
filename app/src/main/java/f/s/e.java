/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.o.a.l
 *  f.o.b.i
 *  f.s.b
 *  f.s.e$a
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package f.s;

import f.o.a.l;
import f.o.b.i;
import f.s.b;
import f.s.e;
import java.util.Iterator;

public final class e<T, R>
implements b<R> {
    public final b<T> a;
    public final l<T, R> b;

    public e(b<? extends T> b3, l<? super T, ? extends R> l4) {
        i.e(b3, (String)"sequence");
        i.e(l4, (String)"transformer");
        this.a = b3;
        this.b = l4;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}

