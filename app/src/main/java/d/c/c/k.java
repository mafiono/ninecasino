/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package d.c.c;

import d.c.c.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k
extends n
implements Iterable<n> {
    public final List<n> e = new ArrayList();

    public boolean equals(Object object) {
        return object == this || object instanceof k && ((k)object).e.equals(this.e);
        {
        }
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public Iterator<n> iterator() {
        return this.e.iterator();
    }
}

