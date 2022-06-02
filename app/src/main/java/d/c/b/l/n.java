/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 */
package d.c.b.l;

import d.c.b.l.l;

public class n {
    public final Class<?> a;
    public final boolean b;

    public n(Class class_, boolean bl, l l2) {
        this.a = class_;
        this.b = bl;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof n;
        boolean bl2 = false;
        if (bl) {
            n n2 = (n)object;
            boolean bl3 = n2.a.equals(this.a);
            bl2 = false;
            if (bl3) {
                boolean bl4 = n2.b;
                boolean bl5 = this.b;
                bl2 = bl4 == bl5;
            }
        }
        return bl2;
    }

    public int hashCode() {
        return 1000003 * (1000003 ^ this.a.hashCode()) ^ Boolean.valueOf(this.b).hashCode();
    }
}

