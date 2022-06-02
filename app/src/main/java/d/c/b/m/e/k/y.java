/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.Arrays
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e.k;

import android.content.Context;
import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.b.m.e.b;
import d.c.b.m.e.k.d0;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.i;
import d.c.b.m.e.k.n0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.k.z;
import d.c.b.m.e.q.b;
import d.c.b.m.e.q.c.c;
import d.c.b.m.e.q.c.d;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class y
implements g<d.c.b.m.e.s.i.b, Void> {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ z b;

    public y(z z3, Executor executor) {
        this.b = z3;
        this.a = executor;
    }

    public d.c.a.d.j.h a(Object object) {
        d.c.b.m.e.s.i.b b3 = (d.c.b.m.e.s.i.b)object;
        if (b3 == null) {
            b.a.f("Received null app settings, cannot send reports at crash time.");
            return a.l(null);
        }
        t t6 = this.b.e;
        Context context = t6.a;
        d.c.b.m.e.q.b b4 = ((d0)t6.j).a(b3);
        for (File file : t6.q()) {
            t.c(b3.e, file);
            d d3 = new d(file, t.C);
            h h2 = t6.e;
            h2.b(new i(h2, new t.m(context, d3, b4, true)));
        }
        Object[] arrobject = new d.c.a.d.j.h[]{t.b(this.b.e), this.b.e.s.a(this.a, n0.g(b3))};
        return a.B(Arrays.asList(arrobject));
    }
}

