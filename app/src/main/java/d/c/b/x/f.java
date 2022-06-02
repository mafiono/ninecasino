/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.x;

import android.content.Context;
import d.c.b.l.e;
import d.c.b.x.a;
import d.c.b.x.g;

public final class f
implements d.c.b.l.f {
    public final String a;
    public final g b;

    public f(String string, g g2) {
        this.a = string;
        this.b = g2;
    }

    public Object a(e e2) {
        return new a(this.a, this.b.a(e2.a(Context.class)));
    }
}

