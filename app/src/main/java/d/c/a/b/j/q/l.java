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
import d.c.a.b.j.q.k;
import e.a.a;

public final class l
implements Object<k> {
    public final a<Context> a;
    public final a<i> b;

    public l(a<Context> a2, a<i> a3) {
        this.a = a2;
        this.b = a3;
    }

    public Object get() {
        return new k((Context)this.a.get(), (i)this.b.get());
    }
}

