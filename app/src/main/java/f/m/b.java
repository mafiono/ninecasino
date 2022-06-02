/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.m.f
 *  f.m.f$b
 *  f.o.a.l
 *  f.o.b.i
 *  java.lang.Object
 *  java.lang.String
 */
package f.m;

import f.m.f;
import f.o.a.l;
import f.o.b.i;

public abstract class b<B extends f.a, E extends B>
implements f.b<E> {
    public final f.b<?> e;
    public final l<f.a, E> f;

    public b(f.b<B> object, l<? super f.a, ? extends E> l4) {
        i.e(object, (String)"baseKey");
        i.e(l4, (String)"safeCast");
        this.f = l4;
        if (object instanceof b) {
            object = ((b)object).e;
        }
        this.e = object;
    }
}

