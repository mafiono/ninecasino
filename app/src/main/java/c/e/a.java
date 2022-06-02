/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.e.g
 *  c.e.g$b
 *  c.e.g$c
 *  c.e.g$e
 *  c.e.h
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package c.e;

import c.e.g;
import c.e.h;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V>
extends h<K, V>
implements Map<K, V> {
    public g<K, V> l;

    public a() {
    }

    public a(int n2) {
        super(n2);
    }

    public a(h h2) {
        if (h2 != null) {
            int n2 = h2.g;
            this.b(n2 + this.g);
            int n3 = this.g;
            if (n3 == 0) {
                if (n2 > 0) {
                    System.arraycopy((Object)h2.e, 0, (Object)this.e, 0, n2);
                    System.arraycopy((Object)h2.f, 0, (Object)this.f, 0, n2 << 1);
                    this.g = n2;
                    return;
                }
            } else {
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.put(h2.h(i2), h2.k(i2));
                }
            }
        }
    }

    public Set<Entry<K, V>> entrySet() {
        g<K, V> g2 = this.l();
        if (g2.a == null) {
            g2.a = new g.b(g2);
        }
        return g2.a;
    }

    public Set<K> keySet() {
        g<K, V> g2 = this.l();
        if (g2.b == null) {
            g2.b = new g.c(g2);
        }
        return g2.b;
    }

    public final g<K, V> l() {
        if (this.l == null) {
            this.l = new g<K, V>(){

                public void a() {
                    a.this.clear();
                }

                public Object b(int n2, int n3) {
                    return a.this.f[n3 + (n2 << 1)];
                }

                public Map<K, V> c() {
                    return a.this;
                }

                public int d() {
                    return a.this.g;
                }

                public int e(Object object) {
                    return a.this.e(object);
                }

                public int f(Object object) {
                    return a.this.g(object);
                }

                public void g(K k2, V v2) {
                    a.this.put(k2, v2);
                }

                public void h(int n2) {
                    a.this.i(n2);
                }

                public V i(int n2, V v2) {
                    a a2 = a.this;
                    int n3 = 1 + (n2 << 1);
                    Object[] arrobject = a2.f;
                    Object object = arrobject[n3];
                    arrobject[n3] = v2;
                    return (V)object;
                }
            };
        }
        return this.l;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.b(this.g + map.size());
        for (Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        g<K, V> g2 = this.l();
        if (g2.c == null) {
            g2.c = new g.e(g2);
        }
        return g2.c;
    }

}

