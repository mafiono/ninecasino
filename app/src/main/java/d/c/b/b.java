/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.b.l.k
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b;

import android.content.Context;
import d.c.b.c;
import d.c.b.l.k;
import d.c.b.s.a;

public final class b
implements a {
    public final c a;
    public final Context b;

    public b(c c3, Context context) {
        this.a = c3;
        this.b = context;
    }

    public Object get() {
        c c3 = this.a;
        Context context = this.b;
        return new d.c.b.u.a(context, c3.c(), c3.d.a(d.c.b.p.c.class));
    }
}

