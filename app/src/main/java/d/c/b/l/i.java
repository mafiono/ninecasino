/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package d.c.b.l;

import d.c.b.l.t;
import d.c.b.s.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class i
implements a {
    public final Set a;

    public i(Set set) {
        this.a = set;
    }

    public Object get() {
        Set set = this.a;
        HashSet hashSet = new HashSet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            hashSet.add(((t)iterator.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}

