/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package d.c.a.b.j.t.i;

import d.c.a.b.j.t.i.t;
import d.c.a.b.j.u.a;

public final class r
implements t.b {
    public static final r a = new r();

    public Object a(Object object) {
        Throwable throwable = (Throwable)object;
        throw new a("Timed out while trying to open db.", throwable);
    }
}

