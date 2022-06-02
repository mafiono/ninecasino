/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.d.p.b
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package d.c.b.y.q;

import d.c.a.d.d.p.b;
import d.c.b.y.q.f;

public final class l
implements Runnable {
    public final b e;
    public final String f;
    public final f g;

    public l(b b2, String string, f f2) {
        this.e = b2;
        this.f = string;
        this.g = f2;
    }

    public void run() {
        b b2 = this.e;
        String string = this.f;
        f f2 = this.g;
        b2.a((Object)string, (Object)f2);
    }
}

