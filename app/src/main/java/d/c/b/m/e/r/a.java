/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.h
 *  d.c.a.d.j.i
 *  java.lang.Exception
 *  java.lang.Object
 */
package d.c.b.m.e.r;

import d.c.a.b.h;
import d.c.a.d.j.i;
import d.c.b.m.e.k.k0;

public final class a
implements h {
    public final i a;
    public final k0 b;

    public a(i i2, k0 k02) {
        this.a = i2;
        this.b = k02;
    }

    public void a(Exception exception) {
        i i2 = this.a;
        k0 k02 = this.b;
        if (exception != null) {
            i2.a(exception);
            return;
        }
        i2.b((Object)k02);
    }
}

