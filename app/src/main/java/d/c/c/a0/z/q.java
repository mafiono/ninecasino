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

public class q
implements y {
    public final /* synthetic */ Class e;
    public final /* synthetic */ Class f;
    public final /* synthetic */ x g;

    public q(Class class_, Class class_2, x x3) {
        this.e = class_;
        this.f = class_2;
        this.g = x3;
    }

    @Override
    public <T> x<T> b(i i2, a<T> a2) {
        Class class_ = a2.a;
        if (class_ != this.e && class_ != this.f) {
            return null;
        }
        return this.g;
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Factory[type=");
        stringBuilder.append(this.f.getName());
        stringBuilder.append("+");
        stringBuilder.append(this.e.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

