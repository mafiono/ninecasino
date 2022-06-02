/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.c.a.b.b
 *  c.c.a.b.b$c
 *  java.lang.Object
 *  java.util.HashMap
 */
package c.c.a.b;

import c.c.a.b.b;
import java.util.HashMap;

public class a<K, V>
extends b<K, V> {
    public HashMap<K, b.c<K, V>> i = new HashMap();

    public boolean contains(K k2) {
        return this.i.containsKey(k2);
    }

    public b.c<K, V> g(K k2) {
        return this.i.get(k2);
    }

    public V j(K k2, V v2) {
        b.c c2 = (b.c)this.i.get(k2);
        if (c2 != null) {
            return (V)c2.f;
        }
        this.i.put(k2, (Object)this.i(k2, v2));
        return null;
    }

    public V k(K k2) {
        Object object = super.k(k2);
        this.i.remove(k2);
        return (V)object;
    }
}

