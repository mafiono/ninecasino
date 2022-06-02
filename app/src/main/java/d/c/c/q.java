/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.c;

import d.c.c.a0.s;
import d.c.c.n;

public final class q
extends n {
    public final s<String, n> a = new s();

    public boolean equals(Object object) {
        return object == this || object instanceof q && ((q)object).a.equals(this.a);
        {
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

