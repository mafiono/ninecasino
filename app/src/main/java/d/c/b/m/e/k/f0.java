/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.concurrent.Callable
 */
package d.c.b.m.e.k;

import d.c.a.d.j.h;
import d.c.b.m.e.k.g0;
import d.c.b.m.e.s.e;
import java.util.concurrent.Callable;

public class f0
implements Callable<h<Void>> {
    public final /* synthetic */ e a;
    public final /* synthetic */ g0 b;

    public f0(g0 g02, e e2) {
        this.b = g02;
        this.a = e2;
    }

    public Object call() {
        return g0.a(this.b, this.a);
    }
}

