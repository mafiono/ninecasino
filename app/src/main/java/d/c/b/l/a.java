/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Set
 */
package d.c.b.l;

import d.c.b.l.e;
import java.util.Set;

public abstract class a
implements e {
    @Override
    public <T> T a(Class<T> class_) {
        d.c.b.s.a<T> a2 = this.b(class_);
        if (a2 == null) {
            return null;
        }
        return a2.get();
    }

    @Override
    public <T> Set<T> c(Class<T> class_) {
        return this.d(class_).get();
    }
}

