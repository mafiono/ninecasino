/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.c.a0.z;

import d.c.c.b0.a;
import d.c.c.i;
import d.c.c.x;
import d.c.c.y;

public class p
implements y {
    public final /* synthetic */ Class e;
    public final /* synthetic */ x f;

    public p(Class class_, x x3) {
        this.e = class_;
        this.f = x3;
    }

    @Override
    public <T> x<T> b(i i2, a<T> a2) {
        if (a2.a == this.e) {
            return this.f;
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Factory[type=");
        stringBuilder.append(this.e.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

