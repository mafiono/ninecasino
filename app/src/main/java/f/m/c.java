/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  f.k
 *  f.m.c$a
 *  f.m.c$b
 *  f.m.c$c
 *  f.m.f
 *  f.m.f$b
 *  f.m.g
 *  f.o.a.p
 *  f.o.b.i
 *  f.o.b.l
 *  java.io.Serializable
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 */
package f.m;

import f.k;
import f.m.c;
import f.m.f;
import f.m.g;
import f.m.h;
import f.o.a.p;
import f.o.b.i;
import f.o.b.l;
import java.io.Serializable;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public final class c
implements f,
Serializable {
    public final f e;
    public final f.a f;

    public c(f f2, f.a a2) {
        i.e((Object)f2, (String)"left");
        i.e((Object)a2, (String)"element");
        this.e = f2;
        this.f = a2;
    }

    private final Object writeReplace() {
        int n2 = this.b();
        f[] arrf = new f[n2];
        l l4 = new l();
        l4.e = 0;
        this.fold(k.a, (p<? super R, ? super f.a, ? extends R>)new c(arrf, l4));
        int n3 = l4.e;
        boolean bl = n3 == n2;
        if (bl) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int b() {
        int n2 = 2;
        c c3 = this;
        do {
            f f2;
            if (!((f2 = c3.e) instanceof c)) {
                f2 = null;
            }
            if ((c3 = (c)f2) == null) break;
            ++n2;
        } while (true);
        return n2;
    }

    public boolean equals(Object object) {
        boolean bl;
        block7 : {
            block6 : {
                boolean bl2;
                block5 : {
                    f f2;
                    if (this == object) break block6;
                    boolean bl3 = object instanceof c;
                    bl = false;
                    if (!bl3) break block7;
                    c c3 = (c)object;
                    int n2 = c3.b();
                    int n3 = this.b();
                    bl = false;
                    if (n2 != n3) break block7;
                    Objects.requireNonNull((Object)c3);
                    c c4 = this;
                    do {
                        f.a a2;
                        if (!i.a(c3.get((a2 = c4.f).getKey()), (Object)a2)) {
                            bl2 = false;
                            break block5;
                        }
                        f2 = c4.e;
                        if (!(f2 instanceof c)) break;
                        c4 = (c)f2;
                    } while (true);
                    Objects.requireNonNull(f2, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.a a3 = (f.a)f2;
                    bl2 = i.a(c3.get(a3.getKey()), (Object)a3);
                }
                bl = false;
                if (!bl2) break block7;
            }
            bl = true;
        }
        return bl;
    }

    public <R> R fold(R r3, p<? super R, ? super f.a, ? extends R> p2) {
        i.e(p2, (String)"operation");
        return (R)p2.e(this.e.fold(r3, p2), (Object)this.f);
    }

    public <E extends f.a> E get(f.b<E> b3) {
        f f2;
        i.e(b3, (String)"key");
        c c3 = this;
        do {
            E e2;
            if ((e2 = c3.f.get(b3)) != null) {
                return e2;
            }
            f2 = c3.e;
            if (!(f2 instanceof c)) break;
            c3 = (c)f2;
        } while (true);
        return (E)f2.get(b3);
    }

    public int hashCode() {
        return this.e.hashCode() + this.f.hashCode();
    }

    public f minusKey(f.b<?> b3) {
        i.e(b3, (String)"key");
        if (this.f.get(b3) != null) {
            return this.e;
        }
        f f2 = this.e.minusKey(b3);
        if (f2 == this.e) {
            return this;
        }
        if (f2 == h.e) {
            return this.f;
        }
        return new c(f2, this.f);
    }

    public f plus(f f2) {
        i.e((Object)f2, (String)"context");
        i.e((Object)f2, (String)"context");
        if (f2 == h.e) {
            return this;
        }
        return (f)f2.fold((Object)this, (p)g.e);
    }

    public String toString() {
        return d.a.b.a.a.o((StringBuilder)d.a.b.a.a.d((String)"["), (String)this.fold((R)"", (p<? super R, ? super f.a, ? extends R>)b.e), (String)"]");
    }
}

