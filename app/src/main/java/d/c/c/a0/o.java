/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package d.c.c.a0;

import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.x;
import d.c.c.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class o
implements y,
Cloneable {
    public static final o g = new o();
    public List<d.c.c.a> e = Collections.emptyList();
    public List<d.c.c.a> f = Collections.emptyList();

    @Override
    public <T> x<T> b(final i i2, final d.c.c.b0.a<T> a2) {
        Class class_ = a2.a;
        boolean bl = this.d(class_);
        final boolean bl2 = bl || this.c(class_, true);
        final boolean bl3 = bl || this.c(class_, false);
        if (!bl2 && !bl3) {
            return null;
        }
        x x3 = new x<T>(){
            public x<T> a;

            @Override
            public T a(d.c.c.c0.a a22) {
                if (bl3) {
                    a22.s0();
                    return null;
                }
                x<T> x3 = this.a;
                if (x3 == null) {
                    x3 = i2.d(o.this, a2);
                    this.a = x3;
                }
                return x3.a(a22);
            }

            @Override
            public void b(c c3, T t6) {
                if (bl2) {
                    c3.F();
                    return;
                }
                x<T> x3 = this.a;
                if (x3 == null) {
                    x3 = i2.d(o.this, a2);
                    this.a = x3;
                }
                x3.b(c3, t6);
            }
        };
        return x3;
    }

    public final boolean c(Class<?> class_, boolean bl) {
        List<d.c.c.a> list = bl ? this.e : this.f;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!((d.c.c.a)iterator.next()).a(class_)) continue;
            return true;
        }
        return false;
    }

    public Object clone() {
        try {
            o o2 = (o)super.clone();
            return o2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError(cloneNotSupportedException);
        }
    }

    public final boolean d(Class<?> class_) {
        return !Enum.class.isAssignableFrom(class_) && (class_.isAnonymousClass() || class_.isLocalClass());
    }

}

