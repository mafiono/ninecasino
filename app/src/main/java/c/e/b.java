/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  c.e.c
 *  c.e.g
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 */
package c.e;

import c.e.c;
import c.e.g;
import java.util.Map;

public class b
extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c c2) {
        this.d = c2;
    }

    public void a() {
        this.d.clear();
    }

    public Object b(int n2, int n3) {
        return this.d.f[n2];
    }

    public Map<E, E> c() {
        throw new UnsupportedOperationException("not a map");
    }

    public int d() {
        return this.d.g;
    }

    public int e(Object object) {
        return this.d.indexOf(object);
    }

    public int f(Object object) {
        return this.d.indexOf(object);
    }

    public void g(E e2, E e3) {
        this.d.add(e2);
    }

    public void h(int n2) {
        this.d.k(n2);
    }

    public E i(int n2, E e2) {
        throw new UnsupportedOperationException("not a map");
    }
}

