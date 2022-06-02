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

import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;

public class s
implements y {
    public final /* synthetic */ Class e;
    public final /* synthetic */ x f;

    public s(Class class_, x x3) {
        this.e = class_;
        this.f = x3;
    }

    public <T2> x<T2> b(i i2, d.c.c.b0.a<T2> a2) {
        final Class class_ = a2.a;
        if (!this.e.isAssignableFrom(class_)) {
            return null;
        }
        return new x<T1>(){

            @Override
            public T1 a(d.c.c.c0.a a2) {
                Object t6 = s.this.f.a(a2);
                if (t6 != null) {
                    if (class_.isInstance(t6)) {
                        return (T1)t6;
                    }
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a ");
                    stringBuilder.append(class_.getName());
                    stringBuilder.append(" but was ");
                    stringBuilder.append(t6.getClass().getName());
                    throw new v(stringBuilder.toString());
                }
                return (T1)t6;
            }

            @Override
            public void b(c c3, T1 T1) {
                s.this.f.b(c3, T1);
            }
        };
    }

    public String toString() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Factory[typeHierarchy=");
        stringBuilder.append(this.e.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

}

