/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.o.b.k
 *  f.o.b.n
 *  f.o.b.o
 *  f.r.a
 *  f.r.c
 *  java.io.Serializable
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package f.o.b;

import f.o.b.k;
import f.o.b.n;
import f.o.b.o;
import f.r.c;
import java.io.Serializable;
import java.util.Objects;

public abstract class a
implements f.r.a,
Serializable {
    public transient f.r.a e;
    public final Object f;
    public final Class g;
    public final String h;
    public final String i;
    public final boolean j;

    public a(Object object, Class class_, String string, String string2, boolean bl) {
        this.f = object;
        this.g = class_;
        this.h = string;
        this.i = string2;
        this.j = bl;
    }

    public c b() {
        Class class_ = this.g;
        if (class_ == null) {
            return null;
        }
        if (this.j) {
            Objects.requireNonNull(n.a);
            return new k(class_, "");
        }
        return n.a((Class)class_);
    }
}

