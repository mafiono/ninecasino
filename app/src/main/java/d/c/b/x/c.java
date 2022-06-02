/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Set
 */
package d.c.b.x;

import d.c.b.x.d;
import d.c.b.x.e;
import d.c.b.x.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class c
implements h {
    public final String a;
    public final d b;

    public c(Set<e> set, d d3) {
        this.a = c.b(set);
        this.b = d3;
    }

    public static String b(Set<e> set) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            e e2 = (e)iterator.next();
            stringBuilder.append(e2.a());
            stringBuilder.append('/');
            stringBuilder.append(e2.b());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public String a() {
        Set<e> set;
        Set<e> set2;
        d d3 = this.b;
        Set<e> set3 = set = d3.a;
        // MONITORENTER : set3
        Set set4 = Collections.unmodifiableSet(d3.a);
        // MONITOREXIT : set3
        if (set4.isEmpty()) {
            return this.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(' ');
        d d4 = this.b;
        Set<e> set5 = set2 = d4.a;
        // MONITORENTER : set5
        Set set6 = Collections.unmodifiableSet(d4.a);
        // MONITOREXIT : set5
        stringBuilder.append(c.b((Set<e>)set6));
        return stringBuilder.toString();
    }
}

