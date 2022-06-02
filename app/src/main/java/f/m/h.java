/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.m.f
 *  f.m.f$b
 *  f.o.a.p
 *  f.o.b.i
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package f.m;

import f.m.f;
import f.o.a.p;
import f.o.b.i;
import java.io.Serializable;

public final class h
implements f,
Serializable {
    public static final h e = new h();
    private static final long serialVersionUID;

    private final Object readResolve() {
        return e;
    }

    public <R> R fold(R r3, p<? super R, ? super f.a, ? extends R> p2) {
        i.e(p2, (String)"operation");
        return r3;
    }

    public <E extends f.a> E get(f.b<E> b3) {
        i.e(b3, (String)"key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public f minusKey(f.b<?> b3) {
        i.e(b3, (String)"key");
        return this;
    }

    public f plus(f f2) {
        i.e((Object)f2, (String)"context");
        return f2;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}

