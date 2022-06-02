/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.List
 */
package d.c.b.l;

import d.a.b.a.a;
import d.c.b.l.d;
import d.c.b.l.q;
import java.util.Arrays;
import java.util.List;

public class p
extends q {
    public final List<d<?>> e;

    public p(List<d<?>> list) {
        StringBuilder stringBuilder = a.d((String)"Dependency cycle detected: ");
        stringBuilder.append(Arrays.toString(list.toArray()));
        super(stringBuilder.toString());
        this.e = list;
    }
}

