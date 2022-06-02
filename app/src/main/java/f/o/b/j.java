/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.o.b.f
 *  f.o.b.i
 *  f.o.b.n
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package f.o.b;

import f.o.b.f;
import f.o.b.i;
import f.o.b.n;
import java.io.Serializable;

public abstract class j<R>
implements f<R>,
Serializable {
    private final int arity;

    public j(int n2) {
        this.arity = n2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String string = n.b((j)this);
        i.d((Object)string, (String)"Reflection.renderLambdaToString(this)");
        return string;
    }
}

