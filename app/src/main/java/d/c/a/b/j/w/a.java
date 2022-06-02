/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  d.a.b.a.a
 *  d.c.a.b.d
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.EnumMap
 *  java.util.Set
 */
package d.c.a.b.j.w;

import android.util.SparseArray;
import d.c.a.b.d;
import java.util.EnumMap;
import java.util.Set;

public final class a {
    public static SparseArray<d> a;
    public static EnumMap<d, Integer> b;

    public static {
        EnumMap enumMap;
        a = new SparseArray();
        b = enumMap = new EnumMap(d.class);
        enumMap.put((Enum)d.e, 0);
        b.put((Enum)d.f, (Object)1);
        b.put((Enum)d.g, (Object)2);
        for (d d2 : b.keySet()) {
            a.append(b.get((Object)d2).intValue(), d2);
        }
    }

    public static int a(d d2) {
        Integer n2 = b.get((Object)d2);
        if (n2 != null) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PriorityMapping is missing known Priority value ");
        stringBuilder.append((Object)d2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static d b(int n2) {
        d d2 = a.get(n2);
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException(d.a.b.a.a.k((String)"Unknown Priority for value ", (int)n2));
    }
}

