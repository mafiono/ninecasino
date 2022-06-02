/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.b.t.f
 *  java.lang.Object
 *  java.lang.Runnable
 */
package d.c.b.t;

import d.c.b.t.f;

public final class d
implements Runnable {
    public final f e;
    public final boolean f;

    public d(f f2, boolean bl) {
        this.e = f2;
        this.f = bl;
    }

    public void run() {
        f f2 = this.e;
        boolean bl = this.f;
        f2.b(bl);
    }
}

