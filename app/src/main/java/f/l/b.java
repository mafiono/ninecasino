/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.e.a
 *  f.f
 *  f.l.a
 *  f.l.d
 *  f.l.e
 *  f.o.b.i
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.NoSuchElementException
 */
package f.l;

import f.f;
import f.l.a;
import f.l.d;
import f.l.e;
import f.o.b.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class b
extends a {
    public static final /* varargs */ <K, V> Map<K, V> a(f<? extends K, ? extends V> ... arrf) {
        i.e(arrf, (String)"pairs");
        if (arrf.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(d.c.a.e.a.b0((int)arrf.length));
            i.e(arrf, (String)"$this$toMap");
            i.e((Object)linkedHashMap, (String)"destination");
            b.c(linkedHashMap, arrf);
            return linkedHashMap;
        }
        return e.e;
    }

    public static final <T> List<T> b(List<? extends T> list) {
        i.e(list, (String)"$this$optimizeReadOnlyList");
        int n2 = list.size();
        if (n2 != 0) {
            if (n2 != 1) {
                return list;
            }
            return d.c.a.e.a.Z((Object)list.get(0));
        }
        return d.e;
    }

    public static final <K, V> void c(Map<? super K, ? super V> map, f<? extends K, ? extends V>[] arrf) {
        i.e(map, (String)"$this$putAll");
        i.e(arrf, (String)"pairs");
        for (f<? extends K, ? extends V> f2 : arrf) {
            map.put(f2.e, f2.f);
        }
    }

    public static final char d(char[] arrc) {
        i.e((Object)arrc, (String)"$this$single");
        int n2 = arrc.length;
        if (n2 != 0) {
            if (n2 == 1) {
                return arrc[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T, C extends Collection<? super T>> C e(Iterable<? extends T> iterable, C c3) {
        i.e(iterable, (String)"$this$toCollection");
        i.e(c3, (String)"destination");
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            c3.add(iterator.next());
        }
        return c3;
    }

    public static final <T> List<T> f(Iterable<? extends T> iterable) {
        i.e(iterable, (String)"$this$toList");
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            int n2 = collection.size();
            if (n2 != 0) {
                if (n2 != 1) {
                    i.e((Object)collection, (String)"$this$toMutableList");
                    return new ArrayList(collection);
                }
                Object object = iterable instanceof List ? ((List)iterable).get(0) : iterable.iterator().next();
                return d.c.a.e.a.Z((Object)object);
            }
            return d.e;
        }
        return b.b(b.h(iterable));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M g(Iterable<? extends f<? extends K, ? extends V>> iterable, M m2) {
        i.e(iterable, (String)"$this$toMap");
        i.e(m2, (String)"destination");
        i.e(m2, (String)"$this$putAll");
        i.e(iterable, (String)"pairs");
        for (f f2 : iterable) {
            m2.put(f2.e, f2.f);
        }
        return m2;
    }

    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        i.e(iterable, (String)"$this$toMutableList");
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            i.e((Object)collection, (String)"$this$toMutableList");
            return new ArrayList(collection);
        }
        ArrayList arrayList = new ArrayList();
        b.e(iterable, arrayList);
        return arrayList;
    }
}

