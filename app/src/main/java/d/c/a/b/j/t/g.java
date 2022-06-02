/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  e.a.a
 *  java.lang.Object
 */
package d.c.a.b.j.t;

import android.content.Context;
import android.os.Build;
import d.c.a.b.j.t.h.a;
import d.c.a.b.j.t.h.e;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;

public final class g
implements Object<s> {
    public final e.a.a<Context> a;
    public final e.a.a<c> b;
    public final e.a.a<d.c.a.b.j.t.h.g> c;
    public final e.a.a<d.c.a.b.j.v.a> d;

    public g(e.a.a<Context> a2, e.a.a<c> a3, e.a.a<d.c.a.b.j.t.h.g> a4, e.a.a<d.c.a.b.j.v.a> a5) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
        this.d = a5;
    }

    public Object get() {
        Context context = (Context)this.a.get();
        c c2 = (c)this.b.get();
        d.c.a.b.j.t.h.g g2 = (d.c.a.b.j.t.h.g)this.c.get();
        d.c.a.b.j.v.a a2 = (d.c.a.b.j.v.a)this.d.get();
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, c2, g2);
        }
        return new a(context, c2, a2, g2);
    }
}

