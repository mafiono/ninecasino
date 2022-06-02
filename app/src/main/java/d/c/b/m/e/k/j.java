/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.a.d.j.a;
import d.c.b.m.e.k.h;
import java.util.concurrent.Callable;

public class j
implements a<Void, T> {
    public final /* synthetic */ Callable a;

    public j(h h2, Callable callable) {
        this.a = callable;
    }

    public T a(d.c.a.d.j.h<Void> h2) {
        return (T)this.a.call();
    }
}

