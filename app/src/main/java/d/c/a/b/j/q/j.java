/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.a.b.j.q.i
 *  e.a.a
 *  java.lang.Object
 */
package d.c.a.b.j.q;

import android.content.Context;
import d.c.a.b.j.q.i;
import d.c.a.b.j.v.a;

public final class j
implements Object<i> {
    public final e.a.a<Context> a;
    public final e.a.a<a> b;
    public final e.a.a<a> c;

    public j(e.a.a<Context> a2, e.a.a<a> a3, e.a.a<a> a4) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
    }

    public Object get() {
        return new i((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
    }
}

