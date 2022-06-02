/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.util.Objects
 */
package d.c.c.a0.z;

import d.c.c.a0.z.m;
import d.c.c.a0.z.o;
import d.c.c.c0.c;
import d.c.c.c0.d;
import d.c.c.i;
import d.c.c.l;
import d.c.c.n;
import d.c.c.p;
import d.c.c.t;
import d.c.c.u;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;

public final class m<T>
extends x<T> {
    public final u<T> a;
    public final d.c.c.m<T> b;
    public final i c;
    public final d.c.c.b0.a<T> d;
    public final m<T> e = new b(this, null);
    public x<T> f;

    public m(u<T> u4, d.c.c.m<T> m2, i i2, d.c.c.b0.a<T> a2, y y3) {
        this.a = u4;
        this.b = m2;
        this.c = i2;
        this.d = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T a(d.c.c.c0.a a2) {
        n n2;
        block10 : {
            boolean bl;
            if (this.b == null) {
                x<T> x3 = this.f;
                if (x3 != null) {
                    return x3.a(a2);
                }
                x3 = this.c.d(null, this.d);
                this.f = x3;
                return x3.a(a2);
            }
            try {
                try {
                    a2.n0();
                }
                catch (EOFException eOFException) {
                    bl = true;
                }
                try {
                    n2 = o.X.a(a2);
                    break block10;
                }
                catch (EOFException eOFException) {
                    bl = false;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw new v(numberFormatException);
            }
            catch (IOException iOException) {
                throw new d.c.c.o(iOException);
            }
            catch (d d3) {
                throw new v(d3);
            }
            if (!bl) void var2_6;
            throw new v((Throwable)var2_6);
            n2 = p.a;
        }
        Objects.requireNonNull((Object)n2);
        if (!(n2 instanceof p)) return this.b.a(n2, this.d.b, (l)((Object)this.e));
        return null;
    }

    @Override
    public void b(c c3, T t6) {
        u<T> u4 = this.a;
        if (u4 == null) {
            x<T> x3 = this.f;
            if (x3 == null) {
                x3 = this.c.d(null, this.d);
                this.f = x3;
            }
            x3.b(c3, t6);
            return;
        }
        if (t6 == null) {
            c3.F();
            return;
        }
        n n2 = u4.a(t6, this.d.b, (t)((Object)this.e));
        o.X.b(c3, n2);
    }

    public final class b
    implements t,
    l {
        public b(m m2, a a2) {
        }
    }

}

